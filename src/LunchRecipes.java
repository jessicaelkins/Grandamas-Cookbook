import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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
		frameLunch.setBounds(100, 100, 701, 700);
		frameLunch.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameLunch.getContentPane().setLayout(null);
		
		
		// create lunch panel
		JPanel panelLunch = new JPanel();
		panelLunch.setBounds(142, 67, 407, 88);
		frameLunch.getContentPane().add(panelLunch);
		panelLunch.setLayout(null);
		
		// create lunch recipes label
		JLabel lblLunchRecipes = new JLabel("Lunch Recipes");
		lblLunchRecipes.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lblLunchRecipes.setBounds(51, 10, 327, 73);
		panelLunch.add(lblLunchRecipes);
		
		// create lunch results panel
		JPanel panelLunchResults = new JPanel();
		panelLunchResults.setBounds(25, 175, 647, 472);
		frameLunch.getContentPane().add(panelLunchResults);
		panelLunchResults.setLayout(null);
		
		JPanel panelBack = new JPanel();
		panelBack.setBounds(10, 10, 104, 43);
		frameLunch.getContentPane().add(panelBack);
		panelBack.setLayout(null);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setToolTipText("Back to main menu");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				GrandmasCookbook.main(null);
				frameLunch.dispose();
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnBack.setBounds(0, 0, 102, 27);
		panelBack.add(btnBack);
		
		//create panel for delete button
		JPanel panel = new JPanel();
		panel.setBounds(579, 10, 93, 35);
		frameLunch.getContentPane().add(panel);
		panel.setLayout(null);
		
		// create the JTable
				JTable table = new JTable();
				table.setToolTipText("(double click to edit)");
				table.setModel(new DefaultTableModel(
					new Object[][] {
					},
					new String[] {
					}
				));
				panelLunchResults.setLayout(null);
				table.setFont(new Font("Tahoma", Font.PLAIN, 20));
				table.setRowHeight(30);
				table.setBounds(0, 0, 629, 293);
				table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
				
				// create scroll bar for JTable
				JScrollPane sp = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
				sp.setBounds(10, 10, 629, 462);
				sp.setLocation(10, 10);
				panelLunchResults.add(sp);
				
				
				String fileName = "Lunch.txt"; 
				
				// try-catch to read from the file
				try {
					
					// reading file
					BufferedReader br = new BufferedReader(new FileReader(fileName));
					
					//set first line equal to column names
					 String firstLine = br.readLine().trim();
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
			
					JOptionPane.showMessageDialog(null, "Error reading file.");
				
				}
		
		
		
	}
	
}
