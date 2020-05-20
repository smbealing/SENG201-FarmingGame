package gui.crop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

import crop.Crop;
import gui.GameEnvironmentPanel;
import java.awt.Color;

public class CropStatusPanel {
	
	/**
	 * The crop the player has selected to view the status of
	 */
	public Crop crop;

	private JFrame frmFarmiza;
	private JLabel lblFieldImage;

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
	 * @param tempCrop  the selected crop (Crop)
	 */
	public CropStatusPanel(Crop tempCrop) {
		crop = tempCrop;
		initialize();
		ActivatePanel();
	}

	/**
	 * Initialise the contents of the frame.
	 */
	private void initialize() {
		frmFarmiza = new JFrame();
		frmFarmiza.setTitle("Farmiza");
		frmFarmiza.setBounds(100, 100, 422, 411);
		frmFarmiza.setIconImage(Toolkit.getDefaultToolkit().getImage(GameEnvironmentPanel.class.getResource("../images/logo.jpg")));
		frmFarmiza.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFarmiza.getContentPane().setLayout(null);
		frmFarmiza.setResizable(false);
		
		JLabel lblCropStatus = new JLabel("Crop Status");
		lblCropStatus.setHorizontalAlignment(SwingConstants.CENTER);
		lblCropStatus.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblCropStatus.setBounds(114, 11, 188, 48);
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
		
		JLabel lblDaysTilHarvest = new JLabel("Day(s) left until harvest: " + (crop.getDaysUntilHarvest() - crop.getCurrentGrowthLevel())  + " day(s)");
		lblDaysTilHarvest.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblDaysTilHarvest.setBounds(29, 197, 324, 48);
		frmFarmiza.getContentPane().add(lblDaysTilHarvest);
		
		JLabel lblPlanted = new JLabel(planted());
		lblPlanted.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlanted.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblPlanted.setBounds(9, 245, 387, 48);
		frmFarmiza.getContentPane().add(lblPlanted);
		
		JButton btnClose = new JButton("CLOSE");
		btnClose.setBackground(new Color(102, 102, 51));
		btnClose.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		btnClose.setBounds(149, 315, 118, 46);
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				frmFarmiza.dispose();
			}
		});
		frmFarmiza.getContentPane().add(btnClose);
		
		lblFieldImage = new JLabel("");
		lblFieldImage.setBounds(-21, 0, 884, 625);
		frmFarmiza.getContentPane().add(lblFieldImage);
		setBackgr();
	}
	
	
	/**
	 * Sets the background image for the frame.
	 */
	private void setBackgr() {
		ImageIcon path = new ImageIcon(GameEnvironmentPanel.class.getResource("../images/crops.jpg"));
		Image imageGet = path.getImage();
		Image imageSize = imageGet.getScaledInstance(lblFieldImage.getWidth(), lblFieldImage.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image = new ImageIcon(imageSize);
		lblFieldImage.setIcon(image);
	}
	
	
	/**
	 * Returns a string to say whether the crop has been planted
	 */
	private String planted() {
		String planted = "This crop has not been planted";
		
		if (crop.planted) {
			planted = "This crop is planted";
		}
		
		return planted;
	}
}
