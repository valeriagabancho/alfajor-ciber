package Alfajores;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class DialogoConsultar extends JDialog implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblMarca;
	private JLabel lblPrecio;
	private JLabel lblContenidoud;
	private JLabel lblPesog;
	private JLabel lblSabor;
	private JComboBox<String> cboMarca;
	private JTextField txtPrecio;
	private JTextField txtContenido;
	private JTextField txtPeso;
	private JTextField txtSabor;
	private JButton btnCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DialogoConsultar dialog = new DialogoConsultar();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public DialogoConsultar() {
		setForeground(Color.BLACK);
		getContentPane().setForeground(Color.BLACK);
		setTitle("Consultar Alfajor");
		setBounds(100, 100, 340, 170);
		getContentPane().setLayout(null);
		
		lblMarca = new JLabel("Marca");
		lblMarca.setForeground(Color.BLACK);
		lblMarca.setBounds(10, 11, 90, 14);
		getContentPane().add(lblMarca);
		
		lblPrecio = new JLabel("Precio (S/)");
		lblPrecio.setForeground(Color.BLACK);
		lblPrecio.setBounds(10, 36, 90, 14);
		getContentPane().add(lblPrecio);
		
		lblContenidoud = new JLabel("Contenido (ud)");
		lblContenidoud.setForeground(Color.BLACK);
		lblContenidoud.setBounds(10, 61, 90, 14);
		getContentPane().add(lblContenidoud);
		
		lblPesog = new JLabel("Peso (g)");
		lblPesog.setForeground(Color.BLACK);
		lblPesog.setBounds(10, 86, 90, 14);
		getContentPane().add(lblPesog);
		
		lblSabor = new JLabel("Sabor");
		lblSabor.setForeground(Color.BLACK);
		lblSabor.setBounds(10, 111, 90, 14);
		getContentPane().add(lblSabor);
		
		cboMarca = new JComboBox<String>();
		cboMarca.setForeground(Color.BLACK);
		cboMarca.addActionListener(this);
		cboMarca.setModel(new DefaultComboBoxModel<String>(new String[] {"Alfano", "Delicia", "Vimar", "Turok", "Havanna"}));
		cboMarca.setBounds(110, 8, 86, 20);
		getContentPane().add(cboMarca);
		
		txtPrecio = new JTextField();
		txtPrecio.setForeground(Color.BLACK);
		txtPrecio.setEditable(false);
		txtPrecio.setBounds(110, 33, 86, 20);
		getContentPane().add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtContenido = new JTextField();
		txtContenido.setForeground(Color.BLACK);
		txtContenido.setEditable(false);
		txtContenido.setBounds(110, 58, 86, 20);
		getContentPane().add(txtContenido);
		txtContenido.setColumns(10);
		
		txtPeso = new JTextField();
		txtPeso.setForeground(Color.BLACK);
		txtPeso.setEditable(false);
		txtPeso.setBounds(110, 83, 86, 20);
		getContentPane().add(txtPeso);
		txtPeso.setColumns(10);
		
		txtSabor = new JTextField();
		txtSabor.setForeground(Color.BLACK);
		txtSabor.setEditable(false);
		txtSabor.setBounds(110, 108, 86, 20);
		getContentPane().add(txtSabor);
		txtSabor.setColumns(10);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(225, 7, 89, 23);
		getContentPane().add(btnCerrar);
		
		//inserta los datos del primer alfajor
				txtPrecio.setText(""+MenúPrincipal.precio0);
				txtContenido.setText(""+MenúPrincipal.contenido0);
				txtPeso.setText(""+MenúPrincipal.peso0);
				txtSabor.setText(MenúPrincipal.sabor0);

	}
	public void actionPerformed(ActionEvent e) {
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
		if(op==0){
			txtPrecio.setText(""+MenúPrincipal.precio0);
			txtContenido.setText(""+MenúPrincipal.contenido0);
			txtPeso.setText(""+MenúPrincipal.peso0);
			txtSabor.setText(MenúPrincipal.sabor0);
		}
		else if(op==1){
			txtPrecio.setText(""+MenúPrincipal.precio1);
			txtContenido.setText(""+MenúPrincipal.contenido1);
			txtPeso.setText(""+MenúPrincipal.peso1);
			txtSabor.setText(MenúPrincipal.sabor1);
		}
		else if(op==2){
			txtPrecio.setText(""+MenúPrincipal.precio2);
			txtContenido.setText(""+MenúPrincipal.contenido2);
			txtPeso.setText(""+MenúPrincipal.peso2);
			txtSabor.setText(MenúPrincipal.sabor2);
		}
		else if(op==3){
			txtPrecio.setText(""+MenúPrincipal.precio3);
			txtContenido.setText(""+MenúPrincipal.contenido3);
			txtPeso.setText(""+MenúPrincipal.peso3);
			txtSabor.setText(MenúPrincipal.sabor3);
		}
		else {
			txtPrecio.setText(""+MenúPrincipal.precio4);
			txtContenido.setText(""+MenúPrincipal.contenido4);
			txtPeso.setText(""+MenúPrincipal.peso4);
			txtSabor.setText(MenúPrincipal.sabor4);
		}
	}
}
