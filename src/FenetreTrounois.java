import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JList;


public class FenetreTrounois {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FenetreTrounois window = new FenetreTrounois();
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
	public FenetreTrounois() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnCrerUnNouveau = new JButton("Cr\u00E9er un nouveau tournois");
		btnCrerUnNouveau.setBounds(39, 38, 175, 23);
		frame.getContentPane().add(btnCrerUnNouveau);
		
		JList list = new JList();
		list.setBounds(39, 95, 216, 23);
		frame.getContentPane().add(list);
		
		JButton btnGrerLeTrounois = new JButton("G\u00E9rer le trounois");
		btnGrerLeTrounois.setBounds(265, 95, 112, 23);
		frame.getContentPane().add(btnGrerLeTrounois);
	}
}
