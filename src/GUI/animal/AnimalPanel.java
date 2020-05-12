package gui.animal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.SwingConstants;

import gameEnvironment.GameState;
import gui.crop.CropInventoryPanel;

public class AnimalPanel {
	
	public GameState state;

	private JFrame frmFarmiza;

	/**
	 * Launch the application.
	 */
	public void ActivatePanel(final GameState tempState) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
<<<<<<< Updated upstream
					AnimalPanel window = new AnimalPanel();
=======
					state = tempState;
					AnimalPanel window = new AnimalPanel(state);
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
	public AnimalPanel() {
		
=======
	public AnimalPanel(GameState tempState) {
>>>>>>> Stashed changes
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
		
		JLabel lblFarmAnimals = new JLabel("FARM ANIMALS");
		lblFarmAnimals.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 35));
		lblFarmAnimals.setBounds(251, 11, 282, 52);
		frmFarmiza.getContentPane().add(lblFarmAnimals);
		
		JButton btnFeedAnimals = new JButton("FEED ANIMALS");
		btnFeedAnimals.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnFeedAnimals.setBounds(10, 111, 176, 64);
		btnFeedAnimals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				FeedAnimalPanel newPanel = new FeedAnimalPanel();
				newPanel.ActivatePanel(state);
			}
		});
		frmFarmiza.getContentPane().add(btnFeedAnimals);
		
		JButton btnPlayWithAnimals = new JButton("PLAY WITH ANIMALS");
		btnPlayWithAnimals.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		btnPlayWithAnimals.setBounds(10, 186, 176, 64);
		btnPlayWithAnimals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				PlayWithAnimalsPanel newPanel = new PlayWithAnimalsPanel();
				newPanel.ActivatePanel(state);
			}
		});
		frmFarmiza.getContentPane().add(btnPlayWithAnimals);
		
		JButton btnAnimalInventory = new JButton("ANIMAL INVENTORY");
		btnAnimalInventory.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		btnAnimalInventory.setBounds(10, 261, 176, 64);
		btnAnimalInventory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				AnimalInventoryPanel newPanel = new AnimalInventoryPanel();
				newPanel.ActivatePanel(state);
			}
		});
		frmFarmiza.getContentPane().add(btnAnimalInventory);
		
		JLabel lblanimalImage = new JLabel("[animal image]");
		lblanimalImage.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		lblanimalImage.setHorizontalAlignment(SwingConstants.CENTER);

		lblanimalImage.setBounds(220, 87, 532, 353);
		frmFarmiza.getContentPane().add(lblanimalImage);

		lblanimalImage.setBounds(230, 81, 532, 353);
		frmFarmiza.getContentPane().add(lblanimalImage);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btnBack.setBounds(336, 455, 111, 45);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				frmFarmiza.dispose();
			}
		});
		frmFarmiza.getContentPane().add(btnBack);

	}
}
