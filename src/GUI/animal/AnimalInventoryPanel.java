package gui.animal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.SwingConstants;


import gameEnvironment.GameState;
import gui.crop.CropStatusPanel;
import item.AnimalFood;
import animal.Animal;
import crop.Crop;

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
		lblCows.setBounds(100, 83, 111, 35);
		frmFarmiza.getContentPane().add(lblCows);
		
		JLabel lblHorses = new JLabel("Horses");
		lblHorses.setHorizontalAlignment(SwingConstants.CENTER);
		lblHorses.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblHorses.setBounds(110, 184, 85, 35);
		frmFarmiza.getContentPane().add(lblHorses);
		
		JLabel lblSheep = new JLabel("Sheep");
		lblSheep.setHorizontalAlignment(SwingConstants.CENTER);
		lblSheep.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblSheep.setBounds(114, 282, 80, 35);
		frmFarmiza.getContentPane().add(lblSheep);
		
		btnSelectCow = new JRadioButton("SELECT");
		btnSelectCow.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnSelectCow.setBounds(110, 119, 89, 25);
		frmFarmiza.getContentPane().add(btnSelectCow);
		
		
		btnSelectHorse = new JRadioButton("SELECT");
		btnSelectHorse.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnSelectHorse.setBounds(110, 220, 89, 25);
		frmFarmiza.getContentPane().add(btnSelectHorse);	
		
		btnSelectSheep = new JRadioButton("SELECT");
		btnSelectSheep.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnSelectSheep.setBounds(110, 318, 89, 25);
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
		cmbSelectedAnimal.setModel(new DefaultComboBoxModel<String>(getOptions().split(",")));
		cmbSelectedAnimal.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		cmbSelectedAnimal.setBounds(485, 122, 192, 41);
		frmFarmiza.getContentPane().add(cmbSelectedAnimal);
		
		JLabel lblAnimalItems = new JLabel("Animal Items Available");
		lblAnimalItems.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnimalItems.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblAnimalItems.setBounds(462, 250, 242, 35);
		frmFarmiza.getContentPane().add(lblAnimalItems);
		
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
		btnCheckStatus.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btnCheckStatus.setBounds(230, 455, 197, 45);
		btnCheckStatus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				getAnimal(cmbSelectedAnimal.getSelectedIndex());
				new AnimalStatusPanel(selectedAnimal);
			}
		});
		frmFarmiza.getContentPane().add(btnCheckStatus);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btnBack.setBounds(461, 455, 111, 45);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				new AnimalPanel(state);
				frmFarmiza.dispose();
			}
		});
		frmFarmiza.getContentPane().add(btnBack);
		
	}
	
	private String getOptions() {
		animals = "";
		
		if (btnSelectCow.isSelected()) {
			animalName = "Banana";
			animals = getAnimalString();
		} else if (btnSelectHorse.isSelected()) {
			animalName = "Corn";
			animals = getAnimalString();
		} else if (btnSelectSheep.isSelected()) {
			animalName = "Wheat";
			animals = getAnimalString();
		} 
		return animals;
	}
	
	private String getAnimalString() {
		String animalString = "";
		int count = 0;
		
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
