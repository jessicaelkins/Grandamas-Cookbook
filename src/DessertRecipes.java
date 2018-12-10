import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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
		frameDessert.setBounds(100, 100, 701, 700);
		frameDessert.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameDessert.getContentPane().setLayout(null);
		
		
		// create dessert panel
		JPanel panelDessert = new JPanel();
		panelDessert.setBounds(158, 68, 372, 81);
		frameDessert.getContentPane().add(panelDessert);
		panelDessert.setLayout(null);
		
		// create dessert recipes label
		JLabel lblDessertRecipes = new JLabel("Dessert Recipes");
		lblDessertRecipes.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lblDessertRecipes.setBounds(10, 10, 358, 61);
		panelDessert.add(lblDessertRecipes);
		
		// create dessert results panel
		JPanel panelDessertResults = new JPanel();
		panelDessertResults.setBounds(25, 175, 647, 472);
		frameDessert.getContentPane().add(panelDessertResults);
		panelDessertResults.setLayout(null);
		
		// create panel for back button
		JPanel panelBack = new JPanel();
		panelBack.setBounds(10, 10, 107, 47);
		frameDessert.getContentPane().add(panelBack);
		panelBack.setLayout(null);
		
		//create back button
		JButton btnBack = new JButton("BACK");
		btnBack.setToolTipText("Back to main menu");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// go back to menu window and close dessert window
				GrandmasCookbook.main(null);
				frameDessert.dispose();
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnBack.setBounds(0, 0, 101, 27);
		panelBack.add(btnBack);
		
		// create the JTable
		JTable table = new JTable();
		table.setToolTipText("(double click to edit)");
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
			}
		));
		panelDessertResults.setLayout(null);
		table.setFont(new Font("Tahoma", Font.PLAIN, 20));
		table.setRowHeight(30);
		table.setBounds(0, 0, 629, 293);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		
		// create scroll bar for JTable
		JScrollPane sp = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		sp.setBounds(10, 10, 629, 462);
		sp.setLocation(10, 10);
		panelDessertResults.add(sp);
		
		//create panel for delete button
		JPanel panel = new JPanel();
		panel.setBounds(579, 10, 93, 35);
		frameDessert.getContentPane().add(panel);
		panel.setLayout(null);
		
		String fileName = "Dessert.txt"; 
		
		// try-catch to read from the file
		try {
			
			// reading file
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			
			//set first line equal to column names
			 String firstLine = "RECIPE NAME, INGREDIENTS";
	            String[] columnsName = firstLine.split(",");
	            DefaultTableModel model = (DefaultTableModel)table.getModel();
	            model.setColumnIdentifiers(columnsName);
	            
	            // get lines from file
	            Object[] tableLines = br.lines().toArray();
	            
	            // reading data from lines and setting data to the JTable model
	            for(int i = 0; i < tableLines.length; i++)
	            {
	                String line = tableLines[i].toString().trim();
	                String[] dataRow = line.split(",");
	                model.addRow(dataRow);
	            
	            }
	            
	            br.close();
	            
	         // create delete button
	            JButton btnNewButton = new JButton("DELETE");
		        btnNewButton.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e) {
			    	
				 // i = the index of the selected row
                int i = table.getSelectedRow();
                if(i >= 0){
                    // remove a row from jtable
                    model.removeRow(i);
                    
                }
                else{
                    JOptionPane.showMessageDialog(null, "Delete Error");
                }
                
                /* Can't get delete button to update file 
                try {
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName)));
                //loop for jtable rows
                for(int n = 1; n < table.getRowCount(); n++){
                    //loop for jtable column
                    for(int j = 1; j < table.getColumnCount(); j++){
                    	bw.write("RECIPE NAME , INGREDIENTS" + "\n");
                        bw.write(table.getModel().getValueAt(n, j)+"," + table.getModel().getValueAt(n++, j++) + "\n");
                    }
                } 
                bw.close(); 
                
			    } catch (Exception ex) {
			    	JOptionPane.showMessageDialog(null, "Error reading file."); 
			    } */
			}
		});
		btnNewButton.setToolTipText("Delete a recipe");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(0, 0, 90, 27);
		panel.add(btnNewButton);
			
		} catch (IOException ex) {
			//displays error message if file cannot be read
			JOptionPane.showMessageDialog(null, "Add Recipe First.");
		
		}
		
	}
}
