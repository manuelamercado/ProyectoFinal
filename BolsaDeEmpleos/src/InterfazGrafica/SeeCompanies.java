package InterfazGrafica;

import java.awt.BorderLayout;

import EmploymentMarket01.CollectionCompanyApplication;
import EmploymentMarket01.CollectionPersonApplicant;
import EmploymentMarket01.Company;

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

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;

import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class SeeCompanies extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private Object[] fila;
	private int filasel, pos1;
	private JTable table;
	private DefaultTableModel tableModel;
	private JScrollPane scrollPane;
	
	public SeeCompanies() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(SeeCompanies.class.getResource("/InterfazGrafica/Images/1417828832_companies.png")));
		getContentPane().setBackground(new Color(248, 248, 255));
		setBounds(10, 50, 836, 739);
		getContentPane().setLayout(null);
		contentPanel.setBackground(new Color(248, 248, 255));
		contentPanel.setBounds(0, 40, 820, 609);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		setLocationRelativeTo(null);
		setModal(true);
		setTitle("Lista de Empresas");		
		
		table = new JTable();
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setBounds(35, 400, 400, 200);
		tableModel = new DefaultTableModel();
		String[] columnNames = { "No.", "RNC", "Name", "Area",
				"No. Solicitudes" };
		tableModel.setColumnIdentifiers(columnNames);
		loadPerson();
		
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 819, 606);
		scrollPane.setViewportView(table);
		contentPanel.add(scrollPane);
		
	

		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(248, 248, 255));
			buttonPane.setBounds(0, 650, 820, 51);
			buttonPane.setLayout(new FlowLayout(FlowLayout.CENTER));
			getContentPane().add(buttonPane);
			
			{
				JButton okButton = new JButton("Aceptar");
				okButton.setIcon(new ImageIcon(SeeCompanies.class.getResource("/InterfazGrafica/Images/botonsi.png")));
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setVisible(false);
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			
			JButton btnModificar = new JButton("Modificar");
			btnModificar.setIcon(new ImageIcon(SeeCompanies.class.getResource("/InterfazGrafica/Images/Modify32.png")));
			buttonPane.add(btnModificar);
			
			JButton btnCancelar = new JButton("Cancelar");
			btnCancelar.setIcon(new ImageIcon(SeeCompanies.class.getResource("/InterfazGrafica/Images/Delete32.png")));
			buttonPane.add(btnCancelar);
		}
		
		JLabel lblCantidadDeCompaias = new JLabel("Cantidad de Compa\u00F1ias:");
		lblCantidadDeCompaias.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCantidadDeCompaias.setBounds(10, 15, 147, 14);
		getContentPane().add(lblCantidadDeCompaias);
		
		JLabel Count = new JLabel("");
		Count.setBounds(156, 15, 58, 14);
		getContentPane().add(Count);
		Count.setText(String.valueOf(CollectionCompany.getInstanceCollectionCompany().getCantCompany()));

	}
	public SeeCompanies(Company company) {
		// TODO Auto-generated constructor stub
	}
	private void loadPerson() {
		// TODO Auto-generated method stub
		fila = new Object[5];
		 for (int i = 0, j=1; i < CollectionCompany.getInstanceCollectionCompany().getCantCompany(); i++,j++)
		 {  
	 fila[0] = i+1; 
	 fila[1] = CollectionCompany.getInstanceCollectionCompany().getCompany(i).getRNC(); 
	 fila[2] = CollectionCompany.getInstanceCollectionCompany().getCompany(i).getName(); 
	 fila[3] = CollectionCompany.getInstanceCollectionCompany().getCompany(i).getArea(); 
	 fila[4] = solicitudes(CollectionCompany.getInstanceCollectionCompany().getCompany(i).getName(), CollectionCompany.getInstanceCollectionCompany().getCompany(i).getRNC());;
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
	public int solicitudes(String Names, String RNCs){
		int count=0;
		 for(int i=0; i<CollectionCompanyApplication.getInstanceCollectionCompanyApplication().getCompanyApplications().size(); i++)
		 if(CollectionCompanyApplication.getInstanceCollectionCompanyApplication().getCompanyApplication(i).getCompany().getName().equals(Names)&&CollectionCompanyApplication.getInstanceCollectionCompanyApplication().getCompanyApplication(i).getCompany().getRNC().equals(RNCs)){
		 count+=1;
		 }
		
		 return count;
		 }
}

	