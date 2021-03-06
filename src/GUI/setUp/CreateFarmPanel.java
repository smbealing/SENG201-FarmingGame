package gui.setUp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;

import farm.Farmer;
import farm.Farm;
import farm.CityFarm;
import farm.HardcoreFarm;
import farm.NormalFarm;
import farm.TropicalFarm;


import gameEnvironment.GameState;
import gui.GameEnvironmentPanel;


import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.Color;

public class CreateFarmPanel {
	
	/**
	 * The game's duration in days
	 */
	private static int numDays;
	
	/**
	 * The game's GameState
	 */
	public GameState state;
	private JFrame frmFarmiza;
	private JTextField txfFarmName;
	private JLabel lblBackgr;
	
	
	/**
	 * The game's farmer
	 */
	private static Farmer farmer;
	
	/**
	 * The game's farm
	 */
	private Farm newFarm;


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
	
	
	/**
	 * Sets attributes for game duration and farmer based on the player's 
	 * selections in SelectDaysPanel and CreateFarmerPanel.
	 * @param days  the game duration chosen by the player (integer)
	 * @param tempFarmer  the farmer created by the player (Farmer)
	 */
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
		frmFarmiza.setIconImage(Toolkit.getDefaultToolkit().getImage(GameEnvironmentPanel.class.getResource("../images/logo.jpg")));
		frmFarmiza.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFarmiza.getContentPane().setLayout(null);
		frmFarmiza.setResizable(false);
		
		
		
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
		
		final JComboBox<String> cmbFarmSelection = new JComboBox<String>();
		cmbFarmSelection.setBackground(new Color(153, 204, 0));
		cmbFarmSelection.setModel(new DefaultComboBoxModel<String>(new String[] {"City Farm", "Tropical Farm", "Normal Farm", "Hardcore Farm"}));
		cmbFarmSelection.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		cmbFarmSelection.setBounds(36, 217, 276, 41);
		frmFarmiza.getContentPane().add(cmbFarmSelection);
		
		
		JButton btnStartFarmingAdventure = new JButton("Start My Farming Adventure!");
		btnStartFarmingAdventure.setBackground(new Color(153, 204, 0));
		btnStartFarmingAdventure.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		btnStartFarmingAdventure.setBounds(134, 435, 525, 65);
		btnStartFarmingAdventure.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				//Check length of farm name
				String name = txfFarmName.getText().trim();
				if (name.length() < 1 || name.length() > 15) {
					DisclaimerFarmName newDisclaimerPanel = new DisclaimerFarmName();
					newDisclaimerPanel.ActivatePanel();
				} else {
					//Create instance of farm
					switch (cmbFarmSelection.getSelectedIndex()) {
					case 0:
						newFarm = new CityFarm(name, farmer);
						break;
					case 1:
						newFarm = new TropicalFarm(name, farmer);
						break;
					case 2:
						newFarm = new NormalFarm(name, farmer);
						break;
					case 3:
						newFarm = new HardcoreFarm(name, farmer);
						break;
					}
					
					state = new GameState(numDays, newFarm);
					new GameEnvironmentPanel(state);
					frmFarmiza.dispose();;
				}

				

			}
		});
		frmFarmiza.getContentPane().add(btnStartFarmingAdventure);
		
		lblBackgr = new JLabel("");
		lblBackgr.setBounds(0, 0, 794, 521);
		frmFarmiza.getContentPane().add(lblBackgr);
		setBackgr();
	}
	
	
	/**
	 * Sets the background image for the frame.
	 */
	private void setBackgr() {
		ImageIcon path = new ImageIcon(GameEnvironmentPanel.class.getResource("../images/set_up.jpg"));
		Image imageGet = path.getImage();
		Image imageSize = imageGet.getScaledInstance(lblBackgr.getWidth(), lblBackgr.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image = new ImageIcon(imageSize);
		lblBackgr.setIcon(image);
	}
}
