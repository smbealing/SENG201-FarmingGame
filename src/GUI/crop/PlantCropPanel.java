package gui.crop;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

import crop.Crop;
import gameEnvironment.GameState;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PlantCropPanel {
	
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
		frmFarmiza.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
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
		
		JLabel lblTomatos = new JLabel("Tomatos");
		lblTomatos.setBounds(62, 203, 111, 35);
		lblTomatos.setHorizontalAlignment(SwingConstants.CENTER);
		lblTomatos.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		frmFarmiza.getContentPane().add(lblTomatos);
		
		JLabel lblPotatos = new JLabel("Potatos");
		lblPotatos.setBounds(196, 203, 88, 35);
		lblPotatos.setHorizontalAlignment(SwingConstants.CENTER);
		lblPotatos.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		frmFarmiza.getContentPane().add(lblPotatos);
		
		JLabel lblDragonFruit = new JLabel("Dragon Fruit");
		lblDragonFruit.setBounds(113, 303, 140, 35);
		lblDragonFruit.setHorizontalAlignment(SwingConstants.CENTER);
		lblDragonFruit.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		frmFarmiza.getContentPane().add(lblDragonFruit);
		
		btnSelectBanana = new JRadioButton("SELECT");
		btnSelectBanana.setBounds(20, 139, 89, 25);
		btnSelectBanana.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		frmFarmiza.getContentPane().add(btnSelectBanana);
		
		btnSelectCorn = new JRadioButton("SELECT");
		btnSelectCorn.setBounds(136, 139, 89, 25);
		btnSelectCorn.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		frmFarmiza.getContentPane().add(btnSelectCorn);
		
		btnSelectWheat = new JRadioButton("SELECT");
		btnSelectWheat.setBounds(248, 139, 89, 25);
		btnSelectWheat.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		frmFarmiza.getContentPane().add(btnSelectWheat);
		
		btnSelectTomato = new JRadioButton("SELECT");
		btnSelectTomato.setBounds(72, 239, 89, 25);
		btnSelectTomato.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		frmFarmiza.getContentPane().add(btnSelectTomato);
		
		btnSelectPotato = new JRadioButton("SELECT");
		btnSelectPotato.setBounds(200, 239, 89, 25);
		btnSelectPotato.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		frmFarmiza.getContentPane().add(btnSelectPotato);
		
		btnSelectDragonFruit = new JRadioButton("SELECT");
		btnSelectDragonFruit.setBounds(146, 339, 89, 25);
		btnSelectDragonFruit.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		frmFarmiza.getContentPane().add(btnSelectDragonFruit);
		
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
		cmbSelectedCrop.setBounds(483, 201, 192, 41);
		frmFarmiza.getContentPane().add(cmbSelectedCrop);
		
		JLabel lblInstruction1 = new JLabel("Select the crop that you want");
		lblInstruction1.setBounds(398, 124, 356, 35);
		lblInstruction1.setHorizontalAlignment(SwingConstants.CENTER);
		lblInstruction1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		frmFarmiza.getContentPane().add(lblInstruction1);
		
		JLabel lblInstruction2 = new JLabel("to plant from options bellow:");
		lblInstruction2.setHorizontalAlignment(SwingConstants.CENTER);
		lblInstruction2.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblInstruction2.setBounds(408, 155, 346, 35);
		frmFarmiza.getContentPane().add(lblInstruction2);
		
		JButton btnPlant = new JButton("PLANT CROP");
		btnPlant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPlant.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		btnPlant.setBounds(508, 253, 151, 35);
		frmFarmiza.getContentPane().add(btnPlant);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btnBack.setBounds(336, 455, 111, 45);
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
			if (crop.getName() == cropName && !crop.getPlanted()) {
				cropsString = cropsString + count + ". " + cropName + ",";
				count++;
			}
		}
		return cropsString;
	}

}