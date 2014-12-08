package InterfazGrafica;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JTable;
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

public class SeeCompanyApplication extends JDialog {

	
	private final JPanel contentPanel = new JPanel();
	private Object[] fila;
	private int filasel, pos1;
	private JTable table;
	private DefaultTableModel tableModel;
	private JScrollPane scrollPane;/**
	 * Create the dialog.
	 */
	public SeeCompanyApplication() {
	setIconImage(Toolkit.getDefaultToolkit().getImage(SeeCompanyApplication.class.getResource("/InterfazGrafica/Images/Info.png")));
		
		getContentPane().setBackground(new Color(248, 248, 255));
		setBounds(10, 50, 836, 756);
		getContentPane().setLayout(null);
		contentPanel.setBackground(new Color(248, 248, 255));
		contentPanel.setBounds(0, 40, 820, 628);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
				contentPanel.setLayout(null);
				setLocationRelativeTo(null);
				setModal(true);
				setTitle("Solicitudes de Empresas");		
				
				table = new JTable();
				table.setBorder(new LineBorder(new Color(0, 0, 0)));
				table.setBounds(35, 400, 400, 200);
				tableModel = new DefaultTableModel();
				String[] columnNames = { "No.", "RNC", "Nombre", "Area",
						"Cantidad de empleados" };
				tableModel.setColumnIdentifiers(columnNames);
				loadPerson();
				
				
				scrollPane = new JScrollPane();
				scrollPane.setBounds(0, 0, 819, 657);
				scrollPane.setViewportView(table);
			contentPanel.add(scrollPane);
				
			
		

			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(248, 248, 255));
			buttonPane.setBounds(0, 668, 820, 53);
			buttonPane.setLayout(new FlowLayout(FlowLayout.CENTER));
			getContentPane().add(buttonPane);
			
			{
				JButton okButton = new JButton("Aceptar");
				okButton.setIcon(new ImageIcon(SeePersonApplication.class.getResource("/InterfazGrafica/Images/botonsi.png")));
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setVisible(false);
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		


		JLabel lblCantidadDeCompaias = new JLabel("Cantidad de Solicitudes:");
		lblCantidadDeCompaias.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCantidadDeCompaias.setBounds(10, 15, 147, 14);
		getContentPane().add(lblCantidadDeCompaias);
		
        JLabel Count = new JLabel("");
		Count.setBounds(156, 15, 58, 14);
		getContentPane().add(Count);
		Count.setText(String.valueOf(CollectionCompanyApplication.getInstanceCollectionCompanyApplication().getCompanyApplications().size()));

	}
	private void loadPerson() {
		// TODO Auto-generated method stub
		fila = new Object[5];
		 for (int i = 0, j=1; i <CollectionCompanyApplication.getInstanceCollectionCompanyApplication().getCompanyApplications().size(); i++,j++)
		 {  
	 fila[0] = i+1; 
	 fila[1] = CollectionCompanyApplication.getInstanceCollectionCompanyApplication().getCompanyApplication(i).getCompany().getRNC(); 
	 fila[2] = CollectionCompanyApplication.getInstanceCollectionCompanyApplication().getCompanyApplication(i).getCompany().getName(); 
	 fila[3] = CollectionCompanyApplication.getInstanceCollectionCompanyApplication().getCompanyApplication(i).getCompany().getArea(); 
	 fila[4] = CollectionCompanyApplication.getInstanceCollectionCompanyApplication().getCompanyApplication(i).getEmployeeCant();
	 tableModel.addRow(fila); 
	 }
 table.setModel(tableModel);
 table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
 table.getTableHeader().setReorderingAllowed(false);
 TableColumnModel columnModel = table.getColumnModel();
 		columnModel.getColumn(0).setPreferredWidth(70);
		columnModel.getColumn(1).setPreferredWidth(140);
		columnModel.getColumn(2).setPreferredWidth(240);
		columnModel.getColumn(3).setPreferredWidth(170);
		columnModel.getColumn(4).setPreferredWidth(230);
	}	
	
	

}