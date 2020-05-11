package GUI.RandomEvent;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class BrokenFencePanel {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BrokenFencePanel window = new BrokenFencePanel();
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
	public BrokenFencePanel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 243);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnClose = new JButton("CLOSE");
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnClose.setBounds(138, 139, 157, 54);
		frame.getContentPane().add(btnClose);
		
		JLabel lblNoticeOne = new JLabel("Oh no! Your fence broke!");
		lblNoticeOne.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNoticeOne.setHorizontalAlignment(SwingConstants.CENTER);
		lblNoticeOne.setBounds(55, 31, 324, 46);
		frame.getContentPane().add(lblNoticeOne);
		
		JLabel lblNoticeTwo = new JLabel("Some of you animals escaped!");
		lblNoticeTwo.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNoticeTwo.setHorizontalAlignment(SwingConstants.CENTER);
		lblNoticeTwo.setBounds(38, 70, 358, 46);
		frame.getContentPane().add(lblNoticeTwo);
	}

}
