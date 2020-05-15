package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;

import gameEnvironment.GameState;

import javax.swing.JButton;

public class FarmerWarningPanel {
	
	public GameState state;
	
	private JFrame frmFarmiza;

	/**
	 * Launch the application.
	 */
	public void ActivatePanel() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmFarmiza.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FarmerWarningPanel(GameState tempState) {
		state = tempState;
		initialize();
		ActivatePanel();
	}

	/**
	 * Initialise the contents of the frame.
	 */
	private void initialize() {
		frmFarmiza = new JFrame();
		frmFarmiza.setTitle("Farmiza");
		frmFarmiza.setBounds(100, 100, 501, 214);
		frmFarmiza.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFarmiza.getContentPane().setLayout(null);
		
		JLabel lblError = new JLabel("Looks like <dynamic> is too tired!");
		lblError.setHorizontalAlignment(SwingConstants.CENTER);
		lblError.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 21));
		lblError.setBounds(10, 58, 465, 47);
		frmFarmiza.getContentPane().add(lblError);
		
		JLabel lblWarning = new JLabel("Oh no!");
		lblWarning.setHorizontalAlignment(SwingConstants.CENTER);
		lblWarning.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 21));
		lblWarning.setBounds(197, 25, 91, 34);
		frmFarmiza.getContentPane().add(lblWarning);
		
		JButton btnClose = new JButton("CLOSE");
		btnClose.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btnClose.setBounds(164, 110, 157, 54);
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				frmFarmiza.dispose();
			}
		});
		frmFarmiza.getContentPane().add(btnClose);
	}
}