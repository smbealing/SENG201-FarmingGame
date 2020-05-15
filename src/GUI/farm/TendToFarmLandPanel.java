package gui.farm;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

import gameEnvironment.GameState;
import gui.GameEnvironmentPanel;

public class TendToFarmLandPanel {
	
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
	public TendToFarmLandPanel(final GameState tempState) {
		state = tempState;
		state.farm.setMaintenanceLevel(0);
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
		
		JButton btnBackToFarm = new JButton("BACK");
		btnBackToFarm.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		btnBackToFarm.setBounds(129, 436, 525, 64);
		btnBackToFarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				new FarmStatusPanel(state);
				frmFarmiza.dispose();
			}
		});
		frmFarmiza.getContentPane().add(btnBackToFarm);
		
		JLabel lblFarmLandTendedTo = new JLabel("Your farm land has been tended to.");
		lblFarmLandTendedTo.setHorizontalAlignment(SwingConstants.CENTER);
		lblFarmLandTendedTo.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblFarmLandTendedTo.setBounds(76, 71, 632, 72);
		frmFarmiza.getContentPane().add(lblFarmLandTendedTo);
		
		JLabel lblYourFarmsNeed = new JLabel("Your farm's need for maintenance is now 0.");
		lblYourFarmsNeed.setHorizontalAlignment(SwingConstants.CENTER);
		lblYourFarmsNeed.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblYourFarmsNeed.setBounds(76, 242, 632, 72);
		frmFarmiza.getContentPane().add(lblYourFarmsNeed);
	}
}
