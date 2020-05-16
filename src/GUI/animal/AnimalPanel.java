package gui.animal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gameEnvironment.GameState;
import gui.GameEnvironmentPanel;


public class AnimalPanel {
	
	public GameState state;

	private JFrame frmFarmiza;

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
	public AnimalPanel(GameState tempState) {
		state = tempState;
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
		
		JLabel lblFarmAnimals = new JLabel("FARM ANIMALS");
		lblFarmAnimals.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 35));
		lblFarmAnimals.setBounds(251, 11, 282, 52);
		frmFarmiza.getContentPane().add(lblFarmAnimals);
		
		JButton btnFeedAnimals = new JButton("FEED ANIMALS");
		btnFeedAnimals.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnFeedAnimals.setBounds(58, 203, 176, 64);
		btnFeedAnimals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				new FeedAnimalPanel(state);
				frmFarmiza.dispose();
			}
		});
		frmFarmiza.getContentPane().add(btnFeedAnimals);
		
		JButton btnPlayWithAnimals = new JButton("PLAY WITH ANIMALS");
		btnPlayWithAnimals.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		btnPlayWithAnimals.setBounds(298, 205, 176, 64);
		btnPlayWithAnimals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				new PlayWithAnimalsPanel(state);
				frmFarmiza.dispose();
			}
		});
		frmFarmiza.getContentPane().add(btnPlayWithAnimals);
		
		JButton btnAnimalInventory = new JButton("ANIMAL INVENTORY");
		btnAnimalInventory.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		btnAnimalInventory.setBounds(537, 205, 176, 64);
		btnAnimalInventory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				new AnimalInventoryPanel(state);
				frmFarmiza.dispose();
			}
		});
		frmFarmiza.getContentPane().add(btnAnimalInventory);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btnBack.setBounds(336, 455, 111, 45);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				new GameEnvironmentPanel(state);
				frmFarmiza.dispose();
			}
		});
		frmFarmiza.getContentPane().add(btnBack);

	}
}
