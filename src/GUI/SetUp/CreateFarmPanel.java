package GUI.SetUp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;

import Farm.CityFarm;
import Farm.Farmer;
import Farm.HardcoreFarm;
import Farm.NormalFarm;
import Farm.TropicalFarm;
import GUI.GameEnvironmentPanel;

import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class CreateFarmPanel {

	private JFrame frmFarmiza;
	private JTextField txfFarmName;
	private static int numDays;
	private static Farmer farmer;

	/**
	 * Launch the application.
	 */
	public void ActivatePanel() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateFarmPanel window = new CreateFarmPanel();
					window.frmFarmiza.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CreateFarmPanel() {
		initialize();
	}
	
	public static void selections(int days, Farmer tempFarmer) {
		numDays = days;
		farmer = tempFarmer;
				
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFarmiza = new JFrame();
		frmFarmiza.setTitle("Farmiza");
		frmFarmiza.setBounds(100, 100, 800, 550);
		frmFarmiza.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFarmiza.getContentPane().setLayout(null);
		
		JButton btnStartFarmingAdventure = new JButton("Start My Farming Adventure!");
		btnStartFarmingAdventure.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		btnStartFarmingAdventure.setBounds(129, 435, 525, 65);
		btnStartFarmingAdventure.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				//Check length of farm name
				String name = txfFarmName.getText().trim();
				if (name.length() > 15) {
					DisclaimerFarmName newDisclaimerPanel = new DisclaimerFarmName();
					newDisclaimerPanel.ActivatePanel();
				} else {
					//Create instance of farm
					Farm newFarm;
					switch (cmbFarmSelection.getSelectedItem()) {
					case "City Farm":
						newFarm = new CityFarm(name, farmer);
						break;
					case "Tropical Farm":
						newFarm = new TropicalFarm(name, farmer);
						break;
					case "Normal Farm":
						newFarm = new NormalFarm(name, farmer);
						break;
					case "Hardcore Farm":
						newFarm = new HardcoreFarm(name, farmer);
						break;
					}
					
					//Pass numDays and farm to GameEnvironment?
					GameEnvironmentPanel newPanel = new GameEnvironmentPanel();
					frmFarmiza.dispose();
					newPanel.ActivatePanel();
				}
			}
		});
		frmFarmiza.getContentPane().add(btnStartFarmingAdventure);
		
		JLabel lblNameFarm = new JLabel("Give your farm a name:");
		lblNameFarm.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblNameFarm.setBounds(36, 47, 332, 41);
		frmFarmiza.getContentPane().add(lblNameFarm);
		
		txfFarmName = new JTextField();
		txfFarmName.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		txfFarmName.setColumns(10);
		txfFarmName.setBounds(378, 47, 383, 41);
		frmFarmiza.getContentPane().add(txfFarmName);
		
		JLabel lblSelectFarmType = new JLabel("Select a type of farm:");
		lblSelectFarmType.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblSelectFarmType.setBounds(36, 160, 414, 36);
		frmFarmiza.getContentPane().add(lblSelectFarmType);
		
		JComboBox<String> cmbFarmSelection = new JComboBox<String>();
		cmbFarmSelection.setModel(new DefaultComboBoxModel<String>(new String[] {"City Farm", "Tropical Farm", "Normal Farm", "Hardcore Farm"}));
		cmbFarmSelection.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		cmbFarmSelection.setBounds(36, 217, 276, 41);
		frmFarmiza.getContentPane().add(cmbFarmSelection);
	}
}
