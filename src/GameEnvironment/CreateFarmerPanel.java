package GameEnvironment;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class CreateFarmerPanel {

	private JFrame frmFarmiza;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
		
		textField = new JTextField();
		textField.setBounds(244, 28, 180, 36);
		frmFarmiza.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Give your farmer a name:");
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel.setBounds(10, 28, 234, 36);
		frmFarmiza.getContentPane().add(lblNewLabel);
		
		JLabel lblHowOldIs = new JLabel("How old is your farmer?");
		lblHowOldIs.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblHowOldIs.setBounds(10, 75, 234, 72);
		frmFarmiza.getContentPane().add(lblHowOldIs);
		
		JButton button = new JButton("Next");
		button.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		button.setBounds(10, 218, 414, 32);
		frmFarmiza.getContentPane().add(button);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(244, 90, 180, 36);
		frmFarmiza.getContentPane().add(textField_1);
	}
}
