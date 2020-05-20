package gui.animal;

import java.awt.EventQueue;

import javax.swing.JFrame;

import gameEnvironment.GameState;
import gui.GameEnvironmentPanel;
import gui.farmer.FarmerWarningPanel;
import item.AnimalFood;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.SwingConstants;

import animal.Animal;

import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

public class FeedAnimalPanel {
	
	/**
	 * The game's GameState
	 */
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
	 * @param tempState  the current GameState  
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
		frmFarmiza.setBounds(100, 100, 576, 248);
		frmFarmiza.setIconImage(Toolkit.getDefaultToolkit().getImage(GameEnvironmentPanel.class.getResource("../images/logo.jpg")));
		frmFarmiza.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFarmiza.getContentPane().setLayout(null);
		
		JLabel lblInstruction = new JLabel("Select an Item to Feed all of your Animals");
		lblInstruction.setHorizontalAlignment(SwingConstants.CENTER);
		lblInstruction.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 22));
		lblInstruction.setBounds(25, 21, 510, 35);
		frmFarmiza.getContentPane().add(lblInstruction);
		
		final JComboBox<String> cmbAnimalFoodSelection = new JComboBox<String>();
		cmbAnimalFoodSelection.setModel(new DefaultComboBoxModel<String>(new String[] {"Use Carrot", "Use Grain", "Use High Quality Grain"}));
		cmbAnimalFoodSelection.setSelectedIndex(0);
		cmbAnimalFoodSelection.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		cmbAnimalFoodSelection.setBounds(77, 84, 405, 41);
		frmFarmiza.getContentPane().add(cmbAnimalFoodSelection);
		
		JButton btnUseItem = new JButton("USE ITEM");
		btnUseItem.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btnUseItem.setBounds(137, 153, 141, 45);
		btnUseItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if (state.farmer.getActionCount() != 0) {
					boolean foodItemAvailable = false;
					switch (cmbAnimalFoodSelection.getSelectedIndex()) {
					case 0:
						foodItemAvailable = useFoodItem(state, "Carrot");
						break;
					case 1:
						foodItemAvailable = useFoodItem(state, "Grain");
						break;
					case 2:
						foodItemAvailable = useFoodItem(state, "High Quality Grain");
						break;
					}
					
					if (foodItemAvailable) {
						state.farmer.reduceActionCount();
						frmFarmiza.dispose();
					}
				} else {
					new FarmerWarningPanel(state);
				}
				
			}
		});
		frmFarmiza.getContentPane().add(btnUseItem);
		
		JButton btnClose = new JButton("CLOSE");
		btnClose.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btnClose.setBounds(304, 153, 106, 45);
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				frmFarmiza.dispose();
			}
		});
		frmFarmiza.getContentPane().add(btnClose);
	}
	
	
	/**
	 * Handles use of a chosen food item.
	 * A warning is produced if food item isn't available
	 * @param state  the current GameState
	 * @param itemName  the chosen food item as a String
	 */
	private boolean useFoodItem(GameState state, String itemName) {
    	boolean found = false;
    	
    	for (AnimalFood item: state.animalFood) {
    		if (item.getName() == itemName) {
    			found = true;
    			
    			useItem(state, item.getHealthBoost(), item.getGeneralBoost());
    			state.animalFood.remove(item);
    			
    			break;
    		}
    	}
    	
    	if (!found) {
    		new AnimalFoodWarningPanel(itemName);
    		return false;
    	}
    	
    	return true;
    }
	
	/**
	 * Implements use of a food item to feed all animals.
	 * @param state  the current GameState
	 * @param healthBoost  the health boost given by the chosen food item
	 * @param boost  the happiness boost given by the chosen food item
	 */
	private void useItem(GameState state, int healthBoost, int boost) {
    	for (Animal animal: state.animals) {
    		animal.increaseHappiness(boost);
    		animal.increaseHealth(healthBoost);
    	}
    }

}
