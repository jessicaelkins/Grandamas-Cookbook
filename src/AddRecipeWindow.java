import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

import javax.swing.ButtonGroup;


import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;


public class AddRecipeWindow {

	private JFrame frameAddRecipe;
	private JTextField txtRecipeName;
	private JPanel panelSubmit;

	/**
	 * Launch the application.
	 */
	public static void newRecipe() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddRecipeWindow window = new AddRecipeWindow();
					window.frameAddRecipe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AddRecipeWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		// create add recipe frame
		frameAddRecipe = new JFrame();
		frameAddRecipe.setTitle("Add Recipe");
		frameAddRecipe.setBounds(100, 100, 1280, 732);
		frameAddRecipe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameAddRecipe.getContentPane().setLayout(null);
		
		// create recipe entry panel
		JPanel panelRecipe = new JPanel();
		panelRecipe.setBounds(27, 150, 591, 161);
		frameAddRecipe.getContentPane().add(panelRecipe);
		panelRecipe.setLayout(null);
		
		// create recipe name label
		JLabel lblNewLabel = new JLabel("Recipe Name:");
		lblNewLabel.setBounds(28, 27, 129, 21);
		panelRecipe.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		//create recipe name text box
		txtRecipeName = new JTextField();
		txtRecipeName.setBounds(28, 67, 494, 34);
		panelRecipe.add(txtRecipeName);
		txtRecipeName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtRecipeName.setColumns(10);
		
		// create ingredients label
		JLabel lblNewLabel_1 = new JLabel("Ingredients:\r\n");
		lblNewLabel_1.setBounds(28, 135, 142, 26);
		panelRecipe.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		// create category label
		JLabel lblNewLabel_2 = new JLabel("Category:");
		lblNewLabel_2.setBounds(417, 136, 90, 23);
		panelRecipe.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		// create add recipe panel
		JPanel panelAddRecipe = new JPanel();
		panelAddRecipe.setBounds(107, 46, 335, 78);
		frameAddRecipe.getContentPane().add(panelAddRecipe);
		panelAddRecipe.setLayout(null);
		
		// create add recipe panel
		JLabel lblAddRecipe = new JLabel("Add Recipe");
		lblAddRecipe.setBounds(51, 10, 222, 55);
		panelAddRecipe.add(lblAddRecipe);
		lblAddRecipe.setFont(new Font("Tahoma", Font.PLAIN, 45));
		
		// create submit recipe panel
		panelSubmit = new JPanel();
		panelSubmit.setBounds(701, 597, 257, 78);
		frameAddRecipe.getContentPane().add(panelSubmit);
		panelSubmit.setLayout(null);
		
		// create submit recipe button
		JButton btnSubmitButton = new JButton("SUBMIT RECIPE");
		btnSubmitButton.setBounds(29, 10, 204, 58);
		panelSubmit.add(btnSubmitButton);
		btnSubmitButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		// create panel for picture 
		JPanel panelPicture = new JPanel();
		panelPicture.setBounds(701, 150, 525, 302);
		frameAddRecipe.getContentPane().add(panelPicture);
		panelPicture.setLayout(null);
		
		JLabel lblPic = new JLabel("");
		lblPic.setBounds(0, 0, 515, 302);
		panelPicture.add(lblPic);
		
		JPanel panel_TA = new JPanel();
		panel_TA.setBounds(27, 321, 386, 227);
		frameAddRecipe.getContentPane().add(panel_TA);
		panel_TA.setLayout(null);
		
		JTextArea jta = new JTextArea();
		jta.setFont(new Font("Tahoma", Font.PLAIN, 19));
		jta.setLineWrap(true);
		
		JScrollPane sp = new JScrollPane(jta, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		sp.setLocation(27, 0);
		sp.setSize(359, 226);
		
		
		panel_TA.add(sp);
		
		JPanel panel_RB = new JPanel();
		panel_RB.setBounds(423, 321, 195, 227);
		frameAddRecipe.getContentPane().add(panel_RB);
		panel_RB.setLayout(null);
		
		JRadioButton rdbtnBreakfast = new JRadioButton(" Breakfast");
		rdbtnBreakfast.setSelected(true);
		rdbtnBreakfast.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnBreakfast.setBounds(19, 16, 125, 21);
		panel_RB.add(rdbtnBreakfast);
		
		JRadioButton rdbtnLunch = new JRadioButton(" Lunch");
		rdbtnLunch.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnLunch.setBounds(19, 51, 125, 21);
		panel_RB.add(rdbtnLunch);
		
		JRadioButton rdbtnDinner = new JRadioButton(" Dinner");
		rdbtnDinner.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnDinner.setBounds(19, 86, 125, 21);
		panel_RB.add(rdbtnDinner);
		
		JRadioButton rdbtnDessert = new JRadioButton(" Dessert");
		rdbtnDessert.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnDessert.setBounds(19, 120, 125, 21);
		panel_RB.add(rdbtnDessert);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdbtnBreakfast);
		bg.add(rdbtnLunch);
		bg.add(rdbtnDinner);
		bg.add(rdbtnDessert);
		
		JPanel panelBack = new JPanel();
		panelBack.setBounds(968, 597, 220, 78);
		frameAddRecipe.getContentPane().add(panelBack);
		panelBack.setLayout(null);
		
		JButton buttonBack = new JButton("BACK");
		buttonBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MenuWindow.main(null);
				frameAddRecipe.dispose();
			}
		});
		buttonBack.setFont(new Font("Tahoma", Font.PLAIN, 20));
		buttonBack.setBounds(10, 10, 186, 58);
		panelBack.add(buttonBack);
	}
}



