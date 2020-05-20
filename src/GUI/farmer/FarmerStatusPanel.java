package gui.farmer;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

import gameEnvironment.GameState;
import gui.GameEnvironmentPanel;
import java.awt.Color;

public class FarmerStatusPanel {
	
	/**
	 * The game's GameState.
	 */
	public GameState state;

	private JFrame frmFarmiza;
	private JLabel lblBackground;

	/**
	 * Launch the application.
	 */
	public void ActivatePanel() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmFarmiza.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @param tempState  the current GameState
	 */
	public FarmerStatusPanel(final GameState tempState) {
		state = tempState;
		initialize();
		ActivatePanel();
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
		
		JLabel lblFarmerName = new JLabel(state.farmer.getName() + " STATUS");
		lblFarmerName.setHorizontalAlignment(SwingConstants.CENTER);
		lblFarmerName.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
		lblFarmerName.setBounds(125, 11, 534, 69);
		frmFarmiza.getContentPane().add(lblFarmerName);
		
		JLabel lblFarmer = new JLabel("Farmer: " + state.farmer.getName());
		lblFarmer.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblFarmer.setBounds(10, 71, 251, 48);
		frmFarmiza.getContentPane().add(lblFarmer);
		
		JLabel lblAge = new JLabel("Age: " + state.farmer.getAge());
		lblAge.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblAge.setBounds(10, 113, 118, 48);
		frmFarmiza.getContentPane().add(lblAge);
		
		JLabel lblActionsLeftToday = new JLabel("Actions left today: " + state.farmer.getActionCount());
		lblActionsLeftToday.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblActionsLeftToday.setBounds(10, 160, 284, 48);
		frmFarmiza.getContentPane().add(lblActionsLeftToday);
		
		
		JButton btnBackToFarm = new JButton("BACK");
		btnBackToFarm.setBackground(new Color(102, 102, 51));
		btnBackToFarm.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		btnBackToFarm.setBounds(336, 457, 111, 43);
		btnBackToFarm.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent event) {
				new GameEnvironmentPanel(state);
				frmFarmiza.dispose();

			}
		});
		frmFarmiza.getContentPane().add(btnBackToFarm);
		
		lblBackground = new JLabel("");
		lblBackground.setBounds(0, 0, 794, 521);
		frmFarmiza.getContentPane().add(lblBackground);
		setWoodBackgr();
	}
	
	private void setWoodBackgr() {
		ImageIcon path = new ImageIcon(GameEnvironmentPanel.class.getResource("../images/farmer.jpg"));
		Image imageGet = path.getImage();
		Image imageSize = imageGet.getScaledInstance(lblBackground.getWidth(), lblBackground.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image = new ImageIcon(imageSize);
		lblBackground.setIcon(image);
	}
}
