package Alfajores;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class DialogoAcercaDeTienda extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JLabel lblTienda;
	private JButton btnCerrar;
	private JLabel lblAutor;
	private JLabel lblAño;
	private JLabel lblChvezMorenoJorge;
	private JLabel lblEspinoFajardoBetzi;
	private JLabel lblRivasCrucesJos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch (Throwable e) {
			e.printStackTrace();
		}
		try {
			DialogoAcercaDeTienda dialog = new DialogoAcercaDeTienda();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogoAcercaDeTienda() {
		setResizable(false);
		setTitle("Acerca de Tienda");
		setBounds(100, 100, 450, 255);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		lblTienda = new JLabel("Tienda Alafajores");
		lblTienda.setForeground(Color.BLACK);
		lblTienda.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTienda.setBounds(145, 11, 130, 20);
		contentPanel.add(lblTienda);

		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(155, 192, 89, 23);
		contentPanel.add(btnCerrar);

		lblAutor = new JLabel("Gabancho D\u00E1vila Valeria Nicole");
		lblAutor.setForeground(Color.BLACK);
		lblAutor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAutor.setBounds(130, 75, 175, 15);
		contentPanel.add(lblAutor);

		lblAño = new JLabel("Autores");
		lblAño.setForeground(Color.BLACK);
		lblAño.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAño.setBounds(175, 49, 59, 15);
		contentPanel.add(lblAño);
		
		lblChvezMorenoJorge = new JLabel("Ch\u00E1vez Moreno Jorge Luis");
		lblChvezMorenoJorge.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblChvezMorenoJorge.setForeground(Color.BLACK);
		lblChvezMorenoJorge.setBounds(135, 101, 145, 15);
		contentPanel.add(lblChvezMorenoJorge);
		
		lblEspinoFajardoBetzi = new JLabel("Espino Fajardo Betzi Maril\u00FA");
		lblEspinoFajardoBetzi.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEspinoFajardoBetzi.setForeground(Color.BLACK);
		lblEspinoFajardoBetzi.setBounds(135, 127, 145, 15);
		contentPanel.add(lblEspinoFajardoBetzi);
		
		lblRivasCrucesJos = new JLabel("Rivas Cruces Jos\u00E9");
		lblRivasCrucesJos.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblRivasCrucesJos.setForeground(Color.BLACK);
		lblRivasCrucesJos.setBounds(155, 153, 99, 14);
		contentPanel.add(lblRivasCrucesJos);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
	}

	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}
}
