package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;

public class ListarMaletas extends JDialog implements ActionListener, MouseListener {
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JLabel lblListarMaletas;
	private JLabel lblCerrar;
	private JPanel panel;
	private JLabel lblListar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListarMaletas dialog = new ListarMaletas();
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
	public ListarMaletas() {
		getContentPane().setBackground(Color.WHITE);
		setResizable(false);
		setUndecorated(true);
		
		setTitle("Listar maletas");
		setBounds(100, 100, 636, 445);
		getContentPane().setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(237, 36, 389, 398);
		getContentPane().add(scrollPane);
		scrollPane.setOpaque(false);
		scrollPane.setBorder(null);
		
		txtS = new JTextArea();
		txtS.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 14));
		txtS.setEditable(false);
		scrollPane.setViewportView(txtS);
		
		lblCerrar = new JLabel("X");
		lblCerrar.addMouseListener(this);
		lblCerrar.setOpaque(true);
		lblCerrar.setHorizontalAlignment(SwingConstants.CENTER);
		lblCerrar.setForeground(new Color(33, 63, 86));
		lblCerrar.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblCerrar.setBackground(Color.WHITE);
		lblCerrar.setBounds(604, 0, 32, 25);
		getContentPane().add(lblCerrar);
		
		panel = new JPanel();
		panel.setBackground(new Color(3, 171, 68));
		panel.setBounds(0, 0, 192, 445);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		lblListar = new JLabel("Listar");
		lblListar.addMouseListener(this);
		lblListar.setIcon(new ImageIcon(ListarMaletas.class.getResource("/icons/ver.png")));
		lblListar.setForeground(new Color(255, 255, 255));
		lblListar.setBackground(new Color(2, 87, 34));
		lblListar.setBounds(10, 173, 172, 27);
		panel.add(lblListar);
		lblListar.setHorizontalAlignment(SwingConstants.CENTER);
		lblListar.setOpaque(true);
		
		lblListarMaletas = new JLabel("Listar Maletas");
		lblListarMaletas.setBounds(21, 109, 150, 32);
		panel.add(lblListarMaletas);
		lblListarMaletas.addMouseListener(this);
		lblListarMaletas.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 24));
		lblListarMaletas.setForeground(new Color(255, 255, 255));

	}
	public void actionPerformed(ActionEvent arg0) {
	}
	public void mouseClicked(MouseEvent arg0) {
		if (arg0.getSource() == lblListar) {
			mouseClickedLblListar(arg0);
		}
		if (arg0.getSource() == lblCerrar) {
			mouseClickedLabel(arg0);
		}
	}
	public void mouseEntered(MouseEvent arg0) {
		if (arg0.getSource() == lblListarMaletas) {
			mouseEnteredLblListarMaletas(arg0);
		}
		if (arg0.getSource() == lblCerrar) {
			mouseEnteredLblListarMaletas(arg0);
			lblCerrar.setBackground(new Color (255, 0, 0));
			lblCerrar.setForeground(Color.WHITE);
			lblCerrar.setOpaque(true);
		}
		if (arg0.getSource() == lblListar) {
			mouseEnteredLblListarMaletas(arg0);
			lblListar.setBackground(new Color (0,0,0));
			
			
		}
	}
	public void mouseExited(MouseEvent arg0) {
		if (arg0.getSource() == lblCerrar) {
			mouseEnteredLblListarMaletas(arg0);
			lblCerrar.setBackground(new Color(253, 187, 103));
			lblCerrar.setForeground(Color.BLACK);
			lblCerrar.setOpaque(false);
		}
		if (arg0.getSource() == lblListar) {
			mouseEnteredLblListarMaletas(arg0);
			lblListar.setBackground(new Color (2, 87, 34));
			
			
		}
	}
	public void mousePressed(MouseEvent arg0) {
	}
	public void mouseReleased(MouseEvent arg0) {
	}
	protected void mouseClickedLabel(MouseEvent arg0) {
		setVisible(false);
	}
	protected void mouseEnteredLblListarMaletas(MouseEvent arg0) {
	}
	protected void mouseClickedLblListar(MouseEvent arg0) {
		mostrar();
		
		}
		
		void mostrar(){
			txtS.append("  listado de maletas");
			txtS.append("\n  codigo \t: "+BaseDatos.codigo0);
			txtS.append("\n  Descripcion \t: "+BaseDatos.modelo0);
			txtS.append("\n   precio \t: "+BaseDatos.precio0);
			txtS.append("\n  ancho \t: "+BaseDatos.ancho0);
			txtS.append("\n  alto \t: "+BaseDatos.alto0);
			txtS.append("\n  fondo \t: "+BaseDatos.fondo0);
			txtS.append("\n");
			
			
			txtS.append("\n  codigo \t: "+BaseDatos.codigo1);
			txtS.append("\n  Descripcion \t: "+BaseDatos.modelo1);
			txtS.append("\n  precio \t: "+BaseDatos.precio1);
			txtS.append("\n  ancho \t: "+BaseDatos.ancho1);
			txtS.append("\n  alto \t: "+BaseDatos.alto1);
			txtS.append("\n  fondo \t: "+BaseDatos.fondo1);
			txtS.append("\n");
			
			
			txtS.append("\n  codigo \t: "+BaseDatos.codigo2);
			txtS.append("\n  Descripcion \t: "+BaseDatos.modelo2);
			txtS.append("\n  precio \t: "+BaseDatos.precio2);
			txtS.append("\n  ancho \t: "+BaseDatos.ancho2);
			txtS.append("\n  alto \t: "+BaseDatos.alto2);
			txtS.append("\n  fondo \t: "+BaseDatos.fondo2);
			txtS.append("\n");
			
			
			txtS.append("\n  codigo \t: "+BaseDatos.codigo3);
			txtS.append("\n  Descripcion \t: "+BaseDatos.modelo3);
			txtS.append("\n  precio \t: "+BaseDatos.precio3);
			txtS.append("\n  ancho \t: "+BaseDatos.ancho3);
			txtS.append("\n  alto \t: "+BaseDatos.alto3);
			txtS.append("\n  fondo \t: "+BaseDatos.fondo3);
			txtS.append("\n");
			
			
			txtS.append("\n  codigo \t: "+BaseDatos.codigo4);
			txtS.append("\n  Descripcion \t: "+BaseDatos.modelo4);
			txtS.append("\n  precio \t: "+BaseDatos.precio4);
			txtS.append("\n  ancho \t: "+BaseDatos.ancho4);
			txtS.append("\n  alto \t: "+BaseDatos.alto4);
			txtS.append("\n  fondo \t: "+BaseDatos.fondo4);
			txtS.append("\n");
	}
}
