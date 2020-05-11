package GUI.SetUp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class DisclaimerFarmName {

	private JFrame frmFarmiza;

	/**
	 * Launch the application.
	 */
	public void ActivatePanel() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DisclaimerFarmName window = new DisclaimerFarmName();
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
	public DisclaimerFarmName() {
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
		
		JLabel lblNameFarm = new JLabel("Please give your farm a name with less than");
		lblNameFarm.setHorizontalAlignment(SwingConstants.CENTER);
		lblNameFarm.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNameFarm.setBounds(10, 51, 414, 31);
		frmFarmiza.getContentPane().add(lblNameFarm);
		
		JLabel lblMaxCharNum = new JLabel("16 characters.");
		lblMaxCharNum.setHorizontalAlignment(SwingConstants.CENTER);
		lblMaxCharNum.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblMaxCharNum.setBounds(10, 83, 414, 31);
		frmFarmiza.getContentPane().add(lblMaxCharNum);
	}
}
