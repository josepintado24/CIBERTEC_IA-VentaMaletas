package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JSeparator;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import java.awt.event.MouseListener;

public class Vender extends JDialog implements ActionListener, MouseMotionListener, MouseListener {
	int cantidad;
	double importePagar;
	private JTextArea txtS;
	private JLabel lblCodigo;
	private JLabel lblPrecios;
	private JComboBox cboCodigo;
	private JTextPane txtprecio;
	private JTextPane txtCantidad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vender dialog = new Vender();
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
	public Vender() {
		getContentPane().setBackground(new Color(255, 255, 255));
		
		setUndecorated(true);
		setTitle("Vender");
		setBounds(100, 100, 636, 445);
		getContentPane().setLayout(null);
		
		txtS = new JTextArea();
		txtS.setEditable(false);
		txtS.setBackground(new Color(255, 255, 255));
		txtS.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 15));
		txtS.setBounds(194, 180, 432, 254);
		getContentPane().add(txtS);
		
		lblVentasDeMaletas = new JLabel("VENTAS DE MALETAS");
		lblVentasDeMaletas.addMouseListener(this);
		lblVentasDeMaletas.setForeground(new Color(0, 0, 0));
		lblVentasDeMaletas.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 30));
		lblVentasDeMaletas.setBounds(194, 143, 328, 36);
		getContentPane().add(lblVentasDeMaletas);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(31, 42, 57));
		panel.setBounds(0, 0, 179, 536);
		getContentPane().add(panel);
		
		lblCodigo = new JLabel("Codigo");
		lblCodigo.setBounds(7, 32, 58, 14);
		panel.add(lblCodigo);
		lblCodigo.setForeground(new Color(255, 255, 255));
		lblCodigo.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 14));
		
		cboCodigo = new JComboBox();
		cboCodigo.setBounds(7, 57, 158, 30);
		panel.add(cboCodigo);
		cboCodigo.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 15));
		cboCodigo.addActionListener(this);
		cboCodigo.setModel(new DefaultComboBoxModel(new String[] {"MT0", "MT1", "MT2", "MT3", "MT4"}));
		
		panel_1 = new JPanel();
		panel_1.setBounds(7, 173, 158, 90);
		panel.add(panel_1);
		panel_1.setBackground(new Color(69, 93, 128));
		panel_1.setLayout(null);
		
		lblPrecios = new JLabel("Precio(s/.)");
		lblPrecios.setVerticalAlignment(SwingConstants.TOP);
		lblPrecios.setIcon(new ImageIcon(Vender.class.getResource("/icons/soles.png")));
		lblPrecios.setBounds(10, 0, 152, 62);
		panel_1.add(lblPrecios);
		lblPrecios.setForeground(new Color(255, 255, 255));
		lblPrecios.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 15));
		
		txtprecio = new JTextPane();
		txtprecio.setBounds(86, 48, 89, 20);
		panel_1.add(txtprecio);
		txtprecio.setForeground(new Color(0, 255, 255));
		txtprecio.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 16));
		txtprecio.setEditable(false);
		txtprecio.setBorder(null);
		txtprecio.setOpaque(false);
		txtprecio.setText( ""+BaseDatos.precio0);
		
		panel_2 = new JPanel();
		panel_2.setBounds(7, 274, 158, 90);
		panel.add(panel_2);
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(249, 77, 83));
		
		lblIngreseCantidad = new JLabel("Ingrese Cantidad");
		lblIngreseCantidad.setForeground(Color.WHITE);
		lblIngreseCantidad.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 15));
		lblIngreseCantidad.setBounds(20, 11, 126, 22);
		panel_2.add(lblIngreseCantidad);
		
		txtCantidad = new JTextPane();
		txtCantidad.setBounds(20, 44, 90, 22);
		panel_2.add(txtCantidad);
		txtCantidad.setForeground(new Color(255, 255, 255));
		txtCantidad.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		txtCantidad.setBorder(null);
		txtCantidad.setOpaque(false);
		
		separator_2 = new JSeparator();
		separator_2.setBounds(15, 73, 95, 4);
		panel_2.add(separator_2);
		
		lblCalcular = new JLabel("Calcular");
		lblCalcular.setIcon(new ImageIcon(Vender.class.getResource("/imagenes/1498867008_check_book.png")));
		lblCalcular.addMouseListener(this);
		lblCalcular.setBounds(7, 412, 158, 27);
		panel.add(lblCalcular);
		lblCalcular.setOpaque(true);
		lblCalcular.setHorizontalAlignment(SwingConstants.CENTER);
		lblCalcular.setForeground(Color.WHITE);
		lblCalcular.setBackground(new Color(41, 194, 72));
		
		lblMensaje = new JLabel("");
		lblMensaje.setBounds(7, 364, 158, 27);
		panel.add(lblMensaje);
		lblMensaje.setForeground(new Color(255, 255, 255));
		lblMensaje.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 14));
		
		lblCerrar = new JLabel("X");
		lblCerrar.addMouseListener(this);
		lblCerrar.setOpaque(true);
		lblCerrar.setHorizontalAlignment(SwingConstants.CENTER);
		lblCerrar.setForeground(new Color(33, 63, 86));
		lblCerrar.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblCerrar.setBackground(Color.WHITE);
		lblCerrar.setBounds(604, 0, 32, 25);
		getContentPane().add(lblCerrar);
		
		panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 222, 173));
		panel_3.setBounds(194, 25, 432, 107);
		getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		lblAlmacen = new JLabel("Almacen");
		lblAlmacen.addMouseListener(this);
		lblAlmacen.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAlmacen.setBounds(10, 13, 72, 14);
		panel_3.add(lblAlmacen);
		
		lblMt = new JLabel("" +BaseDatos.cantidadMT0);
		lblMt.setBounds(10, 65, 46, 14);
		panel_3.add(lblMt);
		
		lblMt_1 = new JLabel("" +BaseDatos.cantidadMT1);
		lblMt_1.setBounds(80, 65, 46, 14);
		panel_3.add(lblMt_1);
		
		lblMt_2 = new JLabel("" +BaseDatos.cantidadMT2);
		lblMt_2.setBounds(172, 65, 46, 14);
		panel_3.add(lblMt_2);
		
		lblMt_3 = new JLabel("" +BaseDatos.cantidadMT3);
		lblMt_3.setBounds(264, 65, 46, 14);
		panel_3.add(lblMt_3);
		
		lblMt_4 = new JLabel("" +BaseDatos.cantidadMT4);
		lblMt_4.setBounds(355, 65, 46, 14);
		panel_3.add(lblMt_4);
		
		label = new JLabel("MT0");
		label.setBounds(10, 38, 46, 14);
		panel_3.add(label);
		
		label_1 = new JLabel("MT1");
		label_1.setBounds(80, 38, 46, 14);
		panel_3.add(label_1);
		
		label_2 = new JLabel("MT2");
		label_2.setBounds(172, 38, 46, 14);
		panel_3.add(label_2);
		
		label_3 = new JLabel("MT3");
		label_3.setBounds(264, 38, 46, 14);
		panel_3.add(label_3);
		
		label_4 = new JLabel("MT4");
		label_4.setBounds(355, 38, 46, 14);
		panel_3.add(label_4);

	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == cboCodigo) {
			actionPerformedCboCodigo(arg0);
		}
	}
	String codigoMaleta,modelo;
	double precio;
	int contador;
	private JLabel lblVentasDeMaletas;
	private JLabel lblMensaje;
	private JPanel panel;
	private JLabel lblCalcular;
	private JPanel panel_1;
	private JPanel panel_2;
	private JLabel lblIngreseCantidad;
	private JSeparator separator_2;
	private JLabel lblCerrar;
	private JPanel panel_3;
	private JLabel lblAlmacen;
	private JLabel lblMt;
	private JLabel lblMt_1;
	private JLabel lblMt_2;
	private JLabel lblMt_3;
	private JLabel lblMt_4;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	int getCodigo(){
		return cboCodigo.getSelectedIndex();
	}
	void getPrecio(int n){
		switch (n){
		case 0:
			txtprecio.setText(""+BaseDatos.precio0);
			codigoMaleta=BaseDatos.codigo0;
			precio=BaseDatos.precio0;
		    modelo=BaseDatos.modelo0;
		    
		   
		    
			
		
			break;
			
		case 1:
			txtprecio.setText(""+BaseDatos.precio1);
			codigoMaleta=BaseDatos.codigo1;
			precio=BaseDatos.precio1;
			modelo=BaseDatos.modelo1;
			
			
			break;
			
		case 2:
			txtprecio.setText(""+BaseDatos.precio2);
			codigoMaleta=BaseDatos.codigo2;
			precio=BaseDatos.precio2;
			modelo=BaseDatos.modelo0;
			
			
			break;
			
		case 3:
			txtprecio.setText(""+BaseDatos.precio3);
			codigoMaleta=BaseDatos.codigo3;
			precio=BaseDatos.precio3;
			modelo=BaseDatos.modelo3;
			
			
			break;
			
		case 4:
			txtprecio.setText(""+BaseDatos.precio4);
			codigoMaleta=BaseDatos.codigo4;
			precio=BaseDatos.precio4;
		    modelo=BaseDatos.modelo4;
		    
		    
			break;
			
		}
	}
	
	protected void actionPerformedCboCodigo(ActionEvent arg0) {
		
		int codigo=getCodigo();
		getPrecio(codigo);
	
		
	}
	void getCantidad(){
		cantidad=Integer.parseInt(txtCantidad.getText());
		
	}
	double calcularImporteCompra(int a){
		return a*precio;
	}
	double calcularImporteDescuento(double a){
		double descuento;
		if(cantidad<=3){
			descuento=BaseDatos.porcentaje1*a;
		}
		else{
			if(cantidad<=5){
				descuento=BaseDatos.porcentaje2*a;
			}
			else{
				if(cantidad<=8){
					descuento=BaseDatos.porcentaje3*a;
				}
				else{
					descuento=BaseDatos.porcentaje4*a;
				}
			}
			
		}
		return descuento;
	}
	void calcularImportePagar(double a,double b){
		importePagar= b-a;
	}
	void mostrar(double importeCompra, double importeDescuento, String obsequio, String premio){
		txtS.append(" BOLETA\t"+"\t"+"\t"+"NUMERO: 000"+BaseDatos.acumuladorCliente+"\n");
		txtS.append(" -----------------------------------------------------------------\n");
		txtS.append(" Código Maleta\t"+"\t:"+codigoMaleta+"\n");
		txtS.append(" Modelo\t"+"\t:"+modelo+"\n");
		txtS.append(" Precio Maleta\t"+"\t:"+precio+"\n");
		txtS.append(" cantidad\t:"+"\t:"+cantidad+"\n");
		txtS.append(" Importe Compra\t:"+importeCompra+"\n");
		txtS.append(" Importe de Descuento \t:"+importeDescuento+"\n");
		txtS.append(" Importe a Pagar \t:"+importePagar+"\n");
		txtS.append(" Obsequio \t"+"\t:"+obsequio+"\n");
		txtS.append(" Premio Sorpresa \t:"+premio);
	
	}
	String calificarObsequio(){
		String obsequio="";
		if (cantidad<BaseDatos.cantidadMinima){
			obsequio="No califica ";
		}
		else {
			obsequio=BaseDatos.obsequio;
		}
		return obsequio;
	}
	void borrar(){
		txtS.setText("");
	}
	String ClientePremiado(){
		String premio="";
		if (BaseDatos.acumuladorCliente ==BaseDatos.numeroClientePremiado){
			premio=BaseDatos.premioSorpresa;
		}
		else {
			premio="No califica";
		}
		return premio;
		
	}
	void contadorCliente(){
		BaseDatos.acumuladorCliente++;
	}
	void mostrarMensaje(){
		String mensaje="Ingrese Cantidad";
		//JOptionPane.showMessageDialog(null, mensaje);
		lblMensaje.setText(mensaje);
		txtCantidad.setText("*");
		borrar();
	}
	
	
	int descuentoMT0,descuentoMT1,descuentoMT2,descuentoMT3,descuentoMT4;
	void reporte(int n){
		switch (n){
		case 0:
			
		    BaseDatos.ventas0=BaseDatos.ventas0+1;
		    BaseDatos.maleta0=BaseDatos.maleta0+cantidad;
		    BaseDatos.acumuladorprecio0=BaseDatos.acumuladorprecio0+importePagar;
		    	
		    descuentoMT0=BaseDatos.cantidadMT0-cantidad;
		    BaseDatos.cantidadMT0=descuentoMT0;
		    lblMt.setText(""+descuentoMT0);
			
		
			break;
			
		case 1:
			BaseDatos.ventas1=BaseDatos.ventas1+1;
		    BaseDatos.maleta1=BaseDatos.maleta1+cantidad;
		    BaseDatos.acumuladorprecio1=BaseDatos.acumuladorprecio1+importePagar;
		    descuentoMT1=BaseDatos.cantidadMT1-cantidad;
		    BaseDatos.cantidadMT1=descuentoMT1;
		    lblMt_1.setText(""+descuentoMT1);
			break;
			
		case 2:
			BaseDatos.ventas2=BaseDatos.ventas2+1;
		    BaseDatos.maleta2=BaseDatos.maleta2+cantidad;
		    BaseDatos.acumuladorprecio2=BaseDatos.acumuladorprecio2+importePagar;
		    descuentoMT2=BaseDatos.cantidadMT2-cantidad;
		    BaseDatos.cantidadMT2=descuentoMT2;
		    lblMt_2.setText(""+descuentoMT2);
			
			break;
			
		case 3:
			BaseDatos.ventas3=BaseDatos.ventas3+1;
		    BaseDatos.maleta3=BaseDatos.maleta3+cantidad;
		    BaseDatos.acumuladorprecio3=BaseDatos.acumuladorprecio3+importePagar;
		    descuentoMT3=BaseDatos.cantidadMT3-cantidad;
		    BaseDatos.cantidadMT3=descuentoMT3;
		    lblMt_3.setText(""+descuentoMT3);
			
			break;
			
		case 4:
			BaseDatos.ventas4=BaseDatos.ventas4+1;
		    BaseDatos.maleta4=BaseDatos.maleta4+cantidad;
		    BaseDatos.acumuladorprecio4=BaseDatos.acumuladorprecio4+importePagar;
		    descuentoMT4=BaseDatos.cantidadMT4-cantidad;
		    BaseDatos.cantidadMT4=descuentoMT4;
		    lblMt_4.setText(""+descuentoMT4);
			break;
			
		}
	}
	public void mouseDragged(MouseEvent arg0) {
	}
	public void mouseMoved(MouseEvent arg0) {
	}
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == lblCerrar) {
			mouseClickedLabel_1(e);
		}
		if (e.getSource() == lblCalcular) {
			mouseClickedLabel(e);
		}
	}
	public void mouseEntered(MouseEvent e) {
		if (e.getSource() == lblAlmacen) {
			mouseEnteredLblAlmacen(e);
		}
		if (e.getSource() == lblVentasDeMaletas) {
			mouseEnteredLblVentasDeMaletas(e);
		}
		if (e.getSource() == lblCerrar) {
			mouseEnteredLblVentasDeMaletas(e);
			lblCerrar.setBackground(new Color (255, 0, 0));
			lblCerrar.setForeground(Color.WHITE);
			lblCerrar.setOpaque(true);
		}
		if (e.getSource() == lblCalcular) {
			mouseEnteredLblVentasDeMaletas(e);
			lblCalcular.setBackground(new Color (24, 115, 42));
			lblCalcular.setForeground(Color.WHITE);
		}
		
	}
	public void mouseExited(MouseEvent e) {
		if (e.getSource() == lblCerrar) {
			mouseEnteredLblVentasDeMaletas(e);
			lblCerrar.setBackground(new Color(253, 187, 103));
			lblCerrar.setForeground(Color.BLACK);
			lblCerrar.setOpaque(false);
		}
		if (e.getSource() == lblCalcular) {
			mouseEnteredLblVentasDeMaletas(e);
			lblCalcular.setBackground(new Color (33, 155, 57));
			lblCalcular.setForeground(Color.WHITE);
		}
	}
	public void mousePressed(MouseEvent e) {
	}
	public void mouseReleased(MouseEvent e) {
	}
	protected void mouseClickedLabel(MouseEvent e) {
		String cantidadcaja=txtCantidad.getText();
		if (cantidadcaja.length()==0){
			mostrarMensaje();
			
		}
		else{
			lblMensaje.setText("");
			int codigo=getCodigo();
			getCantidad();
			getPrecio(codigo);
			borrar();
			
			
			double importeCompra=calcularImporteCompra(cantidad);
			double importeDescuento=calcularImporteDescuento(importeCompra);
			calcularImportePagar(importeCompra,importeDescuento);
			contadorCliente();
			String obsequio =calificarObsequio();
			String premio=ClientePremiado();
			reporte(codigo);
			mostrar(importeCompra,importeDescuento,obsequio,premio);
		}
	}
	protected void mouseClickedLabel_1(MouseEvent e) {
		setVisible(false);
	}
	protected void mouseEnteredLblVentasDeMaletas(MouseEvent e) {
	}
	protected void mouseEnteredLblAlmacen(MouseEvent e) {
	}
}
