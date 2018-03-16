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

public class Porcentajes extends JDialog implements ActionListener, MouseListener {
	private JTextField txtPorcentaje1;
	private JTextField txtPorcentaje2;
	private JTextField txtPorcentaje3;
	private JTextField txtPorcentaje4;
	private JLabel lblA;
	private JLabel lblA_1;
	private JLabel lblA_2;
	private JLabel lblMsDe;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JButton btnGuardar;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel lblConfigurarPorcentajesDe;
	private JSeparator separator;
	private JSeparator separator_1;
	private JSeparator separator_2;
	private JSeparator separator_3;
	private JLabel lblDeDescuentos;
	private JLabel label_6;
	private JLabel lblMensaje;
	private JLabel lblCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Porcentajes dialog = new Porcentajes();
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
	public Porcentajes() {
		setTitle("Configurar Porcentajes de Descuentos");
		setBounds(100, 100, 636, 408);
		getContentPane().setLayout(null);
		setUndecorated(true);
		
		txtPorcentaje1 = new JTextField(""+BaseDatos.porcentaje1);
		txtPorcentaje1.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		txtPorcentaje1.setForeground(Color.WHITE);
		txtPorcentaje1.setBounds(450, 80, 85, 20);
		getContentPane().add(txtPorcentaje1);
		txtPorcentaje1.setColumns(10);
		txtPorcentaje1.setBorder(null);
		txtPorcentaje1.setOpaque(false);
		
		txtPorcentaje2 = new JTextField(""+BaseDatos.porcentaje2);
		txtPorcentaje2.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		txtPorcentaje2.setForeground(Color.WHITE);
		txtPorcentaje2.setBounds(450, 142, 85, 20);
		getContentPane().add(txtPorcentaje2);
		txtPorcentaje2.setColumns(10);
		txtPorcentaje2.setBorder(null);
		txtPorcentaje2.setOpaque(false);
		
		txtPorcentaje3 = new JTextField(""+BaseDatos.porcentaje3);
		txtPorcentaje3.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		txtPorcentaje3.setForeground(Color.WHITE);
		txtPorcentaje3.setBounds(450, 198, 85, 20);
		txtPorcentaje3.setBorder(null);
		txtPorcentaje3.setOpaque(false);
		getContentPane().add(txtPorcentaje3);
		txtPorcentaje3.setColumns(10);
		
		txtPorcentaje4 = new JTextField(""+BaseDatos.porcentaje4);
		txtPorcentaje4.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		txtPorcentaje4.setForeground(Color.WHITE);
		txtPorcentaje4.setBounds(450, 254, 85, 20);
		getContentPane().add(txtPorcentaje4);
		txtPorcentaje4.setColumns(10);
		txtPorcentaje4.setBorder(null);
		txtPorcentaje4.setOpaque(false);
		
		lblA = new JLabel("1 a 3 maletas");
		lblA.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 15));
		lblA.setForeground(Color.WHITE);
		lblA.setBounds(450, 55, 112, 14);
		getContentPane().add(lblA);
		
		lblA_1 = new JLabel("4 a 5 maletas");
		lblA_1.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 15));
		lblA_1.setForeground(Color.WHITE);
		lblA_1.setBounds(450, 123, 112, 14);
		getContentPane().add(lblA_1);
		
		lblA_2 = new JLabel("6 a 8 maletas");
		lblA_2.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 15));
		lblA_2.setForeground(Color.WHITE);
		lblA_2.setBounds(450, 173, 112, 14);
		getContentPane().add(lblA_2);
		
		lblMsDe = new JLabel("M\u00E1s de 8 maletas");
		lblMsDe.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 15));
		lblMsDe.setForeground(Color.WHITE);
		lblMsDe.setBounds(450, 229, 112, 14);
		getContentPane().add(lblMsDe);
		
		label = new JLabel("%");
		label.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 13));
		label.setForeground(Color.WHITE);
		label.setBounds(545, 83, 46, 14);
		getContentPane().add(label);
		
		label_1 = new JLabel("%");
		label_1.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 13));
		label_1.setForeground(Color.WHITE);
		label_1.setBounds(545, 145, 46, 14);
		getContentPane().add(label_1);
		
		label_2 = new JLabel("%");
		label_2.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 13));
		label_2.setForeground(Color.WHITE);
		label_2.setBounds(545, 201, 46, 14);
		getContentPane().add(label_2);
		
		label_3 = new JLabel("%");
		label_3.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 13));
		label_3.setForeground(Color.WHITE);
		label_3.setBounds(545, 257, 46, 14);
		getContentPane().add(label_3);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 13));
		btnGuardar.setForeground(Color.DARK_GRAY);
		btnGuardar.addActionListener(this);
		
		separator = new JSeparator();
		separator.setBounds(445, 106, 119, 4);
		getContentPane().add(separator);
		
		separator_1 = new JSeparator();
		separator_1.setBounds(447, 167, 119, 4);
		getContentPane().add(separator_1);
		
		separator_2 = new JSeparator();
		separator_2.setBounds(449, 223, 119, 4);
		getContentPane().add(separator_2);
		
		separator_3 = new JSeparator();
		separator_3.setBounds(449, 281, 119, 4);
		getContentPane().add(separator_3);
		
		lblCerrar = new JLabel("X");
		lblCerrar.addMouseListener(this);
		lblCerrar.setHorizontalAlignment(SwingConstants.CENTER);
		lblCerrar.setForeground(new Color(33, 63, 86));
		lblCerrar.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblCerrar.setBackground(Color.WHITE);
		lblCerrar.setBounds(604, 0, 32, 25);
		getContentPane().add(lblCerrar);
		
		lblMensaje = new JLabel("");
		lblMensaje.setForeground(Color.WHITE);
		lblMensaje.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 15));
		lblMensaje.setBounds(450, 306, 112, 22);
		getContentPane().add(lblMensaje);
		btnGuardar.setBounds(450, 339, 120, 23);
		getContentPane().add(btnGuardar);
		
		lblConfigurarPorcentajesDe = new JLabel("Configurar Porcentajes");
		lblConfigurarPorcentajesDe.addMouseListener(this);
		lblConfigurarPorcentajesDe.setForeground(Color.WHITE);
		lblConfigurarPorcentajesDe.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 25));
		lblConfigurarPorcentajesDe.setBounds(67, 64, 335, 35);
		getContentPane().add(lblConfigurarPorcentajesDe);
		
		lblDeDescuentos = new JLabel("de Descuentos");
		lblDeDescuentos.setForeground(Color.WHITE);
		lblDeDescuentos.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 25));
		lblDeDescuentos.setBounds(70, 99, 335, 35);
		getContentPane().add(lblDeDescuentos);
		
		label_6 = new JLabel("");
		label_6.setIcon(new ImageIcon(Porcentajes.class.getResource("/imagenes/principal.png")));
		label_6.setBounds(70, 148, 282, 237);
		getContentPane().add(label_6);
		
		label_5 = new JLabel("");
		label_5.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 13));
		label_5.setForeground(Color.WHITE);
		label_5.setIcon(new ImageIcon(Porcentajes.class.getResource("/imagenes/azul.jpg")));
		label_5.setBounds(404, 43, 208, 342);
		getContentPane().add(label_5);
		
		label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon(Porcentajes.class.getResource("/imagenes/orange.jpg")));
		label_4.setBounds(0, 0, 699, 408);
		getContentPane().add(label_4);

	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnGuardar) {
			actionPerformedBtnGuardar(arg0);
		}
	}
	protected void actionPerformedBtnGuardar(ActionEvent arg0) {
		
		if ((txtPorcentaje1.getText()).length()==0 && (txtPorcentaje2.getText()).length()==0 && (txtPorcentaje3.getText()).length()==0 && (txtPorcentaje4.getText()).length()==0){
			lblMensaje.setText("Complete campos");
			txtPorcentaje1.setText("*");
			txtPorcentaje2.setText("*");
			txtPorcentaje3.setText("*");
			txtPorcentaje4.setText("*");
		}
		else{
			lblMensaje.setText("");
			
			double cambiPorcentaje1,cambiPorcentaje2,cambiPorcentaje3,cambiPorcentaje4;
			
			cambiPorcentaje1=Double.parseDouble(txtPorcentaje1.getText());
			BaseDatos.porcentaje1=cambiPorcentaje1;
			
			cambiPorcentaje2=Double.parseDouble(txtPorcentaje2.getText());
			BaseDatos.porcentaje2=cambiPorcentaje2;
			
			cambiPorcentaje3=Double.parseDouble(txtPorcentaje3.getText());
			BaseDatos.porcentaje3=cambiPorcentaje3;
			
			cambiPorcentaje4=Double.parseDouble(txtPorcentaje4.getText());
			BaseDatos.porcentaje4=cambiPorcentaje4;
			lblMensaje.setText("Datos Guardados");
			
			txtPorcentaje1.setText("");
			txtPorcentaje2.setText("");
			txtPorcentaje3.setText("");
			txtPorcentaje4.setText("");
		}
		
		
		
	
	}
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == lblCerrar) {
			mouseClickedLabel_7(e);
		}
	}
	public void mouseEntered(MouseEvent e) {
		if (e.getSource() == lblConfigurarPorcentajesDe) {
			mouseEnteredLblConfigurarPorcentajesDe(e);
		}
		if (e.getSource() == lblCerrar) {
			mouseEnteredLblConfigurarPorcentajesDe(e);
			lblCerrar.setBackground(new Color (255, 0, 0));
			lblCerrar.setForeground(Color.WHITE);
			lblCerrar.setOpaque(true);
		}
	}
	public void mouseExited(MouseEvent e) {
		if (e.getSource() == lblCerrar) {
			mouseEnteredLblConfigurarPorcentajesDe(e);
			lblCerrar.setBackground(new Color(253, 187, 103));
			lblCerrar.setForeground(Color.BLACK);
			lblCerrar.setOpaque(false);
		}
	}
	public void mousePressed(MouseEvent e) {
	}
	public void mouseReleased(MouseEvent e) {
	}
	protected void mouseClickedLabel_7(MouseEvent e) {
		setVisible(false);
	}
	protected void mouseEnteredLblConfigurarPorcentajesDe(MouseEvent e) {
	}
}
