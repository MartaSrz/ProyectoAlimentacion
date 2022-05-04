/**
 *Clase llamada por ValoresNutritivos.
 *Esta clase ha sido creada para mostrar los resultados finales al user.
 */


package proyectoAlimento;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.io.File;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.border.TitledBorder;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.JTextArea;

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
		frame.setBounds(100, 100, 920, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTitulo = new JLabel("\u00A1Estos son tus resultados respecto al C\u00C3\u00A1lculo Nutritivo :D!");
		lblTitulo.setFont(new Font("Dialog", Font.BOLD, 16));
		lblTitulo.setBounds(218, 22, 467, 17);
		frame.getContentPane().add(lblTitulo);
		
		JLabel lblInfopeso = new JLabel("Sobre su peso:");
		lblInfopeso.setFont(new Font("Dialog", Font.BOLD, 16));
		lblInfopeso.setBounds(596, 76, 118, 17);
		frame.getContentPane().add(lblInfopeso);
		
		JTextArea textAreaCualEsSuPeso = new JTextArea();
		textAreaCualEsSuPeso.setEditable(false);
		textAreaCualEsSuPeso.setBounds(596, 108, 228, 129);
		frame.getContentPane().add(textAreaCualEsSuPeso);
		textAreaCualEsSuPeso.setText("�Hola " + usuario.getNombre()+"!\n");
		textAreaCualEsSuPeso.append(Imc.calcular_peso_ideal(usuario.getEdad(), usuario.getAltura(), usuario.getPeso(), usuario.getSexo())+"\n\n");
		textAreaCualEsSuPeso.append(Imc.imc_persona(usuario.getAltura(), usuario.getPeso()));
		
		JLabel lblReferenciaImagen = new JLabel("Esta imagen te ayudar\u00E1 a orientarte dependiendo de tu resultado.");
		lblReferenciaImagen.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblReferenciaImagen.setBounds(45, 76, 512, 17);
		frame.getContentPane().add(lblReferenciaImagen);
		
		//Creamos el objeto(JPG de cualquier tama�o)
        ImageIcon estadoFisico=new ImageIcon("img/estadoFisico.png");
	}
}
