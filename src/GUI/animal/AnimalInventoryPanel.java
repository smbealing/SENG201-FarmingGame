package gui.animal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.SwingConstants;

import gameEnvironment.GameState;

public class AnimalInventoryPanel {
	
	public GameState state;

	private JFrame frmFarmiza;

	/**
	 * Launch the application.
	 */
	public void ActivatePanel(final GameState state) {
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
		frmFarmiza.setBounds(100, 100, 800, 550);
		frmFarmiza.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFarmiza.getContentPane().setLayout(null);

		
		JButton btnAnimal1 = new JButton("[Animal 1]");
		btnAnimal1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnAnimal1.setBounds(41, 129, 111, 45);
		btnAnimal1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				AnimalStatusPanel newPanel = new AnimalStatusPanel();
				newPanel.ActivatePanel(state);
			}
		});
		frmFarmiza.getContentPane().add(btnAnimal1);
		
		JButton btnAnimal2 = new JButton("[Animal 2]");
		btnAnimal2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnAnimal2.setBounds(194, 129, 111, 45);
		btnAnimal2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				AnimalStatusPanel newPanel = new AnimalStatusPanel();
				newPanel.ActivatePanel(state);
			}
		});
		frmFarmiza.getContentPane().add(btnAnimal2);
		
		JButton btnAnimal3 = new JButton("[Animal 3]");
		btnAnimal3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnAnimal3.setBounds(338, 129, 111, 45);
		btnAnimal3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				AnimalStatusPanel newPanel = new AnimalStatusPanel();
				newPanel.ActivatePanel(state);
			}
		});
		frmFarmiza.getContentPane().add(btnAnimal3);
		
		JButton btnAnimal4 = new JButton("[Animal 4]");
		btnAnimal4.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnAnimal4.setBounds(476, 129, 111, 45);
		btnAnimal4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				AnimalStatusPanel newPanel = new AnimalStatusPanel();
				newPanel.ActivatePanel(state);
			}
		});
		frmFarmiza.getContentPane().add(btnAnimal4);
		
		JButton btnAnimal5 = new JButton("[Animal 5]");
		btnAnimal5.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnAnimal5.setBounds(613, 129, 111, 45);
		btnAnimal5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				AnimalStatusPanel newPanel = new AnimalStatusPanel();
				newPanel.ActivatePanel(state);
			}
		});
		frmFarmiza.getContentPane().add(btnAnimal5);
		
		JButton btnAnimal6 = new JButton("[Animal 6]");
		btnAnimal6.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnAnimal6.setBounds(41, 281, 111, 45);
		btnAnimal6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				AnimalStatusPanel newPanel = new AnimalStatusPanel();
				newPanel.ActivatePanel(state);
			}
		});
		frmFarmiza.getContentPane().add(btnAnimal6);
		
		JButton btnAnimal7 = new JButton("[Animal 7]");
		btnAnimal7.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnAnimal7.setBounds(194, 281, 111, 45);
		btnAnimal7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				AnimalStatusPanel newPanel = new AnimalStatusPanel();
				newPanel.ActivatePanel(state);
			}
		});
		frmFarmiza.getContentPane().add(btnAnimal7);
		
		JButton btnAnimal8 = new JButton("[Animal 8]");
		btnAnimal8.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnAnimal8.setBounds(338, 281, 111, 45);
		btnAnimal8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				AnimalStatusPanel newPanel = new AnimalStatusPanel();
				newPanel.ActivatePanel(state);
			}
		});
		frmFarmiza.getContentPane().add(btnAnimal8);
		
		JButton btnAnimal9 = new JButton("[Animal 9]");
		btnAnimal9.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnAnimal9.setBounds(476, 281, 111, 45);
		btnAnimal9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				AnimalStatusPanel newPanel = new AnimalStatusPanel();
				newPanel.ActivatePanel(state);
			}
		});
		frmFarmiza.getContentPane().add(btnAnimal9);
		
		JButton btnAnimal10 = new JButton("[Animal 10]");
		btnAnimal10.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnAnimal10.setBounds(613, 281, 111, 45);
		btnAnimal10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				AnimalStatusPanel newPanel = new AnimalStatusPanel();
				newPanel.ActivatePanel(state);
			}
		});
		frmFarmiza.getContentPane().add(btnAnimal10);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btnBack.setBounds(336, 455, 111, 45);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				frmFarmiza.dispose();
			}
		});
		frmFarmiza.getContentPane().add(btnBack);
		
		JLabel lblInstruction = new JLabel("Click on an animal to see its status");
		lblInstruction.setHorizontalAlignment(SwingConstants.CENTER);
		lblInstruction.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 24));
		lblInstruction.setBounds(132, 26, 519, 35);
		frmFarmiza.getContentPane().add(lblInstruction);
		
	}

}
