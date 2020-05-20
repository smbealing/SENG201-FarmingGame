package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.SwingConstants;

import animal.Animal;
import gameEnvironment.GameState;
import gui.setUp.SelectDaysPanel;

public class EndGamePanel {

	private JFrame frmFarmiza;
	
	
	/**
	 * Stores the game's GameState
	 */
	public GameState state;
	
	/**
	 * Stores the profit made by the player
	 */
	private double profit;
	
	/**
	 * Stores the player's score
	 */
	private int score;
	
	/**
	 * Stores a message about the score to 
	 * tell the player how well they did
	 */
	private String scoreMessage;
	
	

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
	 * @param tempState  the current GameState
	 */
	public EndGamePanel(GameState tempState) {
		state = tempState;
		
		profit = state.totalMoney - 50.00;
		
		score = state.totalDays + state.crops.size() ;
		for (Animal animal : state.animals) {
			score += animal.getHappiness();
			score += animal.getHealth();
		}
		score += state.totalMoney;
		
		if (score < 60) {
				scoreMessage = "You've done a terrible job of looking after your farm.";
			} else if (score < 150) {
				scoreMessage = "Next time you should try to do a better job of looking after your farm.";
			} else if (score < 250) {
				scoreMessage = "Well done! You've looked after your farm well.";
			} else {
				scoreMessage = "Wow! You're a fantastic farmer.";
			}

		initialize();
		ActivatePanel();
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
		
		JLabel lblFarmer = new JLabel("Farmer: " + state.farmer.getName());
		lblFarmer.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblFarmer.setBounds(20, 11, 252, 35);
		frmFarmiza.getContentPane().add(lblFarmer);
		
		JLabel lblGameDuration = new JLabel("Game duration: " + state.totalDays + " days");
		lblGameDuration.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblGameDuration.setBounds(264, 11, 239, 35);
		frmFarmiza.getContentPane().add(lblGameDuration);
		
		JLabel lblProfitMade = new JLabel("Profit made: $" + String.format("%.2f", profit));
		lblProfitMade.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblProfitMade.setBounds(536, 11, 225, 35);
		frmFarmiza.getContentPane().add(lblProfitMade);
		
		JLabel lblYourFinalScore = new JLabel("Your final score is: " + score);
		lblYourFinalScore.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblYourFinalScore.setBounds(20, 102, 405, 35);
		frmFarmiza.getContentPane().add(lblYourFinalScore);
		
		JLabel lblMessageAboutScore = new JLabel(scoreMessage);
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
		
		JLabel lblThankYou = new JLabel("Thank you for playing Farmiza!");
		lblThankYou.setHorizontalAlignment(SwingConstants.CENTER);
		lblThankYou.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblThankYou.setBounds(22, 277, 739, 71);
		frmFarmiza.getContentPane().add(lblThankYou);
	}
}
