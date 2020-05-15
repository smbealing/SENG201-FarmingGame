package gui.farmer;

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

public class FarmerStatusPanel {
	
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
	public FarmerStatusPanel(final GameState tempState) {
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
		
		
		JLabel lblFarmer = new JLabel("Farmer: " + state.farmer.getName());
		lblFarmer.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblFarmer.setBounds(129, 35, 360, 48);
		frmFarmiza.getContentPane().add(lblFarmer);
		
		JLabel lblAge = new JLabel("Age: " + state.farmer.getAge());
		lblAge.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblAge.setBounds(129, 118, 290, 48);
		frmFarmiza.getContentPane().add(lblAge);
		
		JLabel lblActionsLeftToday = new JLabel("Actions left today: " + state.farmer.getActionCount());
		lblActionsLeftToday.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblActionsLeftToday.setBounds(129, 264, 430, 48);
		frmFarmiza.getContentPane().add(lblActionsLeftToday);
		
		
		JButton btnBackToFarm = new JButton("BACK");
		btnBackToFarm.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		btnBackToFarm.setBounds(129, 436, 525, 64);
		btnBackToFarm.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent event) {
				new GameEnvironmentPanel(state);
				frmFarmiza.dispose();

			}
		});
		frmFarmiza.getContentPane().add(btnBackToFarm);
	}
}
