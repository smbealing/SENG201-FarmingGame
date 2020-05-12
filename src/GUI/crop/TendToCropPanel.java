package gui.crop;

import java.awt.EventQueue;

import javax.swing.JFrame;

import gameEnvironment.GameState;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class TendToCropPanel {
	
	public GameState state;

	private JFrame frmFarmiza;

	/**
	 * Launch the application.
	 */
	public void ActivatePanel(final GameState state) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TendToCropPanel window = new TendToCropPanel(state);
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
	public TendToCropPanel(GameState tempState) {
		state = tempState;
		initialize();

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFarmiza = new JFrame();
		frmFarmiza.setTitle("Farmiza");
		frmFarmiza.setBounds(100, 100, 629, 351);
		frmFarmiza.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFarmiza.getContentPane().setLayout(null);
		
		JLabel lblCrops = new JLabel("Crops");
		lblCrops.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 24));
		lblCrops.setBounds(107, 57, 89, 35);
		frmFarmiza.getContentPane().add(lblCrops);
		
		JLabel lblCropItems = new JLabel("Crop Items");
		lblCropItems.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 24));
		lblCropItems.setBounds(384, 57, 172, 35);
		frmFarmiza.getContentPane().add(lblCropItems);
		
		
		JLabel lblSelectACrop = new JLabel("Select a crop category and an item to use on those crops");
		lblSelectACrop.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectACrop.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblSelectACrop.setBounds(18, 11, 577, 35);
		frmFarmiza.getContentPane().add(lblSelectACrop);
		
		JRadioButton rdbtnBanana = new JRadioButton("Banana");
		rdbtnBanana.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		rdbtnBanana.setBounds(33, 99, 109, 23);
		frmFarmiza.getContentPane().add(rdbtnBanana);
		
		JRadioButton rdbtnCorn = new JRadioButton("Corn");
		rdbtnCorn.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		rdbtnCorn.setBounds(179, 99, 109, 23);
		frmFarmiza.getContentPane().add(rdbtnCorn);
		
		JRadioButton rdbtnDragonFruit = new JRadioButton("Dragon fruit");
		rdbtnDragonFruit.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		rdbtnDragonFruit.setBounds(33, 139, 121, 23);
		frmFarmiza.getContentPane().add(rdbtnDragonFruit);
		
		JRadioButton rdbtnPotato = new JRadioButton("Potato");
		rdbtnPotato.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		rdbtnPotato.setBounds(179, 139, 109, 23);
		frmFarmiza.getContentPane().add(rdbtnPotato);
		
		JRadioButton rdbtnTomato = new JRadioButton("Tomato");
		rdbtnTomato.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		rdbtnTomato.setBounds(33, 180, 121, 23);
		frmFarmiza.getContentPane().add(rdbtnTomato);
		
		JRadioButton rdbtnWheat = new JRadioButton("Wheat");
		rdbtnWheat.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		rdbtnWheat.setBounds(179, 180, 109, 23);
		frmFarmiza.getContentPane().add(rdbtnWheat);
		
		final JComboBox<String> cmbItemSelection = new JComboBox<String>();
		cmbItemSelection.setModel(new DefaultComboBoxModel<String>(new String[] {"Use Fertiliser", "Use Pesticide", "Use Water", "Use Heating  $20.00", "Use Speech"}));
		cmbItemSelection.setSelectedIndex(0);
		cmbItemSelection.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		cmbItemSelection.setBounds(364, 121, 192, 41);
		frmFarmiza.getContentPane().add(cmbItemSelection);
		
		JButton btnUseItem = new JButton("USE ITEM");
		btnUseItem.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btnUseItem.setBounds(230, 256, 141, 45);
		btnUseItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				//TODO: use selected item on selected crops
				frmFarmiza.dispose();
			}
		});
		frmFarmiza.getContentPane().add(btnUseItem);
	}
}
