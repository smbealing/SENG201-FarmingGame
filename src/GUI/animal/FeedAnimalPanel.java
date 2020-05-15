package gui.animal;

import java.awt.EventQueue;

import javax.swing.JFrame;

import gameEnvironment.GameState;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
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
	public void ActivatePanel(final GameState state) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FeedAnimalPanel window = new FeedAnimalPanel();
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
	public FeedAnimalPanel() {
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
		
		JLabel lblInstruction = new JLabel("Select an Item to Feed all of your Animals");
		lblInstruction.setHorizontalAlignment(SwingConstants.CENTER);
		lblInstruction.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblInstruction.setBounds(25, 21, 510, 35);
		frmFarmiza.getContentPane().add(lblInstruction);
		
		JComboBox<String> cmbAnimalFoodSelection = new JComboBox<String>();
		cmbAnimalFoodSelection.setModel(new DefaultComboBoxModel<String>(new String[] {"Use Carrot", "Use Grain", "Use High Quality Grain"}));
		cmbAnimalFoodSelection.setSelectedIndex(0);
		cmbAnimalFoodSelection.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		cmbAnimalFoodSelection.setBounds(77, 100, 405, 41);
		frmFarmiza.getContentPane().add(cmbAnimalFoodSelection);
		
		JButton btnUseItem = new JButton("USE ITEM");
		btnUseItem.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btnUseItem.setBounds(209, 217, 141, 45);
		btnUseItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				//TODO: use selected item to feed all animals
				frmFarmiza.dispose();
			}
		});
		frmFarmiza.getContentPane().add(btnUseItem);
	}

}
