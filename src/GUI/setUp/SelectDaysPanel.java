package gui.setUp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import gui.GameEnvironmentPanel;

import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JSlider;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;

public class SelectDaysPanel {
	
	/**
	 * Stores the number of days the player chooses for game duration.
	 */
	private int totalNumDays;

	private JFrame frmFarmiza;
	private JLabel lblBackgr;
	

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
		frmFarmiza.setIconImage(Toolkit.getDefaultToolkit().getImage(GameEnvironmentPanel.class.getResource("../images/logo.jpg")));
		frmFarmiza.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFarmiza.getContentPane().setLayout(null);
		frmFarmiza.setResizable(false);
		
		JLabel lblDaysQuestion = new JLabel("How many days would you like to play for?");
		lblDaysQuestion.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
		lblDaysQuestion.setHorizontalAlignment(SwingConstants.CENTER);
		lblDaysQuestion.setBounds(81, 99, 632, 72);
		frmFarmiza.getContentPane().add(lblDaysQuestion);
		
		final JSlider sldDaySelection = new JSlider();
		sldDaySelection.setBackground(new Color(0, 153, 255));
		sldDaySelection.setForeground(new Color(0, 0, 0));
		sldDaySelection.setFont(new Font("Arial", Font.PLAIN, 14));
		sldDaySelection.setValue(5);
		sldDaySelection.setPaintTicks(true);
		sldDaySelection.setPaintLabels(true);
		sldDaySelection.setMinimum(5);
		sldDaySelection.setMaximum(10);
		sldDaySelection.setMajorTickSpacing(1);
		sldDaySelection.setToolTipText("");
		sldDaySelection.setBounds(84, 213, 626, 45);
		frmFarmiza.getContentPane().add(sldDaySelection);
		
		JButton btnNext = new JButton("Next");
		btnNext.setBackground(new Color(153, 204, 0));
		btnNext.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		btnNext.setBounds(134, 436, 525, 64);
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				totalNumDays = sldDaySelection.getValue();
				CreateFarmerPanel newPanel = new CreateFarmerPanel();
				CreateFarmerPanel.selections(totalNumDays);
				frmFarmiza.dispose();
				newPanel.ActivatePanel();
			}
		});
		frmFarmiza.getContentPane().add(btnNext);
		
		lblBackgr = new JLabel("");
		lblBackgr.setBounds(0, 0, 794, 521);
		frmFarmiza.getContentPane().add(lblBackgr);
		setBackgr();
	}
	
	private void setBackgr() {
		ImageIcon path = new ImageIcon(GameEnvironmentPanel.class.getResource("../images/set_up.jpg"));
		Image imageGet = path.getImage();
		Image imageSize = imageGet.getScaledInstance(lblBackgr.getWidth(), lblBackgr.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image = new ImageIcon(imageSize);
		lblBackgr.setIcon(image);
	}
}
