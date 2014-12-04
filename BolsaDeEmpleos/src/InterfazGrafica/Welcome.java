package InterfazGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Dialog.ModalExclusionType;

import javax.swing.JMenuBar;

import org.eclipse.wb.swing.FocusTraversalOnArray;

import EmploymentMarket01.CollectionPerson;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.beans.PropertyVetoException;

import javax.swing.JMenu;
import javax.swing.SwingConstants;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;

import java.awt.SystemColor;
import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.awt.Rectangle;

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
	private SeePersonApplication seePersonApplication;
	private CollectionPerson collectionPerson;
	private Help help;
	

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
		setIconImage(Toolkit.getDefaultToolkit().getImage(Welcome.class.getResource("/InterfazGrafica/Images/Encontrar-Trabajo.jpg")));
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
		mnInicio.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				start = new Start();
				start.setVisible(true);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
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
		mntmEmpleado.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Images/Profile32.png")));
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
		
		JMenuItem mntmAreasDisponibles = new JMenuItem("Areas Disponibles");
		mntmAreasDisponibles.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Images/areas.png")));
		mnBaseDeDatos.add(mntmAreasDisponibles);
		
		JMenu mnRegistros = new JMenu("Registros ");
		mnRegistros.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Images/Modify.png")));
		mnBaseDeDatos.add(mnRegistros);
		
		JMenuItem mntmNewMenuItemSolicitantes = new JMenuItem("Solicitantes");
		mnRegistros.add(mntmNewMenuItemSolicitantes);
		
		JMenuItem mntmEmpresas_2 = new JMenuItem("Empresas");
		mnRegistros.add(mntmEmpresas_2);
		
		JMenu mnSolicitudes = new JMenu("Solicitudes");
		mnSolicitudes.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Images/Info.png")));
		mnBaseDeDatos.add(mnSolicitudes);
		
		JMenuItem mntmEmpleados = new JMenuItem("Empleados");
		mnSolicitudes.add(mntmEmpleados);
		
		JMenuItem mntmEmpresas2 = new JMenuItem("Empresas");
		mnSolicitudes.add(mntmEmpresas2);
		
		JMenu mnReportes = new JMenu("REPORTES     ");
		menuBar.add(mnReportes);
		mnReportes.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Images/Bar Chart.png")));
		mnReportes.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JMenu mnPendientes = new JMenu("Pendientes");
		mnPendientes.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Images/pendientes.png")));
		mnReportes.add(mnPendientes);
		
		JMenuItem mntmSolicitantes_1 = new JMenuItem("Solicitantes");
		mntmSolicitantes_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				seePersonApplication= new SeePersonApplication();
				seePersonApplication.setVisible(true);
			}
		});
		mnPendientes.add(mntmSolicitantes_1);
		
		JMenuItem mntmEmpresas_1 = new JMenuItem("Empresas");
		mnPendientes.add(mntmEmpresas_1);
		
		JMenu mnSatisfechos = new JMenu("Satisfechos");
		mnSatisfechos.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Images/cheking.png")));
		mnReportes.add(mnSatisfechos);
		
		JMenuItem mntmSolicitantes = new JMenuItem("Solicitantes");
		mnSatisfechos.add(mntmSolicitantes);
		
		JMenuItem mntmEmpresas = new JMenuItem("Empresas");
		mnSatisfechos.add(mntmEmpresas);
		
		JMenu mnImprimir = new JMenu("IMPRIMIR     ");
		menuBar.add(mnImprimir);
		mnImprimir.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Images/1416396773_print.png")));
		mnImprimir.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JMenu ImprimirReporte = new JMenu("Reporte");
		ImprimirReporte.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Images/Bar Chart.png")));
		mnImprimir.add(ImprimirReporte);
		
		JMenuItem ImpRepSatisfied = new JMenuItem("Satisfechos");
		ImprimirReporte.add(ImpRepSatisfied);
		
		JMenuItem mntmPendientes = new JMenuItem("Pendientes");
		ImprimirReporte.add(mntmPendientes);
		
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
		
		JMenuItem mntmConsultaArea = new JMenuItem("\u00C1rea");
		mntmConsultaArea.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Images/areas.png")));
		mnConsultas.add(mntmConsultaArea);
		
		JMenuItem mntmConsultaEmpresa = new JMenuItem("Empresa");
		mntmConsultaEmpresa.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Images/1416396195_Company.png")));
		mnConsultas.add(mntmConsultaEmpresa);
		
		JMenuItem mntmConsultaSolicitante = new JMenuItem("Solicitante");
		mntmConsultaSolicitante.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Images/Profile.png")));
		mnConsultas.add(mntmConsultaSolicitante);
		
		JMenu mnAyuda = new JMenu("AYUDA     ");
		mnAyuda.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				help = new Help();
				help.setVisible(true);	
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		menuBar.add(mnAyuda);
		mnAyuda.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Images/1416396005_FAQ.png")));
		mnAyuda.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JButton btnCerrar = new JButton("CERRAR");
		btnCerrar.setBounds(new Rectangle(0, 0, 20, 10));
		btnCerrar.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnCerrar.setAutoscrolls(true);
		btnCerrar.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					closeProgram = new CloseProgram();
					closeProgram.setVisible(true);
					
				
			}
		});
		btnCerrar.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Images/Delete.png")));
		btnCerrar.setBackground(new Color(176, 224, 230));
		btnCerrar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCerrar.setForeground(SystemColor.inactiveCaptionText);
		menuBar.add(btnCerrar);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Images/iconowelcome.png")));
		lblNewLabel_1.setBounds(205, 181, 883, 483);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblBolsaDeEmpleos_1 = new JLabel("BOLSA DE EMPLEOS ");
		lblBolsaDeEmpleos_1.setForeground(Color.BLUE);
		lblBolsaDeEmpleos_1.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblBolsaDeEmpleos_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblBolsaDeEmpleos_1.setBounds(259, 115, 845, 49);
		contentPane.add(lblBolsaDeEmpleos_1);
		
		JLabel lblSolucionesEmpresarialesY = new JLabel("SOLUCIONES EMPRESARIALES Y LABORALES ");
		lblSolucionesEmpresarialesY.setForeground(Color.BLUE);
		lblSolucionesEmpresarialesY.setHorizontalAlignment(SwingConstants.CENTER);
		lblSolucionesEmpresarialesY.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblSolucionesEmpresarialesY.setBackground(new Color(248, 248, 255));
		lblSolucionesEmpresarialesY.setBounds(215, 628, 873, 71);
		contentPane.add(lblSolucionesEmpresarialesY);
		
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
