package gui.animal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;


import javax.swing.SwingConstants;

import animal.Animal;
import gui.GameEnvironmentPanel;

public class AnimalStatusPanel {
	
	/**
	 * The animal the player has selected to view the status of
	 */
	public Animal animal;

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
	 * @param tempAnimal  the selected animal (Animal)
	 */
	public AnimalStatusPanel(Animal tempAnimal) {
		animal = tempAnimal;
		initialize();
		ActivatePanel();

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFarmiza = new JFrame();
		frmFarmiza.setTitle("Farmiza");
		frmFarmiza.setBounds(100, 100,  450, 243);
		frmFarmiza.setIconImage(Toolkit.getDefaultToolkit().getImage(GameEnvironmentPanel.class.getResource("../images/logo.jpg")));
		frmFarmiza.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFarmiza.getContentPane().setLayout(null);
		
		JLabel lblAnimalStatus = new JLabel("Animal Status");
		lblAnimalStatus.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnimalStatus.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblAnimalStatus.setBounds(54, 0, 304, 33);
		frmFarmiza.getContentPane().add(lblAnimalStatus);
		
		JLabel lblAnimalSelected = new JLabel("Animal selected: " + animal.getName());
		lblAnimalSelected.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		lblAnimalSelected.setBounds(64, 44, 304, 33);
		frmFarmiza.getContentPane().add(lblAnimalSelected);
		
		JLabel lblHealth = new JLabel("Health: "+ animal.getHealth() + "/" + animal.getMaxHealth());
		lblHealth.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		lblHealth.setBounds(62, 75, 273, 33);
		frmFarmiza.getContentPane().add(lblHealth);
		
		JLabel lblHappiness = new JLabel("Happiness: " + animal.getHappiness() + "/" + animal.getMaxHappiness());
		lblHappiness.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		lblHappiness.setBounds(64, 107, 304, 33);
		frmFarmiza.getContentPane().add(lblHappiness);
		
		
		
		JButton btnClose = new JButton("CLOSE");
		btnClose.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
		btnClose.setBounds(160, 160, 111, 33);
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {

//				GameEnvironmentPanel newPanel = new GameEnvironmentPanel();
				frmFarmiza.dispose();
//				newPanel.ActivatePanel();
			}
		});
		frmFarmiza.getContentPane().add(btnClose);
	}

}
