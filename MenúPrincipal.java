package Alfajores;

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

public class MenúPrincipal extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenuItem mntmSalir;
	private JMenuItem mntmConsultarAlfajor;
	private JMenuItem mntmModificarAlfajor;
	private JMenuItem mntmListarAlfajores;
	private JMenuItem mntmAcercaDeTienda;
	private JMenuItem mntmVender;
	private JMenuItem mntmConfigurarObsequio;
	private JMenuItem mntmGenerarReportes;
	private JMenuItem mntmConfigurarCantidadptima;
	
	// Datos mínimos del primer alfajor
	public static String marca0 = "Alfano";
	public static double precio0 = 18.0;
	public static int contenido0 = 12;
	public static double peso0 = 612;
	public static String sabor0 = "Chocolate";
	// Datos mínimos del segundo alfajor
	public static String marca1 = "Delicia";
	public static double precio1 = 30.0;
	public static int contenido1 = 24;
	public static double peso1 = 1320;
	public static String sabor1 = "Nuez";
	// Datos mínimos del tercer alfajor
	public static String marca2 = "Vimar";
	public static double precio2 = 16.8;
	public static int contenido2 = 12;
	public static double peso2 = 720;
	public static String sabor2 = "Fresa";
	// Datos mínimos del cuarto alfajor
	public static String marca3 = "Turok";
	public static double precio3 = 32.4;
	public static int contenido3 = 24;
	public static double peso3 = 1250;
	public static String sabor3 = "Mango";
	// Datos mínimos del quinto alfajor
	public static String marca4 = "Havanna";
	public static double precio4 = 19.2;
	public static int contenido4 = 12;
	public static double peso4 = 780;
	public static String sabor4 = "Piña";
	//Conteo de ventas
	public static int venta0 = 0;
	public static int venta1 = 0;
	public static int venta2 = 0;
	public static int venta3 = 0;
	public static int venta4 = 0;
	public static double importe0 = 0;
	public static double importe1 = 0;
	public static double importe2 = 0;
	public static double importe3 = 0;
	public static double importe4 = 0;
	public static int cantidad0 = 0;
	public static int cantidad1 = 0;
	public static int cantidad2 = 0;
	public static int cantidad3 = 0;
	public static int cantidad4 = 0;
	
	// Porcentajes de descuento
	public static double porcentaje1 = 4.0;
	public static double porcentaje2 = 5.5;
	public static double porcentaje3 = 7.0;
	public static double porcentaje4 = 8.5;
	private JMenuItem mntmConfigurarDescuentos;
	
	// Cantidad óptima de cajas vendidas
	public static int cantidadOptima = 40;
	
	// Cantidad mínima de cajas adquiridas para acceder al obsequio
	public static int cantidadObsequiable = 18;
	// Obsequio por cantidad mínima de cajas adquiridas
	public static String obsequio = "Billetera";
	
	// Número de cliente que recibe el premio sorpresa
	public static int numeroClienteSorpresa = 5;
	// Premio sorpresa
	public static String premioSorpresa = "Un polo";
	private JMenuItem mntmConfigurarPremioSorpresa;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenúPrincipal frame = new MenúPrincipal();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MenúPrincipal() {
		setTitle("Tienda Alfajores");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(this);
		mnArchivo.add(mntmSalir);
		
		JMenu mnMantenimiento = new JMenu("Mantenimiento");
		menuBar.add(mnMantenimiento);
		
		mntmConsultarAlfajor = new JMenuItem("Consultar Alfajor");
		mntmConsultarAlfajor.addActionListener(this);
		mnMantenimiento.add(mntmConsultarAlfajor);
		
		mntmModificarAlfajor = new JMenuItem("Modificar Alfajor");
		mntmModificarAlfajor.addActionListener(this);
		mnMantenimiento.add(mntmModificarAlfajor);
		
		mntmListarAlfajores = new JMenuItem("Listar Alfajores");
		mntmListarAlfajores.addActionListener(this);
		mnMantenimiento.add(mntmListarAlfajores);
		
		JMenu mnVentas = new JMenu("Ventas");
		menuBar.add(mnVentas);
		
		mntmVender = new JMenuItem("Vender");
		mntmVender.addActionListener(this);
		mnVentas.add(mntmVender);
		
		mntmGenerarReportes = new JMenuItem("Generar reportes");
		mntmGenerarReportes.addActionListener(this);
		mnVentas.add(mntmGenerarReportes);
		
		JMenu mnConfiguracin = new JMenu("Configuraci\u00F3n");
		menuBar.add(mnConfiguracin);
		
		mntmConfigurarDescuentos = new JMenuItem("Configurar descuentos");
		mntmConfigurarDescuentos.addActionListener(this);
		mnConfiguracin.add(mntmConfigurarDescuentos);
		
		mntmConfigurarObsequio = new JMenuItem("Configurar obsequio");
		mntmConfigurarObsequio.addActionListener(this);
		mnConfiguracin.add(mntmConfigurarObsequio);
		
		mntmConfigurarCantidadptima = new JMenuItem("Configurar cantidad \u00F3ptima de alfajores vendidos");
		mntmConfigurarCantidadptima.addActionListener(this);
		mnConfiguracin.add(mntmConfigurarCantidadptima);
		
		mntmConfigurarPremioSorpresa = new JMenuItem("Configurar premio sorpresa");
		mntmConfigurarPremioSorpresa.addActionListener(this);
		mnConfiguracin.add(mntmConfigurarPremioSorpresa);
		
		JMenu mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		
		mntmAcercaDeTienda = new JMenuItem("Acerca de Tienda");
		mntmAcercaDeTienda.addActionListener(this);
		mnAyuda.add(mntmAcercaDeTienda);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mntmConfigurarPremioSorpresa) {
			mntmConfigurarPremioSorpresaActionPerformed(e);
		}
		if (e.getSource() == mntmConfigurarCantidadptima) {
			mntmConfigurarCantidadptimaActionPerformed(e);
		}
		if (e.getSource() == mntmConfigurarDescuentos) {
			mntmConfigurarDescuentosActionPerformed(e);
		}
		if (e.getSource() == mntmGenerarReportes) {
			mntmGenerarReportesActionPerformed(e);
		}
		if (e.getSource() == mntmConfigurarObsequio) {
			mntmConfigurarObsequioActionPerformed(e);
		}
		if (e.getSource() == mntmVender) {
			mntmVenderActionPerformed(e);
		}
		if (e.getSource() == mntmAcercaDeTienda) {
			mntmAcercaDeTiendaActionPerformed(e);
		}
		if (e.getSource() == mntmListarAlfajores) {
			mntmListarAlfajoresActionPerformed(e);
		}
		if (e.getSource() == mntmModificarAlfajor) {
			mntmModificarAlfajorActionPerformed(e);
		}
		if (e.getSource() == mntmConsultarAlfajor) {
			mntmConsultarAlfajorActionPerformed(e);
		}
		if (e.getSource() == mntmSalir) {
			mntmSalirActionPerformed(e);
		}
	}
	protected void mntmSalirActionPerformed(ActionEvent e) {
		System.exit(0);
	}
	protected void mntmConsultarAlfajorActionPerformed(ActionEvent e) {
		DialogoConsultar dc=new DialogoConsultar();
		dc.setVisible(true);
	}
	protected void mntmModificarAlfajorActionPerformed(ActionEvent e) {
		DialogoModificar dm=new DialogoModificar();
		dm.setVisible(true);
	}
	protected void mntmListarAlfajoresActionPerformed(ActionEvent e) {
		DialogoListar dl=new DialogoListar();
		dl.setVisible(true);
	}
	protected void mntmAcercaDeTiendaActionPerformed(ActionEvent e) {
		DialogoAcercaDeTienda dat=new DialogoAcercaDeTienda();
		dat.setVisible(true);
	}
	protected void mntmVenderActionPerformed(ActionEvent e) {
		DialogoVender dv=new DialogoVender();
		dv.setVisible(true);
	}
	protected void mntmConfigurarObsequioActionPerformed(ActionEvent e) {
		DialogoConfigurarObsequio dco=new DialogoConfigurarObsequio();
		dco.setVisible(true);
	}
	protected void mntmGenerarReportesActionPerformed(ActionEvent e) {
		DialogoGenerar dgp=new DialogoGenerar();
		dgp.setVisible(true);
	}
	protected void mntmConfigurarDescuentosActionPerformed(ActionEvent e) {
		DialogoConfigurarDescuentos dcd=new DialogoConfigurarDescuentos();
		dcd.setVisible(true);
	}
	protected void mntmConfigurarCantidadptimaActionPerformed(ActionEvent e) {
		DialogoConfigurarCantidad dcc=new DialogoConfigurarCantidad();
		dcc.setVisible(true);
	}
	protected void mntmConfigurarPremioSorpresaActionPerformed(ActionEvent e) {
		DialogoConfigurarPremio dcp=new DialogoConfigurarPremio();
		dcp.setVisible(true);
	}
}
