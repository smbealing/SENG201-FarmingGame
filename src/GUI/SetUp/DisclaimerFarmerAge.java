package GUI.SetUp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class DisclaimerFarmerAge {

	private JFrame frmFarmiza;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DisclaimerFarmerAge window = new DisclaimerFarmerAge();
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
	public DisclaimerFarmerAge() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFarmiza = new JFrame();
		frmFarmiza.setTitle("Farmiza");
		frmFarmiza.setBounds(100, 100, 450, 243);
		frmFarmiza.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFarmiza.getContentPane().setLayout(null);
		
		JButton btnClose = new JButton("CLOSE");
		btnClose.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btnClose.setBounds(138, 139, 157, 54);
		frmFarmiza.getContentPane().add(btnClose);
		
		JLabel lblAgeRange = new JLabel("Please enter an age between 20 and 70.");
		lblAgeRange.setHorizontalAlignment(SwingConstants.CENTER);
		lblAgeRange.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblAgeRange.setBounds(10, 52, 414, 31);
		frmFarmiza.getContentPane().add(lblAgeRange);
	}

}
