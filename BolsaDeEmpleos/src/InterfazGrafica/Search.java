package InterfazGrafica;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Toolkit;

import javax.swing.JLabel;
import javax.swing.JTextField;

import EmploymentMarket01.CollectionPerson;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;

public class Search extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField_name;
	private JTextField textField_ID;
	private CollectionPerson Pe;
	private PersonHistory personHistory;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Search dialog = new Search(null);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Search(final CollectionPerson P) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Search.class.getResource("/InterfazGrafica/Images/Search.png")));
		setTitle("BUSQUEDA");
		setBounds(100, 100, 450, 183);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 29, 52, 23);
		contentPanel.add(lblNombre);
		{
			JLabel lblId = new JLabel("ID:");
			lblId.setBounds(35, 57, 27, 23);
			contentPanel.add(lblId);
		}
		
		textField_name = new JTextField();
		textField_name.setBounds(72, 30, 297, 20);
		contentPanel.add(textField_name);
		textField_name.setColumns(10);
		
		textField_ID = new JTextField();
		textField_ID.setColumns(10);
		textField_ID.setBounds(72, 58, 297, 20);
		contentPanel.add(textField_ID);
		{
			
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.CENTER));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				final JLabel lbl_dontFound = new JLabel("Este solicitante no ha sido encontrado ");
				lbl_dontFound.show(false);
				lbl_dontFound.setForeground(Color.RED);
				lbl_dontFound.setFont(new Font("Tahoma", Font.PLAIN, 11));
				lbl_dontFound.setHorizontalAlignment(SwingConstants.CENTER);
				lbl_dontFound.setBounds(10, 85, 414, 23);
				contentPanel.add(lbl_dontFound);
				
				JButton okButton = new JButton("Buscar");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						for(int i=0; i<P.getPersons().size(); i++)
							//Recordar cambiar && por o
							if(P.getPerson(i).getName().equals(textField_name.getText())&&P.getPerson(i).getID().equals(textField_ID.getText())){
								personHistory = new PersonHistory(P.getPerson(i));
							}else if(i==P.getPersons().size()){
								lbl_dontFound.show(true);
							}
								
					}
				});
				okButton.setActionCommand("Buscar");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}