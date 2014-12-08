package InterfazGrafica;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;

import com.toedter.calendar.JMonthChooser;
import com.toedter.calendar.JYearChooser;
import com.toedter.components.JSpinField;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JSpinner;
import javax.swing.JLayeredPane;
import javax.swing.border.LineBorder;

import com.toedter.calendar.JDateChooser;

import java.awt.Rectangle;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JToolBar;
import javax.swing.JButton;

import java.awt.Window.Type;
import java.awt.ComponentOrientation;
import javax.swing.SpinnerNumberModel;



public class PersonApplication extends JDialog {

	private JPanel contentPane;
	private JTextField textFieldName;
	private JTextField textFieldLastName;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	public PersonApplication() {
		setFont(new Font("Tahoma", Font.BOLD, 12));
		setIconImage(Toolkit.getDefaultToolkit().getImage(PersonApplication.class.getResource("/InterfazGrafica/Images/1417568890_new-file.png")));
		setTitle("NUEVA SOLICITUD DE EMPLEO");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(10, 50, 836, 714);
		setLocationRelativeTo(rootPane);
		setModal(true);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(248, 248, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelPersonalDates = new JPanel();
		panelPersonalDates.setLayout(null);
		panelPersonalDates.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "     Datos Personales:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelPersonalDates.setBackground(new Color(248, 248, 255));
		panelPersonalDates.setBounds(20, 36, 392, 200);
		contentPane.add(panelPersonalDates);
		
		textFieldName = new JTextField();
		textFieldName.setColumns(10);
		textFieldName.setBounds(150, 24, 223, 20);
		panelPersonalDates.add(textFieldName);
		
		textFieldLastName = new JTextField();
		textFieldLastName.setColumns(10);
		textFieldLastName.setBounds(150, 48, 223, 20);
		panelPersonalDates.add(textFieldLastName);
		
		JLabel labelBirth = new JLabel("Fecha de Nacimiento:");
		labelBirth.setHorizontalAlignment(SwingConstants.TRAILING);
		labelBirth.setBounds(0, 71, 140, 20);
		panelPersonalDates.add(labelBirth);
		
		JComboBox comboBoxNationality = new JComboBox();
		comboBoxNationality.setModel(new DefaultComboBoxModel(new String[] {"<Selecciona>", "Afgano", "Alem\u00E1n", "Americano", "Argentino", "Australiano", "Austriaco", "Belga", "Boliviano", "Brasile\u00F1o", "Brit\u00E1nico", "B\u00FAlgaro", "Canadiense", "Chileno", "Chino", "Colombiano", "Coreano", "Costarricense", "Cubano", "Checo", "Dan\u00E9s", "Dominicano", "Ecuatoriano", "Egipcio", "Escoc\u00E9s", "Espa\u00F1ol", "Filipino", "Finland\u00E9s", "Franc\u00E9s", "Gal\u00E9s", "Griego", "Groenland\u00E9s", "Guatemalteco", "Haitiano", "Hawaiano", "Holand\u00E9s", "Hondure\u00F1o", "H\u00FAngaro", "Ingl\u00E9s", "Island\u00E9s", "Indio", "Indonesio", "Iran\u00ED", "Iraqu\u00ED", "Irland\u00E9s", "Israel\u00ED", "Italiano", "Jamaiquino", "Japon\u00E9s", "Liban\u00E9s", "Malasio", "Malt\u00E9s", "Mexicano", "Marroqu\u00ED", "Nepal\u00E9s", "Neozeland\u00E9s", "Nicarag\u00FCense", "Nigeriano", "Noruego", "Pakistan\u00ED", "Palestino", "Paname\u00F1o", "Paraguayo", "Peruano", "Polaco", "Portugu\u00E9s", "Puertorrique\u00F1o", "Rumano", "Ruso", "Saudita", "Singapurence", "Sueco", "Suizp", "Sirio", "Tahitiano", "Tailand\u00E9s", "Tunecino", "Turco", "Ucranio", "Uruguayo", "Venezolano", "Vietnamita", "Yugoslavo"}));
		comboBoxNationality.setBackground(new Color(248, 248, 255));
		comboBoxNationality.setBounds(150, 95, 223, 20);
		panelPersonalDates.add(comboBoxNationality);
		
		JLabel labelNationality = new JLabel("Nacionalidad:");
		labelNationality.setHorizontalAlignment(SwingConstants.TRAILING);
		labelNationality.setBounds(10, 95, 130, 20);
		panelPersonalDates.add(labelNationality);
		
		JComboBox comboBoxSex = new JComboBox();
		comboBoxSex.setModel(new DefaultComboBoxModel(new String[] {"<Selecciona>", "Femenino", "Masculino"}));
		comboBoxSex.setBackground(new Color(248, 248, 255));
		comboBoxSex.setBounds(150, 119, 223, 20);
		panelPersonalDates.add(comboBoxSex);
		
		JLabel labelSexo = new JLabel("Sexo:");
		labelSexo.setHorizontalAlignment(SwingConstants.TRAILING);
		labelSexo.setBounds(10, 119, 130, 20);
		panelPersonalDates.add(labelSexo);
		
		JLabel labelCivilState = new JLabel("Estado Civil:");
		labelCivilState.setHorizontalAlignment(SwingConstants.TRAILING);
		labelCivilState.setBounds(10, 143, 130, 20);
		panelPersonalDates.add(labelCivilState);
		
		JComboBox comboBoxCivilState = new JComboBox();
		comboBoxCivilState.setModel(new DefaultComboBoxModel(new String[] {"<Selecciona>", "Soltero", "Casado", "Dirvorciado", "Viudo", "Comprometido", "Otro"}));
		comboBoxCivilState.setBackground(new Color(248, 248, 255));
		comboBoxCivilState.setBounds(150, 143, 223, 20);
		panelPersonalDates.add(comboBoxCivilState);
		
		JComboBox comboBoxStudyLevel = new JComboBox();
		comboBoxStudyLevel.setModel(new DefaultComboBoxModel(new String[] {"<Selecciona>", "Universitario", "T\u00E9cnico", "Oficio"}));
		comboBoxStudyLevel.setBackground(new Color(248, 248, 255));
		comboBoxStudyLevel.setBounds(150, 167, 223, 20);
		panelPersonalDates.add(comboBoxStudyLevel);
		
		JLabel labelStudyLevel = new JLabel("Nivel de Estudio:");
		labelStudyLevel.setHorizontalAlignment(SwingConstants.TRAILING);
		labelStudyLevel.setBounds(10, 174, 130, 14);
		panelPersonalDates.add(labelStudyLevel);
		
		JLabel labelName = new JLabel("Nombres:");
		labelName.setVerticalAlignment(SwingConstants.BOTTOM);
		labelName.setHorizontalAlignment(SwingConstants.TRAILING);
		labelName.setBounds(10, 27, 130, 14);
		panelPersonalDates.add(labelName);
		
		JLabel labelLastName = new JLabel("Apellidos:");
		labelLastName.setVerticalAlignment(SwingConstants.BOTTOM);
		labelLastName.setHorizontalAlignment(SwingConstants.TRAILING);
		labelLastName.setBounds(10, 51, 130, 14);
		panelPersonalDates.add(labelLastName);
		
		JLabel label_5 = new JLabel("*");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_5.setForeground(new Color(255, 0, 0));
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setBounds(0, 0, 30, 14);
		panelPersonalDates.add(label_5);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(150, 71, 223, 20);
		panelPersonalDates.add(dateChooser);
		
		JLabel label_7 = new JLabel("ID");
		label_7.setVerticalAlignment(SwingConstants.BOTTOM);
		label_7.setHorizontalAlignment(SwingConstants.TRAILING);
		label_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_7.setBounds(526, 210, 19, 14);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("   *");
		label_8.setHorizontalAlignment(SwingConstants.RIGHT);
		label_8.setForeground(Color.RED);
		label_8.setBounds(509, 210, 15, 14);
		contentPane.add(label_8);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(null, "Experiencia Laboral", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBackground(new Color(248, 248, 255));
		panel.setBounds(422, 267, 372, 160);
		contentPane.add(panel);
		
		JLabel label_12 = new JLabel("\u00C1rea de Trabajo:");
		label_12.setHorizontalAlignment(SwingConstants.RIGHT);
		label_12.setBounds(10, 27, 130, 14);
		panel.add(label_12);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"<Selecciona>", "\tAdministraci\u00F3n", " \tAeron\u00E1utica", " \tAgrimensura", " \tAgronom\u00EDa", " \tAgricultura", "\tAlta Gerencia\t", "\tArquitectura", "      \tAtenci\u00F3n al Cliente", "\tBiolog\u00EDa ", "\tCalidad", " \tCiencias Econ\u00F3micas", " \tCiencias Empresariales", " \tCienciasSociales", "\tCompras", " \tComunicaci\u00F3n", "\tConstrucci\u00F3n", " \tContabilidad", " \tCreatividad y Dise\u00F1o", " \tDerecho\t", " \tDise\u00F1o Industrial", "\tDistribuci\u00F3n", "\tDocencia", "\tDocumentaci\u00F3n", " \tElectricidad ", " \tElectr\u00F3nica\t", " \tFarmacia", "\tFilosof\u00EDa", " \tFinanzas", " \tFormaci\u00F3n", " \tGesti\u00F3n", "\tHoteler\u00EDa", "\tHumanidades ", "\tIdiomas", " \tImpuestos", " \tIndustria", " \tInform\u00E1tica", " \tIngenier\u00EDa", " \tIngenier\u00EDa Civil", " \tIngenier\u00EDa El\u00E9ctrica", " \tIngenier\u00EDa Electr\u00F3nica", " \tIngenier\u00EDa Industrial\t", " \tIngenier\u00EDa Mec\u00E1nica\t", " \tIngenier\u00EDa Qu\u00EDmica", " \tIngenier\u00EDa Sanitaria ", " \tIngenier\u00EDa Sistemas", " \tIngenier\u00EDa Telecomunicaciones", " \tInvestigaci\u00F3n de Mercado", " \tLog\u00EDstica", " \tMarketing\t", " \tMedio Ambiente", "\tMedicina", "\tMedios", "\tMultimedia", " \tOficios Diversos", " \tPrevenci\u00F3n de Riesgos", "\tProducci\u00F3n", "\tPsicolog\u00EDa", "\tPublicidad", " \tQuimica", " \tRecepci\u00F3n", " \tRecursos Humanos", " \tSalud", " \tSecretariado", " \tSeguridad", "       Servicios Financieros", " \tSalud Ocupacional", " \tServicios Domesticos", " \tSoporte Tecnico", " \tTelemarketing", " \tTransporte", " \tTurismo", " \tVentas"}));
		comboBox_4.setToolTipText("<Selecciona>");
		comboBox_4.setBackground(new Color(248, 248, 255));
		comboBox_4.setBounds(150, 21, 212, 20);
		panel.add(comboBox_4);
		
		JLabel label_13 = new JLabel("A\u00F1os de Experiencia:");
		label_13.setHorizontalAlignment(SwingConstants.RIGHT);
		label_13.setBounds(10, 87, 130, 14);
		panel.add(label_13);
		
		JLabel lblProfesin = new JLabel("Profesi\u00F3n:");
		lblProfesin.setHorizontalAlignment(SwingConstants.RIGHT);
		lblProfesin.setBounds(56, 60, 84, 14);
		panel.add(lblProfesin);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("<Selecciona>");
		comboBox.setBackground(new Color(248, 248, 255));
		comboBox.setBounds(150, 51, 212, 20);
		panel.add(comboBox);
		
		final JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(new Integer(1), new Integer(1), null, new Integer(1)));
		spinner.setBounds(150, 81, 116, 20);
		panel.add(spinner);
		
		final JCheckBox CheckBoxNinguno = new JCheckBox("Ninguno");
		CheckBoxNinguno.setBackground(new Color(248, 248, 255));
		CheckBoxNinguno.setHorizontalAlignment(SwingConstants.RIGHT);
		CheckBoxNinguno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Arg0) {
				
				spinner.setEnabled(false);
			}
		});
		 
		spinner.setEnabled(true);
		
		CheckBoxNinguno.setBounds(272, 81, 90, 23);
		panel.add(CheckBoxNinguno);
		
		JLabel lblTipoDeContrato = new JLabel("Tipo de Contrato:");
		lblTipoDeContrato.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTipoDeContrato.setBounds(10, 118, 130, 14);
		panel.add(lblTipoDeContrato);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"<Selecciona>", "Fijo ", "Parcial", "Temporal"}));
		comboBox_1.setBounds(150, 111, 212, 20);
		panel.add(comboBox_1);
		
		JLabel label = new JLabel("*");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setForeground(new Color(255, 0, 0));
		label.setBounds(10, 27, 33, 14);
		panel.add(label);
		
		JLabel label_1 = new JLabel("*");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setForeground(Color.RED);
		label_1.setBounds(43, 60, 33, 14);
		panel.add(label_1);
		
		JLayeredPane layeredPanePicture = new JLayeredPane();
		layeredPanePicture.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		layeredPanePicture.setBounds(556, 53, 139, 139);
		contentPane.add(layeredPanePicture);
		
		JLabel labelPicture = new JLabel("");
		labelPicture.setBounds(10, 0, 119, 139);
		layeredPanePicture.add(labelPicture);
		labelPicture.setIcon(new ImageIcon(PersonApplication.class.getResource("/InterfazGrafica/Images/malePicture.jpg")));
		labelPicture.setVerticalTextPosition(SwingConstants.BOTTOM);
		labelPicture.setIgnoreRepaint(true);
		labelPicture.setIconTextGap(8);
		labelPicture.setHorizontalAlignment(SwingConstants.CENTER);
		labelPicture.setForeground(Color.BLACK);
		labelPicture.setBackground(Color.WHITE);
		
		JLayeredPane layeredPaneID = new JLayeredPane();
		layeredPaneID.setBorder(new LineBorder(new Color(0, 0, 0)));
		layeredPaneID.setBounds(555, 206, 140, 17);
		contentPane.add(layeredPaneID);
		
		JLabel labelID = new JLabel("");
		labelID.setBounds(-10, 0, 140, 17);
		layeredPaneID.add(labelID);
		labelID.setBackground(new Color(255, 255, 255));
		
		JPanel panelReferencias = new JPanel();
		panelReferencias.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Referencias ", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelReferencias.setBackground(new Color(248, 248, 255));
		panelReferencias.setBounds(20, 267, 392, 328);
		contentPane.add(panelReferencias);
		panelReferencias.setLayout(null);
		
		JPanel panelRefPersonales = new JPanel();
		panelRefPersonales.setBorder(new TitledBorder(null, "Personales", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelRefPersonales.setBackground(new Color(248, 248, 255));
		panelRefPersonales.setBounds(10, 27, 372, 133);
		panelReferencias.add(panelRefPersonales);
		panelRefPersonales.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNombre.setBounds(10, 30, 120, 14);
		panelRefPersonales.add(lblNombre);
		
		textField = new JTextField();
		textField.setBounds(140, 24, 223, 20);
		panelRefPersonales.add(textField);
		textField.setColumns(10);
		
		JLabel lblCelular = new JLabel("M\u00F3vil:");
		lblCelular.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCelular.setBounds(10, 58, 120, 14);
		panelRefPersonales.add(lblCelular);
		
		textField_1 = new JTextField();
		textField_1.setBounds(140, 54, 223, 20);
		panelRefPersonales.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setBounds(10, 90, 120, 14);
		panelRefPersonales.add(lblEmail);
		
		textField_6 = new JTextField();
		textField_6.setBounds(140, 85, 223, 20);
		panelRefPersonales.add(textField_6);
		textField_6.setColumns(10);
		
		JPanel panelRefLaborales = new JPanel();
		panelRefLaborales.setBorder(new TitledBorder(null, "Laborales", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelRefLaborales.setBackground(new Color(248, 248, 255));
		panelRefLaborales.setBounds(10, 172, 372, 145);
		panelReferencias.add(panelRefLaborales);
		panelRefLaborales.setLayout(null);
		
		JLabel lblEmpresa = new JLabel("Nombre:");
		lblEmpresa.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmpresa.setBounds(10, 30, 120, 14);
		panelRefLaborales.add(lblEmpresa);
		
		JLabel lblMvil = new JLabel("M\u00F3vil:");
		lblMvil.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMvil.setBounds(10, 58, 120, 14);
		panelRefLaborales.add(lblMvil);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(140, 24, 223, 20);
		panelRefLaborales.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(140, 52, 223, 20);
		panelRefLaborales.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblEmpresa_1 = new JLabel("Empresa:");
		lblEmpresa_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmpresa_1.setBounds(10, 89, 120, 14);
		panelRefLaborales.add(lblEmpresa_1);
		
		textField_4 = new JTextField();
		textField_4.setBounds(140, 83, 223, 20);
		panelRefLaborales.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblCargo = new JLabel("Cargo:");
		lblCargo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCargo.setBounds(10, 120, 120, 14);
		panelRefLaborales.add(lblCargo);
		
		textField_5 = new JTextField();
		textField_5.setBounds(140, 114, 223, 20);
		panelRefLaborales.add(textField_5);
		textField_5.setColumns(10);
		
		JPanel Buttonpanel = new JPanel();
		Buttonpanel.setBackground(new Color(248, 248, 255));
		Buttonpanel.setBounds(10, 614, 820, 51);
		contentPane.add(Buttonpanel);
		Buttonpanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		JButton buttonReiniciar = new JButton("Reiniciar");
		buttonReiniciar.setIcon(new ImageIcon(PersonApplication.class.getResource("/InterfazGrafica/Images/Back.png")));
		Buttonpanel.add(buttonReiniciar);
		
		JButton buttonSafe = new JButton("Guardar");
		buttonSafe.setIcon(new ImageIcon(PersonApplication.class.getResource("/InterfazGrafica/Images/Save.png")));
		buttonSafe.setActionCommand("OK");
		Buttonpanel.add(buttonSafe);
		
		JButton buttonClose = new JButton("Cancelar");
		buttonClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		buttonClose.setIcon(new ImageIcon(PersonApplication.class.getResource("/InterfazGrafica/Images/Delete32.png")));
		buttonClose.setActionCommand("Cancel");
		Buttonpanel.add(buttonClose);
	}	
}