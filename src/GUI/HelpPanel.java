package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;

public class HelpPanel {

	private JFrame frmFarmiza;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HelpPanel window = new HelpPanel();
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
	public HelpPanel() {
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
		
		JButton btnClose = new JButton("Close");
		btnClose.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btnClose.setBounds(336, 455, 111, 45);
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				frmFarmiza.dispose();
			}
		});
		frmFarmiza.getContentPane().add(btnClose);
		
		JLabel lblHelpTitle = new JLabel("Help");
		lblHelpTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblHelpTitle.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
		lblHelpTitle.setBounds(318, 24, 148, 67);
		frmFarmiza.getContentPane().add(lblHelpTitle);
		
		JLabel lblHelpText = new JLabel("Help text here");
		lblHelpText.setHorizontalAlignment(SwingConstants.CENTER);
		lblHelpText.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		lblHelpText.setBounds(22, 97, 737, 331);
		frmFarmiza.getContentPane().add(lblHelpText);
	}
}
