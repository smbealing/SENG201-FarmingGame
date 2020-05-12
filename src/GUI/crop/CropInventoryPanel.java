package gui.crop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import gameEnvironment.GameState;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.SwingConstants;

public class CropInventoryPanel {

	public GameState state;
	
	private JFrame frmFarmiza;

	/**
	 * Launch the application.
	 */
	public void ActivatePanel(final GameState state) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CropInventoryPanel window = new CropInventoryPanel(state);
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
	public CropInventoryPanel(GameState tempState) {
		state = tempState;
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
		
		JLabel lblCropInventory = new JLabel("CROP INVENTORY");
		lblCropInventory.setFont(new Font("Tahoma", Font.BOLD, 35));
		
		
		JLabel lblInstruction = new JLabel("Click on a crop to see its status");
		lblInstruction.setHorizontalAlignment(SwingConstants.CENTER);
		lblInstruction.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 24));
		lblInstruction.setBounds(173, 11, 438, 35);
		frmFarmiza.getContentPane().add(lblInstruction);
		
		JButton btncrop = new JButton("[Crop 1]");
		btncrop.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btncrop.setBounds(39, 80, 111, 45);
		frmFarmiza.getContentPane().add(btncrop);
		
		JButton btncrop_1 = new JButton("[Crop 2]");
		btncrop_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btncrop_1.setBounds(192, 80, 111, 45);
		frmFarmiza.getContentPane().add(btncrop_1);
		
		JButton btncrop_2 = new JButton("[Crop 3]");
		btncrop_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btncrop_2.setBounds(336, 80, 111, 45);
		frmFarmiza.getContentPane().add(btncrop_2);
		
		JButton btncrop_3 = new JButton("[Crop 4]");
		btncrop_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btncrop_3.setBounds(474, 80, 111, 45);
		frmFarmiza.getContentPane().add(btncrop_3);
		
		JButton btncrop_5 = new JButton("[Crop 6]");
		btncrop_5.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btncrop_5.setBounds(39, 150, 111, 45);
		frmFarmiza.getContentPane().add(btncrop_5);
		
		JButton btncrop_4 = new JButton("[Crop 5]");
		btncrop_4.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btncrop_4.setBounds(611, 80, 111, 45);
		frmFarmiza.getContentPane().add(btncrop_4);
		
		JButton btncrop_6 = new JButton("[Crop 7]");
		btncrop_6.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btncrop_6.setBounds(192, 150, 111, 45);
		frmFarmiza.getContentPane().add(btncrop_6);
		
		JButton btncrop_7 = new JButton("[Crop 8]");
		btncrop_7.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btncrop_7.setBounds(336, 150, 111, 45);
		frmFarmiza.getContentPane().add(btncrop_7);
		
		JButton btncrop_8 = new JButton("[Crop 9]");
		btncrop_8.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btncrop_8.setBounds(474, 150, 111, 45);
		frmFarmiza.getContentPane().add(btncrop_8);
		
		JButton btncrop_9 = new JButton("[Crop 10]");
		btncrop_9.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btncrop_9.setBounds(611, 150, 111, 45);
		frmFarmiza.getContentPane().add(btncrop_9);
		
		JButton btncrop_10 = new JButton("[Crop 11]");
		btncrop_10.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btncrop_10.setBounds(39, 222, 111, 45);
		frmFarmiza.getContentPane().add(btncrop_10);
		
		JButton btncrop_11 = new JButton("[Crop 12]");
		btncrop_11.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btncrop_11.setBounds(192, 222, 111, 45);
		frmFarmiza.getContentPane().add(btncrop_11);
		
		JButton btncrop_12 = new JButton("[Crop 13]");
		btncrop_12.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btncrop_12.setBounds(336, 222, 111, 45);
		frmFarmiza.getContentPane().add(btncrop_12);
		
		JButton btncrop_13 = new JButton("[Crop 14]");
		btncrop_13.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btncrop_13.setBounds(474, 222, 111, 45);
		frmFarmiza.getContentPane().add(btncrop_13);
		
		JButton btncrop_14 = new JButton("[Crop 15]");
		btncrop_14.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btncrop_14.setBounds(611, 222, 111, 45);
		frmFarmiza.getContentPane().add(btncrop_14);
		
		JButton btncrop_15 = new JButton("[Crop 16]");
		btncrop_15.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btncrop_15.setBounds(39, 295, 111, 45);
		frmFarmiza.getContentPane().add(btncrop_15);
		
		JButton btncrop_16 = new JButton("[Crop 17]");
		btncrop_16.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btncrop_16.setBounds(192, 295, 111, 45);
		frmFarmiza.getContentPane().add(btncrop_16);
		
		JButton btncrop_17 = new JButton("[Crop 18]");
		btncrop_17.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btncrop_17.setBounds(336, 295, 111, 45);
		frmFarmiza.getContentPane().add(btncrop_17);
		
		JButton btncrop_18 = new JButton("[Crop 19]");
		btncrop_18.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btncrop_18.setBounds(474, 295, 111, 45);
		frmFarmiza.getContentPane().add(btncrop_18);
		
		JButton btncrop_19 = new JButton("[Crop 20]");
		btncrop_19.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btncrop_19.setBounds(611, 295, 111, 45);
		frmFarmiza.getContentPane().add(btncrop_19);
		
		JButton btncrop_20 = new JButton("[Crop 21]");
		btncrop_20.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btncrop_20.setBounds(39, 364, 111, 45);
		frmFarmiza.getContentPane().add(btncrop_20);
		
		JButton btncrop_21 = new JButton("[Crop 22]");
		btncrop_21.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btncrop_21.setBounds(192, 364, 111, 45);
		frmFarmiza.getContentPane().add(btncrop_21);
		
		JButton btncrop_22 = new JButton("[Crop 23]");
		btncrop_22.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btncrop_22.setBounds(336, 364, 111, 45);
		frmFarmiza.getContentPane().add(btncrop_22);
		
		JButton btncrop_23 = new JButton("[Crop 24]");
		btncrop_23.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btncrop_23.setBounds(474, 364, 111, 45);
		frmFarmiza.getContentPane().add(btncrop_23);
		
		JButton btncrop_24 = new JButton("[Crop 25]");
		btncrop_24.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btncrop_24.setBounds(611, 364, 111, 45);
		frmFarmiza.getContentPane().add(btncrop_24);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btnBack.setBounds(336, 455, 111, 45);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				frmFarmiza.dispose();
			}
		});
		frmFarmiza.getContentPane().add(btnBack);
	}
}
