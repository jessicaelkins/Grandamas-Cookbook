import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DinnerRecipes {

	private JFrame frameDinner;

	/**
	 * Launch the application.
	 */
	public static void DinnerScreen() {
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
		frameDinner.setTitle("Dinner Recipes");
		frameDinner.setBounds(100, 100, 1280, 733);
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
		panelDinnerResults.setBounds(141, 199, 986, 472);
		frameDinner.getContentPane().add(panelDinnerResults);
		panelDinnerResults.setLayout(null);
		
		// create back button panel
		JPanel panelBack = new JPanel();
		panelBack.setBounds(10, 45, 123, 57);
		frameDinner.getContentPane().add(panelBack);
		panelBack.setLayout(null);
		
		//create back button
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MenuWindow.main(null);
				frameDinner.dispose();
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnBack.setBounds(10, 10, 103, 37);
		panelBack.add(btnBack);
	}
}
