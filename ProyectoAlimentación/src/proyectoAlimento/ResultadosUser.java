/**
 *Clase llamada por ValoresNutritivos.
 *Esta clase ha sido creada para mostrar los resultados finales al user.
 */


package proyectoAlimento;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class ResultadosUser {

	private JFrame frame;
	private final static Color FONDO_COLOR= new Color(255, 255, 221);
	private static Persona usuario;
	/**
	 * Launch the application.
	 */
	public static void resultados(Persona usuario) { /*accción para arrancar la tercera ventana*/
		ResultadosUser.usuario=usuario;
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ResultadosUser window = new ResultadosUser();
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
	public ResultadosUser() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(FONDO_COLOR);
		frame.setBounds(100, 100, 780, 541);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblEstosSonTus = new JLabel("!Estos son tus resultados respecto al Cálculo Nutritivo :D!");
		lblEstosSonTus.setFont(new Font("Dialog", Font.BOLD, 16));
		lblEstosSonTus.setBounds(151, 12, 467, 17);
		frame.getContentPane().add(lblEstosSonTus);
		
		JLabel lblInfopeso = new JLabel("Sobre su peso:");
		lblInfopeso.setFont(new Font("Dialog", Font.BOLD, 16));
		lblInfopeso.setBounds(34, 436, 118, 17);
		frame.getContentPane().add(lblInfopeso);
		
		JLabel lblcualessupeso = new JLabel("");
		lblcualessupeso.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblcualessupeso.setBounds(151, 436, 558, 17);
		frame.getContentPane().add(lblcualessupeso);
		lblcualessupeso.setText("Hola " + usuario.getNombre() + ". " + Imc.peso_ideal(usuario.getEdad(), usuario.getAltura(), usuario.getPeso(), usuario.getSexo()));
		
		JLabel lblimc_persona = new JLabel("");
		lblimc_persona.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblimc_persona.setBounds(151, 465, 455, 17);
		frame.getContentPane().add(lblimc_persona);
		lblimc_persona.setText(Imc.imc_persona(usuario.getAltura(), usuario.getPeso()));
		
	}
}
