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
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import EmploymentMarket01.Academic;
import EmploymentMarket01.CollectionPerson;
import EmploymentMarket01.DreamerNini;
import EmploymentMarket01.Person;
import EmploymentMarket01.Technical;

import com.toedter.calendar.JMonthChooser;
import com.toedter.calendar.JYearChooser;
import com.toedter.components.JSpinField;
import javax.swing.JLayeredPane;

public class PersonRegister extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3034749239761135563L;
	protected static final String String = null;
	protected static final Date Date = null;
	private final JPanel contentPanel = new JPanel();
	private final JTextField textFieldID;
	private JTextField txtSuperlargoArchipielago;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
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
	private JComboBox<String> comboBoxCertificaciones;
	private JComboBox<String> comboBoxEspecialidades;
	private JComboBox<String> comboBox_5_1;
	private JComboBox<String> comboBox_6;
	private JComboBox<String> comboBox_6_1;
	private JComboBox<String> comboBox_7;
	private JComboBox<String> comboBox_7_1;
	private final JComboBox<String> comboBox;
	private JComboBox<String> comboBox_1_1;
	private JComboBox<String> comboBoxSexo;
	private JComboBox<String> comboBox_1_4;
	private JComboBox<String> comboBox_8;
	private JComboBox<String> comboBox_9;
	private JComboBox<String> comboBox_10;
	private Date date;
	private JSpinField spinField;
	private JMonthChooser monthChooser;
	private JYearChooser yearChooser;
	private JScrollPane scrollPane;
	private JComboBox comboBoxNivelAlcanzado;
	private JPanel panel2;
	private JPanel panel3;
	private JPanel panel7;
	
	
	

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public PersonRegister() {
		setType(Type.NORMAL);
		setLocationByPlatform(true);
		setLocation(new Point(0, 5));
		setLocale(new Locale("es"));
		setFont(new Font("Tahoma", Font.BOLD, 12));
		setModal(true);
		setIconImage(Toolkit.getDefaultToolkit().getImage(PersonRegister.class.getResource("/InterfazGrafica/Images/Profile.png")));
		setTitle("REGISTRAR SOLICITANTE");
		setBounds(10, 50, 836, 739);
		setResizable(false);
		setLocationRelativeTo(rootPane);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(248, 248, 255));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
																																																																																																																																																																																													
																																																																																																																																																																																						panelUniversityStudy = new JPanel();
																																																																																																																																																																																						panelUniversityStudy.setBackground(new Color(248, 248, 255));
																																																																																																																																																																																						panelUniversityStudy.setBounds(450, 242, 357, 235);
																																																																																																																																																																																						contentPanel.add(panelUniversityStudy);
																																																																																																																																																																																						panelUniversityStudy.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Estudios Universitarios:", TitledBorder.LEFT, TitledBorder.TOP, null, null));
																																																																																																																																																																																						panelUniversityStudy.setLayout(null);
																																																																																																																																																																																							{
																																																																																																																																																																																								JLabel lblPu = new JLabel("Grado:");
																																																																																																																																																																																								lblPu.setHorizontalAlignment(SwingConstants.TRAILING);
																																																																																																																																																																																	     						lblPu.setBounds(10, 56, 107, 14);
																																																																																																																																																																																								panelUniversityStudy.add(lblPu);
																																																																																																																																																																																								panelUniversityStudy.setVisible(true);
																																																																																																																																																																																							}
																																																																																																																																																																																															
																																																																																																																																																																																															
																																																																																																																																																																																															comboBoxNivelAlcanzado = new JComboBox();
																																																																																																																																																																																															
																																																																																																																																																																																															comboBoxNivelAlcanzado.setBounds(127, 23, 219, 20);
																																																																																																																																																																																															panelUniversityStudy.add(comboBoxNivelAlcanzado);
																																																																																																																																																																																															comboBoxNivelAlcanzado.addItemListener(new ItemListener() {
																																																																																																																																																																																																public void itemStateChanged(ItemEvent arg0) {
																																																																																																																																																																																																	if((comboBoxNivelAlcanzado.getSelectedItem()=="Grado")){
																																																																																																																																																																																																		panel2.setVisible(true);
																																																																																																																																																																																																		panel3.setVisible(false);
																																																																																																																																																																																																		panel7.setVisible(false);
																																																																																																																																																																																																	}
																																																																																																																																																																																																	if((comboBoxNivelAlcanzado.getSelectedItem()=="PostGrado")){
																																																																																																																																																																																																		panel3.setVisible(true);
																																																																																																																																																																																																		panel7.setVisible(false);
																																																																																																																																																																																																		panel2.setVisible(true);
																																																																																																																																																																																																	}
																																																																																																																																																																																																	if((comboBoxNivelAlcanzado.getSelectedItem()=="Doctorado")){
																																																																																																																																																																																																		panel7.setVisible(true);
																																																																																																																																																																																																		panel3.setVisible(true);
																																																																																																																																																																																																		panel2.setVisible(true);
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
																																																																																																																																																																																																										comboBoxCertificaciones = new JComboBox();
																																																																																																																																																																																																										comboBoxCertificaciones.setBackground(new Color(248, 248, 255));
																																																																																																																																																																																																										comboBoxCertificaciones
																																																																																																																																																																																																												.setModel(new DefaultComboBoxModel(new String[] {"<Selecciona>", "Gesti\u00F3n de recursos humanos", "Topograf\u00EDa y geom\u00E1tica para desarrollo inmobiliario", "El ambiente de los locales: Creaci\u00F3n y ambientes que componen estilos", "An\u00E1lisis estad\u00EDstico b\u00E1sico", "Artes culinarias", "Auditor\u00EDa financiera", "Biblioteca y ciencias de la informaci\u00F3n", "Chocolate y confiter\u00EDa", "Configuraci\u00F3n e implantaci\u00F3n de Windows Server 2008", "La contabilidad financiera", "Direcci\u00F3n y gesti\u00F3n empresarial", "Dise\u00F1o y desarrollo de modelos de negocio", "Estrategia financiera: La optimizaci\u00F3n de los recursos y la proyecci\u00F3n de inversiones", "Gesti\u00F3n administrativa para asistentes ejecutivos", "La gesti\u00F3n de riesgos de seguridad de la informaci\u00F3n", "La gesti\u00F3n estrat\u00E9gica de las empresas familiares", "Gesti\u00F3n Integrada de Proyectos (DIGIP) en el sector inmobiliario y de la construcci\u00F3n en la RD", "Gesti\u00F3n y direcci\u00F3n estrat\u00E9gica del capital humano", "Impuestos Corporativos: Nuevas tendencias y reglamentos tributarios", "Inteligencia Empresarial", "Ingl\u00E9s intermedio", "Medici\u00F3n, redise\u00F1o y mejoras de procesos", "Gesti\u00F3n de la cadena de suministro", "Las t\u00E9cnicas de auditor\u00EDa asistida por computadora (TAAC'S)", "Ninguna"}));
																																																																																																																																																																																																										comboBoxCertificaciones.setBounds(127, 113, 219, 20);
																																																																																																																																																																																																										panelUniversityStudy.add(comboBoxCertificaciones);
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
																																																																																																																																																																																																										comboBoxEspecialidades
																																																																																																																																																																																																												.setModel(new DefaultComboBoxModel(new String[] {"<Selecciona>", "Conocer el mercado de valores DR", "El control de costos para las operaciones de alimentos y bebidas", "Red esencial de TI", "La gesti\u00F3n eficaz de las redes sociales", "Pron\u00F3stico de Ventas", "Las t\u00E9cnicas especializadas en la preparaci\u00F3n de la carne: Cortes, la cocina, la realizaci\u00F3n y presentaci\u00F3n'S)"}));
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
																																																																																																																																																																																																										comboBox_6 = new JComboBox();
																																																																																																																																																																																																										comboBox_6.setBackground(new Color(248, 248, 255));
																																																																																																																																																																																																										comboBox_6
																																																																																																																																																																																																												.setModel(new DefaultComboBoxModel(new String[] {"<Selecciona>", "Peque\u00F1as y medianas empresas", "Publicidad", "Aspectos de mercado", "Dise\u00F1o gr\u00E1fico", "Programaci\u00F3n de sistemas de informaci\u00F3n", "Contabilidad computarizada", "Contabilidad financiera y fiscal"}));
																																																																																																																																																																																																										comboBox_6.setBounds(127, 173, 219, 20);
																																																																																																																																																																																																										panelUniversityStudy.add(comboBox_6);
																																																																																																																																																																																																									}
																																																																																																																																																																																																									{
																																																																																																																																																																																																										JLabel lblDoctorate = new JLabel("Doctorados:");
																																																																																																																																																																																																										lblDoctorate.setHorizontalAlignment(SwingConstants.TRAILING);
																																																																																																																																																																																																										lblDoctorate.setBounds(10, 202, 107, 22);
																																																																																																																																																																																																										panelUniversityStudy.add(lblDoctorate);
																																																																																																																																																																																																									}
																																																																																																																																																																																																									
																																																																																																																																																																																																																					JLabel lblTitulo = new JLabel("Nivel Alcanzado:");
																																																																																																																																																																																																																					lblTitulo.setHorizontalAlignment(SwingConstants.RIGHT);
																																																																																																																																																																																																																					lblTitulo.setBounds(10, 26, 107, 14);
																																																																																																																																																																																																																					panelUniversityStudy.add(lblTitulo);
																																																																																																																																																																																																																					
																																																																																																																																																																																																																					{
																																																																																																																																																																																																																						
																																																																																																																																																																																																																						panel2 = new JPanel();
																																																																																																																																																																																																																						panel2.setVisible(false);
																																																																																																																																																																																																																						panel2.setBounds(127, 53, 219, 20);
																																																																																																																																																																																																																						panelUniversityStudy.add(panel2);
																																																																																																																																																																																																																						panel2.setLayout(null);
																																																																																																																																																																																																																						
																																																																																																																																																																																																																						panel3 = new JPanel();
																																																																																																																																																																																																																						panel3.setVisible(false);
																																																																																																																																																																																																																						panel3.setBounds(127, 82, 219, 20);
																																																																																																																																																																																																																						panelUniversityStudy.add(panel3);
																																																																																																																																																																																																																						panel3.setLayout(null);
																																																																																																																																																																																																																						
																																																																																																																																																																																																																						panel7 = new JPanel();
																																																																																																																																																																																																																						panel7.setVisible(false);
																																																																																																																																																																																																																						panel7.setBounds(127, 204, 219, 20);
																																																																																																																																																																																																																						panelUniversityStudy.add(panel7);
																																																																																																																																																																																																																						panel7.setLayout(null);
						
																																																																																																																																																																																																																						
																																																																																																																																																																																																																						comboBoxGrado = new JComboBox();
																																																																																																																																																																																																																						comboBoxGrado.setBounds(0, 0, 219, 20);
																																																																																																																																																																																																																						panel2.add(comboBoxGrado);
																																																																																																																																																																																																																						comboBoxGrado.setBackground(new Color(248, 248, 255));
																																																																																																																																																																																																																						comboBoxGrado
																																																																																																																																																																																																																								.setModel(new DefaultComboBoxModel(new String[] {"<Selecciona>", "Adm. emp. menci\u00F3n operaciones", "Adm. emp. menci\u00F3n finanzas", "Adm. emp. menci\u00F3n estrategia", "Adm. emp. menci\u00F3n creaci\u00F3n y desarrollo de nuevos negocios", "Adm. emp. menci\u00F3n gesti\u00F3n humana", "Adm. emp. menci\u00F3n negocios internacionales", "Adm. hotelera menci\u00F3n comida y bebida", "Adm. hotelera menci\u00F3n mercadeo hotelero ", "Arquitectura", "Comunicaci\u00F3n social  menci\u00F3n producci\u00F3n audiovisual", "Comunicaci\u00F3n Social menci\u00F3n comunicaci\u00F3n corporativa", "Derecho", "Dise\u00F1o e interiorismo", "Ecolog\u00EDa y manejo ambiental", "Econom\u00EDa", "Educaci\u00F3n", "Enfermer\u00EDa", "Estomatolog\u00EDa", "Filosof\u00EDa", "Gesti\u00F3n financiera y auditor\u00EDa", "Ingenier\u00EDa Civil", "Ingenier\u00EDa Electromec\u00E1nica menci\u00F3n mec\u00E1nica", "Ingenier\u00EDa Electromec\u00E1nica menci\u00F3n el\u00E9ctricidad", "Ingenier\u00EDa Industrial", "Ingenier\u00EDa de Sistemas y equipo", "Ingenier\u00EDa Electr\u00F3nica", "Ingenier\u00EDa telem\u00E1tica", "Medicina", "Mercadeo", "Nutrici\u00F3n y diet\u00E9tica", "Psicolog\u00EDa", "fisioterapia"}));
																																																																																																																																																																																																																					}
																																																																																																																																																																																																																					
																																																																																																																																																																																																																								
																																																																																																																																																																																																																									{

																																																																																																																																																																																																																										
																																																																																																																																																																																																																										comboBoxPostGrado = new JComboBox();
																																																																																																																																																																																																																										comboBoxPostGrado.setBounds(0, 0, 219, 20);
																																																																																																																																																																																																																										panel3.add(comboBoxPostGrado);
																																																																																																																																																																																																																										comboBoxPostGrado.setBackground(new Color(248, 248, 255));
																																																																																																																																																																																																																										comboBoxPostGrado
																																																																																																																																																																																																																												.setModel(new DefaultComboBoxModel(new String[] {"<Selecciona>", "Master Ejecutivo en Recursos Humanos Estrat\u00E9gicos", "Master en Gesti\u00F3n Estrat\u00E9gica", "MBA en Programas de Seguros", "Maestr\u00EDa en Regulaci\u00F3n Econ\u00F3mica", "Maestr\u00EDa en Derecho del Trabajo y de la Seguridad Social", "MSc en Bienes Ra\u00EDces", "Maestr\u00EDa en Tecnolog\u00EDas de la Propiedad Intelectual y Nuevas", "Master en Derecho de Negocios Corporativo", "Maestr\u00EDa en Relaciones Internacionales", "Maestr\u00EDa en Pol\u00EDticas P\u00FAblicas", "Maestr\u00EDa en Econom\u00EDa de la Empresa", "Master Ejecutivo en Gesti\u00F3n de la Cadena de Suministro", "Master en Dise\u00F1o Arquitectural concentraci\u00F3n Arquitectura Interior", "Master en Dise\u00F1o Arquitectural menci\u00F3n Arquitectura Alojamientos Tur\u00EDsticos", "Especializaci\u00F3n en Matem\u00E1ticas Aplicadas en la Educaci\u00F3n", "Especializaci\u00F3n en Educaci\u00F3n Matem\u00E1tica Nivel B\u00E1sico"}));
																																																																																																																																																																																																																									}
																																																																																																																																																																																																																									
																																																																																																																																																																																																																														
																																																																																																																																																																																																																														{
																																																																																																																																																																																																																															comboBox_7 = new JComboBox();
																																																																																																																																																																																																																															comboBox_7.setBounds(0, 0, 219, 20);
																																																																																																																																																																																																																															panel7.add(comboBox_7);
																																																																																																																																																																																																																															comboBox_7.setBackground(new Color(248, 248, 255));
																																																																																																																																																																																																																															comboBox_7
																																																																																																																																																																																																																																	.setModel(new DefaultComboBoxModel(new String[] {"<Selecciona>", "Derecho Constitucional y Derechos Fundamentales", "Sociedad Democr\u00E1tica, Estado y Derecho", "Educaci\u00F3n (y / o en el liderazgo o en Ciencias pedag\u00F3gicas)", "Ciencias Empresariales", "Cooperaci\u00F3n e Intervenci\u00F3n Social", "Psicolog\u00EDa de la Educaci\u00F3n y Desarrollo Humano", "Econom\u00EDa", "Sociolog\u00EDa", "Filosof\u00EDa para un mundo global"}));
																																																																																																																																																																																																																														}
																																																																																																																																																																																										
																																																																																																																																																																																													panel_5Oficio = new JPanel();
																																																																																																																																																																																													panel_5Oficio.setBackground(new Color(248, 248, 255));
																																																																																																																																																																																													panel_5Oficio.setBounds(450,242,357,150);
																																																																																																																																																																																													contentPanel.add(panel_5Oficio);
																																																																																																																																																																																													panel_5Oficio.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Estudios de Oficio:", TitledBorder.LEFT, TitledBorder.TOP, null, null));
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
																																																																																																																																																																																														comboBox_8
																																																																																																																																																																																																.setModel(new DefaultComboBoxModel(new String[] {"<Selecciona>", "Gesti\u00F3n de recursos humanos", "Topograf\u00EDa y geom\u00E1tica para desarrollo inmobiliario", "El ambiente de los locales: Creaci\u00F3n y ambientes que componen estilos", "An\u00E1lisis estad\u00EDstico b\u00E1sico", "Artes culinarias", "Auditor\u00EDa financiera", "Biblioteca y ciencias de la informaci\u00F3n", "Chocolate y confiter\u00EDa", "Configuraci\u00F3n e implantaci\u00F3n de Windows Server 2008", "La contabilidad financiera", "Direcci\u00F3n y gesti\u00F3n empresarial", "Dise\u00F1o y desarrollo de modelos de negocio", "Estrategia financiera: La optimizaci\u00F3n de los recursos y la proyecci\u00F3n de inversiones", "Gesti\u00F3n administrativa para asistentes ejecutivos", "La gesti\u00F3n de riesgos de seguridad de la informaci\u00F3n", "La gesti\u00F3n estrat\u00E9gica de las empresas familiares", "Gesti\u00F3n Integrada de Proyectos (DIGIP) en el sector inmobiliario y de la construcci\u00F3n en la RD", "Gesti\u00F3n y direcci\u00F3n estrat\u00E9gica del capital humano", "Impuestos Corporativos: Nuevas tendencias y reglamentos tributarios", "Inteligencia Empresarial", "Ingl\u00E9s intermedio", "Medici\u00F3n, redise\u00F1o y mejoras de procesos", "Gesti\u00F3n de la cadena de suministro", "Las t\u00E9cnicas de auditor\u00EDa asistida por computadora (TAAC'S)", "Ninguna"}));
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
																																																																																																																																																																																														comboBox_9
																																																																																																																																																																																																.setModel(new DefaultComboBoxModel(new String[] {"<Selecciona>", "Conocer el mercado de valores DR", "Control de costos para las operaciones de alimentos y bebidas", "Red esencial de TI", "La gesti\u00F3n eficaz de las redes sociales", "Pron\u00F3stico de Ventas", "T\u00E9cnicas especializadas en la preparaci\u00F3n de la carne: Cortes, la cocina, la realizaci\u00F3n y presentaci\u00F3n"}));
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
																																																																																																																																																																																														comboBox_10.setModel(new DefaultComboBoxModel(new String[] {"<Selecciona>", "contador", "actor / Actriz", "azafata", "arque\u00F3logo", "astronauta", "panadero", "bi\u00F3logo", "alba\u00F1il", "conductor de autob\u00FAs", "hombre de negocios", "mujer de negocios", "carnicero", "vigilante", "carpintero", "cajero", "limpiador", "payaso", "zapatero", "consultor", "cocinero", "consejero", "cocinero", "qu\u00EDmico", "bailar\u00EDn", "decorador", "dentista", "dise\u00F1ador", "modista", "basurero", "economista", "electricista", "agricultor", "bombero", "pescador", "florista", "frutero", "basurero", "jardinero", "peluquero", "ama de casa", "cazador", "Joyero", "juez", "abogado", "bibliotecario", "salvavidas", "camionero", "cartero", "mec\u00E1nico", "meteor\u00F3logo", "minero", "modelo", "monje", "ni\u00F1era", "monja", "enfermera", "ni\u00F1era", "empleado de oficina", "pintor", "pastelero", "farmac\u00E9utico", "fot\u00F3grafo", "f\u00EDsico", "fontanero", "polic\u00EDa", "pol\u00EDtico", "portero", "cartero", "sacerdote", "profesor", "programador", "psiquiatra", "psic\u00F3logo", "recepcionista", "investigador", "marinero", "vendedor", "cient\u00EDfico", "secretario", "secretario", "zapatero", "dependiente", "cantante", "asistente social", "cirujano", "taxista", "profesor", "operador telef\u00F3nico", "agente de viaje", "camionero", "veterinario", "camarero", "camarera", "limpiador de ventanas", "escritor"}));
																																																																																																																																																																																														comboBox_10.setBounds(127, 73, 219, 20);
																																																																																																																																																																																														panel_5Oficio.add(comboBox_10);
																																																																																																																																																																																													}
																																																																																																																																																																												
																																																																																																																																																																												
																																																																																																																																																																																										panelTechnicalStudies = new JPanel();
																																																																																																																																																																																										panelTechnicalStudies.setBackground(new Color(248, 248, 255));
																																																																																																																																																																																										panelTechnicalStudies.setBounds(450,242,357,235);
																																																																																																																																																																																										contentPanel.add(panelTechnicalStudies);
																																																																																																																																																																																										panelTechnicalStudies.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Estudios T\u00E9cnicos", TitledBorder.LEFT, TitledBorder.TOP, null, null));
																																																																																																																																																																																										panelTechnicalStudies.setVisible(false);
																																																																																																																																																																																										panelTechnicalStudies.setLayout(null);
																																																																																																																																																																																										
																																																																																																																																																																																												JLabel lblCertificados_1 = new JLabel("Certificados:");
																																																																																																																																																																																												lblCertificados_1.setHorizontalAlignment(SwingConstants.TRAILING);
																																																																																																																																																																																												lblCertificados_1.setBounds(10, 27, 107, 14);
																																																																																																																																																																																												panelTechnicalStudies.add(lblCertificados_1);
																																																																																																																																																																																												
																																																																																																																																																																																														comboBox = new JComboBox();
																																																																																																																																																																																														comboBox.setBackground(new Color(248, 248, 255));
																																																																																																																																																																																														comboBox.setModel(new DefaultComboBoxModel(new String[] {"<Selecciona>", "Gesti\u00F3n de recursos humanos", "Topograf\u00EDa y geom\u00E1tica para desarrollo inmobiliario", "El ambiente de los locales: Creaci\u00F3n y ambientes que componen estilos", "An\u00E1lisis estad\u00EDstico b\u00E1sico", "Artes culinarias", "Auditor\u00EDa financiera", "Biblioteca y ciencias de la informaci\u00F3n", "Chocolate y confiter\u00EDa", "Configuraci\u00F3n e implantaci\u00F3n de Windows Server 2008", "La contabilidad financiera", "Direcci\u00F3n y gesti\u00F3n empresarial", "Dise\u00F1o y desarrollo de modelos de negocio", "Estrategia financiera: La optimizaci\u00F3n de los recursos y la proyecci\u00F3n de inversiones", "Gesti\u00F3n administrativa para asistentes ejecutivos", "La gesti\u00F3n de riesgos de seguridad de la informaci\u00F3n", "La gesti\u00F3n estrat\u00E9gica de las empresas familiares", "Gesti\u00F3n Integrada de Proyectos (DIGIP) en el sector inmobiliario y de la construcci\u00F3n en la RD", "Gesti\u00F3n y direcci\u00F3n estrat\u00E9gica del capital humano", "Impuestos Corporativos: Nuevas tendencias y reglamentos tributarios", "Inteligencia Empresarial", "Ingl\u00E9s intermedio", "Medici\u00F3n, redise\u00F1o y mejoras de procesos", "Gesti\u00F3n de la cadena de suministro", "Las t\u00E9cnicas de auditor\u00EDa asistida por computadora (TAAC'S)", "Ninguna"}));
																																																																																																																																																																																														
																																																																																																																																																																																														comboBox.setBounds(127, 24, 219, 20);
																																																																																																																																																																																														panelTechnicalStudies.add(comboBox);
																																																																																																																																																																																														
																																																																																																																																																																																																JLabel lblCursosEspecializados_1 = new JLabel("Especialidades:");
																																																																																																																																																																																																lblCursosEspecializados_1.setHorizontalAlignment(SwingConstants.TRAILING);
																																																																																																																																																																																																lblCursosEspecializados_1.setBounds(10, 48, 107, 22);
																																																																																																																																																																																																panelTechnicalStudies.add(lblCursosEspecializados_1);
																																																																																																																																																																																																
																																																																																																																																																																																																		comboBox_5_1 = new JComboBox();
																																																																																																																																																																																																		comboBox_5_1.setBackground(new Color(248, 248, 255));
																																																																																																																																																																																																		comboBox_5_1
																																																																																																																																																																																																				.setModel(new DefaultComboBoxModel(new String[] {"<Selecciona>", "Conocer el mercado de valores DR", "El control de costos para las operaciones de alimentos y bebidas", "Red esencial de TI", "La gesti\u00F3n eficaz de las redes sociales", "Pron\u00F3stico de Ventas", "Las t\u00E9cnicas especializadas en la preparaci\u00F3n de la carne: Cortes, la cocina, la realizaci\u00F3n y presentaci\u00F3n'S)"}));
																																																																																																																																																																																																		comboBox_5_1.setBounds(127, 49, 219, 20);
																																																																																																																																																																																																		panelTechnicalStudies.add(comboBox_5_1);
																																																																																																																																																																																																		
																																																																																																																																																																																																				JLabel lblCarreraTcnica = new JLabel("Estudios t\u00E9cnicos:");
																																																																																																																																																																																																				lblCarreraTcnica.setHorizontalAlignment(SwingConstants.TRAILING);
																																																																																																																																																																																																				lblCarreraTcnica.setBounds(10, 73, 107, 22);
																																																																																																																																																																																																				panelTechnicalStudies.add(lblCarreraTcnica);
																																																																																																																																																																																																				
																																																																																																																																																																																																						comboBox_6_1 = new JComboBox();
																																																																																																																																																																																																						comboBox_6_1.setBackground(new Color(248, 248, 255));
																																																																																																																																																																																																						comboBox_6_1.setModel(new DefaultComboBoxModel(new String[] {"<Selecciona>", "Peque\u00F1as y medianas empresas", "Publicidad", "Aspectos de mercado", "Dise\u00F1o gr\u00E1fico", "Programaci\u00F3n de sistemas de informaci\u00F3n", "Contabilidad computarizada", "Contabilidad financiera y fiscal"}));
																																																																																																																																																																																																						comboBox_6_1.setBounds(127, 74, 219, 20);
																																																																																																																																																																																																						panelTechnicalStudies.add(comboBox_6_1);
																																																																																																																																																																																																						
																																																																																																																																																																																																								JLabel lblreasDeTrabajo = new JLabel("\u00C1reas de Trabajo:");
																																																																																																																																																																																																								lblreasDeTrabajo.setHorizontalAlignment(SwingConstants.TRAILING);
																																																																																																																																																																																																								lblreasDeTrabajo.setBounds(10, 98, 107, 22);
																																																																																																																																																																																																								panelTechnicalStudies.add(lblreasDeTrabajo);
																																																																																																																																																																																																								
																																																																																																																																																																																																										comboBox_7_1 = new JComboBox();
																																																																																																																																																																																																										comboBox_7_1.setBackground(new Color(248, 248, 255));
																																																																																																																																																																																																										comboBox_7_1.setModel(new DefaultComboBoxModel(new String[] {"<Selecciona>", "contador", "actor / Actriz", "azafata", "arque\u00F3logo", "astronauta", "panadero", "bi\u00F3logo", "alba\u00F1il", "conductor de autob\u00FAs", "hombre de negocios", "mujer de negocios", "carnicero", "vigilante", "carpintero", "cajero", "limpiador", "payaso", "zapatero", "consultor", "cocinero", "consejero", "cocinero", "qu\u00EDmico", "bailar\u00EDn", "decorador", "dentista", "dise\u00F1ador", "modista", "basurero", "economista", "electricista", "agricultor", "bombero", "pescador", "florista", "frutero", "basurero", "jardinero", "peluquero", "ama de casa", "cazador", "Joyero", "juez", "abogado", "bibliotecario", "salvavidas", "camionero", "cartero", "mec\u00E1nico", "meteor\u00F3logo", "minero", "modelo", "monje", "ni\u00F1era", "monja", "enfermera", "ni\u00F1era", "empleado de oficina", "pintor", "pastelero", "farmac\u00E9utico", "fot\u00F3grafo", "f\u00EDsico", "fontanero", "polic\u00EDa", "pol\u00EDtico", "portero", "cartero", "sacerdote", "profesor", "programador", "psiquiatra", "psic\u00F3logo", "recepcionista", "investigador", "marinero", "vendedor", "cient\u00EDfico", "secretario", "secretario", "zapatero", "dependiente", "cantante", "asistente social", "cirujano", "taxista", "profesor", "operador telef\u00F3nico", "agente de viaje", "camionero", "veterinario", "camarero", "camarera", "limpiador de ventanas", "escritor"}));
																																																																																																																																																																																																										comboBox_7_1.setBounds(127, 99, 219, 20);
																																																																																																																																																																																																										panelTechnicalStudies.add(comboBox_7_1);

		textFieldID = new JTextField();
		textFieldID.setBounds(553, 192, 140, 20);
		contentPanel.add(textFieldID);
		textFieldID.setColumns(10);

		JLabel lblId = new JLabel("ID");
		lblId.setBounds(524, 195, 19, 14);
		lblId.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblId.setHorizontalAlignment(SwingConstants.TRAILING);
		lblId.setVerticalAlignment(SwingConstants.BOTTOM);
		contentPanel.add(lblId);


		{

			JPanel DatosPersonales = new JPanel();
			DatosPersonales.setBackground(new Color(248, 248, 255));
			DatosPersonales.setBounds(22, 31, 416, 200);
			DatosPersonales.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "     Datos Personales:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
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
				comboBox_1_1.setBackground(new Color(248, 248, 255));
				comboBox_1_1.setBounds(150, 95, 223, 20);
				DatosPersonales.add(comboBox_1_1);
				comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"<Selecciona>", "afgano", "americano", "argentino", "australiano", "austriaco", "belga", "boliviano", "brasile\u00F1o", "brit\u00E1nico", "b\u00FAlgaro", "canadiense", "chileno", "chino", "colombiano", "costarricense", "cubano", "checo", "dan\u00E9s", "dominicano", "holand\u00E9s", "ecuatoriano", "egipcio", "ingl\u00E9s", "filipino", "finland\u00E9s", "franc\u00E9s", "alem\u00E1n", "griego", "groenland\u00E9s", "guatemalteco", "haitiano", "hawaiano", "hondure\u00F1o", "h\u00FAngaro", "island\u00E9s", "indio", "indonesio", "iran\u00ED", "Iraqu\u00ED", "irland\u00E9s", "israel\u00ED", "italiano", "jamaiquino", "japon\u00E9s", "coreano", "liban\u00E9s", "malasio", "malt\u00E9s", "mexicano", "marroqu\u00ED", "nepal\u00E9s", "neozeland\u00E9s", "nicarag\u00FCense", "nigeriano", "noruego", "pakistan\u00ED", "palestino", "paname\u00F1o", "paraguayo", "peruano", "polaco", "portugu\u00E9s", "puertorrique\u00F1o", "rumano", "ruso", "saudita", "escoc\u00E9s", "singapurence", "espa\u00F1ol", "sueco", "suizp", "sirio", "tahitiano", "tailand\u00E9s", "tunecino", "turco", "ucranio", "uruguayo", "venezolano", "vietnamita", "gal\u00E9s", "yugoslavo"}));
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
				comboBoxSexo.setModel(new DefaultComboBoxModel(new String[] {"<Selecciona>", "Femenino", "Masculino"}));		
			}
			
			JLabel lblPicture = new JLabel("");
			if (comboBoxSexo.getSelectedItem()=="Femenino")
			{
				lblPicture.setIcon(new ImageIcon(PersonRegister.class.getResource("/InterfazGrafica/Images/femalePicture.jpg")));
			}else if (comboBoxSexo.getSelectedItem()=="Masculino")
			{
		    	lblPicture.setIcon(new ImageIcon(PersonRegister.class.getResource("/InterfazGrafica/Images/malePicture.jpg")));
			}else
			{
				lblPicture.setIcon(new ImageIcon(PersonRegister.class.getResource("/InterfazGrafica/Images/malePicture.jpg")));
			}
			lblPicture.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblPicture.setIgnoreRepaint(true);
			lblPicture.setIconTextGap(8);
			lblPicture.setHorizontalAlignment(SwingConstants.CENTER);
			lblPicture.setBounds(553, 44, 140, 137);
			contentPanel.add(lblPicture);
			lblPicture.setForeground(new Color(0, 0, 0));
			lblPicture.setBackground(new Color(255, 255, 255));
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
				comboBox_1_3.setModel(new DefaultComboBoxModel(new String[] {"<Selecciona>", "Soltero", "Casado", "Dirvorciado", "Viudo", "Comprometido", "Otro"}));
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
			comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"<Selecciona>", "Universitario", "T\u00E9cnico", "Oficio"}));

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
			
			monthChooser = new JMonthChooser();
			monthChooser.setBounds(194, 71, 108, 20);
			DatosPersonales.add(monthChooser);
			
			yearChooser = new JYearChooser();
			yearChooser.setMaximum(1999);
			yearChooser.setYear(1999);
			yearChooser.setValue(1999);
			yearChooser.setMinimum(1950);
			yearChooser.setBounds(301, 71, 72, 20);
			DatosPersonales.add(yearChooser);
			
			spinField = new JSpinField();
			spinField.setMinimum(1);
			spinField.setMaximum(31);
			spinField.setBounds(150, 71, 46, 20);
			DatosPersonales.add(spinField);
			
			JLabel label = new JLabel("*");
			label.setForeground(Color.RED);
			label.setBounds(10, 0, 36, 14);
			DatosPersonales.add(label);
			{
				JPanel panel_2Contacto = new JPanel();
				panel_2Contacto.setBackground(new Color(248, 248, 255));
				panel_2Contacto.setBounds(22, 242, 416, 174);
				panel_2Contacto.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "   Contacto:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
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
					textField_4 = new JTextField();
					textField_4.setBounds(150, 54, 223, 20);
					panel_2Contacto.add(textField_4);
					textField_4.setColumns(10);
				}
				{
					JLabel lblTelephone = new JLabel("Tel\u00E9fono:");
					lblTelephone.setBounds(2, 91, 138, 14);
					panel_2Contacto.add(lblTelephone);
					lblTelephone.setVerticalAlignment(SwingConstants.BOTTOM);
					lblTelephone
							.setHorizontalAlignment(SwingConstants.TRAILING);
				}
				{
					textField_5 = new JTextField();
					textField_5.setBounds(150, 85, 223, 20);
					panel_2Contacto.add(textField_5);
					textField_5.setColumns(10);
				}
				{
					textField_6 = new JTextField();
					textField_6.setBounds(150, 116, 223, 20);
					panel_2Contacto.add(textField_6);
					textField_6.setColumns(10);
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
			}
															
															

			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(248, 248, 255));
			buttonPane.setBounds(0, 676, 830, 59);
			contentPanel.add(buttonPane);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			{
				JButton okButton = new JButton("Register");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						
						if (comboBox_1.getSelectedItem() == "Universitario") {
							Academic temp = new Academic();
							temp.setName(txtSuperlargoArchipielago.getText());
							temp.setLastName(textField_2.getText());
							temp.setID(textFieldID.getText());
							temp.setPhone(textField_5.getText());
							temp.setMobile(textField_4.getText());
							temp.setEmail(textField_3.getText());
							temp.setSex(comboBoxSexo.getSelectedItem().toString());					
							//date.setMonth(monthChooser.getMonth());
							//date.setDate(spinField.getValue());
							//date.setYear(yearChooser.getYear());
							temp.setBirth(date);
							temp.setCity(textField_9.getText());
							temp.getAddress().setRegion(textField_11.getText());
							temp.setSector(textField_10.getText());
							temp.setCalle(textField_8.getText());
							temp.setHouseNumber(Integer.parseInt(textField_7.getText()));
							temp.setPostalCode(Long.parseLong(textField_6
									.getText()));
							temp.setNationality(comboBox_1_1.getSelectedItem()
									.toString());
							temp.setCivilState(comboBox_1_3.getSelectedItem()
									.toString());
							temp.setAcademicLevel(comboBox_1.getSelectedItem()
									.toString());
							temp.setGradeTitle(comboBoxGrado.getSelectedItem()
									.toString());
							temp.getAddress().setRegion(textField_7.getText());
							temp.setGradeLevel(comboBoxNivelAlcanzado.getSelectedItem().toString());
							temp.setPostGradeTitles(comboBoxPostGrado.getSelectedItem().toString());
							temp.setCertTitles(comboBoxCertificaciones.getSelectedItem().toString());
							temp.setEspTitles(comboBoxEspecialidades.getSelectedItem().toString());
							temp.setTechnicalTitles(comboBox_6.getSelectedItem().toString());
							temp.setDoctorateTitles(comboBox_7.getSelectedItem().toString());

							CollectionPerson.getInstanceCollectionPerson().setPersons(temp);

							comboBoxGrado.setSelectedItem("<Selecciona>");
							comboBoxNivelAlcanzado.setSelectedItem("<Selecciona>");
							comboBoxPostGrado.setSelectedItem("<Selecciona>");
							comboBoxCertificaciones.setSelectedItem("<Selecciona>");
							comboBoxEspecialidades.setSelectedItem("<Selecciona>");
							comboBox_6.setSelectedItem("<Selecciona>");
							comboBox_7.setSelectedItem("<Selecciona>");
						}
						else if (comboBox_1.getSelectedItem() == "Técnico") {
							// YearsExperience,
							// String gradelevel
							Technical temp = new Technical();
							temp.setName(txtSuperlargoArchipielago.getText());
							temp.setLastName(textField_2.getText());
							temp.setID(textFieldID.getText());
							temp.setPhone(textField_5.getText());
							temp.setMobile(textField_4.getText());
							temp.setEmail(textField_3.getText());
							temp.setSex(comboBoxSexo.getSelectedItem().toString());
							
							//Date date = new Date();
							//date.setMonth(monthChooser.getMonth());
							//date.setDate(spinField.getValue());
							//date.setYear(yearChooser.getYear());
							temp.setBirth(date);
							
							temp.setBirth(date);
							temp.setCity(textField_9.getText());
							temp.getAddress().setRegion(textField_11.getText());
							temp.setSector(textField_10.getText());
							temp.setCalle(textField_8.getText());
							temp.setHouseNumber(Integer.parseInt(textField_7
									.getText()));
							temp.setPostalCode(Long.parseLong(textField_6
									.getText()));
							temp.setNationality(comboBox_1_1.getSelectedItem()
									.toString());
							temp.setCivilState(comboBox_1_3.getSelectedItem()
									.toString());
							temp.setAcademicLevel(comboBox_1.getSelectedItem()
									.toString());
							temp.getAddress().setRegion(textField_7.getText());
							temp.setCertTitles(comboBox.getSelectedItem().toString());
							temp.setEspTitle(comboBox_5_1.getSelectedItem().toString());
							temp.setTechTitles(comboBox_6_1.getSelectedItem().toString());
							temp.setWorks(comboBox_7_1.getSelectedItem().toString());
							
							CollectionPerson.getInstanceCollectionPerson().setPersons(temp);
							
							comboBox.setSelectedItem("<Selecciona>");
							comboBox_5_1.setSelectedItem("<Selecciona>");
							comboBox_6_1.setSelectedItem("<Selecciona>");
							comboBox_7_1.setSelectedItem("<Selecciona>");
						}

			else if (comboBox_1.getSelectedItem() == "Oficio") {
							// YearsExperience,
							// String gradelevel
							DreamerNini temp = new DreamerNini();
							temp.setName(txtSuperlargoArchipielago.getText());
							temp.setLastName(textField_2.getText());
							temp.setID(textFieldID.getText());
							temp.setPhone(textField_5.getText());
							temp.setMobile(textField_4.getText());
							temp.setEmail(textField_3.getText());
							temp.setSex(comboBoxSexo.getSelectedItem().toString());
							
							//Date date = new Date();
							//date.setMonth(monthChooser.getMonth());
							//date.setDate(spinField.getValue());
							//date.setYear(yearChooser.getYear());
							temp.setBirth(date);
							temp.setCity(textField_9.getText());
							temp.getAddress().setRegion(textField_11.getText());
							temp.setSector(textField_10.getText());
							temp.setCalle(textField_8.getText());
							temp.setHouseNumber(Integer.parseInt(textField_7
									.getText()));
							temp.setPostalCode(Long.parseLong(textField_6
									.getText()));
							temp.setNationality(comboBox_1_1.getSelectedItem()
									.toString());
							temp.setCivilState(comboBox_1_3.getSelectedItem()
									.toString());
							temp.setAcademicLevel(comboBox_1.getSelectedItem()
									.toString());
							temp.getAddress().setRegion(textField_7.getText());
							temp.setCertTitles(comboBox_8.getSelectedItem().toString());
							temp.setCourseTitles(comboBox_9.getSelectedItem().toString());
							temp.setWorks(comboBox_10.getSelectedItem().toString());
							
							CollectionPerson.getInstanceCollectionPerson().setPersons(temp);
							
							comboBox_8.setSelectedItem("<Selecciona>");
							comboBox_9.setSelectedItem("<Selecciona>");
							comboBox_10.setSelectedItem("<Selecciona>");
					}
						
						txtSuperlargoArchipielago.setText("");
						textField_2.setText("");
						textFieldID.setText("");
						textField_5.setText("");
						textField_4.setText("");
						textField_3.setText("");
						comboBoxSexo.setSelectedItem("<Selecciona>");
						comboBox_1_4.setSelectedItem("<Selecciona>");
						textField_8.setText("");
						textField_10.setText("");
						textField_7.setText("");
						textField_6.setText("");
						comboBox_1_1.setSelectedItem("<Selecciona>");
						comboBox_1_3.setSelectedItem("<Selecciona>");
						comboBox_1.setSelectedItem("<Selecciona>");
						textField_9.setText("");
						textField_11.setText("");
						
					}
				});

				/*JButton btnRegister = new JButton("Register");
				btnRegister.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (comboBox_1.getSelectedItem() == "Universitary") {
													// YearsExperience,
													// String gradelevel
													Academic temp = new Academic();
													temp.setName(txtSuperlargoArchipielago.getText());
													temp.setLastName(textField_2.getText());
													temp.setID(textFieldID.getText());
													temp.setPhone(textField_5.getText());
													temp.setMobile(textField_4.getText());
													temp.setEmail(textField_3.getText());
													temp.setSex(comboBox_1_2.getSelectedItem().toString());
													
													Date date = new Date();
													date.setMonth(monthChooser.getMonth());
													date.setDate(spinField.getValue());
													date.setYear(yearChooser.getYear());
													temp.setBirth(date);
													temp.setCity(comboBox_1_4.getSelectedItem()
															.toString());
													temp.setSector(textField_10.getText());
													temp.setCalle(textField_8.getText());
													temp.setHouseNumber(Integer.parseInt(textField_7
															.getText()));
													temp.setPostalCode(Long.parseLong(textField_6
															.getText()));
													temp.setNationality(comboBox_1_1.getSelectedItem()
															.toString());
													temp.setCivilState(comboBox_1_3.getSelectedItem()
															.toString());
													temp.setAcademicLevel(comboBox_1.getSelectedItem()
															.toString());
													temp.setTitle(comboBox_2.getSelectedItem()
															.toString());
													temp.getAddress().setRegion(textField_7.getText());

													persons.setPersons(temp);
													loadPerson(persons);
												}
						else if (comboBox_1.getSelectedItem() == "Technical") {
													// YearsExperience,
													// String gradelevel
													Technical temp = new Technical();
													temp.setName(txtSuperlargoArchipielago.getText());
													temp.setLastName(textField_2.getText());
													temp.setID(textFieldID.getText());
													temp.setPhone(textField_5.getText());
													temp.setMobile(textField_4.getText());
													temp.setEmail(textField_3.getText());
													temp.setSex(comboBox_1_2.getSelectedItem().toString());
													
													date = new Date();
													date.setMonth(monthChooser.getMonth());
													date.setDate(spinField.getValue());
													date.setYear(yearChooser.getYear());
													temp.setBirth(date);
													
													temp.setBirth(date);
													temp.setCity(comboBox_1_4.getSelectedItem()
															.toString());
													temp.setSector(textField_10.getText());
													temp.setCalle(textField_8.getText());
													temp.setHouseNumber(Integer.parseInt(textField_7
															.getText()));
													temp.setPostalCode(Long.parseLong(textField_6
															.getText()));
													temp.setNationality(comboBox_1_1.getSelectedItem()
															.toString());
													temp.setCivilState(comboBox_1_3.getSelectedItem()
															.toString());
													temp.setAcademicLevel(comboBox_1.getSelectedItem()
															.toString());
													temp.getAddress().setRegion(textField_7.getText());
													persons.setPersons(temp);
													loadPerson(persons);
												}

						else if (comboBox_1.getSelectedItem() == "Other") {
													// YearsExperience,
													// String gradelevel
													DreamerNini temp = new DreamerNini();
													temp.setName(txtSuperlargoArchipielago.getText());
													temp.setLastName(textField_2.getText());
													temp.setID(textFieldID.getText());
													temp.setPhone(textField_5.getText());
													temp.setMobile(textField_4.getText());
													temp.setEmail(textField_3.getText());
													temp.setSex(comboBox_1_2.getSelectedItem().toString());
													
													date = new Date();
													date.setMonth(monthChooser.getMonth());
													date.setDate(spinField.getValue());
													date.setYear(yearChooser.getYear());
													temp.setBirth(date);
													
													temp.setBirth(date);
													temp.setCity(comboBox_1_4.getSelectedItem()
															.toString());
													temp.setSector(textField_10.getText());
													temp.setCalle(textField_8.getText());
													temp.setHouseNumber(Integer.parseInt(textField_7
															.getText()));
													temp.setPostalCode(Long.parseLong(textField_6
															.getText()));
													temp.setNationality(comboBox_1_1.getSelectedItem()
															.toString());
													temp.setCivilState(comboBox_1_3.getSelectedItem()
															.toString());
													temp.setAcademicLevel(comboBox_1.getSelectedItem()
															.toString());
													temp.getAddress().setRegion(textField_7.getText());
													persons.setPersons(temp);
													loadPerson(persons);
										

				}}}
				
				);
				buttonPane.add(btnRegister);
				*/
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent arg0) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);}}
				{
				}
																																			
																																			JLabel labelAstID = new JLabel("   *");
																																			labelAstID.setHorizontalAlignment(SwingConstants.RIGHT);
																																			labelAstID.setForeground(Color.RED);
																																			labelAstID.setBounds(501, 195, 19, 14);
																																			contentPanel.add(labelAstID);
																																			
																																			JLayeredPane layeredPane = new JLayeredPane();
																																			layeredPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
																																			layeredPane.setBounds(553, 44, 140, 137);
																																			contentPanel.add(layeredPane);
																																			{
																																				JPanel panel_3Address = new JPanel();
																																				panel_3Address.setBounds(22, 427, 418, 244);
																																				contentPanel.add(panel_3Address);
																																				panel_3Address.setBackground(new Color(248, 248, 255));
																																				panel_3Address.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "     Direcci\u00F3n:", TitledBorder.LEFT, TitledBorder.TOP, null, null));
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
																																					lblCountry
																																							.setHorizontalAlignment(SwingConstants.TRAILING);
																																				}
																																				{
																																					JLabel lblSector = new JLabel("Sector:");
																																					lblSector.setBounds(30, 109, 108, 14);
																																					panel_3Address.add(lblSector);
																																					lblSector.setVerticalAlignment(SwingConstants.BOTTOM);
																																					lblSector
																																							.setHorizontalAlignment(SwingConstants.TRAILING);
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
																																					lblRegion
																																							.setHorizontalAlignment(SwingConstants.TRAILING);
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
																																					comboBox_1_4
																																							.setModel(new DefaultComboBoxModel(new String[] {"<Selecciona>", "Afganist\u00E1n", "Albania", "Argelia", "Samoa Americana", "Andorra", "Angola", "Anguila", "Ant\u00E1rtida", "Antigua y Barbuda", "Argentina", "Armenia", "Aruba", "Australia", "Austria", "Azerbaiy\u00E1n", "Bahamas", "Bahrein", "Bangladesh", "Barbados", "Bielorrusia", "B\u00E9lgica", "Belice", "Benin", "Bermuda", "But\u00E1n", "Bolivia", "Bosnia y Herzegovina", "Botswana", "Brasil", "Brunei Darussalam", "Bulgaria", "Burkina Faso", "Burundi", "Camboya", "Camer\u00FAn", "Canad\u00E1", "Cabo Verde", "Islas Caim\u00E1n", "Rep\u00FAblica Centroafricana", "Chad", "Chile", "China", "Isla de Navidad", "Islas Cocos (Keeling)", "Colombia", "Comoras", "Rep\u00FAblica Democr\u00E1tica del Congo (Kinshasa)", "Congo, Rep\u00FAblica del (Brazzaville)", "Islas Cook", "Costa Rica", "Costa de Marfil (C\u00F4te d'Ivoire)", "Croacia", "Cuba", "Chipre", "Rep\u00FAblica Checa", "Dinamarca", "Djibouti", "Dominica", "Rep\u00FAblica Dominicana", "Timor Oriental Timor-Leste", "Ecuador", "Egipto", "El Salvador", "Guinea Ecuatorial", "Eritrea", "Estonia", "Etiop\u00EDa", "islas Malvinas", "Islas Feroe", "Fiji", "Finlandia", "Francia", "Guayana franc\u00E9s", "Polinesia franc\u00E9s", "Territorios Franceses del Sur", "Gab\u00F3n", "Gambia", "Georgia", "Alemania", "Ghana", "Gibraltar", "gran Breta\u00F1a", "Grecia", "Groenlandia", "Granada", "Guadalupe", "Guam", "Guatemala", "Guinea", "Guinea-Bissau", "Guayana", "Hait\u00ED", "Santa Sede", "Honduras", "Hong Kong", "Hungr\u00EDa", "Islandia", "India", "Indonesia", "Ir\u00E1n (Rep\u00FAblica Isl\u00E1mica del)", "Irak", "Irlanda", "Israel", "Italia", "Jamaica", "Jap\u00F3n", "Jordania", "Kazajst\u00E1n", "Kenia", "Kiribati", "Corea, Rep\u00FAblica Popular Democr\u00E1tica. (Corea del Norte)", "Corea, Rep\u00FAblica de (Corea del Sur)", "Kosovo", "Kuwait", "Kirguist\u00E1n", "Lao, Rep\u00FAblica Popular Democr\u00E1tica", "Letonia", "L\u00EDbano", "Lesoto", "Liberia", "Libia", "Liechtenstein", "Lituania", "Luxemburgo", "Macao", "Macedonia, Rep. De", "Madagascar", "Malawi", "Malasia", "Maldivas", "Mal\u00ED", "Malta", "Islas Marshall", "Martinica", "Mauritania", "Mauricio", "Mayotte", "M\u00E9xico", "Micronesia, Estados Federados de", "Moldova, Rep\u00FAblica de", "M\u00F3naco", "Mongolia", "Montenegro", "Montserrat", "Marruecos", "Mozambique", "Myanmar, Birmania", "Namibia", "Nauru", "Nepal", "Pa\u00EDses Bajos", "Antillas Holandesas", "nueva Caledonia", "nueva Zelanda", "Nicaragua", "N\u00EDger", "Nigeria", "Niue", "Islas Marianas del Norte", "Noruega", "Om\u00E1n", "Pakist\u00E1n", "Palau", "territorios palestinos", "Panam\u00E1", "Pap\u00FAa Nueva Guinea", "Paraguay", "Per\u00FA", "Filipinas", "Pitcairn Island", "Polonia", "Portugal", "Puerto Rico", "Katar", "Isla de la Reuni\u00F3n", "Rumania", "Federaci\u00F3n de Rusia", "Ruanda", "San Crist\u00F3bal y Nieves", "Santa Luc\u00EDa", "San Vicente y las Granadinas", "Samoa", "San Marino", "Santo Tom\u00E9 y Pr\u00EDncipe", "Arabia Saudita", "Senegal", "Serbia", "Seychelles", "Sierra Leona", "Singapur", "Eslovaquia (Rep\u00FAblica Eslovaca)", "Eslovenia", "islas Salom\u00F3n", "Somalia", "Sud\u00E1frica", "Sud\u00E1n del Sur", "Espa\u00F1a", "Sri Lanka", "Sud\u00E1n", "Suriname", "Swazilandia", "Suecia", "Suiza", "Siria", "Taiw\u00E1n (Rep\u00FAblica de China)", "Tayikist\u00E1n", "Tanzania", "Tailandia", "T\u00EDbet", "Timor-Leste (Timor Oriental)", "Togo", "Tokelau", "Tonga", "Trinidad y Tobago", "T\u00FAnez", "Pavo", "Turkmenist\u00E1n", "Islas Turcas y Caicos", "Tuvalu", "Uganda", "Ucrania", "Emiratos \u00C1rabes Unidos", "Reino Unido", "Estados Unidos", "Uruguay", "Uzbekist\u00E1n", "Vanuatu", "Ciudad del Vaticano (Santa Sede)", "Venezuela", "Vietnam", "Islas V\u00EDrgenes (brit\u00E1nica)", "Islas V\u00EDrgenes (EE.UU.)", "Islas Wallis y Futuna", "S\u00E1hara Occidental", "Yemen", "Zambia", "Zimbabue"}));
																																				}
																																				
																																				JLabel AstBirth = new JLabel("*");
																																				AstBirth.setBounds(87, 74, 26, 27);
																																				panel_3Address.add(AstBirth);
																																				AstBirth.setHorizontalAlignment(SwingConstants.CENTER);
																																				AstBirth.setForeground(Color.RED);
																																			}
																																			{
																																				
																																			}}
}	
	
