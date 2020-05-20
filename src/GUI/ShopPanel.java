package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;

import animal.Animal;
import animal.Cow;
import animal.Horse;
import animal.Sheep;
import crop.Banana;
import crop.Corn;
import crop.Crop;
import crop.DragonFruit;
import crop.Potato;
import crop.Tomato;
import crop.Wheat;
import gameEnvironment.GameState;
import item.AnimalFood;
import item.Carrot;
import item.CropItem;
import item.Fertiliser;
import item.Grain;
import item.HighQualityGrain;
import item.Pesticide;
import java.awt.Color;

public class ShopPanel {

	private JFrame frmFarmiza;
	private JLabel lblWoodBackgr;
	private JLabel lblMoneyImage;
	private static JLabel lblTotalMoney;
	private static JButton btnBuyBanana;
	private static JButton btnBuyCorn;
	private static JButton btnBuyPotato;
	private static JButton btnBuyTomato;
	private static JButton btnBuyWheat;
	private static JButton btnBuyDragonFruit;
	private static JButton btnBuyCow;
	private static JButton btnBuyHorse;
	private static JButton btnBuySheep;
	private static JButton btnBuyFertiliser;
	private static JButton btnBuyPesticide;
	private static JButton btnBuyCarrot;
	private static JButton btnBuyGrain;
	private static JButton btnBuyHighQualityGrain;
	
	
	/**
	 * The game's GameState
	 */
	public GameState state;
	
	/**
	 * Stores a crop the player wishes to buy.
	 */
	public Crop crop;
	
	/**
	 * Stores an animal the player wishes to buy.
	 */
	public Animal animal;
	
	/**
	 * Stores a crop item the player wishes to buy.
	 */
	public CropItem item;
	
	/**
	 * Stores an animal food item the player wishes to buy.
	 */
	public AnimalFood animalFood;

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
	public ShopPanel(GameState tempState) {
		state = tempState;
		initialize();
		ActivatePanel();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFarmiza = new JFrame();
		frmFarmiza.getContentPane().setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		frmFarmiza.setTitle("Farmiza");
		frmFarmiza.setBounds(100, 100, 800, 550);
		frmFarmiza.setIconImage(Toolkit.getDefaultToolkit().getImage(GameEnvironmentPanel.class.getResource("../images/logo.jpg")));
		frmFarmiza.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFarmiza.getContentPane().setLayout(null);
		frmFarmiza.setResizable(false);
		
		
		JLabel lblShop = new JLabel("MARKET");
		lblShop.setForeground(new Color(153, 204, 0));
		lblShop.setHorizontalAlignment(SwingConstants.CENTER);
		lblShop.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 35));
		lblShop.setBounds(280, 22, 224, 52);
		frmFarmiza.getContentPane().add(lblShop);
		
		lblMoneyImage = new JLabel();
		lblMoneyImage.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		lblMoneyImage.setBounds(10, 22, 53, 45);
		frmFarmiza.getContentPane().add(lblMoneyImage);
		setMoneyImage();
		
		lblTotalMoney = new JLabel();
		lblTotalMoney.setForeground(new Color(153, 204, 0));
		lblTotalMoney.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblTotalMoney.setBounds(67, 29, 103, 45);
		frmFarmiza.getContentPane().add(lblTotalMoney);
		
		JLabel lblCropItems = new JLabel("Crop Items");
		lblCropItems.setForeground(new Color(153, 204, 0));
		lblCropItems.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 24));
		lblCropItems.setBounds(491, 85, 146, 35);
		frmFarmiza.getContentPane().add(lblCropItems);
		
		JLabel lblCrops = new JLabel("Crops");
		lblCrops.setForeground(new Color(153, 204, 0));
		lblCrops.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 24));
		lblCrops.setBounds(127, 85, 124, 35);
		frmFarmiza.getContentPane().add(lblCrops);
		
		JLabel lblAnimals = new JLabel("Animals");
		lblAnimals.setForeground(new Color(153, 204, 0));
		lblAnimals.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 24));
		lblAnimals.setBounds(116, 302, 115, 35);
		frmFarmiza.getContentPane().add(lblAnimals);
		
		JLabel lblAnimalFood = new JLabel("Animal Food");
		lblAnimalFood.setForeground(new Color(153, 204, 0));
		lblAnimalFood.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 24));
		lblAnimalFood.setBounds(491, 213, 199, 35);
		frmFarmiza.getContentPane().add(lblAnimalFood);
		
		// Banana
		
		JLabel lblBanana = new JLabel();
		lblBanana.setForeground(new Color(153, 204, 51));
		lblBanana.setText("<html><body>Banana<br>Cost: $1.00<br>Days to havest: 6</body></html>");
		lblBanana.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblBanana.setBounds(30, 116, 107, 45);
		frmFarmiza.getContentPane().add(lblBanana);
		
		btnBuyBanana = new JButton("BUY");
		btnBuyBanana.setBackground(new Color(153, 204, 0));
		btnBuyBanana.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		btnBuyBanana.setBounds(30, 169, 64, 23);
		btnBuyBanana.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				crop = new Banana();
				state.totalMoney -= crop.getPurchasingPrice();
				state.crops.add(crop);
				refresh();
			}
		});
		frmFarmiza.getContentPane().add(btnBuyBanana);
		
		// Corn
		
		JLabel lblCorn = new JLabel();
		lblCorn.setForeground(new Color(153, 204, 51));
		lblCorn.setText("<html><body>Corn<br>Cost: $0.50<br>Days to havest: 4</body></html>");
		lblCorn.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblCorn.setBounds(137, 116, 107, 45);
		frmFarmiza.getContentPane().add(lblCorn);
		
		btnBuyCorn = new JButton("BUY");
		btnBuyCorn.setBackground(new Color(153, 204, 0));
		btnBuyCorn.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		btnBuyCorn.setBounds(138, 169, 64, 23);
		btnBuyCorn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				crop = new Corn();
				state.totalMoney -= crop.getPurchasingPrice();
				state.crops.add(crop);
				refresh();
			}
		});
		frmFarmiza.getContentPane().add(btnBuyCorn);
		
		// Potato
		
		JLabel lblPotato = new JLabel();
		lblPotato.setForeground(new Color(153, 204, 51));
		lblPotato.setText("<html><body>Potato<br>Cost: $0.50<br>Days to havest: 4</body></html>");
		lblPotato.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblPotato.setBounds(250, 116, 115, 45);
		frmFarmiza.getContentPane().add(lblPotato);
		
		btnBuyPotato = new JButton("BUY");
		btnBuyPotato.setBackground(new Color(153, 204, 0));
		btnBuyPotato.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		btnBuyPotato.setBounds(250, 169, 64, 23);
		btnBuyPotato.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				crop = new Potato();
				state.totalMoney -= crop.getPurchasingPrice();
				state.crops.add(crop);
				refresh();
			}
		});
		frmFarmiza.getContentPane().add(btnBuyPotato);
		
		// Tomato
		
		JLabel lblTomato = new JLabel();
		lblTomato.setForeground(new Color(153, 204, 51));
		lblTomato.setText("<html><body>Tomato<br>Cost: $0.50<br>Days to havest: 3</body></html>");
		lblTomato.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblTomato.setBounds(30, 204, 107, 54);
		frmFarmiza.getContentPane().add(lblTomato);
		
		btnBuyTomato = new JButton("BUY");
		btnBuyTomato.setBackground(new Color(153, 204, 0));
		btnBuyTomato.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		btnBuyTomato.setBounds(30, 268, 64, 23);
		btnBuyTomato.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				crop = new Tomato();
				state.totalMoney -= crop.getPurchasingPrice();
				state.crops.add(crop);
				refresh();
			}
		});
		frmFarmiza.getContentPane().add(btnBuyTomato);
		
		// Wheat
		
		JLabel lblWheat = new JLabel();
		lblWheat.setForeground(new Color(153, 204, 51));
		lblWheat.setText("<html><body>Wheat<br>Cost: $0.20<br>Days to havest: 5</body></html>");
		lblWheat.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblWheat.setBounds(137, 203, 107, 56);
		frmFarmiza.getContentPane().add(lblWheat);
		
		btnBuyWheat = new JButton("BUY");
		btnBuyWheat.setBackground(new Color(153, 204, 0));
		btnBuyWheat.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		btnBuyWheat.setBounds(138, 268, 64, 23);
		btnBuyWheat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				crop = new Wheat();
				state.totalMoney -= crop.getPurchasingPrice();
				state.crops.add(crop);
				refresh();
			}
		});
		frmFarmiza.getContentPane().add(btnBuyWheat);
		
		// Dragon Fruit
		
		JLabel lblDragonFruit = new JLabel();
		lblDragonFruit.setForeground(new Color(153, 204, 51));
		lblDragonFruit.setText("<html><body>Dragon Fruit<br>Cost: $2.00<br>Days to havest: 7</body></html>");
		lblDragonFruit.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblDragonFruit.setBounds(250, 203, 115, 56);
		frmFarmiza.getContentPane().add(lblDragonFruit);
		
		btnBuyDragonFruit = new JButton("BUY");
		btnBuyDragonFruit.setBackground(new Color(153, 204, 0));
		btnBuyDragonFruit.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		btnBuyDragonFruit.setBounds(250, 268, 64, 23);
		btnBuyDragonFruit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				crop = new DragonFruit();
				state.totalMoney -= crop.getPurchasingPrice();
				state.crops.add(crop);
				refresh();
			}
		});
		frmFarmiza.getContentPane().add(btnBuyDragonFruit);
		
		// Cow
		
		JLabel lblCow = new JLabel();
		lblCow.setForeground(new Color(153, 204, 51));
		lblCow.setText("<html><body>Cow<br>Cost: $40.00</body></html>");
		lblCow.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblCow.setBounds(32, 343, 94, 35);
		frmFarmiza.getContentPane().add(lblCow);
		
		btnBuyCow = new JButton("BUY");
		btnBuyCow.setBackground(new Color(153, 204, 0));
		btnBuyCow.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		btnBuyCow.setBounds(30, 386, 64, 23);
		btnBuyCow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if (state.animals.size() != state.farm.getMaxAnimalCount()) {
					animal = new Cow();
					state.totalMoney -= animal.getPurchasingPrice();
					state.animals.add(animal);
					refresh();
				} else {
					new AnimalCapacityWarningPanel();
				}
			}
		});
		frmFarmiza.getContentPane().add(btnBuyCow);
		
		// Horse
		
		JLabel lblHorse = new JLabel();
		lblHorse.setForeground(new Color(153, 204, 51));
		lblHorse.setText("<html><body>Horse<br>Cost: $89.99</body></html>");
		lblHorse.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblHorse.setBounds(136, 343, 74, 35);
		frmFarmiza.getContentPane().add(lblHorse);
		
		btnBuyHorse = new JButton("BUY");
		btnBuyHorse.setBackground(new Color(153, 204, 0));
		btnBuyHorse.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		btnBuyHorse.setBounds(136, 386, 64, 23);
		btnBuyHorse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if (state.animals.size() != state.farm.getMaxAnimalCount()) {
					animal = new Horse();
					state.totalMoney -= animal.getPurchasingPrice();
					state.animals.add(animal);
					refresh();
				} else {
					new AnimalCapacityWarningPanel();
				}
			}
		});
		frmFarmiza.getContentPane().add(btnBuyHorse);
		
		// Sheep
		
		JLabel lblSheep = new JLabel();
		lblSheep.setForeground(new Color(153, 204, 51));
		lblSheep.setText("<html><body>Sheep<br>Cost: $20.00</body></html>");
		lblSheep.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblSheep.setBounds(245, 338, 84, 45);
		frmFarmiza.getContentPane().add(lblSheep);
		
		btnBuySheep = new JButton("BUY");
		btnBuySheep.setBackground(new Color(153, 204, 0));
		btnBuySheep.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		btnBuySheep.setBounds(245, 386, 64, 23);
		btnBuySheep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if (state.animals.size() != state.farm.getMaxAnimalCount()) {
					animal = new Sheep();
					state.totalMoney -= animal.getPurchasingPrice();
					state.animals.add(animal);
					refresh();
				} else {
					new AnimalCapacityWarningPanel();
				}
			}
		});
		frmFarmiza.getContentPane().add(btnBuySheep);
		
		// Fertiliser
		
		JLabel lblFertiliser = new JLabel();
		lblFertiliser.setForeground(new Color(153, 204, 51));
		lblFertiliser.setText("<html><body>Fertiliser<br>Cost: $31.60</body></html>");
		lblFertiliser.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblFertiliser.setBounds(478, 131, 79, 35);
		frmFarmiza.getContentPane().add(lblFertiliser);
		
		btnBuyFertiliser = new JButton("BUY");
		btnBuyFertiliser.setBackground(new Color(153, 204, 0));
		btnBuyFertiliser.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		btnBuyFertiliser.setBounds(476, 173, 64, 23);
		btnBuyFertiliser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				item = new Fertiliser();
				state.totalMoney -= item.getPurchasingPrice();
				state.cropItems.add(item);
				refresh();
			}
		});
		frmFarmiza.getContentPane().add(btnBuyFertiliser);
		
		// Pesticide
		
		JLabel lblPesticide = new JLabel();
		lblPesticide.setForeground(new Color(153, 204, 51));
		lblPesticide.setText("<html><body>Pesticide<br>Cost: $20.00</body></html>");
		lblPesticide.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblPesticide.setBounds(594, 131, 79, 35);
		frmFarmiza.getContentPane().add(lblPesticide);
		
		btnBuyPesticide = new JButton("BUY");
		btnBuyPesticide.setBackground(new Color(153, 204, 0));
		btnBuyPesticide.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		btnBuyPesticide.setBounds(594, 173, 64, 23);
		btnBuyPesticide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				item = new Pesticide();
				state.totalMoney -= item.getPurchasingPrice();
				state.cropItems.add(item);
				refresh();
			}
		});
		frmFarmiza.getContentPane().add(btnBuyPesticide);
		
		// Carrot
		
		JLabel lblCarrot = new JLabel();
		lblCarrot.setForeground(new Color(153, 204, 51));
		lblCarrot.setText("<html><body>Carrot<br>Cost: $5.00</body></html>");
		lblCarrot.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblCarrot.setBounds(443, 259, 72, 35);
		frmFarmiza.getContentPane().add(lblCarrot);
		
		btnBuyCarrot = new JButton("BUY");
		btnBuyCarrot.setBackground(new Color(153, 204, 0));
		btnBuyCarrot.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		btnBuyCarrot.setBounds(443, 301, 64, 23);
		btnBuyCarrot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				animalFood = new Carrot();
				state.totalMoney -= animalFood.getPurchasingPrice();
				state.animalFood.add(animalFood);
				refresh();
			}
		});
		frmFarmiza.getContentPane().add(btnBuyCarrot);
		
		// Grain
		
		JLabel lblGrain = new JLabel();
		lblGrain.setForeground(new Color(153, 204, 51));
		lblGrain.setText("<html><body>Grain<br>Cost: $24.99</body></html>");
		lblGrain.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblGrain.setBounds(545, 259, 92, 35);
		frmFarmiza.getContentPane().add(lblGrain);
		
		btnBuyGrain = new JButton("BUY");
		btnBuyGrain.setBackground(new Color(153, 204, 0));
		btnBuyGrain.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		btnBuyGrain.setBounds(545, 301, 64, 23);
		btnBuyGrain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				animalFood = new Grain();
				state.totalMoney -= animalFood.getPurchasingPrice();
				state.animalFood.add(animalFood);
				refresh();
			}
		});
		frmFarmiza.getContentPane().add(btnBuyGrain);
		
		// High Quality Grain
		
		JLabel lblHighQualityGrain = new JLabel();
		lblHighQualityGrain.setForeground(new Color(153, 204, 51));
		lblHighQualityGrain.setText("<html><body>High Quality Grain<br>Cost: $49.99</body></html>");
		lblHighQualityGrain.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblHighQualityGrain.setBounds(642, 259, 115, 35);
		frmFarmiza.getContentPane().add(lblHighQualityGrain);
		
		btnBuyHighQualityGrain = new JButton("BUY");
		btnBuyHighQualityGrain.setBackground(new Color(153, 204, 0));
		btnBuyHighQualityGrain.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		btnBuyHighQualityGrain.setBounds(642, 301, 64, 23);
		btnBuyHighQualityGrain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				animalFood = new HighQualityGrain();
				state.totalMoney -= animalFood.getPurchasingPrice();
				state.animalFood.add(animalFood);
				refresh();
			}
		});
		frmFarmiza.getContentPane().add(btnBuyHighQualityGrain);
		
		
		JButton btnBack = new JButton("BACK");
		btnBack.setBackground(new Color(153, 204, 0));
		btnBack.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		btnBack.setBounds(341, 455, 111, 45);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				new GameEnvironmentPanel(state);
				frmFarmiza.dispose();
			}
		});
		frmFarmiza.getContentPane().add(btnBack);
		
		lblWoodBackgr = new JLabel("");
		lblWoodBackgr.setBounds(0, 0, 794, 521);
		frmFarmiza.getContentPane().add(lblWoodBackgr);
		setWoodBackgr();
		
		refresh();
	}
	
	/**
	 * Refreshes the shop after player has made a purchase.
	 */
	private void refresh() {
		lblTotalMoney.setText("$" + String.format("%.2f", state.totalMoney));
		
		checkButton(btnBuyBanana, 1.0);
		checkButton(btnBuyCorn, 0.5);
		checkButton(btnBuyPotato, 0.5);
		checkButton(btnBuyTomato, 0.5);
		checkButton(btnBuyWheat, 0.2);
		checkButton(btnBuyDragonFruit, 2.0);
		checkButton(btnBuyCow, 40.0);
		checkButton(btnBuyHorse, 89.99);
		checkButton(btnBuySheep, 20.0);
		checkButton(btnBuyFertiliser, 31.6);
		checkButton(btnBuyPesticide, 20.0);
		checkButton(btnBuyCarrot, 5.0);
		checkButton(btnBuyGrain, 24.99);
		checkButton(btnBuyHighQualityGrain, 49.99);
	}
	
	/**
	 * Enables or disables buttons based on whether player can afford the item.
	 * @param button  the button for the item in the shop
	 * @param cost  the cost of the item associated with the button
	 */
	private void checkButton(JButton button, double cost) {
		if (state.totalMoney >= cost) {
			button.setEnabled(true);
		} else {
			button.setEnabled(false);
		}
	}
	
	private void setWoodBackgr() {
		ImageIcon path = new ImageIcon(GameEnvironmentPanel.class.getResource("../images/wood_bckgr.jpg"));
		Image imageGet = path.getImage();
		Image imageSize = imageGet.getScaledInstance(lblWoodBackgr.getWidth(), lblWoodBackgr.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image = new ImageIcon(imageSize);
		lblWoodBackgr.setIcon(image);
	}
	
	private void setMoneyImage() {
		ImageIcon path = new ImageIcon(GameEnvironmentPanel.class.getResource("../images/money.png"));
		Image imageGet = path.getImage();
		Image imageSize = imageGet.getScaledInstance(lblMoneyImage.getWidth(), lblMoneyImage.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image = new ImageIcon(imageSize);
		lblMoneyImage.setIcon(image);
	}

}
