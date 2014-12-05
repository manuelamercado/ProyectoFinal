package InterfazGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Toolkit;

public class CompanyApplication extends JDialog {

	private JPanel contentPane;

	public CompanyApplication() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(CompanyApplication.class.getResource("/InterfazGrafica/Images/Add.png")));
		setTitle("NUEVA SOLICITUD DE PERSONAL");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(10, 50, 836, 739);
		setModal(true);
		setLocationRelativeTo(rootPane);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(248, 248, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
}
