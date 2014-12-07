package InterfazGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JLayeredPane;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import java.awt.Font;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSpinner;
import javax.swing.JCheckBox;

public class CompanyApplication extends JDialog {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	public CompanyApplication() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(CompanyApplication.class.getResource("/InterfazGrafica/Images/1417568890_new-file.png")));
		setTitle("NUEVA SOLICITUD DE PERSONAL");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(10, 50, 760, 650);
		setModal(true);
		setLocationRelativeTo(rootPane);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(248, 248, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		layeredPane.setBounds(485, 36, 140, 127);
		contentPane.add(layeredPane);
		
		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon(CompanyApplication.class.getResource("/InterfazGrafica/Images/1416396195_Company.png")));
		label_5.setVerticalTextPosition(SwingConstants.BOTTOM);
		label_5.setIgnoreRepaint(true);
		label_5.setIconTextGap(8);
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setForeground(Color.BLACK);
		label_5.setBackground(Color.WHITE);
		label_5.setBounds(0, 0, 140, 127);
		layeredPane.add(label_5);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setBounds(485, 177, 140, 20);
		contentPane.add(formattedTextField);
		
		JLabel label_6 = new JLabel("RNC:");
		label_6.setVerticalAlignment(SwingConstants.BOTTOM);
		label_6.setHorizontalAlignment(SwingConstants.TRAILING);
		label_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_6.setBounds(442, 183, 33, 14);
		contentPane.add(label_6);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "    Datos de la Empresa", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBackground(new Color(248, 248, 255));
		panel.setBounds(10, 36, 374, 172);
		contentPane.add(panel);
		
		JLabel label = new JLabel("Nombre:");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setBounds(31, 30, 100, 14);
		panel.add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(152, 24, 212, 20);
		panel.add(textField);
		
		JLabel label_1 = new JLabel("\u00C1rea Laboral:");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setBounds(31, 92, 100, 14);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("*");
		label_2.setForeground(Color.RED);
		label_2.setBounds(10, 2, 46, 14);
		panel.add(label_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(152, 55, 212, 20);
		panel.add(textField_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(152, 86, 212, 20);
		panel.add(comboBox);
		
		JLabel label_3 = new JLabel("Actividad:");
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		label_3.setBounds(31, 64, 100, 14);
		panel.add(label_3);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(152, 117, 212, 20);
		panel.add(comboBox_1);
		
		JLabel label_4 = new JLabel("Sector:");
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		label_4.setBounds(31, 123, 100, 14);
		panel.add(label_4);
		
		JLabel label_7 = new JLabel("   *");
		label_7.setHorizontalAlignment(SwingConstants.RIGHT);
		label_7.setForeground(Color.RED);
		label_7.setBounds(423, 177, 19, 20);
		contentPane.add(label_7);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(248, 248, 255));
		panel_2.setBounds(0, 550, 754, 51);
		contentPane.add(panel_2);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		JButton button = new JButton("Reiniciar");
		button.setIcon(new ImageIcon(CompanyApplication.class.getResource("/InterfazGrafica/Images/Back.png")));
		panel_2.add(button);
		
		JButton button_1 = new JButton("Guardar");
		button_1.setIcon(new ImageIcon(CompanyApplication.class.getResource("/InterfazGrafica/Images/Save.png")));
		button_1.setActionCommand("OK");
		panel_2.add(button_1);
		
		JButton button_2 = new JButton("Cancel");
		button_2.setIcon(new ImageIcon(CompanyApplication.class.getResource("/InterfazGrafica/Images/Delete32.png")));
		button_2.setActionCommand("Cancel");
		panel_2.add(button_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Requisitos Laborales", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBackground(new Color(248, 248, 255));
		panel_3.setBounds(10, 231, 374, 199);
		contentPane.add(panel_3);
		
		JLabel label_9 = new JLabel("\u00C1rea de Trabajo:");
		label_9.setHorizontalAlignment(SwingConstants.RIGHT);
		label_9.setBounds(40, 62, 100, 14);
		panel_3.add(label_9);
		
		JLabel lblAosExperiencia = new JLabel("A\u00F1os de Experiencia:");
		lblAosExperiencia.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAosExperiencia.setBounds(10, 127, 130, 14);
		panel_3.add(lblAosExperiencia);
		
		JLabel label_11 = new JLabel("Profesi\u00F3n:");
		label_11.setHorizontalAlignment(SwingConstants.RIGHT);
		label_11.setBounds(40, 96, 100, 14);
		panel_3.add(label_11);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setToolTipText("<Selecciona>");
		comboBox_4.setBackground(new Color(248, 248, 255));
		comboBox_4.setBounds(150, 90, 212, 20);
		panel_3.add(comboBox_4);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(150, 121, 116, 20);
		panel_3.add(spinner);
		
		JCheckBox checkBox = new JCheckBox("Ninguno");
		checkBox.setHorizontalAlignment(SwingConstants.RIGHT);
		checkBox.setBackground(new Color(248, 248, 255));
		checkBox.setBounds(272, 117, 90, 29);
		panel_3.add(checkBox);
		
		JLabel label_12 = new JLabel("Tipo de Contrato:");
		label_12.setHorizontalAlignment(SwingConstants.RIGHT);
		label_12.setBounds(40, 158, 100, 14);
		panel_3.add(label_12);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"<Selecciona>", "Fijo ", "Parcial", "Temporal"}));
		comboBox_5.setBounds(150, 152, 212, 20);
		panel_3.add(comboBox_5);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(150, 28, 212, 20);
		panel_3.add(comboBox_2);
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"<Selecciona>", "Universitario", "T\u00E9cnico", "Oficio"}));
		comboBox_2.setBackground(new Color(248, 248, 255));
		
		JLabel label_8 = new JLabel("Nivel de Estudio:");
		label_8.setBounds(40, 34, 100, 14);
		panel_3.add(label_8);
		label_8.setHorizontalAlignment(SwingConstants.TRAILING);
		
		JComboBox comboBoxAreas = new JComboBox();
		comboBoxAreas.setBounds(150, 59, 212, 20);
		panel_3.add(comboBoxAreas);
		comboBoxAreas.setModel(new DefaultComboBoxModel(new String[] {"<Selecciona>", "\tAdministraci\u00F3n", " \tAeron\u00E1utica", " \tAgrimensura", " \tAgronom\u00EDa", " \tAgricultura\t", "\tArquitectura", "       Atenci\u00F3nAlCliente", "       Biblioteconom\u00EDa", "\tConstrucci\u00F3n ", " \tDocumentaci\u00F3n,\t", " \tCienciasEcon\u00F3micas,", " \tCienciasEmpresariales,", " \tCienciasSociales,", " \tCompras,", " \tComunicaci\u00F3n, ", " \tPublicidad,", " \tMedios,", " \tContabilidad,", " \tCreatividad, ", " \tDise\u00F1o, ", " \tMultimedia,", " \tDerecho,\t", " \tDise\u00F1oIndustrial,", " \tElectricidad, ", " \tElectr\u00F3nica1,\t", " \tFarmacia,", " \tFinanzas,", " \tFormaci\u00F3n,", " \tDocencia,", " \tGesti\u00F3n,", " \tAltaDirecci\u00F3n,", " \tImpuestos,", " \tIndustria,", " \tProducci\u00F3n,", " \tHoteler\u00EDa,", " \tCalidad,", " \tInform\u00E1tica,", " \tIngenier\u00EDa,", " \tIngenier\u00EDaCivil", " \tEstructural", " \tIngenier\u00EDaEl\u00E9ctrica", " \tIngenier\u00EDaElectr\u00F3nica", " \tIngenier\u00EDaIndustrial\t", " \tIngenier\u00EDaMec\u00E1nica\t", " \tIngenier\u00EDaQu\u00EDmica", " \tIngenier\u00EDaSanitaria ", " \tAmbiental", " \tIngenier\u00EDaSistemas", " \tIngenier\u00EDaTelecomunicaciones,", " \tInvestigaci\u00F3ndeMercado,", " \tLetras, ", " \tHumanidades, ", " \tFilosof\u00EDa,", " \tLog\u00EDstica, ", " \tDistribuci\u00F3n,", " \tMarketing,\t", " \tMedioAmbiente,", " \tOficiosdiversos,", " \tPrevenci\u00F3ndeRiesgos,", "\tPsicolog\u00EDa,", " \tQuimica,", " \tBiolog\u00EDa,", " \tRecepci\u00F3n,", " \tCentralita,", " \tRecursosHumanos,", " \tSalud, ", " \tMedicina,", " \tSecretariado,", " \tSeguridad,", "       ServiciosFinancieros", " \tSaludOcupacional", " \tServiciosDomesticos", " \tSoporteTecnico", " \tTelemarketing", " \tIdiomas", " \tTransporte", " \tTurismo", " \tVentas"}));
		comboBoxAreas.setToolTipText("<Selecciona>\r\n\tAdministraci\u00F3n\r\n \tAeron\u00E1utica\r\n \tAgrimensura\r\n \tAgronom\u00EDa\r\n \tAgricultura\t\r\n\tArquitectura\r\n       Atenci\u00F3nAlCliente\r\n       Biblioteconom\u00EDa\r\n\tConstrucci\u00F3n \r\n \tDocumentaci\u00F3n,\t\r\n \tCienciasEcon\u00F3micas,\r\n \tCienciasEmpresariales,\r\n \tCienciasSociales,\r\n \tCompras,\r\n \tComunicaci\u00F3n, \r\n \tPublicidad,\r\n \tMedios,\r\n \tContabilidad,\r\n \tCreatividad, \r\n \tDise\u00F1o, \r\n \tMultimedia,\r\n \tDerecho,\t\r\n \tDise\u00F1oIndustrial,\r\n \tElectricidad, \r\n \tElectr\u00F3nica1,\t\r\n \tFarmacia,\r\n \tFinanzas,\r\n \tFormaci\u00F3n,\r\n \tDocencia,\r\n \tGesti\u00F3n,\r\n \tAltaDirecci\u00F3n,\r\n \tImpuestos,\r\n \tIndustria,\r\n \tProducci\u00F3n,\r\n \tHoteler\u00EDa,\r\n \tCalidad,\r\n \tInform\u00E1tica,\r\n \tIngenier\u00EDa,\r\n \tIngenier\u00EDaCivil\r\n \tEstructural\r\n \tIngenier\u00EDaEl\u00E9ctrica\r\n \tIngenier\u00EDaElectr\u00F3nica\r\n \tIngenier\u00EDaIndustrial\t\r\n \tIngenier\u00EDaMec\u00E1nica\t\r\n \tIngenier\u00EDaQu\u00EDmica\r\n \tIngenier\u00EDaSanitaria \r\n \tAmbiental\r\n \tIngenier\u00EDaSistemas\r\n \tIngenier\u00EDaTelecomunicaciones,\r\n \tInvestigaci\u00F3ndeMercado,\r\n \tLetras, \r\n \tHumanidades, \r\n \tFilosof\u00EDa,\r\n \tLog\u00EDstica, \r\n \tDistribuci\u00F3n,\r\n \tMarketing,\t\r\n \tMedioAmbiente,\r\n \tOficiosdiversos,\r\n \tPrevenci\u00F3ndeRiesgos,\r\n\tPsicolog\u00EDa,\r\n \tQuimica,\r\n \tBiolog\u00EDa,\r\n \tRecepci\u00F3n,\r\n \tCentralita,\r\n \tRecursosHumanos,\r\n \tSalud, \r\n \tMedicina,\r\n \tSecretariado,\r\n \tSeguridad,\r\n       ServiciosFinancieros\r\n \tSaludOcupacional\r\n \tServiciosDomesticos\r\n \tSoporteTecnico\r\n \tTelemarketing\r\n \tIdiomas\r\n \tTransporte\r\n \tTurismo\r\n \tVentas");
		comboBoxAreas.setBackground(new Color(248, 248, 255));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Oferta del Empleo", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBackground(new Color(248, 248, 255));
		panel_1.setBounds(409, 231, 325, 85);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblPosicin = new JLabel("Posici\u00F3n:");
		lblPosicin.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPosicin.setBounds(10, 27, 100, 14);
		panel_1.add(lblPosicin);
		
		JLabel lblDepartamento = new JLabel("Departamento:");
		lblDepartamento.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDepartamento.setBounds(10, 58, 100, 14);
		panel_1.add(lblDepartamento);
		
		textField_2 = new JTextField();
		textField_2.setBounds(120, 24, 180, 20);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(120, 55, 180, 20);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(null, "Contacto", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_4.setBackground(new Color(248, 248, 255));
		panel_4.setBounds(409, 323, 325, 107);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNombre.setBounds(10, 25, 100, 14);
		panel_4.add(lblNombre);
		
		textField_4 = new JTextField();
		textField_4.setBounds(120, 19, 180, 20);
		panel_4.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblMvil = new JLabel("M\u00F3vil:");
		lblMvil.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMvil.setBounds(10, 52, 100, 14);
		panel_4.add(lblMvil);
		
		textField_5 = new JTextField();
		textField_5.setBounds(120, 48, 180, 20);
		panel_4.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(120, 78, 180, 20);
		panel_4.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblPosicin_1 = new JLabel("Posici\u00F3n:");
		lblPosicin_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPosicin_1.setBounds(10, 81, 100, 14);
		panel_4.add(lblPosicin_1);
	}
}