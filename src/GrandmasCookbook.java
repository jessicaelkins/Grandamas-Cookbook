import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JButton;

public class GrandmasCookbook {

	private JFrame frameMenu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GrandmasCookbook window = new GrandmasCookbook();
					window.frameMenu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GrandmasCookbook() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		// create menu frame
		frameMenu = new JFrame();
		frameMenu.setTitle("Grandma's Cookbook");
		frameMenu.setBounds(100, 100, 647, 688);
		frameMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameMenu.getContentPane().setLayout(null);


		//create header panel
		JPanel headerPanel = new JPanel();
		headerPanel.setBounds(10, 37, 612, 95);
		frameMenu.getContentPane().add(headerPanel);
		headerPanel.setLayout(null);

		// create Grandma's Cookbook label
		JLabel lblGrandmasCookbook = new JLabel("Grandma's Cookbook");
		lblGrandmasCookbook.setBounds(10, 10, 592, 73);
		headerPanel.add(lblGrandmasCookbook);
		lblGrandmasCookbook.setHorizontalAlignment(SwingConstants.CENTER);
		lblGrandmasCookbook.setFont(new Font("Tahoma", Font.PLAIN, 60));

		// create menu panel
		JPanel menuPanel = new JPanel();
		menuPanel.setBounds(62, 153, 489, 469);
		frameMenu.getContentPane().add(menuPanel);
		menuPanel.setLayout(null);

		// create add recipe button
		JButton btnAddRecipe = new JButton("ADD RECIPE");
		btnAddRecipe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				AddRecipeWindow.newRecipe();
				frameMenu.dispose();
			}
		});
		btnAddRecipe.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAddRecipe.setBounds(53, 32, 408, 61);
		menuPanel.add(btnAddRecipe);

		// create breakfast button
		JButton btnBreakfast = new JButton("BREAKFAST");
		btnBreakfast.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// go to breakfast recipes window and close main menu window
				BreakfastRecipes.BreakfastScreen();
				frameMenu.dispose();
			}
		});
		btnBreakfast.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnBreakfast.setBounds(53, 132, 408, 61);
		menuPanel.add(btnBreakfast);

		// create lunch button
		JButton btnLunch = new JButton("LUNCH");
		btnLunch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// go to lunch recipes window and close main menu window
				LunchRecipes.LunchScreen();
				frameMenu.dispose();
			}
		});
		btnLunch.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLunch.setBounds(53, 219, 408, 61);
		menuPanel.add(btnLunch);

		// create dinner button
		JButton btnDinner = new JButton("DINNER");
		btnDinner.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// go to dinner recipes window and close main menu window
				DinnerRecipes.DinnerScreen();
				frameMenu.dispose();
			}
		});
		btnDinner.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnDinner.setBounds(53, 300, 408, 61);
		menuPanel.add(btnDinner);

		// create dessert button
		JButton btnDessert = new JButton("DESSERT");
		btnDessert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// go to dessert recipes window and close main menu window
				DessertRecipes.DessertScreen();
				frameMenu.dispose();
			}
		});
		btnDessert.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnDessert.setBounds(53, 383, 408, 61);
		menuPanel.add(btnDessert);
	}
}
