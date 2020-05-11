package GUI.Animal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class AnimalInventoryPanel {

	private JFrame frmFarmiza;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnimalInventoryPanel window = new AnimalInventoryPanel();
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
	public AnimalInventoryPanel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFarmiza = new JFrame();
		frmFarmiza.setTitle("Farmiza");
		frmFarmiza.setBounds(100, 100, 529, 352);
		frmFarmiza.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFarmiza.getContentPane().setLayout(null);
		

		JLabel lblAnimalInventory = new JLabel("ANIMAL INVENTORY");
		lblAnimalInventory.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 35));
		lblAnimalInventory.setBounds(67, 11, 379, 52);
		frmFarmiza.getContentPane().add(lblAnimalInventory);

		
		JButton btnBack = new JButton("BACK");
		btnBack.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btnBack.setBounds(201, 257, 111, 45);
		frmFarmiza.getContentPane().add(btnBack);
		
		JLabel lblAnimalFood = new JLabel("Animal Food");

		lblAnimalFood.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnimalFood.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 24));
		lblAnimalFood.setBounds(160, 74, 193, 35);
		frmFarmiza.getContentPane().add(lblAnimalFood);
		
		JLabel label = new JLabel("[PRODUCT AMOUNT]");
		label.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		label.setBounds(26, 156, 127, 35);
		frmFarmiza.getContentPane().add(label);
		
		JLabel label_2 = new JLabel("[PRODUCT AMOUNT]");
		label_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		label_2.setBounds(185, 156, 127, 35);
		frmFarmiza.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("[PRODUCT AMOUNT]");
		label_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		label_3.setBounds(350, 156, 127, 35);
		frmFarmiza.getContentPane().add(label_3);

		lblAnimalFood.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblAnimalFood.setBounds(179, 74, 152, 35);
		frmFarmiza.getContentPane().add(lblAnimalFood);
		
		
	}

}
