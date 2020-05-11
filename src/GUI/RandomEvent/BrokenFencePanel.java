package GUI.RandomEvent;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class BrokenFencePanel {

	private JFrame frmFarmiza;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BrokenFencePanel window = new BrokenFencePanel();
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
	public BrokenFencePanel() {
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
		
		JLabel lblNoticeOne = new JLabel("Oh no! Your fence broke!");
		lblNoticeOne.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblNoticeOne.setHorizontalAlignment(SwingConstants.CENTER);
		lblNoticeOne.setBounds(55, 31, 324, 46);
		frmFarmiza.getContentPane().add(lblNoticeOne);
		
		JLabel lblNoticeTwo = new JLabel("Some of your animals escaped!");
		lblNoticeTwo.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblNoticeTwo.setHorizontalAlignment(SwingConstants.CENTER);
		lblNoticeTwo.setBounds(10, 70, 408, 46);
		frmFarmiza.getContentPane().add(lblNoticeTwo);
	}

}
