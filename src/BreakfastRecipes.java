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
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.awt.event.ActionEvent;

public class BreakfastRecipes {

	private JFrame frameBreakfast;
	String fileName = "Breakfast.txt";

	/**
	 * Launch the application.
	 */
	public static void BreakfastScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BreakfastRecipes window = new BreakfastRecipes();
					window.frameBreakfast.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BreakfastRecipes() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		// create breakfast menu frame
		frameBreakfast = new JFrame();
		frameBreakfast.setTitle("Breakfast Recipe");
		frameBreakfast.setBounds(100, 100, 701, 700);
		frameBreakfast.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameBreakfast.getContentPane().setLayout(null);
		
		// create breakfast panel
		JPanel panelBreakfast = new JPanel();
		panelBreakfast.setBounds(114, 70, 414, 84);
		frameBreakfast.getContentPane().add(panelBreakfast);
		panelBreakfast.setLayout(null);
		
		// create breakfast label
		JLabel lblBreakfastRecipes = new JLabel("Breakfast Recipes");
		lblBreakfastRecipes.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lblBreakfastRecipes.setBounds(10, 10, 398, 73);
		panelBreakfast.add(lblBreakfastRecipes);
		
		
		// create breakfast result panel
		JPanel panelBreakfastResults = new JPanel();
		panelBreakfastResults.setBounds(25, 175, 647, 472);
		frameBreakfast.getContentPane().add(panelBreakfastResults);
		panelBreakfastResults.setLayout(null);
		
		// create the panel for the back button
		JPanel panelBack = new JPanel();
		panelBack.setBounds(10, 10, 100, 35);
		frameBreakfast.getContentPane().add(panelBack);
		panelBack.setLayout(null);
		
		// create the back button
		JButton btnBack = new JButton("BACK");
		btnBack.setToolTipText("Back to main menu");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// go back to menu window and close add recipe window
				GrandmasCookbook.main(null);
				frameBreakfast.dispose();
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnBack.setBounds(0, 0, 95, 30);
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
		panelBreakfastResults.setLayout(null);
		table.setFont(new Font("Tahoma", Font.PLAIN, 20));
		table.setRowHeight(30);
		table.setBounds(0, 0, 629, 293);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		
		// create scroll bar for JTable
		JScrollPane sp = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		sp.setBounds(10, 10, 629, 462);
		sp.setLocation(10, 10);
		panelBreakfastResults.add(sp);
		
		// create panel for delete button
		JPanel panel = new JPanel();
		panel.setBounds(579, 10, 93, 35);
		frameBreakfast.getContentPane().add(panel);
		panel.setLayout(null);
		
		
		 
		
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
			//lets user know there was an error reading the file
			JOptionPane.showMessageDialog(null, "Error reading file.");
		}
		
		
		
	}
	

}
