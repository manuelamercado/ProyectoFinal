package InterfazGrafica;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.ImageIcon;

public class CompanyPendingApplication extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			CompanyPendingApplication dialog = new CompanyPendingApplication();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public CompanyPendingApplication() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(CompanyPendingApplication.class.getResource("/InterfazGrafica/Images/pendientes.png")));
		setTitle("SOLICITUDES DE PERSONAL PENDIENTES");
		setBounds(10, 50, 836, 739);
		setModal(true);
		setLocationRelativeTo(rootPane);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(248, 248, 255));
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.CENTER));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Aceptar");
				okButton.setIcon(new ImageIcon(CompanyPendingApplication.class.getResource("/InterfazGrafica/Images/botonsi.png")));
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton btnModificar = new JButton("Modificar");
				btnModificar.setIcon(new ImageIcon(CompanyPendingApplication.class.getResource("/InterfazGrafica/Images/Modify32.png")));
				buttonPane.add(btnModificar);
			}
			{
				JButton btnEliminar = new JButton("Eliminar");
				buttonPane.add(btnEliminar);
			}
			{
				JButton cancelButton = new JButton("Cancelar");
				cancelButton.setIcon(new ImageIcon(CompanyPendingApplication.class.getResource("/InterfazGrafica/Images/Delete32.png")));
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}