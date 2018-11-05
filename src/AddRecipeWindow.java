import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class AddRecipeWindow {

	private JFrame frameAddRecipe;
	private JTextField txtRecipeName;
	private JTextField txtIngredient;
	private JTextField txtIngredient_1;
	private JTextField txtIngredient_2;
	private JComboBox comboBox;
	private JTextField txtIngredient_3;
	private JPanel panelSubmit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
		frameAddRecipe.setBounds(100, 100, 1280, 780);
		frameAddRecipe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameAddRecipe.getContentPane().setLayout(null);
		
		// create recipe entry panel
		JPanel panelRecipe = new JPanel();
		panelRecipe.setBounds(28, 169, 591, 417);
		frameAddRecipe.getContentPane().add(panelRecipe);
		panelRecipe.setLayout(null);
		
		// create recipe name label
		JLabel lblNewLabel = new JLabel("Recipe Name:");
		lblNewLabel.setBounds(28, 27, 129, 21);
		panelRecipe.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		//create recipe name text box
		txtRecipeName = new JTextField();
		txtRecipeName.setBounds(28, 67, 494, 34);
		panelRecipe.add(txtRecipeName);
		txtRecipeName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtRecipeName.setColumns(10);
		
		// create ingredients label
		JLabel lblNewLabel_1 = new JLabel("Ingredients:\r\n");
		lblNewLabel_1.setBounds(28, 129, 142, 26);
		panelRecipe.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		
		//create ingredient text boxes
		txtIngredient = new JTextField();
		txtIngredient.setBounds(28, 169, 329, 34);
		panelRecipe.add(txtIngredient);
		txtIngredient.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtIngredient.setColumns(10);
		
		txtIngredient_1 = new JTextField();
		txtIngredient_1.setBounds(28, 222, 329, 34);
		panelRecipe.add(txtIngredient_1);
		txtIngredient_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtIngredient_1.setColumns(10);
		
		txtIngredient_2 = new JTextField();
		txtIngredient_2.setBounds(28, 278, 329, 34);
		panelRecipe.add(txtIngredient_2);
		txtIngredient_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtIngredient_2.setColumns(10);
		
		txtIngredient_3 = new JTextField();
		txtIngredient_3.setBounds(28, 334, 329, 34);
		panelRecipe.add(txtIngredient_3);
		txtIngredient_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtIngredient_3.setColumns(10);
		
		// create category label
		JLabel lblNewLabel_2 = new JLabel("Category:");
		lblNewLabel_2.setBounds(400, 134, 90, 23);
		panelRecipe.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		// create combo box for different recipe categories
		comboBox = new JComboBox();
		comboBox.setBounds(386, 167, 136, 34);
		panelRecipe.add(comboBox);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Breakfast", "Lunch", "Dinner", "Dessert"}));
		comboBox.setMaximumRowCount(4);
		
		// create radio button to add additional ingredients
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Add Additional Ingredients");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnNewRadioButton.setBounds(374, 344, 211, 21);
		panelRecipe.add(rdbtnNewRadioButton);
		
		// create add recipe panel
		JPanel panelAddRecipe = new JPanel();
		panelAddRecipe.setBounds(95, 58, 335, 78);
		frameAddRecipe.getContentPane().add(panelAddRecipe);
		panelAddRecipe.setLayout(null);
		
		// create add recipe panel
		JLabel lblAddRecipe = new JLabel("Add Recipe");
		lblAddRecipe.setBounds(51, 10, 222, 55);
		panelAddRecipe.add(lblAddRecipe);
		lblAddRecipe.setFont(new Font("Tahoma", Font.PLAIN, 45));
		
		// create submit recipe panel
		panelSubmit = new JPanel();
		panelSubmit.setBounds(862, 641, 257, 78);
		frameAddRecipe.getContentPane().add(panelSubmit);
		panelSubmit.setLayout(null);
		
		// create submit recipe button
		JButton btnSubmitButton = new JButton("Submit Recipe");
		btnSubmitButton.setBounds(32, 10, 204, 58);
		panelSubmit.add(btnSubmitButton);
		btnSubmitButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		// create panel for picture 
		JPanel panelPicture = new JPanel();
		panelPicture.setBounds(691, 82, 532, 504);
		frameAddRecipe.getContentPane().add(panelPicture);
	}
}


