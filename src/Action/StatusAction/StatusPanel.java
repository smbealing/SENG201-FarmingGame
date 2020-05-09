package Action.StatusAction;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;

public class StatusPanel {

	private JFrame frmFarmiza;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StatusPanel window = new StatusPanel();
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
	public StatusPanel() {
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
		
		JButton btnBackToFarm = new JButton("Back to Farm");
		btnBackToFarm.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		btnBackToFarm.setBounds(10, 435, 764, 65);
		frmFarmiza.getContentPane().add(btnBackToFarm);
		
		JButton btnFarmerStatus = new JButton("Farmer Status");
		btnFarmerStatus.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		btnFarmerStatus.setBounds(22, 52, 348, 65);
		frmFarmiza.getContentPane().add(btnFarmerStatus);
		
		JButton btnCropStatus = new JButton("Crops Status");
		btnCropStatus.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		btnCropStatus.setBounds(22, 195, 348, 65);
		frmFarmiza.getContentPane().add(btnCropStatus);
		
		JButton btnFarmStatus = new JButton("Farm Status");
		btnFarmStatus.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		btnFarmStatus.setBounds(411, 52, 348, 65);
		frmFarmiza.getContentPane().add(btnFarmStatus);
		
		JButton btnAnimalsStatus = new JButton("Animals Status");
		btnAnimalsStatus.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		btnAnimalsStatus.setBounds(411, 195, 348, 65);
		frmFarmiza.getContentPane().add(btnAnimalsStatus);
	}

}
