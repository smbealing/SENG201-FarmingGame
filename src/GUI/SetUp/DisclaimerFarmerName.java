package GUI.SetUp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class DisclaimerFarmerName {

	private JFrame frmFarmiza;

	/**
	 * Launch the application.
	 */
	public void ActivatePanel() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DisclaimerFarmerName window = new DisclaimerFarmerName();
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
	public DisclaimerFarmerName() {
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
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				frmFarmiza.dispose();
			}
		});
		frmFarmiza.getContentPane().add(btnClose);
		
		JLabel lblNameLength = new JLabel("Please enter a name between 3 and 15 characters,");
		lblNameLength.setHorizontalAlignment(SwingConstants.CENTER);
		lblNameLength.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		lblNameLength.setBounds(10, 42, 414, 31);
		frmFarmiza.getContentPane().add(lblNameLength);
		
		JLabel lblWithoutSpecialChars = new JLabel("without numbers or special characters.");
		lblWithoutSpecialChars.setHorizontalAlignment(SwingConstants.CENTER);
		lblWithoutSpecialChars.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		lblWithoutSpecialChars.setBounds(10, 72, 414, 31);
		frmFarmiza.getContentPane().add(lblWithoutSpecialChars);
	}
}
