package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.JSeparator;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class ModificarMaleta extends JDialog implements ActionListener, MouseListener {
	private JComboBox cboCodigo;
	private JLabel lblModelo;
	private JLabel lblPrecio;
	private JLabel lblAnchocm;
	private JLabel lblAltocm;
	private JLabel lblFondocm;
	private JTextField txtModelo;
	private JTextField txtPrecio;
	private JTextField txtAncho;
	private JTextField txtAlto;
	private JTextField txtFondo;
	private JButton btnGrabar;
	private JLabel lblModificarMaletas;
	private JSeparator separator;
	private JSeparator separator_1;
	private JSeparator separator_2;
	private JSeparator separator_3;
	private JSeparator separator_4;
	private JLabel lblMensaje;
	private JPanel panel;
	private JLabel label;
	private JLabel lblCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModificarMaleta dialog = new ModificarMaleta();
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
	public ModificarMaleta() {
		setUndecorated(true);
		
		getContentPane().setBackground(new Color(255, 255, 255));
		setTitle("Modificar Maleta");
		setBounds(100, 100, 636, 445);
		getContentPane().setLayout(null);
		
		lblMensaje = new JLabel("");
		lblMensaje.setForeground(new Color(0, 0, 0));
		lblMensaje.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 13));
		lblMensaje.setBounds(206, 394, 255, 20);
		getContentPane().add(lblMensaje);
		
		separator_1 = new JSeparator();
		separator_1.setBackground(new Color(128, 128, 128));
		separator_1.setForeground(new Color(0, 0, 0));
		separator_1.setBounds(206, 125, 290, 246);
		getContentPane().add(separator_1);
		
		separator_2 = new JSeparator();
		separator_2.setBackground(new Color(128, 128, 128));
		separator_2.setForeground(new Color(0, 0, 0));
		separator_2.setBounds(206, 252, 290, 119);
		getContentPane().add(separator_2);
		
		separator = new JSeparator();
		separator.setBackground(new Color(128, 128, 128));
		separator.setForeground(new Color(0, 0, 0));
		separator.setBounds(206, 186, 290, 185);
		getContentPane().add(separator);
		
		separator_3 = new JSeparator();
		separator_3.setBackground(new Color(128, 128, 128));
		separator_3.setForeground(new Color(0, 0, 0));
		separator_3.setBounds(206, 315, 290, 56);
		getContentPane().add(separator_3);
		
		separator_4 = new JSeparator();
		separator_4.setBackground(new Color(128, 128, 128));
		separator_4.setForeground(new Color(0, 0, 0));
		separator_4.setBounds(206, 371, 290, 2);
		getContentPane().add(separator_4);
		
		lblModificarMaletas = new JLabel("Modificar Maletas");
		lblModificarMaletas.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 28));
		lblModificarMaletas.setForeground(new Color(128, 128, 128));
		lblModificarMaletas.setBounds(184, 0, 263, 47);
		getContentPane().add(lblModificarMaletas);
		
		lblModelo = new JLabel("Modelo");
		lblModelo.addMouseListener(this);
		lblModelo.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 14));
		lblModelo.setForeground(new Color(0, 0, 0));
		lblModelo.setBounds(206, 75, 102, 14);
		getContentPane().add(lblModelo);
		
		lblPrecio = new JLabel("Precio");
		lblPrecio.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 14));
		lblPrecio.setForeground(new Color(0, 0, 0));
		lblPrecio.setBounds(206, 136, 102, 14);
		getContentPane().add(lblPrecio);
		
		lblAnchocm = new JLabel("Ancho (cm)");
		lblAnchocm.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 14));
		lblAnchocm.setForeground(new Color(0, 0, 0));
		lblAnchocm.setBounds(206, 197, 102, 14);
		getContentPane().add(lblAnchocm);
		
		lblAltocm = new JLabel("Alto (cm)");
		lblAltocm.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 14));
		lblAltocm.setForeground(new Color(0, 0, 0));
		lblAltocm.setBounds(206, 263, 102, 14);
		getContentPane().add(lblAltocm);
		
		lblFondocm = new JLabel("Fondo(cm)");
		lblFondocm.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 14));
		lblFondocm.setForeground(new Color(0, 0, 0));
		lblFondocm.setBounds(206, 314, 102, 14);
		getContentPane().add(lblFondocm);
		
		txtModelo = new JTextField(""+BaseDatos.modelo0);
		txtModelo.setForeground(new Color(0, 0, 0));
		txtModelo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtModelo.setEditable(false);
		txtModelo.setBounds(222, 105, 86, 20);
		getContentPane().add(txtModelo);
		txtModelo.setColumns(10);
		
		txtPrecio = new JTextField(""+BaseDatos.precio0);
		txtPrecio.setForeground(new Color(0, 0, 0));
		txtPrecio.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtPrecio.setBounds(222, 166, 86, 20);
		getContentPane().add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtAncho = new JTextField(""+BaseDatos.ancho0);
		txtAncho.setForeground(new Color(0, 0, 0));
		txtAncho.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtAncho.setBounds(222, 232, 86, 20);
		getContentPane().add(txtAncho);
		txtAncho.setColumns(10);
		
		txtAlto = new JTextField(""+BaseDatos.alto0);
		txtAlto.setForeground(new Color(0, 0, 0));
		txtAlto.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtAlto.setBounds(222, 295, 86, 20);
		getContentPane().add(txtAlto);
		txtAlto.setColumns(10);
		
		txtFondo = new JTextField(""+BaseDatos.fondo0);
		txtFondo.setForeground(new Color(0, 0, 0));
		txtFondo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtFondo.setBounds(222, 349, 86, 20);
		getContentPane().add(txtFondo);
		txtFondo.setColumns(10);

		txtAncho.setBorder(null);
		txtPrecio.setBorder(null);
		txtFondo.setBorder(null);
		txtModelo.setBorder(null);
		txtAlto.setBorder(null);
		
		txtAncho.setOpaque(false);
		txtFondo.setOpaque(false);
		txtAlto.setOpaque(false);
		txtPrecio.setOpaque(false);
		txtModelo.setOpaque(false);
		
		btnGrabar = new JButton("Grabar cambios");
		btnGrabar.setBackground(new Color(64, 144, 206));
		btnGrabar.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 15));
		btnGrabar.setForeground(new Color(255, 255, 255));
		btnGrabar.addActionListener(this);
		btnGrabar.setBounds(471, 403, 155, 23);
		
		getContentPane().add(btnGrabar);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(64, 144, 206));
		panel.setBounds(0, 0, 174, 445);
		getContentPane().add(panel);
		
		label = new JLabel("C\u00F3digo");
		label.setForeground(new Color(240, 248, 255));
		label.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 16));
		label.setBounds(58, 91, 49, 22);
		panel.add(label);
		
		cboCodigo = new JComboBox();
		cboCodigo.setBounds(10, 124, 141, 28);
		panel.add(cboCodigo);
		cboCodigo.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 15));
		cboCodigo.setForeground(new Color(0, 0, 51));
		cboCodigo.addActionListener(this);
		cboCodigo.setModel(new DefaultComboBoxModel(new String[] {"MT0", "MT1", "MT2", "MT3", "MT4"}));
		
		lblCerrar = new JLabel("X");
		lblCerrar.addMouseListener(this);
		lblCerrar.setOpaque(true);
		lblCerrar.setHorizontalAlignment(SwingConstants.CENTER);
		lblCerrar.setForeground(new Color(33, 63, 86));
		lblCerrar.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblCerrar.setBackground(Color.WHITE);
		lblCerrar.setBounds(604, 0, 32, 25);
		getContentPane().add(lblCerrar);

	}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnGrabar) {
			actionPerformedBtnGrabar(arg0);
		}
		if (arg0.getSource() == cboCodigo) {
			actionPerformedCboCodigo(arg0);
		}
	}
	protected void actionPerformedCboCodigo(ActionEvent arg0) {
		
		int codigo=0;
		
		codigo=ObtenerCodigo();
		mostrarContenido(codigo);
		
		
		
		
		
		
		
		
	}
	
	int ObtenerCodigo(){
		return cboCodigo.getSelectedIndex();
	}
	void mostrarContenido(int a){
		switch (a){
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
	void modificar(int n){
		switch (n){
		case 0:
			BaseDatos.modelo0=txtModelo.getText();
			BaseDatos.precio0=Double.parseDouble(txtPrecio.getText());
			BaseDatos.ancho0=Double.parseDouble(txtAncho.getText());
			BaseDatos.alto0=Double.parseDouble(txtAlto.getText());
			BaseDatos.fondo0=Double.parseDouble(txtFondo.getText());
			break;
		case 1:
			BaseDatos.modelo1=txtModelo.getText();
			BaseDatos.precio1=Double.parseDouble(txtPrecio.getText());
			BaseDatos.ancho1=Double.parseDouble(txtAncho.getText());
			BaseDatos.alto1=Double.parseDouble(txtAlto.getText());
			BaseDatos.fondo1=Double.parseDouble(txtFondo.getText());
			break;
		case 2:
			BaseDatos.modelo2=txtModelo.getText();
			BaseDatos.precio2=Double.parseDouble(txtPrecio.getText());
			BaseDatos.ancho2=Double.parseDouble(txtAncho.getText());
			BaseDatos.alto2=Double.parseDouble(txtAlto.getText());
			BaseDatos.fondo2=Double.parseDouble(txtFondo.getText());
			break;
		case 3:
			BaseDatos.modelo3=txtModelo.getText();
			BaseDatos.precio3=Double.parseDouble(txtPrecio.getText());
			BaseDatos.ancho3=Double.parseDouble(txtAncho.getText());
			BaseDatos.alto3=Double.parseDouble(txtAlto.getText());
			BaseDatos.fondo3=Double.parseDouble(txtFondo.getText());
			break;
		case 4:
			BaseDatos.modelo4=txtModelo.getText();
			BaseDatos.precio4=Double.parseDouble(txtPrecio.getText());
			BaseDatos.ancho4=Double.parseDouble(txtAncho.getText());
			BaseDatos.alto4=Double.parseDouble(txtAlto.getText());
			BaseDatos.fondo4=Double.parseDouble(txtFondo.getText());
			break;
	}
	}
	void borrar(){
		
		txtPrecio.setText("");
		txtAncho.setText("");
		txtAlto.setText("");
		txtFondo.setText("");
		
	}
	void mostrarMensaje(){
		String mensaje="Debe de llenar campos poder continuar *";
		//JOptionPane.showMessageDialog(null, mensaje);
		lblMensaje.setText(mensaje);
		txtPrecio.setText("*");
		txtAncho.setText("*");
		txtAlto.setText("*");
		txtFondo.setText("*");
	}
	protected void actionPerformedBtnGrabar(ActionEvent arg0) {
		
		String Caja2=txtPrecio.getText();
		String Caja3=txtAncho.getText();
		String Caja4=txtAlto.getText();
		String Caja5=txtFondo.getText();
		
		if ((Caja2.length()==0)&&(Caja3.length()==0)&&(Caja4.length()==0)&&(Caja5.length()==0)){
			mostrarMensaje();
			
			
		}
		else{
			int codigo=ObtenerCodigo();
			modificar(codigo);
			borrar();
			lblMensaje.setText("Datos modificados en el codigo " +codigo);
		}
		
		
}	
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == lblCerrar) {
			mouseClickedLabel_1(e);
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
	protected void mouseClickedLabel_1(MouseEvent e) {
		setVisible(false);
	}
	protected void mouseEnteredLblModelo(MouseEvent e) {
	}
}
