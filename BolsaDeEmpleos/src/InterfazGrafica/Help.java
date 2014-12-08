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
				JLabel lblSistemaYaSea = new JLabel("sistema, sea un nuevo cliente \u00F3 una ");
				lblSistemaYaSea.setFont(lblSistemaYaSea.getFont().deriveFont(lblSistemaYaSea.getFont().getStyle() & ~Font.BOLD));
				lblSistemaYaSea.setBounds(10, 77, 231, 14);
				panel.add(lblSistemaYaSea);
			}
			{
				JLabel lblNuevaSolicitudDe = new JLabel("nueva solicitud de empleo o personal.");
				lblNuevaSolicitudDe.setFont(lblNuevaSolicitudDe.getFont().deriveFont(lblNuevaSolicitudDe.getFont().getStyle() & ~Font.BOLD));
				lblNuevaSolicitudDe.setBounds(10, 93, 231, 14);
				panel.add(lblNuevaSolicitudDe);
			}
			{
				JLabel lblSolicitante = new JLabel("Solicitante");
				lblSolicitante.setIcon(new ImageIcon(Help.class.getResource("/InterfazGrafica/Images/Profile.png")));
				lblSolicitante.setBounds(10, 134, 172, 49);
				panel.add(lblSolicitante);
			}
			{
				JLabel lblEmpresa = new JLabel("Empresa");
				lblEmpresa.setIcon(new ImageIcon(Help.class.getResource("/InterfazGrafica/Images/1416396195_Company.png")));
				lblEmpresa.setBounds(10, 194, 172, 48);
				panel.add(lblEmpresa);
			}
			{
				JLabel lblSolicitudes = new JLabel("Solicitudes");
				lblSolicitudes.setVerticalAlignment(SwingConstants.TOP);
				lblSolicitudes.setIcon(new ImageIcon(Help.class.getResource("/InterfazGrafica/Images/Info.png")));
				lblSolicitudes.setBounds(10, 253, 182, 48);
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
				JLabel lblPermiteAccederA = new JLabel("Permite acceder a todos los archivos");
				lblPermiteAccederA.setFont(lblPermiteAccederA.getFont().deriveFont(lblPermiteAccederA.getFont().getStyle() & ~Font.BOLD));
				lblPermiteAccederA.setBounds(10, 59, 231, 14);
				panel.add(lblPermiteAccederA);
			}
			{
				JLabel lblArchivosGuardadosDentro = new JLabel("donde se encuentran los datos de los ");
				lblArchivosGuardadosDentro.setFont(lblArchivosGuardadosDentro.getFont().deriveFont(lblArchivosGuardadosDentro.getFont().getStyle() & ~Font.BOLD));
				lblArchivosGuardadosDentro.setBounds(10, 77, 231, 14);
				panel.add(lblArchivosGuardadosDentro);
			}
			{
				JLabel lblClientesRegistrados = new JLabel("clientes registrados en el sistema.");
				lblClientesRegistrados.setFont(lblClientesRegistrados.getFont().deriveFont(lblClientesRegistrados.getFont().getStyle() & ~Font.BOLD));
				lblClientesRegistrados.setBounds(10, 93, 231, 14);
				panel.add(lblClientesRegistrados);
			}
			{
				JLabel lblreasDisponibles = new JLabel("\u00C1reas Disponibles");
				lblreasDisponibles.setIcon(new ImageIcon(Help.class.getResource("/InterfazGrafica/Images/areas.png")));
				lblreasDisponibles.setBounds(10, 134, 172, 43);
				panel.add(lblreasDisponibles);
			}
			{
				JLabel lblRegistros = new JLabel("Registros ");
				lblRegistros.setIcon(new ImageIcon(Help.class.getResource("/InterfazGrafica/Images/Modify.png")));
				lblRegistros.setBounds(10, 194, 172, 48);
				panel.add(lblRegistros);
			}
			{
				JLabel lblSolicitudes_1 = new JLabel("Solicitudes");
				lblSolicitudes_1.setIcon(new ImageIcon(Help.class.getResource("/InterfazGrafica/Images/Info.png")));
				lblSolicitudes_1.setBounds(10, 253, 172, 48);
				panel.add(lblSolicitudes_1);
			}
		}
		{
			JPanel panel = new JPanel();
			panel.setLayout(null);
			panel.setForeground(Color.BLACK);
			panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "                 Reportes", TitledBorder.LEFT, TitledBorder.ABOVE_TOP, null, null));
			panel.setBackground(new Color(248, 248, 255));
			panel.setBounds(164, 360, 227, 279);
			contentPanel.add(panel);
			{
				JLabel label = new JLabel("");
				label.setIcon(new ImageIcon(Help.class.getResource("/InterfazGrafica/Images/Bar Chart.png")));
				label.setBounds(10, 0, 46, 48);
				panel.add(label);
			}
			{
				JLabel lblPermiteVisualizarLa = new JLabel("Permite llevar estadisticas del Sistema ");
				lblPermiteVisualizarLa.setFont(lblPermiteVisualizarLa.getFont().deriveFont(lblPermiteVisualizarLa.getFont().getStyle() & ~Font.BOLD));
				lblPermiteVisualizarLa.setBounds(10, 59, 231, 14);
				panel.add(lblPermiteVisualizarLa);
			}
			{
				JLabel lblRegistradosYSus = new JLabel("y visualizar los listados de solicitudes");
				lblRegistradosYSus.setFont(lblRegistradosYSus.getFont().deriveFont(lblRegistradosYSus.getFont().getStyle() & ~Font.BOLD));
				lblRegistradosYSus.setBounds(10, 77, 231, 14);
				panel.add(lblRegistradosYSus);
			}
			{
				JLabel lblSolicitudesRegistradas = new JLabel("pendientes y satisfechas.");
				lblSolicitudesRegistradas.setFont(lblSolicitudesRegistradas.getFont().deriveFont(lblSolicitudesRegistradas.getFont().getStyle() & ~Font.BOLD));
				lblSolicitudesRegistradas.setBounds(10, 93, 231, 14);
				panel.add(lblSolicitudesRegistradas);
			}
			{
				JLabel lblSolicitudesPendientes = new JLabel("Solicitudes Pendientes");
				lblSolicitudesPendientes.setIcon(new ImageIcon(Help.class.getResource("/InterfazGrafica/Images/pendientes.png")));
				lblSolicitudesPendientes.setBounds(10, 138, 207, 43);
				panel.add(lblSolicitudesPendientes);
			}
			{
				JLabel lblSolicitudesSatisfechas = new JLabel("Solicitudes Satisfechas");
				lblSolicitudesSatisfechas.setIcon(new ImageIcon(Help.class.getResource("/InterfazGrafica/Images/cheking.png")));
				lblSolicitudesSatisfechas.setBounds(10, 205, 207, 48);
				panel.add(lblSolicitudesSatisfechas);
			}
			{
				JLabel label = new JLabel("Solicitudes");
				label.setBounds(10, 264, 172, 48);
				panel.add(label);
			}
		}
		{
			JPanel panel = new JPanel();
			panel.setLayout(null);
			panel.setForeground(Color.BLACK);
			panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "                 Consultar", TitledBorder.LEFT, TitledBorder.ABOVE_TOP, null, null));
			panel.setBackground(new Color(248, 248, 255));
			panel.setBounds(436, 360, 227, 279);
			contentPanel.add(panel);
			{
				JLabel label = new JLabel("");
				label.setIcon(new ImageIcon(Help.class.getResource("/InterfazGrafica/Images/Search48.png")));
				label.setBounds(10, 0, 46, 48);
				panel.add(label);
			}
			{
				JLabel lblPermiteAccederA_1 = new JLabel("Permite consultar todos los registros");
				lblPermiteAccederA_1.setFont(lblPermiteAccederA_1.getFont().deriveFont(lblPermiteAccederA_1.getFont().getStyle() & ~Font.BOLD));
				lblPermiteAccederA_1.setBounds(10, 59, 231, 14);
				panel.add(lblPermiteAccederA_1);
			}
			{
				JLabel lblYAccederDirectamente = new JLabel("y acceder directamente a un cliente");
				lblYAccederDirectamente.setFont(lblYAccederDirectamente.getFont().deriveFont(lblYAccederDirectamente.getFont().getStyle() & ~Font.BOLD));
				lblYAccederDirectamente.setBounds(10, 77, 231, 14);
				panel.add(lblYAccederDirectamente);
			}
			{
				JLabel lblPorMedioDe = new JLabel("por medio de su ID o RNC.");
				lblPorMedioDe.setFont(lblPorMedioDe.getFont().deriveFont(lblPorMedioDe.getFont().getStyle() & ~Font.BOLD));
				lblPorMedioDe.setBounds(10, 93, 231, 14);
				panel.add(lblPorMedioDe);
			}
			{
				JLabel lblEmpresa_1 = new JLabel("Empresa");
				lblEmpresa_1.setIcon(new ImageIcon(Help.class.getResource("/InterfazGrafica/Images/1416396195_Company.png")));
				lblEmpresa_1.setBounds(10, 130, 172, 56);
				panel.add(lblEmpresa_1);
			}
			{
				JLabel lblSolicitante_1 = new JLabel("Solicitante");
				lblSolicitante_1.setIcon(new ImageIcon(Help.class.getResource("/InterfazGrafica/Images/Profile.png")));
				lblSolicitante_1.setBounds(10, 205, 172, 48);
				panel.add(lblSolicitante_1);
			}
			{
				JLabel label = new JLabel("Solicitudes");
				label.setBounds(10, 264, 172, 48);
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
