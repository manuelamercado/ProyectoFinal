package InterfazGrafica;

import java.awt.BorderLayout;
import EmploymentMarket01.CollectionPersonApplicant;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

import EmploymentMarket01.CollectionPerson;
import EmploymentMarket01.Person;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class SeePersons extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private Object[] fila;
	private int filasel, pos1;
	private JTable table;
	private DefaultTableModel tableModel;
	private JScrollPane scrollPane;
	private JLabel lblCantidadDePersonas;
	private JLabel label_1;
	private Person Table_Click;
	private PersonHistory personHistory;
	private String Name, ID;
	
	public SeePersons() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(SeePersons.class.getResource("/InterfazGrafica/Images/1416396281_testimonials.png")));
		getContentPane().setBackground(new Color(248, 248, 255));
		setBounds(10, 50, 836, 739);
		getContentPane().setLayout(null);
		contentPanel.setBackground(new Color(248, 248, 255));
		contentPanel.setBounds(0, 40, 820, 612);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		setLocationRelativeTo(null);
		setModal(true);
		setTitle("LISTA DE SOLICITANTES");		
		
		table = new JTable();
		table.setGridColor(new Color(248, 248, 255));
		table.setSelectionForeground(new Color(248, 248, 255));
		table.setBackground(new Color(248, 248, 255));
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try{
					
					int row = table.getSelectedRow();
					Name = (String) table.getValueAt(row, 2);
					ID = (String) table.getValueAt(row, 1);
					
				}catch(Exception e){
					JOptionPane.showMessageDialog(null, e);
				}		
			}
		});
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setBounds(35, 400, 400, 200);
		tableModel = new DefaultTableModel();
		String[] columnNames = { "No.", "ID", "Name", "Last name",
				"No. Solicitudes" };
		tableModel.setColumnIdentifiers(columnNames);
		loadPerson();
		
		
		scrollPane = new JScrollPane();
		scrollPane.setBackground(new Color(248, 248, 255));
		scrollPane.setBounds(0, 0, 819, 612);
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
				okButton.setIcon(new ImageIcon(SeePersons.class.getResource("/InterfazGrafica/Images/botonsi.png")));
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setVisible(false);
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			
			JButton btnBuscar = new JButton("Buscar");
			btnBuscar.setIcon(new ImageIcon(SeePersons.class.getResource("/InterfazGrafica/Images/Search32.png")));
			btnBuscar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					for(int i=0; i<CollectionPerson.getInstanceCollectionPerson().getCantPerson(); i++)
						 if(CollectionPerson.getInstanceCollectionPerson().getPerson(i).getName().equals(Name)&&CollectionPerson.getInstanceCollectionPerson().getPerson(i).getID().equals(ID)||CollectionPerson.getInstanceCollectionPerson().getPerson(i).getID().equals(ID)){
						 personHistory = new PersonHistory(CollectionPerson.getInstanceCollectionPerson().getPerson(i));
						 personHistory.setVisible(true);
						} 
				}
			});
			buttonPane.add(btnBuscar);
			
			JButton btnEliminar = new JButton("Eliminar");
			btnEliminar.setIcon(new ImageIcon(SeePersons.class.getResource("/InterfazGrafica/Images/eliminar32.png")));
			buttonPane.add(btnEliminar);
			
			JButton btnCancelar = new JButton("Cancelar");
			btnCancelar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				 dispose();
				 }
				 });
			btnCancelar.setIcon(new ImageIcon(SeePersons.class.getResource("/InterfazGrafica/Images/Delete32.png")));
			buttonPane.add(btnCancelar);
			
			btnEliminar.addActionListener(new ActionListener() {
				 public void actionPerformed(ActionEvent arg0) {
				for(int i=0; i<CollectionPerson.getInstanceCollectionPerson().getCantPerson(); i++)
					if(CollectionPerson.getInstanceCollectionPerson().getPerson(i).getID().equals(ID)){
				 CollectionPerson.getInstanceCollectionPerson().removePerson(CollectionPerson.getInstanceCollectionPerson().getPerson(i));
				 loadPerson();
					}
				 }
				 });
		}
		
		lblCantidadDePersonas = new JLabel("Cantidad de Personas:");
		lblCantidadDePersonas.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCantidadDePersonas.setBounds(10, 15, 147, 14);
		getContentPane().add(lblCantidadDePersonas);
		
		JLabel Count = new JLabel("");
		Count.setBounds(156, 15, 58, 14);
		getContentPane().add(Count);
		Count.setText(String.valueOf(CollectionPerson.getInstanceCollectionPerson().getCantPerson()));

	}
	private void loadPerson() {
		// TODO Auto-generated method stub
		fila = new Object[5];
		 for (int i = 0, j=1; i < CollectionPerson.getInstanceCollectionPerson().getCantPerson(); i++,j++)
		 {  
	 fila[0] = i+1; 
	 fila[1] =CollectionPerson.getInstanceCollectionPerson().getPersons().get(i).getID(); 
	 fila[2] = CollectionPerson.getInstanceCollectionPerson().getPersons().get(i).getName(); 
	 fila[3] = CollectionPerson.getInstanceCollectionPerson().getPersons().get(i).getLastName();
	 fila[4] = solicitudes(CollectionPerson.getInstanceCollectionPerson().getPersons().get(i).getName(), CollectionPerson.getInstanceCollectionPerson().getPersons().get(i).getID());
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
	
	//metodo que calcula la cantidad de solicitudes
	 public int solicitudes(String Names, String IDs){
	 int count=0;
	 for(int i=0; i<CollectionPersonApplicant.getInstanceCollectionPersonApplicant().getPersonApplicantions().size(); i++)
	 if(CollectionPersonApplicant.getInstanceCollectionPersonApplicant().getPersonApplication(i).getPerson().getName().equals(Names)&&CollectionPersonApplicant.getInstanceCollectionPersonApplicant().getPersonApplication(i).getPerson().getID().equals(IDs)){
	 count+=1;
	 }
	
	 return count;
	}
	 
	
}