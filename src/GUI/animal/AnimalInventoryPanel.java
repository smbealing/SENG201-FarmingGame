package gui.animal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.SwingConstants;


import gameEnvironment.GameState;
import gui.GameEnvironmentPanel;
import item.AnimalFood;
import animal.Animal;


import javax.swing.JRadioButton;
import javax.swing.JComboBox;

public class AnimalInventoryPanel {
	
	public GameState state;
	public Animal selectedAnimal;
	public String animalName;
	private String animals;

	private JFrame frmFarmiza;
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
		
		JLabel lblAnimalInventory = new JLabel("ANIMAL INVENTORY");
		lblAnimalInventory.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnimalInventory.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
		lblAnimalInventory.setBounds(246, 11, 291, 35);
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
		btnSelectCow.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnSelectCow.setBounds(51, 121, 89, 25);
		btnSelectCow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				getOptions();
			}
		});
		frmFarmiza.getContentPane().add(btnSelectCow);
		
		
		btnSelectHorse = new JRadioButton("SELECT");
		btnSelectHorse.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnSelectHorse.setBounds(179, 120, 89, 25);
		btnSelectHorse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				getOptions();
			}
		});
		frmFarmiza.getContentPane().add(btnSelectHorse);	
		
		btnSelectSheep = new JRadioButton("SELECT");
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
		lblSelect.setBounds(399, 82, 356, 35);
		frmFarmiza.getContentPane().add(lblSelect);
		
		ButtonGroup animalGroupButton = new ButtonGroup();
		animalGroupButton.add(btnSelectCow);
		animalGroupButton.add(btnSelectHorse);
		animalGroupButton.add(btnSelectSheep);

		cmbSelectedAnimal = new JComboBox<String>();
		cmbSelectedAnimal.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		cmbSelectedAnimal.setBounds(485, 122, 192, 41);
		frmFarmiza.getContentPane().add(cmbSelectedAnimal);
		
		JLabel lblAnimalFood = new JLabel("Animal Food Available");
		lblAnimalFood.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnimalFood.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblAnimalFood.setBounds(462, 250, 242, 35);
		frmFarmiza.getContentPane().add(lblAnimalFood);
		
		JLabel lblCarrotsLeft = new JLabel("Carrots : " + getCarrotCount());
		lblCarrotsLeft.setHorizontalAlignment(SwingConstants.LEFT);
		lblCarrotsLeft.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
		lblCarrotsLeft.setBounds(537, 283, 140, 35);
		frmFarmiza.getContentPane().add(lblCarrotsLeft);
		
		JLabel lblGrainLeft = new JLabel("Grain : "  + getGrainCount());
		lblGrainLeft.setHorizontalAlignment(SwingConstants.LEFT);
		lblGrainLeft.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
		lblGrainLeft.setBounds(537, 319, 140, 35);
		frmFarmiza.getContentPane().add(lblGrainLeft);

		
		JLabel lblHighQualityGrainLeft = new JLabel("High Quality Grain : "  + getHighQualityGrainCount());
		lblHighQualityGrainLeft.setHorizontalAlignment(SwingConstants.LEFT);
		lblHighQualityGrainLeft.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
		lblHighQualityGrainLeft.setBounds(485, 356, 192, 35);
		frmFarmiza.getContentPane().add(lblHighQualityGrainLeft);
		
		JButton btnCheckStatus = new JButton("CHECK STATUS");
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
		
		JButton btnBack = new JButton("BACK");
		btnBack.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btnBack.setBounds(336, 455, 111, 45);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				new AnimalPanel(state);
				frmFarmiza.dispose();
			}
		});
		frmFarmiza.getContentPane().add(btnBack);
		
	}
	
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
	
	private int getCarrotCount() {
		int count = 0;
		
		for (AnimalFood item: state.animalFood) {
			if (item.getName() == "Carrot") {
				count++;
			}
		}
		return count;
	}
	
	private int getGrainCount() {
		int count = 0;
		
		for (AnimalFood item: state.animalFood) {
			if (item.getName() == "Grain") {
				count++;
			}
		}
		return count;
	}
	
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
