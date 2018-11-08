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

public class DialogoConfigurarPremio extends JDialog implements ActionListener, KeyListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtNumero;
	private JTextField txtPremio;
	private JButton btnCancelar;
	private JButton btnAceptar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DialogoConfigurarPremio dialog = new DialogoConfigurarPremio();
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
	public DialogoConfigurarPremio() {
		setTitle("Configurar premio sorpresa");
		setForeground(Color.BLACK);
		getContentPane().setForeground(Color.BLACK);
		setBounds(100, 100, 350, 100);
		getContentPane().setLayout(null);
		
		JLabel lblNmeroDeCliente = new JLabel("N\u00FAmero de cliente");
		lblNmeroDeCliente.setForeground(Color.BLACK);
		lblNmeroDeCliente.setBounds(10, 11, 110, 14);
		getContentPane().add(lblNmeroDeCliente);
		
		JLabel lblPremioSorpresa = new JLabel("Premio sorpresa");
		lblPremioSorpresa.setForeground(Color.BLACK);
		lblPremioSorpresa.setBounds(10, 36, 110, 14);
		getContentPane().add(lblPremioSorpresa);
		
		txtNumero = new JTextField();
		txtNumero.addKeyListener(this);
		txtNumero.setForeground(Color.BLACK);
		txtNumero.setBounds(115, 8, 86, 20);
		getContentPane().add(txtNumero);
		txtNumero.setColumns(10);
		
		txtPremio = new JTextField();
		txtPremio.setForeground(Color.BLACK);
		txtPremio.setBounds(115, 33, 86, 20);
		getContentPane().add(txtPremio);
		txtPremio.setColumns(10);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(this);
		btnAceptar.setBounds(235, 7, 89, 23);
		getContentPane().add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(this);
		btnCancelar.setBounds(235, 32, 89, 23);
		getContentPane().add(btnCancelar);
		
		// datos
		txtNumero.setText(""+MenúPrincipal.numeroClienteSorpresa);
		txtPremio.setText(""+MenúPrincipal.premioSorpresa);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAceptar) {
			btnAceptarActionPerformed(e);
		}
		if (e.getSource() == btnCancelar) {
			btnCancelarActionPerformed(e);
		}
	}
	protected void btnCancelarActionPerformed(ActionEvent e) {
		dispose();
	}
	protected void btnAceptarActionPerformed(ActionEvent e) {
		MenúPrincipal.numeroClienteSorpresa=Integer.parseInt(txtNumero.getText());
		MenúPrincipal.premioSorpresa=txtPremio.getText();
		JOptionPane.showMessageDialog(this, "Datos grabados correctamente");
		dispose();
	}
	public void keyPressed(KeyEvent e) {
	}
	public void keyReleased(KeyEvent e) {
	}
	public void keyTyped(KeyEvent e) {
		if (e.getSource() == txtNumero) {
			txtNumeroKeyTyped(e);
		}
	}
	protected void txtNumeroKeyTyped(KeyEvent e) {
		char c = e.getKeyChar();
		if (c<'0' || c>'9') e.consume();
	}
}
