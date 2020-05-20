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

public class DisclaimerFarmName {

	private JFrame frmFarmiza;
	private JLabel lblBackground;

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
		frmFarmiza.setIconImage(Toolkit.getDefaultToolkit().getImage(GameEnvironmentPanel.class.getResource("../images/logo.jpg")));
		frmFarmiza.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFarmiza.getContentPane().setLayout(null);
		frmFarmiza.setResizable(false);
		
		JButton btnClose = new JButton("CLOSE");
		btnClose.setBackground(new Color(204, 204, 51));
		btnClose.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		btnClose.setBounds(149, 157, 145, 46);
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				frmFarmiza.dispose();
			}
		});
		frmFarmiza.getContentPane().add(btnClose);
		
		JLabel lblNameFarm = new JLabel("Please give your farm a name with between");
		lblNameFarm.setBackground(new Color(204, 204, 102));
		lblNameFarm.setHorizontalAlignment(SwingConstants.CENTER);
		lblNameFarm.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNameFarm.setOpaque(true);
		lblNameFarm.setBounds(10, 51, 414, 31);
		frmFarmiza.getContentPane().add(lblNameFarm);
		
		JLabel lblMaxCharNum = new JLabel("1 and 15 characters.");
		lblMaxCharNum.setBackground(new Color(204, 204, 102));
		lblMaxCharNum.setHorizontalAlignment(SwingConstants.CENTER);
		lblMaxCharNum.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblMaxCharNum.setOpaque(true);
		lblMaxCharNum.setBounds(10, 79, 414, 31);
		frmFarmiza.getContentPane().add(lblMaxCharNum);
		
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
