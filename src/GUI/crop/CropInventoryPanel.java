package gui.crop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class CropInventoryPanel {

	private JFrame frmFarmiza;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CropInventoryPanel window = new CropInventoryPanel();
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
	public CropInventoryPanel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFarmiza = new JFrame();
		frmFarmiza.setTitle("Farmiza");
		frmFarmiza.setBounds(100, 100, 629, 351);
		frmFarmiza.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFarmiza.getContentPane().setLayout(null);
		
		JLabel lblCropEnventory = new JLabel("CROP INVENTORY");
		lblCropEnventory.setFont(new Font("Tahoma", Font.BOLD, 35));

		
		JLabel lblCrop = new JLabel("Crops");
		lblCrop.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 24));
		lblCrop.setBounds(111, 69, 460, 35);
		frmFarmiza.getContentPane().add(lblCrop);
		
		JLabel lblproductAmount = new JLabel("[PRODUCT AMOUNT]");
		lblproductAmount.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		lblproductAmount.setBounds(26, 115, 577, 35);
		frmFarmiza.getContentPane().add(lblproductAmount);
		
		JLabel label_1 = new JLabel("[PRODUCT AMOUNT]");
		label_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		label_1.setBounds(174, 115, 429, 35);
		frmFarmiza.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("[PRODUCT AMOUNT]");
		label_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		label_2.setBounds(26, 161, 577, 35);
		frmFarmiza.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("[PRODUCT AMOUNT]");
		label_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		label_3.setBounds(174, 161, 429, 35);
		frmFarmiza.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("[PRODUCT AMOUNT]");
		label_4.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		label_4.setBounds(26, 210, 577, 35);
		frmFarmiza.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("[PRODUCT AMOUNT]");
		label_5.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		label_5.setBounds(174, 207, 429, 35);
		frmFarmiza.getContentPane().add(label_5);
		
		JLabel lblCropItems = new JLabel("Crop Items");
		lblCropItems.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 24));
		lblCropItems.setBounds(399, 69, 172, 35);
		frmFarmiza.getContentPane().add(lblCropItems);
		
		JLabel label_7 = new JLabel("[PRODUCT AMOUNT]");
		label_7.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		label_7.setBounds(341, 115, 262, 35);
		frmFarmiza.getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel("[PRODUCT AMOUNT]");
		label_8.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		label_8.setBounds(482, 115, 121, 35);
		frmFarmiza.getContentPane().add(label_8);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btnBack.setBounds(251, 256, 111, 45);
		frmFarmiza.getContentPane().add(btnBack);
	}

}
