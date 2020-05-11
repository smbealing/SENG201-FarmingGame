package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;

public class GameEnvironmentPanel {

	private JFrame frmFarmiza;

	/**
	 * Launch the application.
	 */
	public void ActivatePanel() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameEnvironmentPanel window = new GameEnvironmentPanel();
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
	public GameEnvironmentPanel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFarmiza = new JFrame();
		frmFarmiza.setBounds(100, 100, 800, 550);
		frmFarmiza.setIconImage(Toolkit.getDefaultToolkit().getImage(GameEnvironmentPanel.class.getResource("../images/logo.jpg")));
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFarmiza.getContentPane().setLayout(null);
		
		JButton btnNextDay = new JButton("NEXT DAY");
		btnNextDay.setBounds(598, 423, 176, 64);
		frmFarmiza.getContentPane().add(btnNextDay);
		
		JButton btnFarm = new JButton("[farm name]");
		btnFarm.setBounds(10, 123, 176, 64);
		frmFarmiza.getContentPane().add(btnFarm);
		
		JButton btnFarmer = new JButton("[farmer name]");
		btnFarmer.setBounds(10, 198, 176, 64);
		frmFarmiza.getContentPane().add(btnFarmer);
		
		JButton btnCrop = new JButton("Look After Crops");
		btnCrop.setBounds(10, 273, 176, 64);
		frmFarmiza.getContentPane().add(btnCrop);
		
		JButton btnAnimal = new JButton("Look After Animals");
		btnAnimal.setBounds(10, 348, 176, 64);
		frmFarmiza.getContentPane().add(btnAnimal);
		
//		JLabel lblBackground = new JLabel("");
//		lblBackground.setIcon(new ImageIcon(GameEnvironmentPanel.class.getResource("../images/")));
//		lblBackground.setBounds(0, 0, 784, 511);
//		frame.getContentPane().add(lblBackground);
		
		JLabel lblTotalMoney = new JLabel("[money]");
		lblTotalMoney.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTotalMoney.setBounds(483, 11, 103, 45);
		frmFarmiza.getContentPane().add(lblTotalMoney);
		
		JLabel lblCurrentDay = new JLabel("DAY : [day/total days]");
		lblCurrentDay.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCurrentDay.setBounds(598, 11, 176, 45);
		frmFarmiza.getContentPane().add(lblCurrentDay);
		
		JButton btnShop = new JButton("SHOP");
		btnShop.setBounds(10, 423, 176, 64);
		frmFarmiza.getContentPane().add(btnShop);
		
		JLabel lblMoneyImage = new JLabel("$image");
		lblMoneyImage.setIcon(new ImageIcon(GameEnvironmentPanel.class.getResource("../images/logo.jpg")));
		lblMoneyImage.setBounds(426, 11, 47, 45);
		frmFarmiza.getContentPane().add(lblMoneyImage);
		
		JLabel lblFarmiza = new JLabel("WELCOME TO FARMIZA!");
		lblFarmiza.setFont(new Font("Tahoma", Font.BOLD, 33));
		lblFarmiza.setBounds(10, 11, 406, 101);
		frmFarmiza.getContentPane().add(lblFarmiza);
	}
}
