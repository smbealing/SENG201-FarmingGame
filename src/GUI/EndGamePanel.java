package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.SwingConstants;

import gui.setUp.SelectDaysPanel;

public class EndGamePanel {

	private JFrame frmFarmiza;

	/**
	 * Launch the application.
	 */
	public void ActivatePanel() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EndGamePanel window = new EndGamePanel();
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
	public EndGamePanel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFarmiza = new JFrame();
		frmFarmiza.setTitle("Farmiza");
		frmFarmiza.setBounds(100, 100, 800, 550);
		frmFarmiza.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFarmiza.getContentPane().setLayout(null);
		
		JLabel lblFarmer = new JLabel("Farmer:");
		lblFarmer.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblFarmer.setBounds(20, 11, 77, 35);
		frmFarmiza.getContentPane().add(lblFarmer);
		
		JLabel lblGameDuration = new JLabel("Game duration:");
		lblGameDuration.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblGameDuration.setBounds(282, 11, 143, 35);
		frmFarmiza.getContentPane().add(lblGameDuration);
		
		JLabel lblProfitMade = new JLabel("Profit made:");
		lblProfitMade.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblProfitMade.setBounds(548, 11, 183, 35);
		frmFarmiza.getContentPane().add(lblProfitMade);
		
		JLabel lblYourFinalScore = new JLabel("Your final score is:");
		lblYourFinalScore.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblYourFinalScore.setBounds(20, 102, 183, 35);
		frmFarmiza.getContentPane().add(lblYourFinalScore);
		
		JLabel lblScore = new JLabel("0000");
		lblScore.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblScore.setBounds(213, 102, 183, 35);
		frmFarmiza.getContentPane().add(lblScore);
		
		JLabel lblMessageAboutScore = new JLabel("Message about score here");
		lblMessageAboutScore.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblMessageAboutScore.setBounds(22, 148, 739, 83);
		frmFarmiza.getContentPane().add(lblMessageAboutScore);
		
		JButton btnQuit = new JButton("Quit");
		btnQuit.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		btnQuit.setBounds(129, 435, 525, 65);
		btnQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				frmFarmiza.dispose();
			}
		});
		frmFarmiza.getContentPane().add(btnQuit);
		
		JButton btnPlayAgain = new JButton("Play Again");
		btnPlayAgain.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		btnPlayAgain.setBounds(129, 359, 525, 65);
		btnPlayAgain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				SelectDaysPanel newPanel = new SelectDaysPanel();
				frmFarmiza.dispose();
				newPanel.ActivatePanel();
			}
		});
		frmFarmiza.getContentPane().add(btnPlayAgain);
		
		JLabel lblFarmerName = new JLabel("xxxxxxxxxxxxxxx");
		lblFarmerName.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblFarmerName.setBounds(101, 11, 171, 35);
		frmFarmiza.getContentPane().add(lblFarmerName);
		
		JLabel lblDays = new JLabel("0 days");
		lblDays.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblDays.setBounds(429, 11, 84, 35);
		frmFarmiza.getContentPane().add(lblDays);
		
		JLabel lblProfit = new JLabel("$0.00");
		lblProfit.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblProfit.setBounds(665, 11, 94, 35);
		frmFarmiza.getContentPane().add(lblProfit);
		
		JLabel lblThankYou = new JLabel("Thank you for playing Farmiza!");
		lblThankYou.setHorizontalAlignment(SwingConstants.CENTER);
		lblThankYou.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblThankYou.setBounds(22, 277, 739, 71);
		frmFarmiza.getContentPane().add(lblThankYou);
	}
}
