package GUI.Animal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class AnimalPanel {

	private JFrame frmFarmiza;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnimalPanel window = new AnimalPanel();
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
	public AnimalPanel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFarmiza = new JFrame();
		frmFarmiza.setBounds(100, 100, 800, 550);
		frmFarmiza.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFarmiza.getContentPane().setLayout(null);
		
		JLabel lblFarmAnimals = new JLabel("FARM ANIMALS");
		lblFarmAnimals.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 35));
		lblFarmAnimals.setBounds(251, 11, 282, 52);
		frmFarmiza.getContentPane().add(lblFarmAnimals);
		
		JButton btnFeedAnimals = new JButton("FEED ANIMALS");
		btnFeedAnimals.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnFeedAnimals.setBounds(10, 111, 176, 64);
		frmFarmiza.getContentPane().add(btnFeedAnimals);
		
		JButton btnPlayWithAnimals = new JButton("PLAY WITH ANIMALS");
		btnPlayWithAnimals.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		btnPlayWithAnimals.setBounds(10, 186, 176, 64);
		frmFarmiza.getContentPane().add(btnPlayWithAnimals);
		
		JButton btnCheckAnimalStatus = new JButton("CHECK ANIMAL STATUS");
		btnCheckAnimalStatus.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		btnCheckAnimalStatus.setBounds(10, 262, 176, 64);
		frmFarmiza.getContentPane().add(btnCheckAnimalStatus);
		
		JButton btnAnimalInventory = new JButton("ANIMAL INVENTORY");
		btnAnimalInventory.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		btnAnimalInventory.setBounds(10, 337, 176, 64);
		frmFarmiza.getContentPane().add(btnAnimalInventory);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btnBack.setBounds(336, 455, 111, 45);
		frmFarmiza.getContentPane().add(btnBack);
		
		JLabel lblanimalImage = new JLabel("[animal image]");
		lblanimalImage.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		lblanimalImage.setHorizontalAlignment(SwingConstants.CENTER);

		lblanimalImage.setBounds(220, 87, 532, 353);
		frmFarmiza.getContentPane().add(lblanimalImage);

		lblanimalImage.setBounds(230, 81, 532, 353);
		frmFarmiza.getContentPane().add(lblanimalImage);

	}
}