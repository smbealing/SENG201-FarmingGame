package gui.setUp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

import gui.GameEnvironmentPanel;

public class DisclaimerFarmName {

	private JFrame frmFarmiza;

	/**
	 * Launch the application.
	 */
	public void ActivatePanel() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DisclaimerFarmName window = new DisclaimerFarmName();
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
	public DisclaimerFarmName() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFarmiza = new JFrame();
		frmFarmiza.setTitle("Farmiza");
		frmFarmiza.setBounds(100, 100, 450, 243);
		frmFarmiza.setIconImage(Toolkit.getDefaultToolkit().getImage(GameEnvironmentPanel.class.getResource("../images/logo.jpg")));
		frmFarmiza.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFarmiza.getContentPane().setLayout(null);
		
		JButton btnClose = new JButton("CLOSE");
		btnClose.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btnClose.setBounds(138, 139, 157, 54);
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				frmFarmiza.dispose();
			}
		});
		frmFarmiza.getContentPane().add(btnClose);
		
		JLabel lblNameFarm = new JLabel("Please give your farm a name with between");
		lblNameFarm.setHorizontalAlignment(SwingConstants.CENTER);
		lblNameFarm.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNameFarm.setBounds(10, 51, 414, 31);
		frmFarmiza.getContentPane().add(lblNameFarm);
		
		JLabel lblMaxCharNum = new JLabel("1 and 15 characters.");
		lblMaxCharNum.setHorizontalAlignment(SwingConstants.CENTER);
		lblMaxCharNum.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblMaxCharNum.setBounds(10, 83, 414, 31);
		frmFarmiza.getContentPane().add(lblMaxCharNum);
	}
}
