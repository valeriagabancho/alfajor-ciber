package Alfajores;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class DialogoVender extends JDialog implements ActionListener, KeyListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtPrecio;
	private JTextField txtCantidad;
	private JButton btnCerrar;
	private JComboBox<String> cboMarca;
	private JButton btnVender;
	private JTextArea txtS;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DialogoVender dialog = new DialogoVender();
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
	public DialogoVender() {
		setForeground(Color.BLACK);
		getContentPane().setForeground(Color.BLACK);
		setTitle("Vender");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblMarca = new JLabel("Marca");
		lblMarca.setForeground(Color.BLACK);
		lblMarca.setBounds(10, 11, 46, 14);
		getContentPane().add(lblMarca);
		
		cboMarca = new JComboBox<String>();
		cboMarca.setForeground(Color.BLACK);
		cboMarca.addActionListener(this);
		cboMarca.setModel(new DefaultComboBoxModel<String>(new String[] {"Alfano", "Delicia", "Vimar", "Turok", "Havanna"}));
		cboMarca.setBounds(88, 8, 103, 20);
		getContentPane().add(cboMarca);
		
		JLabel lblPrecios = new JLabel("Precio (S/)");
		lblPrecios.setForeground(Color.BLACK);
		lblPrecios.setBounds(10, 36, 68, 14);
		getContentPane().add(lblPrecios);
		
		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setForeground(Color.BLACK);
		lblCantidad.setBounds(10, 61, 68, 14);
		getContentPane().add(lblCantidad);
		
		txtPrecio = new JTextField();
		txtPrecio.setForeground(Color.BLACK);
		txtPrecio.setEditable(false);
		txtPrecio.setBounds(88, 33, 103, 20);
		getContentPane().add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtCantidad = new JTextField();
		txtCantidad.addKeyListener(this);
		txtCantidad.setForeground(Color.BLACK);
		txtCantidad.setBounds(88, 58, 103, 20);
		getContentPane().add(txtCantidad);
		txtCantidad.setColumns(10);
		
		btnVender = new JButton("Vender");
		btnVender.addActionListener(this);
		btnVender.setBounds(335, 7, 89, 23);
		getContentPane().add(btnVender);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(335, 32, 89, 23);
		getContentPane().add(btnCerrar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 99, 414, 151);
		getContentPane().add(scrollPane);
		
		
		txtS=new JTextArea();
		txtS.setEditable(false);
		txtS.setForeground(Color.BLACK);
		scrollPane.setViewportView(txtS);
		
		txtPrecio.setText(""+MenúPrincipal.precio0);

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnVender) {
			btnVenderActionPerformed(e);
		}
		if (e.getSource() == cboMarca) {
			cboMarcaActionPerformed(e);
		}
		if (e.getSource() == btnCerrar) {
			btnCerrarActionPerformed(e);
		}
	}
	protected void btnCerrarActionPerformed(ActionEvent e) {
		dispose();
	}
	protected void cboMarcaActionPerformed(ActionEvent e) {
		int op=cboMarca.getSelectedIndex();
		switch (op) {
		case 0: txtPrecio.setText(""+MenúPrincipal.precio0);
		break;
		case 1: txtPrecio.setText(""+MenúPrincipal.precio1);
		break;
		case 2: txtPrecio.setText(""+MenúPrincipal.precio2);
		break;
		case 3: txtPrecio.setText(""+MenúPrincipal.precio3);
		break;
		default: txtPrecio.setText(""+MenúPrincipal.precio4);
		}
	}
	protected void btnVenderActionPerformed(ActionEvent e) {
		int can,marca;
		double precio,ic,id=0,ip;
		can=Integer.parseInt(txtCantidad.getText());
		precio=Double.parseDouble(txtPrecio.getText());
		marca=cboMarca.getSelectedIndex();
		ic=can*precio;
		if (can<=0)JOptionPane.showMessageDialog(this,"Datos ingresados no validos");
		else if (can<=5){
			id=ic*MenúPrincipal.porcentaje1/100;
		}
		else if (can<=10){
			id=ic*MenúPrincipal.porcentaje2/100;
		}
		else if (can<=15){
			id=ic*MenúPrincipal.porcentaje3/100;
		}
		else
			id=ic*MenúPrincipal.porcentaje4/100;
		ip=ic-id;
		switch (marca){
		case 0: 
			txtS.setText("Marca del alfajor	: "+MenúPrincipal.marca0+"\n");
			txtS.append("Precio unitario		: "+MenúPrincipal.precio0+"\n");
			MenúPrincipal.venta0++;
			MenúPrincipal.importe0+=ip;
			MenúPrincipal.cantidad0+=can;
			break;
		case 1:
			txtS.setText("Marca del alfajor	: "+MenúPrincipal.marca1+"\n");
			txtS.append("Precio unitario		: "+MenúPrincipal.precio1+"\n");
			MenúPrincipal.venta1++;
			MenúPrincipal.importe1+=ip;
			MenúPrincipal.cantidad1+=can;
			break;
		case 2: 
			txtS.setText("Marca del alfajor	: "+MenúPrincipal.marca2+"\n");
			txtS.append("Precio unitario		: "+MenúPrincipal.precio2+"\n");
			MenúPrincipal.venta2++;
			MenúPrincipal.importe2+=ip;
			MenúPrincipal.cantidad2+=can;
			break;
		case 3: 
			txtS.setText("Marca del alfajor	: "+MenúPrincipal.marca3+"\n");
			txtS.append("Precio unitario		: "+MenúPrincipal.precio3+"\n");
			MenúPrincipal.venta3++;
			MenúPrincipal.importe3+=ip;
			MenúPrincipal.cantidad3+=can;
			break;
		default: 
			txtS.setText("Marca del alfajor	: "+MenúPrincipal.marca4+"\n");
			txtS.append("Precio unitario		: "+MenúPrincipal.precio4+"\n");
			MenúPrincipal.venta4++;
			MenúPrincipal.importe4+=ip;
			MenúPrincipal.cantidad4+=can;
		}

		txtS.append("Cantidad de cajas adquiridas	: "+can+"\n");
		txtS.append("Importe de compra	: "+ic+"\n");
		txtS.append("Importe de descuento	: "+id+"\n");
		txtS.append("Importe a pagar		: "+ip+"\n");
		if (can>=MenúPrincipal.cantidadObsequiable)txtS.append("Obsequio		: "+MenúPrincipal.obsequio);
		if (MenúPrincipal.venta0+MenúPrincipal.venta1+MenúPrincipal.venta2+MenúPrincipal.venta3+MenúPrincipal.venta4==MenúPrincipal.numeroClienteSorpresa) 
			txtS.append("\n"+"Premio Sorpresa	: "+MenúPrincipal.premioSorpresa);
		
	}
	public void keyPressed(KeyEvent arg0) {
	}
	public void keyReleased(KeyEvent arg0) {
	}
	public void keyTyped(KeyEvent arg0) {
		if (arg0.getSource() == txtCantidad) {
			txtCantidadKeyTyped(arg0);
		}
	}
	protected void txtCantidadKeyTyped(KeyEvent arg0) {
		char c = arg0.getKeyChar();
		if (c<'0' || c>'9') arg0.consume();
	}
}