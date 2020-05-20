package gui.animal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import gameEnvironment.GameState;
import gui.GameEnvironmentPanel;
import java.awt.Color;


public class AnimalPanel {
	
	/**
	 * The game's GameState
	 */
	public GameState state;

	private JFrame frmFarmiza;
	private JLabel lblFieldImage;

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
	 * @param state  the current GameState
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
		frmFarmiza.setResizable(false);
		
		JLabel lblFarmAnimals = new JLabel("FARM ANIMALS");
		lblFarmAnimals.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 35));
		lblFarmAnimals.setBounds(238, 11, 318, 52);
		frmFarmiza.getContentPane().add(lblFarmAnimals);
		
		JButton btnFeedAnimals = new JButton("FEED ANIMALS");
		btnFeedAnimals.setBackground(new Color(153, 204, 51));
		btnFeedAnimals.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnFeedAnimals.setBounds(58, 203, 176, 64);
		btnFeedAnimals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if (state.animals.size() == 0) {
					new NoAnimalWarningPanel();
				} else {
					new FeedAnimalPanel(state);
				}
			}
		});
		frmFarmiza.getContentPane().add(btnFeedAnimals);
		
		JButton btnPlayWithAnimals = new JButton("PLAY WITH ANIMALS");
		btnPlayWithAnimals.setBackground(new Color(153, 204, 51));
		btnPlayWithAnimals.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		btnPlayWithAnimals.setBounds(299, 203, 195, 64);
		btnPlayWithAnimals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if (state.animals.size() == 0) {
					new NoAnimalWarningPanel();
				} else {
					new PlayWithAnimalsPanel(state);
				}
			}
		});
		frmFarmiza.getContentPane().add(btnPlayWithAnimals);
		
		JButton btnAnimalInventory = new JButton("ANIMAL INVENTORY");
		btnAnimalInventory.setBackground(new Color(153, 204, 51));
		btnAnimalInventory.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		btnAnimalInventory.setBounds(543, 203, 195, 64);
		btnAnimalInventory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				new AnimalInventoryPanel(state);
				frmFarmiza.dispose();
			}
		});
		frmFarmiza.getContentPane().add(btnAnimalInventory);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setBackground(new Color(153, 204, 51));
		btnBack.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		btnBack.setBounds(341, 455, 111, 45);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				new GameEnvironmentPanel(state);
				frmFarmiza.dispose();
			}
		});
		frmFarmiza.getContentPane().add(btnBack);
		
		lblFieldImage = new JLabel("");
		lblFieldImage.setBounds(-56, 0, 890, 584);
		frmFarmiza.getContentPane().add(lblFieldImage);
		setBackgr();
	}
	
	private void setBackgr() {
		ImageIcon path = new ImageIcon(GameEnvironmentPanel.class.getResource("../images/animals.jpg"));
		Image imageGet = path.getImage();
		Image imageSize = imageGet.getScaledInstance(lblFieldImage.getWidth(), lblFieldImage.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image = new ImageIcon(imageSize);
		lblFieldImage.setIcon(image);
	}
}
