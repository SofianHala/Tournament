import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class GestionnaireTournois {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestionnaireTournois window = new GestionnaireTournois();
					window.frame.setVisible(true);
					try{
						Class.forName("com.mysql.jdbc.Driver"); // on charge le driver
						Connection con = DriverManager.getConnection("jdbc:mysql://localhost/veterinaire","root","");
						Statement stm = con.createStatement();
						ResultSet res = stm.executeQuery("select * from animal;");
							while(res.next())
							{
								System.out.println("Nom : "+res.getString("noma")+" Tatouage : "+res.getString("tatouage"));
							}
							con.close();
						}
					catch(Exception e){
						System.out.println("Erreur : "+ e.getMessage());
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GestionnaireTournois() {
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
		
		JButton btnGestionnaireDarbitres = new JButton("Gestionnaire d'arbitres");
		btnGestionnaireDarbitres.setBounds(42, 179, 160, 23);
		frame.getContentPane().add(btnGestionnaireDarbitres);
		
		JButton btnGrerLesquipes = new JButton("G\u00E9rer les \u00E9quipes");
		btnGrerLesquipes.setBounds(42, 56, 160, 23);
		frame.getContentPane().add(btnGrerLesquipes);
		
		JButton btnGrerLesPoules = new JButton("G\u00E9rer les poules");
		btnGrerLesPoules.setBounds(42, 101, 160, 23);
		frame.getContentPane().add(btnGrerLesPoules);
		
		JButton btnGrerLesTournois = new JButton("G\u00E9rer les tournois");
		btnGrerLesTournois.setBounds(42, 145, 160, 23);
		frame.getContentPane().add(btnGrerLesTournois);
	}
}
