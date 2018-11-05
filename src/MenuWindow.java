import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class MenuWindow {

	private JFrame frameMenu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuWindow window = new MenuWindow();
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
	public MenuWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		// create menu frame
		frameMenu = new JFrame();
		frameMenu.setBounds(100, 100, 1280, 780);
		frameMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameMenu.getContentPane().setLayout(null);
		
		//create header panel
		JPanel headerPanel = new JPanel();
		headerPanel.setBounds(71, 39, 1164, 95);
		frameMenu.getContentPane().add(headerPanel);
		headerPanel.setLayout(null);
		
		// create Grandma's Cookbook label
		JLabel lblGrandmasCookbook = new JLabel("Grandma's Cookbook");
		lblGrandmasCookbook.setBounds(87, 10, 937, 73);
		headerPanel.add(lblGrandmasCookbook);
		lblGrandmasCookbook.setHorizontalAlignment(SwingConstants.CENTER);
		lblGrandmasCookbook.setFont(new Font("Tahoma", Font.PLAIN, 60));
		
		// create menu panel
		JPanel menuPanel = new JPanel();
		menuPanel.setBounds(71, 178, 489, 469);
		frameMenu.getContentPane().add(menuPanel);
		menuPanel.setLayout(null);
		
		// create add recipe button
		JButton btnAddRecipe = new JButton("ADD RECIPE");
		btnAddRecipe.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAddRecipe.setBounds(53, 32, 408, 61);
		menuPanel.add(btnAddRecipe);
		
		// create breakfast button
		JButton btnBreakfast = new JButton("BREAKFAST");
		btnBreakfast.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnBreakfast.setBounds(53, 132, 408, 61);
		menuPanel.add(btnBreakfast);
		
		// create lunch button
		JButton btnLunch = new JButton("LUNCH");
		btnLunch.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLunch.setBounds(53, 219, 408, 61);
		menuPanel.add(btnLunch);
		
		// create dinner button
		JButton btnDinner = new JButton("DINNER");
		btnDinner.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnDinner.setBounds(53, 300, 408, 61);
		menuPanel.add(btnDinner);
		
		// create dessert button
		JButton btnDessert = new JButton("DESSERT");
		btnDessert.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnDessert.setBounds(53, 383, 408, 61);
		menuPanel.add(btnDessert);
		
		// create picture panel
		JPanel panel = new JPanel();
		panel.setBounds(609, 178, 626, 469);
		frameMenu.getContentPane().add(panel);
	}
}
