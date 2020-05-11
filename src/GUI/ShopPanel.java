package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;

public class ShopPanel {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShopPanel window = new ShopPanel();
					window.frame.setVisible(true);
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
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnBack.setBounds(336, 455, 111, 45);
		frame.getContentPane().add(btnBack);
		
		JLabel lblShop = new JLabel("MARKET");
		lblShop.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblShop.setBounds(316, 22, 152, 52);
		frame.getContentPane().add(lblShop);
		
		JLabel lblMoneyImage = new JLabel("$image");
		lblMoneyImage.setBounds(10, 29, 47, 45);
		frame.getContentPane().add(lblMoneyImage);
		
		JLabel lblTotalMoney = new JLabel("[money]");
		lblTotalMoney.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTotalMoney.setBounds(67, 29, 103, 45);
		frame.getContentPane().add(lblTotalMoney);
		
		JLabel lblCropItems = new JLabel("Crop Items");
		lblCropItems.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblCropItems.setBounds(105, 313, 146, 35);
		frame.getContentPane().add(lblCropItems);
		
		JButton btnNewButton = new JButton("BUY");
		btnNewButton.setBounds(30, 145, 64, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblCrops = new JLabel("Crops");
		lblCrops.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblCrops.setBounds(127, 85, 75, 35);
		frame.getContentPane().add(lblCrops);
		
		JLabel lblAnimals = new JLabel("Animals");
		lblAnimals.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblAnimals.setBounds(515, 85, 103, 35);
		frame.getContentPane().add(lblAnimals);
		
		JLabel lblAnimalFood = new JLabel("Animal Food");
		lblAnimalFood.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblAnimalFood.setBounds(507, 313, 152, 35);
		frame.getContentPane().add(lblAnimalFood);
		
		JLabel lblNewLabel = new JLabel("[PRODUCT $COST]");
		lblNewLabel.setBounds(20, 116, 92, 35);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label_2 = new JLabel("[PRODUCT $COST]");
		label_2.setBounds(128, 116, 92, 35);
		frame.getContentPane().add(label_2);
		
		JButton button = new JButton("BUY");
		button.setBounds(138, 145, 64, 23);
		frame.getContentPane().add(button);
		
		JLabel label_3 = new JLabel("[PRODUCT $COST]");
		label_3.setBounds(240, 116, 92, 35);
		frame.getContentPane().add(label_3);
		
		JButton button_1 = new JButton("BUY");
		button_1.setBounds(250, 145, 64, 23);
		frame.getContentPane().add(button_1);
		
		JLabel label_4 = new JLabel("[PRODUCT $COST]");
		label_4.setBounds(20, 224, 92, 35);
		frame.getContentPane().add(label_4);
		
		JButton button_2 = new JButton("BUY");
		button_2.setBounds(30, 253, 64, 23);
		frame.getContentPane().add(button_2);
		
		JLabel label_5 = new JLabel("[PRODUCT $COST]");
		label_5.setBounds(128, 224, 92, 35);
		frame.getContentPane().add(label_5);
		
		JButton button_3 = new JButton("BUY");
		button_3.setBounds(138, 253, 64, 23);
		frame.getContentPane().add(button_3);
		
		JLabel label_6 = new JLabel("[PRODUCT $COST]");
		label_6.setBounds(240, 224, 92, 35);
		frame.getContentPane().add(label_6);
		
		JButton button_4 = new JButton("BUY");
		button_4.setBounds(250, 253, 64, 23);
		frame.getContentPane().add(button_4);
		
		JLabel label_7 = new JLabel("[PRODUCT $COST]");
		label_7.setBounds(466, 126, 92, 35);
		frame.getContentPane().add(label_7);
		
		JButton button_5 = new JButton("BUY");
		button_5.setBounds(476, 155, 64, 23);
		frame.getContentPane().add(button_5);
		
		JLabel label_8 = new JLabel("[PRODUCT $COST]");
		label_8.setBounds(595, 126, 92, 35);
		frame.getContentPane().add(label_8);
		
		JButton button_6 = new JButton("BUY");
		button_6.setBounds(605, 155, 64, 23);
		frame.getContentPane().add(button_6);
		
		JLabel label_9 = new JLabel("[PRODUCT $COST]");
		label_9.setBounds(534, 224, 92, 35);
		frame.getContentPane().add(label_9);
		
		JButton button_7 = new JButton("BUY");
		button_7.setBounds(544, 253, 64, 23);
		frame.getContentPane().add(button_7);
		
		JLabel label_10 = new JLabel("[PRODUCT $COST]");
		label_10.setBounds(67, 359, 92, 35);
		frame.getContentPane().add(label_10);
		
		JButton button_8 = new JButton("BUY");
		button_8.setBounds(77, 388, 64, 23);
		frame.getContentPane().add(button_8);
		
		JLabel label_11 = new JLabel("[PRODUCT $COST]");
		label_11.setBounds(185, 359, 92, 35);
		frame.getContentPane().add(label_11);
		
		JButton button_9 = new JButton("BUY");
		button_9.setBounds(195, 388, 64, 23);
		frame.getContentPane().add(button_9);
		
		JLabel label_12 = new JLabel("[PRODUCT $COST]");
		label_12.setBounds(421, 359, 92, 35);
		frame.getContentPane().add(label_12);
		
		JButton button_10 = new JButton("BUY");
		button_10.setBounds(431, 388, 64, 23);
		frame.getContentPane().add(button_10);
		
		JLabel label_13 = new JLabel("[PRODUCT $COST]");
		label_13.setBounds(537, 359, 92, 35);
		frame.getContentPane().add(label_13);
		
		JButton button_11 = new JButton("BUY");
		button_11.setBounds(547, 388, 64, 23);
		frame.getContentPane().add(button_11);
		
		JLabel label_14 = new JLabel("[PRODUCT $COST]");
		label_14.setBounds(646, 359, 92, 35);
		frame.getContentPane().add(label_14);
		
		JButton button_12 = new JButton("BUY");
		button_12.setBounds(656, 388, 64, 23);
		frame.getContentPane().add(button_12);
	}

}
