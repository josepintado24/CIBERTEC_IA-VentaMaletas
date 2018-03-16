package cibertec;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class Tienda extends JDialog implements MouseListener {

	private final JPanel contentPanel = new JPanel();
	private JLabel lblTienda;
	private JSeparator separator;
	private JLabel lblAutores;
	private JLabel lblJoseLuisPintado;
	private JLabel lblJancarloRiveraFlores;
	private JLabel lblLeydiMireyaEspinoza;
	private JLabel lblOrlandoFelixEspinoza;
	private JLabel lblHeveKarolValle;
	private JLabel lblCerrar;
	private JLabel lblJosueGuizadoRivas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Tienda dialog = new Tienda();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Tienda() {
		setUndecorated(true);
		setBounds(100, 100, 693, 503);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		lblTienda = new JLabel("Tienda 1.0");
		lblTienda.addMouseListener(this);
		lblTienda.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 30));
		lblTienda.setBounds(284, 52, 136, 50);
		contentPanel.add(lblTienda);
		
		separator = new JSeparator();
		separator.setBounds(44, 114, 605, 8);
		contentPanel.add(separator);
		
		lblAutores = new JLabel("Autores");
		lblAutores.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAutores.setBounds(44, 131, 116, 34);
		contentPanel.add(lblAutores);
		
		lblJoseLuisPintado = new JLabel("JOSE LUIS PINTADO VASQUEZ");
		lblJoseLuisPintado.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 14));
		lblJoseLuisPintado.setBounds(44, 176, 247, 20);
		contentPanel.add(lblJoseLuisPintado);
		
		lblJancarloRiveraFlores = new JLabel("JANCARLO RIVERA FLORES");
		lblJancarloRiveraFlores.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 14));
		lblJancarloRiveraFlores.setBounds(44, 207, 247, 20);
		contentPanel.add(lblJancarloRiveraFlores);
		
		lblLeydiMireyaEspinoza = new JLabel("LEYDI MIREYA ESPINOZA OLARTE");
		lblLeydiMireyaEspinoza.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 14));
		lblLeydiMireyaEspinoza.setBounds(44, 269, 247, 20);
		contentPanel.add(lblLeydiMireyaEspinoza);
		
		lblOrlandoFelixEspinoza = new JLabel("ORLANDO FELIX ESPINOZA PALOMINO");
		lblOrlandoFelixEspinoza.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 14));
		lblOrlandoFelixEspinoza.setBounds(44, 327, 247, 20);
		contentPanel.add(lblOrlandoFelixEspinoza);
		
		lblHeveKarolValle = new JLabel("HEVE KAROL VALLE VELARDE");
		lblHeveKarolValle.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 14));
		lblHeveKarolValle.setBounds(44, 238, 247, 20);
		contentPanel.add(lblHeveKarolValle);
		
		lblCerrar = new JLabel("X");
		lblCerrar.addMouseListener(this);
		lblCerrar.setOpaque(true);
		lblCerrar.setHorizontalAlignment(SwingConstants.CENTER);
		lblCerrar.setForeground(new Color(33, 63, 86));
		lblCerrar.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblCerrar.setBounds(661, 0, 32, 25);
		contentPanel.add(lblCerrar);
		
		lblJosueGuizadoRivas = new JLabel("JOSUE GUIZADO RIVAS");
		lblJosueGuizadoRivas.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 14));
		lblJosueGuizadoRivas.setBounds(44, 296, 247, 20);
		contentPanel.add(lblJosueGuizadoRivas);
		
	}
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == lblCerrar) {
			mouseClickedLabel(e);
		}
	}
	public void mouseEntered(MouseEvent e) {
		if (e.getSource() == lblTienda) {
			mouseEnteredLblTienda(e);
		}
		if (e.getSource() == lblCerrar) {
			mouseEnteredLblTienda(e);
			lblCerrar.setBackground(new Color (255, 0, 0));
			lblCerrar.setForeground(Color.WHITE);
			lblCerrar.setOpaque(true);
		}
	}
	public void mouseExited(MouseEvent e) {
		if (e.getSource() == lblCerrar) {
			mouseEnteredLblTienda(e);
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
	protected void mouseEnteredLblTienda(MouseEvent e) {
	}
}
