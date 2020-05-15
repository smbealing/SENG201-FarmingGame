package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;

import gameEnvironment.GameState;

public class HelpPanel {

	private JFrame frmFarmiza;

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
		
		
		JLabel lblHelpTitle = new JLabel("Help");
		lblHelpTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblHelpTitle.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
		lblHelpTitle.setBounds(318, 11, 148, 67);
		frmFarmiza.getContentPane().add(lblHelpTitle);
		
		JLabel lblHelpText1 = new JLabel("Click on SHOP to buy new crops, animals and items to look after your farm.");
		lblHelpText1.setHorizontalAlignment(SwingConstants.CENTER);
		lblHelpText1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblHelpText1.setBounds(22, 100, 737, 45);
		frmFarmiza.getContentPane().add(lblHelpText1);
		
		JLabel lblHelpText2 = new JLabel("Your farmer can perform 2 actions a day to look after the crops, animals and farm.");
		lblHelpText2.setHorizontalAlignment(SwingConstants.CENTER);
		lblHelpText2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblHelpText2.setBounds(22, 165, 737, 45);
		frmFarmiza.getContentPane().add(lblHelpText2);
		
		JLabel lblHelpText5 = new JLabel("You will need to take care of your crops and animals to make the biggest profit");
		lblHelpText5.setHorizontalAlignment(SwingConstants.CENTER);
		lblHelpText5.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblHelpText5.setBounds(22, 359, 737, 45);
		frmFarmiza.getContentPane().add(lblHelpText5);
		
		JLabel lblHelpText6 = new JLabel("for your farm.");
		lblHelpText6.setHorizontalAlignment(SwingConstants.CENTER);
		lblHelpText6.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblHelpText6.setBounds(22, 399, 737, 45);
		frmFarmiza.getContentPane().add(lblHelpText6);
		
		
		JButton btnClose = new JButton("Close");
		btnClose.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btnClose.setBounds(336, 455, 111, 45);
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				frmFarmiza.dispose();
			}
		});
		frmFarmiza.getContentPane().add(btnClose);
		
		JLabel lblHelpText3 = new JLabel("Click on your farm's name to see if your farm land needs tending to. Click on your");
		lblHelpText3.setHorizontalAlignment(SwingConstants.CENTER);
		lblHelpText3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblHelpText3.setBounds(22, 239, 737, 45);
		frmFarmiza.getContentPane().add(lblHelpText3);
		
		JLabel lblHelpText4 = new JLabel("farmer's name to see how many actions they have left today.");
		lblHelpText4.setHorizontalAlignment(SwingConstants.CENTER);
		lblHelpText4.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblHelpText4.setBounds(22, 275, 737, 45);
		frmFarmiza.getContentPane().add(lblHelpText4);
	}
}
