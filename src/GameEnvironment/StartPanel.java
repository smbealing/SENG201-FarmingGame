package GameEnvironment;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class StartPanel {

	private JFrame frmFarmiza;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartPanel window = new StartPanel();
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
	public StartPanel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFarmiza = new JFrame();
		frmFarmiza.setTitle("Farmiza");
		frmFarmiza.setBounds(100, 100, 814, 552);
		frmFarmiza.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFarmiza.getContentPane().setLayout(null);
		
		JLabel lblFarmiza = new JLabel("Farmiza");
		lblFarmiza.setHorizontalAlignment(SwingConstants.CENTER);
		lblFarmiza.setFont(new Font("Gabbaland", Font.BOLD, 90));
		lblFarmiza.setBounds(10, 21, 764, 155);
		frmFarmiza.getContentPane().add(lblFarmiza);
		
<<<<<<< HEAD
		JLabel lblNewLabel_1 = new JLabel("Farmiza");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Gabbaland", Font.BOLD, 60));
		lblNewLabel_1.setBounds(10, 21, 414, 78);
		frmFarmiza.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Play");
		btnNewButton.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		btnNewButton.setBounds(10, 172, 414, 32);
		frmFarmiza.getContentPane().add(btnNewButton);
=======
		JButton btnPlay = new JButton("Play");
		btnPlay.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		btnPlay.setBounds(10, 362, 764, 64);
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SelectDaysPanel newPanel = new SelectDaysPanel();
				frmFarmiza.dispose();
				newPanel.ActivatePanel();
			}
		});
		frmFarmiza.getContentPane().add(btnPlay);
>>>>>>> ca41f85672cdb180bf78e6e92f10577cb05c1197
		
		JButton btnQuit = new JButton("Quit");
		btnQuit.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		btnQuit.setBounds(10, 436, 764, 64);
		btnQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmFarmiza.dispose();
			}
		});
		frmFarmiza.getContentPane().add(btnQuit);
	}
}
