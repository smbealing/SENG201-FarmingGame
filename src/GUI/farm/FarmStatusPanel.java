package gui.farm;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

import gameEnvironment.GameState;
import gui.GameEnvironmentPanel;
import gui.farmer.FarmerStatusPanel;

public class FarmStatusPanel {
	
	public GameState state;

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
	public FarmStatusPanel(final GameState tempState) {
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
		frmFarmiza.setBounds(100, 100, 800, 550);
		frmFarmiza.setIconImage(Toolkit.getDefaultToolkit().getImage(GameEnvironmentPanel.class.getResource("../images/logo.jpg")));
		frmFarmiza.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFarmiza.getContentPane().setLayout(null);
		
		JLabel lblFarmMoney = new JLabel("Your farm has: $" + state.totalMoney);
		lblFarmMoney.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblFarmMoney.setBounds(129, 48, 428, 48);
		frmFarmiza.getContentPane().add(lblFarmMoney);
		
		JLabel lblTotalCrops = new JLabel("Total crops: " + state.crops.size());
		lblTotalCrops.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblTotalCrops.setBounds(129, 138, 385, 48);
		frmFarmiza.getContentPane().add(lblTotalCrops);
		
		JLabel lblTotalAnimals = new JLabel("Total animals: " + state.animals.size());
		lblTotalAnimals.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblTotalAnimals.setBounds(129, 229, 385, 48);
		frmFarmiza.getContentPane().add(lblTotalAnimals);
		
		JLabel lblNeedForMaintenance = new JLabel("Need for maintenance: " + state.farm.getMaintenanceLevel());
		lblNeedForMaintenance.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblNeedForMaintenance.setBounds(129, 329, 536, 48);
		frmFarmiza.getContentPane().add(lblNeedForMaintenance);
		
		JLabel lblTotalMoney = new JLabel("");
		lblTotalMoney.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblTotalMoney.setBounds(344, 48, 239, 48);
		frmFarmiza.getContentPane().add(lblTotalMoney);
		
		JButton btnBackToFarm = new JButton("BACK");
		btnBackToFarm.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		btnBackToFarm.setBounds(362, 421, 221, 79);
		btnBackToFarm.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent event) {
				new GameEnvironmentPanel(state);
				frmFarmiza.dispose();
			}
		});
		frmFarmiza.getContentPane().add(btnBackToFarm);
		
		JButton btnTendToFarmLand = new JButton("TEND TO FARM LAND");
		btnTendToFarmLand.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
		btnTendToFarmLand.setBounds(129, 421, 221, 79);
		btnTendToFarmLand.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				new TendToFarmLandPanel(state);
				frmFarmiza.dispose();

			}
		});
		frmFarmiza.getContentPane().add(btnTendToFarmLand);
	}
}
