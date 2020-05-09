package GameEnvironment;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class CreateFarmPanel {

	private JFrame frmFarmiza;
	private JTextField tfFarmName;

	/**
	 * Launch the application.
	 */
	public void ActivatePanel() {
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
		frmFarmiza.setBounds(100, 100, 800, 550);
		frmFarmiza.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFarmiza.getContentPane().setLayout(null);
		
		JButton btnStartFarmingAdventure = new JButton("Start My Farming Adventure!");
		btnStartFarmingAdventure.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		btnStartFarmingAdventure.setBounds(10, 435, 764, 65);
		btnStartFarmingAdventure.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				GameEnvironmentPanel newPanel = new GameEnvironmentPanel();
				frmFarmiza.dispose();
//				newPanel.ActivatePanel();
			}
		});
		frmFarmiza.getContentPane().add(btnStartFarmingAdventure);
		
		JLabel lblNameFarm = new JLabel("Give your farm a name:");
		lblNameFarm.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblNameFarm.setBounds(36, 47, 332, 41);
		frmFarmiza.getContentPane().add(lblNameFarm);
		
		tfFarmName = new JTextField();
		tfFarmName.setFont(new Font("Arial", Font.PLAIN, 16));
		tfFarmName.setColumns(10);
		tfFarmName.setBounds(378, 47, 383, 41);
		frmFarmiza.getContentPane().add(tfFarmName);
		
		JLabel lblSelectFarmType = new JLabel("Select a type of farm:");
		lblSelectFarmType.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblSelectFarmType.setBounds(36, 160, 414, 36);
		frmFarmiza.getContentPane().add(lblSelectFarmType);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"City Farm", "Tropical Farm", "Normal Farm", "Hardcore Farm"}));
		comboBox.setFont(new Font("Arial", Font.PLAIN, 18));
		comboBox.setBounds(36, 217, 276, 41);
		frmFarmiza.getContentPane().add(comboBox);
	}
}
