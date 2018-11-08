package Alfajores;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DialogoGenerar extends JDialog implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblTipoDeReporte;
	private JButton btnCerrar;
	private JComboBox<String> cboReporte;
	private JTextArea txtS;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DialogoGenerar dialog = new DialogoGenerar();
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
	public DialogoGenerar() {
		setTitle("Generar reportes");
		setBounds(100, 100, 635, 390);
		getContentPane().setLayout(null);
		
		lblTipoDeReporte = new JLabel("Tipo de reporte");
		lblTipoDeReporte.setBounds(10, 11, 95, 14);
		getContentPane().add(lblTipoDeReporte);
		
		cboReporte = new JComboBox<String>();
		cboReporte.addActionListener(this);
		cboReporte.setModel(new DefaultComboBoxModel<String>(new String[] {"Ventas por marca", "Marcas con venta \u00F3pitma", "Precios en relaci\u00F3n al promedio", "Precios promedios, menor y mayor"}));
		cboReporte.setBounds(104, 8, 332, 20);
		getContentPane().add(cboReporte);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(520, 7, 89, 23);
		getContentPane().add(btnCerrar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 41, 599, 299);
		getContentPane().add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
		
		double ImporteT;
		int VentasT;
		ImporteT=MenúPrincipal.importe0+MenúPrincipal.importe1+MenúPrincipal.importe2+MenúPrincipal.importe3+MenúPrincipal.importe4;
		VentasT=MenúPrincipal.venta0+MenúPrincipal.venta1+MenúPrincipal.venta2+MenúPrincipal.venta3+MenúPrincipal.venta4;
		txtS.setText("\n");
		txtS.append("Ventas por alfajor"+"\n\n");
		txtS.append("Nombre			: "+MenúPrincipal.marca0+"\n");
		txtS.append("Cantidad de Ventas		: "+MenúPrincipal.venta0+"\n");
		txtS.append("Cantidad total de Unidades vendidas	: "+MenúPrincipal.cantidad0+"\n");
		txtS.append("Importe Total acumulado		: "+MenúPrincipal.importe0+"\n\n");
		
		txtS.append("Nombre			: "+MenúPrincipal.marca1+"\n");
		txtS.append("Cantidad de Ventas		: "+MenúPrincipal.venta1+"\n");
		txtS.append("Cantidad total de Unidades vendidas	: "+MenúPrincipal.cantidad1+"\n");
		txtS.append("Importe Total acumulado		: "+MenúPrincipal.importe1+"\n\n");
		
		txtS.append("Nombre			: "+MenúPrincipal.marca2+"\n");
		txtS.append("Cantidad de Ventas		: "+MenúPrincipal.venta2+"\n");
		txtS.append("Cantidad total de Unidades vendidas	: "+MenúPrincipal.cantidad2+"\n");
		txtS.append("Importe Total acumulado		: "+MenúPrincipal.importe2+"\n\n");
		
		txtS.append("Nombre			: "+MenúPrincipal.marca3+"\n");
		txtS.append("Cantidad de Ventas		: "+MenúPrincipal.venta3+"\n");
		txtS.append("Cantidad total de Unidades vendidas	: "+MenúPrincipal.cantidad3+"\n");
		txtS.append("Importe Total acumulado		: "+MenúPrincipal.importe3+"\n\n");
		
		txtS.append("Nombre			: "+MenúPrincipal.marca4+"\n");
		txtS.append("Cantidad de Ventas		: "+MenúPrincipal.venta4+"\n");
		txtS.append("Cantidad total de Unidades vendidas	: "+MenúPrincipal.cantidad4+"\n");
		txtS.append("Importe Total acumulado		: "+MenúPrincipal.importe4+"\n\n\n");
		
		txtS.append("Importe total general acumulado	: "+ImporteT+"\n");
		txtS.append("Cantidad total general de ventas	: "+VentasT+"\n");
	}
		
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cboReporte) {
			cboReporteActionPerformed(e);
		}
		if (e.getSource() == btnCerrar) {
			btnCerrarActionPerformed(e);
		}
	}
	protected void btnCerrarActionPerformed(ActionEvent e) {
		dispose();
	}
	protected void cboReporteActionPerformed(ActionEvent e) {
		int rp=cboReporte.getSelectedIndex();
		double ImporteT,prom;
		int VentasT;
		prom=(MenúPrincipal.precio0+MenúPrincipal.precio1+MenúPrincipal.precio2+MenúPrincipal.precio3+MenúPrincipal.precio4)/5;
		ImporteT=MenúPrincipal.importe0+MenúPrincipal.importe1+MenúPrincipal.importe2+MenúPrincipal.importe3+MenúPrincipal.importe4;
		VentasT=MenúPrincipal.venta0+MenúPrincipal.venta1+MenúPrincipal.venta2+MenúPrincipal.venta3+MenúPrincipal.venta4;
		if (rp==0){
			txtS.setText("");
			txtS.append("Ventas por alfajor"+"\n\n");
			txtS.append("Nombre			: "+MenúPrincipal.marca0+"\n");
			txtS.append("Cantidad de Ventas		: "+MenúPrincipal.venta0+"\n");
			txtS.append("Cantidad total de Unidades vendidas	: "+MenúPrincipal.cantidad0+"\n");
			txtS.append("Importe Total acumulado		: S/ "+MenúPrincipal.importe0+"\n\n");
			
			txtS.append("Nombre			: "+MenúPrincipal.marca1+"\n");
			txtS.append("Cantidad de Ventas		: "+MenúPrincipal.venta1+"\n");
			txtS.append("Cantidad total de Unidades vendidas	: "+MenúPrincipal.cantidad1+"\n");
			txtS.append("Importe Total acumulado		: S/ "+MenúPrincipal.importe1+"\n\n");
			
			txtS.append("Nombre			: "+MenúPrincipal.marca2+"\n");
			txtS.append("Cantidad de Ventas		: "+MenúPrincipal.venta2+"\n");
			txtS.append("Cantidad total de Unidades vendidas	: "+MenúPrincipal.cantidad2+"\n");
			txtS.append("Importe Total acumulado		: S/ "+MenúPrincipal.importe2+"\n\n");
			
			txtS.append("Nombre			: "+MenúPrincipal.marca3+"\n");
			txtS.append("Cantidad de Ventas		: "+MenúPrincipal.venta3+"\n");
			txtS.append("Cantidad total de Unidades vendidas	: "+MenúPrincipal.cantidad3+"\n");
			txtS.append("Importe Total acumulado		: S/ "+MenúPrincipal.importe3+"\n\n");
			
			txtS.append("Nombre			: "+MenúPrincipal.marca4+"\n");
			txtS.append("Cantidad de Ventas		: "+MenúPrincipal.venta4+"\n");
			txtS.append("Cantidad total de Unidades vendidas	: "+MenúPrincipal.cantidad4+"\n");
			txtS.append("Importe Total acumulado		: S/ "+MenúPrincipal.importe4+"\n\n\n");
			
			txtS.append("Importe total general acumulado	: S/ "+ImporteT+"\n");
			txtS.append("Cantidad total general de ventas	: "+VentasT+"\n");
		}
		else if (rp==1){
			int d0,d1,d2,d3,d4;
			d0=MenúPrincipal.cantidad0-MenúPrincipal.cantidadOptima;
			d1=MenúPrincipal.cantidad1-MenúPrincipal.cantidadOptima;
			d2=MenúPrincipal.cantidad2-MenúPrincipal.cantidadOptima;
			d3=MenúPrincipal.cantidad3-MenúPrincipal.cantidadOptima;
			d4=MenúPrincipal.cantidad4-MenúPrincipal.cantidadOptima;
			txtS.setText("\n");
			txtS.append("Alfajores con venta óptima"+"\n\n");
			if (MenúPrincipal.cantidad0>=MenúPrincipal.cantidadOptima){
				txtS.append("Marca			: "+MenúPrincipal.marca0+"\n");
				txtS.append("Cantidad total de cajas vendidas	: "+MenúPrincipal.cantidad0+"("+d0+" más que la cantidad óptima)"+"\n\n");
			}
			if (MenúPrincipal.cantidad1>=MenúPrincipal.cantidadOptima){
				txtS.append("Marca			: "+MenúPrincipal.marca1+"\n");
				txtS.append("Cantidad total de cajas vendidas	: "+MenúPrincipal.cantidad1+"("+d1+" más que la cantidad óptima)"+"\n\n");
			}
			if (MenúPrincipal.cantidad2>=MenúPrincipal.cantidadOptima){
				txtS.append("Marca			: "+MenúPrincipal.marca2+"\n");
				txtS.append("Cantidad total de cajas vendidas	: "+MenúPrincipal.cantidad2+"("+d2+" más que la cantidad óptima)"+"\n\n");
			}
			if (MenúPrincipal.cantidad3>=MenúPrincipal.cantidadOptima){
				txtS.append("Marca			: "+MenúPrincipal.marca3+"\n");
				txtS.append("Cantidad total de cajas vendidas	: "+MenúPrincipal.cantidad3+"("+d3+" más que la cantidad óptima)"+"\n\n");
			}
			if (MenúPrincipal.cantidad4>=MenúPrincipal.cantidadOptima){
				txtS.append("Marca			: "+MenúPrincipal.marca4+"\n");
				txtS.append("Cantidad total de cajas vendidas	: "+MenúPrincipal.cantidad4+"("+d4+" más que la cantidad óptima)"+"\n\n");
			}
			if (MenúPrincipal.cantidad0<MenúPrincipal.cantidadOptima && MenúPrincipal.cantidad1<MenúPrincipal.cantidadOptima 
				&& MenúPrincipal.cantidad2<MenúPrincipal.cantidadOptima && MenúPrincipal.cantidad3<MenúPrincipal.cantidadOptima
				&& MenúPrincipal.cantidad4<MenúPrincipal.cantidadOptima)
				txtS.setText("No existen marcas con venta óptima");

		}
		else if (rp==2){
	
			txtS.setText("\n"+"Precios en relación al promedio"+"\n\n");
			txtS.append("Nombre	: "+MenúPrincipal.marca0+"\n");
			txtS.append("Precio	: "+MenúPrincipal.precio0);
			if (MenúPrincipal.precio0>prom)txtS.append(" (mayor al promedio)"+"\n\n");
			else if (MenúPrincipal.precio0==prom) txtS.append(" (igual al promedio)"+"\n\n");
			else txtS.append(" (menor al promedio)"+"\n\n");
			
			txtS.append("Nombre	: "+MenúPrincipal.marca1+"\n");
			txtS.append("Precio	: "+MenúPrincipal.precio1);
			if (MenúPrincipal.precio1>prom)txtS.append(" (mayor al promedio)"+"\n\n");
			else if (MenúPrincipal.precio1==prom) txtS.append(" (igual al promedio)"+"\n\n");
			else txtS.append(" (menor al promedio)"+"\n\n");
			
			txtS.append("Nombre	: "+MenúPrincipal.marca2+"\n");
			txtS.append("Precio	: "+MenúPrincipal.precio2);
			if (MenúPrincipal.precio2>prom)txtS.append(" (mayor al promedio)"+"\n\n");
			else if (MenúPrincipal.precio2==prom) txtS.append(" (igual al promedio)"+"\n\n");
			else txtS.append(" (menor al promedio)"+"\n\n");
			
			txtS.append("Nombre	: "+MenúPrincipal.marca3+"\n");
			txtS.append("Precio	: "+MenúPrincipal.precio3);
			if (MenúPrincipal.precio3>prom)txtS.append(" (mayor al promedio)"+"\n\n");
			else if (MenúPrincipal.precio3==prom) txtS.append(" (igual al promedio)"+"\n\n");
			else txtS.append(" (menor al promedio)"+"\n\n");
			
			txtS.append("Nombre	: "+MenúPrincipal.marca4+"\n");
			txtS.append("Precio	: "+MenúPrincipal.precio4);
			if (MenúPrincipal.precio4>prom)txtS.append(" (mayor al promedio)"+"\n\n");
			else if (MenúPrincipal.precio4==prom) txtS.append(" (igual al promedio)"+"\n\n");
			else txtS.append(" (menor al promedio)"+"\n\n");
			
			txtS.append("Precio promedio	: S/ "+prom);
		}
		else {
			
			double menor, mayor;
			menor=MenúPrincipal.precio0;
			mayor=MenúPrincipal.precio0;
			if (MenúPrincipal.precio1<menor)menor=MenúPrincipal.precio1;
			if (MenúPrincipal.precio2<menor)menor=MenúPrincipal.precio2;
			if (MenúPrincipal.precio3<menor)menor=MenúPrincipal.precio3;
			if (MenúPrincipal.precio4<menor)menor=MenúPrincipal.precio4;
			if (MenúPrincipal.precio1>mayor)mayor=MenúPrincipal.precio1;
			if (MenúPrincipal.precio2>mayor)mayor=MenúPrincipal.precio2;
			if (MenúPrincipal.precio3>mayor)mayor=MenúPrincipal.precio3;
			if (MenúPrincipal.precio4>mayor)mayor=MenúPrincipal.precio4;
			txtS.setText("Precio promedio, menor y mayor"+"\n\n");
			txtS.append("Precio promedio	: S/ "+prom+"\n");
			txtS.append("Precio menor		: S/ "+menor+"\n");
			txtS.append("Precio mayor		: S/ "+mayor);
		}
		
	}
}
