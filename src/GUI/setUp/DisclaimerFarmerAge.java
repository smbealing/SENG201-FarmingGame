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

public class DisclaimerFarmerAge {

	private JFrame frmFarmiza;
	private JLabel lblBackground;

	/**
	 * Launch the application.
	 */
	public void ActivatePanel() {
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
		frmFarmiza.setIconImage(Toolkit.getDefaultToolkit().getImage(GameEnvironmentPanel.class.getResource("../images/logo.jpg")));
		frmFarmiza.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFarmiza.getContentPane().setLayout(null);
		frmFarmiza.setResizable(false);
		
		JLabel lblAgeRange = new JLabel("Please enter age as an integer between 20 and 70.");
		lblAgeRange.setBackground(new Color(204, 204, 102));
		lblAgeRange.setHorizontalAlignment(SwingConstants.CENTER);
		lblAgeRange.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		lblAgeRange.setOpaque(true);
		lblAgeRange.setBounds(15, 52, 414, 31);
		frmFarmiza.getContentPane().add(lblAgeRange);
		
		JButton btnClose = new JButton("CLOSE");
		btnClose.setBackground(new Color(204, 204, 51));
		btnClose.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		btnClose.setBounds(155, 157, 134, 46);
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				frmFarmiza.dispose();
			}
		});
		frmFarmiza.getContentPane().add(btnClose);
		
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
