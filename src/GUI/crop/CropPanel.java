package gui.crop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

import gameEnvironment.GameState;
import gui.GameEnvironmentPanel;


public class CropPanel {
	
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
	public CropPanel(GameState tempState) {
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
		
		JLabel lblFarmCrops = new JLabel("FARM CROPS");
		lblFarmCrops.setHorizontalAlignment(SwingConstants.CENTER);
		lblFarmCrops.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 35));
		lblFarmCrops.setBounds(249, 11, 285, 52);
		frmFarmiza.getContentPane().add(lblFarmCrops);
		
		JButton btnPlantCrops = new JButton("PLANT CROPS");
		btnPlantCrops.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		btnPlantCrops.setBounds(10, 111, 176, 64);
		frmFarmiza.getContentPane().add(btnPlantCrops);
		
		JButton btnTendToCrops = new JButton("TEND TO CROPS");
		btnTendToCrops.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		btnTendToCrops.setBounds(10, 186, 176, 64);
		btnTendToCrops.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				new TendToCropPanel(state);
			}
		});
		frmFarmiza.getContentPane().add(btnTendToCrops);
		
		JButton btnCropInventory = new JButton("CROP INVENTORY");
		btnCropInventory.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		btnCropInventory.setBounds(10, 261, 176, 64);
		btnCropInventory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				CropInventoryPanel newPanel = new CropInventoryPanel(state);
				newPanel.ActivatePanel(state);
			}
		});
		frmFarmiza.getContentPane().add(btnCropInventory);
		
		JLabel lblFieldImage = new JLabel("[plants image]");
		lblFieldImage.setHorizontalAlignment(SwingConstants.CENTER);
		lblFieldImage.setBounds(230, 81, 532, 353);
		frmFarmiza.getContentPane().add(lblFieldImage);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btnBack.setBounds(336, 455, 111, 45);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				new GameEnvironmentPanel(state);
				frmFarmiza.dispose();
			}
		});
		frmFarmiza.getContentPane().add(btnBack);
		
	}

}
