import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class LunchRecipes {

	private JFrame frameLunch;

	/**
	 * Launch the application.
	 */
	public static void LunchScreen() {
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
		frameLunch.setTitle("Lunch Recipes");
		frameLunch.setBounds(100, 100, 1280, 746);
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
		
		// create back button panel
		JPanel panelBack = new JPanel();
		panelBack.setBounds(10, 45, 122, 59);
		frameLunch.getContentPane().add(panelBack);
		panelBack.setLayout(null);
		
		// create back button
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MenuWindow.main(null);
				frameLunch.dispose();
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnBack.setBounds(10, 10, 102, 39);
		panelBack.add(btnBack);
	}
}
