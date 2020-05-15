package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import gameEnvironment.GameState;
import gameEnvironment.randomEvent.BrokenFence;
import gameEnvironment.randomEvent.CountyFair;
import gameEnvironment.randomEvent.Drought;
import action.farmAction.NextDay;
import gui.animal.AnimalPanel;
import gui.crop.CropPanel;
import gui.farm.FarmStatusPanel;
import gui.farmer.FarmerStatusPanel;
import gui.randomEvent.BrokenFencePanel;
import gui.randomEvent.CountyFairPanel;
import gui.randomEvent.DroughtPanel;

public class GameEnvironmentPanel {

	private JFrame frmFarmiza;
	
	public GameState state;

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
	public GameEnvironmentPanel(GameState tempState) {
		int event = 0;
		state = tempState;
		
		if (state.currentDay != 1 && state.currentDay != state.totalDays) { 
			event = randomEvent(); 
		}
		
		initialize();
		ActivatePanel();
		switch(event) {
			case 1: 
				DroughtPanel drought = new DroughtPanel();
				drought.ActivatePanel();
				break;
			case 2: 
				BrokenFencePanel fence = new BrokenFencePanel();
				fence.ActivatePanel();
				break;
			case 3: 
				CountyFairPanel fair = new CountyFairPanel();
				fair.ActivatePanel();
				break;
			case 0:
				break;
		}
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
		
		JButton btnFarm = new JButton(state.farm.getName());
		btnFarm.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		btnFarm.setBounds(10, 118, 176, 64);
		btnFarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				new FarmStatusPanel(state);
				frmFarmiza.dispose();

			}
		});
		frmFarmiza.getContentPane().add(btnFarm);
		
		JButton btnFarmer = new JButton(state.farmer.getName());
		btnFarmer.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		btnFarmer.setBounds(10, 197, 176, 64);
		btnFarmer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				new FarmerStatusPanel(state);
				frmFarmiza.dispose();

			}
		});
		frmFarmiza.getContentPane().add(btnFarmer);
		
		JButton btnCrop = new JButton("LOOK AFTER CROPS");
		btnCrop.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		btnCrop.setBounds(10, 275, 176, 64);
		btnCrop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				new CropPanel(state);
				frmFarmiza.dispose();
			}
		});
		frmFarmiza.getContentPane().add(btnCrop);
		
		JButton btnAnimal = new JButton("LOOK AFTER ANIMALS");
		btnAnimal.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		btnAnimal.setBounds(10, 355, 176, 64);
		btnAnimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				new AnimalPanel(state);
				frmFarmiza.dispose();

			}
		});
		frmFarmiza.getContentPane().add(btnAnimal);
		
		JLabel lblTotalMoney = new JLabel( "$" + Math.round(state.totalMoney));
		lblTotalMoney.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblTotalMoney.setBounds(494, 43, 92, 45);
		frmFarmiza.getContentPane().add(lblTotalMoney);
		
		JLabel lblCurrentDay = new JLabel("DAY : " + state.currentDay + "/" + state.totalDays);
		lblCurrentDay.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblCurrentDay.setBounds(598, 43, 176, 45);
		frmFarmiza.getContentPane().add(lblCurrentDay);
		
		JButton btnShop = new JButton("SHOP");
		btnShop.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnShop.setBounds(10, 436, 176, 64);
		btnShop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				ShopPanel shopPanel = new ShopPanel();
				frmFarmiza.dispose();
				shopPanel.ActivatePanel(state);
			}
		});
		frmFarmiza.getContentPane().add(btnShop);
		
		JLabel lblMoneyImage = new JLabel("$image");
		lblMoneyImage.setIcon(new ImageIcon(GameEnvironmentPanel.class.getResource("../images/money.png")));
		lblMoneyImage.setBounds(437, 46, 47, 45);
		frmFarmiza.getContentPane().add(lblMoneyImage);
		
		JLabel lblFarmiza = new JLabel("WELCOME TO FARMIZA!");
		lblFarmiza.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		lblFarmiza.setBounds(10, 35, 406, 53);
		frmFarmiza.getContentPane().add(lblFarmiza);
		
		JButton btnHelp = new JButton("HELP");
		btnHelp.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		btnHelp.setBounds(697, 9, 77, 28);
		btnHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				HelpPanel helpPanel = new HelpPanel();
				helpPanel.ActivatePanel();
			}
		});
		frmFarmiza.getContentPane().add(btnHelp);
		
		JButton btnNextDay = new JButton("NEXT DAY");
		btnNextDay.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnNextDay.setBounds(598, 436, 176, 64);
		btnNextDay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				new NextDay().perform(state);
				
				if (state.currentDay > state.totalDays) {
					new EndGamePanel(state);
				} else {
					new GameEnvironmentPanel(state);
				}
				
				frmFarmiza.dispose();
			}
		});
		frmFarmiza.getContentPane().add(btnNextDay);
		
		JLabel lblBackground = new JLabel("");
		lblBackground.setIcon(new ImageIcon(GameEnvironmentPanel.class.getResource(getFarmImage())));
		lblBackground.setBounds(192, 88, 582, 337);
		frmFarmiza.getContentPane().add(lblBackground);
	}
	
	private String getFarmImage() {
		String farmImage = "";
		
		if (state.farm.getType() == "City Farm") {
			farmImage = "city_farm.jpg";
		} else if (state.farm.getType() == "Tropical Farm") {
			farmImage = "tropical_farm.jpg";
		} else if (state.farm.getType() == "Normal Farm") {
			farmImage = "normal_farm.jfif";
		} else if (state.farm.getType() == "Hardcore Farm") {
			farmImage = "hardcore_farm.jpg";
		}
		
		return "../images/" + farmImage;
	}
	
	private int randomEvent() {
		int event = 0;
		switch(new Random().nextInt(5)) {
			case 0: 
				new Drought().apply(state);
				event = 1;
				break;
			case 1:
				state.farm.increaseMaintenanceLevel();
				break;
			case 2: 
				new BrokenFence().apply(state);
				event = 2;
				break;
			case 3:
				state.farm.increaseMaintenanceLevel();
				break;
			case 4: 
				new CountyFair().apply(state);
				event = 3;
				break;
			case 5:
				state.farm.increaseMaintenanceLevel();
				break;
		}
		return event;
	}
}
