import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JComboBox;


public class FenetreTrounois extends JFrame implements ActionListener{
	
	private JButton btnCrerUnNouveau;
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
		
		btnCrerUnNouveau = new JButton("Cr\u00E9er un nouveau tournois");
		btnCrerUnNouveau.setBounds(39, 38, 175, 23);
		frame.getContentPane().add(btnCrerUnNouveau);
		btnCrerUnNouveau.addActionListener(this);
		
		JButton btnGrerLeTrounois = new JButton("G\u00E9rer le trounois");
		btnGrerLeTrounois.setBounds(265, 95, 112, 23);
		frame.getContentPane().add(btnGrerLeTrounois);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(39, 96, 214, 20);
		frame.getContentPane().add(comboBox);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		//Permet d'afficher la ligne selectionné dans un label (String) permet de forcer la conversion
		if(e.getSource() == btnCrerUnNouveau)
		{
			new CreerTournois();
			frame.setVisible(false);
//			System.out.println("test");
//			String nom = '\''+textNom.getText()+'\'';
//			String naiss ='\''+txtAnne.getText()+'\'';
//			String tat = '\''+textTat.getText()+'\'';
//			String prop = '\''+(String)comboBoxP.getSelectedItem()+'\'';
//			String race = '\''+textRace.getText()+'\'';
//			Connection con;
//			try {
//				System.out.println("Creation....");
//				con = DriverManager.getConnection("jdbc:mysql://localhost/veterinaire","root","");
//			
//			Statement stm = con .createStatement();
//			int max = 0;
//			ResultSet set = stm.executeQuery("select max(numa) from animal");
//			set.next();
//			max = Integer.parseInt(set.getString("max(numa)"));
//			max++;
//			stm.executeUpdate("insert into animal values ("+max+","+nom+","+naiss+","+tat+","+race+","+prop+");");
//			} catch (SQLException e1) {
//				// TODO Auto-generated catch block
//				System.out.println("Erreur : "+e1);
//			};
		}
//		else if (e.getSource() == comboBox) lblChoix.setText((String)comboBox.getSelectedItem());
	}
}

