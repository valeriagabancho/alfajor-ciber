package Alfajores;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class DialogoConfigurarObsequio extends JDialog implements ActionListener, KeyListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtCantidad;
	private JTextField txtObsequio;
	private JButton btnCancelar;
	private JButton btnAceptar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogoConfigurarObsequio dialog = new DialogoConfigurarObsequio();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogoConfigurarObsequio() {
		setForeground(Color.BLACK);
		setTitle("Configurar Obsequio");
		setBounds(100, 100, 450, 100);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setForeground(Color.BLACK);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblCantidadMinimaDe = new JLabel("Cantidad minima de cajas asquiridas");
		lblCantidadMinimaDe.setForeground(Color.BLACK);
		lblCantidadMinimaDe.setBounds(10, 11, 214, 14);
		contentPanel.add(lblCantidadMinimaDe);
		
		JLabel lblObsequio = new JLabel("Obsequio");
		lblObsequio.setForeground(Color.BLACK);
		lblObsequio.setBounds(10, 36, 99, 14);
		contentPanel.add(lblObsequio);
		
		txtCantidad = new JTextField();
		txtCantidad.addKeyListener(this);
		txtCantidad.setForeground(Color.BLACK);
		txtCantidad.setBounds(224, 8, 86, 20);
		contentPanel.add(txtCantidad);
		txtCantidad.setColumns(10);
		
		txtObsequio = new JTextField();
		txtObsequio.addKeyListener(this);
		txtObsequio.setForeground(Color.BLACK);
		txtObsequio.setBounds(224, 36, 86, 20);
		contentPanel.add(txtObsequio);
		txtObsequio.setColumns(10);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(this);
		btnAceptar.setBounds(335, 7, 89, 23);
		contentPanel.add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(this);
		btnCancelar.setBounds(335, 36, 89, 23);
		contentPanel.add(btnCancelar);
		
		//datos
		txtCantidad.setText(""+MenúPrincipal.cantidadObsequiable);
		txtObsequio.setText(""+MenúPrincipal.obsequio);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnAceptar) {
			btnAceptarActionPerformed(arg0);
		}
		if (arg0.getSource() == btnCancelar) {
			btnCancelarActionPerformed(arg0);
		}
	}
	protected void btnCancelarActionPerformed(ActionEvent arg0) {
		dispose();
	}
	protected void btnAceptarActionPerformed(ActionEvent arg0) {
		MenúPrincipal.cantidadObsequiable=Integer.parseInt(txtCantidad.getText());
		MenúPrincipal.obsequio=txtObsequio.getText();
	JOptionPane.showMessageDialog(this, "Datos grabados correctamente");
	dispose();
	}
	public void keyPressed(KeyEvent e) {
	}
	public void keyReleased(KeyEvent e) {
	}
	public void keyTyped(KeyEvent e) {
		if (e.getSource() == txtObsequio) {
			txtObsequioKeyTyped(e);
		}
		if (e.getSource() == txtCantidad) {
			txtCantidadKeyTyped(e);
		}
	}
	protected void txtCantidadKeyTyped(KeyEvent e) {
		char c = e.getKeyChar();
		if (c<'0' || c>'9') e.consume();
	}
	protected void txtObsequioKeyTyped(KeyEvent e) {
		char c = e.getKeyChar();
		if ((c<'a'||c>'z')&& (c<'A'||c>'Z')&& c!='á'&&c!='é'&&c!='í'&&c!='ó'&&c!='ú'
				&&c!='Á'&&c!='É'&&c!='Í'&&c!='Ó'&&c!='Ú'&&c!='ñ'&&c!='Ñ'&&(c!=(char)KeyEvent.VK_SPACE)) 
			e.consume();
	}
}
