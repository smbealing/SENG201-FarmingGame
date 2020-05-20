package gui.animal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;


import gameEnvironment.GameState;
import gui.GameEnvironmentPanel;
import item.AnimalFood;
import animal.Animal;


import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import java.awt.Color;

public class AnimalInventoryPanel {
	
	
	/**
	 * The game's GameState
	 */
	public GameState state;
	
	/**
	 * The animal the player selects to view the status of.
	 */
	public Animal selectedAnimal;
	
	/**
	 * The animal name (type) of the animal the player selects to view the status of.
	 */
	public String animalName;
	
	/**
	 * The options displayed to the player 
	 * containing all the animals available of a selected type.
	 */
	private String animals = "";

	private JFrame frmFarmiza;
	private JLabel lblFieldImage;
	private JRadioButton btnSelectCow;
	private JRadioButton btnSelectHorse;
	private JRadioButton btnSelectSheep;
	private static JComboBox<String> cmbSelectedAnimal;

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
	public AnimalInventoryPanel(GameState tempState) {
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
		
		JLabel lblAnimalInventory = new JLabel("ANIMAL INVENTORY");
		lblAnimalInventory.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnimalInventory.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
		lblAnimalInventory.setBounds(251, 11, 291, 35);
		frmFarmiza.getContentPane().add(lblAnimalInventory);
		
		JLabel lblCows = new JLabel("Cows");
		lblCows.setHorizontalAlignment(SwingConstants.CENTER);
		lblCows.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblCows.setBounds(33, 84, 111, 35);
		frmFarmiza.getContentPane().add(lblCows);
		
		JLabel lblHorses = new JLabel("Horses");
		lblHorses.setHorizontalAlignment(SwingConstants.CENTER);
		lblHorses.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblHorses.setBounds(179, 84, 85, 35);
		frmFarmiza.getContentPane().add(lblHorses);
		
		JLabel lblSheep = new JLabel("Sheep");
		lblSheep.setHorizontalAlignment(SwingConstants.CENTER);
		lblSheep.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblSheep.setBounds(115, 163, 80, 35);
		frmFarmiza.getContentPane().add(lblSheep);
		
		btnSelectCow = new JRadioButton("SELECT");
		btnSelectCow.setBackground(new Color(153, 204, 51));
		btnSelectCow.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnSelectCow.setBounds(51, 121, 89, 25);
		btnSelectCow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				getOptions();
			}
		});
		frmFarmiza.getContentPane().add(btnSelectCow);
		
		
		btnSelectHorse = new JRadioButton("SELECT");
		btnSelectHorse.setBackground(new Color(153, 204, 51));
		btnSelectHorse.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnSelectHorse.setBounds(179, 120, 89, 25);
		btnSelectHorse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				getOptions();
			}
		});
		frmFarmiza.getContentPane().add(btnSelectHorse);	
		
		btnSelectSheep = new JRadioButton("SELECT");
		btnSelectSheep.setBackground(new Color(153, 204, 51));
		btnSelectSheep.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnSelectSheep.setBounds(115, 197, 89, 25);
		btnSelectSheep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				getOptions();
			}
		});
		frmFarmiza.getContentPane().add(btnSelectSheep);
		
		JLabel lblSelect = new JLabel("Select an animal to view its status");
		lblSelect.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelect.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblSelect.setBounds(364, 84, 403, 35);
		frmFarmiza.getContentPane().add(lblSelect);
		
		ButtonGroup animalGroupButton = new ButtonGroup();
		animalGroupButton.add(btnSelectCow);
		animalGroupButton.add(btnSelectHorse);
		animalGroupButton.add(btnSelectSheep);

		cmbSelectedAnimal = new JComboBox<String>();
		cmbSelectedAnimal.setBackground(new Color(153, 204, 51));
		cmbSelectedAnimal.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		cmbSelectedAnimal.setBounds(485, 122, 192, 41);
		frmFarmiza.getContentPane().add(cmbSelectedAnimal);
		
		JLabel lblAnimalFood = new JLabel("Animal Food Available");
		lblAnimalFood.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnimalFood.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblAnimalFood.setBounds(472, 254, 242, 35);
		frmFarmiza.getContentPane().add(lblAnimalFood);
		
		JLabel lblCarrotsLeft = new JLabel("Carrots : " + getCarrotCount());
		lblCarrotsLeft.setHorizontalAlignment(SwingConstants.LEFT);
		lblCarrotsLeft.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
		lblCarrotsLeft.setBounds(494, 289, 140, 35);
		frmFarmiza.getContentPane().add(lblCarrotsLeft);
		
		JLabel lblGrainLeft = new JLabel("Grain : "  + getGrainCount());
		lblGrainLeft.setHorizontalAlignment(SwingConstants.LEFT);
		lblGrainLeft.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
		lblGrainLeft.setBounds(494, 325, 140, 35);
		frmFarmiza.getContentPane().add(lblGrainLeft);

		
		JLabel lblHighQualityGrainLeft = new JLabel("High Quality Grain : "  + getHighQualityGrainCount());
		lblHighQualityGrainLeft.setHorizontalAlignment(SwingConstants.LEFT);
		lblHighQualityGrainLeft.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
		lblHighQualityGrainLeft.setBounds(495, 360, 192, 35);
		frmFarmiza.getContentPane().add(lblHighQualityGrainLeft);
		
		JButton btnCheckStatus = new JButton("CHECK STATUS");
		btnCheckStatus.setBackground(new Color(153, 204, 51));
		btnCheckStatus.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		btnCheckStatus.setBounds(491, 174, 182, 35);
		btnCheckStatus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if (animals != "") {
					getAnimal(cmbSelectedAnimal.getSelectedIndex());
					new AnimalStatusPanel(selectedAnimal);
				} else {
					new AnimalWarningPanel();
				}
			}
		});
		frmFarmiza.getContentPane().add(btnCheckStatus);
		
		JLabel lblBackDrop = new JLabel("");
		lblBackDrop.setOpaque(true);
		lblBackDrop.setBackground(new Color(153, 204, 51));
		lblBackDrop.setBounds(456, 254, 280, 141);
		frmFarmiza.getContentPane().add(lblBackDrop);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setBackground(new Color(153, 204, 51));
		btnBack.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		btnBack.setBounds(341, 455, 111, 45);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				new AnimalPanel(state);
				frmFarmiza.dispose();
			}
		});
		frmFarmiza.getContentPane().add(btnBack);
		
		lblFieldImage = new JLabel("");
		lblFieldImage.setBounds(-56, 0, 888, 584);
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
	
	/**
	 * Handles the selection of a type of animal
	 */
	private void getOptions() {
		animals = "";
		
		if (btnSelectCow.isSelected()) {
			animalName = "Cow";
			animals = getAnimalString();
		} else if (btnSelectHorse.isSelected()) {
			animalName = "Horse";
			animals = getAnimalString();
		} else if (btnSelectSheep.isSelected()) {
			animalName = "Sheep";
			animals = getAnimalString();
		} 
		cmbSelectedAnimal.setModel(new DefaultComboBoxModel<String>(animals.split(",")));
	}
	
	
	/**
	 * Fills the String of options displayed to player with animals of their selected type.
	 */
	private String getAnimalString() {
		String animalString = "";
		int count = 1;
		
		for (Animal animal: state.animals) {
			if (animal.getName() == animalName) {
				animalString = animalString + count + ". " + animalName + ",";
				count++;
			}
		}
		return animalString;
	}
	
	/**
	 * Handles the selection of a specific animal.
	 * @param selection  an integer representing the specific animal the player has selected from the list of animals of selected type
	 */
	private void getAnimal(int selection) {
		int count = 0;
		
		for (Animal animal: state.animals) {
			if (animal.getName() == animalName && count == selection) {
				selectedAnimal = animal;
				break;
			}
			count++;
		}
	}
	
	/**
	 * Returns the amount of carrots the player has available
	 */
	private int getCarrotCount() {
		int count = 0;
		
		for (AnimalFood item: state.animalFood) {
			if (item.getName() == "Carrot") {
				count++;
			}
		}
		return count;
	}
	
	
	/**
	 * Returns the amount of grain the player has available
	 */
	private int getGrainCount() {
		int count = 0;
		
		for (AnimalFood item: state.animalFood) {
			if (item.getName() == "Grain") {
				count++;
			}
		}
		return count;
	}
	
	
	/**
	 * Returns the amount of high quality grain the player has available
	 */
	private int getHighQualityGrainCount() {
		int count = 0;
		
		for (AnimalFood item: state.animalFood) {
			if (item.getName() == "High Quality Grain") {
				count++;
			}
		}
		return count;
	}
}
