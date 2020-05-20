package gui.randomEvent;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;

import gui.GameEnvironmentPanel;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;

public class DroughtPanel {

	private JFrame frmFarmiza;
	private JLabel lblBackground;

	/**
	 * Launch the application.
	 */
	public void ActivatePanel() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DroughtPanel window = new DroughtPanel();
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
	public DroughtPanel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFarmiza = new JFrame();
		frmFarmiza.setTitle("Farmiza");
		frmFarmiza.setBounds(100, 100, 743, 208);
		frmFarmiza.setIconImage(Toolkit.getDefaultToolkit().getImage(GameEnvironmentPanel.class.getResource("../images/logo.jpg")));
		frmFarmiza.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFarmiza.getContentPane().setLayout(null);
		frmFarmiza.setResizable(false);
		
		JLabel lblNoticeOne = new JLabel("Oh no! A drought happened over night and it has affected your farm!");
		lblNoticeOne.setBackground(new Color(135, 206, 235));
		lblNoticeOne.setHorizontalAlignment(SwingConstants.CENTER);
		lblNoticeOne.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 21));
		lblNoticeOne.setOpaque(true);
		lblNoticeOne.setBounds(20, 0, 707, 46);
		frmFarmiza.getContentPane().add(lblNoticeOne);
		
		JLabel lblNoticeTwo = new JLabel("The wells have dried up, and the crops are thirsty!");
		lblNoticeTwo.setBackground(new Color(135, 206, 235));
		lblNoticeTwo.setHorizontalAlignment(SwingConstants.CENTER);
		lblNoticeTwo.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 21));
		lblNoticeTwo.setOpaque(true);
		lblNoticeTwo.setBounds(99, 39, 548, 46);
		frmFarmiza.getContentPane().add(lblNoticeTwo);
		
		JButton btnClose = new JButton("CLOSE");
		btnClose.setBackground(new Color(153, 204, 51));
		btnClose.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		btnClose.setBounds(311, 126, 115, 42);
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				frmFarmiza.dispose();
			}
		});
		frmFarmiza.getContentPane().add(btnClose);
		
		lblBackground = new JLabel("");
		lblBackground.setBounds(-11, -169, 748, 407);
		frmFarmiza.getContentPane().add(lblBackground);
		setBackgr();
	}
	
	/**
	 * Sets the background image for the frame.
	 */
	private void setBackgr() {
		ImageIcon path = new ImageIcon(GameEnvironmentPanel.class.getResource("../images/drought.jpg"));
		Image imageGet = path.getImage();
		Image imageSize = imageGet.getScaledInstance(lblBackground.getWidth(), lblBackground.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image = new ImageIcon(imageSize);
		lblBackground.setIcon(image);
	}

}
