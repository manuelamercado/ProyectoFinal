package InterfazGrafica;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Point;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.Locale;
import java.awt.Toolkit;

import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.UIManager;

import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JLayeredPane;
import javax.swing.border.LineBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JFormattedTextField;

import EmploymentMarket01.CollectionCompany;
import EmploymentMarket01.Company;
import EmploymentMarket01.CompanyType;

public class CompanyRegister extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8572339656996884220L;
	private final JPanel contentPanel = new JPanel();
	private JTextField textFieldName;
	private JTextField textFieldWeb;
	private JTextField textFieldFund;
	private JTextField textFieldActivity;
	private JTextField textFieldRoad;
	private JTextField textFieldCity;
	private JTextField textFieldRegion;
	private JTextField textFieldEmail;
	private JFormattedTextField formattedTextFieldRNC;
	private JFormattedTextField formattedTextFieldFax;
	private JFormattedTextField formattedTextFieldPhone;
	private JFormattedTextField formattedTextFieldPostal;
	private JComboBox<CompanyType> comboBoxArea;
	private JComboBox<String> comboBoxCountry;
	private JLabel error;
	private JTextField textField;

	public CompanyRegister() {
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setIconImage(Toolkit.getDefaultToolkit().getImage(CompanyRegister.class.getResource("/InterfazGrafica/Images/1417568890_new-file.png")));
		setType(Type.NORMAL);
		setLocationByPlatform(true);
		setLocation(new Point(0, 5));
		setLocale(new Locale("es"));
		setFont(new Font("Tahoma", Font.BOLD, 12));
		setModal(true);
		setTitle("REGISTRAR EMPRESA");
		setBounds(10, 50, 760, 650);
		setResizable(false);
		setLocationRelativeTo(null);//Centraliza la ventana
		
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(248, 248, 255));
		//contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel CompanyDates = new JPanel();
		CompanyDates.setBounds(25, 59, 347, 172);
		CompanyDates.setBackground(new Color(248, 248, 255));
		CompanyDates.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "    Datos de la Empresa", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPanel.add(CompanyDates);
		CompanyDates.setLayout(null);
		{
			JLabel lblName = new JLabel("Nombre:");
			lblName.setHorizontalAlignment(SwingConstants.RIGHT);
			lblName.setBounds(10, 27, 100, 14);
			CompanyDates.add(lblName);
		}
		
		textFieldName = new JTextField();
		textFieldName.setBounds(116, 21, 212, 20);
		CompanyDates.add(textFieldName);
		textFieldName.setColumns(10);
		
		JLabel lblAreaLaboral = new JLabel("\u00C1rea Laboral:");
		lblAreaLaboral.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAreaLaboral.setBounds(10, 89, 100, 14);
		CompanyDates.add(lblAreaLaboral);
		
		
		JLabel lblNewLabel = new JLabel("*");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(10, 2, 46, 14);
		CompanyDates.add(lblNewLabel);
		
		textFieldFund = new JTextField();
		textFieldFund.setBounds(116, 114, 212, 20);
		CompanyDates.add(textFieldFund);
		textFieldFund.setColumns(10);
		
		textFieldActivity = new JTextField();
		textFieldActivity.setBounds(116, 52, 212, 20);
		CompanyDates.add(textFieldActivity);
		textFieldActivity.setColumns(10);
		
		comboBoxArea = new JComboBox<CompanyType>();
		comboBoxArea.setModel(new DefaultComboBoxModel<CompanyType>(CompanyType.values()));
		 comboBoxArea.setBounds(116, 83, 212, 20);
		CompanyDates.add(comboBoxArea);
		
		JLabel lblActividad = new JLabel("Actividad:");
		 lblActividad.setHorizontalAlignment(SwingConstants.RIGHT);
		 lblActividad.setBounds(10, 58, 100, 14);
		 CompanyDates.add(lblActividad);
		 
		 final JComboBox<String> comboBoxSector = new JComboBox<String>();
		 comboBoxSector.setModel(new DefaultComboBoxModel<String>(new String[] {"<Selecciona>", "P\u00FAblico", "Privado "}));
		 comboBoxSector.setBounds(116, 114, 212, 20);
		  CompanyDates.add(comboBoxSector);
		
		JLabel lblAoDeFundacin = new JLabel("A\u00F1o Fundaci\u00F3n:");
		 lblAoDeFundacin.setHorizontalAlignment(SwingConstants.RIGHT);
		 lblAoDeFundacin.setBounds(10, 120, 100, 14);
		 CompanyDates.add(lblAoDeFundacin);
		
		JPanel panel = new JPanel();
		panel.setBounds(25, 255, 347, 188);
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "   Contacto:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBackground(new Color(248, 248, 255));
		contentPanel.add(panel);
		
		JLabel label_7 = new JLabel("E-mail:");
		label_7.setVerticalAlignment(SwingConstants.BOTTOM);
		label_7.setHorizontalAlignment(SwingConstants.TRAILING);
		label_7.setBounds(10, 29, 100, 14);
		panel.add(label_7);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setColumns(10);
		textFieldEmail.setBounds(116, 23, 212, 20);
		panel.add(textFieldEmail);
		
		JLabel lblFax_1 = new JLabel("Fax :");
		lblFax_1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblFax_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblFax_1.setBounds(10, 61, 100, 14);
		panel.add(lblFax_1);
		
		JLabel label_9 = new JLabel("Tel\u00E9fono:");
		label_9.setVerticalAlignment(SwingConstants.BOTTOM);
		label_9.setHorizontalAlignment(SwingConstants.TRAILING);
		label_9.setBounds(10, 91, 100, 14);
		panel.add(label_9);
		
		JLabel label_11 = new JLabel("*");
		label_11.setHorizontalAlignment(SwingConstants.LEFT);
		label_11.setForeground(Color.RED);
		label_11.setBounds(-29, 60, 87, 14);
		panel.add(label_11);
		
		JLabel label_12 = new JLabel("*");
		label_12.setHorizontalAlignment(SwingConstants.LEFT);
		label_12.setForeground(Color.RED);
		label_12.setBounds(10, 0, 38, 14);
		panel.add(label_12);
		
		JLabel lblCdigoPostal = new JLabel("C\u00F3digo Postal:");
		lblCdigoPostal.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCdigoPostal.setBounds(10, 122, 100, 14);
		panel.add(lblCdigoPostal);
		
		textFieldWeb = new JTextField();
		 textFieldWeb.setBounds(116, 147, 212, 20);
		 panel.add(textFieldWeb);
		 textFieldWeb.setColumns(10);
		
		 JLabel lblPginaWeb = new JLabel("P\u00E1gina Web:");
		 lblPginaWeb.setHorizontalAlignment(SwingConstants.RIGHT);
		 lblPginaWeb.setBounds(10, 152, 100, 14);
		 panel.add(lblPginaWeb);
		 
		 MaskFormatter mascara;
		try {
			mascara = new MaskFormatter("###########");
		 formattedTextFieldRNC = new JFormattedTextField(mascara);
		 formattedTextFieldRNC.setBounds(513, 197, 140, 20);
		 contentPanel.add(formattedTextFieldRNC);
		
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 MaskFormatter mascara1;
		try {
			mascara1 = new MaskFormatter("###-###-####");
			 formattedTextFieldFax = new JFormattedTextField(mascara1);
			 formattedTextFieldFax.setBounds(116, 54, 212, 20);
			 panel.add(formattedTextFieldFax);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		MaskFormatter mascara2;
		try {
			mascara2 = new MaskFormatter("###-###-####");
			formattedTextFieldPhone = new JFormattedTextField(mascara2);
			 formattedTextFieldPhone.setBounds(116, 82, 212, 20);
			 panel.add(formattedTextFieldPhone);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		 
		MaskFormatter mascara3;
		try {
			mascara3 = new MaskFormatter("#####");
			formattedTextFieldPostal = new JFormattedTextField(mascara3);
			 formattedTextFieldPostal.setBounds(116, 113, 212, 20);
			 panel.add(formattedTextFieldPostal);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		 
		 error = new JLabel("");
		 error.setForeground(Color.RED);
		 error.setBounds(25, 508, 340, 27);
		 contentPanel.add(error);

		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(513, 59, 140, 127);
		layeredPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		contentPanel.add(layeredPane);
		
		JLabel lblRnc = new JLabel("RNC:");
		lblRnc.setBounds(470, 205, 33, 14);
		lblRnc.setVerticalAlignment(SwingConstants.BOTTOM);
		lblRnc.setHorizontalAlignment(SwingConstants.TRAILING);
		lblRnc.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPanel.add(lblRnc);
		
		JLabel label_13 = new JLabel("   *");
		label_13.setBounds(453, 197, 19, 20);
		label_13.setHorizontalAlignment(SwingConstants.RIGHT);
		label_13.setForeground(Color.RED);
		contentPanel.add(label_13);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(397, 255, 347, 188);
		contentPanel.add(panel_1);
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "    Direcci\u00F3n:", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		panel_1.setBackground(new Color(248, 248, 255));
		
		JLabel label = new JLabel("Calle:");
		label.setVerticalAlignment(SwingConstants.BOTTOM);
		label.setHorizontalAlignment(SwingConstants.TRAILING);
		label.setDisplayedMnemonic('*');
		label.setDisplayedMnemonic(KeyEvent.VK_ASTERISK);
		label.setBounds(6, 124, 100, 14);
		panel_1.add(label);
		
		textFieldRoad = new JTextField();
		textFieldRoad.setColumns(10);
		textFieldRoad.setBounds(116, 118, 212, 20);
		panel_1.add(textFieldRoad);
		
		JLabel label_2 = new JLabel("Pa\u00EDs:");
		label_2.setVerticalAlignment(SwingConstants.BOTTOM);
		label_2.setHorizontalAlignment(SwingConstants.TRAILING);
		label_2.setBounds(6, 31, 100, 14);
		panel_1.add(label_2);
		
		JLabel lblRegin = new JLabel("Regi\u00F3n:");
		 lblRegin.setVerticalAlignment(SwingConstants.BOTTOM);
		lblRegin.setHorizontalAlignment(SwingConstants.TRAILING);
		 lblRegin.setBounds(6, 62, 100, 14);
		 panel_1.add(lblRegin);
		
		textFieldCity = new JTextField();
		textFieldCity.setColumns(10);
		textFieldCity.setBounds(116, 87, 212, 20);
		panel_1.add(textFieldCity);
		
		JLabel label_4 = new JLabel("Ciudad:");
		label_4.setVerticalAlignment(SwingConstants.BOTTOM);
		label_4.setHorizontalAlignment(SwingConstants.TRAILING);
		label_4.setBounds(6, 93, 100, 14);
		panel_1.add(label_4);
		
		textFieldRegion = new JTextField();
		textFieldRegion.setColumns(10);
		textFieldRegion.setBounds(116, 56, 212, 20);
		panel_1.add(textFieldRegion);
		
		comboBoxCountry = new JComboBox<String>();
		comboBoxCountry.setModel(new DefaultComboBoxModel<String>(new String[] {"<Selecciona>", "Afganist\u00E1n", "Albania", 
				"Argelia", "Samoa Americana", "Andorra", "Angola", "Anguila", "Ant\u00E1rtida", "Antigua y Barbuda",
				"Argentina", "Armenia", "Aruba", "Australia", "Austria", "Azerbaiy\u00E1n", "Bahamas", "Bahrein", 
				"Bangladesh", "Barbados", "Bielorrusia", "B\u00E9lgica", "Belice", "Benin", "Bermuda", "But\u00E1n", 
				"Bolivia", "Bosnia y Herzegovina", "Botswana", "Brasil", "Brunei Darussalam", "Bulgaria", "Burkina Faso",
				"Burundi", "Camboya", "Camer\u00FAn", "Canad\u00E1", "Cabo Verde", "Islas Caim\u00E1n",
				"Rep\u00FAblica Centroafricana", "Chad", "Chile", "China", "Isla de Navidad", "Islas Cocos (Keeling)",
				"Colombia", "Comoras", "Rep\u00FAblica Democr\u00E1tica del Congo (Kinshasa)", 
				"Congo, Rep\u00FAblica del (Brazzaville)", "Islas Cook", "Costa Rica", "Costa de Marfil (C\u00F4te d'Ivoire)",
				"Croacia", "Cuba", "Chipre", "Rep\u00FAblica Checa", "Dinamarca", "Djibouti", "Dominica",
				"Rep\u00FAblica Dominicana", "Timor Oriental Timor-Leste", "Ecuador", "Egipto", "El Salvador", 
				"Guinea Ecuatorial", "Eritrea", "Estonia", "Etiop\u00EDa", "islas Malvinas", "Islas Feroe", "Fiji", 
				"Finlandia", "Francia", "Guayana franc\u00E9s", "Polinesia franc\u00E9s", "Territorios Franceses del Sur",
				"Gab\u00F3n", "Gambia", "Georgia", "Alemania", "Ghana", "Gibraltar", "gran Breta\u00F1a", "Grecia", 
				"Groenlandia", "Granada", "Guadalupe", "Guam", "Guatemala", "Guinea", "Guinea-Bissau", "Guayana",
				"Hait\u00ED", "Santa Sede", "Honduras", "Hong Kong", "Hungr\u00EDa", "Islandia", "India", "Indonesia",
				"Ir\u00E1n (Rep\u00FAblica Isl\u00E1mica del)", "Irak", "Irlanda", "Israel", "Italia", "Jamaica",
				"Jap\u00F3n", "Jordania", "Kazajst\u00E1n", "Kenia", "Kiribati", 
				"Corea, Rep\u00FAblica Popular Democr\u00E1tica. (Corea del Norte)", 
				"Corea, Rep\u00FAblica de (Corea del Sur)", "Kosovo", "Kuwait", "Kirguist\u00E1n",
				"Lao, Rep\u00FAblica Popular Democr\u00E1tica", "Letonia", "L\u00EDbano", "Lesoto", "Liberia", "Libia",
				"Liechtenstein", "Lituania", "Luxemburgo", "Macao", "Macedonia, Rep. De", "Madagascar", "Malawi", "Malasia",
				"Maldivas", "Mal\u00ED", "Malta", "Islas Marshall", "Martinica", "Mauritania", "Mauricio", "Mayotte",
				"M\u00E9xico", "Micronesia, Estados Federados de", "Moldova, Rep\u00FAblica de", "M\u00F3naco", "Mongolia",
				"Montenegro", "Montserrat", "Marruecos", "Mozambique", "Myanmar, Birmania", "Namibia", "Nauru", "Nepal",
				"Pa\u00EDses Bajos", "Antillas Holandesas", "nueva Caledonia", "nueva Zelanda", "Nicaragua", "N\u00EDger",
				"Nigeria", "Niue", "Islas Marianas del Norte", "Noruega", "Om\u00E1n", "Pakist\u00E1n", "Palau",
				"territorios palestinos","Panam\u00E1", "Pap\u00FAa Nueva Guinea", "Paraguay", "Per\u00FA", "Filipinas",
				"Pitcairn Island", "Polonia", "Portugal", "Puerto Rico", "Katar", "Isla de la Reuni\u00F3n", "Rumania",
				"Federaci\u00F3n de Rusia", "Ruanda", "San Crist\u00F3bal y Nieves", "Santa Luc\u00EDa", 
				"San Vicente y las Granadinas", "Samoa", "San Marino", "Santo Tom\u00E9 y Pr\u00EDncipe", "Arabia Saudita",
				"Senegal", "Serbia", "Seychelles", "Sierra Leona", "Singapur", "Eslovaquia (Rep\u00FAblica Eslovaca)",
				"Eslovenia", "islas Salom\u00F3n", "Somalia", "Sud\u00E1frica", "Sud\u00E1n del Sur", "Espa\u00F1a", 
				"Sri Lanka", "Sud\u00E1n", "Suriname", "Swazilandia", "Suecia", "Suiza", "Siria", 
				"Taiw\u00E1n (Rep\u00FAblica de China)", "Tayikist\u00E1n", "Tanzania", "Tailandia", "T\u00EDbet", 
				"Timor-Leste (Timor Oriental)", "Togo", "Tokelau", "Tonga", "Trinidad y Tobago", "T\u00FAnez", "Pavo",
				"Turkmenist\u00E1n", "Islas Turcas y Caicos", "Tuvalu", "Uganda", "Ucrania", "Emiratos \u00C1rabes Unidos", 
				"Reino Unido", "Estados Unidos", "Uruguay", "Uzbekist\u00E1n", "Vanuatu", "Ciudad del Vaticano (Santa Sede)",
				"Venezuela", "Vietnam", "Islas V\u00EDrgenes (brit\u00E1nica)", "Islas V\u00EDrgenes (EE.UU.)",
				"Islas Wallis y Futuna", "S\u00E1hara Occidental", "Yemen", "Zambia", "Zimbabue"}));
		comboBoxCountry.setBackground(new Color(248, 248, 255));
		comboBoxCountry.setBounds(116, 25, 212, 20);
		panel_1.add(comboBoxCountry);
		
		JLabel lblNoEdificio = new JLabel("No. Edificio:");
		 lblNoEdificio.setHorizontalAlignment(SwingConstants.RIGHT);
		 lblNoEdificio.setBounds(6, 155, 100, 14);
		 panel_1.add(lblNoEdificio);
		
		 textField = new JTextField();
		 textField.setBounds(116, 149, 212, 20);
		 panel_1.add(textField);
		 textField.setColumns(10);
		
		JLabel lblSubirLogo = new JLabel("");
		lblSubirLogo.setBounds(513, 56, 140, 127);
		 contentPanel.add(lblSubirLogo);
		 lblSubirLogo.setIcon(new ImageIcon(CompanyRegister.class.getResource("/InterfazGrafica/Images/1416396195_Company.png")));
		 lblSubirLogo.setVerticalTextPosition(SwingConstants.BOTTOM);
		 lblSubirLogo.setIgnoreRepaint(true);
		 lblSubirLogo.setIconTextGap(8);
		 lblSubirLogo.setHorizontalAlignment(SwingConstants.CENTER);
		 lblSubirLogo.setForeground(Color.BLACK);
		 lblSubirLogo.setBackground(Color.WHITE);
		 


		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(248, 248, 255));
			buttonPane.setLayout(new FlowLayout(FlowLayout.CENTER));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			
			JButton btnReiniciar = new JButton("Reiniciar");
			btnReiniciar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textFieldName.setText("");
					textFieldActivity.setText("");
					comboBoxArea.setSelectedItem(CompanyType.Selecciona);
					textFieldFund.setText("");
					formattedTextFieldRNC.setText("");
					textFieldEmail.setText("");
					formattedTextFieldFax.setText("");
					formattedTextFieldPhone.setText("");
					formattedTextFieldPostal.setText("");
					textFieldWeb.setText("");
					comboBoxCountry.setSelectedItem("<Selecciona>");
					textFieldRegion.setText("");
					textFieldCity.setText("");
					textFieldRoad.setText("");	
					error.setText("");
					
				}
			});
			 btnReiniciar.setIcon(new ImageIcon(CompanyRegister.class.getResource("/InterfazGrafica/Images/Back.png")));
			 buttonPane.add(btnReiniciar);
			{
				JButton okButton = new JButton("Guardar");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Company temp = new Company();
						
						if((compa(textFieldName.getText())==true)&&(compa(textFieldActivity.getText())==true)&&
						(comboBoxArea.getSelectedItem()!=CompanyType.Selecciona)&&(compa(textFieldFund.getText())==true)&&
						(compa(textFieldWeb.getText())==true)&&(compa(textFieldEmail.getText())==true)&&
						(compa(formattedTextFieldFax.getText())==true)&&(compa(formattedTextFieldPhone.getText())==true)&&
						(compa(formattedTextFieldPostal.getText())==true)&&(compa(formattedTextFieldRNC.getText())==true)){															
							temp.setPostalCode(formattedTextFieldPostal.getText());
							temp.setPhone(formattedTextFieldPhone.getText());
							temp.setFax(formattedTextFieldFax.getText());
							temp.setEmail(textFieldEmail.getText());
							temp.setRNC(formattedTextFieldRNC.getText());
							temp.setFund(textFieldFund.getText());
							temp.setArea(comboBoxArea.getSelectedItem().toString());
							temp.setActivity(textFieldActivity.getText());
							temp.setName(textFieldName.getText());
							temp.setWebPage(textFieldWeb.getText());
							temp.setCountry(comboBoxCountry.getSelectedItem().toString());
							temp.getAddressCompany().setRegion(textFieldRegion.getText());
							temp.getAddressCompany().setHouseNumber(textField.getText());
							temp.setCity(textFieldCity.getText());
							temp.setCalle(textFieldRoad.getText());

							CollectionCompany.getInstanceCollectionCompany().setCompanies(temp);
							error.setText("Su registro fue realizado correctamente");			
						}

						else
							error.setText("Los campos marcados con asteriscos son obligatorios");																			
					}
				});

				 okButton.setIcon(new ImageIcon(CompanyRegister.class.getResource("/InterfazGrafica/Images/Save.png")));
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						dispose();
					}
				});
				cancelButton.setIcon(new ImageIcon(CompanyRegister.class.getResource("/InterfazGrafica/Images/Delete32.png")));
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
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