import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DessertRecipes {

	private JFrame frameDessert;

	/**
	 * Launch the application.
	 */
	public static void DessertScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DessertRecipes window = new DessertRecipes();
					window.frameDessert.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DessertRecipes() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
private void initialize() {
		
		// create dessert menu frame
		frameDessert = new JFrame();
		frameDessert.setTitle("Dessert Recipes");
		frameDessert.setBounds(100, 100, 1280, 735);
		frameDessert.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameDessert.getContentPane().setLayout(null);
		
		
		// create dessert panel
		JPanel panelDessert = new JPanel();
		panelDessert.setBounds(141, 45, 986, 114);
		frameDessert.getContentPane().add(panelDessert);
		panelDessert.setLayout(null);
		
		// create dessert recipes label
		JLabel lblDessertRecipes = new JLabel("Dessert Recipes");
		lblDessertRecipes.setFont(new Font("Tahoma", Font.PLAIN, 60));
		lblDessertRecipes.setBounds(261, 20, 487, 73);
		panelDessert.add(lblDessertRecipes);
		
		// create dessert results panel
		JPanel panelDessertResults = new JPanel();
		panelDessertResults.setBounds(141, 199, 986, 472);
		frameDessert.getContentPane().add(panelDessertResults);
		panelDessertResults.setLayout(null);
		
		// create back button panel
		JPanel panelBack = new JPanel();
		panelBack.setBounds(10, 45, 121, 62);
		frameDessert.getContentPane().add(panelBack);
		panelBack.setLayout(null);
		
		// create back button
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuWindow.main(null);
				frameDessert.dispose();
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnBack.setBounds(10, 10, 101, 42);
		panelBack.add(btnBack);
	}
}
