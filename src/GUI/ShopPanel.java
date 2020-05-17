package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;

import gameEnvironment.GameState;

public class ShopPanel {

	private JFrame frmFarmiza;
	
	public GameState state;

	/**
	 * Launch the application.
	 */
	public void ActivatePanel(final GameState tempState) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					state = tempState;
					ShopPanel window = new ShopPanel();
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
	public ShopPanel() {
		initialize();
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
		
		
		JLabel lblShop = new JLabel("MARKET");
		lblShop.setHorizontalAlignment(SwingConstants.CENTER);
		lblShop.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 35));
		lblShop.setBounds(280, 22, 224, 52);
		frmFarmiza.getContentPane().add(lblShop);
		
		JLabel lblMoneyImage = new JLabel("$image");
		lblMoneyImage.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		lblMoneyImage.setBounds(10, 29, 53, 45);
		frmFarmiza.getContentPane().add(lblMoneyImage);
		
		JLabel lblTotalMoney = new JLabel("[money]");
		lblTotalMoney.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblTotalMoney.setBounds(67, 29, 103, 45);
		frmFarmiza.getContentPane().add(lblTotalMoney);
		
		JLabel lblCropItems = new JLabel("Crop Items");
		lblCropItems.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 24));
		lblCropItems.setBounds(105, 313, 146, 35);
		frmFarmiza.getContentPane().add(lblCropItems);
		
		JLabel lblCrops = new JLabel("Crops");
		lblCrops.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 24));
		lblCrops.setBounds(127, 85, 124, 35);
		frmFarmiza.getContentPane().add(lblCrops);
		
		JLabel lblAnimals = new JLabel("Animals");
		lblAnimals.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 24));
		lblAnimals.setBounds(527, 85, 115, 35);
		frmFarmiza.getContentPane().add(lblAnimals);
		
		JLabel lblAnimalFood = new JLabel("Animal Food");
		lblAnimalFood.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 24));
		lblAnimalFood.setBounds(507, 313, 199, 35);
		frmFarmiza.getContentPane().add(lblAnimalFood);
		
		
		
		JLabel lblBanana = new JLabel();
		lblBanana.setHorizontalAlignment(SwingConstants.CENTER);
		lblBanana.setText("<html><body>Banana<br>Cost:<br>Days to havest:</body></html>");
		lblBanana.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblBanana.setBounds(10, 116, 107, 45);
		frmFarmiza.getContentPane().add(lblBanana);
		
		JLabel lblCorn = new JLabel("[PRODUCT $COST]");
		lblCorn.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		lblCorn.setBounds(128, 116, 107, 35);
		frmFarmiza.getContentPane().add(lblCorn);
		
		JButton btnBuyCorn = new JButton("BUY");
		btnBuyCorn.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		btnBuyCorn.setBounds(138, 169, 64, 23);
		frmFarmiza.getContentPane().add(btnBuyCorn);
		
		JLabel lblPotato = new JLabel("[PRODUCT $COST]");
		lblPotato.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		lblPotato.setBounds(240, 116, 115, 35);
		frmFarmiza.getContentPane().add(lblPotato);
		
		JButton btnBuyPotato = new JButton("BUY");
		btnBuyPotato.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		btnBuyPotato.setBounds(250, 169, 64, 23);
		frmFarmiza.getContentPane().add(btnBuyPotato);
		
		JLabel lblTomato = new JLabel("[PRODUCT $COST]");
		lblTomato.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		lblTomato.setBounds(10, 224, 107, 35);
		frmFarmiza.getContentPane().add(lblTomato);
		
		JButton btnBuyTomato = new JButton("BUY");
		btnBuyTomato.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		btnBuyTomato.setBounds(30, 253, 64, 23);
		frmFarmiza.getContentPane().add(btnBuyTomato);
		
		JLabel lblWheat = new JLabel("[PRODUCT $COST]");
		lblWheat.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		lblWheat.setBounds(128, 224, 107, 35);
		frmFarmiza.getContentPane().add(lblWheat);
		
		JButton btnBuyBanana = new JButton("BUY");
		btnBuyBanana.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		btnBuyBanana.setBounds(30, 169, 64, 23);
		frmFarmiza.getContentPane().add(btnBuyBanana);
		
		JButton btnBuyWheat = new JButton("BUY");
		btnBuyWheat.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		btnBuyWheat.setBounds(138, 253, 64, 23);
		frmFarmiza.getContentPane().add(btnBuyWheat);
		
		JLabel lblDragonFruit = new JLabel("[PRODUCT $COST]");
		lblDragonFruit.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		lblDragonFruit.setBounds(240, 224, 115, 35);
		frmFarmiza.getContentPane().add(lblDragonFruit);
		
		JButton btnBuyDragonFruit = new JButton("BUY");
		btnBuyDragonFruit.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		btnBuyDragonFruit.setBounds(250, 253, 64, 23);
		frmFarmiza.getContentPane().add(btnBuyDragonFruit);
		
		JLabel lblCow = new JLabel("[PRODUCT $COST]");
		lblCow.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		lblCow.setBounds(466, 126, 119, 35);
		frmFarmiza.getContentPane().add(lblCow);
		
		JButton btnBuyCow = new JButton("BUY");
		btnBuyCow.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		btnBuyCow.setBounds(476, 155, 64, 23);
		frmFarmiza.getContentPane().add(btnBuyCow);
		
		JLabel lblHorse = new JLabel("[PRODUCT $COST]");
		lblHorse.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		lblHorse.setBounds(595, 126, 115, 35);
		frmFarmiza.getContentPane().add(lblHorse);
		
		JButton btnBuyHorse = new JButton("BUY");
		btnBuyHorse.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		btnBuyHorse.setBounds(605, 155, 64, 23);
		frmFarmiza.getContentPane().add(btnBuyHorse);
		
		JLabel lblSheep = new JLabel("[PRODUCT $COST]");
		lblSheep.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		lblSheep.setBounds(534, 224, 115, 35);
		frmFarmiza.getContentPane().add(lblSheep);
		
		JButton btnBuySheep = new JButton("BUY");
		btnBuySheep.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		btnBuySheep.setBounds(544, 253, 64, 23);
		frmFarmiza.getContentPane().add(btnBuySheep);
		
		JLabel lblFertiliser = new JLabel("[PRODUCT $COST]");
		lblFertiliser.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		lblFertiliser.setBounds(67, 359, 108, 35);
		frmFarmiza.getContentPane().add(lblFertiliser);
		
		JButton btnBuyFertiliser = new JButton("BUY");
		btnBuyFertiliser.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		btnBuyFertiliser.setBounds(77, 388, 64, 23);
		frmFarmiza.getContentPane().add(btnBuyFertiliser);
		
		JLabel lblPesticide = new JLabel("[PRODUCT $COST]");
		lblPesticide.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		lblPesticide.setBounds(185, 359, 115, 35);
		frmFarmiza.getContentPane().add(lblPesticide);
		
		JButton btnBuyPesticide = new JButton("BUY");
		btnBuyPesticide.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		btnBuyPesticide.setBounds(195, 388, 64, 23);
		frmFarmiza.getContentPane().add(btnBuyPesticide);
		
		JLabel lblCarrot = new JLabel("[PRODUCT $COST]");
		lblCarrot.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		lblCarrot.setBounds(421, 359, 115, 35);
		frmFarmiza.getContentPane().add(lblCarrot);
		
		JButton btnBuyCarrot = new JButton("BUY");
		btnBuyCarrot.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		btnBuyCarrot.setBounds(431, 388, 64, 23);
		frmFarmiza.getContentPane().add(btnBuyCarrot);
		
		JLabel lblGrain = new JLabel("[PRODUCT $COST]");
		lblGrain.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		lblGrain.setBounds(537, 359, 115, 35);
		frmFarmiza.getContentPane().add(lblGrain);
		
		JButton btnBuyGrain = new JButton("BUY");
		btnBuyGrain.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		btnBuyGrain.setBounds(547, 388, 64, 23);
		frmFarmiza.getContentPane().add(btnBuyGrain);
		
		JLabel lblHighQualityGrain = new JLabel("[PRODUCT $COST]");
		lblHighQualityGrain.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		lblHighQualityGrain.setBounds(646, 359, 115, 35);
		frmFarmiza.getContentPane().add(lblHighQualityGrain);
		
		JButton btnBuyHighQualityGrain = new JButton("BUY");
		btnBuyHighQualityGrain.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		btnBuyHighQualityGrain.setBounds(656, 388, 64, 23);
		frmFarmiza.getContentPane().add(btnBuyHighQualityGrain);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btnBack.setBounds(336, 455, 111, 45);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				frmFarmiza.dispose();
			}
		});
		frmFarmiza.getContentPane().add(btnBack);
	}

}
