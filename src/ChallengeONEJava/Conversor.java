package ChallengeONEJava;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.text.DecimalFormat;

public class Conversor {

	private JFrame frame;
	public static JTextField textDolar;
	public static JTextField textEuros;
	public static JTextField textLibras;
	public static JTextField textYen;
	public static JTextField textWon;
	public static JTextField textPesos;
	public static JTextField textMonedas;
	private JLabel lblNewLabel;
	private JLabel lblCantidadDinero;
	private JButton btnSalir;
	private JButton btnLimpiar;
	private JComboBox comboBox;
	public static double MonedaEscogida ;
	public static String IItem;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Conversor window = new Conversor();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Conversor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 326, 452);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblDolar = new JLabel("Dolar");
		lblDolar.setBounds(10, 166, 74, 14);
		frame.getContentPane().add(lblDolar);
		
		JLabel lblLibras_Esterlinas = new JLabel("Libras Esterlinas");
		lblLibras_Esterlinas.setBounds(10, 216, 85, 14);
		frame.getContentPane().add(lblLibras_Esterlinas);
		
		JLabel lblEuros = new JLabel("Euros");
		lblEuros.setBounds(10, 191, 74, 14);
		frame.getContentPane().add(lblEuros);
		
		JLabel lblYen_Japonés = new JLabel("Yen Japonés");
		lblYen_Japonés.setBounds(10, 241, 74, 14);
		frame.getContentPane().add(lblYen_Japonés);
		
		JLabel lbWon_sulcoreano = new JLabel("Won sul-coreano");
		lbWon_sulcoreano.setBounds(10, 266, 85, 14);
		frame.getContentPane().add(lbWon_sulcoreano);
		
		textDolar = new JTextField();
		textDolar.setBounds(105, 163, 180, 20);
		frame.getContentPane().add(textDolar);
		textDolar.setColumns(10);
		
		textEuros = new JTextField();
		textEuros.setBounds(105, 188, 180, 20);
		frame.getContentPane().add(textEuros);
		textEuros.setColumns(10);
		
		textLibras = new JTextField();
		textLibras.setBounds(105, 213, 180, 20);
		frame.getContentPane().add(textLibras);
		textLibras.setColumns(10);
		
		textYen = new JTextField();
		textYen.setBounds(105, 238, 180, 20);
		frame.getContentPane().add(textYen);
		textYen.setColumns(10);
		
		textWon = new JTextField();
		textWon.setBounds(105, 263, 180, 20);
		frame.getContentPane().add(textWon);
		textWon.setColumns(10);
		
		JButton btnConvertir = new JButton("Convertir");
		btnConvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
				if (!Emptys()) {
					return;
				}
				IItem = comboBox.getSelectedItem().toString();		
				SeleccionMoneda selem = new SeleccionMoneda();
				selem.seleccionmoneda();
			}
		});
		btnConvertir.setBounds(10, 128, 89, 23);
		frame.getContentPane().add(btnConvertir);
		
		JLabel lblPesos = new JLabel("Pesos");
		lblPesos.setBounds(10, 291, 74, 14);
		frame.getContentPane().add(lblPesos);
		
		textPesos = new JTextField();
		textPesos.setBounds(105, 288, 180, 20);
		frame.getContentPane().add(textPesos);
		textPesos.setColumns(10);
		
		textMonedas = new JTextField();
		textMonedas.setBounds(10, 104, 130, 20);
		frame.getContentPane().add(textMonedas);
		textMonedas.setColumns(10);
		
		lblNewLabel = new JLabel("Elija la moneda que desea convertir");
		lblNewLabel.setBounds(10, 32, 215, 14);
		frame.getContentPane().add(lblNewLabel);
		
		lblCantidadDinero = new JLabel("Ingrese la cantidad de dinero que desea convertir");
		lblCantidadDinero.setBounds(10, 82, 252, 14);
		frame.getContentPane().add(lblCantidadDinero);
		
		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(105, 379, 89, 23);
		frame.getContentPane().add(btnSalir);
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LimpiarCampos lim = new LimpiarCampos();
				lim.limpiarCampos();
			}

		});
		btnLimpiar.setBounds(6, 379, 89, 23);
		frame.getContentPane().add(btnLimpiar);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Dolar", "Euros", "Libras Esterlinas", "Yen Japones", "Won sul corea", "Pesos"}));
		comboBox.setBounds(10, 49, 172, 22);
		frame.getContentPane().add(comboBox);
	}
	
	private Boolean Emptys() {
		if(textMonedas.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Debe indicar un valor");
			return false;
		}
		return true;
	}
	
			
}
