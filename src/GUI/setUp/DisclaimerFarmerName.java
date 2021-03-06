package gui.setUp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

import gui.GameEnvironmentPanel;
import java.awt.Color;

public class DisclaimerFarmerName {

	private JFrame frmFarmiza;
	private JLabel lblBackground;

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
		frmFarmiza.setIconImage(Toolkit.getDefaultToolkit().getImage(GameEnvironmentPanel.class.getResource("../images/logo.jpg")));
		frmFarmiza.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFarmiza.getContentPane().setLayout(null);
		frmFarmiza.setResizable(false);
		
		JButton btnClose = new JButton("CLOSE");
		btnClose.setBackground(new Color(204, 204, 51));
		btnClose.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		btnClose.setBounds(148, 153, 143, 50);
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				frmFarmiza.dispose();
			}
		});
		frmFarmiza.getContentPane().add(btnClose);
		
		JLabel lblNameLength = new JLabel("Please enter a name between 3 and 15 characters,");
		lblNameLength.setBackground(new Color(204, 204, 102));
		lblNameLength.setHorizontalAlignment(SwingConstants.CENTER);
		lblNameLength.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		lblNameLength.setOpaque(true);
		lblNameLength.setBounds(10, 42, 414, 31);
		frmFarmiza.getContentPane().add(lblNameLength);
		
		JLabel lblWithoutSpecialChars = new JLabel("without numbers or special characters.");
		lblWithoutSpecialChars.setBackground(new Color(204, 204, 102));
		lblWithoutSpecialChars.setHorizontalAlignment(SwingConstants.CENTER);
		lblWithoutSpecialChars.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		lblWithoutSpecialChars.setOpaque(true);
		lblWithoutSpecialChars.setBounds(10, 72, 414, 31);
		frmFarmiza.getContentPane().add(lblWithoutSpecialChars);
		
		frmFarmiza.getContentPane().add(btnClose);
		lblBackground = new JLabel("");
		lblBackground.setBounds(0, -41, 601, 254);
		frmFarmiza.getContentPane().add(lblBackground);
		setBackground();
	}
	
	/**
	 * Sets the background image for the frame.
	 */
	private void setBackground() {
		ImageIcon path = new ImageIcon(GameEnvironmentPanel.class.getResource("../images/warning.jpg"));
		Image imageGet = path.getImage();
		Image imageSize = imageGet.getScaledInstance(lblBackground.getWidth(), lblBackground.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image = new ImageIcon(imageSize);
		lblBackground.setIcon(image);
	}
}
