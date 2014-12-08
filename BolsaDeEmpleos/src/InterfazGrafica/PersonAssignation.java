package InterfazGrafica;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import javax.swing.JProgressBar;

public class PersonAssignation extends JDialog {

 /**
	 * 
	 */
	private static final long serialVersionUID = 4697438872201843996L;
private final JPanel contentPanel = new JPanel();
 private JTextField textField_name;
 private JTextField textField_RNC;
 private SeeCompanies seeCompanies;


 /**
 * Create the dialog.
 */
 public PersonAssignation() {
 setModal(true);
 setIconImage(Toolkit.getDefaultToolkit().getImage(PersonAssignation.class.getResource("/InterfazGrafica/Images/Search48.png")));
 setTitle("BUSQUEDA");
 setBounds(100, 100, 450, 235);
 getContentPane().setLayout(new BorderLayout());
 contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
 getContentPane().add(contentPanel, BorderLayout.CENTER);
 contentPanel.setLayout(null);
 setLocationRelativeTo(null);
 JLabel lblNombre = new JLabel("Nombre:");
 lblNombre.setHorizontalAlignment(SwingConstants.RIGHT);
 lblNombre.setBounds(10, 29, 52, 23);
 contentPanel.add(lblNombre);
 {
 JLabel lblRNC = new JLabel("RNC:");
 lblRNC.setHorizontalAlignment(SwingConstants.RIGHT);
 lblRNC.setBounds(35, 57, 27, 23);
 contentPanel.add(lblRNC);
 }
 textField_name = new JTextField();
 textField_name.setBounds(72, 30, 297, 20);
 contentPanel.add(textField_name);
 textField_name.setColumns(10);
 textField_RNC = new JTextField();
 textField_RNC.setColumns(10);
 textField_RNC.setBounds(72, 58, 297, 20);
 contentPanel.add(textField_RNC);
 {
 }
 {
 JPanel buttonPane = new JPanel();
 buttonPane.setLayout(new FlowLayout(FlowLayout.CENTER));
 getContentPane().add(buttonPane, BorderLayout.SOUTH);
 {
 final JLabel lbl_dontFound = new JLabel("");

 lbl_dontFound.setForeground(Color.RED);
 lbl_dontFound.setFont(new Font("Tahoma", Font.PLAIN, 11));
 lbl_dontFound.setHorizontalAlignment(SwingConstants.CENTER);
 lbl_dontFound.setBounds(10, 85, 414, 23);
 contentPanel.add(lbl_dontFound);

 JProgressBar progressBar = new JProgressBar();
 progressBar.setVisible(false);
 progressBar.setBounds(95, 119, 233, 14);
 contentPanel.add(progressBar);
 JButton okButton = new JButton("Asignar");
 okButton.setIcon(new ImageIcon(PersonAssignation.class.getResource("/InterfazGrafica/Images/si.png")));
 okButton.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent arg0) {

 }});
 okButton.setActionCommand("Buscar");
 buttonPane.add(okButton);
 getRootPane().setDefaultButton(okButton);
 }
 {
 JButton cancelButton = new JButton("Cancel");
 cancelButton.setIcon(new ImageIcon(SearchCompany.class.getResource("/InterfazGrafica/Images/Delete32.png")));
 cancelButton.addActionListener(new ActionListener() {
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