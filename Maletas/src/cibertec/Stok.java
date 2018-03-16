package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Stok extends JDialog implements MouseListener, ActionListener {
	private JLabel lblCerrar;
	private JPanel panel;
	private JLabel lblModificaElStok;
	private JLabel lblMt;
	private JLabel lblMt_1;
	private JLabel lblMt_2;
	private JLabel lblMt_3;
	private JLabel lblMt_4;
	private JTextField txtCantidad0;
	private JTextField txtCantidad1;
	private JTextField txtCantidad2;
	private JTextField txtCantidad3;
	private JTextField txtCantidad4;
	private JSeparator separator;
	private JSeparator separator_1;
	private JSeparator separator_2;
	private JSeparator separator_3;
	private JSeparator separator_4;
	private JButton btnGuardarCambios;
	private JLabel lblMensaje;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stok dialog = new Stok();
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
	public Stok() {
		setUndecorated(true);
		
		setBounds(100, 100, 636, 445);
		getContentPane().setLayout(null);
		
		lblCerrar = new JLabel("X");
		lblCerrar.addMouseListener(this);
		lblCerrar.setOpaque(true);
		lblCerrar.setHorizontalAlignment(SwingConstants.CENTER);
		lblCerrar.setForeground(new Color(33, 63, 86));
		lblCerrar.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblCerrar.setBackground(Color.WHITE);
		lblCerrar.setBounds(604, 0, 32, 25);
		getContentPane().add(lblCerrar);
		lblCerrar.setOpaque(false);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(64, 144, 206));
		panel.setBounds(0, 0, 176, 445);
		getContentPane().add(panel);
		
		lblModificaElStok = new JLabel("Modifica el STOK");
		lblModificaElStok.addMouseListener(this);
		lblModificaElStok.setForeground(new Color(240, 248, 255));
		lblModificaElStok.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 20));
		lblModificaElStok.setBounds(10, 25, 167, 35);
		panel.add(lblModificaElStok);
		
		lblMt = new JLabel("MT0");
		lblMt.setForeground(new Color(240, 248, 255));
		lblMt.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 20));
		lblMt.setBounds(115, 103, 51, 35);
		panel.add(lblMt);
		
		lblMt_1 = new JLabel("MT1");
		lblMt_1.setForeground(new Color(240, 248, 255));
		lblMt_1.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 20));
		lblMt_1.setBounds(115, 159, 51, 35);
		panel.add(lblMt_1);
		
		lblMt_2 = new JLabel("MT2");
		lblMt_2.setForeground(new Color(240, 248, 255));
		lblMt_2.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 20));
		lblMt_2.setBounds(115, 214, 51, 35);
		panel.add(lblMt_2);
		
		lblMt_3 = new JLabel("MT3");
		lblMt_3.setForeground(new Color(240, 248, 255));
		lblMt_3.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 20));
		lblMt_3.setBounds(115, 274, 51, 35);
		panel.add(lblMt_3);
		
		lblMt_4 = new JLabel("MT4");
		lblMt_4.setForeground(new Color(240, 248, 255));
		lblMt_4.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 20));
		lblMt_4.setBounds(115, 334, 51, 35);
		panel.add(lblMt_4);
		
		txtCantidad0 = new JTextField(""+BaseDatos.cantidadMT0);
		txtCantidad0.setOpaque(false);
		txtCantidad0.setForeground(Color.BLACK);
		txtCantidad0.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtCantidad0.setColumns(10);
		txtCantidad0.setBorder(null);
		txtCantidad0.setBackground(Color.BLACK);
		txtCantidad0.setBounds(202, 107, 86, 20);
		getContentPane().add(txtCantidad0);
		
		txtCantidad1 = new JTextField(""+BaseDatos.cantidadMT1);
		txtCantidad1.setOpaque(false);
		txtCantidad1.setForeground(Color.BLACK);
		txtCantidad1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtCantidad1.setColumns(10);
		txtCantidad1.setBorder(null);
		txtCantidad1.setBackground(Color.BLACK);
		txtCantidad1.setBounds(202, 171, 86, 20);
		getContentPane().add(txtCantidad1);
		
		txtCantidad2 = new JTextField(""+BaseDatos.cantidadMT2);
		txtCantidad2.setOpaque(false);
		txtCantidad2.setForeground(Color.BLACK);
		txtCantidad2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtCantidad2.setColumns(10);
		txtCantidad2.setBorder(null);
		txtCantidad2.setBackground(Color.BLACK);
		txtCantidad2.setBounds(202, 226, 86, 20);
		getContentPane().add(txtCantidad2);
		
		txtCantidad3 = new JTextField("100");
		txtCantidad3.setOpaque(false);
		txtCantidad3.setForeground(Color.BLACK);
		txtCantidad3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtCantidad3.setColumns(10);
		txtCantidad3.setBorder(null);
		txtCantidad3.setBackground(Color.BLACK);
		txtCantidad3.setBounds(202, 285, 86, 20);
		getContentPane().add(txtCantidad3);
		
		txtCantidad4 = new JTextField(""+BaseDatos.cantidadMT4);
		txtCantidad4.setOpaque(false);
		txtCantidad4.setForeground(Color.BLACK);
		txtCantidad4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtCantidad4.setColumns(10);
		txtCantidad4.setBorder(null);
		txtCantidad4.setBackground(Color.BLACK);
		txtCantidad4.setBounds(202, 344, 86, 20);
		getContentPane().add(txtCantidad4);
		
		separator = new JSeparator();
		separator.setBounds(186, 129, 193, 15);
		getContentPane().add(separator);
		
		separator_1 = new JSeparator();
		separator_1.setBounds(191, 189, 188, 2);
		getContentPane().add(separator_1);
		
		separator_2 = new JSeparator();
		separator_2.setBounds(186, 244, 188, 2);
		getContentPane().add(separator_2);
		
		separator_3 = new JSeparator();
		separator_3.setBounds(186, 303, 188, 2);
		getContentPane().add(separator_3);
		
		separator_4 = new JSeparator();
		separator_4.setBounds(186, 362, 188, 2);
		getContentPane().add(separator_4);
		
		btnGuardarCambios = new JButton("Guardar Cambios");
		btnGuardarCambios.addActionListener(this);
		btnGuardarCambios.setBackground(new Color(64, 144, 206));
		btnGuardarCambios.setForeground(new Color(255, 255, 255));
		btnGuardarCambios.setBounds(395, 393, 160, 30);
		getContentPane().add(btnGuardarCambios);
		
		lblMensaje = new JLabel("");
		lblMensaje.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 13));
		lblMensaje.setBounds(187, 401, 167, 22);
		getContentPane().add(lblMensaje);

	}

	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == lblCerrar) {
			mouseClickedLabel(e);
		}
	}
	public void mouseEntered(MouseEvent e) {
		if (e.getSource() == lblModificaElStok) {
			mouseEnteredLblModificaElStok(e);
		}
		if (e.getSource() == lblCerrar) {
			mouseEnteredLblModificaElStok(e);
			lblCerrar.setBackground(new Color (255, 0, 0));
			lblCerrar.setForeground(Color.WHITE);
			lblCerrar.setOpaque(true);
		}
	}
	public void mouseExited(MouseEvent e) {
		if (e.getSource() == lblCerrar) {
			mouseEnteredLblModificaElStok(e);
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
	protected void mouseEnteredLblModificaElStok(MouseEvent e) {
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnGuardarCambios) {
			actionPerformedBtnGuardarCambios(arg0);
		}
	}
	protected void actionPerformedBtnGuardarCambios(ActionEvent arg0) {
		
		if ((txtCantidad0.getText()).length()==0 && (txtCantidad2.getText()).length()==0 &&(txtCantidad3.getText()).length()==0 && (txtCantidad4.getText()).length()==0){
			lblMensaje.setText("Llene el campo");
			txtCantidad0.setText("*");
			txtCantidad1.setText("*");
			txtCantidad2.setText("*");
			txtCantidad3.setText("*");
			txtCantidad4.setText("*");
			
		}
		else{
			lblMensaje.setText("");
			int cantidadMT0,cantidadMT1,cantidadMT2,cantidadMT3,cantidadMT4;
			
			cantidadMT0=Integer.parseInt(txtCantidad0.getText());
			BaseDatos.cantidadMT0=cantidadMT0;
			
			cantidadMT1=Integer.parseInt(txtCantidad1.getText());
			BaseDatos.cantidadMT1=cantidadMT1;
			
			cantidadMT2=Integer.parseInt(txtCantidad2.getText());
			BaseDatos.cantidadMT2=cantidadMT2;
			
			cantidadMT3=Integer.parseInt(txtCantidad3.getText());
			BaseDatos.cantidadMT3=cantidadMT3;
			
			cantidadMT4=Integer.parseInt(txtCantidad4.getText());
			BaseDatos.cantidadMT4=cantidadMT4;
			txtCantidad0.setText("");
			txtCantidad1.setText("");
			txtCantidad2.setText("");
			txtCantidad3.setText("");
			txtCantidad4.setText("");
			lblMensaje.setText("Datos Guardados");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
