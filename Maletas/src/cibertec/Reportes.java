package cibertec;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.JSeparator;

public class Reportes extends JDialog implements MouseListener {
	private JLabel lblReportes;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JPanel panel;
	private JLabel lbl0;
	private JLabel lbl1;
	private JLabel lbl2;
	private JLabel lbl3;
	private JLabel lbl4;
	private JLabel lblNewLabel;
	private JLabel lblTitulo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reportes dialog = new Reportes();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void setLblColor(JLabel lbl){
		lbl.setBackground(new Color (22,42,57));
	}
	public void resetLblColor(JLabel lbl){
		lbl.setBackground(new Color (33,63,86));
	}
	public void setLblColorX(JLabel lbl){
		lbl.setOpaque(true);
		lbl.setBackground(new Color (224, 18, 18));
		lbl.setForeground(new Color(255, 255, 255));
	}
	public void setX(JLabel lbl){
		lbl.setBackground(new Color (61, 61, 61));		
		lbl.setForeground(new Color(61, 61, 61));
		lbl.setOpaque(false);
	}
	
	void mostrar0(){
		txtS.setText("");
		lblTitulo.setText("VENTAS POR MALETA");
		txtS.append("\n Codigo \t"+"\t"+"\t: "+BaseDatos.codigo0);
		txtS.append("\n Modelo \t"+"\t"+"\t: "+BaseDatos.modelo0);
		txtS.append("\n Cantidad total de ventas \t"+"\t: "+BaseDatos.ventas0);
		txtS.append("\n Cantidad total de maletas vendidas \t: "+BaseDatos.maleta0);
		txtS.append("\n Importe total acumulado \t"+"\t: "+BaseDatos.acumuladorprecio0);
		txtS.append("\n--------------------------------------------------------------------------\n ");
		
		
		
		txtS.append("\n Codigo \t"+"\t"+"\t: "+BaseDatos.codigo1);
		txtS.append("\n Modelo \t"+"\t"+"\t: "+BaseDatos.modelo1);
		txtS.append("\n Cantidad total de ventas \t"+"\t: "+BaseDatos.ventas1);
		txtS.append("\n Cantidad total de maletas vendidas \t: "+BaseDatos.maleta1);
		txtS.append("\n Importe total acumulado \t"+"\t: "+BaseDatos.acumuladorprecio1);
		txtS.append("\n--------------------------------------------------------------------------\n ");
		
		txtS.append("\n Codigo \t"+"\t"+"\t: "+BaseDatos.codigo2);
		txtS.append("\n Modelo \t"+"\t"+"\t: "+BaseDatos.modelo2);
		txtS.append("\n Cantidad total de ventas \t"+"\t: "+BaseDatos.ventas2);
		txtS.append("\n Cantidad total de maletas vendidas \t: "+BaseDatos.maleta2);
		txtS.append("\n Importe total acumulado \t"+"\t: "+BaseDatos.acumuladorprecio2);
		txtS.append("\n--------------------------------------------------------------------------\n ");
	
		txtS.append("\n Codigo \t"+"\t"+"\t: "+BaseDatos.codigo3);
		txtS.append("\n Modelo \t"+"\t"+"\t: "+BaseDatos.modelo3);
		txtS.append("\n Cantidad total de ventas \t"+"\t: "+BaseDatos.ventas3);
		txtS.append("\n Cantidad total de maletas vendidas \t: "+BaseDatos.maleta3);
		txtS.append("\n Importe total acumulado \t"+"\t: "+BaseDatos.acumuladorprecio3);
		txtS.append("\n--------------------------------------------------------------------------\n ");
		
		
		txtS.append("\n Codigo \t"+"\t"+"\t: "+BaseDatos.codigo4);
		txtS.append("\n Modelo \t"+"\t"+"\t: "+BaseDatos.modelo4);
		txtS.append("\n Cantidad total de ventas \t"+"\t: "+BaseDatos.ventas4);
		txtS.append("\n Cantidad total de maletas vendidas \t: "+BaseDatos.maleta4);
		txtS.append("\n Importe total acumulado \t"+"\t: "+BaseDatos.acumuladorprecio4);
	}
	//Glovales 
	String ventaOptima0,ventaOptima1,ventaOptima2,ventaOptima3,ventaOptima4;
	private JLabel lblTipoDeReporte;
	private JSeparator separator;
	
	void CalificarVentaOptima0(){
		
		if (BaseDatos.cantidadOptima<BaseDatos.maleta0){
			
			ventaOptima0=(""+(BaseDatos.maleta0-BaseDatos.cantidadOptima));
			
		}
		else {
			ventaOptima0="Sin ventas optimas";
		}
	}
	void CalificarVentaOptima1(){
			
			if (BaseDatos.cantidadOptima<BaseDatos.maleta1){
				
				ventaOptima1=(""+(BaseDatos.maleta1-BaseDatos.cantidadOptima));
				
			}
			else {
				ventaOptima1="Sin ventas optimas";
			}
		}
	void CalificarVentaOptima2(){
			
			if (BaseDatos.cantidadOptima<BaseDatos.maleta2){
				
				ventaOptima2=(""+(BaseDatos.maleta2-BaseDatos.cantidadOptima));
				
			}
			else {
				ventaOptima2="Sin ventas optimas";
			}
		}
	void CalificarVentaOptima3(){
			
			if (BaseDatos.cantidadOptima<BaseDatos.maleta3){
				
				ventaOptima3=(""+(BaseDatos.maleta3-BaseDatos.cantidadOptima));
				
			}
			else {
				ventaOptima3="Sin ventas optimas";
			}
		}
	void CalificarVentaOptima4(){
			
			if (BaseDatos.cantidadOptima<BaseDatos.maleta4){
				
				ventaOptima4=(""+(BaseDatos.maleta4-BaseDatos.cantidadOptima));
				
			}
			else {
				ventaOptima4="Sin ventas optimas";
			}
		}
	
	void ventasOptimas(){
		txtS.setText("");
		lblTitulo.setText("MALETAS CON VENTA ÓPTIMA");
		txtS.append("\n Codigo \t"+"\t"+"\t: "+BaseDatos.codigo0);
		txtS.append("\n Modelo \t"+"\t"+"\t: "+BaseDatos.modelo0);
		txtS.append("\n Total de maletas vendidas \t"+"\t: "+BaseDatos.maleta0);
		txtS.append("\n Total de ventas optima \t"+"\t: "+ventaOptima0);
		txtS.append("\n--------------------------------------------------------------------------\n ");
		
		txtS.append("\n Codigo \t"+"\t"+"\t: "+BaseDatos.codigo1);
		txtS.append("\n Modelo \t"+"\t"+"\t: "+BaseDatos.modelo1);
		txtS.append("\n Total de maletas vendidas \t"+"\t: "+BaseDatos.maleta1);
		txtS.append("\n Total de ventas optima \t"+"\t: "+ventaOptima1);
		txtS.append("\n--------------------------------------------------------------------------\n ");
		
		txtS.append("\n Codigo \t"+"\t"+"\t: "+BaseDatos.codigo2);
		txtS.append("\n Modelo \t"+"\t"+"\t: "+BaseDatos.modelo2);
		txtS.append("\n Total de maletas vendidas \t"+"\t: "+BaseDatos.maleta2);
		txtS.append("\n Total de ventas optima \t"+"\t: "+ventaOptima2);
		txtS.append("\n--------------------------------------------------------------------------\n ");
		
		txtS.append("\n Codigo \t"+"\t"+"\t: "+BaseDatos.codigo3);
		txtS.append("\n Modelo \t"+"\t"+"\t: "+BaseDatos.modelo3);
		txtS.append("\n Total de maletas vendidas \t"+"\t: "+BaseDatos.maleta3);
		txtS.append("\n Total de ventas optima \t"+"\t: "+ventaOptima3);
		txtS.append("\n--------------------------------------------------------------------------\n ");
		
		txtS.append("\n Codigo \t"+"\t"+"\t: "+BaseDatos.codigo4);
		txtS.append("\n Modelo \t"+"\t"+"\t: "+BaseDatos.modelo4);
		txtS.append("\n Total de maletas vendidas \t"+"\t: "+BaseDatos.maleta4);
		txtS.append("\n Total de ventas optima \t"+"\t: "+ventaOptima4);
	}
	//variable global
	double promedio;
	int contadormenorMayor, contadorMenor;
	
	void precioPromedioMenor(){
		txtS.setText("");
		lblTitulo.setText("MALETAS CON PRECIOS MENOR AL PRECIO PROMEDIO");
		promedio=(BaseDatos.precio0+BaseDatos.precio1+BaseDatos.precio2+BaseDatos.precio3+BaseDatos.precio4)/5;
		
		if(BaseDatos.precio0<promedio){
			txtS.append("\n Modelo \t"+"\t"+"\t: "+BaseDatos.modelo0);
			txtS.append("\n Precio \t"+"\t"+"\t: "+BaseDatos.precio0);
			txtS.append("\n--------------------------------------------------------------------------\n ");	
			contadorMenor=contadorMenor+1;
		}
		if(BaseDatos.precio1<promedio){
			txtS.append("\n Modelo \t"+"\t"+"\t: "+BaseDatos.modelo1);
			txtS.append("\n Precio \t"+"\t"+"\t: "+BaseDatos.precio1);
			txtS.append("\n--------------------------------------------------------------------------\n ");	
			contadorMenor=contadorMenor+1;
		}
		if(BaseDatos.precio2<promedio){
			txtS.append("\n Modelo \t"+"\t"+"\t: "+BaseDatos.modelo2);
			txtS.append("\n Precio \t"+"\t"+"\t: "+BaseDatos.precio2);
			txtS.append("\n--------------------------------------------------------------------------\n ");	
			contadorMenor=contadorMenor+1;
		}
		if(BaseDatos.precio3<promedio){
			txtS.append("\n Modelo \t"+"\t"+"\t: "+BaseDatos.modelo3);
			txtS.append("\n Precio \t"+"\t"+"\t: "+BaseDatos.precio3);
			txtS.append("\n--------------------------------------------------------------------------\n ");	
			contadorMenor=contadorMenor+1;
		}
		if(BaseDatos.precio4<promedio){
			txtS.append("\n Modelo \t"+"\t"+"\t: "+BaseDatos.modelo4);
			txtS.append("\n Precio \t"+"\t"+"\t: "+BaseDatos.precio4);
			txtS.append("\n--------------------------------------------------------------------------\n ");	
			contadorMenor=contadorMenor+1;;
		}
		txtS.append("\n Precio promedio "+"\t"+"\t: "+promedio);
		txtS.append("\n Cantidad de maletas "+"\t"+"\t: "+contadorMenor);
		

	}
	
	
	void precioPromedioMayor(){
		txtS.setText("");
		lblTitulo.setText("MALETAS CON PRECIOS MAYOR AL PRECIO PROMEDIO");
		promedio=(BaseDatos.precio0+BaseDatos.precio1+BaseDatos.precio2+BaseDatos.precio3+BaseDatos.precio4)/5;
		
		if(BaseDatos.precio0>promedio){
			txtS.append("\n Modelo \t"+"\t"+"\t: "+BaseDatos.modelo0);
			txtS.append("\n Precio \t"+"\t"+"\t: "+BaseDatos.precio0);
			txtS.append("\n--------------------------------------------------------------------------\n ");	
			contadormenorMayor=contadormenorMayor+1;
		}
		if(BaseDatos.precio1>promedio){
			txtS.append("\n Modelo \t"+"\t"+"\t: "+BaseDatos.modelo1);
			txtS.append("\n Precio \t"+"\t"+"\t: "+BaseDatos.precio1);
			txtS.append("\n--------------------------------------------------------------------------\n ");	
			contadormenorMayor=contadormenorMayor+1;
			}
		if(BaseDatos.precio2>promedio){
			txtS.append("\n Modelo \t"+"\t"+"\t: "+BaseDatos.modelo2);
			txtS.append("\n Precio \t"+"\t"+"\t: "+BaseDatos.precio2);
			txtS.append("\n--------------------------------------------------------------------------\n ");	
			contadormenorMayor=contadormenorMayor+1;
		}
		if(BaseDatos.precio3>promedio){
			txtS.append("\n Modelo \t"+"\t"+"\t: "+BaseDatos.modelo3);
			txtS.append("\n Precio \t"+"\t"+"\t: "+BaseDatos.precio3);
			txtS.append("\n--------------------------------------------------------------------------\n ");	
			contadormenorMayor=contadormenorMayor+1;
		}
		if(BaseDatos.precio4>promedio){
			txtS.append("\n Modelo \t"+"\t"+"\t: "+BaseDatos.modelo4);
			txtS.append("\n Precio \t"+"\t"+"\t: "+BaseDatos.precio4);
			txtS.append("\n--------------------------------------------------------------------------\n ");	
			contadormenorMayor=contadormenorMayor+1;
		}
		txtS.append("\n Precio promedio "+"\t"+"\t: "+promedio);
		txtS.append("\n Cantidad de maletas "+"\t"+"\t: "+contadormenorMayor);
		

	}
	
	double promPrecio=0,promAncho=0, promAlto=0, promFondo=0;
	double precioMenor, precioMayor,fondoMinimo,fondoMaximo;
	
	void fondo(){
		promFondo=(BaseDatos.fondo0+BaseDatos.fondo1+BaseDatos.fondo2+BaseDatos.fondo3+BaseDatos.fondo4)/5;
		txtS.append("\n"+"\n Fondo promedio "+"\t"+": "+promFondo+" cm");
		if ((BaseDatos.fondo0<=BaseDatos.fondo1)&&(BaseDatos.fondo0<=BaseDatos.fondo2)&&(BaseDatos.fondo0<=BaseDatos.fondo3)&&(BaseDatos.fondo0<=BaseDatos.fondo4)){
			fondoMinimo=BaseDatos.fondo0;
		}
		if ((BaseDatos.fondo1<=BaseDatos.fondo0)&&(BaseDatos.fondo1<=BaseDatos.fondo2)&&(BaseDatos.fondo1<=BaseDatos.fondo3)&&(BaseDatos.fondo1<=BaseDatos.fondo4)){
			fondoMinimo=BaseDatos.fondo1;
		}
		if ((BaseDatos.fondo2<=BaseDatos.fondo0)&&(BaseDatos.fondo2<=BaseDatos.fondo1)&&(BaseDatos.fondo2<=BaseDatos.fondo3)&&(BaseDatos.fondo2<=BaseDatos.fondo4)){
			fondoMinimo=BaseDatos.fondo2;
		}
		if ((BaseDatos.fondo3<=BaseDatos.fondo0)&&(BaseDatos.fondo3<=BaseDatos.fondo1)&&(BaseDatos.fondo3<=BaseDatos.fondo2)&&(BaseDatos.fondo3<=BaseDatos.fondo4)){
			fondoMinimo=BaseDatos.fondo3;
		}
		if ((BaseDatos.fondo4<=BaseDatos.fondo0)&&(BaseDatos.fondo4<=BaseDatos.fondo1)&&(BaseDatos.fondo4<=BaseDatos.fondo2)&&(BaseDatos.fondo4<=BaseDatos.fondo3)){
			fondoMinimo=BaseDatos.fondo4;
		}
		
		txtS.append("\n Fondo Minimo "+"\t"+"\t: "+fondoMinimo+" cm");
		
		
		
		
		if ((BaseDatos.fondo0>=BaseDatos.fondo1)&&(BaseDatos.fondo0>=BaseDatos.fondo2)&&(BaseDatos.fondo0>=BaseDatos.fondo3)&&(BaseDatos.fondo0>=BaseDatos.fondo4)){
			fondoMaximo=BaseDatos.fondo0;
		}
		if ((BaseDatos.fondo1>=BaseDatos.fondo0)&&(BaseDatos.fondo1>=BaseDatos.fondo2)&&(BaseDatos.fondo1>=BaseDatos.fondo3)&&(BaseDatos.fondo1>=BaseDatos.fondo4)){
			fondoMaximo=BaseDatos.fondo1;
		}
		if ((BaseDatos.fondo2>=BaseDatos.fondo0)&&(BaseDatos.fondo2>=BaseDatos.fondo1)&&(BaseDatos.fondo2>=BaseDatos.fondo3)&&(BaseDatos.fondo2>=BaseDatos.fondo4)){
			fondoMaximo=BaseDatos.fondo2;
		}
		if ((BaseDatos.fondo3>=BaseDatos.fondo0)&&(BaseDatos.fondo3>=BaseDatos.fondo1)&&(BaseDatos.fondo3>=BaseDatos.fondo2)&&(BaseDatos.fondo3>=BaseDatos.fondo4)){
			fondoMaximo=BaseDatos.fondo3;
		}
		if ((BaseDatos.fondo4>=BaseDatos.fondo0)&&(BaseDatos.fondo4>=BaseDatos.fondo1)&&(BaseDatos.fondo4>=BaseDatos.fondo2)&&(BaseDatos.fondo4>=BaseDatos.fondo3)){
			fondoMaximo=BaseDatos.fondo4;
		}
		
		txtS.append("\n Fondo Maximo "+"\t"+"\t: "+fondoMaximo+" cm");
	}
	void alto(){
		promAlto=Math.rint(BaseDatos.alto0+BaseDatos.alto1+BaseDatos.alto2+BaseDatos.alto3+BaseDatos.alto4)/5;
		txtS.append("\n"+"\n Alto promedio "+"\t"+"\t: "+promAlto+" cm");
		if ((BaseDatos.alto0<BaseDatos.alto1)&&(BaseDatos.alto0<BaseDatos.alto2)&&(BaseDatos.alto0<BaseDatos.alto3)&&(BaseDatos.alto0<BaseDatos.alto4)){
			txtS.append("\n Alto Minimo "+"\t"+"\t: "+BaseDatos.alto0+" cm");
		}
		if ((BaseDatos.alto1<BaseDatos.alto0)&&(BaseDatos.alto1<BaseDatos.alto2)&&(BaseDatos.alto1<BaseDatos.alto3)&&(BaseDatos.alto1<BaseDatos.alto4)){
			txtS.append("\n Alto Maximo "+"\t"+"\t: "+BaseDatos.alto1+" cm");
		}
		if ((BaseDatos.alto2<BaseDatos.alto0)&&(BaseDatos.alto2<BaseDatos.alto1)&&(BaseDatos.alto2<BaseDatos.alto3)&&(BaseDatos.alto2<BaseDatos.alto4)){
			txtS.append("\n Alto Minimo "+"\t"+"\t: "+BaseDatos.alto2+" cm");
		}
		if ((BaseDatos.alto3<BaseDatos.alto0)&&(BaseDatos.alto3<BaseDatos.alto1)&&(BaseDatos.alto3<BaseDatos.alto2)&&(BaseDatos.alto3<BaseDatos.alto4)){
			txtS.append("\n Alto Minimo "+"\t"+"\t: "+BaseDatos.alto3+" cm");
		}
		if ((BaseDatos.alto4<BaseDatos.alto0)&&(BaseDatos.alto4<BaseDatos.alto1)&&(BaseDatos.alto4<BaseDatos.alto2)&&(BaseDatos.alto4<BaseDatos.alto3)){
			txtS.append("\n Alto Minimo "+"\t"+"\t: "+BaseDatos.alto4+" cm");
		}
		
		
		if ((BaseDatos.alto0>BaseDatos.alto1)&&(BaseDatos.alto0>BaseDatos.alto2)&&(BaseDatos.alto0>BaseDatos.alto3)&&(BaseDatos.alto0>BaseDatos.alto4)){
			txtS.append("\n Alto Maximo "+"\t"+"\t: "+BaseDatos.alto0+" cm");
		}
		if ((BaseDatos.alto1>BaseDatos.alto0)&&(BaseDatos.alto1>BaseDatos.alto2)&&(BaseDatos.alto1>BaseDatos.alto3)&&(BaseDatos.alto1>BaseDatos.alto4)){
			txtS.append("\n Alto Maximo "+"\t"+"\t: "+BaseDatos.alto1+" cm");
		}
		if ((BaseDatos.alto2>BaseDatos.alto0)&&(BaseDatos.alto2>BaseDatos.alto1)&&(BaseDatos.alto2>BaseDatos.alto3)&&(BaseDatos.alto2>BaseDatos.alto4)){
			txtS.append("\n Alto Maximo "+"\t"+"\t: "+BaseDatos.alto2+" cm");
		}
		if ((BaseDatos.alto3>BaseDatos.alto0)&&(BaseDatos.alto3>BaseDatos.alto1)&&(BaseDatos.alto3>BaseDatos.alto2)&&(BaseDatos.alto3>BaseDatos.alto4)){
			txtS.append("\n Alto Maximo "+"\t"+"\t: "+BaseDatos.alto3+" cm");
		}
		if ((BaseDatos.alto4>BaseDatos.alto0)&&(BaseDatos.alto4>BaseDatos.alto1)&&(BaseDatos.alto4>BaseDatos.alto2)&&(BaseDatos.alto4>BaseDatos.alto3)){
			txtS.append("\n Alto Maximo "+"\t"+"\t: "+BaseDatos.alto4+" cm");
		}
		
		
		
		
	}
	void ancho(){
			
			promAncho=Math.rint(BaseDatos.ancho0+BaseDatos.ancho1+BaseDatos.ancho2+BaseDatos.ancho3+BaseDatos.ancho4)/5;
			txtS.append("\n"+"\n Ancho promedio "+"\t"+": "+promAncho+" cm");
			if ((BaseDatos.ancho0<BaseDatos.ancho1)&& (BaseDatos.ancho0<BaseDatos.ancho2)&&(BaseDatos.ancho0<BaseDatos.ancho3)&&(BaseDatos.ancho0<BaseDatos.ancho4)){
				
				txtS.append("\n Ancho Minimo "+"\t"+"\t: "+BaseDatos.ancho0+" cm");
			}
			if ((BaseDatos.ancho1<BaseDatos.ancho0)&& (BaseDatos.ancho1<BaseDatos.ancho2)&&(BaseDatos.ancho1<BaseDatos.ancho3)&&(BaseDatos.ancho1<BaseDatos.ancho4)){
				txtS.append("\n Ancho Minimo "+"\t"+"\t: "+BaseDatos.ancho1+" cm");
			}
			if ((BaseDatos.ancho2<BaseDatos.ancho0)&& (BaseDatos.ancho2<BaseDatos.ancho1)&&(BaseDatos.ancho2<BaseDatos.ancho3)&&(BaseDatos.ancho2<BaseDatos.ancho4)){
				txtS.append("\n Ancho Minimo "+"\t"+"\t: "+BaseDatos.ancho2+" cm");
			}
			if ((BaseDatos.ancho3<BaseDatos.ancho0)&& (BaseDatos.ancho3<BaseDatos.ancho1)&&(BaseDatos.ancho3<BaseDatos.ancho2)&&(BaseDatos.ancho3<BaseDatos.ancho4)){
				txtS.append("\n Ancho Minimo "+"\t"+"\t: "+BaseDatos.ancho3+" cm");
			}
			if ((BaseDatos.ancho4<BaseDatos.ancho0)&& (BaseDatos.ancho4<BaseDatos.ancho1)&&(BaseDatos.ancho4<BaseDatos.ancho2)&&(BaseDatos.ancho4<BaseDatos.ancho3)){
				txtS.append("\n Ancho Minimo "+"\t"+"\t: "+BaseDatos.ancho4+" cm");
			}
			


			
			if ((BaseDatos.ancho0>BaseDatos.ancho1)&& (BaseDatos.ancho0>BaseDatos.ancho2)&&(BaseDatos.ancho0>BaseDatos.ancho3)&&(BaseDatos.ancho0>BaseDatos.ancho4)){
				
				txtS.append("\n Ancho Maximo "+"\t"+"\t: "+BaseDatos.ancho0+" cm");
			}
			if ((BaseDatos.ancho1>BaseDatos.ancho0)&& (BaseDatos.ancho1>BaseDatos.ancho2)&&(BaseDatos.ancho1>BaseDatos.ancho3)&&(BaseDatos.ancho1>BaseDatos.ancho4)){
				txtS.append("\n Ancho Maximo "+"\t"+"\t: "+BaseDatos.ancho1+" cm");
			}
			if ((BaseDatos.ancho2>BaseDatos.ancho0)&& (BaseDatos.ancho2>BaseDatos.ancho1)&&(BaseDatos.ancho2>BaseDatos.ancho3)&&(BaseDatos.ancho2>BaseDatos.ancho4)){
				txtS.append("\n Ancho Maximo "+"\t"+"\t: "+BaseDatos.ancho2+" cm");
			}
			if ((BaseDatos.ancho3>BaseDatos.ancho0)&& (BaseDatos.ancho3>BaseDatos.ancho1)&&(BaseDatos.ancho3>BaseDatos.ancho2)&&(BaseDatos.ancho3>BaseDatos.ancho4)){
				txtS.append("\n Ancho Maximo "+"\t"+"\t: "+BaseDatos.ancho3+" cm");
			}
			if ((BaseDatos.ancho4>BaseDatos.ancho0)&& (BaseDatos.ancho4>BaseDatos.ancho1)&&(BaseDatos.ancho4>BaseDatos.ancho2)&&(BaseDatos.ancho4>BaseDatos.ancho3)){
				txtS.append("\n Ancho Maximo "+"\t"+"\t: "+BaseDatos.ancho4+" cm");
			}
			
	
	
			
			
			
			
			
		}
	
	void precio(){
		txtS.setText("");
		promPrecio=(BaseDatos.precio0+BaseDatos.precio1+BaseDatos.precio2+BaseDatos.precio3+BaseDatos.precio4)/5;
		txtS.append("\n Precio promedio "+"\t"+": S./ "+promPrecio);
		if ((BaseDatos.precio0<BaseDatos.precio1)&& (BaseDatos.precio0<BaseDatos.precio2)&&(BaseDatos.precio0<BaseDatos.precio3)&&(BaseDatos.precio0<BaseDatos.precio4)){
			precioMenor=BaseDatos.precio0;
			txtS.append("\n Precio Minimo "+"\t"+"\t:S./ "+precioMenor);
		}
		if ((BaseDatos.precio1<BaseDatos.precio0)&& (BaseDatos.precio1<BaseDatos.precio2)&&(BaseDatos.precio1<BaseDatos.precio3)&&(BaseDatos.precio1<BaseDatos.precio4)){
			precioMenor=BaseDatos.precio1;
			txtS.append("\n Precio Minimo "+"\t"+"\t:S./ "+precioMenor);
		}
		if ((BaseDatos.precio2<BaseDatos.precio0)&& (BaseDatos.precio2<BaseDatos.precio1)&&(BaseDatos.precio2<BaseDatos.precio3)&&(BaseDatos.precio2<BaseDatos.precio4)){
			precioMenor=BaseDatos.precio2;
			txtS.append("\n Precio Minimo "+"\t"+"\t:S./ "+precioMenor);
		}
		if ((BaseDatos.precio3<BaseDatos.precio0)&& (BaseDatos.precio3<BaseDatos.precio1)&&(BaseDatos.precio3<BaseDatos.precio2)&&(BaseDatos.precio3<BaseDatos.precio4)){
			precioMenor=BaseDatos.precio3;
			txtS.append("\n Precio Minimo "+"\t"+"\t:S./ "+precioMenor);
		}
		if ((BaseDatos.precio4<BaseDatos.precio0)&& (BaseDatos.precio4<BaseDatos.precio1)&&(BaseDatos.precio4<BaseDatos.precio2)&&(BaseDatos.precio4<BaseDatos.precio3)){
			precioMenor=BaseDatos.precio4;
			txtS.append("\n Precio Minimo "+"\t"+"\t:S./ "+precioMenor);
		}
		


		
		
		
		
		if ((BaseDatos.precio0>BaseDatos.precio1)&& (BaseDatos.precio0>BaseDatos.precio2)&&(BaseDatos.precio0>BaseDatos.precio3)&&(BaseDatos.precio0>BaseDatos.precio4)){
			precioMayor=BaseDatos.precio0;
			txtS.append("\n Precio Maximo "+"\t"+"\t:S./ "+precioMayor);
		}
		if ((BaseDatos.precio1>BaseDatos.precio0)&& (BaseDatos.precio1>BaseDatos.precio2)&&(BaseDatos.precio1>BaseDatos.precio3)&&(BaseDatos.precio1>BaseDatos.precio4)){
			precioMayor=BaseDatos.precio1;
			txtS.append("\n Precio Maximo "+"\t"+"\t:S./ "+precioMayor);
		}
		if ((BaseDatos.precio2>BaseDatos.precio0)&& (BaseDatos.precio2>BaseDatos.precio1)&&(BaseDatos.precio2>BaseDatos.precio3)&&(BaseDatos.precio2>BaseDatos.precio4)){
			precioMayor=BaseDatos.precio2;
			txtS.append("\n Precio Maximo "+"\t"+"\t:S./ "+precioMayor);
		}
		if ((BaseDatos.precio3>BaseDatos.precio0)&& (BaseDatos.precio3>BaseDatos.precio1)&&(BaseDatos.precio3>BaseDatos.precio2)&&(BaseDatos.precio3>BaseDatos.precio4)){
			precioMayor=BaseDatos.precio3;
			txtS.append("\n Precio Maximo "+"\t"+"\t:S./ "+precioMayor);
		}
		if ((BaseDatos.precio4>BaseDatos.precio0)&& (BaseDatos.precio4>BaseDatos.precio1)&&(BaseDatos.precio4>BaseDatos.precio2)&&(BaseDatos.precio4>BaseDatos.precio3)){
			precioMayor=BaseDatos.precio4;
			txtS.append("\n Precio Maximo "+"\t"+"\t:S./ "+precioMayor);
		}
	}
	
	/**
	 * Create the dialog.
	 */
	public Reportes() {
		setUndecorated(true);
		setBounds(100, 100, 693, 503);
		getContentPane().setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(240, 55, 443, 437);
		getContentPane().add(scrollPane);
		
		txtS = new JTextArea();
		txtS.setEditable(false);
		scrollPane.setViewportView(txtS);
		
		panel = new JPanel();
		panel.setBackground(new Color(33,63,86));
		panel.setBounds(0, 0, 230, 503);
		getContentPane().add(panel);
		panel.setLayout(null);
		
			
		lblReportes = new JLabel("X");
		lblReportes.setOpaque(true);
		lblReportes.addMouseListener(this);
		lblReportes.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblReportes.setForeground ( new Color(33,63,86));
		lblReportes.setBounds(661, 0, 32, 25);
		getContentPane().add(lblReportes);
		lblReportes.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		
		lbl0 = new JLabel("Por maleta");
		lbl0.addMouseListener(this);
		lbl0.setBackground(new Color(22,42,57));
		lbl0.setFont(new Font("Yu Gothic UI", Font.BOLD, 12));
		lbl0.setForeground(new Color(255, 255, 255));
		lbl0.setBounds(10, 173, 200, 23);
		panel.add(lbl0);
		lbl0.setHorizontalAlignment(SwingConstants.CENTER);
		lbl0.setOpaque(true);
		
		lbl1 = new JLabel("\u00D3ptima");
		lbl1.addMouseListener(this);
		lbl1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1.setForeground(Color.WHITE);
		lbl1.setFont(new Font("Yu Gothic UI", Font.BOLD, 12));
		lbl1.setBackground(new Color(33,63,86));
		lbl1.setBounds(10, 207, 200, 23);
		panel.add(lbl1);
		lbl1.setOpaque(true);
		
		lbl2 = new JLabel("Menores al precio promedio");
		lbl2.addMouseListener(this);
		lbl2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2.setForeground(Color.WHITE);
		lbl2.setFont(new Font("Yu Gothic UI", Font.BOLD, 12));
		lbl2.setBackground(new Color(33,63,86));
		lbl2.setBounds(10, 241, 200, 23);
		panel.add(lbl2);
		lbl2.setOpaque(true);
		
		lbl3 = new JLabel("Mayores al precio promedio");
		lbl3.addMouseListener(this);
		lbl3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl3.setForeground(Color.WHITE);
		lbl3.setFont(new Font("Yu Gothic UI", Font.BOLD, 12));
		lbl3.setBackground(new Color(33,63,86));
		lbl3.setBounds(10, 270, 200, 23);
		panel.add(lbl3);
		lbl3.setOpaque(true);
		
		
		lbl4 = new JLabel("Promedios, Maximos y Minimos");
		lbl4.addMouseListener(this);
		lbl4.setHorizontalAlignment(SwingConstants.CENTER);
		lbl4.setForeground(Color.WHITE);
		lbl4.setFont(new Font("Yu Gothic UI", Font.BOLD, 12));
		lbl4.setBackground(new Color(33,63,86));
		lbl4.setBounds(10, 304, 200, 23);
		panel.add(lbl4);
		lbl4.setOpaque(true);
		
		lblTipoDeReporte = new JLabel("TIPO DE REPORTE");
		lblTipoDeReporte.setForeground(Color.WHITE);
		lblTipoDeReporte.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblTipoDeReporte.setBounds(10, 97, 158, 28);
		panel.add(lblTipoDeReporte);
		
		separator = new JSeparator();
		separator.setBounds(10, 123, 147, 2);
		panel.add(separator);
		
		lblTitulo = new JLabel("");
		lblTitulo.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblTitulo.setForeground(new Color(128, 0, 128));
		lblTitulo.setBounds(240, 25, 443, 25);
		getContentPane().add(lblTitulo);
		
		

	}
	public void mouseClicked(MouseEvent arg0) {
		
		
		if (arg0.getSource() == lblReportes) {
			mouseClickedLblReportes(arg0);
		}
		
		if (arg0.getSource() == lbl4) {
			mouseClickedLbl4(arg0);
		}
		if (arg0.getSource() == lbl3) {
			mouseClickedLbl3(arg0);
		}
		if (arg0.getSource() == lbl2) {
			mouseClickedLbl2(arg0);
		}
		if (arg0.getSource() == lbl1) {
			mouseClickedLbl1(arg0);
		}
		if (arg0.getSource() == lbl0) {
			mouseClickedLblPorMaletas(arg0);
		}
	}
	public void mouseEntered(MouseEvent e) {
		
		
	}
	public void mouseExited(MouseEvent e) {
		
		
	}
	public void mousePressed(MouseEvent e) {
	}
	public void mouseReleased(MouseEvent e) {
	}
	protected void mouseClickedLblPorMaletas(MouseEvent arg0) {
		setLblColor(lbl0);
		resetLblColor(lbl1);
		resetLblColor(lbl2);
		resetLblColor(lbl3);
		resetLblColor(lbl4);
		mostrar0();
	}
	protected void mouseClickedLbl1(MouseEvent arg0) {
		setLblColor(lbl1);
		resetLblColor(lbl0);
		resetLblColor(lbl2);
		resetLblColor(lbl3);
		resetLblColor(lbl4);
		CalificarVentaOptima0();
		CalificarVentaOptima1();
		CalificarVentaOptima2();
		CalificarVentaOptima3();
		CalificarVentaOptima4();
		ventasOptimas();
		
	}
	protected void mouseClickedLbl2(MouseEvent arg0) {
		setLblColor(lbl2);
		resetLblColor(lbl1);
		resetLblColor(lbl0);
		resetLblColor(lbl3);
		resetLblColor(lbl4);
		precioPromedioMenor();
	}
	protected void mouseClickedLbl3(MouseEvent arg0) {
		setLblColor(lbl3);
		resetLblColor(lbl1);
		resetLblColor(lbl2);
		resetLblColor(lbl0);
		resetLblColor(lbl4);
		precioPromedioMayor();
	}
	protected void mouseClickedLbl4(MouseEvent arg0) {
		setLblColor(lbl4);
		resetLblColor(lbl1);
		resetLblColor(lbl2);
		resetLblColor(lbl3);
		resetLblColor(lbl0);
		lblTitulo.setText("PROMEDIO, MAXIMOS Y MINIMOS");
		precio();
		ancho();
		alto();
		fondo();
		
	}
	protected void mouseClickedLblReportes(MouseEvent arg0) {
		setVisible(false);
	}
}
