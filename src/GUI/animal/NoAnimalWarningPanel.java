package gui.animal;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import gui.GameEnvironmentPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class NoAnimalWarningPanel {

	private JFrame frmFarmiza;
	private JLabel lblBackground;

	/**
	 * Launch the application.
	 */
	public void ActivatePanel() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmFarmiza.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public NoAnimalWarningPanel() {
		initialize();
		ActivatePanel();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFarmiza = new JFrame();
		frmFarmiza.setTitle("Farmiza");
		frmFarmiza.setBounds(100, 100, 501, 192);
		frmFarmiza.setIconImage(Toolkit.getDefaultToolkit().getImage(GameEnvironmentPanel.class.getResource("../images/logo.jpg")));
		frmFarmiza.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFarmiza.getContentPane().setLayout(null);
		frmFarmiza.setResizable(false);
		
		JLabel lblWarning = new JLabel("Oh no!");
		lblWarning.setHorizontalAlignment(SwingConstants.CENTER);
		lblWarning.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 28));
		lblWarning.setBounds(185, 11, 125, 34);
		frmFarmiza.getContentPane().add(lblWarning);
		
		JLabel lblError = new JLabel("You don't have any animals!");
		lblError.setHorizontalAlignment(SwingConstants.CENTER);
		lblError.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 23));
		lblError.setBounds(15, 44, 465, 47);
		frmFarmiza.getContentPane().add(lblError);
		
		JButton btnClose = new JButton("CLOSE");
		btnClose.setBackground(new Color(255, 204, 51));
		btnClose.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		btnClose.setBounds(189, 100, 116, 42);
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				frmFarmiza.dispose();
			}
		});
		frmFarmiza.getContentPane().add(btnClose);
		
		lblBackground = new JLabel("");
		lblBackground.setBounds(0, 0, 495, 179);
		frmFarmiza.getContentPane().add(lblBackground);
		setBackground();
	}
	
	private void setBackground() {
		ImageIcon path = new ImageIcon(GameEnvironmentPanel.class.getResource("../images/warning.jpg"));
		Image imageGet = path.getImage();
		Image imageSize = imageGet.getScaledInstance(lblBackground.getWidth(), lblBackground.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image = new ImageIcon(imageSize);
		lblBackground.setIcon(image);
	}
}
