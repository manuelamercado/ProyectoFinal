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
import java.awt.Window;
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
	private JButton SiButton;

	public CloseProgram() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(CloseProgram.class.getResource("/InterfazGrafica/Images/Warning.png")));
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setModal(true);
		setTitle("BOLSA DE EMPLEOS REP.DOM");
		setBounds(100, 100, 450, 300);
		setLocationRelativeTo(rootPane);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(248, 248, 255));
		contentPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		setModal(true);
		contentPanel.setLayout(null);
		{
			JLabel lblEstSeguroQue = new JLabel("\u00BFEst\u00E1 seguro que desea salir de Bolsa de Empleos Rep.Dom?");
			lblEstSeguroQue.setBounds(10, 25, 414, 31);
			lblEstSeguroQue.setHorizontalAlignment(SwingConstants.CENTER);
			lblEstSeguroQue.setFont(new Font("Tahoma", Font.BOLD, 12));
			contentPanel.add(lblEstSeguroQue);
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
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(CloseProgram.class.getResource("/InterfazGrafica/Images/Encontrar-Trabajo1.jpg")));
		lblNewLabel.setBounds(73, 88, 63, 79);
		contentPanel.add(lblNewLabel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(248, 248, 255));
			buttonPane.setLayout(new FlowLayout(FlowLayout.CENTER));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				SiButton = new JButton("S\u00ED");
				SiButton.setIcon(new ImageIcon(CloseProgram.class.getResource("/InterfazGrafica/Images/botonsi.png")));
				SiButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						
						
						Welcome.getInstanceWelcome();
						//Welcome().getWindows().setVisible;
						
						setVisible(false);
						
					}
				});
				SiButton.setActionCommand("Si");
				buttonPane.add(SiButton);
				getRootPane().setDefaultButton(SiButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setIcon(new ImageIcon(CloseProgram.class.getResource("/InterfazGrafica/Images/Delete32.png")));
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
