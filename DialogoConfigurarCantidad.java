package Alfajores;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class DialogoConfigurarCantidad extends JDialog implements ActionListener, KeyListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtCantidad;
	private JButton btnAceptar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DialogoConfigurarCantidad dialog = new DialogoConfigurarCantidad();
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
	public DialogoConfigurarCantidad() {
		setTitle("Configurar cantidad \u00F3ptima de alfajores vendidos");
		setForeground(Color.BLACK);
		getContentPane().setForeground(Color.BLACK);
		setBounds(100, 100, 450, 109);
		getContentPane().setLayout(null);
		
		JLabel lblCantidadptimaDe = new JLabel("Cantidad \u00F3ptima de alfajores vendidos");
		lblCantidadptimaDe.setForeground(Color.BLACK);
		lblCantidadptimaDe.setBounds(10, 11, 220, 14);
		getContentPane().add(lblCantidadptimaDe);
		
		txtCantidad = new JTextField();
		txtCantidad.addKeyListener(this);
		txtCantidad.setForeground(Color.BLACK);
		txtCantidad.setBounds(229, 8, 86, 20);
		getContentPane().add(txtCantidad);
		txtCantidad.setColumns(10);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(this);
		btnAceptar.setBounds(335, 7, 89, 23);
		getContentPane().add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new BtnCancelarActionListener());
		btnCancelar.setBounds(335, 34, 89, 23);
		getContentPane().add(btnCancelar);
		
		//datos
		txtCantidad.setText(""+MenúPrincipal.cantidadOptima);

	}

	private class BtnCancelarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			dispose();
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAceptar) {
			btnAceptarActionPerformed(e);
		}
	}
	protected void btnAceptarActionPerformed(ActionEvent e) {
		MenúPrincipal.cantidadOptima=Integer.parseInt(txtCantidad.getText());
		JOptionPane.showMessageDialog(this, "Datos grabados correctamente");
		dispose();
	}
	public void keyPressed(KeyEvent e) {
	}
	public void keyReleased(KeyEvent e) {
	}
	public void keyTyped(KeyEvent e) {
		if (e.getSource() == txtCantidad) {
			txtCantidadKeyTyped(e);
		}
	}
	protected void txtCantidadKeyTyped(KeyEvent e) {
		char c = e.getKeyChar();
		if (c<'0' || c>'9') e.consume();
	}
}
