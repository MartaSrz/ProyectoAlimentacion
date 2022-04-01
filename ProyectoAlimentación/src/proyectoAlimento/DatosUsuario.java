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

public class DatosUsuario{

	private JFrame frame;
	private JTextField txtNombre;
	private JTextField textField;
	private final Color FONDO_COLOR_TITULO = new Color(255,255,221);
	private final Color FONDO_COLOR = new Color(236,224,251);
    
	
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
		
		TextPrompt Nombre = new TextPrompt("Escriba su nombre...",txtNombre);
	    Nombre.setForeground(new Color(128, 128, 128));
	   
		
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
		txtNombre.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtNombre.setForeground(Color.black);
		txtNombre.setBounds(265, 123, 666, 25);
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
		lblEdad.setBounds(121, 315, 60, 17);
		frame.getContentPane().add(lblEdad);
		
		JSpinner spinner_anyos = new JSpinner();
		spinner_anyos.setBackground(new Color(0, 0, 0));
		spinner_anyos.setForeground(new Color(0, 0, 0));
		spinner_anyos.setModel(new SpinnerNumberModel(new Integer(18), new Integer(0), null, new Integer(1)));
		spinner_anyos.setValue(18);
        spinner_anyos.setFont(new Font("Dialog", Font.PLAIN, 16));
		spinner_anyos.setBounds(165, 342, 91, 22);
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
		lblAnyos.setBounds(265, 345, 60, 17);
		frame.getContentPane().add(lblAnyos);
		
		JLabel lblPeso = new JLabel("Peso:");
		lblPeso.setForeground(Color.BLACK);
		lblPeso.setFont(new Font("Dialog", Font.BOLD, 16));
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
		lblAltura.setForeground(Color.BLACK);
		lblAltura.setFont(new Font("Dialog", Font.BOLD, 16));
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
		btnRestablecer.setFont(new Font("Dialog", Font.BOLD, 16));
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
		btnContinuar.setFont(new Font("Dialog", Font.BOLD, 16));
		btnContinuar.setBounds(638, 433, 288, 27);
		frame.getContentPane().add(btnContinuar);
		
	}
}