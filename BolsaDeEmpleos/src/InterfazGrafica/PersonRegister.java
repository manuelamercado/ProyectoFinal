package InterfazGrafica;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SpinnerDateModel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import EmploymentMarket01.Academic;
import EmploymentMarket01.Address;
import EmploymentMarket01.Person;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Toolkit;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.JScrollBar;

public class PersonRegister extends JDialog {

	protected static final String String = null;
	protected static final Date Date = null;
	private final JPanel contentPanel = new JPanel();
	private final JTextField textField;
	private JTextField txtSuperlargoArchipielago;
	private JTextField textField_2;
	// private Dimension dim;
	private final JTable table;
	private final DefaultTableModel tableModel;
	private Object[] fila;
	private int filasel, pos1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private final JPanel panel;
	private JComboBox comboBox_1;
	private ArrayList<Person> persons;
	private final JPanel panelTechnicalStudies;
	private JPanel panel_5OtrosEstudios;
	private JComboBox comboBox_1_3;
	private final JComboBox comboBox_2;
	private final JComboBox comboBox_3;
	private JComboBox comboBox_4;
	private JComboBox comboBox_5;
	private JComboBox comboBox_6;
	private JComboBox comboBox_7;
	private final JComboBox comboBox_4_1;
	private final JComboBox comboBox;
	private JComboBox comboBox_1_1;
	private JComboBox comboBox_1_2;
	private JComboBox comboBox_1_4;
	private JComboBox comboBox_8;
	private JComboBox comboBox_9;
	private JComboBox comboBox_10;
	private JTextField txtPhoto;

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public PersonRegister() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Sorismelda\\Desktop\\7mo. Semestre\\Programacion 1\\Proyecto Final\\1416396913_Login.png"));
		setTitle("REGISTRAR SOLICITANTE");
		setBounds(10, 50, 900, 700);
		setResizable(false);
		setModal(true);
		setLocationRelativeTo(null);
		//
		// dim = super.,getToolkit().getScreenSize();
		// super.setSize(dim);
		// setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(248, 248, 255));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		textField = new JTextField();
		textField.setBounds(630, 205, 140, 20);
		contentPanel.add(textField);
		textField.setColumns(10);

		JLabel lblId = new JLabel("ID");
		lblId.setBounds(595, 211, 25, 14);
		lblId.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblId.setHorizontalAlignment(SwingConstants.TRAILING);
		lblId.setVerticalAlignment(SwingConstants.BOTTOM);
		contentPanel.add(lblId);

		table = new JTable();
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setBounds(35, 400, 400, 200);
		tableModel = new DefaultTableModel();
		String[] columnNames = { "#", "ID", "Name", "Last name", "Born date",
				"Nacionality", "Sex", "Civil state", "Study level", "Title",
				"Grade level", "certified", "specialized courses",
				"technical college", "job", "e-mail", "cell-phone",
				"telephone", "postal code", "street", "number", "country",
				"sector", "city" };
		tableModel.setColumnIdentifiers(columnNames);
		//loadPerson();

		{

			JPanel DatosPersonales = new JPanel();
			DatosPersonales.setBounds(35, 44, 383, 200);
			DatosPersonales.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Datos Personales:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			contentPanel.add(DatosPersonales);
			DatosPersonales.setLayout(null);
			{
				JLabel lblName = new JLabel("Nombres:");
				lblName.setBounds(39, 27, 90, 14);
				DatosPersonales.add(lblName);
				lblName.setHorizontalAlignment(SwingConstants.TRAILING);
				lblName.setVerticalAlignment(SwingConstants.BOTTOM);
			}
			{
				txtSuperlargoArchipielago = new JTextField();
				txtSuperlargoArchipielago.setBounds(150, 24, 223, 20);
				DatosPersonales.add(txtSuperlargoArchipielago);
				txtSuperlargoArchipielago.setColumns(10);
			}
			{
				JLabel lblLastName = new JLabel("Apellidos:");
				lblLastName.setBounds(39, 51, 90, 14);
				DatosPersonales.add(lblLastName);
				lblLastName.setHorizontalAlignment(SwingConstants.TRAILING);
				lblLastName.setVerticalAlignment(SwingConstants.BOTTOM);
			}
			{
				textField_2 = new JTextField();
				textField_2.setBounds(150, 48, 223, 20);
				DatosPersonales.add(textField_2);
				textField_2.setColumns(10);
			}
			{
				JLabel lblBornDate = new JLabel("Fecha de Nacimiento:");
				lblBornDate.setBounds(0, 71, 129, 20);
				DatosPersonales.add(lblBornDate);
				lblBornDate.setHorizontalAlignment(SwingConstants.TRAILING);
			}

			JSpinner spinner = new JSpinner();
			spinner.setBounds(255, 71, 118, 20);
			DatosPersonales.add(spinner);
			spinner.setModel(new SpinnerDateModel(new Date(-946756800000L), new Date(-946756800000L), new Date(915163200000L), Calendar.DAY_OF_MONTH));
			{
				comboBox_1_1 = new JComboBox();
				comboBox_1_1.setBounds(150, 95, 223, 20);
				DatosPersonales.add(comboBox_1_1);
				comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {
						"<Select>", "Afghan", "American", "Argentinian",
						"Australian", "Austrian", "Belgian", "Bolivian",
						"Brazilian", "British", "Bulgarian", "Canadian",
						"Chilean", "Chinese", "Colombian", "Costa Rican",
						"Cuban", "Czech", "Danish", "Dominican", "Dutch",
						"Ecuadorean", "Egyptian", "English", "Filipino ",
						"Finnish ", "French ", "German ", "Greek ",
						"Greenlander ", "Guatemalan ", "Haitian ", "Hawaiian ",
						"Honduran ", "Hungarian ", "Icelandic ", "Indian ",
						"Indonesian ", "Iranian ", "Iraqui ", "Irish ",
						"Israeli ", "Italian ", "Jamaican ", "Japanese ",
						"korean ", "Lebanese ", "Malaysian ", "Maltese ",
						"Mexican ", "Moroccan ", "Nepalese ", "New Zealander ",
						"Nicaraguan ", "Nigerian ", "Norwegian ", "Pakistani ",
						"Palestinian ", "Panamanian", "Paraguayan ",
						"Peruvian ", "Polish ", "Portuguese ", "Puerto Rican ",
						"Rumanian ", "Russian ", "Saudi Arabian ", "Scottish ",
						"Singaporean ", "Spanish ", "Swedish ", "Swiss ",
						"Syrian ", "Tahitian ", "Thai ", "Tunisian ",
						"Turkish ", "Ukrainian ", "Uruguayan ", "Venezuelan ",
						"Vietnamese ", "Welsh ", "Yugoslavian " }));
			}
			{
				JLabel lblNacionality = new JLabel("Nacionalidad:");
				lblNacionality.setBounds(39, 95, 90, 20);
				DatosPersonales.add(lblNacionality);
				lblNacionality.setHorizontalAlignment(SwingConstants.TRAILING);
			}
			{
				comboBox_1_2 = new JComboBox();
				comboBox_1_2.setBounds(150, 119, 223, 20);
				DatosPersonales.add(comboBox_1_2);
				comboBox_1_2.setModel(new DefaultComboBoxModel(new String[] {
						"<Select>", "Female", "Male" }));
			}
			{
				JLabel lblSex = new JLabel("Sexo:");
				lblSex.setBounds(39, 119, 90, 20);
				DatosPersonales.add(lblSex);
				lblSex.setHorizontalAlignment(SwingConstants.TRAILING);
			}
			{
				JLabel lblCivilState = new JLabel("Estado Civil:");
				lblCivilState.setBounds(39, 143, 90, 20);
				DatosPersonales.add(lblCivilState);
				lblCivilState.setHorizontalAlignment(SwingConstants.TRAILING);
			}
			{
				comboBox_1_3 = new JComboBox();
				comboBox_1_3.setBounds(150, 143, 223, 20);
				DatosPersonales.add(comboBox_1_3);
				comboBox_1_3.setModel(new DefaultComboBoxModel(new String[] {
						"<Select>", "Single", "Married", "Dirvorced",
						"Widowed", "Engaged", "Other" }));
			}

			comboBox_1 = new JComboBox();
			comboBox_1.setBounds(150, 167, 223, 20);
			DatosPersonales.add(comboBox_1);
			comboBox_1.addItemListener(new ItemListener() {
				@Override
				public void itemStateChanged(ItemEvent arg0) {
					if (comboBox_1.getSelectedItem() == "Technical") {
						panel.setVisible(false);
						panelTechnicalStudies.setVisible(true);
						panel_5OtrosEstudios.setVisible(false);
					}

					if (comboBox_1.getSelectedItem() == "Universitary") {
						panelTechnicalStudies.setVisible(false);
						panel.setVisible(true);
						panel_5OtrosEstudios.setVisible(false);
					}
					if (comboBox_1.getSelectedItem() == "Other") {
						panel.setVisible(false);
						panelTechnicalStudies.setVisible(false);
						panel_5OtrosEstudios.setVisible(true);
					}
					if ((comboBox_1.getSelectedItem() == "<Select>")) {
						panel_5OtrosEstudios.setVisible(false);
						panel.setVisible(false);
						panelTechnicalStudies.setVisible(false);
					}

				}
			});
			comboBox_1.setModel(new DefaultComboBoxModel(new String[] {
					"<Select>", "Universitary", "Technical", "Other" }));

			JLabel lblSyudyLevel = new JLabel("Nivel de Estudio:");
			lblSyudyLevel.setBounds(25, 174, 104, 14);
			DatosPersonales.add(lblSyudyLevel);
			lblSyudyLevel.setHorizontalAlignment(SwingConstants.TRAILING);
			{
				JPanel panel_2Contacto = new JPanel();
				panel_2Contacto.setBounds(35, 267, 383, 405);
				panel_2Contacto.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Contacto:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				contentPanel.add(panel_2Contacto);
				panel_2Contacto.setLayout(null);
				{
					JPanel panel_3Address = new JPanel();
					panel_3Address.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Direcci\u00F3n:", TitledBorder.LEFT, TitledBorder.TOP, null, null));
					panel_3Address.setBounds(0, 161, 343, 244);
					panel_2Contacto.add(panel_3Address);
					panel_3Address.setLayout(null);
					{
						JLabel lblCalle = new JLabel("Calle:");
						lblCalle.setBounds(10, 25, 68, 14);
						panel_3Address.add(lblCalle);
						lblCalle.setVerticalAlignment(SwingConstants.BOTTOM);
						lblCalle.setHorizontalAlignment(SwingConstants.TRAILING);
					}
					{
						textField_8 = new JTextField();
						textField_8.setBounds(111, 22, 169, 20);
						panel_3Address.add(textField_8);
						textField_8.setColumns(10);
					}
					{
						JLabel lblNmero = new JLabel("N\u00FAmero:");
						lblNmero.setBounds(10, 53, 68, 14);
						panel_3Address.add(lblNmero);
						lblNmero.setVerticalAlignment(SwingConstants.BOTTOM);
						lblNmero.setHorizontalAlignment(SwingConstants.TRAILING);
					}
					{
						textField_7 = new JTextField();
						textField_7.setBounds(111, 50, 169, 20);
						panel_3Address.add(textField_7);
						textField_7.setColumns(10);
					}
					{
						JLabel lblCountry = new JLabel("Ciudad:");
						lblCountry.setBounds(10, 80, 68, 14);
						panel_3Address.add(lblCountry);
						lblCountry.setVerticalAlignment(SwingConstants.BOTTOM);
						lblCountry
								.setHorizontalAlignment(SwingConstants.TRAILING);
					}
					{
						JLabel lblSector = new JLabel("Sector:");
						lblSector.setBounds(-10, 114, 88, 14);
						panel_3Address.add(lblSector);
						lblSector.setVerticalAlignment(SwingConstants.BOTTOM);
						lblSector
								.setHorizontalAlignment(SwingConstants.TRAILING);
					}
					{
						textField_10 = new JTextField();
						textField_10.setBounds(111, 106, 169, 20);
						panel_3Address.add(textField_10);
						textField_10.setColumns(10);
					}
					{
						JLabel lblCity = new JLabel("City:");
						lblCity.setBounds(-10, 144, 88, 14);
						panel_3Address.add(lblCity);
						lblCity.setVerticalAlignment(SwingConstants.BOTTOM);
						lblCity.setHorizontalAlignment(SwingConstants.TRAILING);
					}
					{
						textField_9 = new JTextField();
						textField_9.setBounds(111, 134, 169, 20);
						panel_3Address.add(textField_9);
						textField_9.setColumns(10);
					}
					{
						JLabel lblRegion = new JLabel("Region:");
						lblRegion.setBounds(-8, 175, 86, 14);
						panel_3Address.add(lblRegion);
						lblRegion.setVerticalAlignment(SwingConstants.BOTTOM);
						lblRegion
								.setHorizontalAlignment(SwingConstants.TRAILING);
					}
					{
						textField_11 = new JTextField();
						textField_11.setBounds(111, 162, 169, 20);
						panel_3Address.add(textField_11);
						textField_11.setColumns(10);
					}
					{
						comboBox_1_4 = new JComboBox();
						comboBox_1_4.setBounds(111, 78, 169, 20);
						panel_3Address.add(comboBox_1_4);
						comboBox_1_4
								.setModel(new DefaultComboBoxModel(
										new String[] {
												"<Select>",
												"Afghanistan ",
												"Albania ",
												"Algeria ",
												"American Samoa ",
												"Andorra ",
												"Angola",
												"Anguilla ",
												"Antarctica ",
												"Antigua and Barbuda ",
												"Argentina ",
												"Armenia ",
												"Aruba ",
												"Australia ",
												"Austria ",
												"Azerbaijan  ",
												"Bahamas ",
												"Bahrain ",
												"Bangladesh ",
												"Barbados ",
												"Belarus ",
												"Belgium ",
												"Belize ",
												"Benin ",
												"Bermuda ",
												"Bhutan",
												"Bolivia ",
												"Bosnia and Herzegovina ",
												"Botswana ",
												"Brazil ",
												"Brunei Darussalam",
												"Bulgaria ",
												"Burkina Faso ",
												"Burundi ",
												"Cambodia ",
												"Cameroon ",
												"Canada ",
												"Cape Verde ",
												"Cayman Islands ",
												"Central African Republic ",
												"Chad ",
												"Chile ",
												"China ",
												"Christmas Island ",
												"Cocos (Keeling) Islands ",
												"Colombia ",
												"Comoros ",
												"Democratic Republic of the Congo (Kinshasa) ",
												"Congo, Republic of (Brazzaville) ",
												"Cook Islands ",
												"Costa Rica ",
												"Ivory Coast (Cote d'Ivoire) ",
												"Croatia ",
												"Cuba ",
												"Cyprus ",
												"Czech Republic ",
												"Denmark ",
												"Djibouti ",
												"Dominica ",
												"Dominican Republic ",
												"East Timor Timor-Leste ",
												"Ecuador ",
												"Egypt ",
												"El Salvador ",
												"Equatorial Guinea ",
												"Eritrea ",
												"Estonia ",
												"Ethiopia ",
												"Falkland Islands ",
												"Faroe Islands ",
												"Fiji ",
												"Finland ",
												"France ",
												"French Guiana ",
												"French Polynesia ",
												"French Southern Territories ",
												"Gabon ",
												"Gambia ",
												"Georgia ",
												"Germany ",
												"Ghana ",
												"Gibraltar ",
												"Great Britain ",
												"Greece ",
												"Greenland ",
												"Grenada ",
												"Guadeloupe ",
												"Guam ",
												"Guatemala ",
												"Guinea ",
												"Guinea-Bissau ",
												"Guyana ",
												"Haiti ",
												"Holy See ",
												"Honduras ",
												"Hong Kong ",
												"Hungary ",
												"Iceland ",
												"India ",
												"Indonesia ",
												"Iran (Islamic Republic of) ",
												"Iraq",
												"Ireland ",
												"Israel ",
												"Italy ",
												"Jamaica ",
												"Japan ",
												"Jordan ",
												"Kazakhstan ",
												"Kenya ",
												"Kiribati",
												"Korea, Democratic People's Rep. (North Korea)",
												"Korea, Republic of (South Korea)",
												"Kosovo",
												"Kuwait ",
												"Kyrgyzstan",
												"Lao, People's Democratic Republic",
												"Latvia",
												"Lebanon",
												"Lesotho",
												"Liberia",
												"Libya",
												"Liechtenstein",
												"Lithuania",
												"Luxembourg",
												"Macao",
												"Macedonia, Rep. of",
												"Madagascar",
												"Malawi",
												"Malaysia",
												"Maldives",
												"Mali",
												"Malta",
												"Marshall Islands",
												"Martinique",
												"Mauritania",
												"Mauritius",
												"Mayotte",
												"Mexico",
												"Micronesia, Federal States of",
												"Moldova, Republic of",
												"Monaco",
												"Mongolia",
												"Montenegro",
												"Montserrat",
												"Morocco",
												"Mozambique",
												"Myanmar, Burma",
												"Namibia",
												"Nauru ",
												"Nepal",
												"Netherlands",
												"Netherlands Antilles",
												"New Caledonia",
												"New Zealand",
												"Nicaragua",
												"Niger",
												"Nigeria",
												"Niue",
												"Northern Mariana Islands",
												"Norway",
												"Oman",
												"Pakistan",
												"Palau",
												"Palestinian territories",
												"Panama",
												"Papua New Guinea",
												"Paraguay",
												"Peru",
												"Philippines",
												"Pitcairn Island",
												"Poland",
												"Portugal",
												"Puerto Rico",
												"Qatar",
												"Reunion Island",
												"Romania",
												"Russian Federation",
												"Rwanda",
												"Saint Kitts and Nevis",
												"Saint Lucia",
												"Saint Vincent and the Grenadines",
												"Samoa",
												"San Marino",
												"Saint Tome and Principe ",
												"Saudi Arabia",
												"Senegal",
												"Serbia",
												"Seychelles",
												"Sierra Leone",
												"Singapore",
												"Slovakia (Slovak Republic)",
												"Slovenia",
												"Solomon Islands",
												"Somalia",
												"South Africa",
												"South Sudan",
												"Spain",
												"Sri Lanka",
												"Sudan",
												"Suriname",
												"Swaziland",
												"Sweden",
												"Switzerland",
												"Syria",
												"Taiwan (Republic of China)",
												"Tajikistan",
												"Tanzania",
												"Thailand",
												"Tibet",
												"Timor-Leste (East Timor)",
												"Togo",
												"Tokelau",
												"Tonga",
												"Trinidad and Tobago",
												"Tunisia",
												"Turkey ",
												"Turkmenistan",
												"Turks and Caicos Islands",
												"Tuvalu",
												"Uganda",
												"Ukraine",
												"United Arab Emirates",
												"United Kingdom",
												"United States",
												"Uruguay",
												"Uzbekistan",
												"Vanuatu",
												"Vatican City State (Holy See)",
												"Venezuela", "Vietnam",
												"Virgin Islands (British)",
												"Virgin Islands (U.S.)",
												"Wallis and Futuna Islands",
												"Western Sahara", "Yemen",
												"Zambia", "Zimbabwe" }));
					}
				}
				{
					JLabel lblEmail = new JLabel("E-mail:");
					lblEmail.setBounds(15, 29, 68, 14);
					panel_2Contacto.add(lblEmail);
					lblEmail.setVerticalAlignment(SwingConstants.BOTTOM);
					lblEmail.setHorizontalAlignment(SwingConstants.TRAILING);
				}
				{
					textField_3 = new JTextField();
					textField_3.setBounds(111, 23, 170, 20);
					panel_2Contacto.add(textField_3);
					textField_3.setColumns(10);
				}
				{
					JLabel lblCellphone = new JLabel("M\u00F3vil:");
					lblCellphone.setBounds(15, 60, 68, 14);
					panel_2Contacto.add(lblCellphone);
					lblCellphone.setVerticalAlignment(SwingConstants.BOTTOM);
					lblCellphone
							.setHorizontalAlignment(SwingConstants.TRAILING);
				}
				{
					textField_4 = new JTextField();
					textField_4.setBounds(111, 54, 170, 20);
					panel_2Contacto.add(textField_4);
					textField_4.setColumns(10);
				}
				{
					JLabel lblTelephone = new JLabel("Telephone:");
					lblTelephone.setBounds(2, 91, 81, 14);
					panel_2Contacto.add(lblTelephone);
					lblTelephone.setVerticalAlignment(SwingConstants.BOTTOM);
					lblTelephone
							.setHorizontalAlignment(SwingConstants.TRAILING);
				}
				{
					textField_5 = new JTextField();
					textField_5.setBounds(111, 85, 170, 20);
					panel_2Contacto.add(textField_5);
					textField_5.setColumns(10);
				}
				{
					JLabel lblPostalCode = new JLabel("Postal code:");
					lblPostalCode.setBounds(2, 119, 81, 14);
					panel_2Contacto.add(lblPostalCode);
					lblPostalCode.setVerticalAlignment(SwingConstants.BOTTOM);
					lblPostalCode
							.setHorizontalAlignment(SwingConstants.TRAILING);
				}
				{
					textField_6 = new JTextField();
					textField_6.setBounds(111, 116, 170, 20);
					panel_2Contacto.add(textField_6);
					textField_6.setColumns(10);
				}
			}

			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(1278, 267, -1266, 260);
			contentPanel.add(scrollPane);
															
															JScrollBar scrollBar = new JScrollBar();
															scrollBar.setBounds(1259, 0, 25, 735);
															contentPanel.add(scrollBar);
															{
																txtPhoto = new JTextField();
																txtPhoto.setBounds(630, 44, 140, 150);
																txtPhoto.setText("           Upload Photo");
																contentPanel.add(txtPhoto);
																txtPhoto.setColumns(10);
															}
															
															JLabel lblPicture = new JLabel("\r\n");
															lblPicture.setBounds(46, 23, 140, 150);
															contentPanel.add(lblPicture);
															lblPicture.setForeground(Color.BLACK);
															lblPicture.setBackground(Color.WHITE);
															
																		panel_5OtrosEstudios = new JPanel();
																		panel_5OtrosEstudios.setBounds(510, 267, 349, 211);
																		contentPanel.add(panel_5OtrosEstudios);
																		panel_5OtrosEstudios.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Otros Estudios:", TitledBorder.LEFT, TitledBorder.TOP, null, null));
																		panel_5OtrosEstudios.setVisible(false);
																		panel_5OtrosEstudios.setLayout(null);
																		{
																			JLabel lblCertificados = new JLabel("Certificados:");
																			lblCertificados.setHorizontalAlignment(SwingConstants.TRAILING);
																			lblCertificados.setBounds(10, 25, 107, 14);
																			panel_5OtrosEstudios.add(lblCertificados);
																		}
																		{
																			comboBox_8 = new JComboBox();
																			comboBox_8
																					.setModel(new DefaultComboBoxModel(
																							new String[] {
																									"<Select>",
																									"Human resource management",
																									"Surveying and Geomatics for real estate development",
																									"Atmosphere of premises: Creating and composing styles environments",
																									"Basic Statistical Analysis",
																									"Culinary arts",
																									"Financial audit",
																									"Library and information science",
																									"Chocolate and confectionery",
																									"Configuring and Deploying Windows Server 2008",
																									"Financial accounting",
																									"Address and business management",
																									"Design and development of business models",
																									"Strategic Finance:",
																									"Optimization of resources and investment projection",
																									"Administrative management for executive assistants",
																									"Risk management of information security",
																									"Strategic management of family businesses",
																									"Integrated project management (DIGIP) in real estate and construction in DR",
																									"Management and strategic direction of human capital",
																									"Corporate Taxes: New Trends and tax regulations",
																									"Corporate Intelligence",
																									"Intermediate English",
																									"Measurement, redesign and process improvements",
																									"Supply chain management",
																									"Techniques of computer assisted audit (TAAC'S)" }));
																			comboBox_8.setBounds(127, 22, 219, 20);
																			panel_5OtrosEstudios.add(comboBox_8);
																		}
																		{
																			JLabel lblCursosEspecializados = new JLabel("Cursos Especializados");
																			lblCursosEspecializados.setHorizontalAlignment(SwingConstants.TRAILING);
																			lblCursosEspecializados.setBounds(10, 46, 107, 22);
																			panel_5OtrosEstudios.add(lblCursosEspecializados);
																		}
																		{
																			comboBox_9 = new JComboBox();
																			comboBox_9
																					.setModel(new DefaultComboBoxModel(
																							new String[] {
																									"<Select>",
																									"Knowing the stock market DR",
																									"Cost control for food and beverage operations",
																									"IT network essential",
																									"Effective management of social networks",
																									"Sales Forecast",
																									"Specialized techniques in preparation of meat: Cortes, cooking, completion and presentation" }));
																			comboBox_9.setBounds(127, 47, 219, 20);
																			panel_5OtrosEstudios.add(comboBox_9);
																		}
																		{
																			JLabel lblTrabajo = new JLabel("Trabajo:");
																			lblTrabajo.setHorizontalAlignment(SwingConstants.TRAILING);
																			lblTrabajo.setBounds(10, 72, 107, 22);
																			panel_5OtrosEstudios.add(lblTrabajo);
																		}
																		{
																			comboBox_10 = new JComboBox();
																			comboBox_10.setModel(new DefaultComboBoxModel(new String[] {
																					"<Select>", "Accountant", "Actor / Actress",
																					"Air hostess", "Archaeologist", "Astronaut", "Baker",
																					"Biologist", "Bricklayer", "Bus driver", "Businessman",
																					"Businesswoman", "Butcher", "Caretaker", "Carpenter",
																					"Cashier", "Cleaner", "Clown", "Cobbler", "Consultant",
																					"Cook", "Counselor", "Chef", "Chemist", "Dancer",
																					"Decorator", "Dentist", "Designer", "Dressmaker",
																					"Dustman", "Economist", "Electrician", "Farmer",
																					"Fireman", "FIsherman", "Florist", "Fruiterer",
																					"Garbage collector", "Gardener", "Hairdresser",
																					"Housewife", "Hunter", "Jeweller", "Judge", "Lawyer",
																					"Librarian", "Life guard", "Lorry driver", "Mailman",
																					"Mechanic", "Meteorologist", "Miner", "Model", "Monk",
																					"Nanny", "Nun", "Nurse", "Nursemaid", "Office worker",
																					"Painter", "Pastry cook", "Pharmacist", "Photographer",
																					"Physicist", "Plumber", "Policeman / Policewoman",
																					"Politician", "Porter", "Postman", "Priest",
																					"Professor", "Programmer", "Psychiatrist",
																					"Psychologist", "Receptionist", "Researcher", "Sailor",
																					"Salesman", "Scientist", "Secretary", "Secretary",
																					"Shoemaker", "Shop assistant", " Singer",
																					"Social worker", "Surgeon", "Taxi driver", "Teacher",
																					"Telephone operator", "Travel agent", "Truck driver",
																					"Vet", "Veterinarian", "Waiter", "Waitress",
																					"Window cleaner", "Writer" }));
																			comboBox_10.setBounds(127, 73, 219, 20);
																			panel_5OtrosEstudios.add(comboBox_10);
																		}
																		
																				panelTechnicalStudies = new JPanel();
																				panelTechnicalStudies.setBounds(0, 0, 349, 211);
																				panel_5OtrosEstudios.add(panelTechnicalStudies);
																				panelTechnicalStudies.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Estudios T\u00E9cnicos", TitledBorder.LEFT, TitledBorder.TOP, null, null));
																				panelTechnicalStudies.setVisible(false);
																				panelTechnicalStudies.setLayout(null);
																				
																						JLabel lblCertificados_1 = new JLabel("Certificados:");
																						lblCertificados_1.setHorizontalAlignment(SwingConstants.TRAILING);
																						lblCertificados_1.setBounds(10, 27, 107, 14);
																						panelTechnicalStudies.add(lblCertificados_1);
																						
																								comboBox = new JComboBox();
																								comboBox.setModel(new DefaultComboBoxModel(
																										new String[] {
																												"<Select>",
																												"Human resource management",
																												"Surveying and Geomatics for real estate development",
																												"Atmosphere of premises: Creating and composing styles environments",
																												"Basic Statistical Analysis",
																												"Culinary arts",
																												"Financial audit",
																												"Library and information science",
																												"Chocolate and confectionery",
																												"Configuring and Deploying Windows Server 2008",
																												"Financial accounting",
																												"Address and business management",
																												"Design and development of business models",
																												"Strategic Finance:",
																												"Optimization of resources and investment projection",
																												"Administrative management for executive assistants",
																												"Risk management of information security",
																												"Strategic management of family businesses",
																												"Integrated project management (DIGIP) in real estate and construction in DR",
																												"Management and strategic direction of human capital",
																												"Corporate Taxes: New Trends and tax regulations",
																												"Corporate Intelligence", "Intermediate English",
																												"Measurement, redesign and process improvements",
																												"Supply chain management",
																												"Techniques of computer assisted audit (TAAC'S)" }));
																								comboBox.setBounds(127, 24, 219, 20);
																								panelTechnicalStudies.add(comboBox);
																								
																										JLabel lblCursosEspecializados_1 = new JLabel("Especialidades:");
																										lblCursosEspecializados_1.setHorizontalAlignment(SwingConstants.TRAILING);
																										lblCursosEspecializados_1.setBounds(10, 48, 107, 22);
																										panelTechnicalStudies.add(lblCursosEspecializados_1);
																										
																												comboBox_5 = new JComboBox();
																												comboBox_5
																														.setModel(new DefaultComboBoxModel(
																																new String[] {
																																		"<Select>",
																																		"Knowing the stock market DR",
																																		"Cost control for food and beverage operations",
																																		"IT network essential",
																																		"Effective management of social networks",
																																		"Sales Forecast",
																																		"Specialized techniques in preparation of meat: Cortes, cooking, completion and presentation" }));
																												comboBox_5.setBounds(127, 49, 219, 20);
																												panelTechnicalStudies.add(comboBox_5);
																												
																														JLabel lblCarreraTcnica = new JLabel("Carrera T\u00E9cnica:");
																														lblCarreraTcnica.setHorizontalAlignment(SwingConstants.TRAILING);
																														lblCarreraTcnica.setBounds(10, 73, 107, 22);
																														panelTechnicalStudies.add(lblCarreraTcnica);
																														
																																comboBox_6 = new JComboBox();
																																comboBox_6.setModel(new DefaultComboBoxModel(new String[] { "<Select>",
																																		"Small and medium enterprises", "Advertising",
																																		"Market aspects", "Graphic design",
																																		"Programming information systems", "Computerized accounting",
																																		"Financial and tax accounting" }));
																																comboBox_6.setBounds(127, 74, 219, 20);
																																panelTechnicalStudies.add(comboBox_6);
																																
																																		JLabel lblreasDeTrabajo = new JLabel("\u00C1reas de Trabajo:");
																																		lblreasDeTrabajo.setHorizontalAlignment(SwingConstants.TRAILING);
																																		lblreasDeTrabajo.setBounds(10, 98, 107, 22);
																																		panelTechnicalStudies.add(lblreasDeTrabajo);
																																		
																																				comboBox_7 = new JComboBox();
																																				comboBox_7.setModel(new DefaultComboBoxModel(new String[] { "<Select>",
																																						"Accountant", "Actor / Actress", "Air hostess",
																																						"Archaeologist", "Astronaut", "Baker", "Biologist",
																																						"Bricklayer", "Bus driver", "Businessman", "Businesswoman",
																																						"Butcher", "Caretaker", "Carpenter", "Cashier", "Cleaner",
																																						"Clown", "Cobbler", "Consultant", "Cook", "Counselor", "Chef",
																																						"Chemist", "Dancer", "Decorator", "Dentist", "Designer",
																																						"Dressmaker", "Dustman", "Economist", "Electrician", "Farmer",
																																						"Fireman", "FIsherman", "Florist", "Fruiterer",
																																						"Garbage collector", "Gardener", "Hairdresser", "Housewife",
																																						"Hunter", "Jeweller", "Judge", "Lawyer", "Librarian",
																																						"Life guard", "Lorry driver", "Mailman", "Mechanic",
																																						"Meteorologist", "Miner", "Model", "Monk", "Nanny", "Nun",
																																						"Nurse", "Nursemaid", "Office worker", "Painter",
																																						"Pastry cook", "Pharmacist", "Photographer", "Physicist",
																																						"Plumber", "Policeman / Policewoman", "Politician", "Porter",
																																						"Postman", "Priest", "Professor", "Programmer", "Psychiatrist",
																																						"Psychologist", "Receptionist", "Researcher", "Sailor",
																																						"Salesman", "Scientist", "Secretary", "Secretary", "Shoemaker",
																																						"Shop assistant", " Singer", "Social worker", "Surgeon",
																																						"Taxi driver", "Teacher", "Telephone operator", "Travel agent",
																																						"Truck driver", "Vet", "Veterinarian", "Waiter", "Waitress",
																																						"Window cleaner", "Writer" }));
																																				comboBox_7.setBounds(127, 99, 219, 20);
																																				panelTechnicalStudies.add(comboBox_7);
																																				
																																						panel = new JPanel();
																																						panel.setBounds(0, 0, 349, 211);
																																						panelTechnicalStudies.add(panel);
																																						panel.setBorder(new TitledBorder(null, "Universitary studies:",
																																								TitledBorder.LEFT, TitledBorder.TOP, null, null));
																																						panel.setVisible(false);
																																						panel.setLayout(null);
																																						{
																																							JLabel lblPu = new JLabel("Grado:");
																																							lblPu.setHorizontalAlignment(SwingConstants.TRAILING);
																																							lblPu.setBounds(10, 26, 107, 14);
																																							panel.add(lblPu);
																																						}
																																						
																																								comboBox_2 = new JComboBox();
																																								comboBox_2
																																										.setModel(new DefaultComboBoxModel(new String[] {"<Select>", "Business adm. mention operations", "Business adm. mention finance", "Business adm. mention strategy", "Business adm. mention creation and development of new business", "Business adm. mention human gestion", "Business adm. mention international business", "Hotel management mention food and drink", "Hotel management mention hotel marketing", "Arquitectura", "Social communication mention audiovisual production", "Social communication mention corporate communication", "Law", "Design and interior", "Ecology and environmental management", "Economy", "Education", "Nursing", "Stomatology", "Phylosophy", "Financial management and auditing", "Civil Engineering", "Electromechanical Engineering mention mechanical", "Electronechanical Engineerin mention electric", "Industrial Engineering", "System and computer Engineering", "Electronic Engineering", "Telematic Engineering", "Medicine", "Marketing", "Nutrition and dietetics", "Psychology", "Physical therapy"}));
																																								comboBox_2.setBounds(127, 23, 219, 20);
																																								panel.add(comboBox_2);
																																								
																																										JLabel lblPostgrade = new JLabel("Post-grado:");
																																										lblPostgrade.setHorizontalAlignment(SwingConstants.TRAILING);
																																										lblPostgrade.setBounds(10, 51, 107, 14);
																																										panel.add(lblPostgrade);
																																										
																																												comboBox_3 = new JComboBox();
																																												comboBox_3
																																														.setModel(new DefaultComboBoxModel(
																																																new String[] {
																																																		"<Select>",
																																																		"Executive Master in Strategic Human Resources",
																																																		"Master of Strategic Management",
																																																		"MBA in Insurance Programs",
																																																		"LLM in Economic Regulation",
																																																		"Master of Labour Law and Social Security",
																																																		"MSc in Real Estate",
																																																		"Master of Intellectual Property and New Technologies",
																																																		"Master of Law in Corporate Business",
																																																		"Master of International Relations",
																																																		"Master of Public Policy",
																																																		"Master of Business Economics",
																																																		"Executive Master in Supply Chain Management",
																																																		"Architectural Design Master of Interior Architecture Concentration",
																																																		"Architectural Design Master of Architecture mention Tourist Accommodation",
																																																		"Specialization in Applied Mathematics in Education",
																																																		"Specialization in Mathematics Education Basic Level" }));
																																												comboBox_3.setBounds(127, 48, 219, 20);
																																												panel.add(comboBox_3);
																																												{
																																													JLabel lblCertified = new JLabel("Certificaciones:");
																																													lblCertified.setHorizontalAlignment(SwingConstants.TRAILING);
																																													lblCertified.setBounds(10, 79, 107, 14);
																																													panel.add(lblCertified);
																																												}
																																												{
																																													comboBox_4 = new JComboBox();
																																													comboBox_4
																																															.setModel(new DefaultComboBoxModel(
																																																	new String[] {
																																																			"<Select>",
																																																			"Human resource management",
																																																			"Surveying and Geomatics for real estate development",
																																																			"Atmosphere of premises: Creating and composing styles environments",
																																																			"Basic Statistical Analysis",
																																																			"Culinary arts",
																																																			"Financial audit",
																																																			"Library and information science",
																																																			"Chocolate and confectionery",
																																																			"Configuring and Deploying Windows Server 2008",
																																																			"Financial accounting",
																																																			"Address and business management",
																																																			"Design and development of business models",
																																																			"Strategic Finance:",
																																																			"Optimization of resources and investment projection",
																																																			"Administrative management for executive assistants",
																																																			"Risk management of information security",
																																																			"Strategic management of family businesses",
																																																			"Integrated project management (DIGIP) in real estate and construction in DR",
																																																			"Management and strategic direction of human capital",
																																																			"Corporate Taxes: New Trends and tax regulations",
																																																			"Corporate Intelligence",
																																																			"Intermediate English",
																																																			"Measurement, redesign and process improvements",
																																																			"Supply chain management",
																																																			"Techniques of computer assisted audit (TAAC'S)" }));
																																													comboBox_4.setBounds(127, 76, 219, 20);
																																													panel.add(comboBox_4);
																																												}
																																												{
																																													JLabel lblSpecializedCourses = new JLabel(
																																															"Especialidades:");
																																													lblSpecializedCourses
																																															.setHorizontalAlignment(SwingConstants.TRAILING);
																																													lblSpecializedCourses.setBounds(10, 102, 107, 22);
																																													panel.add(lblSpecializedCourses);
																																												}
																																												{
																																													comboBox_5 = new JComboBox();
																																													comboBox_5
																																															.setModel(new DefaultComboBoxModel(
																																																	new String[] {
																																																			"<Select>",
																																																			"Knowing the stock market DR",
																																																			"Cost control for food and beverage operations",
																																																			"IT network essential",
																																																			"Effective management of social networks",
																																																			"Sales Forecast",
																																																			"Specialized techniques in preparation of meat: Cortes, cooking, completion and presentation" }));
																																													comboBox_5.setBounds(127, 103, 219, 20);
																																													panel.add(comboBox_5);
																																												}
																																												{
																																													JLabel lblTechnicalCollege = new JLabel("Estudios T\u00E9cnicos:");
																																													lblTechnicalCollege.setHorizontalAlignment(SwingConstants.TRAILING);
																																													lblTechnicalCollege.setBounds(10, 127, 107, 22);
																																													panel.add(lblTechnicalCollege);
																																												}
																																												{
																																													comboBox_6 = new JComboBox();
																																													comboBox_6
																																															.setModel(new DefaultComboBoxModel(new String[] {"<Select>", "Small and medium enterprises", "Advertising", "Market aspects", "Graphic design", "Programming information systems", "Computerized accounting", "Financial and tax accounting"}));
																																													comboBox_6.setBounds(127, 128, 219, 20);
																																													panel.add(comboBox_6);
																																												}
																																												{
																																													JLabel lblDoctorate = new JLabel("Doctorados:");
																																													lblDoctorate.setHorizontalAlignment(SwingConstants.TRAILING);
																																													lblDoctorate.setBounds(10, 155, 107, 22);
																																													panel.add(lblDoctorate);
																																												}
																																												{
																																													comboBox_7 = new JComboBox();
																																													comboBox_7
																																															.setModel(new DefaultComboBoxModel(
																																																	new String[] {
																																																			"<Select>",
																																																			"Constitutional Law and Fundamental Rights",
																																																			"Democratic Society, State and Law",
																																																			"Education (and/or in leadership or in pedagogical sciencies)",
																																																			"Business studies",
																																																			"Cooperation and Social Intervention",
																																																			"Educational Psychology and Human Development",
																																																			"Economy", "Sociology",
																																																			"Philosophy for a Global World" }));
																																													comboBox_7.setBounds(127, 156, 219, 20);
																																													panel.add(comboBox_7);
																																												}
																																												
																																														JLabel lblJob = new JLabel("\u00C1rea de Trabajo:");
																																														lblJob.setHorizontalAlignment(SwingConstants.TRAILING);
																																														lblJob.setBounds(10, 181, 107, 22);
																																														panel.add(lblJob);
																																														
																																																comboBox_4_1 = new JComboBox();
																																																comboBox_4_1.setModel(new DefaultComboBoxModel(new String[] {"<Select>", "Accountant", "Actor / Actress", "Air hostess", "Archaeologist", "Astronaut", "Baker", "Biologist", "Bricklayer", "Bus driver", "Businessman", "Businesswoman", "Butcher", "Caretaker", "Carpenter", "Cashier", "Cleaner", "Clown", "Cobbler", "Consultant", "Cook", "Counselor", "Chef", "Chemist", "Dancer", "Decorator", "Dentist", "Designer", "Dressmaker", "Dustman", "Economist", "Electrician", "Farmer", "Fireman", "FIsherman", "Florist", "Fruiterer", "Garbage collector", "Gardener", "Hairdresser", "Housewife", "Hunter", "Jeweller", "Judge", "Lawyer", "Librarian", "Life guard", "Lorry driver", "Mailman", "Mechanic", "Meteorologist", "Miner", "Model", "Monk", "Nanny", "Nun", "Nurse", "Nursemaid", "Office worker", "Painter", "Pastry cook", "Pharmacist", "Photographer", "Physicist", "Plumber", "Policeman / Policewoman", "Politician", "Porter", "Postman", "Priest", "Professor", "Programmer", "Psychiatrist", "Psychologist", "Receptionist", "Researcher", "Sailor", "Salesman", "Scientist", "Secretary", "Secretary", "Shoemaker", "Shop assistant", " Singer", "Social worker", "Surgeon", "Taxi driver", "Teacher", "Telephone operator", "Travel agent", "Truck driver", "Vet", "Veterinarian", "Waiter", "Waitress", "Window cleaner", "Writer"}));
																																																comboBox_4_1.setBounds(127, 182, 219, 20);
																																																panel.add(comboBox_4_1);

			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 695, 894, 33);
			contentPanel.add(buttonPane);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent arg0) {
						setVisible(false);
					}
				});
				{
					JButton btnDelete = new JButton("Delete");
					buttonPane.add(btnDelete);
				}
				{
					JButton btnUpdate = new JButton("Update");
					buttonPane.add(btnUpdate);
				}

				JButton btnRegister = new JButton("Register");
				btnRegister.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if (comboBox_1.getSelectedItem() == "Universitary") {

							
							/* Academic temp= new Academic(textField_1.getText(), textField_2.getText(), textField.getText(), textField_5.getText(), textField_4.getText(), textField_3.getText(), comboBox_1_3.getSelectedItem().toString(),comboBox_1_2.getSelectedItem().toString(), Date birth, comboBox_1_1.getSelectedItem().toString(), int age,  comboBox_1.getSelectedItem().toString(),  comboBox_1_4.getSelectedItem().toString(), textField_9.getText(), textField_10.getText(), textField_8.getText(), parseInt(textField_7.getText()), long pcode, String title, String certified, String courses, String technical, comboBox_2.getSelectedItem().toString());
							 

						}*/
						}
				}});
				buttonPane.add(btnRegister);
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
				buttonPane.add(cancelButton);}}}	
}
		//}
	//	}
	//}

	/*private void loadPerson() {
		tableModel.setRowCount(0);
		fila = new Object[tableModel.getColumnCount()];
		for (int i = 0; i < persons.size(); i++) {
			Address address = persons.get(i).getAddress();
			fila[0] = i;
			fila[1] = persons.get(i).getID();
			fila[2] = persons.get(i).getName();
			fila[3] = persons.get(i).getLastName();
			fila[4] = persons.get(i).getBirth();
			fila[5] = persons.get(i).getNationality();
			fila[6] = persons.get(i).getSex();
			fila[7] = persons.get(i).getCivilState();
			fila[8] = persons.get(i).getStudyLevel();
			/*
			 * fila[9] = (Academic) persons.get(i).getTitle; fila[10] =
			 * persons.get(i).getGradeLevel; fila[11] =
			 * persons.get(i).getCertified; fila[12] =
			 * persons.get(i).getCourses; fila[13] =
			 * persons.get(i).getTechnical; fila[14] = persons.get(i).getJob;
			 */
			/*fila[15] = persons.get(i).getEmail();
			fila[16] = persons.get(i).getMobile();
			fila[17] = persons.get(i).getPhone();
			fila[18] = address.getPostalCode();
			fila[19] = address.getCalle();
			fila[20] = address.getHouseNumber();
			fila[21] = address.getCountry();
			fila[22] = address.getSector();
			fila[23] = address.getCity();
			tableModel.addRow(fila);
			}
		

		/*table.setModel(tableModel);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.getTableHeader().setReorderingAllowed(false);
		TableColumnModel columnModel = table.getColumnModel();
		columnModel.getColumn(0).setPreferredWidth(70);
		columnModel.getColumn(1).setPreferredWidth(150);
		columnModel.getColumn(2).setPreferredWidth(150);
		columnModel.getColumn(3).setPreferredWidth(150);
		columnModel.getColumn(4).setPreferredWidth(150);
		columnModel.getColumn(5).setPreferredWidth(150);
		columnModel.getColumn(6).setPreferredWidth(150);
		columnModel.getColumn(7).setPreferredWidth(150);
	}*/
