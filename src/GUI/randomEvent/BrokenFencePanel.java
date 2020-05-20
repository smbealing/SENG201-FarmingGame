package gui.randomEvent;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import gui.GameEnvironmentPanel;

import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class BrokenFencePanel {

	private JFrame frmFarmiza;
	private JLabel lblBackground;

	/**
	 * Launch the application.
	 */
	public void ActivatePanel() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BrokenFencePanel window = new BrokenFencePanel();
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
	public BrokenFencePanel() {
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
		
		JLabel lblNoticeOne = new JLabel("Oh no! Your fence broke!");
		lblNoticeOne.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblNoticeOne.setHorizontalAlignment(SwingConstants.CENTER);
		lblNoticeOne.setBounds(60, 0, 324, 37);
		frmFarmiza.getContentPane().add(lblNoticeOne);
		
		JLabel lblNoticeTwo = new JLabel("Some of your animals escaped!");
		lblNoticeTwo.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblNoticeTwo.setHorizontalAlignment(SwingConstants.CENTER);
		lblNoticeTwo.setBounds(18, 30, 408, 46);
		frmFarmiza.getContentPane().add(lblNoticeTwo);
		
		JButton btnClose = new JButton("CLOSE");
		btnClose.setBackground(new Color(153, 204, 51));
		btnClose.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		btnClose.setBounds(162, 157, 119, 46);
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				frmFarmiza.dispose();
			}
		});
		frmFarmiza.getContentPane().add(btnClose);
		
		lblBackground = new JLabel("");
		lblBackground.setBounds(0, 0, 444, 214);
		frmFarmiza.getContentPane().add(lblBackground);
		setBackgr();
	}
	
	
	/**
	 * Sets the background image for the frame.
	 */
	private void setBackgr() {
		ImageIcon path = new ImageIcon(GameEnvironmentPanel.class.getResource("../images/broken_fence.jpg"));
		Image imageGet = path.getImage();
		Image imageSize = imageGet.getScaledInstance(lblBackground.getWidth(), lblBackground.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image = new ImageIcon(imageSize);
		lblBackground.setIcon(image);
	}

}
