package gui.crop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

import gameEnvironment.GameState;
import item.CropItem;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import crop.Crop;

import javax.swing.JComboBox;

public class CropInventoryPanel {

	public GameState state;
	public Crop selectedCrop;
	public String cropName;
	private String crops;
	
	private JFrame frmFarmiza;
	private JRadioButton btnSelectBanana;
	private JRadioButton btnSelectCorn;
	private JRadioButton btnSelectWheat;
	private JRadioButton btnSelectTomato;
	private JRadioButton btnSelectPotato;
	private JRadioButton btnSelectDragonFruit;
	private static JComboBox<String> cmbSelectedCrop;

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
	public CropInventoryPanel(GameState tempState) {
		state = tempState;
		initialize();
		ActivatePanel();
	}

	/**
	 * Initialise the contents of the frame.
	 */
	private void initialize() {
		frmFarmiza = new JFrame();
		frmFarmiza.setTitle("Farmiza");
		frmFarmiza.setBounds(100, 100, 800, 550);
		frmFarmiza.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFarmiza.getContentPane().setLayout(null);
		
		JLabel lblCropInventory = new JLabel("CROP INVENTORY");
		lblCropInventory.setFont(new Font("Tahoma", Font.BOLD, 35));
		
		
		JLabel lblTitle = new JLabel("CROP INVENTORY");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
		lblTitle.setBounds(258, 11, 268, 35);
		frmFarmiza.getContentPane().add(lblTitle);
		
		JLabel lblBananas = new JLabel("Bananas");
		lblBananas.setHorizontalAlignment(SwingConstants.CENTER);
		lblBananas.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblBananas.setBounds(10, 81, 111, 35);
		frmFarmiza.getContentPane().add(lblBananas);
		
		JLabel lblCorn = new JLabel("Corn");
		lblCorn.setHorizontalAlignment(SwingConstants.CENTER);
		lblCorn.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblCorn.setBounds(152, 81, 52, 35);
		frmFarmiza.getContentPane().add(lblCorn);
		
		JLabel lblWheat = new JLabel("Wheat");
		lblWheat.setHorizontalAlignment(SwingConstants.CENTER);
		lblWheat.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblWheat.setBounds(252, 81, 80, 35);
		frmFarmiza.getContentPane().add(lblWheat);
		
		JLabel lblTomatoes = new JLabel("Tomatoes");
		lblTomatoes.setHorizontalAlignment(SwingConstants.CENTER);
		lblTomatoes.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblTomatoes.setBounds(62, 181, 111, 35);
		frmFarmiza.getContentPane().add(lblTomatoes);
		
		JLabel lblPotatoes = new JLabel("Potatoes");
		lblPotatoes.setHorizontalAlignment(SwingConstants.CENTER);
		lblPotatoes.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblPotatoes.setBounds(196, 181, 88, 35);
		frmFarmiza.getContentPane().add(lblPotatoes);
		
		JLabel lblDragonFruit = new JLabel("Dragon Fruit");
		lblDragonFruit.setHorizontalAlignment(SwingConstants.CENTER);
		lblDragonFruit.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblDragonFruit.setBounds(113, 281, 140, 35);
		frmFarmiza.getContentPane().add(lblDragonFruit);
		
		btnSelectBanana = new JRadioButton("SELECT");
		btnSelectBanana.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnSelectBanana.setBounds(20, 117, 89, 25);
		frmFarmiza.getContentPane().add(btnSelectBanana);
		
		btnSelectCorn = new JRadioButton("SELECT");
		btnSelectCorn.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnSelectCorn.setBounds(136, 117, 89, 25);
		frmFarmiza.getContentPane().add(btnSelectCorn);
		
		btnSelectWheat = new JRadioButton("SELECT");
		btnSelectWheat.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnSelectWheat.setBounds(248, 117, 89, 25);
		frmFarmiza.getContentPane().add(btnSelectWheat);
		
		btnSelectTomato = new JRadioButton("SELECT");
		btnSelectTomato.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnSelectTomato.setBounds(72, 217, 89, 25);
		frmFarmiza.getContentPane().add(btnSelectTomato);
		
		btnSelectPotato = new JRadioButton("SELECT");
		btnSelectPotato.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnSelectPotato.setBounds(200, 217, 89, 25);
		frmFarmiza.getContentPane().add(btnSelectPotato);
		
		btnSelectDragonFruit = new JRadioButton("SELECT");
		btnSelectDragonFruit.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnSelectDragonFruit.setBounds(146, 317, 89, 25);
		frmFarmiza.getContentPane().add(btnSelectDragonFruit);
		
		JLabel lblSelect = new JLabel("Select a crop to view its status");
		lblSelect.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelect.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblSelect.setBounds(397, 81, 356, 35);
		frmFarmiza.getContentPane().add(lblSelect);
		
		ButtonGroup cropGroupButton = new ButtonGroup();
		cropGroupButton.add(btnSelectBanana);
		cropGroupButton.add(btnSelectCorn);
		cropGroupButton.add(btnSelectWheat);
		cropGroupButton.add(btnSelectTomato);
		cropGroupButton.add(btnSelectPotato);
		cropGroupButton.add(btnSelectDragonFruit);
		
		cmbSelectedCrop = new JComboBox<String>();
		cmbSelectedCrop.setModel(new DefaultComboBoxModel<String>(getOptions().split(",")));
		cmbSelectedCrop.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		cmbSelectedCrop.setBounds(483, 121, 192, 41);
		frmFarmiza.getContentPane().add(cmbSelectedCrop);
		
		JLabel lblCropItems = new JLabel("Crop Items Available");
		lblCropItems.setHorizontalAlignment(SwingConstants.CENTER);
		lblCropItems.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblCropItems.setBounds(468, 251, 242, 35);
		frmFarmiza.getContentPane().add(lblCropItems);
		
		JLabel lblFertiliserLeft = new JLabel("Fertiliser : " + getFertiliserCount());
		lblFertiliserLeft.setHorizontalAlignment(SwingConstants.LEFT);
		lblFertiliserLeft.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
		lblFertiliserLeft.setBounds(535, 282, 140, 35);
		frmFarmiza.getContentPane().add(lblFertiliserLeft);
		
		JLabel lblPesticideLeft = new JLabel("Pesticide : " + getPesticideCount());
		lblPesticideLeft.setHorizontalAlignment(SwingConstants.LEFT);
		lblPesticideLeft.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
		lblPesticideLeft.setBounds(535, 318, 140, 35);
		frmFarmiza.getContentPane().add(lblPesticideLeft);
		
		JButton btnCheckStatus = new JButton("CHECK STATUS");
		btnCheckStatus.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btnCheckStatus.setBounds(238, 455, 197, 45);
		btnCheckStatus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				getCrop(cmbSelectedCrop.getSelectedIndex());
				new CropStatusPanel(selectedCrop);
			}
		});
		frmFarmiza.getContentPane().add(btnCheckStatus);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btnBack.setBounds(469, 455, 111, 45);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				new CropPanel(state);
				frmFarmiza.dispose();
			}
		});
		frmFarmiza.getContentPane().add(btnBack);
	}
	
	private String getOptions() {
		crops = "";
		
		if (btnSelectBanana.isSelected()) {
			cropName = "Banana";
			crops = getCropString();
		} else if (btnSelectCorn.isSelected()) {
			cropName = "Corn";
			crops = getCropString();
		} else if (btnSelectWheat.isSelected()) {
			cropName = "Wheat";
			crops = getCropString();
		} else if (btnSelectTomato.isSelected()) {
			cropName = "Tomato";
			crops = getCropString();
		} else if (btnSelectPotato.isSelected()) {
			cropName = "Potato";
			crops = getCropString();
		} else if (btnSelectDragonFruit.isSelected()) {
			cropName = "Dragon Fruit";
			crops = getCropString();
		}
		return crops;
	}
	
	private String getCropString() {
		String cropsString = "";
		int count = 0;
		
		for (Crop crop: state.crops) {
			if (crop.getName() == cropName) {
				cropsString = cropsString + count + ". " + cropName + ",";
				count++;
			}
		}
		return cropsString;
	}
	
	private void getCrop(int selection) {
		int count = 0;
		
		for (Crop crop: state.crops) {
			if (crop.getName() == cropName && count == selection) {
				selectedCrop = crop;
				break;
			}
			count++;
		}
	}
	
	private int getFertiliserCount() {
		int count = 0;
		
		for (CropItem item: state.cropItems) {
			if (item.getName() == "Fertiliser") {
				count++;
			}
		}
		return count;
	}
	
	private int getPesticideCount() {
		int count = 0;
		
		for (CropItem item: state.cropItems) {
			if (item.getName() == "Pesticide") {
				count++;
			}
		}
		return count;
	}
}
