/**
 *Clase Main.
 *Esta clase ha sido creada para pedirle la información necesaria al usuario, la cual
 *será clave para calcular el resultado final. eEsta inforrmación será mandada a la clase persona.
 */

package proyectoAlimento;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SpinnerNumberModel;
import javax.swing.JTextPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ProyectoAlimentacion{

	private JFrame frame;
	private JTextField txtNombre;
	private JTextField textField;
	private final Color FONDO_COLOR_TITULO = new Color(255,255,221);
	private final Color FONDO_COLOR = new Color(236,224,251);
	private final String DEFECTO_TXTNOMBRE="Escribe tu nombre...";


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {		

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProyectoAlimentacion window = new ProyectoAlimentacion();
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
	public ProyectoAlimentacion() {
		initialize();



	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setBackground(new Color(236,224,251));
		frame.setBounds(100, 100, 1053, 558);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblRellenardatos = new JLabel("Necesitaremos que rellenes una serie de datos ");
		lblRellenardatos.setForeground(Color.BLACK);
		lblRellenardatos.setFont(new Font("Dialog", Font.BOLD, 20));
		lblRellenardatos.setBounds(287, 70, 518, 23);
		frame.getContentPane().add(lblRellenardatos);

		JLabel lblComotellamas = new JLabel("¿Cómo te llamas?");
		lblComotellamas.setForeground(Color.BLACK);
		lblComotellamas.setFont(new Font("Dialog", Font.BOLD, 16));
		lblComotellamas.setBounds(121, 120, 152, 31);
		frame.getContentPane().add(lblComotellamas);

		txtNombre = new JTextField();
		txtNombre.setText(DEFECTO_TXTNOMBRE);
		txtNombre.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtNombre.setForeground(Color.GRAY);
		txtNombre.setBounds(265, 125, 666, 25);
		frame.getContentPane().add(txtNombre);
		txtNombre.setColumns(10);

		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setForeground(Color.BLACK);
		lblSexo.setFont(new Font("Dialog", Font.BOLD, 16));
		lblSexo.setBounds(121, 203, 60, 17);
		frame.getContentPane().add(lblSexo);

		JRadioButton rdbtnMujer = new JRadioButton("Mujer");
		rdbtnMujer.setFont(new Font("Dialog", Font.PLAIN, 16));
		rdbtnMujer.setBackground(FONDO_COLOR);
		rdbtnMujer.setBounds(165, 228, 130, 25);
		frame.getContentPane().add(rdbtnMujer);

		JRadioButton rdbtnHombre = new JRadioButton("Hombre");
		rdbtnHombre.setSelected(true);
		rdbtnHombre.setFont(new Font("Dialog", Font.PLAIN, 16));
		rdbtnHombre.setBackground(FONDO_COLOR);
		rdbtnHombre.setBounds(165, 264, 130, 25);
		frame.getContentPane().add(rdbtnHombre);

		/**
		 * Creación de Grupo de Botones.
		 * Añadimos los RadioButton al grupo creado anteriormente
		 */

		ButtonGroup grupoRadioBotones = new ButtonGroup(); 

		grupoRadioBotones.add(rdbtnMujer); 
		grupoRadioBotones.add(rdbtnHombre); 

		JLabel lblEdad = new JLabel("Edad:");
		lblEdad.setForeground(Color.BLACK);
		lblEdad.setFont(new Font("Dialog", Font.BOLD, 16));
		lblEdad.setBounds(121, 335, 60, 17);
		frame.getContentPane().add(lblEdad);

		JSpinner spinner_anyos = new JSpinner();
		spinner_anyos.setBackground(new Color(0, 0, 0));
		spinner_anyos.setForeground(new Color(0, 0, 0));
		spinner_anyos.setModel(new SpinnerNumberModel(new Integer(18), new Integer(0), null, new Integer(1)));
		spinner_anyos.setValue(18);
		spinner_anyos.setFont(new Font("Dialog", Font.PLAIN, 16));
		spinner_anyos.setBounds(165, 362, 91, 22);
		frame.getContentPane().add(spinner_anyos);

		JLabel lblBienvenido = new JLabel("¡Bienvenido a nuestra aplicación! ");
		lblBienvenido.setFont(new Font("Dialog", Font.BOLD, 20));
		lblBienvenido.setForeground(Color.BLACK);
		lblBienvenido.setBounds(346, 27, 365, 31);
		frame.getContentPane().add(lblBienvenido);

		textField = new JTextField();
		textField.setEditable(false);
		textField.setBackground(FONDO_COLOR_TITULO);
		textField.setForeground(Color.BLACK);
		textField.setBounds(12, 10, 1021, 105);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblAnyos = new JLabel("años");
		lblAnyos.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblAnyos.setBounds(265, 365, 60, 17);
		frame.getContentPane().add(lblAnyos);

		JLabel lblPeso = new JLabel("Peso:");
		lblPeso.setForeground(Color.BLACK);
		lblPeso.setFont(new Font("Dialog", Font.BOLD, 16));
		lblPeso.setBounds(690, 203, 60, 17);
		frame.getContentPane().add(lblPeso);

		JLabel lblKg = new JLabel("kg");
		lblKg.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblKg.setBounds(852, 225, 19, 31);
		frame.getContentPane().add(lblKg);

		JSpinner spinner_peso = new JSpinner();
		spinner_peso.setModel(new SpinnerNumberModel(new Integer(70), new Integer(0), null, new Integer(1)));
		spinner_peso.setValue(70);
		spinner_peso.setFont(new Font("Dialog", Font.PLAIN, 16));
		spinner_peso.setBounds(747, 229, 96, 22);
		frame.getContentPane().add(spinner_peso);

		JLabel lblAltura = new JLabel("Altura:");
		lblAltura.setForeground(Color.BLACK);
		lblAltura.setFont(new Font("Dialog", Font.BOLD, 16));
		lblAltura.setBounds(690, 335, 60, 17);
		frame.getContentPane().add(lblAltura);

		JSpinner spinner_altura = new JSpinner();		
		spinner_altura.setModel(new SpinnerNumberModel(new Integer(160), new Integer(0), null, new Integer(1)));
		spinner_altura.setValue(160);
		spinner_altura.setFont(new Font("Dialog", Font.PLAIN, 16));
		spinner_altura.setBounds(747, 362, 96, 22);
		frame.getContentPane().add(spinner_altura);

		JLabel lblcm = new JLabel("cm");
		lblcm.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblcm.setBounds(852, 358, 74, 31);
		frame.getContentPane().add(lblcm);

		JButton btnRestablecer = new JButton("Restablecer");
		JButton btnContinuar = new JButton("Continuar");  /*Botón que cierra la primera ventana y abre la segunda*/

		JLabel lblErrorNombre = new JLabel();
		lblErrorNombre.setForeground(Color.RED);
		lblErrorNombre.setFont(new Font("Dialog", Font.ITALIC, 14));
		lblErrorNombre.setBounds(265, 163, 178, 17);
		frame.getContentPane().add(lblErrorNombre);

		JLabel lblErrorSexo = new JLabel();
		lblErrorSexo.setForeground(Color.RED);
		lblErrorSexo.setFont(new Font("Dialog", Font.ITALIC, 14));
		lblErrorSexo.setBounds(165, 296, 422, 17);
		frame.getContentPane().add(lblErrorSexo);

		//ZONA TRABAJO-----------------------------------------------------------

		txtNombre.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtNombre.setText("");
				txtNombre.setForeground(Color.BLACK);
				txtNombre.setFont(new Font("Dialog", Font.PLAIN, 16));

			}
		});

		btnRestablecer.setFont(new Font("Dialog", Font.BOLD, 16));
		btnRestablecer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				/**
				 * //Al hacer click al botón 'Restablecer', ponemos el txtNombre a nulo, 
				 * los spinners a sus valores por defecto y por último, habiendo creado el grupo de botones, 
				 * hacemos el clearSelection(); para que no aparezca ningún RadioButton marcado.	
				 */

				txtNombre.setForeground(Color.GRAY);
				txtNombre.setText(DEFECTO_TXTNOMBRE);
				txtNombre.setFont(new Font("Dialog", Font.PLAIN, 14));		
				spinner_anyos.setValue(18);             
				spinner_peso.setValue(70);
				spinner_altura.setValue(160);
				rdbtnHombre.setSelected(true);
				
				lblErrorNombre.setText("");
				lblErrorSexo.setText("");

			}
		});
		btnRestablecer.setBounds(121, 453, 288, 27);
		frame.getContentPane().add(btnRestablecer);


		btnContinuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//comprobar que todos los datos se rellenan para poder pasar a la siguiente ventana
				if (txtNombre.getText().equals("") || txtNombre.getText().equals(DEFECTO_TXTNOMBRE)) {
					lblErrorSexo.setText("");
					lblErrorNombre.setText("Pon tu nombre porfavor :D");
				}else {
					lblErrorNombre.setText("");
					lblErrorSexo.setText("");
					String sexo = "Hombre";
					if (rdbtnMujer.isSelected()) 
						sexo="Mujer";
					int peso= Integer.parseInt(spinner_peso.getValue().toString()); /*obtenemos los valores del usuario para devolverlos mediante el constructor de la otra ventana (ValoresNutritivos)*/
					int altura= Integer.parseInt(spinner_altura.getValue().toString());
					int edad= Integer.parseInt(spinner_anyos.getValue().toString());
					Persona usuario = new Persona(txtNombre.getText(), sexo, peso , altura, edad); /*Objeto de tipo persona con los datos del usuario*/
					frame.setVisible(false); /*Se cierra la ventana inicial*/
					ValoresNutritivos.arrancar(usuario); /*Se arranca ValoresNutritivos pasándole como parametro el objeto de tipo Persona*/
				}
			}
		});
		btnContinuar.setFont(new Font("Dialog", Font.BOLD, 16));
		btnContinuar.setBounds(638, 453, 288, 27);
		frame.getContentPane().add(btnContinuar);

	}
}