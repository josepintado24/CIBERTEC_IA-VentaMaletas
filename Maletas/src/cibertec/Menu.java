package cibertec;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JSeparator;
import java.awt.Toolkit;
import java.awt.SystemColor;

public class Menu extends JFrame implements ActionListener {
	
	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnArchivo;
	private JMenuItem mntmSalir;
	private JMenu mnMantenimiento;
	private JMenuItem mntmConsultarMaletas;
	private JMenuItem mntmModificarMaleta;
	private JMenuItem mntmListaDeMaletas;
	private JMenu mnVentas;
	private JMenuItem mntmVender;
	private JMenuItem mntmGenerarReportes;
	private JMenu mnConfiguracion;
	private JMenuItem mntmConfigurarDescuentos;
	private JMenuItem mntmConfigurarObsequio;
	private JMenuItem mntmConfigurarCantidadptima;
	private JMenuItem mntmConfigurarPremioSorpresa;
	private JMenu mnNewMenu;
	private JMenuItem mntmAcercaDeTienda;
	private JLabel label;
	private JLabel lblNewLabel;
	private JSeparator separator;
	private JSeparator separator_1;
	private JSeparator separator_2;
	private JSeparator separator_3;
	private JMenuItem mntmNewMenuItem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Menu() {
		setUndecorated(true);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Menu.class.getResource("/imagenes/30-48.png")));
		
		
		setResizable(false);
		setTitle("Tienda 1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 651, 459);
		
		menuBar = new JMenuBar();
		menuBar.setFont(new Font("Segoe UI Light", Font.PLAIN, 15));
		menuBar.setForeground(new Color(0, 128, 128));
		menuBar.setBackground(new Color(47, 79, 79));
		setJMenuBar(menuBar);
		
		mnArchivo = new JMenu("Archivo");
		mnArchivo.setIcon(new ImageIcon(Menu.class.getResource("/imagenes/1498865410_th-menu.png")));
		mnArchivo.setForeground(Color.WHITE);
		mnArchivo.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		mnArchivo.setBackground(Color.WHITE);
		menuBar.add(mnArchivo);
		
		mntmSalir = new JMenuItem("Salir");
		mntmSalir.setBackground(new Color(0, 0, 0));
		mntmSalir.setForeground(new Color(255, 255, 255));
		mntmSalir.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		mntmSalir.addActionListener(this);
		mnArchivo.add(mntmSalir);
		
		mntmNewMenuItem = new JMenuItem("Suspender");
		mntmNewMenuItem.addActionListener(this);
		mntmNewMenuItem.setBackground(SystemColor.controlText);
		mntmNewMenuItem.setForeground(SystemColor.menu);
		mntmNewMenuItem.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		mnArchivo.add(mntmNewMenuItem);
		
		mnMantenimiento = new JMenu("Mantenimiento");
		mnMantenimiento.setIcon(new ImageIcon(Menu.class.getResource("/imagenes/mantenimiento.png")));
		mnMantenimiento.setForeground(new Color(255, 255, 255));
		mnMantenimiento.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		menuBar.add(mnMantenimiento);
		
		mntmConsultarMaletas = new JMenuItem("Consultar maleta");
		mntmConsultarMaletas.addActionListener(this);
		mntmConsultarMaletas.setBackground(new Color(0, 128, 128));
		mntmConsultarMaletas.setForeground(new Color(255, 255, 255));
		mntmConsultarMaletas.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		mnMantenimiento.add(mntmConsultarMaletas);
		
		mntmModificarMaleta = new JMenuItem("Modificar maleta");
		mntmModificarMaleta.addActionListener(this);
		mntmModificarMaleta.setBackground(new Color(0, 128, 128));
		mntmModificarMaleta.setForeground(new Color(255, 255, 255));
		mntmModificarMaleta.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		mnMantenimiento.add(mntmModificarMaleta);
		
		mntmListaDeMaletas = new JMenuItem("Lista de maletas");
		mntmListaDeMaletas.addActionListener(this);
		mntmListaDeMaletas.setBackground(new Color(0, 128, 128));
		mntmListaDeMaletas.setForeground(new Color(255, 255, 255));
		mntmListaDeMaletas.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		mnMantenimiento.add(mntmListaDeMaletas);
		
		mnVentas = new JMenu("Ventas");
		mnVentas.setIcon(new ImageIcon(Menu.class.getResource("/imagenes/1498867008_check_book.png")));
		mnVentas.setBackground(new Color(0, 128, 128));
		mnVentas.setForeground(new Color(255, 255, 255));
		mnVentas.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		menuBar.add(mnVentas);
		
		mntmVender = new JMenuItem("Vender");
		mntmVender.addActionListener(this);
		mntmVender.setBackground(new Color(0, 128, 128));
		mntmVender.setForeground(new Color(255, 255, 255));
		mntmVender.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		mnVentas.add(mntmVender);
		
		mntmGenerarReportes = new JMenuItem("Generar reportes");
		mntmGenerarReportes.addActionListener(this);
		mntmGenerarReportes.setBackground(new Color(0, 128, 128));
		mntmGenerarReportes.setForeground(new Color(255, 255, 255));
		mntmGenerarReportes.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		mnVentas.add(mntmGenerarReportes);
		
		mnConfiguracion = new JMenu("Configuraci\u00F3n\r\n");
		mnConfiguracion.setIcon(new ImageIcon(Menu.class.getResource("/imagenes/1498866983_icons_settings.png")));
		mnConfiguracion.setBackground(new Color(0, 128, 128));
		mnConfiguracion.setForeground(new Color(255, 255, 255));
		mnConfiguracion.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		menuBar.add(mnConfiguracion);
		
		mntmConfigurarDescuentos = new JMenuItem("Configurar descuentos");
		mntmConfigurarDescuentos.addActionListener(this);
		mntmConfigurarDescuentos.setBackground(new Color(0, 128, 128));
		mntmConfigurarDescuentos.setForeground(new Color(255, 255, 255));
		mntmConfigurarDescuentos.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		mnConfiguracion.add(mntmConfigurarDescuentos);
		
		mntmConfigurarObsequio = new JMenuItem("Configurar obsequio");
		mntmConfigurarObsequio.addActionListener(this);
		mntmConfigurarObsequio.setBackground(new Color(0, 128, 128));
		mntmConfigurarObsequio.setForeground(new Color(255, 255, 255));
		mntmConfigurarObsequio.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		mnConfiguracion.add(mntmConfigurarObsequio);
		
		mntmConfigurarCantidadptima = new JMenuItem("Configurar cantidad \u00F3ptima de maletas vendidas");
		mntmConfigurarCantidadptima.addActionListener(this);
		mntmConfigurarCantidadptima.setBackground(new Color(0, 128, 128));
		mntmConfigurarCantidadptima.setForeground(new Color(255, 255, 255));
		mntmConfigurarCantidadptima.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		mnConfiguracion.add(mntmConfigurarCantidadptima);
		
		mntmConfigurarPremioSorpresa = new JMenuItem("Configurar premio sorpresa");
		mntmConfigurarPremioSorpresa.addActionListener(this);
		mntmConfigurarPremioSorpresa.setBackground(new Color(0, 128, 128));
		mntmConfigurarPremioSorpresa.setForeground(new Color(255, 255, 255));
		mntmConfigurarPremioSorpresa.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		mnConfiguracion.add(mntmConfigurarPremioSorpresa);
		
		mnNewMenu = new JMenu("Ayuda");
		mnNewMenu.setIcon(new ImageIcon(Menu.class.getResource("/imagenes/1498867862_circle-info-more-information-detail-glyph.png")));
		mnNewMenu.setForeground(new Color(255, 255, 255));
		mnNewMenu.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		menuBar.add(mnNewMenu);
		
		mntmAcercaDeTienda = new JMenuItem("Acerca de Tienda");
		mntmAcercaDeTienda.setBackground(new Color(0, 0, 0));
		mntmAcercaDeTienda.setForeground(new Color(255, 255, 255));
		mntmAcercaDeTienda.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		mnNewMenu.add(mntmAcercaDeTienda);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBackground(new Color(64, 224, 208));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		separator = new JSeparator();
		separator.setBounds(85, 352, 195, 2);
		contentPane.add(separator);
		
		separator_1 = new JSeparator();
		separator_1.setBounds(120, 382, 160, 2);
		contentPane.add(separator_1);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon(Menu.class.getResource("/imagenes/principal.png")));
		label.setBounds(57, 44, 261, 297);
		contentPane.add(label);
		
		lblNewLabel = new JLabel("Laboratorio de  Maletas");
		lblNewLabel.setBackground(new Color(230, 230, 250));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 28));
		lblNewLabel.setBounds(270, 58, 329, 48);
		contentPane.add(lblNewLabel);
		
		separator_2 = new JSeparator();
		separator_2.setBounds(149, 402, 131, 12);
		contentPane.add(separator_2);
		
		separator_3 = new JSeparator();
		separator_3.setBounds(271, 103, 328, 3);
		contentPane.add(separator_3);
	}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == mntmGenerarReportes) {
			actionPerformedMntmGenerarReportes(arg0);
		}
		if (arg0.getSource() == mntmNewMenuItem) {
			actionPerformedMntmNewMenuItem(arg0);
		}
		if (arg0.getSource() == mntmConfigurarPremioSorpresa) {
			actionPerformedMntmConfigurarPremioSorpresa(arg0);
		}
		if (arg0.getSource() == mntmConfigurarCantidadptima) {
			actionPerformedMntmConfigurarCantidadptima(arg0);
		}
		if (arg0.getSource() == mntmConfigurarObsequio) {
			actionPerformedMntmConfigurarObsequio(arg0);
		}
		if (arg0.getSource() == mntmConfigurarDescuentos) {
			actionPerformedMntmConfigurarDescuentos(arg0);
		}
		if (arg0.getSource() == mntmVender) {
			actionPerformedMntmVender(arg0);
		}
		if (arg0.getSource() == mntmListaDeMaletas) {
			actionPerformedMntmListaDeMaletas(arg0);
		}
		if (arg0.getSource() == mntmModificarMaleta) {
			actionPerformedMntmModificarMaleta(arg0);
		}
		if (arg0.getSource() == mntmConsultarMaletas) {
			actionPerformedMntmConsultarMaletas(arg0);
		}
		if (arg0.getSource() == mntmSalir) {
			actionPerformedMntmSalir(arg0);
		}
	}
	protected void actionPerformedMntmSalir(ActionEvent arg0) {
		 System.exit(0);
		
	}
	protected void actionPerformedMntmConsultarMaletas(ActionEvent arg0) {
	
	ConsultarMaletas ven = new ConsultarMaletas();
	ven.setVisible(true); 
	}
	protected void actionPerformedMntmModificarMaleta(ActionEvent arg0) {
		ModificarMaleta ven = new ModificarMaleta();
		ven.setVisible(true); 
	}
	protected void actionPerformedMntmListaDeMaletas(ActionEvent arg0) {
		ListarMaletas ven = new ListarMaletas();
		ven.setVisible(true);
	}
	protected void actionPerformedMntmVender(ActionEvent arg0) {
		Vender ven = new Vender();
		ven.setVisible(true);
	}
	protected void actionPerformedMntmConfigurarDescuentos(ActionEvent arg0) {
		Porcentajes ven = new Porcentajes();
		ven.setVisible(true);
	}
	protected void actionPerformedMntmConfigurarObsequio(ActionEvent arg0) {
		Obsequio ven = new Obsequio();
		ven.setVisible(true);
	}
	protected void actionPerformedMntmConfigurarCantidadptima(ActionEvent arg0) {
		CantidadOptima ven = new CantidadOptima();
		ven.setVisible(true);
	}
	protected void actionPerformedMntmConfigurarPremioSorpresa(ActionEvent arg0) {
		Sorprise ven = new Sorprise();
		ven.setVisible(true);
	}
	protected void actionPerformedMntmNewMenuItem(ActionEvent arg0) {
		Login ven = new Login();
		ven.setVisible(true);
		setVisible(false);
	}
	protected void actionPerformedMntmGenerarReportes(ActionEvent arg0) {
		Reportes ven = new Reportes();
		ven.setVisible(true);
	}
}
