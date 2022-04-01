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
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SpinnerNumberModel;

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
		
		/**
		 * Creación de Grupo de Botones.
		 * Añadimos los RadioButton al grupo creado anteriormente
		 */
		
		ButtonGroup grupoRadioBotones = new ButtonGroup(); 
		
		grupoRadioBotones.add(rdbtnMujer); 
		grupoRadioBotones.add(rdbtnHombre); 
		
		JLabel lblEdad = new JLabel("Edad:");
		lblEdad.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblEdad.setBounds(121, 315, 60, 17);
		frame.getContentPane().add(lblEdad);
		
		JSpinner spinner_anyos = new JSpinner();
		spinner_anyos.setModel(new SpinnerNumberModel(new Integer(18), new Integer(0), null, new Integer(1)));
		spinner_anyos.setValue(18);
        spinner_anyos.setFont(new Font("Dialog", Font.PLAIN, 16));
		spinner_anyos.setBounds(165, 342, 91, 22);
		frame.getContentPane().add(spinner_anyos);
		
		JLabel lblAnyos = new JLabel("años");
		lblAnyos.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblAnyos.setBounds(265, 345, 60, 17);
		frame.getContentPane().add(lblAnyos);
		
		JLabel lblPeso = new JLabel("Peso:");
		lblPeso.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblPeso.setBounds(745, 203, 60, 17);
		frame.getContentPane().add(lblPeso);
		
		JLabel lblKg = new JLabel("kg");
		lblKg.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblKg.setBounds(907, 225, 19, 31);
		frame.getContentPane().add(lblKg);
		
		JSpinner spinner_peso = new JSpinner();
		spinner_peso.setModel(new SpinnerNumberModel(new Integer(70), new Integer(0), null, new Integer(1)));
		spinner_peso.setValue(70);
		spinner_peso.setFont(new Font("Dialog", Font.PLAIN, 16));
		spinner_peso.setBounds(802, 229, 96, 22);
		frame.getContentPane().add(spinner_peso);
		
		JLabel lblAltura = new JLabel("Altura:");
		lblAltura.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblAltura.setBounds(745, 315, 60, 17);
		frame.getContentPane().add(lblAltura);
		
		JSpinner spinner_altura = new JSpinner();		
		spinner_altura.setModel(new SpinnerNumberModel(new Integer(160), new Integer(0), null, new Integer(1)));
		spinner_altura.setValue(160);
		spinner_altura.setFont(new Font("Dialog", Font.PLAIN, 16));
		spinner_altura.setBounds(802, 342, 96, 22);
		frame.getContentPane().add(spinner_altura);
		
		JLabel lblcm = new JLabel("cm");
		lblcm.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblcm.setBounds(907, 338, 74, 31);
		frame.getContentPane().add(lblcm);
		
		JButton btnRestablecer = new JButton("Restablecer");
		btnRestablecer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
	
			/**
			 * //Al hacer click al botón 'Restablecer', ponemos el txtNombre a nulo, 
			 * los spinners a sus valores por defecto y por último, habiendo creado el grupo de botones, 
			 * hacemos el clearSelection(); para que no aparezca ningún RadioButton marcado.	
			 */
				
					txtNombre.setText(null);				
					spinner_anyos.setValue(18);             
					spinner_peso.setValue(70);
					spinner_altura.setValue(160);
					grupoRadioBotones.clearSelection();
					
			}
		});
		btnRestablecer.setBounds(121, 433, 288, 27);
		frame.getContentPane().add(btnRestablecer);
		
		JButton btnContinuar = new JButton("Continuar");
		btnContinuar.setBounds(638, 433, 288, 27);
		frame.getContentPane().add(btnContinuar);
	}
}