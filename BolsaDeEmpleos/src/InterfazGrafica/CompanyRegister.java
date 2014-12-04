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
import javax.swing.ImageIcon;
import javax.swing.JLayeredPane;
import javax.swing.border.LineBorder;
import javax.swing.JTabbedPane;

public class CompanyRegister extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;

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
		setIconImage(Toolkit.getDefaultToolkit().getImage(CompanyRegister.class.getResource("/InterfazGrafica/Images/1417568890_new-file.png")));
		setType(Type.NORMAL);
		setLocationByPlatform(true);
		setLocation(new Point(0, 5));
		setLocale(new Locale("es"));
		setFont(new Font("Tahoma", Font.BOLD, 12));
		setModal(true);
		setTitle("REGISTRAR EMPRESA");
		setBounds(10, 50, 760, 739);
		setResizable(false);
		setLocationRelativeTo(rootPane);
		
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(248, 248, 255));
		//contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel CompanyDates = new JPanel();
		CompanyDates.setBounds(25, 51, 370, 195);
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
		
		textField = new JTextField();
		textField.setBounds(116, 21, 212, 20);
		CompanyDates.add(textField);
		textField.setColumns(10);
		{
			JLabel lblCountry = new JLabel("Pa\u00EDs: ");
			lblCountry.setHorizontalAlignment(SwingConstants.RIGHT);
			lblCountry.setBounds(10, 58, 100, 14);
			CompanyDates.add(lblCountry);
		}
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>", "Cuba", "Chile", "Italia", "Espa\u00F1a", "Estados Unidos", "Argentina", "Rep\u00FAblica Dominicana"}));
		comboBox.setBounds(116, 52, 212, 20);
		CompanyDates.add(comboBox);
		
		JLabel lblAreaLaboral = new JLabel("\u00C1rea Laboral:");
		lblAreaLaboral.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAreaLaboral.setBounds(10, 89, 100, 14);
		CompanyDates.add(lblAreaLaboral);
		
		textField_1 = new JTextField();
		textField_1.setBounds(116, 83, 212, 20);
		CompanyDates.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("*");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(10, 2, 46, 14);
		CompanyDates.add(lblNewLabel);
		
		JLabel lblPhone = new JLabel("T\u00E9lefono:");
		lblPhone.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPhone.setBounds(10, 120, 100, 14);
		CompanyDates.add(lblPhone);
		
		textField_2 = new JTextField();
		textField_2.setBounds(116, 114, 212, 20);
		CompanyDates.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(116, 145, 212, 20);
		CompanyDates.add(textField_3);
		textField_3.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "   Contacto:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBackground(new Color(248, 248, 255));
		panel.setBounds(25, 273, 370, 165);
		contentPanel.add(panel);
		
		JLabel label_7 = new JLabel("E-mail:");
		label_7.setVerticalAlignment(SwingConstants.BOTTOM);
		label_7.setHorizontalAlignment(SwingConstants.TRAILING);
		label_7.setBounds(10, 29, 100, 14);
		panel.add(label_7);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(116, 23, 212, 20);
		panel.add(textField_9);
		
		JLabel lblFax_1 = new JLabel("Fax :");
		lblFax_1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblFax_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblFax_1.setBounds(10, 60, 100, 14);
		panel.add(lblFax_1);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(116, 54, 212, 20);
		panel.add(textField_10);
		
		JLabel label_9 = new JLabel("Tel\u00E9fono:");
		label_9.setVerticalAlignment(SwingConstants.BOTTOM);
		label_9.setHorizontalAlignment(SwingConstants.TRAILING);
		label_9.setBounds(10, 91, 100, 14);
		panel.add(label_9);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(116, 85, 212, 20);
		panel.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(116, 116, 212, 20);
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
		
		JLabel lblCdigoPostal = new JLabel("C\u00F3digo Postal:");
		lblCdigoPostal.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCdigoPostal.setBounds(10, 116, 100, 14);
		panel.add(lblCdigoPostal);
		
		JLabel lblSubirLogo = new JLabel("");
		lblSubirLogo.setIcon(new ImageIcon(CompanyRegister.class.getResource("/InterfazGrafica/Images/1416396195_Company.png")));
		lblSubirLogo.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblSubirLogo.setIgnoreRepaint(true);
		lblSubirLogo.setIconTextGap(8);
		lblSubirLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblSubirLogo.setForeground(Color.BLACK);
		lblSubirLogo.setBackground(Color.WHITE);
		lblSubirLogo.setBounds(513, 49, 140, 127);
		contentPanel.add(lblSubirLogo);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		layeredPane.setBounds(513, 49, 140, 127);
		contentPanel.add(layeredPane);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(513, 187, 140, 20);
		contentPanel.add(textField_13);
		
		JLabel lblRnc = new JLabel("RNC");
		lblRnc.setVerticalAlignment(SwingConstants.BOTTOM);
		lblRnc.setHorizontalAlignment(SwingConstants.TRAILING);
		lblRnc.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblRnc.setBounds(474, 190, 33, 14);
		contentPanel.add(lblRnc);
		
		JLabel label_13 = new JLabel("   *");
		label_13.setHorizontalAlignment(SwingConstants.RIGHT);
		label_13.setForeground(Color.RED);
		label_13.setBounds(459, 190, 19, 14);
		contentPanel.add(label_13);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(25, 472, 370, 195);
		contentPanel.add(panel_1);
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "    Direcci\u00F3n:", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		panel_1.setBackground(new Color(248, 248, 255));
		
		JLabel label = new JLabel("Calle:");
		label.setVerticalAlignment(SwingConstants.BOTTOM);
		label.setHorizontalAlignment(SwingConstants.TRAILING);
		label.setDisplayedMnemonic('*');
		label.setDisplayedMnemonic(KeyEvent.VK_ASTERISK);
		label.setBounds(10, 28, 100, 14);
		panel_1.add(label);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(116, 25, 212, 20);
		panel_1.add(textField_5);
		
		JLabel label_2 = new JLabel("Pa\u00EDs:");
		label_2.setVerticalAlignment(SwingConstants.BOTTOM);
		label_2.setHorizontalAlignment(SwingConstants.TRAILING);
		label_2.setBounds(10, 59, 100, 14);
		panel_1.add(label_2);
		
		JLabel label_3 = new JLabel("Sector:");
		label_3.setVerticalAlignment(SwingConstants.BOTTOM);
		label_3.setHorizontalAlignment(SwingConstants.TRAILING);
		label_3.setBounds(10, 90, 100, 14);
		panel_1.add(label_3);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(116, 87, 212, 20);
		panel_1.add(textField_6);
		
		JLabel label_4 = new JLabel("Ciudad:");
		label_4.setVerticalAlignment(SwingConstants.BOTTOM);
		label_4.setHorizontalAlignment(SwingConstants.TRAILING);
		label_4.setBounds(10, 121, 100, 14);
		panel_1.add(label_4);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(116, 118, 212, 20);
		panel_1.add(textField_7);
		
		JLabel label_5 = new JLabel("Regi\u00F3n:");
		label_5.setVerticalAlignment(SwingConstants.BOTTOM);
		label_5.setHorizontalAlignment(SwingConstants.TRAILING);
		label_5.setBounds(10, 152, 100, 14);
		panel_1.add(label_5);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(116, 149, 212, 20);
		panel_1.add(textField_8);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBackground(new Color(248, 248, 255));
		comboBox_1.setBounds(116, 56, 212, 20);
		panel_1.add(comboBox_1);
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
