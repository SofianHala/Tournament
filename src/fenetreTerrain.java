import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class fenetreTerrain {
	
	private JButton btnCreeUnTerrain;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fenetreTerrain window = new fenetreTerrain();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public fenetreTerrain() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().setLayout(null);
		
		JButton btnCreeUnTerrain = new JButton("Cree un terrain");
		btnCreeUnTerrain.setBounds(169, 152, 142, 55);
		frame.getContentPane().add(btnCreeUnTerrain);
		
		JButton btnNewButton = new JButton("Modifier");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(84, 241, 134, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Liste des terrains");
		btnNewButton_1.setBounds(274, 241, 134, 23);
		frame.getContentPane().add(btnNewButton_1);
		frame.setBounds(100, 100, 528, 458);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
