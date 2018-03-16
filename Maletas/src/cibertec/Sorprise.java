package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class Sorprise extends JDialog implements ActionListener, MouseListener {
	private JLabel lblNmeroDeCliente;
	private JLabel lblPremioSorpresa;
	private JTextField txtCantidad;
	private JTextField txtPremio;
	private JButton btnGuardar;
	private final JLabel lblNewLabel = new JLabel("");
	private JLabel lblNewLabel_1;
	private JLabel label;
	private JSeparator separator;
	private JSeparator separator_1;
	private JLabel lblConfigurarPremioSorpresa;
	private JLabel lblMensaje;
	private JLabel lblCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sorprise dialog = new Sorprise();
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
	public Sorprise() {
		setUndecorated(true);
		setTitle("Configurar premio sorpresa");
		setBounds(100, 100, 548, 327);
		getContentPane().setLayout(null);
		
		lblNmeroDeCliente = new JLabel("Ingrese nuevo n\u00FAmero de cliente pemiado");
		lblNmeroDeCliente.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 15));
		lblNmeroDeCliente.setForeground(Color.WHITE);
		lblNmeroDeCliente.setBackground(Color.WHITE);
		lblNmeroDeCliente.setBounds(251, 70, 272, 20);
		getContentPane().add(lblNmeroDeCliente);
		
		lblPremioSorpresa = new JLabel("Ingrese nuevo premio sorpresa");
		lblPremioSorpresa.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 15));
		lblPremioSorpresa.setForeground(Color.WHITE);
		lblPremioSorpresa.setBackground(Color.WHITE);
		lblPremioSorpresa.setBounds(246, 138, 202, 22);
		getContentPane().add(lblPremioSorpresa);
		
		txtCantidad = new JTextField(""+BaseDatos.numeroClientePremiado);
		txtCantidad.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		txtCantidad.setForeground(Color.WHITE);
		txtCantidad.setBackground(Color.WHITE);
		txtCantidad.setBounds(266, 88, 86, 20);
		getContentPane().add(txtCantidad);
		txtCantidad.setColumns(10);
		txtCantidad.setBorder(null);
		txtCantidad.setOpaque(false);
		
		txtPremio = new JTextField(""+BaseDatos.premioSorpresa);
		txtPremio.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		txtPremio.setForeground(Color.WHITE);
		txtPremio.setBackground(Color.WHITE);
		txtPremio.setBounds(267, 163, 86, 20);
		getContentPane().add(txtPremio);
		txtPremio.setColumns(10);
		txtPremio.setBorder(null);
		txtPremio.setOpaque(false);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 15));
		btnGuardar.setForeground(Color.GRAY);
		btnGuardar.addActionListener(this);
		btnGuardar.setBounds(251, 235, 119, 23);
		getContentPane().add(btnGuardar);
		
		lblCerrar = new JLabel("X");
		lblCerrar.addMouseListener(this);
		lblCerrar.setHorizontalAlignment(SwingConstants.CENTER);
		lblCerrar.setForeground(new Color(33, 63, 86));
		lblCerrar.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblCerrar.setBackground(Color.WHITE);
		lblCerrar.setBounds(516, 0, 32, 25);
		getContentPane().add(lblCerrar);
		
		separator = new JSeparator();
		separator.setBounds(246, 184, 204, 5);
		getContentPane().add(separator);
		
		lblConfigurarPremioSorpresa = new JLabel("Configurar premio sorpresa");
		lblConfigurarPremioSorpresa.addMouseListener(this);
		lblConfigurarPremioSorpresa.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 20));
		lblConfigurarPremioSorpresa.setForeground(Color.WHITE);
		lblConfigurarPremioSorpresa.setBounds(100, 6, 366, 26);
		getContentPane().add(lblConfigurarPremioSorpresa);
		
		lblMensaje = new JLabel("");
		lblMensaje.setForeground(Color.WHITE);
		lblMensaje.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 15));
		lblMensaje.setBackground(Color.WHITE);
		lblMensaje.setBounds(246, 202, 202, 22);
		getContentPane().add(lblMensaje);
		
		separator_1 = new JSeparator();
		separator_1.setBounds(246, 113, 203, 3);
		getContentPane().add(separator_1);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon(Sorprise.class.getResource("/imagenes/principal.png")));
		label.setBounds(0, 25, 215, 247);
		getContentPane().add(label);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Sorprise.class.getResource("/imagenes/#FA624D.jpg")));
		lblNewLabel_1.setBounds(231, 47, 305, 225);
		getContentPane().add(lblNewLabel_1);
		lblNewLabel.setIcon(new ImageIcon(Sorprise.class.getResource("/imagenes/#8AC0B0.jpg")));
		lblNewLabel.setBounds(0, 0, 658, 372);
		getContentPane().add(lblNewLabel);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnGuardar) {
			actionPerformedBtnGuardar(e);
		}
	}
	protected void actionPerformedBtnGuardar(ActionEvent e) {
		if ((txtCantidad.getText()).length()==0 && (txtPremio.getText()).length()==0 ){
			lblMensaje.setText("Complete campos");
			txtCantidad.setText("*");
			txtPremio.setText("*");
			
		}
		else{
			lblMensaje.setText("Datos Guardados");
			BaseDatos.numeroClientePremiado=Integer.parseInt(txtCantidad.getText());
			BaseDatos.premioSorpresa=txtPremio.getText();
			txtCantidad.setText("");
			txtPremio.setText("");
			
		}
		
		
		
		
	
	
	}
	
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == lblCerrar) {
			mouseClickedLabel_1(e);
		}
	}
	public void mouseEntered(MouseEvent e) {
		if (e.getSource() == lblConfigurarPremioSorpresa) {
			mouseEnteredLblConfigurarPremioSorpresa(e);
		}
		if (e.getSource() == lblCerrar) {
			mouseEnteredLblConfigurarPremioSorpresa(e);
			lblCerrar.setBackground(new Color (255, 0, 0));
			lblCerrar.setForeground(Color.WHITE);
			lblCerrar.setOpaque(true);
		}
	}
	public void mouseExited(MouseEvent e) {
		if (e.getSource() == lblCerrar) {
			mouseEnteredLblConfigurarPremioSorpresa(e);
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
	protected void mouseEnteredLblConfigurarPremioSorpresa(MouseEvent e) {
	}
}
