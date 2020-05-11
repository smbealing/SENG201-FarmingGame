package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

public class GameEnvironmentPanel {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public void ActivatePanel() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameEnvironmentPanel window = new GameEnvironmentPanel();
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
	public GameEnvironmentPanel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 550);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(GameEnvironmentPanel.class.getResource("../images/logo.jpg")));
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNextDay = new JButton("NEXT DAY");
		btnNextDay.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnNextDay.setBounds(598, 423, 176, 64);
		frame.getContentPane().add(btnNextDay);
		
		JButton btnFarm = new JButton("[farm name]");
		btnFarm.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnFarm.setBounds(10, 123, 176, 64);
		frame.getContentPane().add(btnFarm);
		
		JButton btnFarmer = new JButton("[farmer name]");
		btnFarmer.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnFarmer.setBounds(10, 198, 176, 64);
		frame.getContentPane().add(btnFarmer);
		
		JButton btnCrop = new JButton("LOOK AFTER CROPS");
		btnCrop.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		btnCrop.setBounds(10, 273, 176, 64);
		frame.getContentPane().add(btnCrop);
		
		JButton btnAnimal = new JButton("LOOK AFTER ANIMALS");
		btnAnimal.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		btnAnimal.setBounds(10, 348, 176, 64);
		frame.getContentPane().add(btnAnimal);
		
//		JLabel lblBackground = new JLabel("");
//		lblBackground.setIcon(new ImageIcon(GameEnvironmentPanel.class.getResource("../images/")));
//		lblBackground.setBounds(0, 0, 784, 511);
//		frame.getContentPane().add(lblBackground);
		
		JLabel lblTotalMoney = new JLabel("[money]");
		lblTotalMoney.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblTotalMoney.setBounds(483, 11, 103, 45);
		frame.getContentPane().add(lblTotalMoney);
		
		JLabel lblCurrentDay = new JLabel("DAY : [day/total days]");
		lblCurrentDay.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblCurrentDay.setBounds(598, 11, 176, 45);
		frame.getContentPane().add(lblCurrentDay);
		
		JButton btnShop = new JButton("SHOP");
		btnShop.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnShop.setBounds(10, 423, 176, 64);
		frame.getContentPane().add(btnShop);
		
		JLabel lblMoneyImage = new JLabel("$image");
		lblMoneyImage.setIcon(new ImageIcon(GameEnvironmentPanel.class.getResource("../images/logo.jpg")));
		lblMoneyImage.setBounds(426, 11, 47, 45);
		frame.getContentPane().add(lblMoneyImage);
		
		JLabel lblFarmiza = new JLabel("WELCOME TO FARMIZA!");
		lblFarmiza.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		lblFarmiza.setBounds(10, 11, 406, 101);
		frame.getContentPane().add(lblFarmiza);
	}
}
