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
		
		JButton btnCrop1 = new JButton("[Crop 1]");
		btnCrop1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnCrop1.setBounds(39, 80, 111, 45);
		btnCrop1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				CropStatusPanel newPanel = new CropStatusPanel(state);
				newPanel.ActivatePanel(state);
			}
		});
		frmFarmiza.getContentPane().add(btnCrop1);
		
		JButton btnCrop2 = new JButton("[Crop 2]");
		btnCrop2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnCrop2.setBounds(192, 80, 111, 45);
		btnCrop2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				CropStatusPanel newPanel = new CropStatusPanel(state);
				newPanel.ActivatePanel(state);
			}
		});
		frmFarmiza.getContentPane().add(btnCrop2);
		
		JButton btnCrop3 = new JButton("[Crop 3]");
		btnCrop3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnCrop3.setBounds(336, 80, 111, 45);
		btnCrop3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				CropStatusPanel newPanel = new CropStatusPanel(state);
				newPanel.ActivatePanel(state);
			}
		});
		frmFarmiza.getContentPane().add(btnCrop3);
		
		JButton btnCrop4 = new JButton("[Crop 4]");
		btnCrop4.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnCrop4.setBounds(474, 80, 111, 45);
		btnCrop4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				CropStatusPanel newPanel = new CropStatusPanel(state);
				newPanel.ActivatePanel(state);
			}
		});
		frmFarmiza.getContentPane().add(btnCrop4);
		
		JButton btnCrop6 = new JButton("[Crop 6]");
		btnCrop6.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnCrop6.setBounds(39, 150, 111, 45);
		btnCrop6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				CropStatusPanel newPanel = new CropStatusPanel(state);
				newPanel.ActivatePanel(state);
			}
		});
		frmFarmiza.getContentPane().add(btnCrop6);
		
		JButton btnCrop5 = new JButton("[Crop 5]");
		btnCrop5.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnCrop5.setBounds(611, 80, 111, 45);
		btnCrop5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				CropStatusPanel newPanel = new CropStatusPanel(state);
				newPanel.ActivatePanel(state);
			}
		});
		frmFarmiza.getContentPane().add(btnCrop5);
		
		JButton btnCrop7 = new JButton("[Crop 7]");
		btnCrop7.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnCrop7.setBounds(192, 150, 111, 45);
		btnCrop7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				CropStatusPanel newPanel = new CropStatusPanel(state);
				newPanel.ActivatePanel(state);
			}
		});
		frmFarmiza.getContentPane().add(btnCrop7);
		
		JButton btnCrop8 = new JButton("[Crop 8]");
		btnCrop8.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnCrop8.setBounds(336, 150, 111, 45);
		btnCrop8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				CropStatusPanel newPanel = new CropStatusPanel(state);
				newPanel.ActivatePanel(state);
			}
		});
		frmFarmiza.getContentPane().add(btnCrop8);
		
		JButton btnCrop9 = new JButton("[Crop 9]");
		btnCrop9.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnCrop9.setBounds(474, 150, 111, 45);
		btnCrop9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				CropStatusPanel newPanel = new CropStatusPanel(state);
				newPanel.ActivatePanel(state);
			}
		});
		frmFarmiza.getContentPane().add(btnCrop9);
		
		JButton btnCrop10 = new JButton("[Crop 10]");
		btnCrop10.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnCrop10.setBounds(611, 150, 111, 45);
		btnCrop10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				CropStatusPanel newPanel = new CropStatusPanel(state);
				newPanel.ActivatePanel(state);
			}
		});
		frmFarmiza.getContentPane().add(btnCrop10);
		
		JButton btnCrop11 = new JButton("[Crop 11]");
		btnCrop11.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnCrop11.setBounds(39, 222, 111, 45);
		btnCrop11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				CropStatusPanel newPanel = new CropStatusPanel(state);
				newPanel.ActivatePanel(state);
			}
		});
		frmFarmiza.getContentPane().add(btnCrop11);
		
		JButton btnCrop12 = new JButton("[Crop 12]");
		btnCrop12.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnCrop12.setBounds(192, 222, 111, 45);
		btnCrop12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				CropStatusPanel newPanel = new CropStatusPanel(state);
				newPanel.ActivatePanel(state);
			}
		});
		frmFarmiza.getContentPane().add(btnCrop12);
		
		JButton btnCrop13 = new JButton("[Crop 13]");
		btnCrop13.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnCrop13.setBounds(336, 222, 111, 45);
		btnCrop13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				CropStatusPanel newPanel = new CropStatusPanel(state);
				newPanel.ActivatePanel(state);
			}
		});
		frmFarmiza.getContentPane().add(btnCrop13);
		
		JButton btnCrop14 = new JButton("[Crop 14]");
		btnCrop14.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnCrop14.setBounds(474, 222, 111, 45);
		btnCrop14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				CropStatusPanel newPanel = new CropStatusPanel(state);
				newPanel.ActivatePanel(state);
			}
		});
		frmFarmiza.getContentPane().add(btnCrop14);
		
		JButton btnCrop15 = new JButton("[Crop 15]");
		btnCrop15.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnCrop15.setBounds(611, 222, 111, 45);
		btnCrop15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				CropStatusPanel newPanel = new CropStatusPanel(state);
				newPanel.ActivatePanel(state);
			}
		});
		frmFarmiza.getContentPane().add(btnCrop15);
		
		JButton btnCrop16 = new JButton("[Crop 16]");
		btnCrop16.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnCrop16.setBounds(39, 295, 111, 45);
		btnCrop16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				CropStatusPanel newPanel = new CropStatusPanel(state);
				newPanel.ActivatePanel(state);
			}
		});
		frmFarmiza.getContentPane().add(btnCrop16);
		
		JButton btnCrop17 = new JButton("[Crop 17]");
		btnCrop17.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnCrop17.setBounds(192, 295, 111, 45);
		btnCrop17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				CropStatusPanel newPanel = new CropStatusPanel(state);
				newPanel.ActivatePanel(state);
			}
		});
		frmFarmiza.getContentPane().add(btnCrop17);
		
		JButton btnCrop18 = new JButton("[Crop 18]");
		btnCrop18.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnCrop18.setBounds(336, 295, 111, 45);
		btnCrop18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				CropStatusPanel newPanel = new CropStatusPanel(state);
				newPanel.ActivatePanel(state);
			}
		});
		frmFarmiza.getContentPane().add(btnCrop18);
		
		JButton btnCrop19 = new JButton("[Crop 19]");
		btnCrop19.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnCrop19.setBounds(474, 295, 111, 45);
		btnCrop19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				CropStatusPanel newPanel = new CropStatusPanel(state);
				newPanel.ActivatePanel(state);
			}
		});
		frmFarmiza.getContentPane().add(btnCrop19);
		
		JButton btnCrop20 = new JButton("[Crop 20]");
		btnCrop20.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnCrop20.setBounds(611, 295, 111, 45);
		btnCrop20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				CropStatusPanel newPanel = new CropStatusPanel(state);
				newPanel.ActivatePanel(state);
			}
		});
		frmFarmiza.getContentPane().add(btnCrop20);
		
		JButton btnCrop21 = new JButton("[Crop 21]");
		btnCrop21.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnCrop21.setBounds(39, 364, 111, 45);
		btnCrop21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				CropStatusPanel newPanel = new CropStatusPanel(state);
				newPanel.ActivatePanel(state);
			}
		});
		frmFarmiza.getContentPane().add(btnCrop21);
		
		JButton btnCrop22 = new JButton("[Crop 22]");
		btnCrop22.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnCrop22.setBounds(192, 364, 111, 45);
		btnCrop22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				CropStatusPanel newPanel = new CropStatusPanel(state);
				newPanel.ActivatePanel(state);
			}
		});
		frmFarmiza.getContentPane().add(btnCrop22);
		
		JButton btnCrop23 = new JButton("[Crop 23]");
		btnCrop23.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnCrop23.setBounds(336, 364, 111, 45);
		btnCrop23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				CropStatusPanel newPanel = new CropStatusPanel(state);
				newPanel.ActivatePanel(state);
			}
		});
		frmFarmiza.getContentPane().add(btnCrop23);
		
		JButton btnCrop24 = new JButton("[Crop 24]");
		btnCrop24.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnCrop24.setBounds(474, 364, 111, 45);
		btnCrop24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				CropStatusPanel newPanel = new CropStatusPanel(state);
				newPanel.ActivatePanel(state);
			}
		});
		frmFarmiza.getContentPane().add(btnCrop24);
		
		JButton btnCrop25 = new JButton("[Crop 25]");
		btnCrop25.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnCrop25.setBounds(611, 364, 111, 45);
		btnCrop25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				CropStatusPanel newPanel = new CropStatusPanel(state);
				newPanel.ActivatePanel(state);
			}
		});
		frmFarmiza.getContentPane().add(btnCrop25);
		
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
