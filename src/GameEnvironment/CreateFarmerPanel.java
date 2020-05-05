package GameEnvironment;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class CreateFarmerPanel {

	private JFrame frmFarmiza;
	private JTextField tfFarmerName;
	private JTextField tfFarmerAge;

	/**
	 * Launch the application.
	 */
	public void ActivatePanel() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateFarmerPanel window = new CreateFarmerPanel();
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
	public CreateFarmerPanel() {
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
		
		tfFarmerName = new JTextField();
		tfFarmerName.setFont(new Font("Arial", Font.PLAIN, 16));
		tfFarmerName.setBounds(394, 71, 365, 49);
		frmFarmiza.getContentPane().add(tfFarmerName);
		tfFarmerName.setColumns(10);
		
		JLabel lblFarmerNameQuestion = new JLabel("Give your farmer a name:");
		lblFarmerNameQuestion.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblFarmerNameQuestion.setBounds(24, 72, 410, 48);
		frmFarmiza.getContentPane().add(lblFarmerNameQuestion);
		
		JLabel lblFarmerAgeQuestion = new JLabel("How old is your farmer?");
		lblFarmerAgeQuestion.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblFarmerAgeQuestion.setBounds(24, 205, 378, 72);
		frmFarmiza.getContentPane().add(lblFarmerAgeQuestion);
		
		tfFarmerAge = new JTextField();
		tfFarmerAge.setFont(new Font("Arial", Font.PLAIN, 16));
		tfFarmerAge.setColumns(10);
		tfFarmerAge.setBounds(394, 222, 365, 49);
		frmFarmiza.getContentPane().add(tfFarmerAge);
		
		JButton btnNext = new JButton("Next");
		btnNext.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		btnNext.setBounds(10, 436, 764, 64);
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CreateFarmPanel newPanel = new CreateFarmPanel();
				frmFarmiza.dispose();
				newPanel.ActivatePanel();
			}
		});
		frmFarmiza.getContentPane().add(btnNext);
	}
}
