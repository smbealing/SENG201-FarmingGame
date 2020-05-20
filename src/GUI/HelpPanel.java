package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import java.awt.Color;

public class HelpPanel {

	private JFrame frmFarmiza;
	private JLabel lblBackground;

	/**
	 * Launch the application.
	 */
	public void ActivatePanel() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HelpPanel window = new HelpPanel();
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
	public HelpPanel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFarmiza = new JFrame();
		frmFarmiza.setTitle("Farmiza");
		frmFarmiza.setBounds(100, 100, 800, 550);
		frmFarmiza.setIconImage(Toolkit.getDefaultToolkit().getImage(GameEnvironmentPanel.class.getResource("../images/logo.jpg")));
		frmFarmiza.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFarmiza.getContentPane().setLayout(null);
		frmFarmiza.setResizable(false);
		
		
		JLabel lblHelpTitle = new JLabel("Help");
		lblHelpTitle.setForeground(new Color(153, 204, 51));
		lblHelpTitle.setBackground(new Color(153, 204, 51));
		lblHelpTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblHelpTitle.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
		lblHelpTitle.setBounds(318, 11, 148, 67);
		frmFarmiza.getContentPane().add(lblHelpTitle);
		
		JLabel lblHelpText1 = new JLabel("Click on MARKET to buy new crops, animals and items to look after your farm.");
		lblHelpText1.setForeground(new Color(153, 204, 51));
		lblHelpText1.setBackground(new Color(153, 204, 51));
		lblHelpText1.setHorizontalAlignment(SwingConstants.CENTER);
		lblHelpText1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblHelpText1.setBounds(22, 72, 737, 45);
		frmFarmiza.getContentPane().add(lblHelpText1);
		
		JLabel lblHelpText11 = new JLabel("Crops and animals require different items to grow faster, stay happy and healthy.");
		lblHelpText11.setHorizontalAlignment(SwingConstants.CENTER);
		lblHelpText11.setForeground(new Color(153, 204, 51));
		lblHelpText11.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblHelpText11.setBackground(new Color(153, 204, 51));
		lblHelpText11.setBounds(10, 128, 774, 45);
		frmFarmiza.getContentPane().add(lblHelpText11);
		
		JLabel lblHelpText2 = new JLabel("Your farmer can perform 2 actions a day to look after the crops, animals and farm.");
		lblHelpText2.setForeground(new Color(153, 204, 51));
		lblHelpText2.setBackground(new Color(153, 204, 51));
		lblHelpText2.setHorizontalAlignment(SwingConstants.CENTER);
		lblHelpText2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblHelpText2.setBounds(22, 183, 737, 45);
		frmFarmiza.getContentPane().add(lblHelpText2);
		
		JLabel lblHelpText5 = new JLabel("You will need to take care of your crops and animals to make the biggest profit");
		lblHelpText5.setForeground(new Color(153, 204, 51));
		lblHelpText5.setBackground(new Color(153, 204, 51));
		lblHelpText5.setHorizontalAlignment(SwingConstants.CENTER);
		lblHelpText5.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblHelpText5.setBounds(22, 331, 737, 45);
		frmFarmiza.getContentPane().add(lblHelpText5);
		
		JLabel lblHelpText6 = new JLabel("for your farm.");
		lblHelpText6.setForeground(new Color(153, 204, 51));
		lblHelpText6.setBackground(new Color(153, 204, 51));
		lblHelpText6.setHorizontalAlignment(SwingConstants.CENTER);
		lblHelpText6.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblHelpText6.setBounds(22, 371, 737, 45);
		frmFarmiza.getContentPane().add(lblHelpText6);
		
		
		JButton btnClose = new JButton("Close");
		btnClose.setBackground(new Color(153, 204, 51));
		btnClose.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		btnClose.setBounds(336, 455, 111, 45);
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				frmFarmiza.dispose();
			}
		});
		frmFarmiza.getContentPane().add(btnClose);
		
		JLabel lblHelpText3 = new JLabel("Click on your farm's name to see if your farm land needs tending to. Click on your");
		lblHelpText3.setForeground(new Color(153, 204, 51));
		lblHelpText3.setBackground(new Color(153, 204, 51));
		lblHelpText3.setHorizontalAlignment(SwingConstants.CENTER);
		lblHelpText3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblHelpText3.setBounds(22, 239, 737, 45);
		frmFarmiza.getContentPane().add(lblHelpText3);
		
		JLabel lblHelpText4 = new JLabel("farmer's name to see how many actions they have left today.");
		lblHelpText4.setForeground(new Color(153, 204, 51));
		lblHelpText4.setBackground(new Color(153, 204, 51));
		lblHelpText4.setHorizontalAlignment(SwingConstants.CENTER);
		lblHelpText4.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblHelpText4.setBounds(22, 275, 737, 45);
		frmFarmiza.getContentPane().add(lblHelpText4);
		
		lblBackground = new JLabel("");
		lblBackground.setBounds(0, 0, 794, 521);
		frmFarmiza.getContentPane().add(lblBackground);
		setWoodBackgr();
	}
	
	private void setWoodBackgr() {
		ImageIcon path = new ImageIcon(GameEnvironmentPanel.class.getResource("../images/wood_bckgr.jpg"));
		Image imageGet = path.getImage();
		Image imageSize = imageGet.getScaledInstance(lblBackground.getWidth(), lblBackground.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image = new ImageIcon(imageSize);
		lblBackground.setIcon(image);
	}
}
