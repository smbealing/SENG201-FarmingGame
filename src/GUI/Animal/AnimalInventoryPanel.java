package GUI.Animal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class AnimalInventoryPanel {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnimalInventoryPanel window = new AnimalInventoryPanel();
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
	public AnimalInventoryPanel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 529, 352);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblAnimalEventory = new JLabel("ANIMAL EVENTORY");
		lblAnimalEventory.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblAnimalEventory.setBounds(80, 11, 353, 52);
		frame.getContentPane().add(lblAnimalEventory);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnBack.setBounds(201, 257, 111, 45);
		frame.getContentPane().add(btnBack);
		
		JLabel lblAnimalFood = new JLabel("Animal Food");
		lblAnimalFood.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblAnimalFood.setBounds(179, 74, 152, 35);
		frame.getContentPane().add(lblAnimalFood);
		
		JLabel label = new JLabel("[PRODUCT AMOUNT]");
		label.setBounds(26, 156, 102, 35);
		frame.getContentPane().add(label);
		
		JLabel label_2 = new JLabel("[PRODUCT AMOUNT]");
		label_2.setBounds(210, 156, 102, 35);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("[PRODUCT AMOUNT]");
		label_3.setBounds(375, 156, 102, 35);
		frame.getContentPane().add(label_3);
	}

}
