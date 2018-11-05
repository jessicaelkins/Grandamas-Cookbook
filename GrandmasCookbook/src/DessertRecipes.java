import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DessertRecipes {

	private JFrame frameDessert;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
		frameDessert.setBounds(100, 100, 1280, 780);
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
		panelDessertResults.setBounds(141, 215, 986, 472);
		frameDessert.getContentPane().add(panelDessertResults);
		panelDessertResults.setLayout(null);
	}
}

