package GameEnvironment;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class DroughtPanel {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DroughtPanel window = new DroughtPanel();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DroughtPanel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 743, 243);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNoticeOne = new JLabel("Oh no! A drought happened over night and it has effected you farm!");
		lblNoticeOne.setHorizontalAlignment(SwingConstants.CENTER);
		lblNoticeOne.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNoticeOne.setBounds(10, 31, 707, 46);
		frame.getContentPane().add(lblNoticeOne);
		
		JLabel lblNoticeTwo = new JLabel("The wells have dried up, and the crops are thirsty!");
		lblNoticeTwo.setHorizontalAlignment(SwingConstants.CENTER);
		lblNoticeTwo.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNoticeTwo.setBounds(89, 70, 548, 46);
		frame.getContentPane().add(lblNoticeTwo);
		
		JButton btnClose = new JButton("CLOSE");
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnClose.setBounds(285, 139, 157, 54);
		frame.getContentPane().add(btnClose);
	}

}
