package InterfazGrafica;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.text.MaskFormatter;

import EmploymentMarket01.Academic;
import EmploymentMarket01.CollectionPerson;
import EmploymentMarket01.DreamerNini;
import EmploymentMarket01.Technical;

import javax.swing.JLayeredPane;

import com.toedter.calendar.JDateChooser;

import javax.swing.JFormattedTextField;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class PersonRegister extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3034749239761135563L;
	protected static final String String = null;
	protected static final Date Date = null;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtSuperlargoArchipielago;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private final JPanel panelUniversityStudy;
	private JComboBox<String> comboBox_1;
	private final JPanel panelTechnicalStudies;
	private JPanel panel_5Oficio;
	private JComboBox<String> comboBox_1_3;
	private final JComboBox<String> comboBoxGrado;
	private final JComboBox<String> comboBoxPostGrado;
	private JComboBox<String> comboBox_Certificaciones;
	private JComboBox<String> comboBoxEspecialidades;
	private JComboBox<String> comboBox_5_1;
	private JComboBox<String> comboBoxEstudiosTecnicos;
	private JComboBox<String> comboBox_6_1;
	private JComboBox<String> comboBoxDoctorado;
	private JComboBox<String> comboBox_7_1;
	private final JComboBox<String> comboBox;
	private JComboBox<String> comboBox_1_1;
	private JComboBox<String> comboBoxSexo;
	private JComboBox<String> comboBox_1_4;
	private JComboBox<String> comboBox_8;
	private JComboBox<String> comboBox_9;
	private JComboBox<String> comboBox_10;
	private JComboBox<String> comboBoxNivelAlcanzado;
	private JLabel error;
	private JDateChooser dateChooser;
	private JFormattedTextField formattedTextFieldID;
	private JFormattedTextField formattedTextFieldMob;
	private JFormattedTextField formattedTextFieldPhone;
	private JFormattedTextField formattedTextFieldPostal;
	private JLabel error1;
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public PersonRegister() {
		setType(Type.NORMAL);
		setLocationByPlatform(true);
		setLocation(new Point(0, 5));
		setLocale(new Locale("es"));
		setFont(new Font("Tahoma", Font.BOLD, 12));
		setModal(true);
		setIconImage(Toolkit.getDefaultToolkit().getImage(PersonRegister.class.getResource("/InterfazGrafica"
				+ "/Images/Profile.png")));
		setTitle("REGISTRAR SOLICITANTE");
		setBounds(10, 50, 836, 747);
		setResizable(false);
		setLocationRelativeTo(rootPane);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(248, 248, 255));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		panel_5Oficio = new JPanel();
		panel_5Oficio.setBackground(new Color(248, 248, 255));
		panel_5Oficio.setBounds(450,242,357,174);
		contentPanel.add(panel_5Oficio);
		panel_5Oficio.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
				"Estudios de Oficio:", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		panel_5Oficio.setVisible(false);
		panel_5Oficio.setLayout(null);
		{
			JLabel lblCertificados = new JLabel("Certificados:");
			lblCertificados.setHorizontalAlignment(SwingConstants.TRAILING);
			lblCertificados.setBounds(10, 25, 107, 14);
			panel_5Oficio.add(lblCertificados);
			}
		{
			comboBox_8 = new JComboBox();
			comboBox_8.setBackground(new Color(248, 248, 255));
			comboBox_8.setModel(new DefaultComboBoxModel(new String[] {"<Selecciona>", "Gesti\u00F3n de recursos humanos",
					"Topograf\u00EDa y geom\u00E1tica para desarrollo inmobiliario", 
					"El ambiente de los locales: Creaci\u00F3n y ambientes que componen estilos", 
					"An\u00E1lisis estad\u00EDstico b\u00E1sico", "Artes culinarias", "Auditor\u00EDa financiera", 
					"Biblioteca y ciencias de la informaci\u00F3n", "Chocolate y confiter\u00EDa", 
					"Configuraci\u00F3n e implantaci\u00F3n de Windows Server 2008", "La contabilidad financiera", 
					"Direcci\u00F3n y gesti\u00F3n empresarial", "Dise\u00F1o y desarrollo de modelos de negocio", 
					"Estrategia financiera: La optimizaci\u00F3n de los recursos y la proyecci\u00F3n de inversiones",
					"Gesti\u00F3n administrativa para asistentes ejecutivos", 
					"La gesti\u00F3n de riesgos de seguridad de la informaci\u00F3n", 
					"La gesti\u00F3n estrat\u00E9gica de las empresas familiares", 
					"Gesti\u00F3n Integrada de Proyectos (DIGIP) en el sector inmobiliario y de la construcci\u00F3n"
					+ " en la RD", "Gesti\u00F3n y direcci\u00F3n estrat\u00E9gica del capital humano", 
					"Impuestos Corporativos: Nuevas tendencias y reglamentos tributarios", "Inteligencia Empresarial", 
					"Ingl\u00E9s intermedio", "Medici\u00F3n, redise\u00F1o y mejoras de procesos", 
					"Gesti\u00F3n de la cadena de suministro", 
					"Las t\u00E9cnicas de auditor\u00EDa asistida por computadora (TAAC'S)", "Ninguna"}));
			comboBox_8.setBounds(127, 22, 219, 20);
			panel_5Oficio.add(comboBox_8);
			}
		{
			JLabel lblCursosEspecializados = new JLabel("Cursos:");
			lblCursosEspecializados.setHorizontalAlignment(SwingConstants.TRAILING);
			lblCursosEspecializados.setBounds(10, 46, 107, 22);
			panel_5Oficio.add(lblCursosEspecializados);
			}
		{
			comboBox_9 = new JComboBox();
			comboBox_9.setBackground(new Color(248, 248, 255));
			comboBox_9.setModel(new DefaultComboBoxModel(new String[] {"<Selecciona>", "Conocer el mercado de valores DR",
					"Control de costos para las operaciones de alimentos y bebidas", "Red esencial de TI", 
					"La gesti\u00F3n eficaz de las redes sociales", "Pron\u00F3stico de Ventas", 
					"T\u00E9cnicas especializadas en la preparaci\u00F3n de la carne: Cortes, la cocina, "
					+ "la realizaci\u00F3n y presentaci\u00F3n"}));
			comboBox_9.setBounds(127, 47, 219, 20);
			panel_5Oficio.add(comboBox_9);
			}
		{
			JLabel lblTrabajo = new JLabel("\u00C1reas de trabajo:");
			lblTrabajo.setHorizontalAlignment(SwingConstants.TRAILING);
			lblTrabajo.setBounds(10, 72, 107, 22);
			panel_5Oficio.add(lblTrabajo);
			}
		{
			comboBox_10 = new JComboBox();
			comboBox_10.setBackground(new Color(248, 248, 255));
			comboBox_10.setModel(new DefaultComboBoxModel(new String[] {"<Selecciona>", "contador", "actor / Actriz", 
					"azafata", "arque\u00F3logo", "astronauta", "panadero", "bi\u00F3logo", "alba\u00F1il", 
					"conductor de autob\u00FAs", "hombre de negocios", "mujer de negocios", "carnicero", "vigilante", 
					"carpintero", "cajero", "limpiador", "payaso", "zapatero", "consultor", "cocinero", "consejero", 
					"cocinero", "qu\u00EDmico", "bailar\u00EDn", "decorador", "dentista", "dise\u00F1ador", "modista", 
					"basurero", "economista", "electricista", "agricultor", "bombero", "pescador", "florista", "frutero",
					"basurero", "jardinero", "peluquero", "ama de casa", "cazador", "Joyero", "juez", "abogado", 
					"bibliotecario", "salvavidas", "camionero", "cartero", "mec\u00E1nico", "meteor\u00F3logo", "minero",
					"modelo", "monje", "ni\u00F1era", "monja", "enfermera", "ni\u00F1era", "empleado de oficina", 
					"pintor","pastelero", "farmac\u00E9utico", "fot\u00F3grafo", "f\u00EDsico", "fontanero",
					"polic\u00EDa", "pol\u00EDtico", "portero", "cartero", "sacerdote", "profesor", "programador",
					"psiquiatra", "psic\u00F3logo", "recepcionista", "investigador", "marinero", "vendedor", 
					"cient\u00EDfico", "secretario", "secretario", "zapatero", "dependiente", "cantante",
					"asistente social", "cirujano", "taxista", "profesor", "operador telef\u00F3nico", "agente de viaje",
					"camionero", "veterinario", "camarero", "camarera", "limpiador de ventanas", "escritor"}));
			comboBox_10.setBounds(127, 73, 219, 20);
			panel_5Oficio.add(comboBox_10);
			}
																																																																																																																																																																																													
		panelUniversityStudy = new JPanel();
		panelUniversityStudy.setBackground(new Color(248, 248, 255));
		panelUniversityStudy.setBounds(450, 242, 357, 235);
		contentPanel.add(panelUniversityStudy);
		panelUniversityStudy.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), 
				"Estudios Universitarios:", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		panelUniversityStudy.setLayout(null);
			{
			JLabel lblPu = new JLabel("Grado:");
			lblPu.setHorizontalAlignment(SwingConstants.TRAILING);
			lblPu.setBounds(10, 56, 107, 14);
			panelUniversityStudy.add(lblPu);
			panelUniversityStudy.setVisible(true);
			}
																																																																																																																																																																																															
			comboBoxNivelAlcanzado = new JComboBox();							
			comboBoxNivelAlcanzado.setBackground(new Color(248, 248, 255));
			comboBoxNivelAlcanzado.setBounds(127, 23, 219, 20);
			panelUniversityStudy.add(comboBoxNivelAlcanzado);
			comboBoxNivelAlcanzado.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if ((comboBoxNivelAlcanzado.getSelectedItem()=="Grado")) {
					comboBoxGrado.setEnabled(true);
					comboBoxPostGrado.setEnabled(false);
					comboBoxDoctorado.setEnabled(false);
				} else if ((comboBoxNivelAlcanzado.getSelectedItem()=="PostGrado")) {
					comboBoxGrado.setEnabled(true);
					comboBoxPostGrado.setEnabled(true);
					comboBoxDoctorado.setEnabled(false);
					} else if ((comboBoxNivelAlcanzado.getSelectedItem()=="Doctorado")) {
						comboBoxGrado.setEnabled(true);
						comboBoxPostGrado.setEnabled(true);
						comboBoxDoctorado.setEnabled(true);
						}
				}
			
			});
			comboBoxNivelAlcanzado.setModel(new DefaultComboBoxModel(new String[] {"<Selecciona>", "Grado", "PostGrado", "Doctorado"}));
			
			JLabel lblPostgrade = new JLabel("Post-grado:");
			lblPostgrade.setHorizontalAlignment(SwingConstants.TRAILING);
			lblPostgrade.setBounds(10, 84, 107, 14);
			panelUniversityStudy.add(lblPostgrade);
						
			{
				JLabel lblCertified = new JLabel("Certificaciones:");
				lblCertified.setHorizontalAlignment(SwingConstants.TRAILING);
				lblCertified.setBounds(10, 114, 107, 14);
				panelUniversityStudy.add(lblCertified);
				}
			{
				comboBox_Certificaciones = new JComboBox();
				comboBox_Certificaciones.setBackground(new Color(248, 248, 255));
				comboBox_Certificaciones.setModel(new DefaultComboBoxModel(new String[] {"<Selecciona>", "Gestión de recursos humanos", "Topografía y Geomática ", "Creación y Ambiente ", "Análisis Estadístico Básico", "Artes Culinarias", "Auditoría financiera", "Biblioteca y Ciencias ", "Chocolate y Confitería", " Windows Server 2008", "La contabilidad financiera", "Dirección y gestión empresarial", "Diseño de modelos de negocio", "Optimización de recursos ", "Proyección de inversiones", "Gestión administrativa ", "Gestión de riesgos ", "Seguridad de la información", "Gestión estratégica de  empresas ", "Gestión Integrada de Proyectos ", "Gestión estratégica del C.H", "Impuestos Corporativos", "Inteligencia Empresarial", "Inglés intermedio", "Medición y mejoras de procesos", "Gestión  cadena de suministro", "Técnicas de auditoría "}));
				comboBox_Certificaciones.setBounds(127, 113, 219, 20);
				panelUniversityStudy.add(comboBox_Certificaciones);
				}
			{
				JLabel lblSpecializedCourses = new JLabel(
						"Especialidades:");
				lblSpecializedCourses
				.setHorizontalAlignment(SwingConstants.TRAILING);
				lblSpecializedCourses.setBounds(10, 142, 107, 22);
				panelUniversityStudy.add(lblSpecializedCourses);
				}
			{
				comboBoxEspecialidades = new JComboBox();
				comboBoxEspecialidades.setBackground(new Color(248, 248, 255));
				comboBoxEspecialidades.setModel(new DefaultComboBoxModel(new String[] {"<Selecciona>", "Mercado de valores R.D", "Control de Costos ", "Operaciones de alimentos y bebidas", "Red esencial de TI", "Gestión eficaz de redes sociales", "Pronóstico de Ventas", "Técnicas de preparación de la carne"}));
				comboBoxEspecialidades.setBounds(127, 143, 219, 20);
				panelUniversityStudy.add(comboBoxEspecialidades);
				}
			{
				JLabel lblTechnicalCollege = new JLabel("Estudios T\u00E9cnicos:");
				lblTechnicalCollege.setHorizontalAlignment(SwingConstants.TRAILING);
				lblTechnicalCollege.setBounds(10, 172, 107, 22);
				panelUniversityStudy.add(lblTechnicalCollege);
				}
			{
				comboBoxEstudiosTecnicos = new JComboBox();
				comboBoxEstudiosTecnicos.setBackground(new Color(248, 248, 255));
				comboBoxEstudiosTecnicos.setModel(new DefaultComboBoxModel(new String[] {"<Selecciona>", "Pequeñas y medianas empresas", "Publicidad", "Aspectos de mercado", "Diseño gráfico", " Sistemas de información", "Contabilidad computarizada", "Contabilidad financiera y fiscal"}));
				comboBoxEstudiosTecnicos.setBounds(127, 173, 219, 20);
				panelUniversityStudy.add(comboBoxEstudiosTecnicos);
				}
			{
				JLabel lblDoctorate = new JLabel("Doctorado:");
				lblDoctorate.setHorizontalAlignment(SwingConstants.TRAILING);
				lblDoctorate.setBounds(10, 202, 107, 22);
				panelUniversityStudy.add(lblDoctorate);
				}
			JLabel lblTitulo = new JLabel("Nivel Alcanzado:");
			lblTitulo.setHorizontalAlignment(SwingConstants.RIGHT);
			lblTitulo.setBounds(10, 26, 107, 14);
			panelUniversityStudy.add(lblTitulo);
			
			comboBoxGrado = new JComboBox();
			comboBoxGrado.setBounds(127, 53, 219, 20);
			panelUniversityStudy.add(comboBoxGrado);
			comboBoxGrado.setBackground(new Color(248, 248, 255));
			comboBoxGrado.setModel(new DefaultComboBoxModel(new String[] {"<Selecciona>", "Adm. Emp. M. Operaciones", "Adm. Emp. M. Finanzas", "Adm. Emp. M.Estrategia", "Adm. Emp. M.Gestión Humana", "Adm. Emp. M. Negocios ", "Adm. hotelera M.CB", "Adm. hotelera M.M.H ", "Arquitectura", "Comunicación Social ", "Derecho", "Diseño e interiorismo", "Ecología y Manejo Ambiental", "Economía", "Educación", "Enfermería", "Estomatología", "Filosofía", "Fisioterapia", "Gestión financiera y auditoría", "Ingeniería Civil", "Ingeniería E. M. Mecánica", "Ingeniería E.  M.Eléctrica", "Ingeniería Industrial", "Ingeniería de Sistemas", "Ingeniería Electrónica", "Ingeniería telemática", "Medicina", "Mercadeo", "Nutrición y Dietética", "Psicología"}));	
			{
				
				comboBoxPostGrado = new JComboBox();
				comboBoxPostGrado.setBounds(127, 81, 219, 20);
				panelUniversityStudy.add(comboBoxPostGrado);
				comboBoxPostGrado.setBackground(new Color(248, 248, 255));
				comboBoxPostGrado.setModel(new DefaultComboBoxModel(new String[] {"<Selecciona>", "M. en Recursos Humanos ", "M. en Gestión Estratégica", "MBA en Programas de Seguros", "M. en Regulación Económica", "M. en Derecho del Trabajo y SS", "MSC en Bienes Raíces", "M. Tec. de la Propiedad Intelectual ", "M. en Derecho de Negocios ", "M. en Relaciones Internacionales", "M.  en Políticas Públicas", "M. en Economía de la Empresa", "M. E. G de la Cadena de Suministro", "M. en Diseño Arquitectural ", "E.  Matemáticas Aplicadas", "E. Matemática Nivel Básico"}));
				}

			{
				comboBoxDoctorado = new JComboBox();
				comboBoxDoctorado.setBounds(127, 203, 219, 20);
				panelUniversityStudy.add(comboBoxDoctorado);
				comboBoxDoctorado.setBackground(new Color(248, 248, 255));
				comboBoxDoctorado.setModel(new DefaultComboBoxModel(new String[] {"<Selecciona>", "Derecho Constitucional ", " Derechos Fundamentales", "Sociedad Democrática", " Ciencias pedagógicas", "Ciencias Empresariales", "Cooperación Social", "Intervención Social", "Psicología de la Educación ", "Desarrollo Humano", "Economía", "Sociología", "Filosofía: Un Mundo Global"}));
				}
			
			panelTechnicalStudies = new JPanel();
			panelTechnicalStudies.setBackground(new Color(248, 248, 255));
			panelTechnicalStudies.setBounds(450,242,357,174);
			contentPanel.add(panelTechnicalStudies);
			panelTechnicalStudies.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), 
					"Estudios T\u00E9cnicos", TitledBorder.LEFT, TitledBorder.TOP, null, null));
			panelTechnicalStudies.setVisible(false);
			panelTechnicalStudies.setLayout(null);
			
			JLabel lblCertificados_1 = new JLabel("Certificados:");
			lblCertificados_1.setHorizontalAlignment(SwingConstants.TRAILING);
			lblCertificados_1.setBounds(10, 27, 107, 14);
			panelTechnicalStudies.add(lblCertificados_1);
			
			comboBox = new JComboBox();
			comboBox.setBackground(new Color(248, 248, 255));
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"<Selecciona>", "Gesti\u00F3n de recursos humanos", 
					"Topograf\u00EDa y geom\u00E1tica para desarrollo inmobiliario", 
					"El ambiente de los locales: Creaci\u00F3n y ambientes que componen estilos", 
					"An\u00E1lisis estad\u00EDstico b\u00E1sico", "Artes culinarias", "Auditor\u00EDa financiera", 
					"Biblioteca y ciencias de la informaci\u00F3n", "Chocolate y confiter\u00EDa", 
					"Configuraci\u00F3n e implantaci\u00F3n de Windows Server 2008", "La contabilidad financiera", 
					"Direcci\u00F3n y gesti\u00F3n empresarial", "Dise\u00F1o y desarrollo de modelos de negocio", 
					"Estrategia financiera: La optimizaci\u00F3n de los recursos y la proyecci\u00F3n de inversiones", 
					"Gesti\u00F3n administrativa para asistentes ejecutivos", 
					"La gesti\u00F3n de riesgos de seguridad de la informaci\u00F3n", 
					"La gesti\u00F3n estrat\u00E9gica de las empresas familiares",
					"Gesti\u00F3n Integrada de Proyectos (DIGIP) en el sector inmobiliario y "
					+ "de la construcci\u00F3n en la RD", "Gesti\u00F3n y direcci\u00F3n estrat\u00E9gica del capital humano",
					"Impuestos Corporativos: Nuevas tendencias y reglamentos tributarios", "Inteligencia Empresarial", 
					"Ingl\u00E9s intermedio", "Medici\u00F3n, redise\u00F1o y mejoras de procesos", 
					"Gesti\u00F3n de la cadena de suministro", 
					"Las t\u00E9cnicas de auditor\u00EDa asistida por computadora (TAAC'S)", "Ninguna"}));
			
			comboBox.setBounds(127, 24, 219, 20);
			panelTechnicalStudies.add(comboBox);
			
			JLabel lblCursosEspecializados_1 = new JLabel("Especialidades:");
			lblCursosEspecializados_1.setHorizontalAlignment(SwingConstants.TRAILING);
			lblCursosEspecializados_1.setBounds(10, 48, 107, 22);
			panelTechnicalStudies.add(lblCursosEspecializados_1);
			
			comboBox_5_1 = new JComboBox();
			comboBox_5_1.setBackground(new Color(248, 248, 255));
			comboBox_5_1.setModel(new DefaultComboBoxModel(new String[] {"<Selecciona>", "Conocer el mercado de valores DR",
					"El control de costos para las operaciones de alimentos y bebidas", "Red esencial de TI",
					"La gesti\u00F3n eficaz de las redes sociales", "Pron\u00F3stico de Ventas",
					"Las t\u00E9cnicas especializadas en la preparaci\u00F3n de la carne: Cortes, la cocina, "
					+ "la realizaci\u00F3n y presentaci\u00F3n'S)"}));
			comboBox_5_1.setBounds(127, 49, 219, 20);
			panelTechnicalStudies.add(comboBox_5_1);
			
			JLabel lblCarreraTcnica = new JLabel("Estudios t\u00E9cnicos:");
			lblCarreraTcnica.setHorizontalAlignment(SwingConstants.TRAILING);
			lblCarreraTcnica.setBounds(10, 73, 107, 22);
			panelTechnicalStudies.add(lblCarreraTcnica);
			
			comboBox_6_1 = new JComboBox();
			comboBox_6_1.setBackground(new Color(248, 248, 255));
			comboBox_6_1.setModel(new DefaultComboBoxModel(new String[] {"<Selecciona>", "Peque\u00F1as y medianas empresas",
					"Publicidad", "Aspectos de mercado", "Dise\u00F1o gr\u00E1fico",
					"Programaci\u00F3n de sistemas de informaci\u00F3n", "Contabilidad computarizada", 
					"Contabilidad financiera y fiscal"}));
			comboBox_6_1.setBounds(127, 74, 219, 20);
			panelTechnicalStudies.add(comboBox_6_1);
			
			JLabel lblreasDeTrabajo = new JLabel("\u00C1reas de Trabajo:");
			lblreasDeTrabajo.setHorizontalAlignment(SwingConstants.TRAILING);
			lblreasDeTrabajo.setBounds(10, 98, 107, 22);
			panelTechnicalStudies.add(lblreasDeTrabajo);
			
			comboBox_7_1 = new JComboBox();
			comboBox_7_1.setBackground(new Color(248, 248, 255));
			comboBox_7_1.setModel(new DefaultComboBoxModel(new String[] {"<Selecciona>", "contador", "actor / Actriz",
					"azafata", "arque\u00F3logo", "astronauta", "panadero", "bi\u00F3logo", "alba\u00F1il",
					"conductor de autob\u00FAs", "hombre de negocios", "mujer de negocios", "carnicero", "vigilante", 
					"carpintero", "cajero", "limpiador", "payaso", "zapatero", "consultor", "cocinero", "consejero", 
					"cocinero", "qu\u00EDmico", "bailar\u00EDn", "decorador", "dentista", "dise\u00F1ador", "modista",
					"basurero", "economista", "electricista", "agricultor", "bombero", "pescador", "florista", "frutero",
					"basurero", "jardinero", "peluquero", "ama de casa", "cazador", "Joyero", "juez", "abogado", 
					"bibliotecario", "salvavidas", "camionero", "cartero", "mec\u00E1nico", "meteor\u00F3logo", "minero",
					"modelo", "monje", "ni\u00F1era", "monja", "enfermera", "ni\u00F1era", "empleado de oficina", "pintor",
					"pastelero", "farmac\u00E9utico", "fot\u00F3grafo", "f\u00EDsico", "fontanero", "polic\u00EDa",
					"pol\u00EDtico", "portero", "cartero", "sacerdote", "profesor", "programador", "psiquiatra",
					"psic\u00F3logo", "recepcionista", "investigador", "marinero", "vendedor", "cient\u00EDfico", 
					"secretario", "secretario", "zapatero", "dependiente", "cantante", "asistente social", "cirujano",
					"taxista", "profesor", "operador telef\u00F3nico", "agente de viaje", "camionero", "veterinario",
					"camarero", "camarera", "limpiador de ventanas", "escritor"}));
			comboBox_7_1.setBounds(127, 99, 219, 20);
			panelTechnicalStudies.add(comboBox_7_1);
			
			JLabel lblId = new JLabel("ID:");
			lblId.setBounds(530, 201, 19, 14);
			lblId.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblId.setHorizontalAlignment(SwingConstants.TRAILING);
			lblId.setVerticalAlignment(SwingConstants.BOTTOM);
			contentPanel.add(lblId);
			
		{

			JPanel DatosPersonales = new JPanel();
			DatosPersonales.setBackground(new Color(248, 248, 255));
			DatosPersonales.setBounds(22, 31, 416, 200);
			DatosPersonales.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "    Datos Personales:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			contentPanel.add(DatosPersonales);
			DatosPersonales.setLayout(null);
			{
				txtSuperlargoArchipielago = new JTextField();
				txtSuperlargoArchipielago.setBounds(150, 24, 223, 20);
				DatosPersonales.add(txtSuperlargoArchipielago);
				txtSuperlargoArchipielago.setColumns(10);
			}
			{
				textField_2 = new JTextField();
				textField_2.setBounds(150, 48, 223, 20);
				DatosPersonales.add(textField_2);
				textField_2.setColumns(10);
			}
			{
				JLabel lblBornDate = new JLabel("Fecha de Nacimiento:");
				lblBornDate.setBounds(0, 71, 140, 20);
				DatosPersonales.add(lblBornDate);
				lblBornDate.setHorizontalAlignment(SwingConstants.TRAILING);
			}
			{
				comboBox_1_1 = new JComboBox();
				comboBox_1_1.setEditable(true);
				comboBox_1_1.setBackground(new Color(248, 248, 255));
				comboBox_1_1.setBounds(150, 95, 223, 20);
				DatosPersonales.add(comboBox_1_1);
				comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"<Selecciona>", "Afgano", "Alemán", "Americano", "Argentino", "Australiano", "Austriaco", "Belga", "Boliviano", "Brasileño", "Británico", "Canadiense", "Chileno", "Chino", "Colombiano", "Costarricense", "Cubano", "Checo", "Danés", "Dominicano", "Holandés", "Ecuatoriano", "Egipcio", "Español", "Inglés", "Filipino", "Francés", "Griego", "Guatemalteco", "Haitiano", "Hawaiano", "Hondureño", "Iraní", "Iraquí", "Irlandés", "Israelí", "Italiano", "Jamaiquino", "Japonés", "Mexicano", "Marroquí", "Nicaragüense", "Panameño", "Paraguayo", "Peruano", "Polaco", "Portugués", "Puertorriqueño", "Rumano", "Ruso", "Saudita", "Sueco", "Suizo", "Sirio", "Tailandés", "Turco", "Ucranio", "Uruguayo", "Venezolano"}));
			}
			{
				JLabel lblNacionality = new JLabel("Nacionalidad:");
				lblNacionality.setBounds(10, 95, 130, 20);
				DatosPersonales.add(lblNacionality);
				lblNacionality.setHorizontalAlignment(SwingConstants.TRAILING);
			}
			{
				comboBoxSexo = new JComboBox();
				comboBoxSexo.setBackground(new Color(248, 248, 255));
				comboBoxSexo.setBounds(150, 119, 223, 20);
				DatosPersonales.add(comboBoxSexo);
				 final JLabel labelMalePicture = new JLabel("");
				//labelMalePicture.setVisible(false);
				final JLabel labelFeMalePicture = new JLabel("");
				 labelMalePicture.setIcon(new ImageIcon(PersonRegister.class.getResource("/InterfazGrafica"
				 		+ "/Images/malePicture.jpg")));
				 labelMalePicture.setVerticalTextPosition(SwingConstants.BOTTOM);
				 labelMalePicture.setIgnoreRepaint(true);
				 labelMalePicture.setIconTextGap(8);
				 labelMalePicture.setHorizontalAlignment(SwingConstants.CENTER);
				 labelMalePicture.setForeground(Color.BLACK);
				 labelMalePicture.setBackground(Color.WHITE);
				 labelMalePicture.setBounds(561, 42, 140, 139);
				 contentPanel.add(labelMalePicture);
				 {
				 JLabel labelFemalePicture = new JLabel("");
				 //labelFemalePicture.setVisible(false);
				 labelFemalePicture.setIcon(new ImageIcon(PersonRegister.class.getResource("/InterfazGrafica/Images"
				 		+ "/femalePicture.jpg")));
				 labelFemalePicture.setVerticalTextPosition(SwingConstants.BOTTOM);
				 labelFemalePicture.setIgnoreRepaint(true);
				 labelFemalePicture.setIconTextGap(8);
				 labelFemalePicture.setHorizontalAlignment(SwingConstants.CENTER);
				 labelFemalePicture.setForeground(Color.BLACK);
				 labelFemalePicture.setBackground(Color.WHITE);
				 labelFemalePicture.setBounds(561, 42, 140, 139);
				 contentPanel.add(labelFemalePicture);
				 }
				
				 comboBoxSexo.addItemListener(new ItemListener() {
				 public void itemStateChanged(ItemEvent e) {
				 if (comboBoxSexo.getSelectedItem()== "Femenino")
				 {
				 labelFeMalePicture.setVisible(true);
				 labelMalePicture.setVisible(false);
				 }
				 else if (comboBoxSexo.getSelectedItem()== "Masculino")
				 {
				 labelFeMalePicture.setVisible(false);
				 labelMalePicture.setVisible(true);
				 }
				
				
				 }
				 });
				 comboBoxSexo.setModel(new DefaultComboBoxModel(new String[] {"<Selecciona>", "Femenino", "Masculino"}));
				 
				  
			}
			{
				JLabel lblSex = new JLabel("Sexo:");
				lblSex.setBounds(10, 119, 130, 20);
				DatosPersonales.add(lblSex);
				lblSex.setHorizontalAlignment(SwingConstants.TRAILING);
			}
			{
				JLabel lblCivilState = new JLabel("Estado Civil:");
				lblCivilState.setBounds(10, 143, 130, 20);
				DatosPersonales.add(lblCivilState);
				lblCivilState.setHorizontalAlignment(SwingConstants.TRAILING);
			}
			{
				comboBox_1_3 = new JComboBox();
				comboBox_1_3.setBackground(new Color(248, 248, 255));
				comboBox_1_3.setBounds(150, 143, 223, 20);
				DatosPersonales.add(comboBox_1_3);
				comboBox_1_3.setModel(new DefaultComboBoxModel(new String[] {"<Selecciona>", "Soltero", "Casado",
						"Dirvorciado", "Viudo", "Comprometido", "Otro"}));
			}

			comboBox_1 = new JComboBox();
			comboBox_1.setBackground(new Color(248, 248, 255));
			comboBox_1.setBounds(150, 167, 223, 20);
			DatosPersonales.add(comboBox_1);
			comboBox_1.addItemListener(new ItemListener() {
				@Override
				public void itemStateChanged(ItemEvent arg0) {
					
					if ((comboBox_1.getSelectedItem() == "<Select>")) {
						panel_5Oficio.setVisible(false);
						panelUniversityStudy.setVisible(true);
						panelTechnicalStudies.setVisible(false);
					}
					
					if (comboBox_1.getSelectedItem() == "Técnico") {
						panelUniversityStudy.setVisible(false);
						panelTechnicalStudies.setVisible(true);
						panel_5Oficio.setVisible(false);
					}

					if (comboBox_1.getSelectedItem() == "Universitario") {
						panelTechnicalStudies.setVisible(false);
						panelUniversityStudy.setVisible(true);
						panel_5Oficio.setVisible(false);
					}
					if (comboBox_1.getSelectedItem() == "Oficio") {
						panelUniversityStudy.setVisible(false);
						panelTechnicalStudies.setVisible(false);
						panel_5Oficio.setVisible(true);
					}
					
				}
			});
			comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"<Selecciona>", "Universitario", "T\u00E9cnico", 
					"Oficio"}));

			JLabel lblSyudyLevel = new JLabel("Nivel de Estudio:");
			lblSyudyLevel.setBounds(10, 170, 130, 14);
			DatosPersonales.add(lblSyudyLevel);
			lblSyudyLevel.setHorizontalAlignment(SwingConstants.TRAILING);
			{
				JLabel lblName = new JLabel("Nombres:");
				lblName.setBounds(10, 27, 130, 14);
				DatosPersonales.add(lblName);
				lblName.setHorizontalAlignment(SwingConstants.TRAILING);
				lblName.setVerticalAlignment(SwingConstants.BOTTOM);
			}
			{
				JLabel lblLastName = new JLabel("Apellidos:");
				lblLastName.setBounds(10, 51, 130, 14);
				DatosPersonales.add(lblLastName);
				lblLastName.setHorizontalAlignment(SwingConstants.TRAILING);
				lblLastName.setVerticalAlignment(SwingConstants.BOTTOM);
			}
			
			JLabel label = new JLabel("*");
			label.setForeground(Color.RED);
			label.setBounds(10, 0, 36, 14);
			DatosPersonales.add(label);
			
			dateChooser = new JDateChooser();
			dateChooser.setBounds(150, 71, 223, 20);
			DatosPersonales.add(dateChooser);
			{
				JPanel panel_2Contacto = new JPanel();
				panel_2Contacto.setBackground(new Color(248, 248, 255));
				panel_2Contacto.setBounds(22, 242, 416, 174);
				panel_2Contacto.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Contacto:",
						TitledBorder.LEADING, TitledBorder.TOP, null, null));
				contentPanel.add(panel_2Contacto);
				panel_2Contacto.setLayout(null);
				{
					JLabel lblEmail = new JLabel("E-mail:");
					lblEmail.setBounds(20, 26, 120, 14);
					panel_2Contacto.add(lblEmail);
					lblEmail.setVerticalAlignment(SwingConstants.BOTTOM);
					lblEmail.setHorizontalAlignment(SwingConstants.TRAILING);
				}
				{
					JLabel lblCellphone = new JLabel("M\u00F3vil:");
					lblCellphone.setBounds(20, 60, 120, 14);
					panel_2Contacto.add(lblCellphone);
					lblCellphone.setVerticalAlignment(SwingConstants.BOTTOM);
					lblCellphone
							.setHorizontalAlignment(SwingConstants.TRAILING);
				}
				{
					JLabel lblTelephone = new JLabel("Tel\u00E9fono:");
					lblTelephone.setBounds(2, 91, 138, 14);
					panel_2Contacto.add(lblTelephone);
					lblTelephone.setVerticalAlignment(SwingConstants.BOTTOM);
					lblTelephone
							.setHorizontalAlignment(SwingConstants.TRAILING);
				}
				
				JLabel AstMovil = new JLabel("*");
				AstMovil.setHorizontalAlignment(SwingConstants.LEFT);
				AstMovil.setForeground(Color.RED);
				AstMovil.setBounds(-29, 60, 87, 14);
				panel_2Contacto.add(AstMovil);
				{
					textField_3 = new JTextField();
					textField_3.setBounds(150, 23, 223, 20);
					panel_2Contacto.add(textField_3);
					textField_3.setColumns(10);
				}
				
				JLabel lblCdigoPostal = new JLabel("C\u00F3digo Postal:");
				lblCdigoPostal.setHorizontalAlignment(SwingConstants.RIGHT);
				lblCdigoPostal.setBounds(20, 119, 120, 14);
				panel_2Contacto.add(lblCdigoPostal);
				
				JLabel AstName = new JLabel("*");
				AstName.setBounds(78, 26, 26, 14);
				panel_2Contacto.add(AstName);
				AstName.setForeground(Color.RED);
				AstName.setHorizontalAlignment(SwingConstants.CENTER);
				
				JLabel AstLastName = new JLabel("*");
				AstLastName.setBounds(75, 60, 29, 14);
				panel_2Contacto.add(AstLastName);
				AstLastName.setHorizontalAlignment(SwingConstants.CENTER);
				AstLastName.setForeground(Color.RED);
				{
					MaskFormatter mascara;
					try {
						mascara = new MaskFormatter("###########");
						formattedTextFieldID = new JFormattedTextField(mascara);
						formattedTextFieldID.setBounds(559, 195, 144, 20);
						contentPanel.add(formattedTextFieldID);
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						}
					MaskFormatter mascara1;
					try {
						mascara1 = new MaskFormatter("###-###-####");
						formattedTextFieldMob = new JFormattedTextField(mascara1);
						formattedTextFieldMob.setBounds(150, 57, 223, 20);
						panel_2Contacto.add(formattedTextFieldMob);
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
				{
					MaskFormatter mascara2;
					try {
						mascara2 = new MaskFormatter("###-###-####");
						formattedTextFieldPhone = new JFormattedTextField(mascara2);
						formattedTextFieldPhone.setBounds(150, 88, 223, 20);
						panel_2Contacto.add(formattedTextFieldPhone);
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
				{
					MaskFormatter mascara3;
					try {
						mascara3 = new MaskFormatter("#####");
						formattedTextFieldPostal = new JFormattedTextField(mascara3);
						formattedTextFieldPostal.setBounds(150, 116, 223, 20);
						panel_2Contacto.add(formattedTextFieldPostal);
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			}
															

			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(248, 248, 255));
			buttonPane.setBounds(0, 652, 830, 55);
			contentPanel.add(buttonPane);
			buttonPane.setLayout(new FlowLayout(FlowLayout.CENTER));
			{
				JButton okButton = new JButton("Guardar");
				 okButton.setIcon(new ImageIcon(PersonRegister.class.getResource("/InterfazGrafica/Images/Save.png")));
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						if(comboBox_1.getSelectedItem() == "<Selecciona>"){
							error.setText("Seleccione un nivel de estudio");
						}
						else if (comboBox_1.getSelectedItem() == "Universitario") {
							Academic temp = new Academic();
							
								if((compa(txtSuperlargoArchipielago.getText())==true)&&(compa(textField_2.getText())==true)&&
								(compa(formattedTextFieldMob.getText())==true)&&(compa(textField_3.getText())==true)&&
								(comboBoxSexo.getSelectedItem().toString()!="<Selecciona>")&&(dateChooser.getDate()!=null)&&
								(comboBox_1_1.getSelectedItem().toString()!="<Selecciona>")&&
								(comboBox_1_3.getSelectedItem().toString()!="<Selecciona>")&&
								(comboBox_1_4.getSelectedItem().toString()!="<Selecciona>")&&
								(compa(formattedTextFieldID.getText())==true)&&
								(compDate(Integer.toString((dateChooser.getCalendar().get(Calendar.YEAR))))==true)){
										temp.setName(txtSuperlargoArchipielago.getText());
										temp.setLastName(textField_2.getText());
										temp.setID(formattedTextFieldID.getText());
										temp.setPhone(formattedTextFieldPhone.getText());
										temp.setMobile(formattedTextFieldMob.getText());
										temp.setEmail(textField_3.getText());
										temp.setSex(comboBoxSexo.getSelectedItem().toString());	
										String month= Integer.toString(dateChooser.getCalendar().get(Calendar.MONTH)+1);
										String day = Integer.toString(dateChooser.getCalendar().get(Calendar.DAY_OF_MONTH));
										String year = Integer.toString(dateChooser.getCalendar().get(Calendar.YEAR));
										String date1 = (day + "-" + month + "-" + year);
										temp.setBirth(date1);
										temp.setNationality(comboBox_1_1.getSelectedItem().toString());
										temp.setCivilState(comboBox_1_3.getSelectedItem().toString());
										temp.setAcademicLevel(comboBox_1.getSelectedItem().toString());
										temp.setCity(textField_9.getText());
										temp.getAddress().setRegion(textField_11.getText());
										temp.setSector(textField_10.getText());
										temp.setCalle(textField_8.getText());
										temp.setHouseNumber(textField_7.getText());
										temp.setPostalCode(formattedTextFieldPostal.getText());
										temp.setGradeTitle(comboBoxGrado.getSelectedItem().toString());
										temp.getAddress().setRegion(textField_7.getText());
										temp.setGradeLevel(comboBoxNivelAlcanzado.getSelectedItem().toString());
										temp.setPostGradeTitles(comboBoxPostGrado.getSelectedItem().toString());
										temp.setCertTitles(comboBox_Certificaciones.getSelectedItem().toString());
										temp.setEspTitles(comboBoxEspecialidades.getSelectedItem().toString());
										temp.setTechnicalTitles(comboBoxEstudiosTecnicos.getSelectedItem().toString());
										temp.setDoctorateTitles(comboBoxDoctorado.getSelectedItem().toString());
										temp.setCountry(comboBox_1_4.getSelectedItem().toString());
										

										CollectionPerson.getInstanceCollectionPerson().setPersons(temp);
										error.setText("Su registro fue realizado correctamente");
										reiniciar ();
								}
								else{
										error.setText("Todos los campos con asteriscos son obligatorios");	
										}															
										}
						
						else if (comboBox_1.getSelectedItem() == "Técnico") {
							Technical temp = new Technical();
							dateChooser.getCalendar();
							if((compa(txtSuperlargoArchipielago.getText())==true)&&(compa(textField_2.getText())==true)&&(compa(formattedTextFieldMob.getText())==true)
									&&(compa(textField_3.getText())==true)&&
									(comboBoxSexo.getSelectedItem().toString()!="<Selecciona>")&&(dateChooser.getDate()!=null)
									&&(comboBox_1_1.getSelectedItem().toString()!="<Selecciona>")&&
									(comboBox_1_3.getSelectedItem().toString()!="<Selecciona>")&&
									(comboBox_1_4.getSelectedItem().toString()!="<Selecciona>")&&
									(compa(formattedTextFieldID.getText())==true)&&
									(compDate(Integer.toString((dateChooser.getCalendar().get(Calendar.YEAR))))==true)){
							temp.setName(txtSuperlargoArchipielago.getText());
							temp.setLastName(textField_2.getText());
							temp.setID(formattedTextFieldID.getText());
							temp.setPhone(formattedTextFieldPhone.getText());
							temp.setMobile(formattedTextFieldMob.getText());
							temp.setEmail(textField_3.getText());
							temp.setSex(comboBoxSexo.getSelectedItem().toString());
							String month= Integer.toString(dateChooser.getCalendar().get(Calendar.MONTH)+1);
							String day = Integer.toString(dateChooser.getCalendar().get(Calendar.DAY_OF_MONTH));
							String year = Integer.toString(dateChooser.getCalendar().get(Calendar.YEAR));
							String date1 = (day + "-" + month + "-" + year);
							temp.setBirth(date1);
							temp.setNationality(comboBox_1_1.getSelectedItem().toString());
							temp.setCivilState(comboBox_1_3.getSelectedItem().toString());
							temp.setAcademicLevel(comboBox_1.getSelectedItem().toString());
							temp.setCity(textField_9.getText());
							temp.getAddress().setRegion(textField_11.getText());
							temp.setSector(textField_10.getText());
							temp.setCalle(textField_8.getText());
							temp.setHouseNumber(textField_7.getText());
							temp.setPostalCode(formattedTextFieldPostal.getText());
							temp.getAddress().setRegion(textField_7.getText());
							temp.setCertTitles(comboBox.getSelectedItem().toString());
							temp.setEspTitle(comboBox_5_1.getSelectedItem().toString());
							temp.setTechTitles(comboBox_6_1.getSelectedItem().toString());
							temp.setWorks(comboBox_7_1.getSelectedItem().toString());
							temp.setCountry(comboBox_1_4.getSelectedItem().toString());
							

							CollectionPerson.getInstanceCollectionPerson().setPersons(temp);
							error.setText("Su registro fue realizado correctamente");
							reiniciar ();
							}
							else{
								error.setText("Todos los campos con asteriscos son obligatorios");	
								}								

								}

			else if (comboBox_1.getSelectedItem() == "Oficio") {
				DreamerNini temp = new DreamerNini();
				System.out.println(compDate("12"));
				if((compa(txtSuperlargoArchipielago.getText())==true)&&(compa(textField_2.getText())==true)&&(compa(formattedTextFieldMob.getText())==true)
						&&(compa(textField_3.getText())==true)&&
						(comboBoxSexo.getSelectedItem().toString()!="<Selecciona>")&&(dateChooser.getDate()!=null)
						&&(comboBox_1_1.getSelectedItem().toString()!="<Selecciona>")&&
						(comboBox_1_3.getSelectedItem().toString()!="<Selecciona>")&&
						(comboBox_1_4.getSelectedItem().toString()!="<Selecciona>")&&
						(compa(formattedTextFieldID.getText())==true)&&
						(compDate(Integer.toString((dateChooser.getCalendar().get(Calendar.YEAR))))==true)){
							temp.setName(txtSuperlargoArchipielago.getText());
							temp.setLastName(textField_2.getText());
							temp.setID(formattedTextFieldID.getText());
							temp.setPhone(formattedTextFieldPhone.getText());
							temp.setMobile(formattedTextFieldMob.getText());
							temp.setEmail(textField_3.getText());
							temp.setSex(comboBoxSexo.getSelectedItem().toString());
							String month= Integer.toString(dateChooser.getCalendar().get(Calendar.MONTH)+1);
							String day = Integer.toString(dateChooser.getCalendar().get(Calendar.DAY_OF_MONTH));
							String year = Integer.toString(dateChooser.getCalendar().get(Calendar.YEAR));
							String date1 = (day + "-" + month + "-" + year);
							temp.setBirth(date1);
							temp.setNationality(comboBox_1_1.getSelectedItem().toString());
							temp.setCivilState(comboBox_1_3.getSelectedItem().toString());
							temp.setAcademicLevel(comboBox_1.getSelectedItem().toString());
							temp.setCity(textField_9.getText());
							temp.getAddress().setRegion(textField_11.getText());
							temp.setSector(textField_10.getText());
							temp.setCalle(textField_8.getText());
							temp.setHouseNumber(textField_7.getText());
							temp.setPostalCode(formattedTextFieldPostal.getText());
							temp.getAddress().setRegion(textField_7.getText());
							temp.setCertTitles(comboBox_8.getSelectedItem().toString());
							temp.setCourseTitles(comboBox_9.getSelectedItem().toString());
							temp.setWorks(comboBox_10.getSelectedItem().toString());
								
								CollectionPerson.getInstanceCollectionPerson().setPersons(temp);
								error.setText("Su registro fue realizado correctamente");
								reiniciar ();
							
			}
				else{
					error.setText("Todos los campos con asteriscos son obligatorios");	
				}	
			}			

						
					}
				});

			
				
				JButton btnReiniciar = new JButton("Reiniciar");
				btnReiniciar.setIcon(new ImageIcon(PersonRegister.class.getResource("/InterfazGrafica/Images/Back.png")));
				btnReiniciar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						reiniciar ();

					}
		
					
				});
				buttonPane.add(btnReiniciar);
				
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);

			{
				JButton cancelButton = new JButton("Cancelar");
				cancelButton.setIcon(new ImageIcon(PersonRegister.class.getResource("/InterfazGrafica/Images/Delete32.png")));
				cancelButton.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent arg0) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
				
				JLabel labelAstID = new JLabel("   *");
				labelAstID.setHorizontalAlignment(SwingConstants.RIGHT);
				labelAstID.setForeground(Color.RED);
				labelAstID.setBounds(508, 198, 19, 14);
				contentPanel.add(labelAstID);
				
				JLayeredPane layeredPane = new JLayeredPane();
				layeredPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
				layeredPane.setBounds(561, 42, 140, 139);
				contentPanel.add(layeredPane);
				{
					JPanel panel_3Address = new JPanel();
					panel_3Address.setBounds(22, 427, 418, 200);
					contentPanel.add(panel_3Address);
					panel_3Address.setBackground(new Color(248, 248, 255));
					panel_3Address.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Direcci\u00F3n:",
							TitledBorder.LEFT, TitledBorder.TOP, null, null));
					panel_3Address.setLayout(null);
					{
						JLabel lblCalle = new JLabel("Calle:");
						lblCalle.setLabelFor(this);
						lblCalle.setDisplayedMnemonic('*');
						lblCalle.setDisplayedMnemonic(KeyEvent.VK_ASTERISK);
						lblCalle.setBounds(30, 25, 108, 14);
						
						panel_3Address.add(lblCalle);
						lblCalle.setVerticalAlignment(SwingConstants.BOTTOM);
						lblCalle.setHorizontalAlignment(SwingConstants.TRAILING);
						}
					{
						textField_8 = new JTextField();
						textField_8.setBounds(148, 22, 223, 20);
						panel_3Address.add(textField_8);
						textField_8.setColumns(10);
						}
					{
						JLabel lblNmero = new JLabel("Casa No:");
						lblNmero.setBounds(30, 53, 108, 14);
						panel_3Address.add(lblNmero);
						lblNmero.setVerticalAlignment(SwingConstants.BOTTOM);
						lblNmero.setHorizontalAlignment(SwingConstants.TRAILING);
						}
					{
						textField_7 = new JTextField();
						textField_7.setBounds(148, 50, 223, 20);
						panel_3Address.add(textField_7);
						textField_7.setColumns(10);
						}
					{
						JLabel lblCountry = new JLabel("Pa\u00EDs:");
						lblCountry.setBounds(30, 80, 108, 14);
						panel_3Address.add(lblCountry);
						lblCountry.setVerticalAlignment(SwingConstants.BOTTOM);
						lblCountry.setHorizontalAlignment(SwingConstants.TRAILING);
						}
					{
						JLabel lblSector = new JLabel("Sector:");
						lblSector.setBounds(30, 109, 108, 14);
						panel_3Address.add(lblSector);
						lblSector.setVerticalAlignment(SwingConstants.BOTTOM);
						lblSector.setHorizontalAlignment(SwingConstants.TRAILING);
						}
					{
						textField_10 = new JTextField();
						textField_10.setBounds(148, 106, 223, 20);
						panel_3Address.add(textField_10);
						textField_10.setColumns(10);
						}
					{
						JLabel lblCity = new JLabel("Ciudad:");
						lblCity.setBounds(30, 137, 108, 14);
						panel_3Address.add(lblCity);
						lblCity.setVerticalAlignment(SwingConstants.BOTTOM);
						lblCity.setHorizontalAlignment(SwingConstants.TRAILING);
						}
					{
						textField_9 = new JTextField();
						textField_9.setBounds(148, 134, 223, 20);
						panel_3Address.add(textField_9);
						textField_9.setColumns(10);
						}
					{
						JLabel lblRegion = new JLabel("Regi\u00F3n:");
						lblRegion.setBounds(30, 165, 108, 14);
						panel_3Address.add(lblRegion);
						lblRegion.setVerticalAlignment(SwingConstants.BOTTOM);
						lblRegion.setHorizontalAlignment(SwingConstants.TRAILING);
						}
					{
						textField_11 = new JTextField();
						textField_11.setBounds(148, 162, 223, 20);
						panel_3Address.add(textField_11);
						textField_11.setColumns(10);
						}
					{
						comboBox_1_4 = new JComboBox();
						comboBox_1_4.setBackground(new Color(248, 248, 255));
						comboBox_1_4.setBounds(148, 78, 223, 20);
						panel_3Address.add(comboBox_1_4);
						comboBox_1_4.setModel(new DefaultComboBoxModel(new String[] {"<Selecciona>", "Afganistán", "Albania", "Alemania", "Arabia Saudita", "Argelia", "Andorra", "Angola", "Anguila", "Antártida", "Antigua y Barbuda", "Argentina", "Armenia", "Aruba", "Australia", "Austria", "Azerbaiyán", "Bahamas", "Bahrein", "Barbados", "Bielorrusia", "Bélgica", "Belice", "Benin", "Bermuda", "Bután", "Bolivia", "Bosnia y Herzegovina", "Botswana", "Brasil", "Brunei Darussalam", "Bulgaria", "Burkina Faso", "Burundi", "Camboya", "Camerún", "Canadá", "Cabo Verde", "Chad", "Chile", "China", "Colombia", "Comoras", "Costa Rica", "Croacia", "Cuba", "Dinamarca", "Dominica", "Ecuador", "Egipto", "El Salvador", "Eritrea", "España", "Estados Unidos", "Estonia", "Etiopía", "Fiji", "Finlandia", "Francia", "Gabón", "Gambia", "Georgia", "Ghana", "Gibraltar", "Gran Bretaña", "Grecia", "Groenlandia", "Granada", "Guadalupe", "Guam", "Guatemala", "Guinea", "Guinea Ecuatorial", "Guayana", "Haití", "Honduras", "Hong Kong", "Hungría", "Islandia", "India", "Indonesia", "Irán (República Islámica del)", "Irak", "Irlanda", "Israel", "Italia", "Jamaica", "Japón", "Jordania", "Kazajstán", "Kenia", "Kosovo", "Kuwait", "Kirguistán", "Letonia", "Líbano", "Lesoto", "Liberia", "Libia", "Liechtenstein", "Lituania", "Luxemburgo", "Macao", "Macedonia", "Madagascar", "Malawi", "Malasia", "Maldivas", "Malí", "Malta", "Martinica", "Mauritania", "Mauricio", "Mayotte", "México", "Micronesia", "Moldova", "Mónaco", "Mongolia", "Montenegro", "Montserrat", "Marruecos", "Mozambique", "Myanmar, Birmania", "Namibia", "Nauru", "Nepal", "Nicaragua", "Níger", "Nigeria", "Niue", "Noruega", "Omán", "Países Bajos", "Pakistán", "Panamá", "Paraguay", "Perú", "Pitcairn Island", "Polonia", "Portugal", "Puerto Rico", "Reino Unido", "República Dominicana", "Ruanda", "Rumania", "San Cristóbal y Nieves", "Santa Lucía", "San Vicente y las Granadinas", "Samoa", "San Marino", "Santo Tomé y Príncipe", "Senegal", "Serbia", "Seychelles", "Sierra Leona", "Singapur", "Somalia", "Sudáfrica", "Sudán del Sur", "Sri Lanka", "Sudán", "Suriname", "Swazilandia", "Suecia", "Suiza", "Siria", "Taiwán (República de China)", "Trinidad y Tobago", "Uruguay", "Venezuela", "Vietnam"}));
						}
					
					JLabel AstBirth = new JLabel("*");
					AstBirth.setBounds(87, 74, 26, 27);
					panel_3Address.add(AstBirth);
					AstBirth.setHorizontalAlignment(SwingConstants.CENTER);
					AstBirth.setForeground(Color.RED);
					}
				{
					error = new JLabel("");
					error.setHorizontalAlignment(SwingConstants.CENTER);
					error.setForeground(Color.RED);
					error.setBounds(442, 543, 378, 26);
					contentPanel.add(error);
					}
				
				
			
			}
}
}
		
		error1 = new JLabel("");
		error1.setForeground(Color.RED);
		error1.setBounds(442, 101, 114, 27);
		contentPanel.add(error1);
	}
	public boolean compa(String a){
		boolean b= true;
		String txt= a.replaceAll(" ", "");
		if(txt.length()==0){
			b=false;
		error.setText("Los campos marcados con asteriscos son obligatorios");	
		}
		return b;
		
	}
	public void reiniciar(){
		if (comboBox_1.getSelectedItem() == "Universitario" || comboBox_1.getSelectedItem() == "<Selecciona>") {
			comboBoxGrado.setSelectedItem("<Selecciona>");
			comboBoxNivelAlcanzado.setSelectedItem("<Selecciona>");
			comboBoxPostGrado.setSelectedItem("<Selecciona>");
			comboBox_Certificaciones.setSelectedItem("<Selecciona>");
			comboBoxEspecialidades.setSelectedItem("<Selecciona>");
			comboBoxEstudiosTecnicos.setSelectedItem("<Selecciona>");
			comboBoxDoctorado.setSelectedItem("<Selecciona>");
			txtSuperlargoArchipielago.setText("");
			textField_2.setText("");
			formattedTextFieldPostal.setText("");
			formattedTextFieldMob.setText("");
			formattedTextFieldID.setText("");
			textField_3.setText("");
			comboBoxSexo.setSelectedItem("<Selecciona>");
			comboBox_1_4.setSelectedItem("<Selecciona>");
			textField_8.setText("");
			textField_10.setText("");
			textField_7.setText("");
			formattedTextFieldPhone.setText("");
			comboBox_1_1.setSelectedItem("<Selecciona>");
			comboBox_1_3.setSelectedItem("<Selecciona>");
			comboBox_1.setSelectedItem("<Selecciona>");
			textField_9.setText("");
			textField_11.setText("");
			dateChooser.setDate(null);			
			error.setText(null);
			error1.setText(null);
			}
		
		else if (comboBox_1.getSelectedItem() == "Técnico") {
			comboBox.setSelectedItem("<Selecciona>");
			comboBox_5_1.setSelectedItem("<Selecciona>");
			comboBox_6_1.setSelectedItem("<Selecciona>");
			comboBox_7_1.setSelectedItem("<Selecciona>");
			txtSuperlargoArchipielago.setText("");
			textField_2.setText("");
			formattedTextFieldPostal.setText("");
			formattedTextFieldMob.setText("");
			formattedTextFieldID.setText("");
			textField_3.setText("");
			comboBoxSexo.setSelectedItem("<Selecciona>");
			comboBox_1_4.setSelectedItem("<Selecciona>");
			textField_8.setText("");
			textField_10.setText("");
			textField_7.setText("");
			formattedTextFieldPhone.setText("");
			comboBox_1_1.setSelectedItem("<Selecciona>");
			comboBox_1_3.setSelectedItem("<Selecciona>");
			comboBox_1.setSelectedItem("<Selecciona>");
			textField_9.setText("");
			textField_11.setText("");
			dateChooser.setDate(null);
			error.setText(null);
			error1.setText(null);
		}

else if (comboBox_1.getSelectedItem() == "Oficio") {			
			comboBox_8.setSelectedItem("<Selecciona>");
			comboBox_9.setSelectedItem("<Selecciona>");
			comboBox_10.setSelectedItem("<Selecciona>");
			txtSuperlargoArchipielago.setText("");
			textField_2.setText("");
			formattedTextFieldPostal.setText("");
			formattedTextFieldMob.setText("");
			formattedTextFieldID.setText("");
			textField_3.setText("");
			comboBoxSexo.setSelectedItem("<Selecciona>");
			comboBox_1_4.setSelectedItem("<Selecciona>");
			textField_8.setText("");
			textField_10.setText("");
			textField_7.setText("");
			formattedTextFieldPhone.setText("");
			comboBox_1_1.setSelectedItem("<Selecciona>");
			comboBox_1_3.setSelectedItem("<Selecciona>");
			comboBox_1.setSelectedItem("<Selecciona>");
			textField_9.setText("");
			textField_11.setText("");
			dateChooser.setDate(null);
			error.setText(null);
			error1.setText(null);
			}
	
	}
	public boolean compDate(String a){
		boolean b=true;
		int c= Integer.parseInt(a);
		if(c>1999 || c<1960){
		b=false;
		error1.setText("Edad no aceptada");

		}
		return b;
		
	}
}