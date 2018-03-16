package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class ConsultarMaletas extends JDialog implements ActionListener, MouseListener {
	private JComboBox cboCodigo;
	private JLabel lblCdigo;
	private JLabel lblModelo;
	private JLabel lblPrecioS;
	private JLabel lblAnchocm;
	private JLabel lblAltocm;
	private JLabel lblFondocm;
	private JTextField txtModelo;
	private JTextField txtPrecio;
	private JTextField txtAncho;
	private JTextField txtAlto;
	private JTextField txtFondo;
	private JLabel lblConsultarMaletas;
	private JSeparator separator;
	private JSeparator separator_1;
	private JSeparator separator_2;
	private JSeparator separator_3;
	private JSeparator separator_4;
	private JPanel panel;
	private JLabel lblCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultarMaletas dialog = new ConsultarMaletas();
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
	public ConsultarMaletas() {
		getContentPane().setForeground(new Color(128, 128, 128));
		setUndecorated(true);
		setResizable(false);
		getContentPane().setBackground(new Color(255, 255, 255));
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(ConsultarMaletas.class.getResource("/imagenes/30-48.png")));
		setTitle("Consultar Maletas");
		setBounds(100, 100, 636, 445);
		getContentPane().setLayout(null);
		
		separator = new JSeparator();
		separator.setToolTipText("");
		separator.setForeground(new Color(0, 0, 0));
		separator.setBackground(new Color(128, 128, 128));
		separator.setBounds(224, 351, 278, 2);
		getContentPane().add(separator);
		
		separator_4 = new JSeparator();
		separator_4.setToolTipText("");
		separator_4.setForeground(new Color(0, 0, 0));
		separator_4.setBackground(new Color(128, 128, 128));
		separator_4.setBounds(224, 125, 278, 226);
		getContentPane().add(separator_4);
		
		separator_3 = new JSeparator();
		separator_3.setToolTipText("");
		separator_3.setForeground(new Color(0, 0, 0));
		separator_3.setBackground(new Color(128, 128, 128));
		separator_3.setBounds(224, 183, 278, 168);
		getContentPane().add(separator_3);
		
		separator_2 = new JSeparator();
		separator_2.setToolTipText("");
		separator_2.setForeground(new Color(0, 0, 0));
		separator_2.setBackground(new Color(128, 128, 128));
		separator_2.setBounds(224, 231, 278, 120);
		getContentPane().add(separator_2);
		
		separator_1 = new JSeparator();
		separator_1.setToolTipText("");
		separator_1.setForeground(new Color(0, 0, 0));
		separator_1.setBackground(new Color(128, 128, 128));
		separator_1.setBounds(224, 287, 278, 64);
		getContentPane().add(separator_1);
		
		lblModelo = new JLabel("Modelo");
		lblModelo.addMouseListener(this);
		lblModelo.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 14));
		lblModelo.setForeground(new Color(0, 0, 0));
		lblModelo.setBounds(224, 80, 120, 14);
		getContentPane().add(lblModelo);
		
		lblPrecioS = new JLabel("Precio (S/)");
		lblPrecioS.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 14));
		lblPrecioS.setForeground(new Color(0, 0, 0));
		lblPrecioS.setBounds(224, 136, 120, 14);
		getContentPane().add(lblPrecioS);
		
		lblAnchocm = new JLabel("Ancho(cm)");
		lblAnchocm.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 14));
		lblAnchocm.setForeground(new Color(0, 0, 0));
		lblAnchocm.setBounds(224, 194, 120, 14);
		getContentPane().add(lblAnchocm);
		
		lblAltocm = new JLabel("Alto (cm)");
		lblAltocm.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 14));
		lblAltocm.setForeground(new Color(0, 0, 0));
		lblAltocm.setBounds(224, 242, 120, 14);
		getContentPane().add(lblAltocm);
		
		lblFondocm = new JLabel("Fondo (cm)");
		lblFondocm.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 14));
		lblFondocm.setForeground(new Color(0, 0, 0));
		lblFondocm.setBounds(224, 298, 120, 14);
		getContentPane().add(lblFondocm);
		
		txtModelo = new JTextField(""+BaseDatos.modelo0);
		txtModelo.setBorder(null);
		txtModelo.setBackground(new Color(0, 0, 0));
		txtModelo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtModelo.setEditable(false);
		txtModelo.setForeground(new Color(0, 0, 0));
		txtModelo.setBounds(258, 105, 86, 20);
		getContentPane().add(txtModelo);
		txtModelo.setColumns(10);
		
		txtPrecio = new JTextField(""+BaseDatos.precio0);
		txtPrecio.setBorder(null);
		txtPrecio.setBackground(new Color(0, 0, 0));
		txtPrecio.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtPrecio.setEditable(false);
		txtPrecio.setForeground(new Color(0, 0, 0));
		txtPrecio.setBounds(258, 160, 86, 20);
		getContentPane().add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtAncho = new JTextField(""+BaseDatos.ancho0);
		txtAncho.setBorder(null);
		txtAncho.setBackground(new Color(0, 0, 0));
		txtAncho.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtAncho.setEditable(false);
		txtAncho.setForeground(new Color(0, 0, 0));
		txtAncho.setBounds(258, 211, 86, 20);
		getContentPane().add(txtAncho);
		txtAncho.setColumns(10);
		
		txtAlto = new JTextField(""+BaseDatos.alto0);
		txtAlto.setBorder(null);
		txtAlto.setBackground(new Color(0, 0, 0));
		txtAlto.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtAlto.setEditable(false);
		txtAlto.setForeground(new Color(0, 0, 0));
		txtAlto.setBounds(258, 267, 86, 20);
		getContentPane().add(txtAlto);
		txtAlto.setColumns(10);
		
		txtFondo = new JTextField(""+BaseDatos.fondo0);
		txtFondo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtFondo.setEditable(false);
		txtFondo.setForeground(new Color(0, 0, 0));
		txtFondo.setBounds(258, 329, 86, 20);
		getContentPane().add(txtFondo);
		txtFondo.setColumns(10);
		txtFondo.setBorder(null);
		txtAncho.setOpaque(false);
		txtFondo.setOpaque(false);
		txtAlto.setOpaque(false);
		txtPrecio.setOpaque(false);
		txtModelo.setOpaque(false);
		
		
		lblConsultarMaletas = new JLabel("CONSULTAR MALETAS");
		lblConsultarMaletas.setBounds(184, 11, 344, 34);
		getContentPane().add(lblConsultarMaletas);
		lblConsultarMaletas.setBackground(new Color(128, 128, 128));
		lblConsultarMaletas.setForeground(new Color(128, 128, 128));
		lblConsultarMaletas.setFont(new Font("Segoe UI Light", Font.BOLD, 25));
		
		panel = new JPanel();
		panel.setBackground(new Color(64, 144, 206));
		panel.setBounds(0, 0, 174, 445);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		lblCdigo = new JLabel("C\u00F3digo");
		lblCdigo.setBounds(58, 91, 49, 22);
		panel.add(lblCdigo);
		lblCdigo.setForeground(new Color(240, 248, 255));
		lblCdigo.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 16));
		
		cboCodigo = new JComboBox();
		cboCodigo.setBounds(10, 124, 154, 31);
		panel.add(cboCodigo);
		cboCodigo.setFont(new Font("Segoe UI Light", Font.BOLD, 16));
		cboCodigo.addActionListener(this);
		cboCodigo.setModel(new DefaultComboBoxModel(new String[] {"MT0", "MT1", "MT2", "MT3", "MT4"}));
		cboCodigo.setOpaque(false);
		cboCodigo.setBorder(null);
		
		lblCerrar = new JLabel("X");
		lblCerrar.setBackground(new Color(255, 255, 255));
		lblCerrar.addMouseListener(this);
		lblCerrar.setOpaque(true);
		lblCerrar.setHorizontalAlignment(SwingConstants.CENTER);
		lblCerrar.setForeground(new Color(33, 63, 86));
		lblCerrar.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblCerrar.setBounds(604, 0, 32, 25);
		getContentPane().add(lblCerrar);
		

	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == cboCodigo) {
			actionPerformedCboCodigo(arg0);
		}
	}
	protected void actionPerformedCboCodigo(ActionEvent arg0) {
		
		int codigo=0;
		
		codigo=obtenerCodigo();
		mostrarContinido(codigo);
		
		
		
		
		
		
		
		
		
	}
	
	int obtenerCodigo(){
		return cboCodigo.getSelectedIndex();
		
	}
	void mostrarContinido(int n){
		switch (n){
		case 0:
			txtModelo.setText(""+BaseDatos.modelo0);
			txtPrecio.setText(""+BaseDatos.precio0);
			txtAncho.setText(""+BaseDatos.ancho0);
			txtAlto.setText(""+BaseDatos.alto0);
			txtFondo.setText(""+BaseDatos.fondo0);
			break;
		case 1:
			txtModelo.setText(""+BaseDatos.modelo1);
			txtPrecio.setText(""+BaseDatos.precio1);
			txtAncho.setText(""+BaseDatos.ancho1);
			txtAlto.setText(""+BaseDatos.alto1);
			txtFondo.setText(""+BaseDatos.fondo1);
			break;
		case 2:
			txtModelo.setText(""+BaseDatos.modelo2);
			txtPrecio.setText(""+BaseDatos.precio2);
			txtAncho.setText(""+BaseDatos.ancho2);
			txtAlto.setText(""+BaseDatos.alto2);
			txtFondo.setText(""+BaseDatos.fondo2);
			break;
		case 3:
			txtModelo.setText(""+BaseDatos.modelo3);
			txtPrecio.setText(""+BaseDatos.precio3);
			txtAncho.setText(""+BaseDatos.ancho3);
			txtAlto.setText(""+BaseDatos.alto3);
			txtFondo.setText(""+BaseDatos.fondo3);
			break;
		case 4:
			txtModelo.setText(""+BaseDatos.modelo4);
			txtPrecio.setText(""+BaseDatos.precio4);
			txtAncho.setText(""+BaseDatos.ancho4);
			txtAlto.setText(""+BaseDatos.alto4);
			txtFondo.setText(""+BaseDatos.fondo4);
			break;
		}
	}
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == lblCerrar) {
			mouseClickedLabel(e);
		}
	}
	public void mouseEntered(MouseEvent e) {
		if (e.getSource() == lblModelo) {
			mouseEnteredLblModelo(e);
		}
		if (e.getSource() == lblCerrar) {
			mouseEnteredLblModelo(e);
			lblCerrar.setBackground(new Color (255, 0, 0));
			lblCerrar.setForeground(Color.WHITE);
			lblCerrar.setOpaque(true);
		}
	}
	public void mouseExited(MouseEvent e) {
		if (e.getSource() == lblCerrar) {
			mouseEnteredLblModelo(e);
			lblCerrar.setBackground(new Color(253, 187, 103));
			lblCerrar.setForeground(Color.BLACK);
			lblCerrar.setOpaque(false);
		}
	}
	public void mousePressed(MouseEvent e) {
	}
	public void mouseReleased(MouseEvent e) {
	}
	protected void mouseClickedLabel(MouseEvent e) {
		setVisible(false);
	}
	protected void mouseEnteredLblModelo(MouseEvent e) {
	}
}
