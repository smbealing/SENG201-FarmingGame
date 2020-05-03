package GameEnvironment;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;

public class CreateFarmPanel {

	private JFrame frmFarmiza;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateFarmPanel window = new CreateFarmPanel();
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
	public CreateFarmPanel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFarmiza = new JFrame();
		frmFarmiza.setTitle("Farmiza");
		frmFarmiza.setBounds(100, 100, 450, 300);
		frmFarmiza.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFarmiza.getContentPane().setLayout(null);
		
		JButton btnStartFarmingAdventure = new JButton("Start My Farming Adventure!");
		btnStartFarmingAdventure.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		btnStartFarmingAdventure.setBounds(10, 218, 414, 32);
		frmFarmiza.getContentPane().add(btnStartFarmingAdventure);
		
		JLabel lblGiveYourFarm = new JLabel("Give your farm a name:");
		lblGiveYourFarm.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblGiveYourFarm.setBounds(10, 19, 234, 36);
		frmFarmiza.getContentPane().add(lblGiveYourFarm);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(223, 19, 201, 36);
		frmFarmiza.getContentPane().add(textField);
		
		JLabel lblSelectAType = new JLabel("Select a type of farm:");
		lblSelectAType.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblSelectAType.setBounds(10, 66, 414, 36);
		frmFarmiza.getContentPane().add(lblSelectAType);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("City Farm");
		chckbxNewCheckBox.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		chckbxNewCheckBox.setBounds(35, 123, 152, 23);
		frmFarmiza.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxTropicalFarm = new JCheckBox("Tropical Farm");
		chckbxTropicalFarm.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		chckbxTropicalFarm.setBounds(221, 123, 152, 23);
		frmFarmiza.getContentPane().add(chckbxTropicalFarm);
		
		JCheckBox chckbxNormalFarm = new JCheckBox("Normal Farm");
		chckbxNormalFarm.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		chckbxNormalFarm.setBounds(35, 166, 152, 23);
		frmFarmiza.getContentPane().add(chckbxNormalFarm);
		
		JCheckBox chckbxHardcoreFarm = new JCheckBox("Hardcore Farm");
		chckbxHardcoreFarm.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		chckbxHardcoreFarm.setBounds(221, 166, 152, 23);
		frmFarmiza.getContentPane().add(chckbxHardcoreFarm);
	}
}
