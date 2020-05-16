package gui.crop;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.util.Set;

import javax.swing.JFrame;

import crop.Crop;
import gameEnvironment.GameState;
import gui.GameEnvironmentPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class HarvestCropPanel {
	
	public GameState state;
	private Set<String> cropsSet;
	private String[] cropsList;

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
	public HarvestCropPanel(GameState tempState) {
		state = tempState;
		getCrops();
		
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
		
		JLabel lblHarvestCrops = new JLabel("HARVEST CROPS");
		lblHarvestCrops.setHorizontalAlignment(SwingConstants.CENTER);
		lblHarvestCrops.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 26));
		lblHarvestCrops.setBounds(111, 11, 249, 35);
		frmFarmiza.getContentPane().add(lblHarvestCrops);
		
		JLabel label_1 = new JLabel("Crops");
		label_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 24));
		label_1.setBounds(187, 52, 89, 35);
		frmFarmiza.getContentPane().add(label_1);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setSelectedIndex(0);
		comboBox.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		comboBox.setBounds(136, 98, 192, 41);
		frmFarmiza.getContentPane().add(comboBox);
		
		JButton button = new JButton("USE ITEM");
		button.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		button.setBounds(84, 178, 141, 45);
		frmFarmiza.getContentPane().add(button);
		
		JButton button_1 = new JButton("CLOSE");
		button_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		button_1.setBounds(254, 177, 118, 46);
		frmFarmiza.getContentPane().add(button_1);
	}
	
	private void getCrops() {
		String crops = "";
		
		for (Crop crop: state.crops) {
    		if (crop.planted && crop.getDaysUntilHarvest() == 0) {
    			cropsSet.add(crop.getName());
    		}
    	}
		
		for (String crop: cropsSet) {
			crops = crops + crop + ",";
		}
		
		cropsList = crops.split(",");
	}
}
