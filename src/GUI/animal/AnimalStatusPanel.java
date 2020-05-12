package gui.animal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

import gameEnvironment.GameState;
import gui.GameEnvironmentPanel;
import javax.swing.SwingConstants;

public class AnimalStatusPanel {
	
	public GameState state;

	private JFrame frmFarmiza;

	/**
	 * Launch the application.
	 */
	public void ActivatePanel(final GameState state) {
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
		frmFarmiza.setBounds(100, 100,  450, 243);
		frmFarmiza.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFarmiza.getContentPane().setLayout(null);
		
		JButton btnClose = new JButton("CLOSE");
		btnClose.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
		btnClose.setBounds(160, 160, 111, 33);
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {

//				GameEnvironmentPanel newPanel = new GameEnvironmentPanel();
				frmFarmiza.dispose();
//				newPanel.ActivatePanel();
			}
		});
		frmFarmiza.getContentPane().add(btnClose);
		
		JLabel lblAnimalSelected = new JLabel("Animal selected: [Animal Name]");
		lblAnimalSelected.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		lblAnimalSelected.setBounds(64, 44, 304, 33);
		frmFarmiza.getContentPane().add(lblAnimalSelected);
		
		JLabel lblHealth = new JLabel("Health: 000 / [Max Health]");
		lblHealth.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		lblHealth.setBounds(62, 75, 273, 33);
		frmFarmiza.getContentPane().add(lblHealth);
		
		JLabel lblHappiness = new JLabel("Happiness: 000 / [Max Happiness]");
		lblHappiness.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		lblHappiness.setBounds(64, 107, 304, 33);
		frmFarmiza.getContentPane().add(lblHappiness);
		
		JLabel lblAnimalStatus = new JLabel("Animal Status");
		lblAnimalStatus.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnimalStatus.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblAnimalStatus.setBounds(54, 0, 304, 33);
		frmFarmiza.getContentPane().add(lblAnimalStatus);
	}

}
