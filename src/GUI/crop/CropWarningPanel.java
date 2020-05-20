package gui.crop;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import gui.GameEnvironmentPanel;

public class CropWarningPanel {

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
	public CropWarningPanel() {
		initialize();
		ActivatePanel();
	}

	/**
	 * Initialise the contents of the frame.
	 */
	private void initialize() {
		frmFarmiza = new JFrame();
		frmFarmiza.setTitle("Farmiza");
		frmFarmiza.setBounds(100, 100, 607, 199);
		frmFarmiza.setIconImage(Toolkit.getDefaultToolkit().getImage(GameEnvironmentPanel.class.getResource("../images/logo.jpg")));
		frmFarmiza.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFarmiza.getContentPane().setLayout(null);
		frmFarmiza.setResizable(false);
		
		JLabel lblError = new JLabel("Looks like you do not have a crop selected or planted!");
		lblError.setBackground(new Color(204, 204, 102));
		lblError.setHorizontalAlignment(SwingConstants.CENTER);
		lblError.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 21));
		lblError.setOpaque(true);
		lblError.setBounds(6, 58, 589, 34);
		frmFarmiza.getContentPane().add(lblError);
		
		JLabel lblWarning = new JLabel("Oh no!");
		lblWarning.setBackground(new Color(204, 204, 102));
		lblWarning.setHorizontalAlignment(SwingConstants.CENTER);
		lblWarning.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 28));
		lblWarning.setOpaque(true);
		lblWarning.setBounds(236, 25, 128, 34);
		frmFarmiza.getContentPane().add(lblWarning);
		
		JButton btnClose = new JButton("CLOSE");
		btnClose.setBackground(new Color(255, 204, 51));
		btnClose.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		btnClose.setBounds(236, 107, 128, 42);
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				frmFarmiza.dispose();
			}
		});
		
		frmFarmiza.getContentPane().add(btnClose);
		lblBackground = new JLabel("");
		lblBackground.setBounds(0, -41, 601, 254);
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
