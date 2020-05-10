package GameEnvironment;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JSlider;
import javax.swing.JButton;

public class SelectDaysPanel {

	private JFrame frmFarmiza;
	private int totalNumDays;

	/**
	 * Launch the application.
	 */
	public void ActivatePanel() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SelectDaysPanel window = new SelectDaysPanel();
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
	public SelectDaysPanel() {
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
		
		JLabel lblDaysQuestion = new JLabel("How many days would you like to play for?");
		lblDaysQuestion.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblDaysQuestion.setHorizontalAlignment(SwingConstants.CENTER);
		lblDaysQuestion.setBounds(76, 99, 632, 72);
		frmFarmiza.getContentPane().add(lblDaysQuestion);
		
		JSlider sldDaySelection = new JSlider();
		sldDaySelection.setFont(new Font("Arial", Font.PLAIN, 14));
		sldDaySelection.setValue(5);
		sldDaySelection.setPaintTicks(true);
		sldDaySelection.setPaintLabels(true);
		sldDaySelection.setMinimum(5);
		sldDaySelection.setMaximum(10);
		sldDaySelection.setMajorTickSpacing(1);
		sldDaySelection.setToolTipText("");
		sldDaySelection.setBounds(79, 285, 626, 45);
		frmFarmiza.getContentPane().add(sldDaySelection);
		
		JButton btnNext = new JButton("Next");
		btnNext.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		btnNext.setBounds(129, 436, 525, 64);
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Fix this!
				totalNumDays = sldDaySelection.getValue();
				CreateFarmerPanel newPanel = new CreateFarmerPanel();
				CreateFarmerPanel.selections(totalNumDays);
				frmFarmiza.dispose();
				newPanel.ActivatePanel();
			}
		});
		frmFarmiza.getContentPane().add(btnNext);
	}
}
