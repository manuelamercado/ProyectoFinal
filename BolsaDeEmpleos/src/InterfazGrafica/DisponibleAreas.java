package InterfazGrafica;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;
import javax.swing.JEditorPane;
import javax.swing.JTabbedPane;
import javax.swing.JList;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

public class DisponibleAreas extends JDialog {

	private final JPanel contentPanel = new JPanel();

	public DisponibleAreas() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(DisponibleAreas.class.getResource("/InterfazGrafica/Images/areas.png")));
		setTitle("\u00C1REAS DISPONIBLES");
		setBounds(10, 50, 623, 741);
		setLocationRelativeTo(null);
		setModal(true);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(248, 248, 255));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBackground(new Color(248, 248, 255));
			panel.setBorder(new TitledBorder(null, "Ingenier\u00EDas", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBounds(316, 354, 255, 286);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JRadioButton rdbtnIngenieriaCivil = new JRadioButton("Ingenier\u00EDa Civil");
				rdbtnIngenieriaCivil.setBackground(new Color(248, 248, 255));
				rdbtnIngenieriaCivil.setActionCommand("Ingenier\u00EDa Civil");
				rdbtnIngenieriaCivil.setBounds(20, 45, 154, 23);
				panel.add(rdbtnIngenieriaCivil);
			}
			{
				JRadioButton rdbtnIngenieraElctrica = new JRadioButton("Ingenier\u00EDa El\u00E9ctrica");
				rdbtnIngenieraElctrica.setBackground(new Color(248, 248, 255));
				rdbtnIngenieraElctrica.setActionCommand("Ingenier\u00EDa Civil");
				rdbtnIngenieraElctrica.setBounds(20, 71, 154, 23);
				panel.add(rdbtnIngenieraElctrica);
			}
			{
				JRadioButton rdbtnIngenieraElectrnica = new JRadioButton("Ingenier\u00EDa Electr\u00F3nica");
				rdbtnIngenieraElectrnica.setBackground(new Color(248, 248, 255));
				rdbtnIngenieraElectrnica.setActionCommand("Ingenier\u00EDa Civil");
				rdbtnIngenieraElectrnica.setBounds(20, 97, 154, 23);
				panel.add(rdbtnIngenieraElectrnica);
			}
			{
				JRadioButton rdbtnIngenieraIndustrial = new JRadioButton("Ingenier\u00EDa Industrial");
				rdbtnIngenieraIndustrial.setBackground(new Color(248, 248, 255));
				rdbtnIngenieraIndustrial.setActionCommand("Ingenier\u00EDa Civil");
				rdbtnIngenieraIndustrial.setBounds(20, 123, 154, 23);
				panel.add(rdbtnIngenieraIndustrial);
			}
			{
				JRadioButton rdbtnIngenieraMecnica = new JRadioButton("Ingenier\u00EDa Mec\u00E1nica");
				rdbtnIngenieraMecnica.setBackground(new Color(248, 248, 255));
				rdbtnIngenieraMecnica.setActionCommand("Ingenier\u00EDa Civil");
				rdbtnIngenieraMecnica.setBounds(20, 149, 154, 23);
				panel.add(rdbtnIngenieraMecnica);
			}
			{
				JRadioButton rdbtnIngenieraQumica = new JRadioButton("Ingenier\u00EDa Qu\u00EDmica");
				rdbtnIngenieraQumica.setBackground(new Color(248, 248, 255));
				rdbtnIngenieraQumica.setActionCommand("Ingenier\u00EDa Civil");
				rdbtnIngenieraQumica.setBounds(20, 175, 154, 23);
				panel.add(rdbtnIngenieraQumica);
			}
			{
				JRadioButton rdbtnIngenieraSanitaria = new JRadioButton("Ingenier\u00EDa Sanitaria");
				rdbtnIngenieraSanitaria.setBackground(new Color(248, 248, 255));
				rdbtnIngenieraSanitaria.setActionCommand("Ingenier\u00EDa Civil");
				rdbtnIngenieraSanitaria.setBounds(20, 201, 154, 23);
				panel.add(rdbtnIngenieraSanitaria);
			}
			{
				JRadioButton rdbtnIngenieraEnSistemas = new JRadioButton("Ingenier\u00EDa en Sistemas");
				rdbtnIngenieraEnSistemas.setBackground(new Color(248, 248, 255));
				rdbtnIngenieraEnSistemas.setActionCommand("Ingenier\u00EDa Civil");
				rdbtnIngenieraEnSistemas.setBounds(20, 227, 212, 23);
				panel.add(rdbtnIngenieraEnSistemas);
			}
			{
				JRadioButton rdbtnIngenieraEnTelecomunicaciones = new JRadioButton("Ingenier\u00EDa en Telecomunicaciones");
				rdbtnIngenieraEnTelecomunicaciones.setBackground(new Color(248, 248, 255));
				rdbtnIngenieraEnTelecomunicaciones.setActionCommand("Ingenier\u00EDa Civil");
				rdbtnIngenieraEnTelecomunicaciones.setBounds(20, 253, 231, 23);
				panel.add(rdbtnIngenieraEnTelecomunicaciones);
			}
			{
				JRadioButton rdbtnIngenieraAgronmica = new JRadioButton("Ingenier\u00EDa Agron\u00F3mica");
				rdbtnIngenieraAgronmica.setBackground(new Color(248, 248, 255));
				rdbtnIngenieraAgronmica.setActionCommand("Ingenier\u00EDa Civil");
				rdbtnIngenieraAgronmica.setBounds(20, 19, 154, 23);
				panel.add(rdbtnIngenieraAgronmica);
			}
		}
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "Ciencias", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBackground(new Color(248, 248, 255));
			panel.setBounds(317, 11, 254, 214);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JRadioButton rdbtnEconmicas = new JRadioButton("Biol\u00F3gicas");
				rdbtnEconmicas.setBackground(new Color(248, 248, 255));
				rdbtnEconmicas.setActionCommand("Ingenier\u00EDa Civil");
				rdbtnEconmicas.setBounds(20, 46, 154, 23);
				panel.add(rdbtnEconmicas);
			}
			{
				JRadioButton rdbtnEconmicas_1 = new JRadioButton("Econ\u00F3micas");
				rdbtnEconmicas_1.setBackground(new Color(248, 248, 255));
				rdbtnEconmicas_1.setActionCommand("Ingenier\u00EDa Civil");
				rdbtnEconmicas_1.setBounds(20, 72, 154, 23);
				panel.add(rdbtnEconmicas_1);
			}
			{
				JRadioButton rdbtnEmpresariales = new JRadioButton("Empresariales");
				rdbtnEmpresariales.setBackground(new Color(248, 248, 255));
				rdbtnEmpresariales.setActionCommand("Ingenier\u00EDa Civil");
				rdbtnEmpresariales.setBounds(20, 98, 154, 23);
				panel.add(rdbtnEmpresariales);
			}
			{
				JRadioButton rdbtnQumicas = new JRadioButton("Qu\u00EDmicas");
				rdbtnQumicas.setBackground(new Color(248, 248, 255));
				rdbtnQumicas.setActionCommand("Ingenier\u00EDa Civil");
				rdbtnQumicas.setBounds(20, 150, 154, 23);
				panel.add(rdbtnQumicas);
			}
			{
				JRadioButton rdbtnSociales = new JRadioButton("Sociales");
				rdbtnSociales.setBackground(new Color(248, 248, 255));
				rdbtnSociales.setActionCommand("Ingenier\u00EDa Civil");
				rdbtnSociales.setBounds(20, 176, 154, 23);
				panel.add(rdbtnSociales);
			}
			{
				JRadioButton rdbtnMedioAmbiente = new JRadioButton("Medio Ambiente");
				rdbtnMedioAmbiente.setBackground(new Color(248, 248, 255));
				rdbtnMedioAmbiente.setActionCommand("Ingenier\u00EDa Civil");
				rdbtnMedioAmbiente.setBounds(20, 124, 154, 23);
				panel.add(rdbtnMedioAmbiente);
			}
			{
				JRadioButton rdbtnAeronutica = new JRadioButton("Aeron\u00E1utica");
				rdbtnAeronutica.setBackground(new Color(248, 248, 255));
				rdbtnAeronutica.setActionCommand("Ingenier\u00EDa Civil");
				rdbtnAeronutica.setBounds(20, 20, 154, 23);
				panel.add(rdbtnAeronutica);
			}
		}
		{
			JPanel panel = new JPanel();
			panel.setLayout(null);
			panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Administraci\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBackground(new Color(248, 248, 255));
			panel.setBounds(40, 11, 255, 214);
			contentPanel.add(panel);
			{
				JRadioButton rdbtnAltaGerencia = new JRadioButton("Alta Gerencia");
				rdbtnAltaGerencia.setBackground(new Color(248, 248, 255));
				rdbtnAltaGerencia.setActionCommand("Ingenier\u00EDa Civil");
				rdbtnAltaGerencia.setBounds(20, 20, 231, 23);
				panel.add(rdbtnAltaGerencia);
			}
			{
				JRadioButton rdbtnContabilidad = new JRadioButton("Contabilidad");
				rdbtnContabilidad.setBackground(new Color(248, 248, 255));
				rdbtnContabilidad.setActionCommand("Ingenier\u00EDa Civil");
				rdbtnContabilidad.setBounds(20, 46, 154, 23);
				panel.add(rdbtnContabilidad);
			}
			{
				JRadioButton rdbtnDocumentacin = new JRadioButton("Documentaci\u00F3n");
				rdbtnDocumentacin.setBackground(new Color(248, 248, 255));
				rdbtnDocumentacin.setActionCommand("Ingenier\u00EDa Civil");
				rdbtnDocumentacin.setBounds(20, 72, 154, 23);
				panel.add(rdbtnDocumentacin);
			}
			{
				JRadioButton rdbtnGestin = new JRadioButton("Gesti\u00F3n");
				rdbtnGestin.setBackground(new Color(248, 248, 255));
				rdbtnGestin.setActionCommand("Ingenier\u00EDa Civil");
				rdbtnGestin.setBounds(20, 98, 154, 23);
				panel.add(rdbtnGestin);
			}
			{
				JRadioButton rdbtnHoteleria = new JRadioButton("Hoteleria");
				rdbtnHoteleria.setBackground(new Color(248, 248, 255));
				rdbtnHoteleria.setActionCommand("Ingenier\u00EDa Civil");
				rdbtnHoteleria.setBounds(20, 124, 154, 23);
				panel.add(rdbtnHoteleria);
			}
			{
				JRadioButton rdbtnLogstica = new JRadioButton("Log\u00EDstica");
				rdbtnLogstica.setBackground(new Color(248, 248, 255));
				rdbtnLogstica.setActionCommand("Ingenier\u00EDa Civil");
				rdbtnLogstica.setBounds(20, 150, 154, 23);
				panel.add(rdbtnLogstica);
			}
			{
				JRadioButton rdbtnServiciosFinancieros = new JRadioButton("Servicios Financieros");
				rdbtnServiciosFinancieros.setBackground(new Color(248, 248, 255));
				rdbtnServiciosFinancieros.setActionCommand("Ingenier\u00EDa Civil");
				rdbtnServiciosFinancieros.setBounds(20, 176, 218, 23);
				panel.add(rdbtnServiciosFinancieros);
			}
		}
		{
			JPanel panel_1 = new JPanel();
			panel_1.setBounds(40, 354, 254, 286);
			contentPanel.add(panel_1);
			panel_1.setBorder(new TitledBorder(null, "Diversas", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_1.setBackground(new Color(248, 248, 255));
			panel_1.setLayout(null);
			{
				JRadioButton rdbtnDocencia = new JRadioButton("Docencia");
				rdbtnDocencia.setBackground(new Color(248, 248, 255));
				rdbtnDocencia.setActionCommand("Ingenier\u00EDa Civil");
				rdbtnDocencia.setBounds(20, 20, 154, 23);
				panel_1.add(rdbtnDocencia);
			}
			{
				JRadioButton rdbtnElectricidad = new JRadioButton("Electricidad");
				rdbtnElectricidad.setBackground(new Color(248, 248, 255));
				rdbtnElectricidad.setActionCommand("Ingenier\u00EDa Civil");
				rdbtnElectricidad.setBounds(20, 46, 154, 23);
				panel_1.add(rdbtnElectricidad);
			}
			{
				JRadioButton rdbtnElectrnica = new JRadioButton("Electr\u00F3nica");
				rdbtnElectrnica.setBackground(new Color(248, 248, 255));
				rdbtnElectrnica.setActionCommand("Ingenier\u00EDa Civil");
				rdbtnElectrnica.setBounds(20, 72, 154, 23);
				panel_1.add(rdbtnElectrnica);
			}
			{
				JRadioButton rdbtnIdiomas = new JRadioButton("Idiomas");
				rdbtnIdiomas.setBackground(new Color(248, 248, 255));
				rdbtnIdiomas.setActionCommand("Ingenier\u00EDa Civil");
				rdbtnIdiomas.setBounds(20, 98, 154, 23);
				panel_1.add(rdbtnIdiomas);
			}
			{
				JRadioButton rdbtnPsicologa = new JRadioButton("Psicolog\u00EDa");
				rdbtnPsicologa.setBackground(new Color(248, 248, 255));
				rdbtnPsicologa.setActionCommand("Ingenier\u00EDa Civil");
				rdbtnPsicologa.setBounds(20, 124, 154, 23);
				panel_1.add(rdbtnPsicologa);
			}
			{
				JRadioButton rdbtnSeguridad = new JRadioButton("Seguridad");
				rdbtnSeguridad.setBackground(new Color(248, 248, 255));
				rdbtnSeguridad.setActionCommand("Ingenier\u00EDa Civil");
				rdbtnSeguridad.setBounds(20, 150, 154, 23);
				panel_1.add(rdbtnSeguridad);
			}
			{
				JRadioButton rdbtnServiciosDomsticos = new JRadioButton("Servicios Dom\u00E9sticos");
				rdbtnServiciosDomsticos.setBackground(new Color(248, 248, 255));
				rdbtnServiciosDomsticos.setActionCommand("Ingenier\u00EDa Civil");
				rdbtnServiciosDomsticos.setBounds(20, 176, 154, 23);
				panel_1.add(rdbtnServiciosDomsticos);
			}
			{
				JRadioButton rdbtnSoporteTcnico = new JRadioButton("Soporte T\u00E9cnico");
				rdbtnSoporteTcnico.setBackground(new Color(248, 248, 255));
				rdbtnSoporteTcnico.setActionCommand("Ingenier\u00EDa Civil");
				rdbtnSoporteTcnico.setBounds(20, 202, 154, 23);
				panel_1.add(rdbtnSoporteTcnico);
			}
			{
				JRadioButton rdbtnTransporte = new JRadioButton("Transporte ");
				rdbtnTransporte.setBackground(new Color(248, 248, 255));
				rdbtnTransporte.setActionCommand("Ingenier\u00EDa Civil");
				rdbtnTransporte.setBounds(20, 228, 154, 23);
				panel_1.add(rdbtnTransporte);
			}
			{
				JRadioButton rdbtnTurismo = new JRadioButton("Turismo");
				rdbtnTurismo.setBackground(new Color(248, 248, 255));
				rdbtnTurismo.setActionCommand("Ingenier\u00EDa Civil");
				rdbtnTurismo.setBounds(20, 254, 154, 23);
				panel_1.add(rdbtnTurismo);
			}
		}
		{
			JPanel panel = new JPanel();
			panel.setBounds(316, 236, 255, 107);
			contentPanel.add(panel);
			panel.setBorder(new TitledBorder(null, "Mercado", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBackground(new Color(248, 248, 255));
			panel.setLayout(null);
			{
				JRadioButton rdbtnInvestigacinDeMercado = new JRadioButton("Investigaci\u00F3n de Mercado");
				rdbtnInvestigacinDeMercado.setBackground(new Color(248, 248, 255));
				rdbtnInvestigacinDeMercado.setActionCommand("Ingenier\u00EDa Civil");
				rdbtnInvestigacinDeMercado.setBounds(20, 20, 231, 23);
				panel.add(rdbtnInvestigacinDeMercado);
			}
			{
				JRadioButton rdbtnTelemarketing = new JRadioButton("Telemarketing");
				rdbtnTelemarketing.setBackground(new Color(248, 248, 255));
				rdbtnTelemarketing.setActionCommand("Ingenier\u00EDa Civil");
				rdbtnTelemarketing.setBounds(20, 46, 154, 23);
				panel.add(rdbtnTelemarketing);
			}
			{
				JRadioButton rdbtnVentas = new JRadioButton("Ventas");
				rdbtnVentas.setBackground(new Color(248, 248, 255));
				rdbtnVentas.setActionCommand("Ingenier\u00EDa Civil");
				rdbtnVentas.setBounds(20, 72, 154, 23);
				panel.add(rdbtnVentas);
			}
		}
		{
			JPanel panel_1 = new JPanel();
			panel_1.setBounds(40, 236, 255, 107);
			contentPanel.add(panel_1);
			panel_1.setLayout(null);
			panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Atenci\u00F3n al Cliente", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_1.setBackground(new Color(248, 248, 255));
			{
				JRadioButton rdbtnRecepcin = new JRadioButton("Secretariado");
				rdbtnRecepcin.setBackground(new Color(248, 248, 255));
				rdbtnRecepcin.setActionCommand("Ingenier\u00EDa Civil");
				rdbtnRecepcin.setBounds(20, 20, 231, 23);
				panel_1.add(rdbtnRecepcin);
			}
			{
				JRadioButton rdbtnRecepcin_1 = new JRadioButton("Recepci\u00F3n");
				rdbtnRecepcin_1.setBackground(new Color(248, 248, 255));
				rdbtnRecepcin_1.setActionCommand("Ingenier\u00EDa Civil");
				rdbtnRecepcin_1.setBounds(20, 46, 154, 23);
				panel_1.add(rdbtnRecepcin_1);
			}
			{
				JRadioButton rdbtnRecursosHumanos = new JRadioButton("Recursos Humanos");
				rdbtnRecursosHumanos.setBackground(new Color(248, 248, 255));
				rdbtnRecursosHumanos.setActionCommand("Ingenier\u00EDa Civil");
				rdbtnRecursosHumanos.setBounds(20, 72, 154, 23);
				panel_1.add(rdbtnRecursosHumanos);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(248, 248, 255));
			buttonPane.setLayout(new FlowLayout(FlowLayout.CENTER));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Aceptar ");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				okButton.setIcon(new ImageIcon(DisponibleAreas.class.getResource("/InterfazGrafica/Images/botonsi.png")));
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
	}
}
