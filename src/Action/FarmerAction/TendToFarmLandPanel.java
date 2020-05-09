package Action.FarmerAction;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class TendToFarmLandPanel {

	private JFrame frmFarmiza;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
		btnBackToFarm.setBounds(10, 436, 764, 64);
		frmFarmiza.getContentPane().add(btnBackToFarm);
		
		JLabel lblFarmLandTendedTo = new JLabel("Your farm land has been tended to.");
		lblFarmLandTendedTo.setHorizontalAlignment(SwingConstants.CENTER);
		lblFarmLandTendedTo.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblFarmLandTendedTo.setBounds(68, 71, 632, 72);
		frmFarmiza.getContentPane().add(lblFarmLandTendedTo);
		
		JLabel lblYourFarmsNeed = new JLabel("Your farm's need for maintenance is now 0.");
		lblYourFarmsNeed.setHorizontalAlignment(SwingConstants.CENTER);
		lblYourFarmsNeed.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblYourFarmsNeed.setBounds(68, 242, 632, 72);
		frmFarmiza.getContentPane().add(lblYourFarmsNeed);
	}
}
