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
import java.awt.Image;

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
import java.awt.Color;
import javax.swing.SwingConstants;

public class GameEnvironmentPanel {
	
	/**
	 * The game's GameState
	 */
	public GameState state;

	private JFrame frmFarmiza;
	private JLabel lblBackground;
	private JLabel lblWoodBackgr;
	private JLabel lblMoneyImage;

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
	public GameEnvironmentPanel(GameState tempState) {
		int event = 0;
		state = tempState;
		
		if (state.currentDay != 1 && state.currentDay != state.totalDays && state.nextDay) { 
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
		state.nextDay = false;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFarmiza = new JFrame();
		frmFarmiza.setTitle("Farmiza");
		frmFarmiza.setBounds(100, 100, 800, 550);
		frmFarmiza.setIconImage(Toolkit.getDefaultToolkit().getImage(GameEnvironmentPanel.class.getResource("../images/logo.jpg")));
		frmFarmiza.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFarmiza.getContentPane().setLayout(null);
		frmFarmiza.setResizable(false);
		
		JButton btnFarm = new JButton(state.farm.getName());
		btnFarm.setBackground(new Color(153, 204, 0));
		btnFarm.setForeground(new Color(0, 0, 0));
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
		btnFarmer.setBackground(new Color(153, 204, 0));
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
		btnCrop.setBackground(new Color(153, 204, 0));
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
		btnAnimal.setBackground(new Color(153, 204, 0));
		btnAnimal.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		btnAnimal.setBounds(10, 355, 176, 64);
		btnAnimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				new AnimalPanel(state);
				frmFarmiza.dispose();

			}
		});
		frmFarmiza.getContentPane().add(btnAnimal);
		
		lblMoneyImage = new JLabel();
		lblMoneyImage.setBounds(483, 35, 47, 45);
		frmFarmiza.getContentPane().add(lblMoneyImage);
		setMoneyImage();
		
		JLabel lblTotalMoney = new JLabel("$" + String.format("%.2f", state.totalMoney));
		lblTotalMoney.setForeground(new Color(153, 204, 0));
		lblTotalMoney.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblTotalMoney.setBounds(540, 43, 92, 45);
		frmFarmiza.getContentPane().add(lblTotalMoney);
		
		JLabel lblCurrentDay = new JLabel("DAY : " + state.currentDay + "/" + state.totalDays);
		lblCurrentDay.setForeground(new Color(153, 204, 0));
		lblCurrentDay.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblCurrentDay.setBounds(644, 43, 130, 45);
		frmFarmiza.getContentPane().add(lblCurrentDay);
		
		JButton btnShop = new JButton("MARKET");
		btnShop.setBackground(new Color(153, 204, 0));
		btnShop.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnShop.setBounds(10, 436, 176, 64);
		btnShop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				new ShopPanel(state);
				frmFarmiza.dispose();
			}
		});
		frmFarmiza.getContentPane().add(btnShop);
		
		JLabel lblFarmiza = new JLabel("WELCOME TO FARMIZA!");
		lblFarmiza.setHorizontalAlignment(SwingConstants.CENTER);
		lblFarmiza.setForeground(new Color(153, 204, 0));
		lblFarmiza.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 35));
		lblFarmiza.setBounds(10, 24, 477, 71);
		frmFarmiza.getContentPane().add(lblFarmiza);
		
		JButton btnHelp = new JButton("HELP");
		btnHelp.setBackground(new Color(153, 204, 0));
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
		btnNextDay.setBackground(new Color(153, 204, 0));
		btnNextDay.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnNextDay.setBounds(598, 446, 176, 64);
		btnNextDay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				new NextDay().perform(state);
				state.nextDay = true;
				if (state.currentDay > state.totalDays) {
					new EndGamePanel(state);
				} else {
					new GameEnvironmentPanel(state);
				}
				
				frmFarmiza.dispose();
			}
		});
		frmFarmiza.getContentPane().add(btnNextDay);
		
		lblBackground = new JLabel("");
		lblBackground.setBounds(202, 99, 582, 337);
		frmFarmiza.getContentPane().add(lblBackground);
		getFarmImage();
		
		JLabel lblFrame = new JLabel("");
		lblFrame.setForeground(Color.BLACK);
		lblFrame.setBackground(Color.BLACK);
		lblFrame.setOpaque(true);
		lblFrame.setBounds(190, 92, 604, 351);
		frmFarmiza.getContentPane().add(lblFrame);
		
		lblWoodBackgr = new JLabel("");
		lblWoodBackgr.setBounds(0, 0, 794, 521);
		frmFarmiza.getContentPane().add(lblWoodBackgr);
		setWoodBackgr();
	}
	
	/**
	 * Uses the player's choice of farm type to 
	 * set the corresponding background image.
	 */
	private void getFarmImage() {
		String farmImage = "";
		
		if (state.farm.getType() == "City Farm") {
			farmImage = "city_farm.jpg";
		} else if (state.farm.getType() == "Tropical Farm") {
			farmImage = "tropical_farm.jpg";
		} else if (state.farm.getType() == "Normal Farm") {
			farmImage = "normal_farm.jpg";
		} else if (state.farm.getType() == "Hardcore Farm") {
			farmImage = "hardcore_farm.jpg";
		}
		ImageIcon path = new ImageIcon(GameEnvironmentPanel.class.getResource("../images/" + farmImage));
		Image imageGet = path.getImage();
		Image imageSize = imageGet.getScaledInstance(lblBackground.getWidth(), lblBackground.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image = new ImageIcon(imageSize);
		lblBackground.setIcon(image);
	}
	
	
	/**
	 * Sets the background image for the frame.
	 */
	private void setWoodBackgr() {
		ImageIcon path = new ImageIcon(GameEnvironmentPanel.class.getResource("../images/wood_bckgr.jpg"));
		Image imageGet = path.getImage();
		Image imageSize = imageGet.getScaledInstance(lblWoodBackgr.getWidth(), lblWoodBackgr.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image = new ImageIcon(imageSize);
		lblWoodBackgr.setIcon(image);
	}
	
	/**
	 * Sets the money bag image for the player's money available.
	 */
	private void setMoneyImage() {
		ImageIcon path = new ImageIcon(GameEnvironmentPanel.class.getResource("../images/money.png"));
		Image imageGet = path.getImage();
		Image imageSize = imageGet.getScaledInstance(lblMoneyImage.getWidth(), lblMoneyImage.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image = new ImageIcon(imageSize);
		lblMoneyImage.setIcon(image);
	}
	
	
	/**
	 * Handles random events.
	 * @return an integer to represent which random event should occur
	 */
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
