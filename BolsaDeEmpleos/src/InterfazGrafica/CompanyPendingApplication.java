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

import EmploymentMarket01.CollectionCompany;
import EmploymentMarket01.CollectionCompanyApplication;
import EmploymentMarket01.Satisfied;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class CompanyPendingApplication extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private Object[] fila;
	private int filasel, pos1;
	private JTable table;
	private DefaultTableModel tableModel;
	private JScrollPane scrollPane;
	
	public CompanyPendingApplication() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(CompanyPendingApplication.class.getResource("/InterfazGrafica/Images/pendientes.png")));
		getContentPane().setBackground(new Color(248, 248, 255));
		setBounds(10, 50, 836, 758);
		getContentPane().setLayout(null);
		contentPanel.setBackground(new Color(248, 248, 255));
		contentPanel.setBounds(0, 40, 820, 628);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		setLocationRelativeTo(null);
		setModal(true);
		setTitle("Solicitudes de Personal Pendientes");		
		
		table = new JTable();
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setBounds(35, 400, 400, 200);
		tableModel = new DefaultTableModel();
		String[] columnNames = { "No.", "RNC", "Name", "Area",
				"No. Solicitudes" };
		tableModel.setColumnIdentifiers(columnNames);
		loadPerson();
		
		
		scrollPane = new JScrollPane();
		scrollPane.setBackground(new Color(248, 248, 255));
		scrollPane.setBounds(0, 0, 819, 657);
		scrollPane.setViewportView(table);
		contentPanel.add(scrollPane);
		
	

		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(248, 248, 255));
			buttonPane.setBounds(0, 668, 820, 52);
			buttonPane.setLayout(new FlowLayout(FlowLayout.CENTER));
			getContentPane().add(buttonPane);
			
			{
				JButton okButton = new JButton("Aceptar");
				okButton.setBackground(new Color(248, 248, 255));
				okButton.setIcon(new ImageIcon(CompanyPendingApplication.class.getResource("/InterfazGrafica/Images/botonsi.png")));
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
			btnEliminar.setBackground(new Color(248, 248, 255));
			btnEliminar.setIcon(new ImageIcon(CompanyPendingApplication.class.getResource("/InterfazGrafica/Images/eliminar32.png")));
			buttonPane.add(btnEliminar);
		}
		
		JLabel lblCantidadDeCompaias = new JLabel("Cantidad de Solicitudes:");
		lblCantidadDeCompaias.setBackground(new Color(248, 248, 255));
		lblCantidadDeCompaias.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCantidadDeCompaias.setBounds(10, 15, 147, 14);
		getContentPane().add(lblCantidadDeCompaias);
		
		JLabel Count = new JLabel("");
		Count.setBackground(new Color(248, 248, 255));
		Count.setBounds(156, 15, 58, 14);
		getContentPane().add(Count);
		Count.setText(String.valueOf(Satisfied.getInstanceSatisfied().getPendingCompanyApplication(CollectionCompanyApplication.getInstanceCollectionCompanyApplication()).getCompanyApplications().size()));

	}
	private void loadPerson() {
		// TODO Auto-generated method stub
		fila = new Object[5];
		 for (int i = 0, j=1; i <Satisfied.getInstanceSatisfied().getPendingCompanyApplication(CollectionCompanyApplication.getInstanceCollectionCompanyApplication()).getCompanyApplications().size(); i++,j++)
		 {  
	 fila[0] = i+1; 
	 fila[1] = Satisfied.getInstanceSatisfied().getPendingCompanyApplication(CollectionCompanyApplication.getInstanceCollectionCompanyApplication()).getCompanyApplication(i).getCompany().getRNC(); 
	 fila[2] = Satisfied.getInstanceSatisfied().getPendingCompanyApplication(CollectionCompanyApplication.getInstanceCollectionCompanyApplication()).getCompanyApplication(i).getCompany().getName(); 
	 fila[3] = Satisfied.getInstanceSatisfied().getPendingCompanyApplication(CollectionCompanyApplication.getInstanceCollectionCompanyApplication()).getCompanyApplication(i).getCompany().getArea(); 
	 fila[4] = Satisfied.getInstanceSatisfied().getPendingCompanyApplication(CollectionCompanyApplication.getInstanceCollectionCompanyApplication()).getCompanyApplication(i).getEmployeeCant();
	 tableModel.addRow(fila); 
	 }
 table.setModel(tableModel);
 table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
 table.getTableHeader().setReorderingAllowed(false);
 TableColumnModel columnModel = table.getColumnModel();
 		columnModel.getColumn(0).setPreferredWidth(70);
		columnModel.getColumn(1).setPreferredWidth(160);
		columnModel.getColumn(2).setPreferredWidth(240);
		columnModel.getColumn(3).setPreferredWidth(120);
		columnModel.getColumn(4).setPreferredWidth(240);
	}	
}