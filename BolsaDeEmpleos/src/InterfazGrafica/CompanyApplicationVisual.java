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
import javax.swing.text.MaskFormatter;
import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;

import java.awt.Font;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSpinner;
import javax.swing.JCheckBox;
import javax.swing.SpinnerNumberModel;

import EmploymentMarket01.CollectionCompany;
import EmploymentMarket01.Company;
import EmploymentMarket01.CompanyApplication;
import EmploymentMarket01.CompanyType;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.ParseException;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class CompanyApplicationVisual extends JDialog {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JFormattedTextField formattedTextField;
	private JComboBox comboBox_2;
	private JComboBox comboBoxAreas;
	private JComboBox comboBox_3;
	private JSpinner spinner;
	private JCheckBox checkBox;
	private JComboBox comboBox_4;
	private JLabel label_5;
	private JFormattedTextField formattedTextField_1;
	private JLabel error;
	private JTextField textField_7;
	private JTextField textField_8;

	public CompanyApplicationVisual() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(CompanyApplicationVisual.class.getResource("/InterfazGrafica/Images/1417568890_new-file.png")));
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
		
		label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon(CompanyApplication.class.getResource("/InterfazGrafica/Images/1416396195_Company.png")));
		label_5.setVerticalTextPosition(SwingConstants.BOTTOM);
		label_5.setIgnoreRepaint(true);
		label_5.setIconTextGap(8);
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setForeground(Color.BLACK);
		label_5.setBackground(Color.WHITE);
		label_5.setBounds(0, 0, 140, 127);
		layeredPane.add(label_5);
		
		 MaskFormatter mascara;
			try {
				mascara = new MaskFormatter("###########");
				formattedTextField = new JFormattedTextField(mascara);
				formattedTextField.addFocusListener(new FocusAdapter() {
					@Override
					public void focusLost(FocusEvent arg0) {
						Company temp= new Company();
						temp = CollectionCompany.getInstanceCollectionCompany().getCompany(formattedTextField.getText());
						textField.setText(temp.getName());
						textField_1.setText(temp.getActivity());
						textField_7.setText(temp.getArea());
						textField_8.setText(temp.getSectorWork());
						
					}
				});
				formattedTextField.setBounds(485, 177, 140, 20);
				contentPane.add(formattedTextField);
			
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
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
		textField.setEditable(false);
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
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(152, 55, 212, 20);
		panel.add(textField_1);
		
		JLabel label_3 = new JLabel("Actividad:");
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		label_3.setBounds(31, 64, 100, 14);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("Sector:");
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		label_4.setBounds(31, 123, 100, 14);
		panel.add(label_4);
		
		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBounds(152, 89, 212, 20);
		panel.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBounds(152, 120, 212, 20);
		panel.add(textField_8);
		
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
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			if(compa(formattedTextField.getText())==true){
				CompanyApplication temp= new CompanyApplication();
				temp.setRNC(formattedTextField.getText());
				
			}
			}
		});
		button_1.setIcon(new ImageIcon(CompanyApplication.class.getResource("/InterfazGrafica/Images/Save.png")));
		button_1.setActionCommand("OK");
		panel_2.add(button_1);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancelar.setIcon(new ImageIcon(CompanyApplication.class.getResource("/InterfazGrafica/Images/Delete32.png")));
		btnCancelar.setActionCommand("Cancel");
		panel_2.add(btnCancelar);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Requisitos Laborales", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBackground(new Color(248, 248, 255));
		panel_3.setBounds(10, 231, 374, 230);
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
		
		comboBox_3 = new JComboBox();
		comboBox_3.setToolTipText("<Selecciona>");
		comboBox_3.setBackground(new Color(248, 248, 255));
		comboBox_3.setBounds(150, 90, 212, 20);
		panel_3.add(comboBox_3);
		
		spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(new Integer(1), new Integer(1), null, new Integer(1)));
		spinner.setBounds(150, 121, 116, 20);
		panel_3.add(spinner);
		
		checkBox = new JCheckBox("Ninguno");
		checkBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					spinner.setEnabled(false);
			}
		});
		checkBox.setHorizontalAlignment(SwingConstants.RIGHT);
		checkBox.setBackground(new Color(248, 248, 255));
		checkBox.setBounds(272, 117, 90, 29);
		panel_3.add(checkBox);
		
		JLabel label_12 = new JLabel("Tipo de Contrato:");
		label_12.setHorizontalAlignment(SwingConstants.RIGHT);
		label_12.setBounds(40, 158, 100, 14);
		panel_3.add(label_12);
		
		comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"<Selecciona>", "Fijo ", "Parcial", "Temporal"}));
		comboBox_4.setBounds(150, 152, 212, 20);
		panel_3.add(comboBox_4);
		
		comboBox_2 = new JComboBox();
		comboBox_2.setBounds(150, 28, 212, 20);
		panel_3.add(comboBox_2);
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"<Selecciona>", "Universitario", "T\u00E9cnico", "Oficio"}));
		comboBox_2.setBackground(new Color(248, 248, 255));
		
		JLabel label_8 = new JLabel("Nivel de Estudio:");
		label_8.setBounds(40, 34, 100, 14);
		panel_3.add(label_8);
		label_8.setHorizontalAlignment(SwingConstants.TRAILING);
		
		comboBoxAreas = new JComboBox();
		comboBoxAreas.setBounds(150, 59, 212, 20);
		panel_3.add(comboBoxAreas);
		comboBoxAreas.setModel(new DefaultComboBoxModel(new String[] {"<Selecciona>", "\tAdministraci\u00F3n", " \tAeron\u00E1utica", " \tAgrimensura", " \tAgronom\u00EDa", " \tAgricultura", "\tAlta Gerencia\t", "\tArquitectura", "      \tAtenci\u00F3n al Cliente", "\tBiolog\u00EDa ", "\tCalidad", " \tCiencias Econ\u00F3micas", " \tCiencias Empresariales", " \tCienciasSociales", "\tCompras", " \tComunicaci\u00F3n", "\tConstrucci\u00F3n", " \tContabilidad", " \tCreatividad y Dise\u00F1o", " \tDerecho\t", " \tDise\u00F1o Industrial", "\tDistribuci\u00F3n", "\tDocencia", "\tDocumentaci\u00F3n", " \tElectricidad ", " \tElectr\u00F3nica\t", " \tFarmacia", "\tFilosof\u00EDa", " \tFinanzas", " \tFormaci\u00F3n", " \tGesti\u00F3n", "\tHoteler\u00EDa", "\tHumanidades ", "\tIdiomas", " \tImpuestos", " \tIndustria", " \tInform\u00E1tica", " \tIngenier\u00EDa", " \tIngenier\u00EDa Civil", " \tIngenier\u00EDa El\u00E9ctrica", " \tIngenier\u00EDa Electr\u00F3nica", " \tIngenier\u00EDa Industrial\t", " \tIngenier\u00EDa Mec\u00E1nica\t", " \tIngenier\u00EDa Qu\u00EDmica", " \tIngenier\u00EDa Sanitaria ", " \tIngenier\u00EDa Sistemas", " \tIngenier\u00EDa Telecomunicaciones", " \tInvestigaci\u00F3n de Mercado", " \tLog\u00EDstica", " \tMarketing\t", " \tMedio Ambiente", "\tMedicina", "\tMedios", "\tMultimedia", " \tOficios Diversos", " \tPrevenci\u00F3n de Riesgos", "\tProducci\u00F3n", "\tPsicolog\u00EDa", "\tPublicidad", " \tQuimica", " \tRecepci\u00F3n", " \tRecursos Humanos", " \tSalud", " \tSecretariado", " \tSeguridad", "       Servicios Financieros", " \tSalud Ocupacional", " \tServicios Domesticos", " \tSoporte Tecnico", " \tTelemarketing", " \tTransporte", " \tTurismo", " \tVentas"}));
		comboBoxAreas.setToolTipText("<Selecciona>\r\n\tAdministraci\u00F3n\r\n \tAeron\u00E1utica\r\n \tAgrimensura\r\n \tAgronom\u00EDa\r\n \tAgricultura\t\r\n\tArquitectura\r\n       Atenci\u00F3nAlCliente\r\n       Biblioteconom\u00EDa\r\n\tConstrucci\u00F3n \r\n \tDocumentaci\u00F3n,\t\r\n \tCienciasEcon\u00F3micas,\r\n \tCienciasEmpresariales,\r\n \tCienciasSociales,\r\n \tCompras,\r\n \tComunicaci\u00F3n, \r\n \tPublicidad,\r\n \tMedios,\r\n \tContabilidad,\r\n \tCreatividad, \r\n \tDise\u00F1o, \r\n \tMultimedia,\r\n \tDerecho,\t\r\n \tDise\u00F1oIndustrial,\r\n \tElectricidad, \r\n \tElectr\u00F3nica1,\t\r\n \tFarmacia,\r\n \tFinanzas,\r\n \tFormaci\u00F3n,\r\n \tDocencia,\r\n \tGesti\u00F3n,\r\n \tAltaDirecci\u00F3n,\r\n \tImpuestos,\r\n \tIndustria,\r\n \tProducci\u00F3n,\r\n \tHoteler\u00EDa,\r\n \tCalidad,\r\n \tInform\u00E1tica,\r\n \tIngenier\u00EDa,\r\n \tIngenier\u00EDaCivil\r\n \tEstructural\r\n \tIngenier\u00EDaEl\u00E9ctrica\r\n \tIngenier\u00EDaElectr\u00F3nica\r\n \tIngenier\u00EDaIndustrial\t\r\n \tIngenier\u00EDaMec\u00E1nica\t\r\n \tIngenier\u00EDaQu\u00EDmica\r\n \tIngenier\u00EDaSanitaria \r\n \tAmbiental\r\n \tIngenier\u00EDaSistemas\r\n \tIngenier\u00EDaTelecomunicaciones,\r\n \tInvestigaci\u00F3ndeMercado,\r\n \tLetras, \r\n \tHumanidades, \r\n \tFilosof\u00EDa,\r\n \tLog\u00EDstica, \r\n \tDistribuci\u00F3n,\r\n \tMarketing,\t\r\n \tMedioAmbiente,\r\n \tOficiosdiversos,\r\n \tPrevenci\u00F3ndeRiesgos,\r\n\tPsicolog\u00EDa,\r\n \tQuimica,\r\n \tBiolog\u00EDa,\r\n \tRecepci\u00F3n,\r\n \tCentralita,\r\n \tRecursosHumanos,\r\n \tSalud, \r\n \tMedicina,\r\n \tSecretariado,\r\n \tSeguridad,\r\n       ServiciosFinancieros\r\n \tSaludOcupacional\r\n \tServiciosDomesticos\r\n \tSoporteTecnico\r\n \tTelemarketing\r\n \tIdiomas\r\n \tTransporte\r\n \tTurismo\r\n \tVentas");
		comboBoxAreas.setBackground(new Color(248, 248, 255));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Oferta del Empleo", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBackground(new Color(248, 248, 255));
		panel_1.setBounds(409, 231, 325, 117);
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
		
		JLabel lblCantidadEmpleados = new JLabel("No. empleados:");
		lblCantidadEmpleados.setHorizontalAlignment(SwingConstants.TRAILING);
		lblCantidadEmpleados.setBounds(10, 89, 100, 14);
		panel_1.add(lblCantidadEmpleados);
		
		MaskFormatter mask;
		try {
			mask= new MaskFormatter("###");
			formattedTextField_1 = new JFormattedTextField(mask);
			formattedTextField_1.setBounds(120, 86, 180, 20);
			panel_1.add(formattedTextField_1);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(null, "Contacto", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_4.setBackground(new Color(248, 248, 255));
		panel_4.setBounds(409, 349, 325, 112);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNombre.setBounds(10, 36, 100, 14);
		panel_4.add(lblNombre);
		
		textField_4 = new JTextField();
		textField_4.setBounds(120, 30, 180, 20);
		panel_4.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblMvil = new JLabel("M\u00F3vil:");
		lblMvil.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMvil.setBounds(10, 63, 100, 14);
		panel_4.add(lblMvil);
		
		textField_5 = new JTextField();
		textField_5.setBounds(120, 59, 180, 20);
		panel_4.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(120, 89, 180, 20);
		panel_4.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblPosicin_1 = new JLabel("Posici\u00F3n:");
		lblPosicin_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPosicin_1.setBounds(10, 92, 100, 14);
		panel_4.add(lblPosicin_1);
		
		error = new JLabel("");
		error.setForeground(Color.RED);
		error.setBounds(10, 477, 374, 26);
		contentPane.add(error);
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
}