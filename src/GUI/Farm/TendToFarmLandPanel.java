package GUI.Farm;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

import GUI.GameEnvironmentPanel;

public class TendToFarmLandPanel {

	private JFrame frmFarmiza;

	/**
	 * Launch the application.
	 */
	public void ActivatePanel() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TendToFarmLandPanel window = new TendToFarmLandPanel();
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
	public TendToFarmLandPanel() {
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
