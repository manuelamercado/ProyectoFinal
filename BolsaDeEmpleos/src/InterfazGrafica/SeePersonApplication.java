package InterfazGrafica;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

import EmploymentMarket01.CollectionPerson;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SeePersonApplication extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private Object[] fila;
	private int filasel, pos1;
	private JTable table;
	private DefaultTableModel tableModel;
	private JScrollPane scrollPane;
	
	public SeePersonApplication() {
		setBounds(100, 100, 497, 341);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 481, 269);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		setLocationRelativeTo(null);
		setModal(true);
		setTitle("VER SOLICITUDES PERSONA");		
		
		table = new JTable();
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setBounds(35, 400, 400, 200);
		tableModel = new DefaultTableModel();
		String[] columnNames = { "No.", "ID", "Name", "Last name",
				"No. Solicitudes" };
		tableModel.setColumnIdentifiers(columnNames);
		loadPerson();
		
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 461, 258);
		scrollPane.setViewportView(table);
		contentPanel.add(scrollPane);
		
	

		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 269, 481, 33);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane);
			
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setVisible(false);
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}

	}
	private void loadPerson() {
		// TODO Auto-generated method stub
		fila = new Object[5];
		 for (int i = 0, j=1; i < CollectionPerson.getInstanceCollectionPerson().getCantPerson(); i++,j++)
		 {  
	 fila[0] = i+1; 
	 fila[1] =CollectionPerson.getInstanceCollectionPerson().getPersons().get(i).getID(); 
	 fila[2] = CollectionPerson.getInstanceCollectionPerson().getPersons().get(i).getName(); 
	 fila[3] =CollectionPerson.getInstanceCollectionPerson().getPersons().get(i).getLastName(); 
	 fila[4] = j;
	 tableModel.addRow(fila); 
	 }
 table.setModel(tableModel);
 table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
 table.getTableHeader().setReorderingAllowed(false);
 TableColumnModel columnModel = table.getColumnModel();
 		columnModel.getColumn(0).setPreferredWidth(70);
		columnModel.getColumn(1).setPreferredWidth(150);
		columnModel.getColumn(2).setPreferredWidth(150);
		columnModel.getColumn(3).setPreferredWidth(150);
		columnModel.getColumn(4).setPreferredWidth(150);
	}	
	
}
