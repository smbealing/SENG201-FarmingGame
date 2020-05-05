package GameEnvironment;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JSlider;
import javax.swing.JButton;

public class SelectDaysPanel {

	private JFrame frmFarmiza;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
		
		JLabel lblNewLabel = new JLabel("How many days would you like to play for?");
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(20, 25, 392, 72);
		frmFarmiza.getContentPane().add(lblNewLabel);
		
		JSlider slider = new JSlider();
		slider.setValue(5);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.setMinimum(5);
		slider.setMaximum(10);
		slider.setMajorTickSpacing(1);
		slider.setBounds(20, 130, 392, 45);
		frmFarmiza.getContentPane().add(slider);
		
		JButton btnNext = new JButton("Next");
		btnNext.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		btnNext.setBounds(10, 218, 414, 32);
		frmFarmiza.getContentPane().add(btnNext);
	}
}
