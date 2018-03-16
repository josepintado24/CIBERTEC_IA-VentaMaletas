package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JTextField;
import javax.swing.JLabel;
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

public class Obsequio extends JDialog implements ActionListener, MouseListener {
	private JTextField txtCantidadMinima;
	private JTextField txtObsequio;
	private JLabel lblMinimoDeMaletas;
	private JLabel lblObsequio;
	private JButton btnGuardar;
	private final JLabel lblNewLabel = new JLabel("");
	private JLabel label;
	private JLabel lblDeMaletasAdquiridas;
	private JSeparator separator;
	private JSeparator separator_1;
	private JLabel label_1;
	private JLabel lblConfigurarObsequio;
	private JLabel lblMensaje;
	private JLabel lblCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Obsequio dialog = new Obsequio();
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
	public Obsequio() {
		setTitle("Configurar Obsequio");
		setBounds(100, 100, 466, 369);
		getContentPane().setLayout(null);
		setUndecorated(true);
		
		txtCantidadMinima = new JTextField(""+BaseDatos.cantidadMinima);
		txtCantidadMinima.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		txtCantidadMinima.setForeground(Color.WHITE);
		txtCantidadMinima.setBounds(38, 106, 136, 20);
		getContentPane().add(txtCantidadMinima);
		txtCantidadMinima.setColumns(10);
		txtCantidadMinima.setBorder(null);
		txtCantidadMinima.setOpaque(false);
		
		txtObsequio = new JTextField(""+BaseDatos.obsequio);
		txtObsequio.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		txtObsequio.setForeground(Color.WHITE);
		txtObsequio.setBounds(38, 179, 136, 20);
		getContentPane().add(txtObsequio);
		txtObsequio.setColumns(10);
		txtObsequio.setBorder(null);
		txtObsequio.setOpaque(false);
		
		lblMinimoDeMaletas = new JLabel("Cambiar cantidad minima");
		lblMinimoDeMaletas.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 15));
		lblMinimoDeMaletas.setForeground(Color.WHITE);
		lblMinimoDeMaletas.setBounds(36, 60, 207, 14);
		getContentPane().add(lblMinimoDeMaletas);
		
		lblDeMaletasAdquiridas = new JLabel("de maletas adquiridas");
		lblDeMaletasAdquiridas.setForeground(Color.WHITE);
		lblDeMaletasAdquiridas.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 15));
		lblDeMaletasAdquiridas.setBounds(38, 74, 207, 23);
		getContentPane().add(lblDeMaletasAdquiridas);
		
		lblObsequio = new JLabel("Cambiar el Obsequio");
		lblObsequio.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 15));
		lblObsequio.setForeground(Color.WHITE);
		lblObsequio.setBounds(38, 153, 155, 23);
		getContentPane().add(lblObsequio);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 13));
		btnGuardar.setForeground(Color.DARK_GRAY);
		btnGuardar.addActionListener(this);
		
		label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(Obsequio.class.getResource("/imagenes/principal.png")));
		label_1.setBounds(226, 42, 226, 258);
		getContentPane().add(label_1);
		
		lblCerrar = new JLabel("X");
		lblCerrar.addMouseListener(this);
		lblCerrar.setOpaque(true);
		lblCerrar.setHorizontalAlignment(SwingConstants.CENTER);
		lblCerrar.setForeground(new Color(33, 63, 86));
		lblCerrar.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblCerrar.setBackground(Color.WHITE);
		lblCerrar.setBounds(434, 0, 32, 25);
		getContentPane().add(lblCerrar);
		lblCerrar.setOpaque(false);
		
		lblMensaje = new JLabel("");
		lblMensaje.setForeground(Color.WHITE);
		lblMensaje.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 15));
		lblMensaje.setBounds(38, 229, 155, 23);
		getContentPane().add(lblMensaje);
		
		separator = new JSeparator();
		separator.setBounds(38, 128, 142, 2);
		getContentPane().add(separator);
		
		lblConfigurarObsequio = new JLabel("Configurar Obsequio");
		lblConfigurarObsequio.addMouseListener(this);
		lblConfigurarObsequio.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 20));
		lblConfigurarObsequio.setForeground(Color.WHITE);
		lblConfigurarObsequio.setBounds(20, 0, 214, 27);
		getContentPane().add(lblConfigurarObsequio);
		btnGuardar.setBounds(38, 277, 137, 23);
		getContentPane().add(btnGuardar);
		
		separator_1 = new JSeparator();
		separator_1.setBounds(38, 204, 142, 2);
		getContentPane().add(separator_1);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon(Obsequio.class.getResource("/imagenes/#997895.jpg")));
		label.setBounds(20, 42, 196, 265);
		getContentPane().add(label);
		lblNewLabel.setIcon(new ImageIcon(Obsequio.class.getResource("/imagenes/#FFD455.jpg")));
		lblNewLabel.setBounds(0, 0, 500, 431);
		getContentPane().add(lblNewLabel);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnGuardar) {
			actionPerformedBtnGuardar(e);
		}
	}
	protected void actionPerformedBtnGuardar(ActionEvent e) {
		if ((txtCantidadMinima.getText()).length()==0 && (txtObsequio.getText()).length()==0 ){
			lblMensaje.setText("Complete campos");
			txtCantidadMinima.setText("*");
			txtObsequio.setText("*");
		}
		else{
			lblMensaje.setText("");
			int guardadCantidadMinima;
			String obsequio;
			guardadCantidadMinima=Integer.parseInt(txtCantidadMinima.getText());
			BaseDatos.cantidadMinima=guardadCantidadMinima;
			
			obsequio= txtObsequio.getText();
			BaseDatos.obsequio=obsequio;
			txtCantidadMinima.setText("");
			txtObsequio.setText("");
			lblMensaje.setText("Datos Guardados");
		}
		
		
		
		
	
		
		
	}
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == lblCerrar) {
			mouseClickedLabel_2(e);
		}
	}
	public void mouseEntered(MouseEvent e) {
		if (e.getSource() == lblConfigurarObsequio) {
			mouseEnteredLblConfigurarObsequio(e);
		}
		if (e.getSource() == lblCerrar) {
			mouseEnteredLblConfigurarObsequio(e);
			lblCerrar.setBackground(new Color (255, 0, 0));
			lblCerrar.setForeground(Color.WHITE);
			lblCerrar.setOpaque(true);
		}
	}
	public void mouseExited(MouseEvent e) {
		if (e.getSource() == lblCerrar) {
			mouseEnteredLblConfigurarObsequio(e);
			lblCerrar.setBackground(new Color(253, 187, 103));
			lblCerrar.setForeground(Color.BLACK);
			lblCerrar.setOpaque(false);
		}
	}
	public void mousePressed(MouseEvent e) {
	}
	public void mouseReleased(MouseEvent e) {
	}
	protected void mouseClickedLabel_2(MouseEvent e) {
		setVisible(false);
	}
	protected void mouseEnteredLblConfigurarObsequio(MouseEvent e) {
	}
}
