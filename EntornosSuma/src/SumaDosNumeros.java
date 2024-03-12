import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class SumaDosNumeros {

	private JFrame frame;
	private JTextField txtN1;
	private JTextField txtN2;
	private JLabel lblSalida;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SumaDosNumeros window = new SumaDosNumeros();
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
	public SumaDosNumeros() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Número 1");
		lblNewLabel.setBounds(10, 11, 55, 14);
		frame.getContentPane().add(lblNewLabel);
		
		txtN1 = new JTextField();
		txtN1.setBounds(71, 8, 86, 20);
		frame.getContentPane().add(txtN1);
		txtN1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Número 2");
		lblNewLabel_1.setBounds(10, 47, 55, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		txtN2 = new JTextField();
		txtN2.setBounds(71, 44, 86, 20);
		frame.getContentPane().add(txtN2);
		txtN2.setColumns(10);
		
		JButton botonSumar = new JButton("Dividir");
		botonSumar.setBounds(10, 72, 89, 23);
		botonSumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//datos de las variables simples
				int n1 = Integer.parseInt(txtN1.getText());
				int n2 = Integer.parseInt(txtN2.getText());
				
				//Calculamos la suma
				int div= n1/n2;
				//Mostramos el resultado en el control de salida
				lblSalida.setText(String.format("%d / %d = %d", n1,n2,div));
			}
		});
		frame.getContentPane().add(botonSumar);
		
		JButton botonLimpiar = new JButton("Limpiar");
		botonLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//"Limpiamos el numero 1 y 2"
				txtN1.setText("");
				txtN2.setText("");
				//"Limpiamos el contenido"
				lblSalida.setText("");
			}
		});
		botonLimpiar.setBounds(109, 72, 89, 23);
		frame.getContentPane().add(botonLimpiar);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 106, 410, 150);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		lblSalida = new JLabel("New label");
		lblSalida.setHorizontalAlignment(SwingConstants.CENTER);
		lblSalida.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblSalida.setBounds(10, 11, 390, 125);
		panel.add(lblSalida);
	}
}
