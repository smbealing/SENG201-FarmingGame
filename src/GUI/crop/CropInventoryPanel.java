package gui.crop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import gameEnvironment.GameState;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTable;

public class CropInventoryPanel {

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
	public CropInventoryPanel(GameState tempState) {
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
		
		JLabel lblCropInventory = new JLabel("CROP INVENTORY");
		lblCropInventory.setFont(new Font("Tahoma", Font.BOLD, 35));
		
		
		JLabel lblTitle = new JLabel("CROP INVENTORY");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
		lblTitle.setBounds(258, 11, 268, 35);
		frmFarmiza.getContentPane().add(lblTitle);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btnBack.setBounds(336, 455, 111, 45);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				frmFarmiza.dispose();
			}
		});
		frmFarmiza.getContentPane().add(btnBack);
		
		JLabel lblBananas = new JLabel("Bananas");
		lblBananas.setHorizontalAlignment(SwingConstants.CENTER);
		lblBananas.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblBananas.setBounds(10, 51, 111, 35);
		frmFarmiza.getContentPane().add(lblBananas);
		
		JLabel lblCorn = new JLabel("Corn");
		lblCorn.setHorizontalAlignment(SwingConstants.CENTER);
		lblCorn.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblCorn.setBounds(152, 51, 52, 35);
		frmFarmiza.getContentPane().add(lblCorn);
		
		JLabel lblWheat = new JLabel("Wheat");
		lblWheat.setHorizontalAlignment(SwingConstants.CENTER);
		lblWheat.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblWheat.setBounds(238, 51, 88, 35);
		frmFarmiza.getContentPane().add(lblWheat);
		
		JLabel lblTomatos = new JLabel("Tomatos");
		lblTomatos.setHorizontalAlignment(SwingConstants.CENTER);
		lblTomatos.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblTomatos.setBounds(353, 51, 111, 35);
		frmFarmiza.getContentPane().add(lblTomatos);
		
		JLabel lblPotatos = new JLabel("Potatos");
		lblPotatos.setHorizontalAlignment(SwingConstants.CENTER);
		lblPotatos.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblPotatos.setBounds(487, 51, 88, 35);
		frmFarmiza.getContentPane().add(lblPotatos);
		
		JLabel lblDragonFruit = new JLabel("Dragon Fruit");
		lblDragonFruit.setHorizontalAlignment(SwingConstants.CENTER);
		lblDragonFruit.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblDragonFruit.setBounds(619, 51, 140, 35);
		frmFarmiza.getContentPane().add(lblDragonFruit);
	}
}
