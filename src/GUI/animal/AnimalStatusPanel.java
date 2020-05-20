package gui.animal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;


import javax.swing.SwingConstants;

import animal.Animal;
import gui.GameEnvironmentPanel;
import java.awt.Color;

public class AnimalStatusPanel {
	
	/**
	 * The animal the player has selected to view the status of
	 */
	public Animal animal;

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
		frmFarmiza.setResizable(false);
		
		JLabel lblAnimalStatus = new JLabel("Animal Status");
		lblAnimalStatus.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnimalStatus.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 24));
		lblAnimalStatus.setBounds(70, 7, 304, 40);
		frmFarmiza.getContentPane().add(lblAnimalStatus);
		
		JLabel lblAnimalSelected = new JLabel("Animal selected: " + animal.getName());
		lblAnimalSelected.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblAnimalSelected.setBounds(22, 47, 304, 33);
		frmFarmiza.getContentPane().add(lblAnimalSelected);
		
		JLabel lblHealth = new JLabel("Health: "+ animal.getHealth() + "/" + animal.getMaxHealth());
		lblHealth.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblHealth.setBounds(24, 78, 273, 33);
		frmFarmiza.getContentPane().add(lblHealth);
		
		JLabel lblHappiness = new JLabel("Happiness: " + animal.getHappiness() + "/" + animal.getMaxHappiness());
		lblHappiness.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblHappiness.setBounds(26, 110, 304, 33);
		frmFarmiza.getContentPane().add(lblHappiness);
		
		JLabel lblBackDrop = new JLabel("");
		lblBackDrop.setOpaque(true);
		lblBackDrop.setBackground(new Color(153, 204, 51));
		lblBackDrop.setBounds(10, 47, 287, 96);
		frmFarmiza.getContentPane().add(lblBackDrop);
		
		JButton btnClose = new JButton("CLOSE");
		btnClose.setBackground(new Color(153, 204, 51));
		btnClose.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		btnClose.setBounds(165, 151, 113, 42);
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				frmFarmiza.dispose();
			}
		});
		frmFarmiza.getContentPane().add(btnClose);
		
		lblFieldImage = new JLabel("");
		lblFieldImage.setBounds(-56, 0, 580, 323);
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
