package InterfazGrafica;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

import java.awt.Color;
import java.awt.Window.Type;
import java.awt.Toolkit;

import javax.swing.JSeparator;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.beans.PropertyVetoException;
import javax.swing.border.LineBorder;

public class CloseProgram extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private final JSeparator separator = new JSeparator();
	private Welcome welcome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			CloseProgram dialog = new CloseProgram();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public CloseProgram() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(CloseProgram.class.getResource("/InterfazGrafica/Warning.png")));
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setModal(true);
		setTitle("BOLSA DE EMPLEOS REP.DOM");
		setBounds(100, 100, 450, 300);
		setLocationRelativeTo(rootPane);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(248, 248, 255));
		contentPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblEstSeguroQue = new JLabel("\u00BFEst\u00E1 seguro que desea salir de Bolsa de Empleos Rep.Dom?");
			lblEstSeguroQue.setBounds(10, 25, 414, 31);
			lblEstSeguroQue.setHorizontalAlignment(SwingConstants.CENTER);
			lblEstSeguroQue.setFont(new Font("Tahoma", Font.BOLD, 12));
			contentPanel.add(lblEstSeguroQue);
		}
		{
			JLabel label = new JLabel("");
			label.setBounds(67, 82, 68, 89);
			label.setIcon(new ImageIcon(CloseProgram.class.getResource("/InterfazGrafica/Encontrar-Trabajo1.jpg")));
			contentPanel.add(label);
		}
		{
			JLabel lblBolsaDeEmpleos = new JLabel("Bolsa de Empleos Rep. Dom");
			lblBolsaDeEmpleos.setBounds(170, 95, 165, 14);
			lblBolsaDeEmpleos.setHorizontalAlignment(SwingConstants.CENTER);
			contentPanel.add(lblBolsaDeEmpleos);
		}
		{
			JLabel lblSystem = new JLabel("System 3M's  2014");
			lblSystem.setBounds(170, 120, 165, 14);
			lblSystem.setHorizontalAlignment(SwingConstants.CENTER);
			contentPanel.add(lblSystem);
		}
		{
			JLabel lblVersin = new JLabel("Versi\u00F3n 1.0");
			lblVersin.setBounds(170, 145, 165, 14);
			lblVersin.setHorizontalAlignment(SwingConstants.CENTER);
			contentPanel.add(lblVersin);
		}
		separator.setBounds(0, 224, 434, 38);
		contentPanel.add(separator);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(248, 248, 255));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton SiButton = new JButton("S\u00ED");
				SiButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						
						welcome = Welcome.getInstanceWelcome();
						setVisible(false);
						welcome.dispose();
						
					}
				});
				SiButton.setActionCommand("Si");
				buttonPane.add(SiButton);
				getRootPane().setDefaultButton(SiButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						setVisible(false);
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
