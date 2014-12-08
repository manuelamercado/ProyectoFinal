package InterfazGrafica;

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

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JSpinner;
import javax.swing.JLayeredPane;
import javax.swing.border.LineBorder;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;

import javax.swing.SpinnerNumberModel;

import javax.swing.JFormattedTextField;

import javax.swing.text.MaskFormatter;

import java.text.ParseException;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;



public class PersonApplicationVisual extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5944196022595935799L;
	private JPanel contentPane;
	private JTextField textFieldName;
	private JTextField textFieldLastName;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JFormattedTextField textField;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JComboBox<String> comboBox_2;
	private JComboBox<String> comboBox;
	private JLabel error;
	private JTextField textField_12;
	private JCheckBox CheckBoxNinguno_1;
	private JComboBox<String> comboBox_3;
	private JSpinner spinner_1;
	private JFormattedTextField formattedTextField;

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
		
		final JLabel labelFemalePicture = new JLabel("");
		labelFemalePicture.setIcon(new ImageIcon(PersonApplicationVisual.class.getResource("/InterfazGrafica/Images/femalePicture.jpg")));
		 labelFemalePicture.setVerticalTextPosition(SwingConstants.BOTTOM);
		 labelFemalePicture.setIgnoreRepaint(true);
		 labelFemalePicture.setIconTextGap(8);
		 labelFemalePicture.setHorizontalAlignment(SwingConstants.CENTER);
		 labelFemalePicture.setForeground(Color.BLACK);
		labelFemalePicture.setBackground(Color.WHITE);
		 labelFemalePicture.setBounds(0, 0, 140, 139);
		 layeredPanePicture.add(labelFemalePicture);
		
		
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
				
		JLabel lblId = new JLabel("ID:");
		lblId.setVerticalAlignment(SwingConstants.BOTTOM);
		lblId.setHorizontalAlignment(SwingConstants.TRAILING);
		lblId.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblId.setBounds(526, 210, 19, 14);
		contentPane.add(lblId);
		
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
		
		comboBox_2 = new JComboBox<String>();
		comboBox_2.setModel(new DefaultComboBoxModel<String>(new String[] {"<Selecciona>", "\tAdministraci\u00F3n", " \tAeron\u00E1utica", " \tAgrimensura", " \tAgronom\u00EDa", " \tAgricultura", "\tAlta Gerencia\t", "\tArquitectura", "      \tAtenci\u00F3n al Cliente", "\tBiolog\u00EDa ", "\tCalidad", " \tCiencias Econ\u00F3micas", " \tCiencias Empresariales", " \tCienciasSociales", "\tCompras", " \tComunicaci\u00F3n", "\tConstrucci\u00F3n", " \tContabilidad", " \tCreatividad y Dise\u00F1o", " \tDerecho\t", " \tDise\u00F1o Industrial", "\tDistribuci\u00F3n", "\tDocencia", "\tDocumentaci\u00F3n", " \tElectricidad ", " \tElectr\u00F3nica\t", " \tFarmacia", "\tFilosof\u00EDa", " \tFinanzas", " \tFormaci\u00F3n", " \tGesti\u00F3n", "\tHoteler\u00EDa", "\tHumanidades ", "\tIdiomas", " \tImpuestos", " \tIndustria", " \tInform\u00E1tica", " \tIngenier\u00EDa", " \tIngenier\u00EDa Civil", " \tIngenier\u00EDa El\u00E9ctrica", " \tIngenier\u00EDa Electr\u00F3nica", " \tIngenier\u00EDa Industrial\t", " \tIngenier\u00EDa Mec\u00E1nica\t", " \tIngenier\u00EDa Qu\u00EDmica", " \tIngenier\u00EDa Sanitaria ", " \tIngenier\u00EDa Sistemas", " \tIngenier\u00EDa Telecomunicaciones", " \tInvestigaci\u00F3n de Mercado", " \tLog\u00EDstica", " \tMarketing\t", " \tMedio Ambiente", "\tMedicina", "\tMedios", "\tMultimedia", " \tOficios Diversos", " \tPrevenci\u00F3n de Riesgos", "\tProducci\u00F3n", "\tPsicolog\u00EDa", "\tPublicidad", " \tQuimica", " \tRecepci\u00F3n", " \tRecursos Humanos", " \tSalud", " \tSecretariado", " \tSeguridad", "       Servicios Financieros", " \tSalud Ocupacional", " \tServicios Domesticos", " \tSoporte Tecnico", " \tTelemarketing", " \tTransporte", " \tTurismo", " \tVentas"}));
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
		
		comboBox = new JComboBox<String>();
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"<Selecciona>", "Abogado", "Agente de Aduanas", "Agente de Prensa", "Alba\u00F1il", "Artesano", "Asesor de Imagen ", "Asesor Financiero", "Auditor", "Bi\u00F3logo", "Bot\u00E1nico", "Cajero", "Cartero ", "Cerrajero ", "Compositor ", "Conductor", "Conserje"}));
		comboBox.setEditable(true);
		comboBox.setToolTipText("<Selecciona>");
		comboBox.setBackground(new Color(248, 248, 255));
		comboBox.setBounds(150, 51, 212, 20);
		panel.add(comboBox);
		
		spinner_1 = new JSpinner();		
		spinner_1.setModel(new SpinnerNumberModel(new Integer(1), new Integer(1), null, new Integer(1)));
		spinner_1.setBounds(150, 81, 116, 20);
		panel.add(spinner_1);
		
	    CheckBoxNinguno_1 = new JCheckBox("Ninguno");
		CheckBoxNinguno_1.setBackground(new Color(248, 248, 255));
		CheckBoxNinguno_1.setHorizontalAlignment(SwingConstants.RIGHT);
		CheckBoxNinguno_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(CheckBoxNinguno_1.isSelected()==true){
					spinner_1.setEnabled(false);
				}
				else
					spinner_1.setEnabled(true);
					
			}
		});
		 
		spinner_1.setEnabled(true);
		
		CheckBoxNinguno_1.setBounds(272, 81, 90, 23);
		panel.add(CheckBoxNinguno_1);
		
		JLabel lblTipoDeContrato = new JLabel("Tipo de Contrato:");
		lblTipoDeContrato.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTipoDeContrato.setBounds(10, 118, 130, 14);
		panel.add(lblTipoDeContrato);
		
		comboBox_3 = new JComboBox<String>();
		comboBox_3.setBackground(new Color(248, 248, 255));
		comboBox_3.setModel(new DefaultComboBoxModel<String>(new String[] {"<Selecciona>", "Fijo ", "Parcial", "Temporal"}));
		comboBox_3.setBounds(150, 111, 212, 20);
		panel.add(comboBox_3);
		
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
							reiniciar();
						}
					});
		buttonReiniciar.setIcon(new ImageIcon(PersonApplication.class.getResource("/InterfazGrafica/Images/Back.png")));
		Buttonpanel.add(buttonReiniciar);
		
		JButton buttonSafe = new JButton("Guardar");
		buttonSafe.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							if((compa(formattedTextField.getText())==true)&&(comboBox_2.getSelectedItem().toString()!="<Selecciona>")&&
													(comboBox.getSelectedItem().toString()!="<Selecciona>")){
														PersonApplication temp= new PersonApplication(CollectionPerson.getInstanceCollectionPerson().getPerson(formattedTextField.getText()));
														
														temp.setNamePer(textField_1.getText());
														temp.setEmailPer(textField_6.getText());
														temp.setNameLab(textField_2.getText());
														temp.setMobileLab(textField_3.getText());
														temp.setCompanyLab(textField_4.getText());
														temp.setPosLab(textField_5.getText());
														temp.setArea(comboBox_2.getSelectedItem().toString());
														temp.setTitle(comboBox.getSelectedItem().toString());
														temp.setContract(comboBox_3.getSelectedItem().toString());
														temp.setNameLab(textField_12.getText());
														CollectionPersonApplicant.getInstanceCollectionPersonApplicant().setPersonApplicantions(temp);
														 if(CheckBoxNinguno_1.isEnabled()==true){
															 temp.setExpYears(0);
														 }
														 else{
															 temp.setExpYears(Integer.parseInt(spinner_1.getValue().toString()));
														 }
														error.setText("Su registro fue realizado correctamente");
														reiniciar();
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
				error.setBounds(418, 487, 392, 20);
				contentPane.add(error);
				
				MaskFormatter mask;
				try {
					mask= new MaskFormatter("###########");
					formattedTextField = new JFormattedTextField(mask);
					formattedTextField.addFocusListener(new FocusAdapter() {
						@Override
						public void focusLost(FocusEvent arg0) {
							for(int i=0; i<CollectionPerson.getInstanceCollectionPerson().getPersons().size();i++){
							if(CollectionPerson.getInstanceCollectionPerson().getPerson(i).getID().equals(formattedTextField.getText())){
								 textFieldName.setText(CollectionPerson.getInstanceCollectionPerson().getPerson(i).getName());
								textFieldLastName.setText(CollectionPerson.getInstanceCollectionPerson().getPerson(i).getLastName());
								textField_7.setText(CollectionPerson.getInstanceCollectionPerson().getPerson(i).getBirth());
								textField_8.setText(CollectionPerson.getInstanceCollectionPerson().getPerson(i).getNationality());
								textField_9.setText(CollectionPerson.getInstanceCollectionPerson().getPerson(i).getSex());
								 {
									  if( textField_9.getText()=="Femenino")
									  {
									  labelFemalePicture.setVisible(true);
									  labelMalePicture.setVisible(false);
									  }
									 
									 else if (textField_9.getText()=="Masculino")
									  {
									  labelMalePicture.setVisible(true);
									  labelFemalePicture.setVisible(false);
									  }
									  }
								textField_10.setText(CollectionPerson.getInstanceCollectionPerson().getPerson(i).getCivilState());
								textField_11.setText(CollectionPerson.getInstanceCollectionPerson().getPerson(i).getAcademicLevel());
								}
							}
						}
					});
					formattedTextField.setBounds(556, 203, 139, 20);
					contentPane.add(formattedTextField);
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

	}	
	public void reiniciar() {
				// TODO Auto-generated method stub
				textFieldName.setText("");
				textFieldLastName.setText("");
				textField_7.setText("");
				textField_8.setText("");
				textField_9.setText("");
				textField_10.setText("");
				textField_11.setText("");
				textField_12.setText("");
				textField_1.setText("");
				textField_6.setText("");
				comboBox.setSelectedItem("<Selecciona>");
				comboBox_3.setSelectedItem("<Selecciona>");
				comboBox_2.setSelectedItem("<Selecciona>");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				formattedTextField.setText("");
				CheckBoxNinguno_1.setSelected(false);
				spinner_1.setEnabled(true);
				spinner_1.setValue(1);
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