import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;


public class LunchRecipes {

	private JFrame frameLunch;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LunchRecipes window = new LunchRecipes();
					window.frameLunch.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LunchRecipes() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		// create lunch menu frame
		frameLunch = new JFrame();
		frameLunch.setBounds(100, 100, 1280, 780);
		frameLunch.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameLunch.getContentPane().setLayout(null);
		
		// create lunch panel
		JPanel panelLunch = new JPanel();
		panelLunch.setBounds(141, 45, 986, 114);
		frameLunch.getContentPane().add(panelLunch);
		panelLunch.setLayout(null);
		
		// create lunch recipes label
		JLabel lblLunchRecipes = new JLabel("Lunch Recipes");
		lblLunchRecipes.setFont(new Font("Tahoma", Font.PLAIN, 60));
		lblLunchRecipes.setBounds(261, 20, 487, 73);
		panelLunch.add(lblLunchRecipes);
		
		// create lunch results panel
		JPanel panelLunchResults = new JPanel();
		panelLunchResults.setBounds(141, 215, 986, 472);
		frameLunch.getContentPane().add(panelLunchResults);
		panelLunchResults.setLayout(null);
	}
}
