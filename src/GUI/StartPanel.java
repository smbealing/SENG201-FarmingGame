package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

import gui.setUp.SelectDaysPanel;
import java.awt.Color;

public class StartPanel {

	private JFrame frmFarmiza;
	private JLabel lblBackgr;

	/**
	 * Launch the application. 
	 * Starts the game.
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
		frmFarmiza.setBounds(100, 100, 800, 550);
		frmFarmiza.setIconImage(Toolkit.getDefaultToolkit().getImage(GameEnvironmentPanel.class.getResource("../images/logo.jpg")));
		frmFarmiza.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFarmiza.getContentPane().setLayout(null);
		frmFarmiza.setResizable(false);
		
		JLabel lblFarmiza = new JLabel("Farmiza");
		lblFarmiza.setHorizontalAlignment(SwingConstants.CENTER);
		lblFarmiza.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 90));
		lblFarmiza.setBounds(15, 21, 764, 155);
		frmFarmiza.getContentPane().add(lblFarmiza);
		

		JButton btnPlay = new JButton("Play");
		btnPlay.setBackground(new Color(153, 204, 0));
		btnPlay.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		btnPlay.setBounds(134, 362, 525, 64);
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				SelectDaysPanel newPanel = new SelectDaysPanel();
				frmFarmiza.dispose();
				newPanel.ActivatePanel();
			}
		});
		frmFarmiza.getContentPane().add(btnPlay);

		
		JButton btnQuit = new JButton("Quit");
		btnQuit.setBackground(new Color(153, 204, 0));
		btnQuit.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		btnQuit.setBounds(134, 436, 525, 66);
		btnQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				frmFarmiza.dispose();
			}
		});
		frmFarmiza.getContentPane().add(btnQuit);
		
		lblBackgr = new JLabel("");
		lblBackgr.setBounds(0, 0, 794, 521);
		frmFarmiza.getContentPane().add(lblBackgr);
		setBackgr();
	}
	
	/**
	 * Sets the background image for the frame.
	 */
	private void setBackgr() {
		ImageIcon path = new ImageIcon(GameEnvironmentPanel.class.getResource("../images/set_up.jpg"));
		Image imageGet = path.getImage();
		Image imageSize = imageGet.getScaledInstance(lblBackgr.getWidth(), lblBackgr.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image = new ImageIcon(imageSize);
		lblBackgr.setIcon(image);
	}
}
