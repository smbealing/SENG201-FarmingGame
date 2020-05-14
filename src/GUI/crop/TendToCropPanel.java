package gui.crop;

import java.awt.EventQueue;

import javax.swing.JFrame;

import gameEnvironment.GameState;
import item.CropItem;
import item.GenericItem;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.SwingConstants;

import crop.Crop;

import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBoxMenuItem;

public class TendToCropPanel {
	
	public GameState state;
	private Set<String> plantedCropsSet;
	private Set<String> cropItemsSet;
	private String[] plantedCropsList;
	private String[] cropItemsList;
	private String selectedCrop;

	private JFrame frmFarmiza;

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
	 */
	public TendToCropPanel(GameState tempState) {
		state = tempState;
		getCropsItems();
		
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
		frmFarmiza.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFarmiza.getContentPane().setLayout(null);
		
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
		lblSelectACrop.setBounds(110, 11, 249, 35);
		frmFarmiza.getContentPane().add(lblSelectACrop);
		
		
		final JComboBox<String> cmbCropSelection = new JComboBox<String>();
		cmbCropSelection.setModel(new DefaultComboBoxModel<String>(plantedCropsList));
		cmbCropSelection.setSelectedIndex(0);
		cmbCropSelection.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		cmbCropSelection.setBounds(32, 103, 192, 41);
		frmFarmiza.getContentPane().add(cmbCropSelection);
		
		final JComboBox<String> cmbItemSelection = new JComboBox<String>();
		cmbItemSelection.setModel(new DefaultComboBoxModel<String>(cropItemsList));
		cmbItemSelection.setSelectedIndex(0);
		cmbItemSelection.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		cmbItemSelection.setBounds(253, 103, 192, 41);
		frmFarmiza.getContentPane().add(cmbItemSelection);
		
		JButton btnUseItem = new JButton("USE ITEM");
		btnUseItem.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btnUseItem.setBounds(83, 178, 141, 45);
		btnUseItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				ArrayList<String> selectedCrops = new ArrayList<String>(plantedCropsSet);
				ArrayList<String> selectedItems = new ArrayList<String>(cropItemsSet);
				
				selectedCrop = selectedCrops.get(cmbCropSelection.getSelectedIndex());
				String selectedItem = selectedItems.get(cmbItemSelection.getSelectedIndex());
				
				useSelectedItem(selectedItem);
			}
		});
		frmFarmiza.getContentPane().add(btnUseItem);
		
		JButton btnClose = new JButton("CLOSE");
		btnClose.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		btnClose.setBounds(253, 177, 118, 46);
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				new CropPanel(state);
				frmFarmiza.dispose();
			}
		});
		frmFarmiza.getContentPane().add(btnClose);
	}
	
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
	}
	
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
	
	private void useSelectedItem(String selectedItem) {
		
		if (selectedItem == "Fertiliser") {
			useCropItem(selectedItem);
		} else if (selectedItem == "Pesticide") {
			useCropItem(selectedItem);
		} else {
			useGenericItem(selectedItem);
		}
		
	}
	
	private void useCropItem(String itemName) {
		
    	for (CropItem item: state.cropItems) {
    		if (item.getName() == itemName) {
    			useItem(item.getGeneralBoost(), item.getGrowthBoost());
    			state.cropItems.remove(item);
    			
    			break;
    		}
    	}
    	
    }
	
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
	
	private void useItem(int boost, int growthBoost) {
    	state.farmer.reduceActionCount();
    	for (Crop crop: state.crops) {
    		if (crop.planted && crop.getName() == selectedCrop) {
    			crop.increaseGrowthLevel(boost + growthBoost);
    		}
    	}
    }
    
    private void waterCrops() {
    	for (Crop crop: state.crops) {
    		if (crop.planted && crop.getName() == selectedCrop) {
    			crop.decreaseThirstLevel();
    		}
    	}
    }
}
