import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DinnerRecipes {

	private JFrame frameDinner;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DinnerRecipes window = new DinnerRecipes();
					window.frameDinner.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DinnerRecipes() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
private void initialize() {
		
		// create dinner menu frame
		frameDinner = new JFrame();
		frameDinner.setBounds(100, 100, 1280, 780);
		frameDinner.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameDinner.getContentPane().setLayout(null);
		
		// create dinner panel
		JPanel panelDinner = new JPanel();
		panelDinner.setBounds(141, 45, 986, 114);
		frameDinner.getContentPane().add(panelDinner);
		panelDinner.setLayout(null);
		
		// create dinner recipes label
		JLabel lblDinnerRecipes = new JLabel("Dinner Recipes");
		lblDinnerRecipes.setFont(new Font("Tahoma", Font.PLAIN, 60));
		lblDinnerRecipes.setBounds(261, 20, 487, 73);
		panelDinner.add(lblDinnerRecipes);
		
		// create dinner results panel
		JPanel panelDinnerResults = new JPanel();
		panelDinnerResults.setBounds(141, 215, 986, 472);
		frameDinner.getContentPane().add(panelDinnerResults);
		panelDinnerResults.setLayout(null);
	}
}
