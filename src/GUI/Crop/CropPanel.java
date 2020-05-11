package GUI.Crop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class CropPanel {

	private JFrame frmFarmiza;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CropPanel window = new CropPanel();
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
	public CropPanel() {
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
		
		JButton button = new JButton("BACK");
		button.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		button.setBounds(336, 455, 111, 45);
		frmFarmiza.getContentPane().add(button);
		
		JLabel lblFarmCrops = new JLabel("FARM CROPS");
		lblFarmCrops.setHorizontalAlignment(SwingConstants.CENTER);
		lblFarmCrops.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 35));
		lblFarmCrops.setBounds(249, 11, 285, 52);
		frmFarmiza.getContentPane().add(lblFarmCrops);
		
		JButton btnPlantCrops = new JButton("PLANT CROPS");
		btnPlantCrops.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		btnPlantCrops.setBounds(10, 111, 176, 64);
		frmFarmiza.getContentPane().add(btnPlantCrops);
		
		JButton btnTendToCrops = new JButton("TEND TO CROPS");
		btnTendToCrops.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		btnTendToCrops.setBounds(10, 186, 176, 64);
		frmFarmiza.getContentPane().add(btnTendToCrops);
		
		JButton btnCheckCropStatus = new JButton("CHECK CROP STATUS");
		btnCheckCropStatus.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		btnCheckCropStatus.setBounds(10, 262, 176, 64);
		frmFarmiza.getContentPane().add(btnCheckCropStatus);
		
		JButton btnCropEnventory = new JButton("CROP INVENTORY");
		btnCropEnventory.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		btnCropEnventory.setBounds(10, 337, 176, 64);
		frmFarmiza.getContentPane().add(btnCropEnventory);
		
		JLabel lblFieldImage = new JLabel("[plants image]");
		lblFieldImage.setHorizontalAlignment(SwingConstants.CENTER);
		lblFieldImage.setBounds(230, 81, 532, 353);
		frmFarmiza.getContentPane().add(lblFieldImage);
	}

}
