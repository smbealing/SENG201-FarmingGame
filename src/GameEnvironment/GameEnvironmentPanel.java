package GameEnvironment;

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

public class GameEnvironmentPanel {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
		btnNextDay.setBounds(598, 423, 176, 64);
		frame.getContentPane().add(btnNextDay);
		
		JButton btnFarm = new JButton("[farm name]");
		btnFarm.setBounds(10, 123, 176, 64);
		frame.getContentPane().add(btnFarm);
		
		JButton btnFarmer = new JButton("[farmer name]");
		btnFarmer.setBounds(10, 198, 176, 64);
		frame.getContentPane().add(btnFarmer);
		
		JButton btnCrop = new JButton("Look After Crops");
		btnCrop.setBounds(10, 273, 176, 64);
		frame.getContentPane().add(btnCrop);
		
		JButton btnAnimal = new JButton("Look After Animals");
		btnAnimal.setBounds(10, 348, 176, 64);
		frame.getContentPane().add(btnAnimal);
		
//		JLabel lblBackground = new JLabel("");
//		lblBackground.setIcon(new ImageIcon(GameEnvironmentPanel.class.getResource("../images/")));
//		lblBackground.setBounds(0, 0, 784, 511);
//		frame.getContentPane().add(lblBackground);
		
		JLabel lblTotalMoney = new JLabel("[money]");
		lblTotalMoney.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTotalMoney.setBounds(483, 11, 103, 45);
		frame.getContentPane().add(lblTotalMoney);
		
		JLabel lblCurrentDay = new JLabel("DAY : [day/total days]");
		lblCurrentDay.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCurrentDay.setBounds(598, 11, 176, 45);
		frame.getContentPane().add(lblCurrentDay);
		
		JButton btnShop = new JButton("SHOP");
		btnShop.setBounds(10, 423, 176, 64);
		frame.getContentPane().add(btnShop);
		
		JLabel lblMoneyImage = new JLabel("$image");
		lblMoneyImage.setIcon(new ImageIcon(GameEnvironmentPanel.class.getResource("../images/logo.jpg")));
		lblMoneyImage.setBounds(426, 11, 47, 45);
		frame.getContentPane().add(lblMoneyImage);
		
		JLabel lblFarmiza = new JLabel("WELCOME TO FARMIZA!");
		lblFarmiza.setFont(new Font("Tahoma", Font.BOLD, 33));
		lblFarmiza.setBounds(10, 11, 406, 101);
		frame.getContentPane().add(lblFarmiza);
	}
}
