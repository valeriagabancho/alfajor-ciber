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

public class DialogoConfigurarDescuentos extends JDialog implements ActionListener, KeyListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtC;
	private JTextField txtD;
	private JButton btnCancelar;
	private JButton btnAceptar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DialogoConfigurarDescuentos dialog = new DialogoConfigurarDescuentos();
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
	public DialogoConfigurarDescuentos() {
		setTitle("Configurar porcentajes de descuento");
		setForeground(Color.BLACK);
		getContentPane().setForeground(Color.BLACK);
		setBounds(100, 100, 360, 150);
		getContentPane().setLayout(null);
		
		JLabel lblA = new JLabel("1 a 5 cajas");
		lblA.setForeground(Color.BLACK);
		lblA.setBounds(10, 11, 100, 14);
		getContentPane().add(lblA);
		
		JLabel lblA_1 = new JLabel("6 a 10 cajas");
		lblA_1.setForeground(Color.BLACK);
		lblA_1.setBounds(10, 36, 100, 14);
		getContentPane().add(lblA_1);
		
		JLabel lblA_2 = new JLabel("11 a 15 cajas");
		lblA_2.setForeground(Color.BLACK);
		lblA_2.setBounds(10, 61, 100, 14);
		getContentPane().add(lblA_2);
		
		JLabel lblMsDe = new JLabel("M\u00E1s de 15 cajas");
		lblMsDe.setForeground(Color.BLACK);
		lblMsDe.setBounds(10, 86, 100, 14);
		getContentPane().add(lblMsDe);
		
		txtA = new JTextField();
		txtA.addKeyListener(this);
		txtA.setForeground(Color.BLACK);
		txtA.setBounds(120, 8, 86, 20);
		getContentPane().add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.addKeyListener(this);
		txtB.setForeground(Color.BLACK);
		txtB.setColumns(10);
		txtB.setBounds(120, 33, 86, 20);
		getContentPane().add(txtB);
		
		txtC = new JTextField();
		txtC.addKeyListener(this);
		txtC.setForeground(Color.BLACK);
		txtC.setColumns(10);
		txtC.setBounds(120, 58, 86, 20);
		getContentPane().add(txtC);
		
		txtD = new JTextField();
		txtD.addKeyListener(this);
		txtD.setForeground(Color.BLACK);
		txtD.setColumns(10);
		txtD.setBounds(120, 83, 86, 20);
		getContentPane().add(txtD);
		
		JLabel label = new JLabel("%");
		label.setForeground(Color.BLACK);
		label.setBounds(207, 11, 26, 14);
		getContentPane().add(label);
		
		JLabel label_1 = new JLabel("%");
		label_1.setForeground(Color.BLACK);
		label_1.setBounds(207, 36, 26, 14);
		getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("%");
		label_2.setForeground(Color.BLACK);
		label_2.setBounds(207, 61, 26, 14);
		getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("%");
		label_3.setForeground(Color.BLACK);
		label_3.setBounds(207, 86, 26, 14);
		getContentPane().add(label_3);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(this);
		btnAceptar.setBounds(245, 7, 89, 23);
		getContentPane().add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(this);
		btnCancelar.setBounds(245, 32, 89, 23);
		getContentPane().add(btnCancelar);
		
		//datos
				txtA.setText(""+MenúPrincipal.porcentaje1);
				txtB.setText(""+MenúPrincipal.porcentaje2);
				txtC.setText(""+MenúPrincipal.porcentaje3);
				txtD.setText(""+MenúPrincipal.porcentaje4);

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
			MenúPrincipal.porcentaje1=Double.parseDouble(txtA.getText());
			MenúPrincipal.porcentaje2=Double.parseDouble(txtB.getText());
			MenúPrincipal.porcentaje3=Double.parseDouble(txtC.getText());
			MenúPrincipal.porcentaje4=Double.parseDouble(txtD.getText());
		JOptionPane.showMessageDialog(this, "Datos grabados correctamente");
		dispose();
	}
	public void keyPressed(KeyEvent e) {
	}
	public void keyReleased(KeyEvent e) {
	}
	public void keyTyped(KeyEvent e) {
		if (e.getSource() == txtD) {
			txtDKeyTyped(e);
		}
		if (e.getSource() == txtC) {
			txtCKeyTyped(e);
		}
		if (e.getSource() == txtB) {
			txtBKeyTyped(e);
		}
		if (e.getSource() == txtA) {
			txtAKeyTyped(e);
		}
	}
	protected void txtAKeyTyped(KeyEvent e) {
		char c = e.getKeyChar();
		if ((c<'0'||c>'9')&&c!='.')e.consume();
	}
	protected void txtBKeyTyped(KeyEvent e) {
		char c = e.getKeyChar();
		if ((c<'0'||c>'9')&&c!='.')e.consume();
	}
	protected void txtCKeyTyped(KeyEvent e) {
		char c = e.getKeyChar();
		if ((c<'0'||c>'9')&&c!='.')e.consume();
	}
	protected void txtDKeyTyped(KeyEvent e) {
		char c = e.getKeyChar();
		if ((c<'0'||c>'9')&&c!='.')e.consume();
	}
}