package InterfazGrafica;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Welcome extends JFrame {

	private JPanel contentPane;
	private Dimension dim;
	private PersonRegister personRegister;
	private CompanyRegister companyRegister;
	private PersonApplication personApplication;
	private CompanyApplication companyApplication;
	private Start start;
	private CloseProgram closeProgram;
	private static Welcome welcome;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcome frame = new Welcome();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws PropertyVetoException 
	 */
	private Welcome() throws PropertyVetoException {
		setResizable(false);
		setTitle("BOLSA DE EMPLEOS REP.DOM");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Welcome.class.getResource("/InterfazGrafica/Images/Encontrar-Trabajo1.jpg")));
		setForeground(new Color(0, 0, 0));
		setFont(new Font("Tahoma", Font.BOLD, 15));
		setBackground(new Color(176, 224, 230));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		dim = super.getToolkit().getScreenSize();
		super.setSize(dim);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(248, 248, 255));
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(174, 181, 46, 14);
		contentPane.add(lblNewLabel);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(176, 224, 230));
		menuBar.setBounds(0, 0, 1360, 90);
		contentPane.add(menuBar);
		
		JMenu menu = new JMenu("");
		menuBar.add(menu);
		
		JMenu menu_1 = new JMenu("                    ");
		menu_1.setEnabled(false);
		menuBar.add(menu_1);
		
		JMenu mnInicio = new JMenu("  INICIO     ");
		mnInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				start = new Start();
				start.setVisible(true);
				
			}
		});
		mnInicio.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Images/1416514885_home.png")));
		mnInicio.setFont(new Font("Tahoma", Font.BOLD, 12));
		menuBar.add(mnInicio);
		
		JMenu mnRegistrar = new JMenu("REGISTRAR     ");
		menuBar.add(mnRegistrar);
		mnRegistrar.setHideActionText(true);
		mnRegistrar.setFont(new Font("Tahoma", Font.BOLD, 12));
		mnRegistrar.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Images/Modify.png")));
		
		JMenuItem menuItemSolicitante = new JMenuItem("Solicitante");
		menuItemSolicitante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				personRegister = new PersonRegister();
				personRegister.setVisible(true);
			}
		});
		menuItemSolicitante.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Images/Profile.png")));
		mnRegistrar.add(menuItemSolicitante);
		
		JMenuItem mntmEmpresa = new JMenuItem("Empresa");
		mntmEmpresa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				companyRegister = new CompanyRegister();
				companyRegister.setVisible(true);
			}
		});	
		mntmEmpresa.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Images/1416396195_Company.png")));
		mnRegistrar.add(mntmEmpresa);
		
		JMenu mnNuevaSolicitud = new JMenu("Solicitud");
		mnNuevaSolicitud.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Images/Info.png")));
		mnRegistrar.add(mnNuevaSolicitud);
		
		JMenuItem mntmEmpleado = new JMenuItem("Empleado");
		mntmEmpleado.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Images/1416396913_Login.png")));
		mntmEmpleado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				personApplication = new PersonApplication();
				personApplication.setVisible(true);
			}
		});
		mnNuevaSolicitud.add(mntmEmpleado);
		
		JMenuItem mntmEmpresa_2 = new JMenuItem("Empresa");
		mntmEmpresa_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				companyApplication = new CompanyApplication();
				companyApplication.setVisible(true);
			}
		});
		mnNuevaSolicitud.add(mntmEmpresa_2);
		
		JMenu mnBaseDeDatos = new JMenu("BASE DE DATOS     ");
		menuBar.add(mnBaseDeDatos);
		mnBaseDeDatos.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Images/1416395841_archive.png")));
		mnBaseDeDatos.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JMenu mnSolicitudes = new JMenu("Solicitudes");
		mnSolicitudes.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Images/Info.png")));
		mnBaseDeDatos.add(mnSolicitudes);
		
		JMenuItem mntmEmpleados = new JMenuItem("Empleados");
		mntmEmpleados.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Images/1416396281_testimonials.png")));
		mnSolicitudes.add(mntmEmpleados);
		
		JMenuItem mntmE = new JMenuItem("Empresas");
		mntmE.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Images/1416396371_companies.png")));
		mnSolicitudes.add(mntmE);
		
		JMenuItem mntmAreasDisponibles = new JMenuItem("Areas Disponibles");
		mntmAreasDisponibles.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Images/areas.png")));
		mnBaseDeDatos.add(mntmAreasDisponibles);
		
		JMenu mnReportes = new JMenu("REPORTES     ");
		menuBar.add(mnReportes);
		mnReportes.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Images/Bar Chart.png")));
		mnReportes.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JMenu mnSatisfechos = new JMenu("Satisfechos");
		mnSatisfechos.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Images/cheking.png")));
		mnReportes.add(mnSatisfechos);
		
		JMenuItem mntmSolicitantes = new JMenuItem("Solicitantes");
		mnSatisfechos.add(mntmSolicitantes);
		
		JMenuItem mntmEmpresas = new JMenuItem("Empresas");
		mnSatisfechos.add(mntmEmpresas);
		
		JMenu mnPendientes = new JMenu("Pendientes");
		mnPendientes.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Images/pendientes.png")));
		mnReportes.add(mnPendientes);
		
		JMenuItem mntmSolicitantes_1 = new JMenuItem("Solicitantes");
		mnPendientes.add(mntmSolicitantes_1);
		
		JMenuItem mntmEmpresas_1 = new JMenuItem("Empresas");
		mnPendientes.add(mntmEmpresas_1);
		
		JMenu mnImprimir = new JMenu("IMPRIMIR     ");
		menuBar.add(mnImprimir);
		mnImprimir.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Images/1416396773_print.png")));
		mnImprimir.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JMenu ImprimirReporte = new JMenu("Reporte");
		ImprimirReporte.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Images/Bar Chart.png")));
		mnImprimir.add(ImprimirReporte);
		
		JMenuItem ImpRepSatisfied = new JMenuItem("Satisfechos");
		ImprimirReporte.add(ImpRepSatisfied);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Pendientes");
		ImprimirReporte.add(mntmNewMenuItem_1);
		
		JMenu mnSolicitud = new JMenu("Solicitud");
		mnSolicitud.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Images/Info.png")));
		mnImprimir.add(mnSolicitud);
		
		JMenuItem mntmPersona = new JMenuItem("Persona");
		mnSolicitud.add(mntmPersona);
		
		JMenuItem mntmEmpresa_1 = new JMenuItem("Empresa");
		mnSolicitud.add(mntmEmpresa_1);
		
		JMenu mnConsultas = new JMenu("CONSULTAS     ");
		mnConsultas.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Images/Search.png")));
		mnConsultas.setFont(new Font("Tahoma", Font.BOLD, 12));
		menuBar.add(mnConsultas);
		
		JMenuItem mntmConsultaSolicitante = new JMenuItem("Solicitante");
		mntmConsultaSolicitante.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Images/Profile.png")));
		mnConsultas.add(mntmConsultaSolicitante);
		
		JMenuItem mntmConsultaEmpresa = new JMenuItem("Empresa");
		mntmConsultaEmpresa.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Images/1416396195_Company.png")));
		mnConsultas.add(mntmConsultaEmpresa);
		
		JMenuItem mntmArea = new JMenuItem("\u00C1rea");
		mntmArea.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Images/areas.png")));
		mnConsultas.add(mntmArea);
		
		JMenu mnAyuda = new JMenu("AYUDA     ");
		menuBar.add(mnAyuda);
		mnAyuda.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Images/1416396005_FAQ.png")));
		mnAyuda.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JButton btnNewButton = new JButton("CERRAR");
		btnNewButton.setBounds(new Rectangle(0, 0, 20, 10));
		btnNewButton.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnNewButton.setAutoscrolls(true);
		btnNewButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				closeProgram = new CloseProgram();
				closeProgram.setVisible(true);
				
			}
		});
		btnNewButton.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Images/Delete.png")));
		btnNewButton.setBackground(new Color(176, 224, 230));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setForeground(SystemColor.inactiveCaptionText);
		menuBar.add(btnNewButton);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Images/images (1).jpg")));
		lblNewLabel_1.setBounds(262, 241, 845, 488);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblBolsaDeEmpleos_1 = new JLabel("BOLSA DE EMPLEOS ");
		lblBolsaDeEmpleos_1.setForeground(Color.BLUE);
		lblBolsaDeEmpleos_1.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblBolsaDeEmpleos_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblBolsaDeEmpleos_1.setBounds(262, 181, 845, 49);
		contentPane.add(lblBolsaDeEmpleos_1);
		
	}
	
	public static Welcome getInstanceWelcome(){
		
		if (welcome==null){
			
			try {
				welcome = new Welcome();
			} catch (PropertyVetoException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	return welcome;}
}
