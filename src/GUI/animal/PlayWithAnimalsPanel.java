package gui.animal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;

import gameEnvironment.GameState;

import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

public class PlayWithAnimalsPanel {
	
	public GameState state;

	private JFrame frmFarmiza;

	/**
	 * Launch the application.
	 */
	public void ActivatePanel(final GameState state) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PlayWithAnimalsPanel window = new PlayWithAnimalsPanel();
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
	public PlayWithAnimalsPanel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFarmiza = new JFrame();
		frmFarmiza.setTitle("Farmiza");
		frmFarmiza.setBounds(100, 100, 576, 335);
		frmFarmiza.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFarmiza.getContentPane().setLayout(null);
		
		JLabel lblPrompt = new JLabel("How would you like to play with your animals?");
		lblPrompt.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrompt.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblPrompt.setBounds(25, 23, 510, 35);
		frmFarmiza.getContentPane().add(lblPrompt);
		
		JComboBox<String> cmbAnimalPlaySelection = new JComboBox<String>();
		cmbAnimalPlaySelection.setModel(new DefaultComboBoxModel<String>(new String[] {"Speak to Animal", "Give Animal Warmth"}));
		cmbAnimalPlaySelection.setSelectedIndex(0);
		cmbAnimalPlaySelection.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		cmbAnimalPlaySelection.setBounds(77, 98, 405, 41);
		frmFarmiza.getContentPane().add(cmbAnimalPlaySelection);
		
		JButton btnPlayWithAnimals = new JButton("PLAY WITH ANIMALS");
		btnPlayWithAnimals.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnPlayWithAnimals.setBounds(182, 240, 195, 45);
		btnPlayWithAnimals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				//TODO: use selected item to increase animal happiness
				frmFarmiza.dispose();
			}
		});
		frmFarmiza.getContentPane().add(btnPlayWithAnimals);
	}

}
