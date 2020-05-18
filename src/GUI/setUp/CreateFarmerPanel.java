package gui.setUp;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import farm.Farmer;
import gui.GameEnvironmentPanel;

import javax.swing.JButton;

public class CreateFarmerPanel {

	private JFrame frmFarmiza;
	private JTextField txfFarmerName;
	private JTextField txfFarmerAge;
	public static int numDays;

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
	
	
	public static void selections(int days) {
		numDays = days;
	}
	
	//Checks farmer name is valid
	private boolean farmerNameIsValid(String name) {
		Pattern p = Pattern.compile("[^a-z ]", Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(name);
		boolean b = m.find();

		if (b) {
		   return false;
		}
		return true;
		
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFarmiza = new JFrame();
		frmFarmiza.setTitle("Farmiza");
		frmFarmiza.setBounds(100, 100, 800, 550);
		frmFarmiza.setIconImage(Toolkit.getDefaultToolkit().getImage(GameEnvironmentPanel.class.getResource("../images/logo.jpg")));
		frmFarmiza.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFarmiza.getContentPane().setLayout(null);
		
		txfFarmerName = new JTextField();
		txfFarmerName.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		txfFarmerName.setBounds(394, 71, 365, 49);
		frmFarmiza.getContentPane().add(txfFarmerName);
		txfFarmerName.setColumns(10);
		
		JLabel lblFarmerNameQuestion = new JLabel("Give your farmer a name:");
		lblFarmerNameQuestion.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblFarmerNameQuestion.setBounds(24, 72, 410, 48);
		frmFarmiza.getContentPane().add(lblFarmerNameQuestion);
		
		JLabel lblFarmerAgeQuestion = new JLabel("How old is your farmer?");
		lblFarmerAgeQuestion.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblFarmerAgeQuestion.setBounds(24, 205, 378, 72);
		frmFarmiza.getContentPane().add(lblFarmerAgeQuestion);
		
		txfFarmerAge = new JTextField();
		txfFarmerAge.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		txfFarmerAge.setColumns(10);
		txfFarmerAge.setBounds(394, 222, 365, 49);
		frmFarmiza.getContentPane().add(txfFarmerAge);
		
		
		JButton btnNext = new JButton("Next");
		btnNext.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		btnNext.setBounds(129, 436, 525, 64);
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				// Check farmer's name and age
				String name = txfFarmerName.getText().trim();
				if (name.length() < 3 || name.length() > 15 || !(farmerNameIsValid(name))) {
					DisclaimerFarmerName newDisclaimerPanel = new DisclaimerFarmerName();
					newDisclaimerPanel.ActivatePanel();
				} else {
					int age;
					try {
						age = Integer.parseInt(txfFarmerAge.getText().trim());
						if (age < 20 || age > 70) {
							DisclaimerFarmerAge newDisclaimerPanel = new DisclaimerFarmerAge();
							newDisclaimerPanel.ActivatePanel();
						} else {
							CreateFarmPanel newPanel = new CreateFarmPanel();
							Farmer newFarmer = new Farmer();
							newFarmer.setName(name);
							newFarmer.setAge(age);
							CreateFarmPanel.selections(numDays, newFarmer);
							frmFarmiza.dispose();
							newPanel.ActivatePanel();
						}
					} catch (NumberFormatException e) {
						DisclaimerFarmerAge newDisclaimerPanel = new DisclaimerFarmerAge();
						newDisclaimerPanel.ActivatePanel();
					}
					
				}
			}
		});
		frmFarmiza.getContentPane().add(btnNext);
	}
}
