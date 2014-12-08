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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Help extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Help dialog = new Help();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Help() {
		setTitle("AYUDA");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Help.class.getResource("/InterfazGrafica/Images/1416396005_FAQ.png")));
		setBounds(10, 50, 836, 739);
		setLocationRelativeTo(rootPane);
		setModal(true);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(248, 248, 255));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBackground(new Color(248, 248, 255));
			panel.setForeground(new Color(0, 0, 0));
			panel.setBounds(36, 11, 227, 332);
			panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "               Inicio", TitledBorder.LEFT, TitledBorder.ABOVE_TOP, null, null));
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JLabel label = new JLabel("");
				label.setIcon(new ImageIcon(Help.class.getResource("/InterfazGrafica/Images/1416514885_home.png")));
				label.setBounds(10, 0, 46, 48);
				panel.add(label);
			}
			{
				JLabel lblPermiteAccederDirectamente = new JLabel("Permite acceder directamente a las ");
				lblPermiteAccederDirectamente.setFont(lblPermiteAccederDirectamente.getFont().deriveFont(lblPermiteAccederDirectamente.getFont().getStyle() & ~Font.BOLD));
				lblPermiteAccederDirectamente.setBounds(10, 59, 231, 14);
				panel.add(lblPermiteAccederDirectamente);
			}
			{
				JLabel lblPrincipalesHerramientasDel = new JLabel("principales herramientas b\u00E1sicas del ");
				lblPrincipalesHerramientasDel.setFont(lblPrincipalesHerramientasDel.getFont().deriveFont(lblPrincipalesHerramientasDel.getFont().getStyle() & ~Font.BOLD));
				lblPrincipalesHerramientasDel.setBounds(10, 77, 231, 14);
				panel.add(lblPrincipalesHerramientasDel);
			}
			{
				JLabel lblMencionadasAContinuacin = new JLabel("sistema mencionadas a continuaci\u00F3n:");
				lblMencionadasAContinuacin.setFont(lblMencionadasAContinuacin.getFont().deriveFont(lblMencionadasAContinuacin.getFont().getStyle() & ~Font.BOLD));
				lblMencionadasAContinuacin.setBounds(10, 93, 231, 14);
				panel.add(lblMencionadasAContinuacin);
			}
			{
				JLabel lblNuevoCliente = new JLabel("Nuevo Cliente ");
				lblNuevoCliente.setIcon(new ImageIcon(Help.class.getResource("/InterfazGrafica/Images/Add32.png")));
				lblNuevoCliente.setBounds(10, 118, 172, 32);
				panel.add(lblNuevoCliente);
			}
			{
				JLabel lblNuevaSolicitud = new JLabel("Nueva Solicitud");
				lblNuevaSolicitud.setIcon(new ImageIcon(Help.class.getResource("/InterfazGrafica/Images/1417568890_new-file.png")));
				lblNuevaSolicitud.setBounds(10, 161, 172, 32);
				panel.add(lblNuevaSolicitud);
			}
			{
				JLabel lblBuscar = new JLabel("Buscar");
				lblBuscar.setIcon(new ImageIcon(Help.class.getResource("/InterfazGrafica/Images/Search32.png")));
				lblBuscar.setLabelFor(this);
				lblBuscar.setBounds(10, 204, 172, 32);
				panel.add(lblBuscar);
			}
			{
				JLabel lblAyuda = new JLabel("Ayuda");
				lblAyuda.setIcon(new ImageIcon(Help.class.getResource("/InterfazGrafica/Images/Ayuda32.png")));
				lblAyuda.setBounds(10, 247, 172, 32);
				panel.add(lblAyuda);
			}
			{
				JLabel lblCerrar = new JLabel("Cerrar");
				lblCerrar.setIcon(new ImageIcon(Help.class.getResource("/InterfazGrafica/Images/Delete32.png")));
				lblCerrar.setBounds(10, 290, 172, 32);
				panel.add(lblCerrar);
			}
		}
		{
			JPanel panel = new JPanel();
			panel.setLayout(null);
			panel.setForeground(Color.BLACK);
			panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "               Registrar", TitledBorder.LEFT, TitledBorder.ABOVE_TOP, null, null));
			panel.setBackground(new Color(248, 248, 255));
			panel.setBounds(297, 11, 227, 332);
			contentPanel.add(panel);
			{
				JLabel label = new JLabel("");
				label.setIcon(new ImageIcon(Help.class.getResource("/InterfazGrafica/Images/Modify.png")));
				label.setBounds(10, 0, 46, 48);
				panel.add(label);
			}
			{
				JLabel lblPermiteRegistrarNuevos = new JLabel("Permite registrar nuevos datos en el");
				lblPermiteRegistrarNuevos.setFont(lblPermiteRegistrarNuevos.getFont().deriveFont(lblPermiteRegistrarNuevos.getFont().getStyle() & ~Font.BOLD));
				lblPermiteRegistrarNuevos.setBounds(10, 59, 231, 14);
				panel.add(lblPermiteRegistrarNuevos);
			}
			{
				JLabel lblSistemaYaSea = new JLabel("sistema, ya sea un nuevo cliente \u00F3 una ");
				lblSistemaYaSea.setFont(lblSistemaYaSea.getFont().deriveFont(lblSistemaYaSea.getFont().getStyle() & ~Font.BOLD));
				lblSistemaYaSea.setBounds(10, 77, 231, 14);
				panel.add(lblSistemaYaSea);
			}
			{
				JLabel lblNuevaSolicitudDe = new JLabel("nueva solicitud de empleo o de personal");
				lblNuevaSolicitudDe.setFont(lblNuevaSolicitudDe.getFont().deriveFont(lblNuevaSolicitudDe.getFont().getStyle() & ~Font.BOLD));
				lblNuevaSolicitudDe.setBounds(10, 93, 231, 14);
				panel.add(lblNuevaSolicitudDe);
			}
			{
				JLabel lblSolicitante = new JLabel("   Solicitante");
				lblSolicitante.setIcon(new ImageIcon(Help.class.getResource("/InterfazGrafica/Images/Profile32.png")));
				lblSolicitante.setBounds(10, 118, 172, 32);
				panel.add(lblSolicitante);
			}
			{
				JLabel lblEmpresa = new JLabel("   Empresa");
				lblEmpresa.setIcon(new ImageIcon(Help.class.getResource("/InterfazGrafica/Images/Company32.png")));
				lblEmpresa.setBounds(10, 161, 172, 32);
				panel.add(lblEmpresa);
			}
			{
				JLabel lblSolicitudes = new JLabel("Solicitudes");
				lblSolicitudes.setVerticalAlignment(SwingConstants.TOP);
				lblSolicitudes.setIcon(new ImageIcon(Help.class.getResource("/InterfazGrafica/Images/Info.png")));
				lblSolicitudes.setBounds(0, 204, 182, 48);
				panel.add(lblSolicitudes);
			}
		}
		{
			JPanel panel = new JPanel();
			panel.setLayout(null);
			panel.setForeground(Color.BLACK);
			panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "                 Base de Datos", TitledBorder.LEFT, TitledBorder.ABOVE_TOP, null, null));
			panel.setBackground(new Color(248, 248, 255));
			panel.setBounds(564, 11, 227, 332);
			contentPanel.add(panel);
			{
				JLabel label = new JLabel("");
				label.setIcon(new ImageIcon(Help.class.getResource("/InterfazGrafica/Images/1416395841_archive.png")));
				label.setBounds(10, 0, 46, 48);
				panel.add(label);
			}
			{
				JLabel label = new JLabel("Permite acceder directamente a las ");
				label.setFont(label.getFont().deriveFont(label.getFont().getStyle() & ~Font.BOLD));
				label.setBounds(10, 59, 231, 14);
				panel.add(label);
			}
			{
				JLabel label = new JLabel("principales herramientas b\u00E1sicas del ");
				label.setFont(label.getFont().deriveFont(label.getFont().getStyle() & ~Font.BOLD));
				label.setBounds(10, 77, 231, 14);
				panel.add(label);
			}
			{
				JLabel label = new JLabel("sistema mencionadas a continuaci\u00F3n:");
				label.setFont(label.getFont().deriveFont(label.getFont().getStyle() & ~Font.BOLD));
				label.setBounds(10, 93, 231, 14);
				panel.add(label);
			}
			{
				JLabel label = new JLabel("Nuevo Cliente ");
				label.setBounds(10, 118, 172, 32);
				panel.add(label);
			}
			{
				JLabel label = new JLabel("Nueva Solicitud");
				label.setBounds(10, 161, 172, 32);
				panel.add(label);
			}
			{
				JLabel label = new JLabel("Buscar");
				label.setBounds(10, 204, 172, 32);
				panel.add(label);
			}
			{
				JLabel label = new JLabel("Ayuda");
				label.setBounds(10, 247, 172, 32);
				panel.add(label);
			}
			{
				JLabel label = new JLabel("Cerrar");
				label.setBounds(10, 290, 172, 32);
				panel.add(label);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(248, 248, 255));
			buttonPane.setLayout(new FlowLayout(FlowLayout.CENTER));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Aceptar");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				okButton.setIcon(new ImageIcon(Help.class.getResource("/InterfazGrafica/Images/botonsi.png")));
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
	}

}
