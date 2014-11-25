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
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
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

public class CompanyRegister extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
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
	private JTextField textField_12;

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
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setIconImage(Toolkit.getDefaultToolkit().getImage(CompanyRegister.class.getResource("/InterfazGrafica/1416396195_Company.png")));
		setType(Type.NORMAL);
		setLocationByPlatform(true);
		setLocation(new Point(0, 5));
		setLocale(new Locale("es"));
		setFont(new Font("Tahoma", Font.BOLD, 12));
		setModal(true);
		setTitle("REGISTRAR EMPRESA");
		setBounds(10, 50, 836, 739);
		setResizable(false);
		setLocationRelativeTo(rootPane);
		
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(248, 248, 255));
		//contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel CompanyDates = new JPanel();
		CompanyDates.setBounds(25, 35, 396, 220);
		CompanyDates.setBackground(new Color(248, 248, 255));
		CompanyDates.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "    Datos de la Empresa", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPanel.add(CompanyDates);
		CompanyDates.setLayout(null);
		{
			JLabel lblName = new JLabel("Nombre:");
			lblName.setHorizontalAlignment(SwingConstants.RIGHT);
			lblName.setBounds(10, 27, 75, 14);
			CompanyDates.add(lblName);
		}
		
		textField = new JTextField();
		textField.setBounds(95, 21, 230, 20);
		CompanyDates.add(textField);
		textField.setColumns(10);
		{
			JLabel lblCountry = new JLabel("Pa\u00EDs: ");
			lblCountry.setHorizontalAlignment(SwingConstants.RIGHT);
			lblCountry.setBounds(20, 58, 65, 14);
			CompanyDates.add(lblCountry);
		}
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>"}));
		comboBox.setBounds(95, 52, 230, 20);
		CompanyDates.add(comboBox);
		
		JLabel lblAreaLaboral = new JLabel("\u00C1rea Laboral:");
		lblAreaLaboral.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAreaLaboral.setBounds(10, 89, 75, 14);
		CompanyDates.add(lblAreaLaboral);
		
		textField_1 = new JTextField();
		textField_1.setBounds(95, 83, 230, 20);
		CompanyDates.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("*");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(10, 2, 46, 14);
		CompanyDates.add(lblNewLabel);
		
		JLabel lblPhone = new JLabel("T\u00E9lefono:");
		lblPhone.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPhone.setBounds(20, 120, 65, 14);
		CompanyDates.add(lblPhone);
		
		textField_2 = new JTextField();
		textField_2.setBounds(95, 114, 230, 20);
		CompanyDates.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblFax = new JLabel("Fax:");
		lblFax.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFax.setBounds(39, 151, 46, 14);
		CompanyDates.add(lblFax);
		
		textField_3 = new JTextField();
		textField_3.setBounds(95, 145, 230, 20);
		CompanyDates.add(textField_3);
		textField_3.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "   Contacto:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBackground(new Color(248, 248, 255));
		panel.setBounds(25, 273, 396, 405);
		contentPanel.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "     Direcci\u00F3n:", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		panel_1.setBackground(new Color(248, 248, 255));
		panel_1.setBounds(2, 144, 343, 244);
		panel.add(panel_1);
		
		JLabel label = new JLabel("Calle:");
		label.setVerticalAlignment(SwingConstants.BOTTOM);
		label.setHorizontalAlignment(SwingConstants.TRAILING);
		label.setDisplayedMnemonic('*');
		label.setDisplayedMnemonic(KeyEvent.VK_ASTERISK);
		label.setBounds(42, 25, 36, 14);
		panel_1.add(label);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(111, 22, 169, 20);
		panel_1.add(textField_4);
		
		JLabel label_1 = new JLabel("Casa No:");
		label_1.setVerticalAlignment(SwingConstants.BOTTOM);
		label_1.setHorizontalAlignment(SwingConstants.TRAILING);
		label_1.setBounds(32, 53, 46, 14);
		panel_1.add(label_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(111, 50, 169, 20);
		panel_1.add(textField_5);
		
		JLabel label_2 = new JLabel("Pa\u00EDs:");
		label_2.setVerticalAlignment(SwingConstants.BOTTOM);
		label_2.setHorizontalAlignment(SwingConstants.TRAILING);
		label_2.setBounds(10, 80, 68, 14);
		panel_1.add(label_2);
		
		JLabel label_3 = new JLabel("Sector:");
		label_3.setVerticalAlignment(SwingConstants.BOTTOM);
		label_3.setHorizontalAlignment(SwingConstants.TRAILING);
		label_3.setBounds(-10, 114, 88, 14);
		panel_1.add(label_3);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(111, 106, 169, 20);
		panel_1.add(textField_6);
		
		JLabel label_4 = new JLabel("Ciudad:");
		label_4.setVerticalAlignment(SwingConstants.BOTTOM);
		label_4.setHorizontalAlignment(SwingConstants.TRAILING);
		label_4.setBounds(-10, 144, 88, 14);
		panel_1.add(label_4);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(111, 134, 169, 20);
		panel_1.add(textField_7);
		
		JLabel label_5 = new JLabel("Regi\u00F3n:");
		label_5.setVerticalAlignment(SwingConstants.BOTTOM);
		label_5.setHorizontalAlignment(SwingConstants.TRAILING);
		label_5.setBounds(-8, 168, 86, 14);
		panel_1.add(label_5);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(111, 162, 169, 20);
		panel_1.add(textField_8);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBackground(new Color(248, 248, 255));
		comboBox_1.setBounds(111, 78, 169, 20);
		panel_1.add(comboBox_1);
		
		JLabel label_6 = new JLabel(" *");
		label_6.setForeground(Color.RED);
		label_6.setBounds(10, 0, 46, 14);
		panel_1.add(label_6);
		
		JLabel label_7 = new JLabel("E-mail:");
		label_7.setVerticalAlignment(SwingConstants.BOTTOM);
		label_7.setHorizontalAlignment(SwingConstants.TRAILING);
		label_7.setBounds(10, 29, 73, 14);
		panel.add(label_7);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(111, 23, 170, 20);
		panel.add(textField_9);
		
		JLabel label_8 = new JLabel("M\u00F3vil:");
		label_8.setVerticalAlignment(SwingConstants.BOTTOM);
		label_8.setHorizontalAlignment(SwingConstants.TRAILING);
		label_8.setBounds(20, 60, 63, 14);
		panel.add(label_8);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(111, 54, 170, 20);
		panel.add(textField_10);
		
		JLabel label_9 = new JLabel("Tel\u00E9fono:");
		label_9.setVerticalAlignment(SwingConstants.BOTTOM);
		label_9.setHorizontalAlignment(SwingConstants.TRAILING);
		label_9.setBounds(2, 91, 81, 14);
		panel.add(label_9);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(111, 85, 170, 20);
		panel.add(textField_11);
		
		JLabel label_10 = new JLabel("C\u00F3digo Postal:");
		label_10.setVerticalAlignment(SwingConstants.BOTTOM);
		label_10.setHorizontalAlignment(SwingConstants.TRAILING);
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label_10.setBounds(2, 119, 81, 14);
		panel.add(label_10);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(111, 116, 170, 20);
		panel.add(textField_12);
		
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
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
