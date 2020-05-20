package gui.farm;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

import gameEnvironment.GameState;
import gui.GameEnvironmentPanel;
import javax.swing.SwingConstants;
import java.awt.Color;

public class FarmStatusPanel {
	
	/**
	 * The game's GameState.
	 */
	public GameState state;

	private JFrame frmFarmiza;
	private JLabel lblNeedForMaintenance;
	private JButton btnTendToFarmLand;
	private JLabel lblBackground;

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
		frmFarmiza.setResizable(false);
		
		JLabel lblFarmName = new JLabel(state.farm.getName() + " STATUS");
		lblFarmName.setHorizontalAlignment(SwingConstants.CENTER);
		lblFarmName.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
		lblFarmName.setBounds(125, 11, 534, 69);
		frmFarmiza.getContentPane().add(lblFarmName);
		
		JLabel lblFarmMoney = new JLabel("Your farm has: $" + String.format("%.2f", state.totalMoney));
		lblFarmMoney.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblFarmMoney.setBounds(35, 91, 296, 48);
		frmFarmiza.getContentPane().add(lblFarmMoney);
		
		JLabel lblTotalCrops = new JLabel("Total crops: " + state.crops.size());
		lblTotalCrops.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblTotalCrops.setBounds(35, 161, 212, 48);
		frmFarmiza.getContentPane().add(lblTotalCrops);
		
		JLabel lblTotalAnimals = new JLabel("Total animals: " + state.animals.size());
		lblTotalAnimals.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblTotalAnimals.setBounds(35, 234, 231, 48);
		frmFarmiza.getContentPane().add(lblTotalAnimals);
		
		lblNeedForMaintenance = new JLabel();
		lblNeedForMaintenance.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblNeedForMaintenance.setBounds(35, 308, 332, 48);
		frmFarmiza.getContentPane().add(lblNeedForMaintenance);
		checkMaintenece();
		
		JLabel lblTotalMoney = new JLabel("");
		lblTotalMoney.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblTotalMoney.setBounds(344, 48, 239, 48);
		frmFarmiza.getContentPane().add(lblTotalMoney);
		
		btnTendToFarmLand = new JButton("TEND TO FARM LAND");
		btnTendToFarmLand.setBackground(new Color(153, 204, 51));
		btnTendToFarmLand.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
		btnTendToFarmLand.setBounds(202, 452, 221, 48);
		btnTendToFarmLand.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				new TendToFarmLandPanel(state);
				checkMaintenece();
				checkFarm();
			}
		});
		frmFarmiza.getContentPane().add(btnTendToFarmLand);
		checkFarm();
		
		JButton btnBackToFarm = new JButton("BACK");
		btnBackToFarm.setBackground(new Color(153, 204, 51));
		btnBackToFarm.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		btnBackToFarm.setBounds(435, 452, 111, 48);
		btnBackToFarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				new GameEnvironmentPanel(state);
				frmFarmiza.dispose();
			}
		});
		frmFarmiza.getContentPane().add(btnBackToFarm);
		
		lblBackground = new JLabel("");
		lblBackground.setBounds(0, 0, 794, 521);
		frmFarmiza.getContentPane().add(lblBackground);
		setWoodBackgr();
	}
	
	
	/**
	 * Sets the background image for the frame.
	 */
	private void setWoodBackgr() {
		ImageIcon path = new ImageIcon(GameEnvironmentPanel.class.getResource("../images/farm_land.jpg"));
		Image imageGet = path.getImage();
		Image imageSize = imageGet.getScaledInstance(lblBackground.getWidth(), lblBackground.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image = new ImageIcon(imageSize);
		lblBackground.setIcon(image);
	}
	
	
	/**
	 * Gets farm's maintenance level and updates label in panel accordingly.
	 */
	private void checkMaintenece() {
		lblNeedForMaintenance.setText("Need for maintenance: " + state.farm.getMaintenanceLevel());
	}
	
	
	/**
	 * Gets farm's maintenance level and disables or enables btnTendToFarmLand 
	 * based on whether the farm land needs tending to.
	 */
	private void checkFarm() {
		if (state.farm.getMaintenanceLevel() > 0) {
			btnTendToFarmLand.setEnabled(true);
		} else {
			btnTendToFarmLand.setEnabled(false);
		}
	}
}
