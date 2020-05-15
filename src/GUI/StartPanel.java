package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

import gui.setUp.SelectDaysPanel;

public class StartPanel {

	private JFrame frmFarmiza;

	/**
	 * Launch the application.
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
		
		JLabel lblFarmiza = new JLabel("Farmiza");
		lblFarmiza.setHorizontalAlignment(SwingConstants.CENTER);
		lblFarmiza.setFont(new Font("Gabbaland", Font.BOLD, 90));
		lblFarmiza.setBounds(10, 21, 764, 155);
		frmFarmiza.getContentPane().add(lblFarmiza);
		

		JButton btnPlay = new JButton("Play");
		btnPlay.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		btnPlay.setBounds(129, 362, 525, 64);
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				SelectDaysPanel newPanel = new SelectDaysPanel();
				frmFarmiza.dispose();
				newPanel.ActivatePanel();
			}
		});
		frmFarmiza.getContentPane().add(btnPlay);

		
		JButton btnQuit = new JButton("Quit");
		btnQuit.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		btnQuit.setBounds(129, 436, 525, 66);
		btnQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				frmFarmiza.dispose();
			}
		});
		frmFarmiza.getContentPane().add(btnQuit);
	}
}
