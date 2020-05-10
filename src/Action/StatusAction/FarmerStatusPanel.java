package Action.StatusAction;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

import GameEnvironment.GameEnvironmentPanel;

public class FarmerStatusPanel {

	private JFrame frmFarmiza;

	/**
	 * Launch the application.
	 */
	public void ActivatePanel() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FarmerStatusPanel window = new FarmerStatusPanel();
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
	public FarmerStatusPanel() {
		initialize();
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
		
		JButton btnBackToFarm = new JButton("Back to Farm");
		btnBackToFarm.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		btnBackToFarm.setBounds(129, 436, 525, 64);
		btnBackToFarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GameEnvironmentPanel newPanel = new GameEnvironmentPanel();
				frmFarmiza.dispose();
				newPanel.ActivatePanel();
			}
		});
		frmFarmiza.getContentPane().add(btnBackToFarm);
		
		JLabel lblFarmer = new JLabel("Farmer:");
		lblFarmer.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblFarmer.setBounds(129, 35, 108, 48);
		frmFarmiza.getContentPane().add(lblFarmer);
		
		JLabel lblfarmerName = new JLabel("[Farmer Name]");
		lblfarmerName.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblfarmerName.setBounds(247, 35, 332, 48);
		frmFarmiza.getContentPane().add(lblfarmerName);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblAge.setBounds(129, 118, 69, 48);
		frmFarmiza.getContentPane().add(lblAge);
		
		JLabel lblFarmerAge = new JLabel("[Farmer Age]");
		lblFarmerAge.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblFarmerAge.setBounds(208, 118, 197, 48);
		frmFarmiza.getContentPane().add(lblFarmerAge);
		
		JLabel lblActionsLeftToday = new JLabel("Actions left today:");
		lblActionsLeftToday.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblActionsLeftToday.setBounds(129, 264, 234, 48);
		frmFarmiza.getContentPane().add(lblActionsLeftToday);
		
		JLabel lblActionCount = new JLabel("[Action Count]");
		lblActionCount.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblActionCount.setBounds(373, 264, 183, 48);
		frmFarmiza.getContentPane().add(lblActionCount);
	}
}
