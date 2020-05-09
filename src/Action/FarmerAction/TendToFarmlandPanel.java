package Action.FarmerAction;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class TendToFarmlandPanel {

	private JFrame frmFarmiza;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TendToFarmlandPanel window = new TendToFarmlandPanel();
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
	public TendToFarmlandPanel() {
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
		
		JLabel lblFarmlandTendedTo = new JLabel("Your farm land has been tended to.");
		lblFarmlandTendedTo.setHorizontalAlignment(SwingConstants.CENTER);
		lblFarmlandTendedTo.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblFarmlandTendedTo.setBounds(10, 81, 764, 56);
		frmFarmiza.getContentPane().add(lblFarmlandTendedTo);
		
		JLabel lblMaintenanceLevel = new JLabel("Your farm's need for maintenance is now: 0");
		lblMaintenanceLevel.setHorizontalAlignment(SwingConstants.CENTER);
		lblMaintenanceLevel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblMaintenanceLevel.setBounds(10, 221, 764, 56);
		frmFarmiza.getContentPane().add(lblMaintenanceLevel);
		
		JButton btnBackToFarm = new JButton("Back to Farm");
		btnBackToFarm.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		btnBackToFarm.setBounds(10, 420, 764, 65);
		frmFarmiza.getContentPane().add(btnBackToFarm);
	}
}
