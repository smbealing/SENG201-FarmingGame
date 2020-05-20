package gui.crop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

import action.farmerAction.HarvestCrop;
import crop.Crop;
import gameEnvironment.GameState;
import gui.GameEnvironmentPanel;
import gui.farmer.FarmerWarningPanel;
import java.awt.Color;


public class CropPanel {
	
	/**
	 * The game's GameState
	 */
	public GameState state;

	private JFrame frmFarmiza;
	private JLabel lblFieldImage;
	private JButton btnHarvestCrops;

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
		frmFarmiza.setResizable(false);
		
		JLabel lblFarmCrops = new JLabel("FARM CROPS");
		lblFarmCrops.setHorizontalAlignment(SwingConstants.CENTER);
		lblFarmCrops.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 35));
		lblFarmCrops.setBounds(254, 11, 285, 52);
		frmFarmiza.getContentPane().add(lblFarmCrops);
		
		JButton btnPlantCrops = new JButton("PLANT CROPS");
		btnPlantCrops.setBackground(new Color(204, 204, 51));
		btnPlantCrops.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnPlantCrops.setBounds(62, 164, 176, 64);
		btnPlantCrops.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				new PlantCropPanel(state);
				frmFarmiza.dispose();
			}
		});
		frmFarmiza.getContentPane().add(btnPlantCrops);
		
		JButton btnTendToCrops = new JButton("TEND TO CROPS");
		btnTendToCrops.setBackground(new Color(204, 204, 51));
		btnTendToCrops.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnTendToCrops.setBounds(302, 164, 176, 64);
		btnTendToCrops.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				new TendToCropPanel(state);
			}
		});
		frmFarmiza.getContentPane().add(btnTendToCrops);
		
		JButton btnCropInventory = new JButton("CROP INVENTORY");
		btnCropInventory.setBackground(new Color(204, 204, 51));
		btnCropInventory.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnCropInventory.setBounds(541, 164, 176, 64);
		btnCropInventory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				new CropInventoryPanel(state);
				frmFarmiza.dispose();
			}
		});
		frmFarmiza.getContentPane().add(btnCropInventory);
		
		btnHarvestCrops = new JButton("HARVEST CROPS");
		btnHarvestCrops.setBackground(new Color(204, 204, 51));
		btnHarvestCrops.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnHarvestCrops.setBounds(303, 273, 176, 64);
		btnHarvestCrops.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if (state.farmer.getActionCount() != 0) {
					new HarvestCrop().perform(state);
					checkHarvest();
				} else {
					new FarmerWarningPanel(state);
				}
			}
		});
		frmFarmiza.getContentPane().add(btnHarvestCrops);
		checkHarvest();
		
		JButton btnBack = new JButton("BACK");
		btnBack.setBackground(new Color(102, 102, 51));
		btnBack.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		btnBack.setBounds(341, 455, 111, 45);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				new GameEnvironmentPanel(state);
				frmFarmiza.dispose();
			}
		});
		frmFarmiza.getContentPane().add(btnBack);
		
		lblFieldImage = new JLabel("");
		lblFieldImage.setBounds(-21, 0, 884, 625);
		frmFarmiza.getContentPane().add(lblFieldImage);
		setBackgr();
	}
	
	private void setBackgr() {
		ImageIcon path = new ImageIcon(GameEnvironmentPanel.class.getResource("../images/crops.jpg"));
		Image imageGet = path.getImage();
		Image imageSize = imageGet.getScaledInstance(lblFieldImage.getWidth(), lblFieldImage.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image = new ImageIcon(imageSize);
		lblFieldImage.setIcon(image);
	}
	
	
	/**
	 * Checks whether farm has crops ready to harvest and
	 * disables or enables btnHarvestCrops accordingly.
	 */
	private void checkHarvest() {
		int count = 0;
		
		for (Crop crop: state.crops) {
			if (crop.getPlanted() && crop.getCurrentGrowthLevel() == crop.getDaysUntilHarvest()) {
				count++;
			}
		}
		
		if (count == 0) {
			btnHarvestCrops.setEnabled(false);
		} else {
			btnHarvestCrops.setEnabled(true);
		}
	}
	
}
