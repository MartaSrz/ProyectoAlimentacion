package proyectoAlimento;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DatosUsuario {

	private JFrame frame;
	private JTextField txtNombre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DatosUsuario window = new DatosUsuario();
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
	public DatosUsuario() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1053, 558);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblBienvenido = new JLabel("¡Bienvenido a nuestra aplicación!, gracias a esta aplicación descubrirás si sigues una dieta saludable. ");
		lblBienvenido.setFont(new Font("Dialog", Font.BOLD, 18));
		lblBienvenido.setForeground(Color.BLACK);
		lblBienvenido.setBounds(61, 12, 933, 31);
		frame.getContentPane().add(lblBienvenido);
		
		JLabel lblRellenardatos = new JLabel("Para esto, primero necesitaremos que rellenes una serie de datos ");
		lblRellenardatos.setFont(new Font("Dialog", Font.BOLD, 18));
		lblRellenardatos.setBounds(222, 55, 637, 17);
		frame.getContentPane().add(lblRellenardatos);
		
		JLabel lblComotellamas = new JLabel("¿Cómo te llamas?");
		lblComotellamas.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblComotellamas.setBounds(121, 120, 152, 31);
		frame.getContentPane().add(lblComotellamas);
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtNombre.setBounds(260, 123, 666, 25);
		frame.getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblSexo.setBounds(121, 203, 60, 17);
		frame.getContentPane().add(lblSexo);
		
		JRadioButton rdbtnMujer = new JRadioButton("Mujer");
		rdbtnMujer.setFont(new Font("Dialog", Font.PLAIN, 16));
		rdbtnMujer.setBounds(165, 228, 130, 25);
		frame.getContentPane().add(rdbtnMujer);
		
		JRadioButton rdbtnHombre = new JRadioButton("Hombre");
		rdbtnHombre.setFont(new Font("Dialog", Font.PLAIN, 16));
		rdbtnHombre.setBounds(165, 264, 130, 25);
		frame.getContentPane().add(rdbtnHombre);
		
		JLabel lblEdad = new JLabel("Edad:");
		lblEdad.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblEdad.setBounds(121, 315, 60, 17);
		frame.getContentPane().add(lblEdad);
		
		JSpinner spinner = new JSpinner();
		spinner.setFont(new Font("Dialog", Font.PLAIN, 16));
		spinner.setBounds(165, 342, 91, 22);
		frame.getContentPane().add(spinner);
		
		JLabel lblAos = new JLabel("años");
		lblAos.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblAos.setBounds(265, 345, 60, 17);
		frame.getContentPane().add(lblAos);
		
		JLabel lblPeso = new JLabel("Peso:");
		lblPeso.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblPeso.setBounds(745, 203, 60, 17);
		frame.getContentPane().add(lblPeso);
		
		JLabel lblKg = new JLabel("kg");
		lblKg.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblKg.setBounds(907, 225, 19, 31);
		frame.getContentPane().add(lblKg);
		
		JLabel lblAltura = new JLabel("Altura:");
		lblAltura.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblAltura.setBounds(745, 315, 60, 17);
		frame.getContentPane().add(lblAltura);
		
		JSpinner spinner_1_1 = new JSpinner();
		spinner_1_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		spinner_1_1.setBounds(802, 342, 96, 22);
		frame.getContentPane().add(spinner_1_1);
		
		JLabel lblCm = new JLabel("cm");
		lblCm.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblCm.setBounds(907, 338, 34, 31);
		frame.getContentPane().add(lblCm);
		
		JButton btnRestablecer = new JButton("Restablecer");
		btnRestablecer.setBounds(121, 433, 288, 27);
		frame.getContentPane().add(btnRestablecer);
		
		JButton btnContinuar = new JButton("Continuar");
		btnContinuar.setBounds(638, 433, 288, 27);
		frame.getContentPane().add(btnContinuar);
		
		JSpinner spinner_1_1_1 = new JSpinner();
		spinner_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		spinner_1_1_1.setBounds(802, 229, 96, 22);
		frame.getContentPane().add(spinner_1_1_1);
	}
}
