package gui.animal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.SwingConstants;

import animal.Animal;
import gameEnvironment.GameState;
import gui.GameEnvironmentPanel;
import gui.farmer.FarmerWarningPanel;
import item.Speech;
import item.Warmth;

import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.Color;

public class PlayWithAnimalsPanel {
	
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
	 * @param tempState  the current GameState
	 */
	public PlayWithAnimalsPanel(GameState tempState) {
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
		frmFarmiza.setBounds(100, 100, 576, 234);
		frmFarmiza.setIconImage(Toolkit.getDefaultToolkit().getImage(GameEnvironmentPanel.class.getResource("../images/logo.jpg")));
		frmFarmiza.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFarmiza.getContentPane().setLayout(null);
		frmFarmiza.setResizable(false);
		
		JLabel lblPrompt = new JLabel("How would you like to play with your animals?");
		lblPrompt.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrompt.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 22));
		lblPrompt.setBounds(25, 23, 510, 35);
		frmFarmiza.getContentPane().add(lblPrompt);
		
		final JComboBox<String> cmbAnimalPlaySelection = new JComboBox<String>();
		cmbAnimalPlaySelection.setBackground(new Color(153, 204, 51));
		cmbAnimalPlaySelection.setModel(new DefaultComboBoxModel<String>(new String[] {"Speak to Animal", "Give Animal Warmth $20.00"}));
		cmbAnimalPlaySelection.setSelectedIndex(0);
		cmbAnimalPlaySelection.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		cmbAnimalPlaySelection.setBounds(77, 77, 405, 41);
		frmFarmiza.getContentPane().add(cmbAnimalPlaySelection);
		
		JButton btnPlayWithAnimals = new JButton("PLAY WITH ANIMALS");
		btnPlayWithAnimals.setBackground(new Color(153, 204, 51));
		btnPlayWithAnimals.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		btnPlayWithAnimals.setBounds(104, 139, 195, 45);
		btnPlayWithAnimals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if (state.farmer.getActionCount() != 0) {
					switch (cmbAnimalPlaySelection.getSelectedIndex()) {
					case 0:
						//Speech
						for (Animal animal : state.animals) {
							animal.increaseHappiness(new Speech().getGeneralBoost());
						}
						state.farmer.reduceActionCount();
						frmFarmiza.dispose();
						break;
					case 1:
						//Warmth
						double warmthCost = new Warmth().getPurchasingPrice();
						if ((state.totalMoney - warmthCost) > 0.00) {
							state.totalMoney -= warmthCost;
							for (Animal animal : state.animals) {
								animal.increaseHappiness(new Warmth().getGeneralBoost());
							}
							state.farmer.reduceActionCount();
							frmFarmiza.dispose();
							
						} else {
							new AnimalWarmthWarningPanel();
						}
						
					}
				} else {
					new FarmerWarningPanel(state);
				}
				
			}
		});
		frmFarmiza.getContentPane().add(btnPlayWithAnimals);
		
		JButton btnClose = new JButton("CLOSE");
		btnClose.setBackground(new Color(153, 204, 51));
		btnClose.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		btnClose.setBounds(314, 139, 118, 45);
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				frmFarmiza.dispose();
			}
		});
		frmFarmiza.getContentPane().add(btnClose);
		
		lblFieldImage = new JLabel("");
		lblFieldImage.setBounds(-2, -3, 572, 323);
		frmFarmiza.getContentPane().add(lblFieldImage);
		setBackgr();
	}
	
	/**
	 * Sets the background image for the frame.
	 */
	private void setBackgr() {
		ImageIcon path = new ImageIcon(GameEnvironmentPanel.class.getResource("../images/animals.jpg"));
		Image imageGet = path.getImage();
		Image imageSize = imageGet.getScaledInstance(lblFieldImage.getWidth(), lblFieldImage.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image = new ImageIcon(imageSize);
		lblFieldImage.setIcon(image);
	}

}
