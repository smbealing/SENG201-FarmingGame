package gui.randomEvent;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.SwingConstants;

import gui.GameEnvironmentPanel;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class CountyFairPanel {

	private JFrame frmFarmiza;
	private JLabel lblBackground;
	private JLabel lblBackground2;

	/**
	 * Launch the application.
	 */
	public void ActivatePanel() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CountyFairPanel window = new CountyFairPanel();
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
	public CountyFairPanel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFarmiza = new JFrame();
		frmFarmiza.setTitle("Farmiza");
		frmFarmiza.setBounds(100, 100, 644, 240);
		frmFarmiza.setIconImage(Toolkit.getDefaultToolkit().getImage(GameEnvironmentPanel.class.getResource("../images/logo.jpg")));
		frmFarmiza.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFarmiza.getContentPane().setLayout(null);
		frmFarmiza.setResizable(false);
		
		JLabel lblNoticeOne = new JLabel("Congratulations!");
		lblNoticeOne.setBackground(new Color(0, 0, 51));
		lblNoticeOne.setForeground(new Color(255, 255, 255));
		lblNoticeOne.setHorizontalAlignment(SwingConstants.CENTER);
		lblNoticeOne.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 28));
		lblNoticeOne.setOpaque(true);
		lblNoticeOne.setBounds(157, 11, 324, 46);
		frmFarmiza.getContentPane().add(lblNoticeOne);
		
		JLabel lblNoticeTwo = new JLabel("Your farm has won the top award at the annual County Fair!");
		lblNoticeTwo.setBackground(new Color(0, 0, 51));
		lblNoticeTwo.setForeground(new Color(255, 255, 255));
		lblNoticeTwo.setHorizontalAlignment(SwingConstants.CENTER);
		lblNoticeTwo.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblNoticeTwo.setOpaque(true);
		lblNoticeTwo.setBounds(15, 50, 607, 46);
		frmFarmiza.getContentPane().add(lblNoticeTwo);
		
		JButton btnClose = new JButton("CLOSE");
		btnClose.setForeground(new Color(255, 255, 255));
		btnClose.setBackground(new Color(0, 0, 128));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				frmFarmiza.dispose();
			}
		});
		btnClose.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		btnClose.setBounds(261, 154, 116, 46);
		frmFarmiza.getContentPane().add(btnClose);
		
		lblBackground = new JLabel("");
		lblBackground.setBounds(-23, -3, 338, 272);
		frmFarmiza.getContentPane().add(lblBackground);
		
		lblBackground2 = new JLabel("");
		lblBackground2.setBounds(312, -12, 362, 293);
		frmFarmiza.getContentPane().add(lblBackground2);
		setBackgr();
	}
	
	/**
	 * Sets the background image for the frame.
	 */
	private void setBackgr() {
		ImageIcon path = new ImageIcon(GameEnvironmentPanel.class.getResource("../images/county_fair.jpg"));
		Image imageGet = path.getImage();
		Image imageSize = imageGet.getScaledInstance(lblBackground.getWidth(), lblBackground.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image = new ImageIcon(imageSize);
		lblBackground.setIcon(image);
		lblBackground2.setIcon(image);
	}

}
