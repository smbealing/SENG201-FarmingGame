package gui.crop;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

import crop.Crop;
import gameEnvironment.GameState;
import gui.GameEnvironmentPanel;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class PlantCropPanel {
	
	/**
	 * The game's GameState
	 */
	public GameState state;
	
	/**
	 * The crop the player selects to plant.
	 */
	public Crop selectedCrop;
	
	/**
	 * The crop name (type) of the crop the player selects to plant.
	 */
	public String cropName;
	
	/**
	 * The options displayed to the player 
	 * containing all the unplanted crops available of a selected type.
	 */
	private String crops = "";

	private JFrame frmFarmiza;
	private JButton btnPlant;
	private JLabel lblFieldImage;
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
	 * @param tempState  the current GameState
	 */
	public PlantCropPanel(GameState tempState) {
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
		frmFarmiza.setIconImage(Toolkit.getDefaultToolkit().getImage(GameEnvironmentPanel.class.getResource("../images/logo.jpg")));
		frmFarmiza.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFarmiza.setResizable(false);
		
		JLabel lblCropInventory = new JLabel("CROP INVENTORY");
		lblCropInventory.setFont(new Font("Tahoma", Font.BOLD, 35));
		frmFarmiza.getContentPane().setLayout(null);
		
		
		JLabel lblTitle = new JLabel("PLANT YOUR CROPS");
		lblTitle.setBounds(231, 11, 322, 35);
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
		frmFarmiza.getContentPane().add(lblTitle);
		
		JLabel lblBananas = new JLabel("Bananas");
		lblBananas.setBounds(10, 103, 111, 35);
		lblBananas.setHorizontalAlignment(SwingConstants.CENTER);
		lblBananas.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		frmFarmiza.getContentPane().add(lblBananas);
		
		JLabel lblCorn = new JLabel("Corn");
		lblCorn.setBounds(152, 103, 52, 35);
		lblCorn.setHorizontalAlignment(SwingConstants.CENTER);
		lblCorn.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		frmFarmiza.getContentPane().add(lblCorn);
		
		JLabel lblWheat = new JLabel("Wheat");
		lblWheat.setBounds(252, 103, 80, 35);
		lblWheat.setHorizontalAlignment(SwingConstants.CENTER);
		lblWheat.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		frmFarmiza.getContentPane().add(lblWheat);
		
		JLabel lblTomatoes = new JLabel("Tomatoes");
		lblTomatoes.setBounds(62, 203, 111, 35);
		lblTomatoes.setHorizontalAlignment(SwingConstants.CENTER);
		lblTomatoes.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		frmFarmiza.getContentPane().add(lblTomatoes);
		
		JLabel lblPotatoes = new JLabel("Potatoes");
		lblPotatoes.setBounds(192, 203, 111, 35);
		lblPotatoes.setHorizontalAlignment(SwingConstants.CENTER);
		lblPotatoes.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		frmFarmiza.getContentPane().add(lblPotatoes);
		
		JLabel lblDragonFruit = new JLabel("Dragon Fruit");
		lblDragonFruit.setBounds(113, 303, 140, 35);
		lblDragonFruit.setHorizontalAlignment(SwingConstants.CENTER);
		lblDragonFruit.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		frmFarmiza.getContentPane().add(lblDragonFruit);
		
		btnSelectBanana = new JRadioButton("SELECT");
		btnSelectBanana.setBackground(new Color(204, 204, 51));
		btnSelectBanana.setBounds(20, 139, 89, 25);
		btnSelectBanana.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnSelectBanana.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				getOptions();
			}
		});
		frmFarmiza.getContentPane().add(btnSelectBanana);
		
		btnSelectCorn = new JRadioButton("SELECT");
		btnSelectCorn.setBackground(new Color(204, 204, 51));
		btnSelectCorn.setBounds(136, 139, 89, 25);
		btnSelectCorn.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnSelectCorn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				getOptions();
			}
		});
		frmFarmiza.getContentPane().add(btnSelectCorn);
		
		btnSelectWheat = new JRadioButton("SELECT");
		btnSelectWheat.setBackground(new Color(204, 204, 51));
		btnSelectWheat.setBounds(248, 139, 89, 25);
		btnSelectWheat.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnSelectWheat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				getOptions();
			}
		});
		frmFarmiza.getContentPane().add(btnSelectWheat);
		
		btnSelectTomato = new JRadioButton("SELECT");
		btnSelectTomato.setBackground(new Color(204, 204, 51));
		btnSelectTomato.setBounds(72, 239, 89, 25);
		btnSelectTomato.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnSelectTomato.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				getOptions();
			}
		});
		frmFarmiza.getContentPane().add(btnSelectTomato);
		
		btnSelectPotato = new JRadioButton("SELECT");
		btnSelectPotato.setBackground(new Color(204, 204, 51));
		btnSelectPotato.setBounds(200, 239, 89, 25);
		btnSelectPotato.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnSelectPotato.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				getOptions();
			}
		});
		frmFarmiza.getContentPane().add(btnSelectPotato);
		
		btnSelectDragonFruit = new JRadioButton("SELECT");
		btnSelectDragonFruit.setBackground(new Color(204, 204, 51));
		btnSelectDragonFruit.setBounds(146, 339, 89, 25);
		btnSelectDragonFruit.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnSelectDragonFruit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				getOptions();
			}
		});
		frmFarmiza.getContentPane().add(btnSelectDragonFruit);
		
		ButtonGroup cropGroupButton = new ButtonGroup();
		cropGroupButton.add(btnSelectBanana);
		cropGroupButton.add(btnSelectCorn);
		cropGroupButton.add(btnSelectWheat);
		cropGroupButton.add(btnSelectTomato);
		cropGroupButton.add(btnSelectPotato);
		cropGroupButton.add(btnSelectDragonFruit);
		
		cmbSelectedCrop = new JComboBox<String>();
		cmbSelectedCrop.setBackground(new Color(204, 204, 51));
		cmbSelectedCrop.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		cmbSelectedCrop.setBounds(483, 180, 192, 41);
		frmFarmiza.getContentPane().add(cmbSelectedCrop);
		
		JLabel lblInstruction1 = new JLabel("Select the crop that you want");
		lblInstruction1.setBounds(398, 103, 356, 35);
		lblInstruction1.setHorizontalAlignment(SwingConstants.CENTER);
		lblInstruction1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		frmFarmiza.getContentPane().add(lblInstruction1);
		
		JLabel lblInstruction2 = new JLabel("to plant from options below:");
		lblInstruction2.setHorizontalAlignment(SwingConstants.CENTER);
		lblInstruction2.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblInstruction2.setBounds(408, 134, 346, 35);
		frmFarmiza.getContentPane().add(lblInstruction2);
		
		btnPlant = new JButton("PLANT CROP");
		btnPlant.setBackground(new Color(204, 204, 51));
		btnPlant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (crops != "") {
					getCrop(cmbSelectedCrop.getSelectedIndex());
					selectedCrop.setPlanted();
					getOptions();
					checkPlantBtn();
				} else {
					new CropWarningPanel();
				}
			}
		});
		btnPlant.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		btnPlant.setBounds(497, 233, 166, 35);
		frmFarmiza.getContentPane().add(btnPlant);
		checkPlantBtn();
		
		JButton btnBack = new JButton("BACK");
		btnBack.setBackground(new Color(102, 102, 51));
		btnBack.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		btnBack.setBounds(336, 455, 111, 45);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				new CropPanel(state);
				frmFarmiza.dispose();
			}
		});
		frmFarmiza.getContentPane().add(btnBack);
		
		lblFieldImage = new JLabel("");
		lblFieldImage.setBounds(-21, 0, 884, 625);
		frmFarmiza.getContentPane().add(lblFieldImage);
		setBackgr();
	}
	
	
	/**
	 * Sets the background image for the frame.
	 */
	private void setBackgr() {
		ImageIcon path = new ImageIcon(GameEnvironmentPanel.class.getResource("../images/crops.jpg"));
		Image imageGet = path.getImage();
		Image imageSize = imageGet.getScaledInstance(lblFieldImage.getWidth(), lblFieldImage.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image = new ImageIcon(imageSize);
		lblFieldImage.setIcon(image);
	}
	
	
	/**
	 * Handles the selection of a type of crop
	 */
	private void getOptions() {
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
		
		cmbSelectedCrop.setModel(new DefaultComboBoxModel<String>(crops.split(",")));
	}
	
	/**
	 * Checks whether the player has reached the maximum crop capacity for their farm.
	 * Disables or enables btnPlant accordingly.
	 */
	private void checkPlantBtn() {
		int plantedCrops = 0;
		
		for (Crop crop: state.crops) {
			if (crop.getPlanted()) {
				plantedCrops++;
			}
		}
		
		if (plantedCrops == state.farm.getMaxCropCount()) {
			btnPlant.setEnabled(false);
		} else {
			btnPlant.setEnabled(true);
		}
	}
	
	/**
	 * @return the String of options displayed to player with unplanted crops of their selected type.
	 */
	private String getCropString() {
		String cropsString = "";
		int count = 1;
		
		for (Crop crop: state.crops) {
			if (crop.getName() == cropName && !crop.getPlanted()) {
				cropsString = cropsString + count + ". " + cropName + ",";
				count++;
			}
		}
		return cropsString;
	}
	
	/**
	 * Handles the selection of a specific crop.
	 * @param selection  an integer representing the specific crop the player has selected from the list of crops of selected type
	 */
	private void getCrop(int selection) {
		int count = 0;
		
		for (Crop crop: state.crops) {
			if (crop.getName() == cropName && !crop.getPlanted()) {
				if (count == selection) {
					selectedCrop = crop;
					break;
				}
				count++;
			}
		}
	}

}
