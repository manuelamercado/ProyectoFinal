package InterfazGrafica;

import java.awt.BorderLayout;

import javax.swing.AbstractButton;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
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
import java.awt.event.MouseAdapter;
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

import javax.swing.border.LineBorder;

import java.awt.Window.Type;

public class Welcome extends JFrame {

	private JPanel contentPane;
	private Dimension dim;
	private PersonRegister personRegister;
	private CompanyRegister companyRegister;
	private PersonApplicationVisual personApplication;
	private CompanyApplicationVisual companyApplicationVisual;
	private CloseProgram closeProgram;
	private static Welcome welcome;
	private SeePersonApplication seePersonApplication;
	private SeeCompanyApplication seeCompanyApplication;
	private Help help;
	private DisponibleAreas disponibleAreas;
	private SeeCompanies seeCompanies;
	private SeePersons seePersons;
	private SeeSatisfiedPerson seeSatisfiedPerson;
	private SeeSatisfiedCompany seeSatisfiedCompany;
	private PersonHistory personHistory;
	private SearchPerson searchPerson;
	private SearchCompany searchCompany;
	protected static final AbstractButton KeyPressed = null;
	private PersonPendingApplication personPendingApplication;
	private CompanyPendingApplication companyPendingApplication;
	private PersonAssignation personAssignation;
	
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
	Welcome() throws PropertyVetoException {
		setResizable(false);
		setTitle("BOLSA DE EMPLEOS REP.DOM");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Welcome.class.getResource("/InterfazGrafica/Images/Encontrar-Trabajo.jpg")));
		setForeground(new Color(0, 0, 0));
		setFont(new Font("Tahoma", Font.BOLD, 15));
		setBackground(new Color(176, 224, 230));
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
		
		JMenu menu_1 = new JMenu(" ");
		menu_1.setEnabled(false);
		menuBar.add(menu_1);
		
		JMenu mnInicio = new JMenu("  INICIO       ");
		mnInicio.setFocusTraversalKeysEnabled(false);
		mnInicio.setFocusPainted(true);
		mnInicio.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Images/1416514885_home.png")));
		mnInicio.setFont(new Font("Tahoma", Font.BOLD, 12));
		menuBar.add(mnInicio);
		
		JMenu mnNuevo = new JMenu("Nuevo Cliente");
		mnNuevo.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Images/Add32.png")));
		mnInicio.add(mnNuevo);
		
		JMenuItem mntmSolicitante = new JMenuItem("Solicitante");
		mntmSolicitante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 personRegister = new PersonRegister();
			 personRegister.setVisible(true);
			 }
			 });
		mntmSolicitante.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Images/Profile32.png")));
		mnNuevo.add(mntmSolicitante);
		
		JMenuItem mntmEmpresa_3 = new JMenuItem("Empresa");
		mntmEmpresa_3.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
			 companyRegister = new CompanyRegister();
			 companyRegister.setVisible(true);
			 }
			 });
		mntmEmpresa_3.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Images/Company32.png")));
		mnNuevo.add(mntmEmpresa_3);
		
		JMenu mnNuevaSolicitud_1 = new JMenu("Nueva Solicitud");
		mnNuevaSolicitud_1.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Images/1417568890_new-file.png")));
		mnInicio.add(mnNuevaSolicitud_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Solicitante");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 personApplication = new PersonApplicationVisual();
			 personApplication.setVisible(true);
			 }
			 });
		mntmNewMenuItem.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Images/Profile32.png")));
		mnNuevaSolicitud_1.add(mntmNewMenuItem);
		
		JMenuItem mntmEmpresa_4 = new JMenuItem("Empresa");
		mntmEmpresa_4.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
			 companyApplicationVisual = new CompanyApplicationVisual();
			 companyApplicationVisual.setVisible(true);
			 }
			 });
		mntmEmpresa_4.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Images/Company32.png")));
		mnNuevaSolicitud_1.add(mntmEmpresa_4);
		
		JMenu mnBuscar = new JMenu("Buscar");
		 mnBuscar.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Images/Search32.png")));
		 mnInicio.add(mnBuscar);
		
		 JMenuItem mntmSolicitante_1 = new JMenuItem("Solicitante");
		 mntmSolicitante_1.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent arg0) {
		 		searchPerson = new SearchPerson();
		 		searchPerson.setVisible(true);
		 	}
		 });
		 mntmSolicitante_1.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Images/Profile32.png")));
		 mnBuscar.add(mntmSolicitante_1);
		
		 JMenuItem mntmEmpresa_5 = new JMenuItem("Empresa");
		 mntmEmpresa_5.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent arg0) {
		 		searchCompany = new SearchCompany();
				searchCompany.setVisible(true);
		 	}
		 });
		 mntmEmpresa_5.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Images/Company32.png")));
		 mnBuscar.add(mntmEmpresa_5);
		 
		JMenuItem mntmAyuda = new JMenuItem("Ayuda");
		mntmAyuda.addActionListener(new ActionListener() {
		 public void actionPerformed(ActionEvent e) {
		 help = new Help();
		 help.setVisible(true);
		}
		 });
		mntmAyuda.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Images/Ayuda32.png")));
		 mnInicio.add(mntmAyuda);
		
		 JMenuItem mntmCerrar = new JMenuItem("Cerrar");
		 mntmCerrar.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent arg0) {
		 		closeProgram = new CloseProgram();
		 		closeProgram.setVisible(true);
		 	}
		 });
		  mntmCerrar.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Images/Delete32.png")));
		  mnInicio.add(mntmCerrar);
		 
		JMenu mnRegistrar = new JMenu("REGISTRAR       ");
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
		
		JMenuItem mntmEmpleado = new JMenuItem("Solicitante");
		mntmEmpleado.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Images/Profile32.png")));
		mntmEmpleado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				personApplication = new PersonApplicationVisual();
				personApplication.setVisible(true);
			}
		});
		mnNuevaSolicitud.add(mntmEmpleado);
		
		JMenuItem mntmEmpresa_2 = new JMenuItem("Empresa");
		mntmEmpresa_2.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Images/Company32.png")));
		mntmEmpresa_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				companyApplicationVisual = new CompanyApplicationVisual();
				companyApplicationVisual.setVisible(true);
			}
		});
		mnNuevaSolicitud.add(mntmEmpresa_2);
		
		JMenu mnBaseDeDatos = new JMenu("BASE DE DATOS     ");
		menuBar.add(mnBaseDeDatos);
		mnBaseDeDatos.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Images/1416395841_archive.png")));
		mnBaseDeDatos.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JMenuItem mntmAreasDisponibles = new JMenuItem("Areas Disponibles");
		mntmAreasDisponibles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				disponibleAreas = new DisponibleAreas();
				disponibleAreas.setVisible(true);
			}
		});
		mntmAreasDisponibles.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Images/areas.png")));
		mnBaseDeDatos.add(mntmAreasDisponibles);
		
		JMenu mnRegistros = new JMenu("Registros ");
		mnRegistros.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Images/Modify.png")));
		mnBaseDeDatos.add(mnRegistros);
		
		JMenuItem mntmNewMenuItemSolicitantes = new JMenuItem("Solicitantes");
		mntmNewMenuItemSolicitantes.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Images/1417828816_testimonials.png")));
		mntmNewMenuItemSolicitantes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seePersons = new SeePersons();
				seePersons.setVisible(true);
			}
		});
		mnRegistros.add(mntmNewMenuItemSolicitantes);
		
		JMenuItem mntmEmpresas_2 = new JMenuItem("Empresas");
		mntmEmpresas_2.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Images/1417828832_companies.png")));
		mntmEmpresas_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					seeCompanies = new SeeCompanies();
					seeCompanies.setVisible(true);		
			}
		});
		mnRegistros.add(mntmEmpresas_2);
		
		JMenu mnSolicitudes = new JMenu("Solicitudes");
		mnSolicitudes.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Images/Info.png")));
		mnBaseDeDatos.add(mnSolicitudes);
		
		JMenuItem mntmEmpleados = new JMenuItem("Solicitantes");
		mntmEmpleados.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Images/1417828816_testimonials.png")));
		mntmEmpleados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seePersonApplication = new SeePersonApplication();
				seePersonApplication.setVisible(true);
			}
		});
		mnSolicitudes.add(mntmEmpleados);
		
		JMenuItem mntmEmpresas2 = new JMenuItem("Empresas");
		mntmEmpresas2.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Images/1417828832_companies.png")));
		mntmEmpresas2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seeCompanyApplication = new SeeCompanyApplication();
				seeCompanyApplication.setVisible(true);
			}
		});
		mnSolicitudes.add(mntmEmpresas2);
		
		JMenu mnReportes = new JMenu("REPORTES       ");
		menuBar.add(mnReportes);
		mnReportes.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Images/Bar Chart.png")));
		mnReportes.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JMenu mnPendientes = new JMenu("Solicitudes Pendientes");
		mnPendientes.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Images/pendientes.png")));
		mnReportes.add(mnPendientes);
		
		JMenuItem mntmSolicitantes_1 = new JMenuItem("Solicitantes");
		mntmSolicitantes_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				personPendingApplication = new PersonPendingApplication();
				personPendingApplication.setVisible(true);
			}
		});
		mntmSolicitantes_1.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Images/1417828816_testimonials.png")));
		mnPendientes.add(mntmSolicitantes_1);
		
		JMenuItem mntmEmpresas_1 = new JMenuItem("Empresas");
		mntmEmpresas_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				companyPendingApplication = new CompanyPendingApplication();
				companyPendingApplication.setVisible(true);
			}
		});
		mntmEmpresas_1.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Images/1417828832_companies.png")));
		mnPendientes.add(mntmEmpresas_1);
		
		JMenu mnSatisfechos = new JMenu("Solicitudes Satisfechos");
		mnSatisfechos.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Images/cheking.png")));
		mnReportes.add(mnSatisfechos);
		
		JMenuItem mntmSolicitantes = new JMenuItem("Solicitantes");
		mntmSolicitantes.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Images/1417828816_testimonials.png")));
		mntmSolicitantes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seeSatisfiedPerson = new SeeSatisfiedPerson();
				seeSatisfiedPerson.setVisible(true);
			}
		});
		mnSatisfechos.add(mntmSolicitantes);
		
		JMenuItem mntmEmpresas = new JMenuItem("Empresas");
		mntmEmpresas.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Images/1417828832_companies.png")));
		mntmEmpresas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seeSatisfiedCompany = new SeeSatisfiedCompany();
				seeSatisfiedCompany.setVisible(true);
			}
		});
		mnSatisfechos.add(mntmEmpresas);
		
		JMenu mnConsultas = new JMenu("CONSULTAR   ");
		mnConsultas.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Images/Search48.png")));
		mnConsultas.setFont(new Font("Tahoma", Font.BOLD, 12));
		menuBar.add(mnConsultas);
		

		JMenuItem mntmConsultaEmpresa = new JMenuItem("Empresa");
		mntmConsultaEmpresa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			searchCompany = new SearchCompany();
			searchCompany.setVisible(true);
			}
		});
		mntmConsultaEmpresa.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Images/1416396195_Company.png")));
		mnConsultas.add(mntmConsultaEmpresa);
		
		JMenuItem mntmConsultaSolicitante = new JMenuItem("Solicitante");
		mntmConsultaSolicitante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			searchPerson = new SearchPerson();
			searchPerson.setVisible(true);
			}
		});
		mntmConsultaSolicitante.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Images/Profile.png")));
		mnConsultas.add(mntmConsultaSolicitante);
		
		JMenu mnAsignar = new JMenu("ASIGNAR ");
		 mnAsignar.addMouseListener(new MouseAdapter() {
		 @Override
		 public void mouseClicked(MouseEvent e) {
		
		 personAssignation = new PersonAssignation();
		 personAssignation.setVisible(true);
		 }
		});
		 mnAsignar.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Images/si.png")));
		 mnAsignar.setFont(new Font("Tahoma", Font.BOLD, 12));
		 menuBar.add(mnAsignar);
		 
		JMenu mnAyuda = new JMenu("AYUDA        ");
		mnAyuda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
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
		
		
		 mnAsignar.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Images/si.png")));
		 mnAsignar.setFont(new Font("Tahoma", Font.BOLD, 12));
		 menuBar.add(mnAsignar);
		menuBar.add(mnAyuda);
		mnAyuda.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Images/1416396005_FAQ.png")));
		mnAyuda.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JButton btnCerrar = new JButton("CERRAR  ");
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
		
		JLabel lblBolsaDeEmpleos_1 = new JLabel("BOLSA DE EMPLEOS ");
		lblBolsaDeEmpleos_1.setForeground(Color.BLUE);
		lblBolsaDeEmpleos_1.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblBolsaDeEmpleos_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblBolsaDeEmpleos_1.setBounds(270, 116, 845, 49);
		contentPane.add(lblBolsaDeEmpleos_1);
		
		JLabel lblSolucionesEmpresarialesY = new JLabel("SOLUCIONES EMPRESARIALES Y LABORALES ");
		lblSolucionesEmpresarialesY.setForeground(Color.BLUE);
		lblSolucionesEmpresarialesY.setHorizontalAlignment(SwingConstants.CENTER);
		lblSolucionesEmpresarialesY.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblSolucionesEmpresarialesY.setBackground(new Color(248, 248, 255));
		lblSolucionesEmpresarialesY.setBounds(243, 658, 873, 71);
		contentPane.add(lblSolucionesEmpresarialesY);	
		
		
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(243, 159, 834, 550);
		contentPane.add(lblNewLabel_1);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Images/iconowelcome.png")));
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
	