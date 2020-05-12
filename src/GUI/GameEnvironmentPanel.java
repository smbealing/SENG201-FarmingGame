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
import action.farmAction.NextDay;
import gui.animal.AnimalPanel;
import gui.crop.CropPanel;
import gui.farm.FarmStatusPanel;
import gui.farmer.FarmerStatusPanel;

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
		
		JButton btnFarm = new JButton(state.farm.getName());
		btnFarm.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		btnFarm.setBounds(10, 118, 176, 64);
		btnFarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				FarmStatusPanel farmStatusPanel = new FarmStatusPanel();
				farmStatusPanel.ActivatePanel(state);
			}
		});
		frmFarmiza.getContentPane().add(btnFarm);
		
		JButton btnFarmer = new JButton(state.farmer.getName());
		btnFarmer.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		btnFarmer.setBounds(10, 197, 176, 64);
		btnFarmer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				FarmerStatusPanel farmerStatusPanel = new FarmerStatusPanel();
				farmerStatusPanel.ActivatePanel(state);
			}
		});
		frmFarmiza.getContentPane().add(btnFarmer);
		
		JButton btnCrop = new JButton("LOOK AFTER CROPS");
		btnCrop.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		btnCrop.setBounds(10, 275, 176, 64);
		btnCrop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				CropPanel cropPanel = new CropPanel(state);
				cropPanel.ActivatePanel(state);
			}
		});
		frmFarmiza.getContentPane().add(btnCrop);
		
		JButton btnAnimal = new JButton("LOOK AFTER ANIMALS");
		btnAnimal.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		btnAnimal.setBounds(10, 355, 176, 64);
		btnAnimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				AnimalPanel animalPanel = new AnimalPanel();
				animalPanel.ActivatePanel(state);
			}
		});
		frmFarmiza.getContentPane().add(btnAnimal);
		
		JLabel lblTotalMoney = new JLabel( "$" + Math.round(state.totalMoney));
		lblTotalMoney.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblTotalMoney.setBounds(483, 43, 103, 45);
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
				shopPanel.ActivatePanel(state);
			}
		});
		frmFarmiza.getContentPane().add(btnShop);
		
		JLabel lblMoneyImage = new JLabel("$image");
		lblMoneyImage.setIcon(new ImageIcon(GameEnvironmentPanel.class.getResource("../images/money.png")));
		lblMoneyImage.setBounds(426, 46, 47, 45);
		frmFarmiza.getContentPane().add(lblMoneyImage);
		
		JLabel lblFarmiza = new JLabel("WELCOME TO FARMIZA!");
		lblFarmiza.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		lblFarmiza.setBounds(10, 35, 406, 53);
		frmFarmiza.getContentPane().add(lblFarmiza);
		
		JButton btnHelp = new JButton("HELP");
		btnHelp.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		btnHelp.setBounds(709, 9, 65, 28);
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
				GameEnvironmentPanel refresh = new GameEnvironmentPanel(state);
				refresh.ActivatePanel(state);
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
}
