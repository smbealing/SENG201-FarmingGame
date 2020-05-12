package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import gameEnvironment.GameState;
import gui.animal.AnimalPanel;
import gui.crop.CropPanel;
import gui.farm.FarmStatusPanel;
import gui.farm.TendToFarmLandPanel;
import gui.farmer.FarmerStatusPanel;
import gui.setUp.SelectDaysPanel;

public class GameEnvironmentPanel {

	private JFrame frmFarmiza;
	
	public GameState state;

	/**
	 * Launch the application.
	 */
	public void ActivatePanel(final GameState state) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameEnvironmentPanel window = new GameEnvironmentPanel(state);
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
	public GameEnvironmentPanel(GameState tempState) {
		state = tempState;
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFarmiza = new JFrame();
		frmFarmiza.setTitle("Farmiza");
		frmFarmiza.setBounds(100, 100, 800, 550);
		frmFarmiza.setIconImage(Toolkit.getDefaultToolkit().getImage(GameEnvironmentPanel.class.getResource("../images/logo.jpg")));
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFarmiza.getContentPane().setLayout(null);
		
		JButton btnNextDay = new JButton("NEXT DAY");
		btnNextDay.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnNextDay.setBounds(598, 423, 176, 64);
		frmFarmiza.getContentPane().add(btnNextDay);
		
		JButton btnFarm = new JButton("[farm name]");
		btnFarm.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		btnFarm.setBounds(10, 123, 176, 64);
		btnFarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				FarmStatusPanel farmStatusPanel = new FarmStatusPanel();
				farmStatusPanel.ActivatePanel(state);
			}
		});
		frmFarmiza.getContentPane().add(btnFarm);
		
		JButton btnFarmer = new JButton("[farmer name]");
		btnFarmer.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		btnFarmer.setBounds(10, 198, 176, 64);
		btnFarmer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				FarmerStatusPanel farmerStatusPanel = new FarmerStatusPanel();
				farmerStatusPanel.ActivatePanel(state);
			}
		});
		frmFarmiza.getContentPane().add(btnFarmer);
		
		JButton btnCrop = new JButton("LOOK AFTER CROPS");
		btnCrop.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		btnCrop.setBounds(10, 273, 176, 64);
		btnCrop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				CropPanel cropPanel = new CropPanel();
				cropPanel.ActivatePanel(state);
			}
		});
		frmFarmiza.getContentPane().add(btnCrop);
		
		JButton btnAnimal = new JButton("LOOK AFTER ANIMALS");
		btnAnimal.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		btnAnimal.setBounds(10, 348, 176, 64);
		btnAnimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				AnimalPanel animalPanel = new AnimalPanel();
				animalPanel.ActivatePanel(state);
			}
		});
		frmFarmiza.getContentPane().add(btnAnimal);
		
//		JLabel lblBackground = new JLabel("");
//		lblBackground.setIcon(new ImageIcon(GameEnvironmentPanel.class.getResource("../images/")));
//		lblBackground.setBounds(0, 0, 784, 511);
//		frame.getContentPane().add(lblBackground);
		
		JLabel lblTotalMoney = new JLabel("[money]");
		lblTotalMoney.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblTotalMoney.setBounds(483, 11, 103, 45);
		frmFarmiza.getContentPane().add(lblTotalMoney);
		
		JLabel lblCurrentDay = new JLabel("DAY : [day/total days]");
		lblCurrentDay.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblCurrentDay.setBounds(598, 11, 176, 45);
		frmFarmiza.getContentPane().add(lblCurrentDay);
		
		JButton btnShop = new JButton("SHOP");
		btnShop.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnShop.setBounds(10, 423, 176, 64);
		btnShop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				ShopPanel shopPanel = new ShopPanel();
				shopPanel.ActivatePanel(state);
			}
		});
		frmFarmiza.getContentPane().add(btnShop);
		
		JLabel lblMoneyImage = new JLabel("$image");
		lblMoneyImage.setIcon(new ImageIcon(GameEnvironmentPanel.class.getResource("../images/money.png")));
		lblMoneyImage.setBounds(426, 11, 47, 45);
		frmFarmiza.getContentPane().add(lblMoneyImage);
		
		JLabel lblFarmiza = new JLabel("WELCOME TO FARMIZA!");
		lblFarmiza.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		lblFarmiza.setBounds(10, 11, 406, 101);
		frmFarmiza.getContentPane().add(lblFarmiza);
		
		JButton btnTendToFarmland = new JButton("TEND TO FARM LAND");
		btnTendToFarmland.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		btnTendToFarmland.setBounds(196, 424, 176, 64);
		btnTendToFarmland.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				TendToFarmLandPanel tendToFarmLandPanel = new TendToFarmLandPanel();
				tendToFarmLandPanel.ActivatePanel(state);
			}
		});
		frmFarmiza.getContentPane().add(btnTendToFarmland);
		
		JButton btnHelp = new JButton("HELP");
		btnHelp.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnHelp.setBounds(398, 423, 176, 64);
		btnHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				HelpPanel helpPanel = new HelpPanel();
				helpPanel.ActivatePanel();
			}
		});
		frmFarmiza.getContentPane().add(btnHelp);
	}
}
