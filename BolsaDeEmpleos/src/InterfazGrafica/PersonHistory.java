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
import EmploymentMarket01.CompanyPerson;
import EmploymentMarket01.Person;
import EmploymentMarket01.Satisfied;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PersonHistory extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private Object[] fila;
	private int filasel, pos1;
	private JTable table;
	private DefaultTableModel tableModel;
	private JScrollPane scrollPane;
	private JLabel lblPersona;
	private JLabel label_1;
	private JLabel label;
	private JLabel label_2;
	
	public PersonHistory(Person P) {
		getContentPane().setBackground(new Color(248, 248, 255));
		setBounds(10, 50, 836, 739);
		getContentPane().setLayout(null);
		contentPanel.setBackground(new Color(248, 248, 255));
		contentPanel.setBounds(0, 40, 820, 636);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		setLocationRelativeTo(null);
		setModal(true);
		setTitle("LISTA DE PERSONA");		
		
		table = new JTable();
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setBounds(35, 400, 400, 200);
		tableModel = new DefaultTableModel();
		String[] columnNames = { "No.", "Empresa", "Pocision", "Area",
				"No. Solicitudes" };
		tableModel.setColumnIdentifiers(columnNames);
		ArrayList<CompanyPerson> CP = new ArrayList<CompanyPerson>();
		CP = Satisfied.getIntanceSatisfied().SearchPersonHistory(P);
		loadPerson(CP);
		
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 819, 636);
		scrollPane.setViewportView(table);
		contentPanel.add(scrollPane);
		
	

		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(248, 248, 255));
			buttonPane.setBounds(0, 673, 820, 28);
			buttonPane.setLayout(new FlowLayout(FlowLayout.CENTER));
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
			
			JButton btnEliminar = new JButton("Eliminar");
			buttonPane.add(btnEliminar);
		}
		
		lblPersona = new JLabel("Nombre:");
		lblPersona.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPersona.setBounds(10, 15, 58, 14);
		getContentPane().add(lblPersona);
		
		JLabel labelID = new JLabel("ID:");
		labelID.setFont(new Font("Tahoma", Font.BOLD, 11));
		labelID.setBounds(271, 15, 28, 14);
		getContentPane().add(labelID);
		
		label = new JLabel("");
		label.setBounds(64, 15, 197, 14);
		getContentPane().add(label);
		label.setText(P.getName());
		
		label_2 = new JLabel("");
		label_2.setBounds(298, 15, 197, 14);
		getContentPane().add(label_2);
		label_2.setText(P.getID());

	}
	private void loadPerson(ArrayList<CompanyPerson> PC) {
		// TODO Auto-generated method stub
		fila = new Object[5];
		 for (int i = 0, j=1; i < PC.size(); i++,j++)
		 {  
	 fila[0] = i+1; 
	 fila[1] = PC.get(i).getCompany().getName(); 
	 fila[2] = PC.get(i).getWorkPosition(); 
	 fila[3] = PC.get(i).getArea(); 
	 fila[4] = j;
	 tableModel.addRow(fila); 
	 }
 table.setModel(tableModel);
 table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
 table.getTableHeader().setReorderingAllowed(false);
 TableColumnModel columnModel = table.getColumnModel();
 		columnModel.getColumn(0).setPreferredWidth(70);
		columnModel.getColumn(1).setPreferredWidth(160);
		columnModel.getColumn(2).setPreferredWidth(240);
		columnModel.getColumn(3).setPreferredWidth(240);
		columnModel.getColumn(4).setPreferredWidth(110);
	}	
}