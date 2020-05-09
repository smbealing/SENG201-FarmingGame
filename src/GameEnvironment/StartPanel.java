package GameEnvironment;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class StartPanel {

	private JFrame frmFarmiza;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartPanel window = new StartPanel();
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
	public StartPanel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFarmiza = new JFrame();
		frmFarmiza.setTitle("Farmiza");
		frmFarmiza.setBounds(100, 100, 814, 552);
		frmFarmiza.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFarmiza.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, 11, 46, 14);
		frmFarmiza.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Farmiza");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Gabbaland", Font.BOLD, 60));
		lblNewLabel_1.setBounds(10, 21, 414, 78);
		frmFarmiza.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Play");
		btnNewButton.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		btnNewButton.setBounds(10, 172, 414, 32);
		frmFarmiza.getContentPane().add(btnNewButton);
		
		JButton btnQuit = new JButton("Quit");
		btnQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnQuit.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		btnQuit.setBounds(10, 218, 414, 32);
		frmFarmiza.getContentPane().add(btnQuit);
	}
}
