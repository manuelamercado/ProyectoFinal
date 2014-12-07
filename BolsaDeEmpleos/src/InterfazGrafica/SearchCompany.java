package InterfazGrafica;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import EmploymentMarket01.CollectionCompany;
import EmploymentMarket01.CollectionPerson;
import javax.swing.ImageIcon;

public class SearchCompany extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField_name;
	private JTextField textField_RNC;
	private SeeCompanies seeCompanies;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			SearchCompany dialog = new SearchCompany();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public SearchCompany() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(SearchPerson.class.getResource("/InterfazGrafica/Images/Search.png")));
		setTitle("BUSQUEDA");
		setBounds(100, 100, 450, 210);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		setLocationRelativeTo(null);
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 29, 52, 23);
		contentPanel.add(lblNombre);
		{
			JLabel lblRNC = new JLabel("RNC:");
			lblRNC.setBounds(35, 57, 27, 23);
			contentPanel.add(lblRNC);
		}
		textField_name = new JTextField();
		textField_name.setBounds(72, 30, 297, 20);
		contentPanel.add(textField_name);
		textField_name.setColumns(10);
		textField_RNC = new JTextField();
		textField_RNC.setColumns(10);
		textField_RNC.setBounds(72, 58, 297, 20);
		contentPanel.add(textField_RNC);
		{
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.CENTER));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				final JLabel lbl_dontFound = new JLabel("");

				lbl_dontFound.setForeground(Color.RED);
				lbl_dontFound.setFont(new Font("Tahoma", Font.PLAIN, 11));
				lbl_dontFound.setHorizontalAlignment(SwingConstants.CENTER);
				lbl_dontFound.setBounds(10, 85, 414, 23);
				contentPanel.add(lbl_dontFound);
				JButton okButton = new JButton("Buscar");
				okButton.setIcon(new ImageIcon(SearchCompany.class.getResource("/InterfazGrafica/Images/Search32.png")));
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						if(CollectionCompany.getInstanceCollectionCompany().getCantCompany()==0){
							 lbl_dontFound.setText("No hay personas registradas");
							 }
							 for(int i=0; i<CollectionPerson.getInstanceCollectionPerson().getCantPerson(); i++)
							 if(CollectionCompany.getInstanceCollectionCompany().getCompany(i).getName().equals(textField_name.getText())&&CollectionCompany.getInstanceCollectionCompany().getCompany(i).getID().equals(textField_RNC.getText())||CollectionCompany.getInstanceCollectionCompany().getCompany(i).getRNC().equals(textField_RNC.getText())){
							 seeCompanies = new SeeCompanies(CollectionCompany.getInstanceCollectionCompany().getCompany(i));
							 seeCompanies.setVisible(true);
							 }else if(i==CollectionCompany.getInstanceCollectionCompany().getCompanies().size()&&i!=0){
							lbl_dontFound.setText("Este solicitante no ha sido encontrado");
							}
					}
				});
				okButton.setActionCommand("Buscar");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setIcon(new ImageIcon(SearchCompany.class.getResource("/InterfazGrafica/Images/Delete32.png")));
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	}