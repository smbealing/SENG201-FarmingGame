package GUI.Crop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class CropInventoryPanel {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CropInventoryPanel window = new CropInventoryPanel();
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
	public CropInventoryPanel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 629, 351);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCropEnventory = new JLabel("CROP EVENTORY");
		lblCropEnventory.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblCropEnventory.setBounds(151, 11, 311, 52);
		frame.getContentPane().add(lblCropEnventory);
		
		JLabel lblCrop = new JLabel("Crops");
		lblCrop.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblCrop.setBounds(111, 69, 75, 35);
		frame.getContentPane().add(lblCrop);
		
		JLabel lblproductAmount = new JLabel("[PRODUCT AMOUNT]");
		lblproductAmount.setBounds(26, 115, 102, 35);
		frame.getContentPane().add(lblproductAmount);
		
		JLabel label_1 = new JLabel("[PRODUCT AMOUNT]");
		label_1.setBounds(174, 115, 102, 35);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("[PRODUCT AMOUNT]");
		label_2.setBounds(26, 161, 102, 35);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("[PRODUCT AMOUNT]");
		label_3.setBounds(174, 161, 102, 35);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("[PRODUCT AMOUNT]");
		label_4.setBounds(26, 210, 102, 35);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("[PRODUCT AMOUNT]");
		label_5.setBounds(174, 207, 102, 35);
		frame.getContentPane().add(label_5);
		
		JLabel lblCropItems = new JLabel("Crop Items");
		lblCropItems.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblCropItems.setBounds(399, 69, 146, 35);
		frame.getContentPane().add(lblCropItems);
		
		JLabel label_7 = new JLabel("[PRODUCT AMOUNT]");
		label_7.setBounds(341, 115, 102, 35);
		frame.getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel("[PRODUCT AMOUNT]");
		label_8.setBounds(482, 115, 102, 35);
		frame.getContentPane().add(label_8);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnBack.setBounds(251, 256, 111, 45);
		frame.getContentPane().add(btnBack);
	}

}
