package GUI.Animal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class AnimalPanel {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnimalPanel window = new AnimalPanel();
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
	public AnimalPanel() {
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
		
		JLabel lblFarmAnimals = new JLabel("FARM ANIMALS");
		lblFarmAnimals.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblFarmAnimals.setBounds(251, 11, 282, 52);
		frame.getContentPane().add(lblFarmAnimals);
		
		JButton btnFeedAnimals = new JButton("FEED ANIMALS");
		btnFeedAnimals.setBounds(10, 111, 176, 64);
		frame.getContentPane().add(btnFeedAnimals);
		
		JButton btnPlayWithAnimals = new JButton("PLAY WITH ANIMALS");
		btnPlayWithAnimals.setBounds(10, 186, 176, 64);
		frame.getContentPane().add(btnPlayWithAnimals);
		
		JButton btnCheckAnimalStatus = new JButton("CHECK ANIMAL STATUS");
		btnCheckAnimalStatus.setBounds(10, 262, 176, 64);
		frame.getContentPane().add(btnCheckAnimalStatus);
		
		JButton btnAnimalInventory = new JButton("ANIMAL INVENTORY");
		btnAnimalInventory.setBounds(10, 337, 176, 64);
		frame.getContentPane().add(btnAnimalInventory);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnBack.setBounds(336, 455, 111, 45);
		frame.getContentPane().add(btnBack);
		
		JLabel lblanimalImage = new JLabel("[animal image]");
		lblanimalImage.setHorizontalAlignment(SwingConstants.CENTER);
		lblanimalImage.setBounds(230, 81, 532, 353);
		frame.getContentPane().add(lblanimalImage);
	}
}
