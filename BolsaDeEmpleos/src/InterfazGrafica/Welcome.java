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

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.SwingConstants;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JCheckBoxMenuItem;

public class Welcome extends JFrame {

	private JPanel contentPane;
	private Dimension dim;
	private PersonRegister personRegister;

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
	 */
	public Welcome() {
		setResizable(false);
		setTitle("BOLSA DE EMPLEOS REP.DOM");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Welcome.class.getResource("/InterfazGrafica/Encontrar-Trabajo.jpg")));
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
		
		JMenu mnInicio = new JMenu("INICIO");
		mnInicio.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/1416514885_home.png")));
		mnInicio.setFont(new Font("Tahoma", Font.BOLD, 12));
		menuBar.add(mnInicio);
		
		JMenu mnRegistrar = new JMenu("REGISTRAR");
		menuBar.add(mnRegistrar);
		mnRegistrar.setHideActionText(true);
		mnRegistrar.setFont(new Font("Tahoma", Font.BOLD, 12));
		mnRegistrar.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Modify.png")));
		
		JMenuItem menuItemSolicitante = new JMenuItem("Solicitante");
		menuItemSolicitante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				personRegister = new PersonRegister();
				personRegister.setVisible(true);
			}
		});
		menuItemSolicitante.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Profile.png")));
		mnRegistrar.add(menuItemSolicitante);
		
		JMenuItem mntmEmpresa = new JMenuItem("Empresa");
		mntmEmpresa.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/1416396195_Company.png")));
		mnRegistrar.add(mntmEmpresa);
		
		JMenu mnBaseDeDatos = new JMenu("BASE DE DATOS");
		menuBar.add(mnBaseDeDatos);
		mnBaseDeDatos.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/1416395841_archive.png")));
		mnBaseDeDatos.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JMenu mnSolicitudes = new JMenu("Solicitudes");
		mnSolicitudes.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Info.png")));
		mnBaseDeDatos.add(mnSolicitudes);
		
		JMenuItem mntmEmpleados = new JMenuItem("Empleados");
		mntmEmpleados.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/1416396281_testimonials.png")));
		mnSolicitudes.add(mntmEmpleados);
		
		JMenuItem mntmE = new JMenuItem("Empresas");
		mntmE.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/1416396371_companies.png")));
		mnSolicitudes.add(mntmE);
		
		JMenuItem mntmAreasDisponibles = new JMenuItem("Areas Disponibles");
		mnBaseDeDatos.add(mntmAreasDisponibles);
		
		JMenu mnReportes = new JMenu("REPORTES");
		menuBar.add(mnReportes);
		mnReportes.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Bar Chart.png")));
		mnReportes.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JMenu mnSatisfechos = new JMenu("Satisfechos");
		mnSatisfechos.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/cheking.png")));
		mnReportes.add(mnSatisfechos);
		
		JMenu mnPendientes = new JMenu("Pendientes");
		mnReportes.add(mnPendientes);
		
		JMenu mnImprimir = new JMenu("IMPRIMIR");
		menuBar.add(mnImprimir);
		mnImprimir.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/1416396773_print.png")));
		mnImprimir.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JMenu mnConsultas = new JMenu("CONSULTAS");
		mnConsultas.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/Search.png")));
		mnConsultas.setFont(new Font("Tahoma", Font.BOLD, 12));
		menuBar.add(mnConsultas);
		
		JMenu mnAyuda = new JMenu("AYUDA");
		menuBar.add(mnAyuda);
		mnAyuda.setIcon(new ImageIcon(Welcome.class.getResource("/InterfazGrafica/1416396005_FAQ.png")));
		mnAyuda.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Sorismelda\\Desktop\\7mo. Semestre\\Programacion 1\\Proyecto Final\\images (1).jpg"));
		lblNewLabel_1.setBounds(281, 197, 798, 444);
		contentPane.add(lblNewLabel_1);
		
	}
}
