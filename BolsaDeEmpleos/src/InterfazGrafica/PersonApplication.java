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
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JSpinner;
import javax.swing.JLayeredPane;
import javax.swing.border.LineBorder;

public class PersonApplication extends JDialog {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PersonApplication frame = new PersonApplication();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PersonApplication() {
		setFont(new Font("Tahoma", Font.BOLD, 12));
		setIconImage(Toolkit.getDefaultToolkit().getImage(PersonApplication.class.getResource("/InterfazGrafica/Images/Add.png")));
		setTitle("NUEVA SOLICITUD DE EMPLEO");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(10, 50, 836, 739);
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
		panelPersonalDates.setBounds(20, 36, 416, 200);
		contentPane.add(panelPersonalDates);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(150, 24, 223, 20);
		panelPersonalDates.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(150, 48, 223, 20);
		panelPersonalDates.add(textField_1);
		
		JLabel label = new JLabel("Fecha de Nacimiento:");
		label.setHorizontalAlignment(SwingConstants.TRAILING);
		label.setBounds(0, 71, 140, 20);
		panelPersonalDates.add(label);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(248, 248, 255));
		comboBox.setBounds(150, 95, 223, 20);
		panelPersonalDates.add(comboBox);
		
		JLabel label_1 = new JLabel("Nacionalidad:");
		label_1.setHorizontalAlignment(SwingConstants.TRAILING);
		label_1.setBounds(10, 95, 130, 20);
		panelPersonalDates.add(label_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBackground(new Color(248, 248, 255));
		comboBox_1.setBounds(150, 119, 223, 20);
		panelPersonalDates.add(comboBox_1);
		
		JLabel label_2 = new JLabel("Sexo:");
		label_2.setHorizontalAlignment(SwingConstants.TRAILING);
		label_2.setBounds(10, 119, 130, 20);
		panelPersonalDates.add(label_2);
		
		JLabel label_3 = new JLabel("Estado Civil:");
		label_3.setHorizontalAlignment(SwingConstants.TRAILING);
		label_3.setBounds(10, 143, 130, 20);
		panelPersonalDates.add(label_3);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBackground(new Color(248, 248, 255));
		comboBox_2.setBounds(150, 143, 223, 20);
		panelPersonalDates.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBackground(new Color(248, 248, 255));
		comboBox_3.setBounds(150, 167, 223, 20);
		panelPersonalDates.add(comboBox_3);
		
		JLabel label_4 = new JLabel("Nivel de Estudio:");
		label_4.setHorizontalAlignment(SwingConstants.TRAILING);
		label_4.setBounds(10, 174, 130, 14);
		panelPersonalDates.add(label_4);
		
		JLabel label_9 = new JLabel("Nombres:");
		label_9.setVerticalAlignment(SwingConstants.BOTTOM);
		label_9.setHorizontalAlignment(SwingConstants.TRAILING);
		label_9.setBounds(10, 27, 130, 14);
		panelPersonalDates.add(label_9);
		
		JLabel label_10 = new JLabel("Apellidos:");
		label_10.setVerticalAlignment(SwingConstants.BOTTOM);
		label_10.setHorizontalAlignment(SwingConstants.TRAILING);
		label_10.setBounds(10, 51, 130, 14);
		panelPersonalDates.add(label_10);
		
		JMonthChooser monthChooser = new JMonthChooser();
		monthChooser.setBounds(194, 71, 108, 20);
		panelPersonalDates.add(monthChooser);
		
		JYearChooser yearChooser = new JYearChooser();
		yearChooser.setBounds(301, 71, 72, 20);
		panelPersonalDates.add(yearChooser);
		
		JSpinField spinField = new JSpinField();
		spinField.setBounds(150, 71, 46, 20);
		panelPersonalDates.add(spinField);
		
		JLabel label_5 = new JLabel("*");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_5.setForeground(new Color(255, 0, 0));
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setBounds(0, 0, 30, 14);
		panelPersonalDates.add(label_5);
		
		JLabel labelPicture = new JLabel("");
		labelPicture.setIcon(new ImageIcon(PersonApplication.class.getResource("/InterfazGrafica/Images/Profile.png")));
		labelPicture.setVerticalTextPosition(SwingConstants.BOTTOM);
		labelPicture.setIgnoreRepaint(true);
		labelPicture.setIconTextGap(8);
		labelPicture.setHorizontalAlignment(SwingConstants.CENTER);
		labelPicture.setForeground(Color.BLACK);
		labelPicture.setBackground(Color.WHITE);
		labelPicture.setBounds(568, 36, 140, 127);
		contentPane.add(labelPicture);
		
		JLabel label_7 = new JLabel("ID");
		label_7.setVerticalAlignment(SwingConstants.BOTTOM);
		label_7.setHorizontalAlignment(SwingConstants.TRAILING);
		label_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_7.setBounds(539, 177, 19, 14);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("   *");
		label_8.setHorizontalAlignment(SwingConstants.RIGHT);
		label_8.setForeground(Color.RED);
		label_8.setBounds(518, 177, 19, 14);
		contentPane.add(label_8);
		
		JLabel labelID = new JLabel("");
		labelID.setBackground(new Color(255, 255, 255));
		labelID.setBounds(568, 174, 140, 17);
		contentPane.add(labelID);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(null, "Experiencia Laboral", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBackground(new Color(248, 248, 255));
		panel.setBounds(440, 262, 357, 177);
		contentPane.add(panel);
		
		JLabel label_12 = new JLabel("\u00C1rea de Trabajo:");
		label_12.setHorizontalAlignment(SwingConstants.LEFT);
		label_12.setBounds(36, 24, 82, 14);
		panel.add(label_12);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setToolTipText("<Selecciona>");
		comboBox_4.setBackground(new Color(248, 248, 255));
		comboBox_4.setBounds(128, 21, 219, 20);
		panel.add(comboBox_4);
		
		JLabel label_13 = new JLabel("A\u00F1os de Experiencia:");
		label_13.setHorizontalAlignment(SwingConstants.RIGHT);
		label_13.setBounds(10, 54, 108, 14);
		panel.add(label_13);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(128, 52, 29, 20);
		panel.add(spinner);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		layeredPane.setBounds(568, 36, 140, 127);
		contentPane.add(layeredPane);
		
		JLayeredPane layeredPane_1 = new JLayeredPane();
		layeredPane_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		layeredPane_1.setBounds(568, 174, 140, 17);
		contentPane.add(layeredPane_1);
	}
}
