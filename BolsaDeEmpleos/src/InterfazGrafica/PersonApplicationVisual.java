package InterfazGrafica;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import EmploymentMarket01.CollectionPersonApplicant;
import EmploymentMarket01.PersonApplication;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;

import EmploymentMarket01.CollectionPerson;

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
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JFormattedTextField;
import EmploymentMarket01.CompanyType;
import javax.swing.text.MaskFormatter;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;



public class PersonApplicationVisual extends JDialog {

	private JPanel contentPane;
	private JTextField textFieldName;
	private JTextField textFieldLastName;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_ID;
	private JFormattedTextField textField;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JComboBox comboBox_2;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JSpinner spinner;
	private JCheckBox CheckBoxNinguno;
	private JLabel error;
	private JTextField textField_12;

	public PersonApplicationVisual() {
		setFont(new Font("Tahoma", Font.BOLD, 12));
		setIconImage(Toolkit.getDefaultToolkit().getImage(PersonApplicationVisual.class.getResource("/InterfazGrafica/Images/1417568890_new-file.png")));
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
		textFieldName.setEditable(false);
		textFieldName.setColumns(10);
		textFieldName.setBounds(150, 24, 223, 20);
		panelPersonalDates.add(textFieldName);
		
		textFieldLastName = new JTextField();
		textFieldLastName.setEditable(false);
		textFieldLastName.setColumns(10);
		textFieldLastName.setBounds(150, 48, 223, 20);
		panelPersonalDates.add(textFieldLastName);
		
		JLabel labelBirth = new JLabel("Fecha de Nacimiento:");
		labelBirth.setHorizontalAlignment(SwingConstants.TRAILING);
		labelBirth.setBounds(0, 71, 140, 20);
		panelPersonalDates.add(labelBirth);
		
		JLabel labelNationality = new JLabel("Nacionalidad:");
		labelNationality.setHorizontalAlignment(SwingConstants.TRAILING);
		labelNationality.setBounds(10, 95, 130, 20);
		panelPersonalDates.add(labelNationality);
		JLayeredPane layeredPanePicture = new JLayeredPane();
		layeredPanePicture.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		layeredPanePicture.setBounds(556, 53, 139, 139);
		contentPane.add(layeredPanePicture);
		
		
		final JLabel labelMalePicture = new JLabel("");
		labelMalePicture.setBounds(10, 0, 119, 139);
		layeredPanePicture.add(labelMalePicture);
		labelMalePicture.setIcon(new ImageIcon(PersonApplication.class.getResource("/InterfazGrafica/Images/malePicture.jpg")));
		labelMalePicture.setVerticalTextPosition(SwingConstants.BOTTOM);
		labelMalePicture.setIgnoreRepaint(true);
		labelMalePicture.setIconTextGap(8);
		labelMalePicture.setHorizontalAlignment(SwingConstants.CENTER);
		labelMalePicture.setForeground(Color.BLACK);
		labelMalePicture.setBackground(Color.WHITE);
		
		final JLabel labelFeMalePicture = new JLabel("");
		labelFeMalePicture.setIcon(new ImageIcon(PersonApplication.class.getResource("/InterfazGrafica/Images/femalePicture.jpg")));
		labelFeMalePicture.setVerticalTextPosition(SwingConstants.BOTTOM);
		labelFeMalePicture.setIgnoreRepaint(true);
		labelFeMalePicture.setIconTextGap(8);
		labelFeMalePicture.setHorizontalAlignment(SwingConstants.CENTER);
		labelFeMalePicture.setForeground(Color.BLACK);
		labelFeMalePicture.setBackground(Color.WHITE);
		labelFeMalePicture.setBounds(0, 0, 140, 139);
		layeredPanePicture.add(labelFeMalePicture);
		
		
		JLabel labelSexo = new JLabel("Sexo:");
		labelSexo.setHorizontalAlignment(SwingConstants.TRAILING);
		labelSexo.setBounds(10, 119, 130, 20);
		panelPersonalDates.add(labelSexo);
		
		JLabel labelCivilState = new JLabel("Estado Civil:");
		labelCivilState.setHorizontalAlignment(SwingConstants.TRAILING);
		labelCivilState.setBounds(10, 143, 130, 20);
		panelPersonalDates.add(labelCivilState);
		
		
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
		
		textField_7 = new JTextField();
				textField_7.setEditable(false);
				textField_7.setColumns(10);
				textField_7.setBounds(150, 71, 223, 20);
				panelPersonalDates.add(textField_7);
				
				textField_8 = new JTextField();
				textField_8.setEditable(false);
				textField_8.setColumns(10);
				textField_8.setBounds(150, 95, 223, 20);
				panelPersonalDates.add(textField_8);
				
				textField_9 = new JTextField();
				textField_9.setEditable(false);
				textField_9.setColumns(10);
				textField_9.setBounds(150, 119, 223, 20);
				panelPersonalDates.add(textField_9);
				
				textField_10 = new JTextField();
				textField_10.setEditable(false);
				textField_10.setColumns(10);
				textField_10.setBounds(150, 143, 223, 20);
				panelPersonalDates.add(textField_10);
				
				textField_11 = new JTextField();
				textField_11.setEditable(false);
				textField_11.setColumns(10);
				textField_11.setBounds(150, 168, 223, 20);
				panelPersonalDates.add(textField_11);
				
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
		
		comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"<Selecciona>", "\tAdministraci\u00F3n", " \tAeron\u00E1utica", " \tAgrimensura", " \tAgronom\u00EDa", " \tAgricultura", "\tAlta Gerencia\t", "\tArquitectura", "      \tAtenci\u00F3n al Cliente", "\tBiolog\u00EDa ", "\tCalidad", " \tCiencias Econ\u00F3micas", " \tCiencias Empresariales", " \tCienciasSociales", "\tCompras", " \tComunicaci\u00F3n", "\tConstrucci\u00F3n", " \tContabilidad", " \tCreatividad y Dise\u00F1o", " \tDerecho\t", " \tDise\u00F1o Industrial", "\tDistribuci\u00F3n", "\tDocencia", "\tDocumentaci\u00F3n", " \tElectricidad ", " \tElectr\u00F3nica\t", " \tFarmacia", "\tFilosof\u00EDa", " \tFinanzas", " \tFormaci\u00F3n", " \tGesti\u00F3n", "\tHoteler\u00EDa", "\tHumanidades ", "\tIdiomas", " \tImpuestos", " \tIndustria", " \tInform\u00E1tica", " \tIngenier\u00EDa", " \tIngenier\u00EDa Civil", " \tIngenier\u00EDa El\u00E9ctrica", " \tIngenier\u00EDa Electr\u00F3nica", " \tIngenier\u00EDa Industrial\t", " \tIngenier\u00EDa Mec\u00E1nica\t", " \tIngenier\u00EDa Qu\u00EDmica", " \tIngenier\u00EDa Sanitaria ", " \tIngenier\u00EDa Sistemas", " \tIngenier\u00EDa Telecomunicaciones", " \tInvestigaci\u00F3n de Mercado", " \tLog\u00EDstica", " \tMarketing\t", " \tMedio Ambiente", "\tMedicina", "\tMedios", "\tMultimedia", " \tOficios Diversos", " \tPrevenci\u00F3n de Riesgos", "\tProducci\u00F3n", "\tPsicolog\u00EDa", "\tPublicidad", " \tQuimica", " \tRecepci\u00F3n", " \tRecursos Humanos", " \tSalud", " \tSecretariado", " \tSeguridad", "       Servicios Financieros", " \tSalud Ocupacional", " \tServicios Domesticos", " \tSoporte Tecnico", " \tTelemarketing", " \tTransporte", " \tTurismo", " \tVentas"}));
		comboBox_2.setToolTipText("<Selecciona>");
		comboBox_2.setBackground(new Color(248, 248, 255));
		comboBox_2.setBounds(150, 21, 212, 20);
		panel.add(comboBox_2);
		
		JLabel label_13 = new JLabel("A\u00F1os de Experiencia:");
		label_13.setHorizontalAlignment(SwingConstants.RIGHT);
		label_13.setBounds(10, 87, 130, 14);
		panel.add(label_13);
		
		JLabel lblProfesin = new JLabel("Profesi\u00F3n:");
		lblProfesin.setHorizontalAlignment(SwingConstants.RIGHT);
		lblProfesin.setBounds(56, 57, 84, 14);
		panel.add(lblProfesin);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"<Selecciona>", "Abogado", "Agente de Aduanas", "Agente de Prensa", "Alba\u00F1il", "Artesano", "Asesor de Imagen ", "Asesor Financiero", "Auditor", "Bi\u00F3logo", "Bot\u00E1nico", "Cajero", "Cartero ", "Cerrajero ", "Compositor ", "Conductor", "Conserje"}));
		comboBox.setEditable(true);
		comboBox.setToolTipText("<Selecciona>");
		comboBox.setBackground(new Color(248, 248, 255));
		comboBox.setBounds(150, 51, 212, 20);
		panel.add(comboBox);
		
		final JSpinner spinner = new JSpinner();		
		spinner.setModel(new SpinnerNumberModel(new Integer(1), new Integer(1), null, new Integer(1)));
		spinner.setBounds(150, 81, 116, 20);
		panel.add(spinner);
		
	    JCheckBox CheckBoxNinguno = new JCheckBox("Ninguno");
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
		
		final JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBackground(new Color(248, 248, 255));
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
		
		
		textField_ID = new JTextField();
		textField_ID.setBounds(555, 207, 140, 20);
		 contentPane.add(textField_ID);
		 textField_ID.setColumns(10);
		
		 JButton button = new JButton("Auto-llenado");
		 button.addActionListener(new ActionListener() {
		 public void actionPerformed(ActionEvent arg0) {
		 for(int i=0; i<CollectionPerson.getInstanceCollectionPerson().getCantPerson(); i++)
		 if(CollectionPerson.getInstanceCollectionPerson().getPerson(i).getID().equals(textField_ID.getText())){
		 textFieldName.setText(CollectionPerson.getInstanceCollectionPerson().getPerson(i).getName());
		 textFieldLastName.setText(CollectionPerson.getInstanceCollectionPerson().getPerson(i).getLastName());
		 
		 textField_7.setText(CollectionPerson.getInstanceCollectionPerson().getPerson(i).getBirth());
		 	 textField_8.setText(CollectionPerson.getInstanceCollectionPerson().getPerson(i).getNationality());
		 	 textField_9.setText(CollectionPerson.getInstanceCollectionPerson().getPerson(i).getSex());
		 	 textField_10.setText(CollectionPerson.getInstanceCollectionPerson().getPerson(i).getCivilState());
		 	 textField_11.setText(CollectionPerson.getInstanceCollectionPerson().getPerson(i).getAcademicLevel());
		  		
		
		 }
		 }
		 });
		 button.setBounds(556, 233, 139, 23);
		 contentPane.add(button);
		 
		
		
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
		
		MaskFormatter mascara;
					try {
						mascara = new MaskFormatter("##########");
						textField = new JFormattedTextField(mascara);
						 textField.setBounds(140, 24, 223, 20);;
						 textField.setColumns(10);
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

		
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
		
		textField_12 = new JTextField();
		textField_12.setBounds(140, 27, 223, 20);
		panelRefPersonales.add(textField_12);
		textField_12.setColumns(10);
		
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
		buttonReiniciar.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
						}
					});
		buttonReiniciar.setIcon(new ImageIcon(PersonApplication.class.getResource("/InterfazGrafica/Images/Back.png")));
		Buttonpanel.add(buttonReiniciar);
		
		JButton buttonSafe = new JButton("Guardar");
		buttonSafe.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							//if(textField_ID)
							if((compa(textField_ID.getText())==true)&&(comboBox_2.getSelectedItem().toString()!="<Selecciona>")&&
													(comboBox.getSelectedItem().toString()!="<Selecciona>")){
														PersonApplication temp= new PersonApplication(CollectionPerson.getInstanceCollectionPerson().getPerson(textField_ID.getText()));
														temp.setNamePer(textField_1.getText());
														temp.setEmailPer(textField_6.getText());
													temp.setNameLab(textField_2.getText());
														temp.setMobileLab(textField_3.getText());
														temp.setCompanyLab(textField_4.getText());
														temp.setPosLab(textField_5.getText());
														temp.setArea(comboBox_2.getSelectedItem().toString());
														temp.setTitle(comboBox.getSelectedItem().toString());
														temp.setContract(comboBox_1.getSelectedItem().toString());;
														CollectionPersonApplicant.getInstanceCollectionPersonApplicant().setPersonApplicantions(temp);
														error.setText("Su registro fue realizado correctamente");
													}
						}
					});
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
		
		error = new JLabel("");
			error.setForeground(Color.RED);
				error.setBounds(20, 595, 392, 20);
				contentPane.add(error);
	}	
	protected void reiniciar(JLabel textFieldRegion) {
				// TODO Auto-generated method stub
				textFieldName.setText("");
				textFieldLastName.setText("");
				//comboBoxArea.setSelectedItem(CompanyType.Selecciona);
				textField_7.setText("");
				textField_8.setText("");
				textField_9.setText("");
				textField_10.setText("");
				textField_11.setText("");
				//formattedTextFieldPostal.setText("");
				//textFieldWeb.setText("");
			//	comboBoxCountry.setSelectedItem("<Selecciona>");
				//comboBoxSector.setSelectedItem("<Selecciona>");
				//textFieldRegion.setText("");
				//textFieldCity.setText("");
				//textFieldRoad.setText("");	
				//error.setText("");
				textField_1.setText("");
						textField_6.setText("");
						comboBox.setSelectedItem("<Selecciona>");
						comboBox_1.setSelectedItem("<Selecciona>");
						textField_2.setText("");
						textField_3.setText("");
						textField_4.setText("");
						textField_5.setText("");
						textField_ID.setText("");
						spinner.setValue(1);
						CheckBoxNinguno.setDisabledIcon(null);
						error.setText("");
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