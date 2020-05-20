package gui.crop;

import java.awt.EventQueue;

import javax.swing.JFrame;

import gameEnvironment.GameState;
import gui.GameEnvironmentPanel;
import gui.farmer.FarmerWarningPanel;
import item.CropItem;
import item.GenericItem;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.SwingConstants;

import crop.Crop;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.Color;

public class TendToCropPanel {
	
	/**
	 * The game's GameState
	 */
	public GameState state;
	
	/**
	 * Stores a set of the crops that are planted.
	 */
	private Set<String> plantedCropsSet;
	
	/**
	 * Stores a set of the crop items available to player.
	 */
	private Set<String> cropItemsSet;
	
	/**
	 * Stores an array of the crops that are planted. 
	 * For use in combo box.
	 */
	private String[] plantedCropsList;
	
	/**
	 * Stores an array of the crop items available to player. 
	 * For use in combo box.
	 */
	private String[] cropItemsList;
	
	/**
	 * Stores the crop selected by player.
	 */
	private String selectedCrop;

	private JFrame frmFarmiza;
	private JLabel lblFieldImage;
	private static JComboBox<String> cmbItemSelection;
	private static JComboBox<String> cmbCropSelection;

	/**
	 * Launch the application.
	 */
	public void ActivatePanel() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmFarmiza.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @param tempState  the current GameState
	 */
	public TendToCropPanel(GameState tempState) {
		state = tempState;
		
		initialize();
		ActivatePanel();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFarmiza = new JFrame();
		frmFarmiza.setTitle("Farmiza");
		frmFarmiza.setBounds(100, 100, 486, 273);
		frmFarmiza.setIconImage(Toolkit.getDefaultToolkit().getImage(GameEnvironmentPanel.class.getResource("../images/logo.jpg")));
		frmFarmiza.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFarmiza.getContentPane().setLayout(null);
		frmFarmiza.setResizable(false);
		
		JLabel lblCrops = new JLabel("Crops");
		lblCrops.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 24));
		lblCrops.setBounds(83, 57, 89, 35);
		frmFarmiza.getContentPane().add(lblCrops);
		
		JLabel lblCropItems = new JLabel("Crop Items");
		lblCropItems.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 24));
		lblCropItems.setBounds(270, 57, 150, 35);
		frmFarmiza.getContentPane().add(lblCropItems);
		
		
		JLabel lblSelectACrop = new JLabel("TEND TO CROPS");
		lblSelectACrop.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectACrop.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 26));
		lblSelectACrop.setBounds(115, 11, 249, 35);
		frmFarmiza.getContentPane().add(lblSelectACrop);
		
		
		cmbCropSelection = new JComboBox<String>();
		cmbCropSelection.setBackground(new Color(204, 204, 51));
		cmbCropSelection.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		cmbCropSelection.setBounds(32, 103, 192, 41);
		frmFarmiza.getContentPane().add(cmbCropSelection);
		
		cmbItemSelection = new JComboBox<String>();
		cmbItemSelection.setBackground(new Color(204, 204, 51));
		cmbItemSelection.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		cmbItemSelection.setBounds(253, 103, 192, 41);
		frmFarmiza.getContentPane().add(cmbItemSelection);
		
		JButton btnUseItem = new JButton("USE ITEM");
		btnUseItem.setBackground(new Color(102, 102, 51));
		btnUseItem.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btnUseItem.setBounds(83, 178, 141, 45);
		btnUseItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if (state.farmer.getActionCount() != 0) {
					if (state.crops.isEmpty()) {
						new CropWarningPanel();
					} else {
						ArrayList<String> selectedCrops = new ArrayList<String>(plantedCropsSet);
						ArrayList<String> selectedItems = new ArrayList<String>(cropItemsSet);
						
						selectedCrop = selectedCrops.get(cmbCropSelection.getSelectedIndex());
						String selectedItem = selectedItems.get(cmbItemSelection.getSelectedIndex());
						
						useSelectedItem(selectedItem);
						state.farmer.reduceActionCount();
						getCropsItems();
					}
				} else {
					new FarmerWarningPanel(state);
				}				
			}
		});
		frmFarmiza.getContentPane().add(btnUseItem);
		
		JButton btnClose = new JButton("CLOSE");
		btnClose.setBackground(new Color(102, 102, 51));
		btnClose.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		btnClose.setBounds(253, 177, 118, 46);
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				frmFarmiza.dispose();
			}
		});
		frmFarmiza.getContentPane().add(btnClose);
		
		getCropsItems();
		
		lblFieldImage = new JLabel("");
		lblFieldImage.setBounds(-14, 0, 494, 301);
		frmFarmiza.getContentPane().add(lblFieldImage);
		setBackgr();
	}
	
	private void setBackgr() {
		ImageIcon path = new ImageIcon(GameEnvironmentPanel.class.getResource("../images/crops.jpg"));
		Image imageGet = path.getImage();
		Image imageSize = imageGet.getScaledInstance(lblFieldImage.getWidth(), lblFieldImage.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image = new ImageIcon(imageSize);
		lblFieldImage.setIcon(image);
	}
	
	
	/**
	 * Uses plantedCropsSet to fill plantedCropsList.
	 * Uses cropItemsSet to fill cropItemsList.
	 * Uses plantedCropsList and cropItemsList to fill their respective combo boxes.
	 */
	private void getCropsItems() {
		String crops = "";
		String items = "";
		getCropsItemsSets();
		
		for (String crop: plantedCropsSet) {
			crops = crops + crop + ",";
		}
		
		for (String item: cropItemsSet) {
			items = items + item + ",";
		}
		
		plantedCropsList = crops.split(",");
		cropItemsList = items.split(",");
		cmbCropSelection.setModel(new DefaultComboBoxModel<String>(plantedCropsList));
		cmbItemSelection.setModel(new DefaultComboBoxModel<String>(cropItemsList));
	}
	
	/**
	 * Fills the plantedCropsSet with player's planted crops (no repetition of crop types). 
	 * Fills the cropItemsSet with player's available crop items (no repetition of item types). 
	 */
	private void getCropsItemsSets() {
		plantedCropsSet = new HashSet<String>();
		cropItemsSet = new HashSet<String>();
		
		for (Crop crop: state.crops) {
    		if (crop.planted) {
    			plantedCropsSet.add(crop.getName());
    		}
    	}
		
		for (CropItem item: state.cropItems) {
    		cropItemsSet.add(item.getName());
    	}
		cropItemsSet.add("Water");
		cropItemsSet.add("Speech");
		if (state.totalMoney >= 20.0) { cropItemsSet.add("Heating  $20.00"); }
		
	}
	
	/**
	 * Handles choice of item to use for crops.
	 * Calls helper methods depending on the type of item.
	 * @param itemName  the selected item (String)
	 */
	private void useSelectedItem(String selectedItem) {
		
		if (selectedItem == "Fertiliser") {
			useCropItem(selectedItem);
		} else if (selectedItem == "Pesticide") {
			useCropItem(selectedItem);
		} else {
			useGenericItem(selectedItem);
		}
		
	}
	
	/**
	 * Checks whether selected crop item is available.
	 * If item is available, item boosts are applied to crops 
	 * and item is removed from player's cropItems list.
	 * @param itemName  the selected item (String)
	 */
	private void useCropItem(String itemName) {
		
    	for (CropItem item: state.cropItems) {
    		if (item.getName() == itemName) {
    			useItem(item.getGeneralBoost(), item.getGrowthBoost());
    			state.cropItems.remove(item);
    			
    			break;
    		}
    	}
    	
    }
	
	
	/**
	 * Handles use of selected item if it is a generic item (not sold at Shop).
	 * @param itemName  the selected item (String)
	 */
	private void useGenericItem(String itemName) { 
		if (itemName == "Heating  $20.00") { itemName = "Warmth"; }
		
    	for (GenericItem item: state.items) {
    		if (item.getName() == itemName) {
    			
    			if (itemName == "Water") {
    				waterCrops();
    				useItem(item.getGeneralBoost(), 0);
    				
    	    	} else if (itemName == "Warmth") {
    	    		
    	    		if ((state.totalMoney - item.getPurchasingPrice()) > 0.00) {
    	    			state.totalMoney -= item.getPurchasingPrice();
    	    			useItem(item.getGeneralBoost(), 0);
    	    		}
    	    		
    	    	} else if (itemName == "Speech") {
    	    		useItem(item.getGeneralBoost(), 0);
    	    	}
    			
    			break;
    		}
    	}
    }
	
	/**
	 * Handles use of selected item if it is a crop item.
	 * @param boost  the selected item's general boost
	 * @param growthBoost  the selected item's growth boost
	 */
	private void useItem(int boost, int growthBoost) {
    	for (Crop crop: state.crops) {
    		if (crop.planted && crop.getName() == selectedCrop) {
    			crop.increaseGrowthLevel(boost + growthBoost);
    		}
    	}
    }
    
	/**
	 * Handles case that water is selected item.
	 * Waters all crops.
	 */
    private void waterCrops() {
    	for (Crop crop: state.crops) {
    		if (crop.planted && crop.getName() == selectedCrop) {
    			crop.decreaseThirstLevel();
    		}
    	}
    }
}
