package cibertec;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JDialog;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class MenuAdmin extends JDialog implements MouseListener {
	private JPanel panel;
	private JLabel lblMantenimiento;
	private JLabel lblV;
	private JLabel lblM0;
	private JLabel lblMantenimiento_1;
	private JLabel label;
	private JLabel lblM2;
	private JSeparator separator;
	private JSeparator separator_1;
	private JLabel lbl3;
	private JLabel lbl4;
	private JLabel lblCerrar;
	private JLabel lblSuspender;
	private JSeparator separator_3;
	private JLabel lblAcercaDeLa;
	private JLabel lblVerManualDe;
	private JSeparator separator_4;
	private JSeparator separator_5;
	private JLabel lblMensaje;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuAdmin dialog = new MenuAdmin();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the dialog.
	 */
	public MenuAdmin() {
		setUndecorated(true);
		setBounds(100, 100, 804, 499);
		getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(0, 0, 804, 499);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		lblMantenimiento = new JLabel("");
		lblMantenimiento.setIcon(new ImageIcon(MenuAdmin.class.getResource("/icons/1287509 - tools.png")));
		lblMantenimiento.setBackground(new Color(0, 128, 128));
		lblMantenimiento.setBounds(283, 99, 103, 71);
		panel.add(lblMantenimiento);
		lblMantenimiento.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblV = new JLabel("VENTAS");
		lblV.setBounds(496, 170, 89, 14);
		panel.add(lblV);
		lblV.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblM0 = new JLabel("CONSULTAR MALETAS");
		lblM0.addMouseListener(this);
		lblM0.setForeground(new Color(255, 255, 255));
		lblM0.setBackground(new Color(156, 184, 186));
		lblM0.setBounds(267, 226, 140, 27);
		lblM0.setFont(new Font("Yu Gothic UI", Font.BOLD, 12));
		panel.add(lblM0);
		lblM0.setOpaque(true);
		lblM0.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblMantenimiento_1 = new JLabel("MANTENIMIENTO");
		lblMantenimiento_1.addMouseListener(this);
		lblMantenimiento_1.setBounds(267, 170, 132, 14);
		panel.add(lblMantenimiento_1);
		lblMantenimiento_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon(MenuAdmin.class.getResource("/icons/1287532 - chart.png")));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBackground(new Color(0, 128, 128));
		label.setBounds(486, 99, 103, 71);
		panel.add(label);
		
		lblM2 = new JLabel("LISTAR MALETAS");
		lblM2.addMouseListener(this);
		lblM2.setOpaque(true);
		lblM2.setHorizontalAlignment(SwingConstants.CENTER);
		lblM2.setForeground(Color.WHITE);
		lblM2.setFont(new Font("Yu Gothic UI", Font.BOLD, 12));
		lblM2.setBackground(new Color(156, 184, 186));
		lblM2.setBounds(267, 264, 140, 27);
		
		lblM2.setVisible(true);
		panel.add(lblM2);
		
		separator = new JSeparator();
		separator.setBackground(new Color(0, 128, 128));
		separator.setBounds(277, 195, 109, 20);
		panel.add(separator);
		
		separator_1 = new JSeparator();
		separator_1.setBackground(new Color(0, 128, 128));
		separator_1.setBounds(476, 195, 109, 20);
		panel.add(separator_1);
		
		lbl3 = new JLabel("VENDER");
		lbl3.addMouseListener(this);
		lbl3.setOpaque(true);
		lbl3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl3.setForeground(Color.WHITE);
		lbl3.setFont(new Font("Yu Gothic UI", Font.BOLD, 12));
		lbl3.setBackground(new Color(35, 190, 82));
		lbl3.setBounds(463, 226, 140, 27);
		panel.add(lbl3);
		
		lbl4 = new JLabel("GENERAR REPORTES");
		lbl4.addMouseListener(this);
		lbl4.setOpaque(true);
		lbl4.setHorizontalAlignment(SwingConstants.CENTER);
		lbl4.setForeground(Color.WHITE);
		lbl4.setFont(new Font("Yu Gothic UI", Font.BOLD, 12));
		lbl4.setBackground(new Color(35, 190, 82));
		lbl4.setBounds(463, 264, 140, 27);
		panel.add(lbl4);
		
		lblCerrar = new JLabel("X");
		lblCerrar.addMouseListener(this);
		lblCerrar.setOpaque(true);
		lblCerrar.setHorizontalAlignment(SwingConstants.CENTER);
		lblCerrar.setForeground(new Color(33, 63, 86));
		lblCerrar.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblCerrar.setBounds(772, 0, 32, 25);
		panel.add(lblCerrar);
		
		lblSuspender = new JLabel("Suspender");
		lblSuspender.setFont(new Font("Yu Gothic UI", Font.PLAIN, 10));
		lblSuspender.addMouseListener(this);
		lblSuspender.setIcon(new ImageIcon(MenuAdmin.class.getResource("/icons/Suspender.png")));
		lblSuspender.setBounds(695, 31, 109, 32);
		panel.add(lblSuspender);
		lblSuspender.setOpaque(true);
		
		separator_3 = new JSeparator();
		separator_3.setBackground(Color.LIGHT_GRAY);
		separator_3.setBounds(729, 53, 54, 20);
		panel.add(separator_3);
		
		lblAcercaDeLa = new JLabel("Acerca de la tienda ");
		lblAcercaDeLa.addMouseListener(this);
		lblAcercaDeLa.setForeground(new Color(0, 0, 205));
		lblAcercaDeLa.setOpaque(true);
		lblAcercaDeLa.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 11));
		lblAcercaDeLa.setBounds(11, 406, 132, 32);
		panel.add(lblAcercaDeLa);
		
		lblVerManualDe = new JLabel("Ver manual de usuario");
		lblVerManualDe.addMouseListener(this);
		lblVerManualDe.setForeground(new Color(0, 0, 205));
		lblVerManualDe.setOpaque(true);
		lblVerManualDe.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 11));
		lblVerManualDe.setBounds(11, 445, 131, 32);
		panel.add(lblVerManualDe);
		
		separator_4 = new JSeparator();
		separator_4.setBackground(Color.LIGHT_GRAY);
		separator_4.setBounds(11, 430, 109, 20);
		panel.add(separator_4);
		
		separator_5 = new JSeparator();
		separator_5.setBackground(Color.LIGHT_GRAY);
		separator_5.setBounds(14, 468, 129, 20);
		panel.add(separator_5);
		
		lblMensaje = new JLabel("");
		lblMensaje.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 15));
		lblMensaje.setBounds(680, 419, 124, 26);
		panel.add(lblMensaje);
		
		

	}
	public void mouseClicked(MouseEvent arg0) {
		if (arg0.getSource() == lblVerManualDe) {
			mouseClickedLblVerManualDe(arg0);
		}
		if (arg0.getSource() == lblAcercaDeLa) {
			mouseClickedLblAcercaDeLa(arg0);
		}
		if (arg0.getSource() == lblSuspender) {
			mouseClickedLblSuspender(arg0);
		}
		if (arg0.getSource() == lblCerrar) {
			mouseClickedCerrar(arg0);
		}
		if (arg0.getSource() == lbl4) {
			mouseClickedLbl4(arg0);
		}
		if (arg0.getSource() == lbl3) {
			mouseClickedLbl3(arg0);
		}
		if (arg0.getSource() == lblM2) {
			mouseClickedLabel_3(arg0);
		}
		if (arg0.getSource() == lblM0) {
			mouseClickedLblConsultarMaletas(arg0);
		}
	}
	
	
	
	public void mouseEntered(MouseEvent e) {
		if (e.getSource() == lblM0) {
			mouseEnteredLblMantenimiento_1(e);
			lblM0.setBackground(new Color (22,42,57));
			lblM0.setOpaque(true);
		}
		if (e.getSource() == lblM2) {
			mouseEnteredLblMantenimiento_1(e);
			lblM2.setBackground(new Color (22,42,57));
			lblM2.setOpaque(true);
		}
		
		if (e.getSource() == lbl3) {
			mouseEnteredLblMantenimiento_1(e);
			lbl3.setBackground(new Color (21, 117, 50));
			lbl3.setOpaque(true);
		}
		if (e.getSource() == lbl4) {
			mouseEnteredLblMantenimiento_1(e);
			lbl4.setBackground(new Color (21, 117, 50));
			lbl4.setOpaque(true);
		}
		if (e.getSource() == lblCerrar) {
			mouseEnteredLblMantenimiento_1(e);
			lblCerrar.setBackground(new Color (255, 0, 0));
			lblCerrar.setForeground(Color.WHITE);
			lblCerrar.setOpaque(true);
		}
		if (e.getSource() == lblSuspender) {
			mouseEnteredLblMantenimiento_1(e);
			lblSuspender.setForeground(Color.LIGHT_GRAY);
			lblSuspender.setOpaque(false);
		}
		if (e.getSource() == lblAcercaDeLa) {
			mouseEnteredLblMantenimiento_1(e);
			lblAcercaDeLa.setForeground(new Color(0, 0, 205));
			lblAcercaDeLa.setOpaque(false);
		}
		if (e.getSource() == lblVerManualDe) {
			mouseEnteredLblMantenimiento_1(e);
			lblVerManualDe.setForeground(new Color(0, 0, 205));
			lblVerManualDe.setOpaque(false);
		}
		
	}
	
	public void mouseExited(MouseEvent e) {
		if (e.getSource() == lblM0) {
			mouseEnteredLblMantenimiento_1(e);
			lblM0.setBackground(new Color(156, 184, 186));
			lblM0.setOpaque(true);
		}
		if (e.getSource() == lblM2) {
			mouseEnteredLblMantenimiento_1(e);
			lblM2.setBackground(new Color(156, 184, 186));
			lblM2.setOpaque(true);
		}
		if (e.getSource() == lbl3) {
			mouseEnteredLblMantenimiento_1(e);
			lbl3.setBackground(new Color(35, 190, 82));
			lbl3.setOpaque(true);
		}
		if (e.getSource() == lbl4) {
			mouseEnteredLblMantenimiento_1(e);
			lbl4.setBackground(new Color(35, 190, 82));
			lbl4.setOpaque(true);
		}
		if (e.getSource() == lblCerrar) {
			mouseEnteredLblMantenimiento_1(e);
			lblCerrar.setBackground(new Color(253, 187, 103));
			lblCerrar.setForeground(Color.BLACK);
			lblCerrar.setOpaque(false);
		}
		if (e.getSource() == lblSuspender) {
			mouseEnteredLblMantenimiento_1(e);
			lblSuspender.setForeground(Color.BLACK);
			lblSuspender.setOpaque(true);
			}
		if (e.getSource() == lblAcercaDeLa) {
			mouseEnteredLblMantenimiento_1(e);
			lblAcercaDeLa.setForeground(Color.BLUE);
			lblAcercaDeLa.setOpaque(true);
		}
		if (e.getSource() == lblVerManualDe) {
			mouseEnteredLblMantenimiento_1(e);
			lblVerManualDe.setForeground(Color.BLUE);
			lblVerManualDe.setOpaque(true);
		}
		
	}
	public void mousePressed(MouseEvent e) {
	}
	public void mouseReleased(MouseEvent e) {
	}
	protected void mouseClickedLblConsultarMaletas(MouseEvent arg0) {
		ConsultarMaletas ven = new ConsultarMaletas();
		ven.setVisible(true);
	}
	
	protected void mouseClickedCerrar(MouseEvent arg0) {
		setVisible(false);
		
	}
	protected void mouseClickedLabel_3(MouseEvent arg0) {
		ListarMaletas ven = new ListarMaletas();
		ven.setVisible(true);
	}
	protected void mouseEnteredLblMantenimiento_1(MouseEvent e) {
	}
	protected void mouseClickedLbl3(MouseEvent arg0) {
		Vender ven = new Vender();
		ven.setVisible(true);
	}
	protected void mouseClickedLbl4(MouseEvent arg0) {
		Reportes ven = new Reportes();
		ven.setVisible(true);
	}
	protected void mouseClickedLblSuspender(MouseEvent arg0) {
		Login ven = new Login();
		ven.setVisible(true);
		setVisible(false);
	}
	protected void mouseClickedLblAcercaDeLa(MouseEvent arg0) {
		Tienda ven = new Tienda();
		ven.setVisible(true);
		
	}
	protected void mouseClickedLblVerManualDe(MouseEvent arg0) {
	}
}
