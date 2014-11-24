package InterfazGrafica;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import EmploymentMarket01.CollectionCompany;
import EmploymentMarket01.Company;
import EmploymentMarket01.CompanyType;

public class CompanyRegister extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private final JTextField textField_2;
	private final JTextField textField_3;
	private final JTextField textField_4;
	private final JTextField textField_6;
	private final JTextField textField_7;
	private final JTextField textField_8;
	private final JTextField textField_9;
	private final JTextField textField_10;
	private final JTextField textField_11;
	private final JTextField textField_13;
	private final JTextField textField;
	private final CollectionCompany companiesR;
	private final JComboBox comboBox_4;
	private final JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			CompanyRegister dialog = new CompanyRegister();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public CompanyRegister() {
		setType(Type.NORMAL);
		setLocationByPlatform(true);
		setLocation(new Point(0, 5));
		setLocale(new Locale("es"));
		setFont(new Font("Tahoma", Font.BOLD, 12));
		setModal(true);
		setTitle("REGISTRAR EMPRESA");
		setBounds(10, 50, 414, 558);
		setResizable(false);
		setLocationRelativeTo(rootPane);

		companiesR = CollectionCompany.getInstanceCollectionCompany();

		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(248, 248, 255));
		// contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(UIManager

		.getBorder("TitledBorder.border"), "Contacto:",

		TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBackground(new Color(248, 248, 255));
		panel.setBounds(10, 167, 383, 405);
		contentPanel.add(panel);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(UIManager

		.getBorder("TitledBorder.border"),

		"Direcci\u00F3n:", TitledBorder.LEFT,

		TitledBorder.TOP, null, null));
		panel_1.setBackground(new Color(248, 248, 255));
		panel_1.setBounds(2, 144, 343, 175);
		panel.add(panel_1);

		JLabel label = new JLabel("Calle:");
		label.setVerticalAlignment(SwingConstants.BOTTOM);
		label.setHorizontalAlignment(SwingConstants.TRAILING);
		label.setBounds(10, 25, 68, 14);
		panel_1.add(label);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(111, 22, 169, 20);
		panel_1.add(textField_2);

		JLabel label_1 = new JLabel("N\u00FAmero:");
		label_1.setVerticalAlignment(SwingConstants.BOTTOM);
		label_1.setHorizontalAlignment(SwingConstants.TRAILING);
		label_1.setBounds(10, 53, 68, 14);
		panel_1.add(label_1);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(111, 50, 169, 20);
		panel_1.add(textField_3);

		JLabel label_2 = new JLabel("Ciudad:");
		label_2.setVerticalAlignment(SwingConstants.BOTTOM);
		label_2.setHorizontalAlignment(SwingConstants.TRAILING);
		label_2.setBounds(10, 84, 68, 14);
		panel_1.add(label_2);

		JLabel label_3 = new JLabel("Sector:");
		label_3.setVerticalAlignment(SwingConstants.BOTTOM);
		label_3.setHorizontalAlignment(SwingConstants.TRAILING);
		label_3.setBounds(-10, 109, 88, 14);
		panel_1.add(label_3);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(111, 106, 169, 20);
		panel_1.add(textField_4);

		JLabel label_5 = new JLabel("Regi\u00F3n:");
		label_5.setVerticalAlignment(SwingConstants.BOTTOM);
		label_5.setHorizontalAlignment(SwingConstants.TRAILING);
		label_5.setBounds(-8, 136, 86, 14);
		panel_1.add(label_5);

		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(111, 133, 169, 20);
		panel_1.add(textField_6);

		comboBox = new JComboBox();
		comboBox.setBackground(new Color(248, 248, 255));
		comboBox.setBounds(111, 78, 169, 20);
		panel_1.add(comboBox);

		JLabel label_6 = new JLabel("E-mail:");
		label_6.setVerticalAlignment(SwingConstants.BOTTOM);
		label_6.setHorizontalAlignment(SwingConstants.TRAILING);
		label_6.setBounds(15, 29, 68, 14);
		panel.add(label_6);

		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(111, 23, 170, 20);
		panel.add(textField_7);

		JLabel label_7 = new JLabel("M\u00F3vil:");
		label_7.setVerticalAlignment(SwingConstants.BOTTOM);
		label_7.setHorizontalAlignment(SwingConstants.TRAILING);
		label_7.setBounds(15, 60, 68, 14);
		panel.add(label_7);

		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(111, 54, 170, 20);
		panel.add(textField_8);

		JLabel lblTelefno = new JLabel("Telef\u00F3no:");
		lblTelefno.setVerticalAlignment(SwingConstants.BOTTOM);
		lblTelefno.setHorizontalAlignment(SwingConstants.TRAILING);
		lblTelefno.setBounds(2, 91, 81, 14);
		panel.add(lblTelefno);

		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(111, 85, 170, 20);
		panel.add(textField_9);

		JLabel lblCdigoPostal = new JLabel("C\u00F3digo postal:");
		lblCdigoPostal.setVerticalAlignment(SwingConstants.BOTTOM);
		lblCdigoPostal.setHorizontalAlignment(SwingConstants.TRAILING);
		lblCdigoPostal.setBounds(2, 119, 81, 14);
		panel.add(lblCdigoPostal);

		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(111, 116, 170, 20);
		panel.add(textField_10);

		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new TitledBorder(UIManager
				.getBorder("TitledBorder.border"), "Datos generales:",
				TitledBorder.LEADING, TitledBorder.TOP, null,
				new Color(0, 0, 0)));
		panel_2.setBackground(new Color(248, 248, 255));
		panel_2.setBounds(10, 45, 383, 107);
		contentPanel.add(panel_2);

		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNombre.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNombre.setBounds(39, 27, 90, 14);
		panel_2.add(lblNombre);

		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(150, 24, 223, 20);
		panel_2.add(textField_11);

		comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(CompanyType.values()));
		comboBox_4.setBackground(new Color(248, 248, 255));
		comboBox_4.setBounds(150, 78, 223, 20);
		panel_2.add(comboBox_4);

		JLabel lblArea = new JLabel("\u00C1rea:");
		lblArea.setHorizontalAlignment(SwingConstants.TRAILING);
		lblArea.setBounds(25, 81, 104, 14);
		panel_2.add(lblArea);

		JLabel lblWeb = new JLabel("P\u00E1gina web:");
		lblWeb.setVerticalAlignment(SwingConstants.BOTTOM);
		lblWeb.setHorizontalAlignment(SwingConstants.TRAILING);
		lblWeb.setBounds(39, 55, 90, 14);
		panel_2.add(lblWeb);

		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(150, 52, 223, 20);
		panel_2.add(textField);

		JLabel lblRnc = new JLabel("RNC:");
		lblRnc.setVerticalAlignment(SwingConstants.BOTTOM);
		lblRnc.setHorizontalAlignment(SwingConstants.TRAILING);
		lblRnc.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblRnc.setBounds(10, 17, 35, 14);
		contentPanel.add(lblRnc);

		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(54, 14, 140, 20);
		contentPanel.add(textField_13);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent arg0) {
						setVisible(false);
					}
				});

				JButton btnRegistrar = new JButton("Registrar");
				btnRegistrar.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent arg0) {
						// textField_6
						// Region
						Company temp = new Company();
						temp.setRNC(textField_13.getText());
						temp.setName(textField_11.getText());
						temp.setWebPage(textField.getText());
						temp.setArea(comboBox_4.getSelectedItem().toString());
						temp.setEmail(textField_7.getText());
						temp.setMobile(textField_8.getText());
						temp.setPhone(textField_9.getText());
						temp.setPostalCode(Long.parseLong(textField_10
								.getText()));
						temp.setCalle(textField_2.getText());
						temp.setHouseNumber(Integer.parseInt(textField_3
								.getText()));
						temp.setCity(comboBox.getSelectedItem().toString());
						temp.setSector(textField_4.getText());

					}
				});
				buttonPane.add(btnRegistrar);
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
				buttonPane.add(cancelButton);
			}
		}
	}
}
