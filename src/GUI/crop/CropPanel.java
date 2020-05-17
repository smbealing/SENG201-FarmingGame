package gui.crop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Toolkit;
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
	 * Initialise the contents of the frame.
	 */
	private void initialize() {
		frmFarmiza = new JFrame();
		frmFarmiza.setTitle("Farmiza");
		frmFarmiza.setBounds(100, 100, 800, 550);
		frmFarmiza.setIconImage(Toolkit.getDefaultToolkit().getImage(GameEnvironmentPanel.class.getResource("../images/logo.jpg")));
		frmFarmiza.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFarmiza.getContentPane().setLayout(null);
		
		JLabel lblFarmCrops = new JLabel("FARM CROPS");
		lblFarmCrops.setHorizontalAlignment(SwingConstants.CENTER);
		lblFarmCrops.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 35));
		lblFarmCrops.setBounds(249, 11, 285, 52);
		frmFarmiza.getContentPane().add(lblFarmCrops);
		
		JButton btnPlantCrops = new JButton("PLANT CROPS");
		btnPlantCrops.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		btnPlantCrops.setBounds(62, 204, 176, 64);
		frmFarmiza.getContentPane().add(btnPlantCrops);
		
		JButton btnTendToCrops = new JButton("TEND TO CROPS");
		btnTendToCrops.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		btnTendToCrops.setBounds(302, 204, 176, 64);
		btnTendToCrops.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				new TendToCropPanel(state);
			}
		});
		frmFarmiza.getContentPane().add(btnTendToCrops);
		
		JButton btnCropInventory = new JButton("CROP INVENTORY");
		btnCropInventory.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		btnCropInventory.setBounds(541, 204, 176, 64);
		btnCropInventory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				new CropInventoryPanel(state);
				frmFarmiza.dispose();
			}
		});
		frmFarmiza.getContentPane().add(btnCropInventory);
		
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
		
		JLabel lblFieldImage = new JLabel("[plants image]");
		lblFieldImage.setHorizontalAlignment(SwingConstants.CENTER);
		lblFieldImage.setBounds(20, 59, 742, 385);
		frmFarmiza.getContentPane().add(lblFieldImage);
	}

}
