package gui.crop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

import gameEnvironment.GameState;
import gui.GameEnvironmentPanel;

public class CropStatusPanel {
	
	public GameState state;

	private JFrame frmFarmiza;

	/**
	 * Launch the application.
	 */
	public void ActivatePanel(final GameState state){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CropStatusPanel window = new CropStatusPanel(state);
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
	public CropStatusPanel(GameState tempState) {
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
		
		
		JLabel lblCropSelected = new JLabel("Crop selected:");
		lblCropSelected.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblCropSelected.setBounds(129, 23, 193, 48);
		frmFarmiza.getContentPane().add(lblCropSelected);
		
		JLabel lblThirst = new JLabel("Thirst level:");
		lblThirst.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblThirst.setBounds(129, 99, 156, 48);
		frmFarmiza.getContentPane().add(lblThirst);
		
		JLabel lblGrownFor = new JLabel("Grown for:");
		lblGrownFor.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblGrownFor.setBounds(129, 158, 135, 48);
		frmFarmiza.getContentPane().add(lblGrownFor);
		
		JLabel lblDays = new JLabel("day(s)");
		lblDays.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblDays.setBounds(323, 158, 93, 48);
		frmFarmiza.getContentPane().add(lblDays);
		
		JLabel lblDaysGrown = new JLabel("00");
		lblDaysGrown.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblDaysGrown.setBounds(274, 158, 39, 48);
		frmFarmiza.getContentPane().add(lblDaysGrown);
		
		JLabel lblDaysTilHarvest = new JLabel("Day(s) left until harvest:");
		lblDaysTilHarvest.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblDaysTilHarvest.setBounds(129, 217, 324, 48);
		frmFarmiza.getContentPane().add(lblDaysTilHarvest);
		
		JLabel lblDaysUntilHarvest = new JLabel("00");
		lblDaysUntilHarvest.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblDaysUntilHarvest.setBounds(444, 217, 46, 48);
		frmFarmiza.getContentPane().add(lblDaysUntilHarvest);
		
		JLabel lblNotPlantedMessage = new JLabel("This crop has not been planted");
		lblNotPlantedMessage.setHorizontalAlignment(SwingConstants.CENTER);
		lblNotPlantedMessage.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblNotPlantedMessage.setBounds(129, 299, 525, 48);
		frmFarmiza.getContentPane().add(lblNotPlantedMessage);
		
		JLabel lblCropName = new JLabel("[Crop Name]");
		lblCropName.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblCropName.setBounds(337, 23, 205, 48);
		frmFarmiza.getContentPane().add(lblCropName);
		
		JLabel lblThirstLevel = new JLabel("00");
		lblThirstLevel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblThirstLevel.setBounds(285, 99, 39, 48);
		frmFarmiza.getContentPane().add(lblThirstLevel);
		
		JLabel label = new JLabel("/10");
		label.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		label.setBounds(323, 99, 55, 48);
		frmFarmiza.getContentPane().add(label);
		
		
		JButton btnBackToFarm = new JButton("BACK");
		btnBackToFarm.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		btnBackToFarm.setBounds(129, 436, 525, 64);
		btnBackToFarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
//				GameEnvironmentPanel newPanel = new GameEnvironmentPanel();
				frmFarmiza.dispose();
//				newPanel.ActivatePanel();
			}
		});
		frmFarmiza.getContentPane().add(btnBackToFarm);
	}

}
