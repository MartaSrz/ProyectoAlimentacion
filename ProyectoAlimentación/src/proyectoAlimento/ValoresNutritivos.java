/**
 *Clase llamada por ResultadosUser la cual llamará a Resultados User.
 *Esta clase ha sido creada para preguntar al usuario qué alimento y cuánta cántidad
 *ha consumido de este, también mostrará los valores nutritivos del alimento elegido.
 */

package proyectoAlimento;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Dimension;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.SpinnerNumberModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Component;

public class ValoresNutritivos {

	private JFrame ventanaCalc;
	private final static Color FONDO_COLOR= new Color(255, 255, 221);
	private JTextField txtFondoColor;
	private static Persona usuario;  //Persona que mandaremos a la clase ResultadosUser
	private Alimento alimento[] = { //Declaración de los alimentos a usar
			new Alimento("Manzana",95,396,0.03,0.1,25.1,18.9,0.5,4.4,0.1,10.9,0.2,194.7),
			new Alimento("Macarrones",390,1631,1.6,0.3,78.4,2.8,13.7,3.4,0.1,22.1,3.5,234.2),
			new Alimento("Cacahuetes",180,752,15.8,2.6,4.6,1.3,8.4,2.8,0.1,18.3,0.2,217.8),
			new Alimento("Tomate",32,133,0.6,0.1,6.3,0,2.1,1.5,0.1,23.3,1,547),
			new Alimento("Patata",52,219,0.1,0.1,12.1,0.5,1.1,1.2,0.1,3,0.2,227.4),
			new Alimento("Lentejas",353,1478,1.1,0.2,60.1,2,25.8,30.5,0.1,56,7.5,955),
			new Alimento("Pechuga de pollo",260,1089,13.2,3.5,9.0,0,24.8,0.3,0.3,20,1.3,201),
			new Alimento("Pizza",266,1114,9.7,4.5,33.3,3.6,11.4,2.3,0.6,188,2.5,172),
			new Alimento("Nuggets",296,1239,19.8,4,14.1,0,15.3,2.1,0.6,31,0.1,265),
			new Alimento("Tortilla",154,645,11.7,3.3,0.6,0.3,10.6,0,0.2,48,1.5,117),
			new Alimento("Yogurt",243,1016,2.8,1.8,45.7,45.7,9.8,0,0.1,338.1,0.1,433.7),
			new Alimento("Hamburguesa",254,1063,12.3,3.8,24.8,0,11.7,0,0.5,57,2.4,206),
			new Alimento("Costillas",224,938,16.3,5.8,0,0,19.1,0,0.1,31,0.8,247),
			new Alimento("Arroz",97,406,0.2,0.1,21.1,0.1,2.0,1,0.1,2,0.1,10)
	};
	/**
	 * Launch the application.
	 * @param usuario 
	 */
	public static void arrancar(Persona usuario) { /*Metodo para arrancar la segunda ventana*/
		ValoresNutritivos.usuario=usuario;
		/*el user que va a ser pasado a la clase ResultadoUser es el mismo que el user mandado a esta clase en la clase DatosUsuario*/
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ValoresNutritivos window = new ValoresNutritivos();
					window.ventanaCalc.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ValoresNutritivos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		ventanaCalc = new JFrame();
		ventanaCalc.setResizable(false);
		ventanaCalc.getContentPane().setBackground(new Color(236, 224, 251));
		ventanaCalc.setBounds(100, 100, 1313, 987);
		ventanaCalc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventanaCalc.getContentPane().setLayout(null);

		/* creación del for para coger solo el nombre de los alimento para utilizarlo en el comboBox*/
		int longitudArray=alimento.length;
		String[] nombreAlimentos= new String[longitudArray];
		for (int i=0; i<longitudArray; i++) {
			nombreAlimentos[i]=alimento[i].getNombre();
		}

		JComboBox selectAlimentos = new JComboBox();
		selectAlimentos.setAlignmentX(Component.RIGHT_ALIGNMENT);
		selectAlimentos.setFont(new Font("Dialog", Font.BOLD, 16));
		selectAlimentos.setModel(new DefaultComboBoxModel(nombreAlimentos));
		selectAlimentos.setSelectedIndex(-1);
		selectAlimentos.setBounds(259, 23, 217, 37);
		ventanaCalc.getContentPane().add(selectAlimentos);

		JLabel lblEscogeUnAlimento = new JLabel("Escoge un alimento:");
		lblEscogeUnAlimento.setFont(new Font("Dialog", Font.BOLD, 18));
		lblEscogeUnAlimento.setBounds(49, 23, 192, 32);
		ventanaCalc.getContentPane().add(lblEscogeUnAlimento);

		JLabel lblValorLetrero = new JLabel("Valor");
		lblValorLetrero.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblValorLetrero.setBounds(49, 169, 192, 32);
		ventanaCalc.getContentPane().add(lblValorLetrero);

		JLabel lblEnergticoLetrero = new JLabel("energético");
		lblEnergticoLetrero.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblEnergticoLetrero.setBounds(49, 197, 192, 32);
		ventanaCalc.getContentPane().add(lblEnergticoLetrero);

		JLabel lblGrasasLetrero = new JLabel("Grasas");
		lblGrasasLetrero.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblGrasasLetrero.setBounds(49, 244, 192, 32);
		ventanaCalc.getContentPane().add(lblGrasasLetrero);

		JLabel lblSaturadasLetrero = new JLabel("Saturadas");
		lblSaturadasLetrero.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblSaturadasLetrero.setBounds(85, 270, 192, 32);
		ventanaCalc.getContentPane().add(lblSaturadasLetrero);

		JLabel lblHidratosDeCarbonoLetrero = new JLabel("Hidratos de carbono");
		lblHidratosDeCarbonoLetrero.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblHidratosDeCarbonoLetrero.setBounds(49, 314, 192, 32);
		ventanaCalc.getContentPane().add(lblHidratosDeCarbonoLetrero);

		JLabel lblAzcarLetrero = new JLabel("Azúcar");
		lblAzcarLetrero.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblAzcarLetrero.setBounds(85, 341, 192, 32);
		ventanaCalc.getContentPane().add(lblAzcarLetrero);

		JLabel lblProtenasLetrero = new JLabel("Proteínas");
		lblProtenasLetrero.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblProtenasLetrero.setBounds(49, 385, 192, 32);
		ventanaCalc.getContentPane().add(lblProtenasLetrero);

		JLabel lblSalLetrero = new JLabel("Sal");
		lblSalLetrero.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblSalLetrero.setBounds(49, 428, 192, 32);
		ventanaCalc.getContentPane().add(lblSalLetrero);

		JLabel lblCalcioLetrero = new JLabel("Calcio");
		lblCalcioLetrero.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblCalcioLetrero.setBounds(49, 472, 192, 32);
		ventanaCalc.getContentPane().add(lblCalcioLetrero);

		JLabel lblFibraLetrero = new JLabel("Fibra");
		lblFibraLetrero.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblFibraLetrero.setBounds(49, 516, 192, 32);
		ventanaCalc.getContentPane().add(lblFibraLetrero);

		JLabel lblPotasioLetrero = new JLabel("Potasio");
		lblPotasioLetrero.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblPotasioLetrero.setBounds(49, 560, 192, 32);
		ventanaCalc.getContentPane().add(lblPotasioLetrero);

		JLabel lblHierroLetrero = new JLabel("Hierro");
		lblHierroLetrero.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblHierroLetrero.setBounds(49, 604, 192, 32);
		ventanaCalc.getContentPane().add(lblHierroLetrero);

		JLabel lblPorg = new JLabel("por 100g");
		lblPorg.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPorg.setFont(new Font("Dialog", Font.BOLD, 16));
		lblPorg.setBounds(629, 133, 80, 32);
		ventanaCalc.getContentPane().add(lblPorg);

		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(38, 123, 678, 10);
		ventanaCalc.getContentPane().add(separator);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(49, 670, 246, 246);
		ventanaCalc.getContentPane().add(panel);

		JLabel lblcuntaCantidadHas = new JLabel("¿Cuánta cantidad has consumido?");
		lblcuntaCantidadHas.setFont(new Font("Dialog", Font.BOLD, 16));
		lblcuntaCantidadHas.setBounds(49, 79, 280, 32);
		ventanaCalc.getContentPane().add(lblcuntaCantidadHas);

		JSpinner cantidadGramos = new JSpinner();
		cantidadGramos.setModel(new SpinnerNumberModel(new Integer(100), new Integer(10), null, new Integer(1)));
		cantidadGramos.setFont(new Font("Dialog", Font.BOLD, 16));
		cantidadGramos.setBounds(388, 79, 88, 32);
		ventanaCalc.getContentPane().add(cantidadGramos);

		JButton btnComprobarResultados = new JButton("Comprobar resultados");
		btnComprobarResultados.setFont(new Font("Dialog", Font.BOLD, 16));
		btnComprobarResultados.setBounds(756, 871, 514, 45);
		ventanaCalc.getContentPane().add(btnComprobarResultados);

		JButton btnAnyadir = new JButton("Añadir");
		btnAnyadir.setEnabled(false);
		btnAnyadir.setFont(new Font("Dialog", Font.BOLD, 16));
		btnAnyadir.setBounds(517, 79, 192, 32);
		ventanaCalc.getContentPane().add(btnAnyadir);

		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.BLACK);
		separator_2.setBounds(38, 648, 678, 10);
		ventanaCalc.getContentPane().add(separator_2);

		JLabel lblValor_1 = new JLabel("0");
		lblValor_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblValor_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblValor_1.setBounds(477, 169, 171, 32);
		ventanaCalc.getContentPane().add(lblValor_1);

		JLabel lblEnergtico_1 = new JLabel("0");
		lblEnergtico_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEnergtico_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblEnergtico_1.setBounds(477, 197, 171, 32);
		ventanaCalc.getContentPane().add(lblEnergtico_1);

		JLabel lblGrasas_1 = new JLabel("0");
		lblGrasas_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblGrasas_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblGrasas_1.setBounds(477, 244, 171, 32);
		ventanaCalc.getContentPane().add(lblGrasas_1);

		JLabel lblSaturadas_1 = new JLabel("0");
		lblSaturadas_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSaturadas_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblSaturadas_1.setBounds(477, 270, 171, 32);
		ventanaCalc.getContentPane().add(lblSaturadas_1);

		JLabel lblHidratosDeCarbono_1 = new JLabel("0");
		lblHidratosDeCarbono_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblHidratosDeCarbono_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblHidratosDeCarbono_1.setBounds(477, 314, 171, 32);
		ventanaCalc.getContentPane().add(lblHidratosDeCarbono_1);

		JLabel lblAzcar_1 = new JLabel("0");
		lblAzcar_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAzcar_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblAzcar_1.setBounds(477, 341, 171, 32);
		ventanaCalc.getContentPane().add(lblAzcar_1);

		JLabel lblProtenas_1 = new JLabel("0");
		lblProtenas_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblProtenas_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblProtenas_1.setBounds(477, 385, 171, 32);
		ventanaCalc.getContentPane().add(lblProtenas_1);

		JLabel lblSal_1 = new JLabel("0");
		lblSal_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSal_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblSal_1.setBounds(477, 428, 171, 32);
		ventanaCalc.getContentPane().add(lblSal_1);

		JLabel lblCalcio_1 = new JLabel("0");
		lblCalcio_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCalcio_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblCalcio_1.setBounds(477, 472, 171, 32);
		ventanaCalc.getContentPane().add(lblCalcio_1);

		JLabel lblFibra_1 = new JLabel("0");
		lblFibra_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFibra_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblFibra_1.setBounds(477, 516, 171, 32);
		ventanaCalc.getContentPane().add(lblFibra_1);

		JLabel lblPotasio_1 = new JLabel("0");
		lblPotasio_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPotasio_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblPotasio_1.setBounds(477, 560, 171, 32);
		ventanaCalc.getContentPane().add(lblPotasio_1);

		JLabel lblHierro_1 = new JLabel("0");
		lblHierro_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblHierro_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblHierro_1.setBounds(477, 604, 171, 32);
		ventanaCalc.getContentPane().add(lblHierro_1);

		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.LIGHT_GRAY);
		separator_1.setBounds(49, 233, 660, 10);
		ventanaCalc.getContentPane().add(separator_1);

		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(Color.LIGHT_GRAY);
		separator_3.setBounds(49, 305, 660, 10);
		ventanaCalc.getContentPane().add(separator_3);

		JSeparator separator_4 = new JSeparator();
		separator_4.setForeground(Color.LIGHT_GRAY);
		separator_4.setBounds(49, 376, 660, 10);
		ventanaCalc.getContentPane().add(separator_4);

		JSeparator separator_3_1 = new JSeparator();
		separator_3_1.setForeground(Color.LIGHT_GRAY);
		separator_3_1.setBounds(49, 428, 660, 2);
		ventanaCalc.getContentPane().add(separator_3_1);

		JSeparator separator_4_1 = new JSeparator();
		separator_4_1.setForeground(Color.LIGHT_GRAY);
		separator_4_1.setBounds(49, 505, 660, 10);
		ventanaCalc.getContentPane().add(separator_4_1);

		JSeparator separator_4_1_1 = new JSeparator();
		separator_4_1_1.setForeground(Color.LIGHT_GRAY);
		separator_4_1_1.setBounds(49, 463, 660, 10);
		ventanaCalc.getContentPane().add(separator_4_1_1);

		JSeparator separator_4_1_2 = new JSeparator();
		separator_4_1_2.setForeground(Color.LIGHT_GRAY);
		separator_4_1_2.setBounds(49, 549, 660, 10);
		ventanaCalc.getContentPane().add(separator_4_1_2);

		JSeparator separator_4_1_3 = new JSeparator();
		separator_4_1_3.setForeground(Color.LIGHT_GRAY);
		separator_4_1_3.setBounds(49, 594, 660, 10);
		ventanaCalc.getContentPane().add(separator_4_1_3);

		JLabel lblGramos = new JLabel("g");
		lblGramos.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblGramos.setBounds(671, 244, 38, 32);
		ventanaCalc.getContentPane().add(lblGramos);

		JLabel lblGramos_1 = new JLabel("g");
		lblGramos_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblGramos_1.setBounds(671, 270, 38, 32);
		ventanaCalc.getContentPane().add(lblGramos_1);

		JLabel lblGramos_2 = new JLabel("g");
		lblGramos_2.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblGramos_2.setBounds(671, 314, 38, 32);
		ventanaCalc.getContentPane().add(lblGramos_2);

		JLabel lblGramos_3 = new JLabel("g");
		lblGramos_3.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblGramos_3.setBounds(671, 341, 38, 32);
		ventanaCalc.getContentPane().add(lblGramos_3);

		JLabel lblGramos_4 = new JLabel("g");
		lblGramos_4.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblGramos_4.setBounds(671, 385, 38, 32);
		ventanaCalc.getContentPane().add(lblGramos_4);

		JLabel lblGramos_5 = new JLabel("g");
		lblGramos_5.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblGramos_5.setBounds(671, 428, 38, 32);
		ventanaCalc.getContentPane().add(lblGramos_5);

		JLabel lblGramos_6 = new JLabel("g");
		lblGramos_6.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblGramos_6.setBounds(671, 472, 38, 32);
		ventanaCalc.getContentPane().add(lblGramos_6);

		JLabel lblMiliGramos_1 = new JLabel("mg");
		lblMiliGramos_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblMiliGramos_1.setBounds(671, 560, 38, 32);
		ventanaCalc.getContentPane().add(lblMiliGramos_1);

		JLabel lblMiliGramos_2 = new JLabel("mg");
		lblMiliGramos_2.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblMiliGramos_2.setBounds(671, 604, 38, 32);
		ventanaCalc.getContentPane().add(lblMiliGramos_2);

		JLabel lblMiliGramos = new JLabel("mg");
		lblMiliGramos.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblMiliGramos.setBounds(671, 516, 38, 32);
		ventanaCalc.getContentPane().add(lblMiliGramos);

		JLabel lblKiloCalorias = new JLabel("Kcal");
		lblKiloCalorias.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblKiloCalorias.setBounds(671, 169, 38, 32);
		ventanaCalc.getContentPane().add(lblKiloCalorias);

		JEditorPane txtAlimentosElegidos = new JEditorPane();
		txtAlimentosElegidos.setEditable(false);
		txtAlimentosElegidos.setBackground(FONDO_COLOR);
		txtAlimentosElegidos.setBounds(801, 79, 233, 726);
		ventanaCalc.getContentPane().add(txtAlimentosElegidos);

		JEditorPane txtCantidadesElegidas = new JEditorPane();
		txtCantidadesElegidas.setEditable(false);
		txtCantidadesElegidas.setBounds(1085, 79, 154, 726);
		txtCantidadesElegidas.setBackground(FONDO_COLOR);
		ventanaCalc.getContentPane().add(txtCantidadesElegidas);

		JLabel lblKiloJulios = new JLabel("KJ");
		lblKiloJulios.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblKiloJulios.setBounds(671, 197, 38, 32);
		ventanaCalc.getContentPane().add(lblKiloJulios);

		JLabel lblCantidad = new JLabel("Cantidades");
		lblCantidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblCantidad.setFont(new Font("Dialog", Font.BOLD, 18));
		lblCantidad.setBounds(1075, 34, 160, 32);
		ventanaCalc.getContentPane().add(lblCantidad);

		JLabel lblAlimentoElegido = new JLabel("Alimentos elegidos");
		lblAlimentoElegido.setHorizontalAlignment(SwingConstants.CENTER);
		lblAlimentoElegido.setFont(new Font("Dialog", Font.BOLD, 18));
		lblAlimentoElegido.setBounds(791, 37, 243, 26);
		ventanaCalc.getContentPane().add(lblAlimentoElegido);

		txtFondoColor = new JTextField();
		txtFondoColor.setEditable(false);
		txtFondoColor.setBackground(FONDO_COLOR);
		txtFondoColor.setBounds(756, 23, 514, 813);
		ventanaCalc.getContentPane().add(txtFondoColor);
		txtFondoColor.setColumns(10);

		JTextPane textConsejo = new JTextPane();
		textConsejo.setEditable(false);
		textConsejo.setFont(new Font("Dialog", Font.PLAIN, 14));
		textConsejo.setBackground(FONDO_COLOR);
		textConsejo.setBounds(307, 670, 402, 246);
		ventanaCalc.getContentPane().add(textConsejo);

		JLabel lblEspecificarGramos = new JLabel("g");
		lblEspecificarGramos.setHorizontalAlignment(SwingConstants.LEFT);
		lblEspecificarGramos.setFont(new Font("Dialog", Font.BOLD, 16));
		lblEspecificarGramos.setBounds(487, 79, 25, 32);
		ventanaCalc.getContentPane().add(lblEspecificarGramos);

		//ZONA DE TRABAJO-----------------------------------------------------------------------

		selectAlimentos.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) { /*Se cambia de elemento el selector de alimentos*/
				int seleccionado = selectAlimentos.getSelectedIndex();

				btnAnyadir.setEnabled(true);
				lblValor_1.setText(String.valueOf(alimento[seleccionado].getKcal()));
				lblEnergtico_1.setText(String.valueOf(alimento[seleccionado].getkJ()));
				lblGrasas_1.setText(String.valueOf(alimento[seleccionado].getGrasas()));
				lblSaturadas_1.setText(String.valueOf(alimento[seleccionado].getGrasasSaturadas()));
				lblHidratosDeCarbono_1.setText(String.valueOf(alimento[seleccionado].getHidratos()));
				lblAzcar_1.setText(String.valueOf(alimento[seleccionado].getAzucar()));
				lblProtenas_1.setText(String.valueOf(alimento[seleccionado].getProteinas()));
				lblSal_1.setText(String.valueOf(alimento[seleccionado].getSal()));
				lblCalcio_1.setText(String.valueOf(alimento[seleccionado].getCalcio()));
				lblFibra_1.setText(String.valueOf(alimento[seleccionado].getFibra()));
				lblPotasio_1.setText(String.valueOf(alimento[seleccionado].getPotasio()));
				lblHierro_1.setText(String.valueOf(alimento[seleccionado].getHierro()));
			}
		});

		textConsejo.setText("CONSEJO NUTRICIONAL\n\nTodas las células del cuerpo necesitan de agua para funcionar, por eso es esencial ingerir suficiente. Una adecuada hidratación te puede ayudar a mejorar tu digestión, la función de tus riñones y lucir una piel más hidratada.\n\nLo ideal es que consumas 2,7 litros de agua potable al día si eres mujer y 3,7 si eres hombre. Aquí se incluye el agua de los alimentos, que representa aproximadamente un 20% del total.");

		btnAnyadir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) { /*eso va a almacenar en el texto la cantidad y el alimento*/
				txtAlimentosElegidos.setText(txtAlimentosElegidos.getText()+selectAlimentos.getSelectedItem()+"\n");
				txtCantidadesElegidas.setText(txtCantidadesElegidas.getText()+cantidadGramos.getValue()+"g\n");
			}
		});

		btnComprobarResultados.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventanaCalc.setVisible(false);
				ResultadosUser.resultados(usuario); /*misma acción que en la ventana main pero hacia la tercera ventana, le pasamos la misma persona*/
			}
		});

	}
}
