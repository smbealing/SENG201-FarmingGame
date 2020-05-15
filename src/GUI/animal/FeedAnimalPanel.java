package gui.animal;

import java.awt.EventQueue;

import javax.swing.JFrame;

import gameEnvironment.GameState;
import gui.GameEnvironmentPanel;
import gui.crop.CropPanel;
import item.AnimalFood;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Set;

import javax.swing.SwingConstants;

import animal.Animal;
import farm.CityFarm;
import farm.HardcoreFarm;
import farm.NormalFarm;
import farm.TropicalFarm;

import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

public class FeedAnimalPanel {
	
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
	public FeedAnimalPanel(GameState tempState) {
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
		frmFarmiza.setBounds(100, 100, 576, 335);
		frmFarmiza.setIconImage(Toolkit.getDefaultToolkit().getImage(GameEnvironmentPanel.class.getResource("../images/logo.jpg")));
		frmFarmiza.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFarmiza.getContentPane().setLayout(null);
		
		JLabel lblInstruction = new JLabel("Select an Item to Feed all of your Animals");
		lblInstruction.setHorizontalAlignment(SwingConstants.CENTER);
		lblInstruction.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblInstruction.setBounds(25, 21, 510, 35);
		frmFarmiza.getContentPane().add(lblInstruction);
		
		final JComboBox<String> cmbAnimalFoodSelection = new JComboBox<String>();
		cmbAnimalFoodSelection.setModel(new DefaultComboBoxModel<String>(new String[] {"Use Carrot", "Use Grain", "Use High Quality Grain"}));
		cmbAnimalFoodSelection.setSelectedIndex(0);
		cmbAnimalFoodSelection.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		cmbAnimalFoodSelection.setBounds(77, 100, 405, 41);
		frmFarmiza.getContentPane().add(cmbAnimalFoodSelection);
		
		JButton btnUseItem = new JButton("USE ITEM");
		btnUseItem.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btnUseItem.setBounds(77, 230, 141, 45);
		btnUseItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				switch (cmbAnimalFoodSelection.getSelectedIndex()) {
				case 0:
					useFoodItem(state, "Carrot");
					break;
				case 1:
					useFoodItem(state, "Grain");
					break;
				case 2:
					useFoodItem(state, "High Quality Grain");
					break;
				}
				
				new AnimalPanel(state);
				frmFarmiza.dispose();
			}
		});
		frmFarmiza.getContentPane().add(btnUseItem);
		
		JButton btnClose = new JButton("CLOSE");
		btnClose.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnClose.setBounds(287, 231, 195, 45);
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				new AnimalPanel(state);
				frmFarmiza.dispose();
			}
		});
		frmFarmiza.getContentPane().add(btnClose);
	}
	
	private void useFoodItem(GameState state, String itemName) {
    	boolean found = false;
    	
    	for (AnimalFood item: state.animalFood) {
    		if (item.getName() == itemName) {
    			found = true;
    			
    			useItem(state, item.getHealthBoost(), item.getGeneralBoost());
    			state.animalFood.remove(item);
    			
    			break;
    		}
    	}
    	
    	//Change to show message in GUI
    	if (!found) {
    		System.out.println("|---------------------------------------------------|\r\n" +
    						   "| Oh no! You don't have any more of that food item. |\r\n" +
 		   		   	  		   "|---------------------------------------------------|");
    	}
    }
	
	private void useItem(GameState state, int healthBoost, int boost) {
    	state.farmer.reduceActionCount();
    	for (Animal animal: state.animals) {
    		animal.increaseHappiness(boost);
    		animal.increaseHealth(healthBoost);
    		System.out.println("| Your " + animal.getName() + " has been fed.");
    	}
    }

}
