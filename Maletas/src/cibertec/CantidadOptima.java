package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;


public class CantidadOptima extends JDialog implements ActionListener, MouseListener {
	private JLabel lblCantidadptimaDe;
	private JTextField txtCantidadOptima;
	private JButton btnGuardar;
	private JLabel lblNewLabel;
	private JLabel label;
	private JLabel lblConfigurarCantidadptima;
	private JSeparator separator;
	private JLabel lblCerrar;
	private JLabel lblMensaje;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CantidadOptima dialog = new CantidadOptima();
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
	public CantidadOptima() {
		setUndecorated(true);
		setTitle("Configurar cantidad \u00F3ptima de maletas vendidas");
		setBounds(100, 100, 490, 283);
		getContentPane().setLayout(null);
		
		
		lblCantidadptimaDe = new JLabel("Ingrese la nueva cantidad \u00F3ptima de\r\n maletas vendidas");
		lblCantidadptimaDe.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 15));
		lblCantidadptimaDe.setForeground(Color.WHITE);
		lblCantidadptimaDe.setBounds(70, 52, 368, 29);
		getContentPane().add(lblCantidadptimaDe);
		
		txtCantidadOptima = new JTextField(""+BaseDatos.cantidadOptima);
		txtCantidadOptima.setForeground(Color.WHITE);
		txtCantidadOptima.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		txtCantidadOptima.setBounds(109, 94, 53, 20);
		getContentPane().add(txtCantidadOptima);
		txtCantidadOptima.setColumns(10);
		txtCantidadOptima.setBorder(null);
		txtCantidadOptima.setOpaque(false);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 15));
		btnGuardar.setForeground(Color.GRAY);
		btnGuardar.addActionListener(this);
		btnGuardar.setBounds(71, 167, 145, 23);
		getContentPane().add(btnGuardar);
		btnGuardar.setBorder(null);
		btnGuardar.setOpaque(false);
		
		lblCerrar = new JLabel("X");
		lblCerrar.addMouseListener(this);
		lblCerrar.setHorizontalAlignment(SwingConstants.CENTER);
		lblCerrar.setForeground(new Color(33, 63, 86));
		lblCerrar.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblCerrar.setBackground(Color.WHITE);
		lblCerrar.setBounds(458, 0, 32, 25);
		getContentPane().add(lblCerrar);
		
		lblMensaje = new JLabel("");
		lblMensaje.setForeground(Color.WHITE);
		lblMensaje.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 15));
		lblMensaje.setBounds(69, 125, 166, 29);
		getContentPane().add(lblMensaje);
		
		separator = new JSeparator();
		separator.setBounds(71, 114, 145, 4);
		getContentPane().add(separator);
		
		lblConfigurarCantidadptima = new JLabel("Configurar cantidad \u00F3ptima de maletas vendidas");
		lblConfigurarCantidadptima.addMouseListener(this);
		lblConfigurarCantidadptima.setFont(new Font("Segoe UI Light", Font.BOLD, 20));
		lblConfigurarCantidadptima.setBounds(10, 12, 455, 29);
		getContentPane().add(lblConfigurarCantidadptima);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon(CantidadOptima.class.getResource("/imagenes/#997895.jpg")));
		label.setBounds(42, 52, 386, 154);
		getContentPane().add(label);
		label.setBorder(BorderFactory.createLineBorder(Color.black));
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(CantidadOptima.class.getResource("/imagenes/#FFD455.jpg")));
		lblNewLabel.setBounds(0, 0, 499, 299);
		getContentPane().add(lblNewLabel);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnGuardar) {
			actionPerformedBtnGuardar(e);
		}
	}
	protected void actionPerformedBtnGuardar(ActionEvent e) {
		if ((txtCantidadOptima.getText()).length()==0){
			lblMensaje.setText("Complete campos");
			txtCantidadOptima.setText("*");
		}
		else{
			lblMensaje.setText("Datos Guardados");
			BaseDatos.cantidadOptima=Integer.parseInt(txtCantidadOptima.getText());
			txtCantidadOptima.setText("");
			
		}
		
		
		
		
		
	}
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == lblCerrar) {
			mouseClickedLblCerrar(e);
		}
	}
	public void mouseEntered(MouseEvent e) {
		if (e.getSource() == lblConfigurarCantidadptima) {
			mouseEnteredLblConfigurarCantidadptima(e);
		}
		if (e.getSource() == lblCerrar) {
			mouseEnteredLblConfigurarCantidadptima(e);
			lblCerrar.setBackground(new Color (255, 0, 0));
			lblCerrar.setForeground(Color.WHITE);
			lblCerrar.setOpaque(true);
		}
	}
	public void mouseExited(MouseEvent e) {
		if (e.getSource() == lblCerrar) {
			mouseEnteredLblConfigurarCantidadptima(e);
			lblCerrar.setBackground(new Color(253, 187, 103));
			lblCerrar.setForeground(Color.BLACK);
			lblCerrar.setOpaque(false);
		}
	}
	public void mousePressed(MouseEvent e) {
	}
	public void mouseReleased(MouseEvent e) {
	}
	protected void mouseClickedLblCerrar(MouseEvent e) {
		setVisible(false);
	}
	protected void mouseEnteredLblConfigurarCantidadptima(MouseEvent e) {
	}
}
