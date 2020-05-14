package gui.crop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

import crop.Crop;

public class CropStatusPanel {
	
	public Crop crop;

	private JFrame frmFarmiza;

	/**
	 * Launch the application.
	 */
	public void ActivatePanel(){
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
	public CropStatusPanel(Crop tempCrop) {
		crop = tempCrop;
		initialize();
		ActivatePanel();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFarmiza = new JFrame();
		frmFarmiza.setTitle("Farmiza");
		frmFarmiza.setBounds(100, 100, 422, 411);
		frmFarmiza.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFarmiza.getContentPane().setLayout(null);
		
		JLabel lblCropStatus = new JLabel("Crop Status");
		lblCropStatus.setHorizontalAlignment(SwingConstants.CENTER);
		lblCropStatus.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblCropStatus.setBounds(109, 11, 188, 48);
		frmFarmiza.getContentPane().add(lblCropStatus);
		
		JLabel lblCropSelected = new JLabel("Crop selected: " + crop.getName());
		lblCropSelected.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblCropSelected.setBounds(29, 67, 367, 46);
		frmFarmiza.getContentPane().add(lblCropSelected);
		
		JLabel lblThirst = new JLabel("Thirst level: " + crop.getThirstLevel() + "/10");
		lblThirst.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblThirst.setBounds(29, 107, 179, 48);
		frmFarmiza.getContentPane().add(lblThirst);
		
		JLabel lblGrown = new JLabel("Grown for: " + crop.getCurrentGrowthLevel() + " day(s)");
		lblGrown.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblGrown.setBounds(29, 152, 205, 48);
		frmFarmiza.getContentPane().add(lblGrown);
		
		JLabel lblDaysTilHarvest = new JLabel("Day(s) left until harvest: " + crop.getDaysUntilHarvest() + " day(s)");
		lblDaysTilHarvest.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblDaysTilHarvest.setBounds(29, 197, 324, 48);
		frmFarmiza.getContentPane().add(lblDaysTilHarvest);
		
		JLabel lblPlanted = new JLabel(planted());
		lblPlanted.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlanted.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblPlanted.setBounds(9, 245, 387, 48);
		frmFarmiza.getContentPane().add(lblPlanted);
		
		JButton btnClose = new JButton("CLOSE");
		btnClose.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		btnClose.setBounds(144, 315, 118, 46);
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				frmFarmiza.dispose();
			}
		});
		frmFarmiza.getContentPane().add(btnClose);
	}
	
	private String planted() {
		String planted = "This crop has not been planted";
		
		if (crop.planted) {
			planted = "This crop is planted";
		}
		
		return planted;
	}
}
