package gui.animal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

import gui.GameEnvironmentPanel;

public class AnimalStatusPanel {

	private JFrame frmFarmiza;

	/**
	 * Launch the application.
	 */
	public void ActivatePanel() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnimalStatusPanel window = new AnimalStatusPanel();
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
	public AnimalStatusPanel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFarmiza = new JFrame();
		frmFarmiza.setTitle("Farmiza");
		frmFarmiza.setBounds(100, 100, 800, 550);
		frmFarmiza.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFarmiza.getContentPane().setLayout(null);
		
		JButton btnBackToFarm = new JButton("BACK");
		btnBackToFarm.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		btnBackToFarm.setBounds(129, 436, 525, 64);
		btnBackToFarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {

//				GameEnvironmentPanel newPanel = new GameEnvironmentPanel();
				frmFarmiza.dispose();
//				newPanel.ActivatePanel();
			}
		});
		frmFarmiza.getContentPane().add(btnBackToFarm);
		
		JLabel lblAnimalSelected = new JLabel("Animal selected:");
		lblAnimalSelected.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblAnimalSelected.setBounds(129, 34, 219, 48);
		frmFarmiza.getContentPane().add(lblAnimalSelected);
		
		JLabel lblAnimalName = new JLabel("[Animal Name]");
		lblAnimalName.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblAnimalName.setBounds(358, 34, 205, 48);
		frmFarmiza.getContentPane().add(lblAnimalName);
		
		JLabel lblHealth = new JLabel("Health:");
		lblHealth.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblHealth.setBounds(129, 152, 98, 48);
		frmFarmiza.getContentPane().add(lblHealth);
		
		JLabel lblHappiness = new JLabel("Happiness:");
		lblHappiness.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblHappiness.setBounds(129, 234, 151, 48);
		frmFarmiza.getContentPane().add(lblHappiness);
		
		JLabel lblAnimalHealth = new JLabel("000");
		lblAnimalHealth.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblAnimalHealth.setBounds(224, 152, 56, 48);
		frmFarmiza.getContentPane().add(lblAnimalHealth);
		
		JLabel lblAnimalHappiness = new JLabel("000");
		lblAnimalHappiness.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblAnimalHappiness.setBounds(276, 234, 56, 48);
		frmFarmiza.getContentPane().add(lblAnimalHappiness);
		
		JLabel lblSlash1 = new JLabel("/");
		lblSlash1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblSlash1.setBounds(276, 152, 19, 48);
		frmFarmiza.getContentPane().add(lblSlash1);
		
		JLabel lblSlash2 = new JLabel("/");
		lblSlash2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblSlash2.setBounds(329, 234, 19, 48);
		frmFarmiza.getContentPane().add(lblSlash2);
		
		JLabel lblMaxHealth = new JLabel("[Max Health]");
		lblMaxHealth.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblMaxHealth.setBounds(290, 152, 273, 48);
		frmFarmiza.getContentPane().add(lblMaxHealth);
		
		JLabel lblMaxHappiness = new JLabel("[Max Happiness]");
		lblMaxHappiness.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblMaxHappiness.setBounds(342, 234, 273, 48);
		frmFarmiza.getContentPane().add(lblMaxHappiness);
	}

}
