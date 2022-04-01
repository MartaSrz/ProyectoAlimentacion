package proyectoAlimento;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
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

public class CalculoNutritivo {

	private JFrame frame;
	private JTextField textFondo;
	private final static Color FONDO_COLOR= new Color(255, 255, 221);
	private JTextField txtFondoColor;
	private Alimento alimento[] = {
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
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculoNutritivo window = new CalculoNutritivo();
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
	public CalculoNutritivo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setBackground(new Color(236, 224, 251));
		frame.setBounds(100, 100, 1313, 987);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Dialog", Font.BOLD, 16));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Manzana", "Macarrones", "Cacahuetes", "Tomate", "Patata", "Lentejas", "Pechugas de pollo", "Pizza", "Nuggets", "Tortilla", "Yogurt", "Hamburguesas", "Costillas", "Arroz Blanco"}));
		comboBox.setToolTipText("");
		comboBox.setBounds(259, 23, 217, 37);
		frame.getContentPane().add(comboBox);
		
		JLabel lblEscogeUnAlimento = new JLabel("Escoge un alimento:");
		lblEscogeUnAlimento.setFont(new Font("Dialog", Font.BOLD, 18));
		lblEscogeUnAlimento.setBounds(49, 23, 192, 32);
		frame.getContentPane().add(lblEscogeUnAlimento);
		
		JLabel lblValorLetrero = new JLabel("Valor");
		lblValorLetrero.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblValorLetrero.setBounds(49, 169, 192, 32);
		frame.getContentPane().add(lblValorLetrero);
		
		JLabel lblEnergticoLetrero = new JLabel("energético");
		lblEnergticoLetrero.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblEnergticoLetrero.setBounds(49, 197, 192, 32);
		frame.getContentPane().add(lblEnergticoLetrero);
		
		JLabel lblGrasasLetrero = new JLabel("Grasas");
		lblGrasasLetrero.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblGrasasLetrero.setBounds(49, 244, 192, 32);
		frame.getContentPane().add(lblGrasasLetrero);
		
		JLabel lblSaturadasLetrero = new JLabel("Saturadas");
		lblSaturadasLetrero.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblSaturadasLetrero.setBounds(85, 270, 192, 32);
		frame.getContentPane().add(lblSaturadasLetrero);
		
		JLabel lblHidratosDeCarbonoLetrero = new JLabel("Hidratos de carbono");
		lblHidratosDeCarbonoLetrero.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblHidratosDeCarbonoLetrero.setBounds(49, 314, 192, 32);
		frame.getContentPane().add(lblHidratosDeCarbonoLetrero);
		
		JLabel lblAzcarLetrero = new JLabel("Azúcar");
		lblAzcarLetrero.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblAzcarLetrero.setBounds(85, 341, 192, 32);
		frame.getContentPane().add(lblAzcarLetrero);
		
		JLabel lblProtenasLetrero = new JLabel("Proteínas");
		lblProtenasLetrero.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblProtenasLetrero.setBounds(49, 385, 192, 32);
		frame.getContentPane().add(lblProtenasLetrero);
		
		JLabel lblSalLetrero = new JLabel("Sal");
		lblSalLetrero.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblSalLetrero.setBounds(49, 428, 192, 32);
		frame.getContentPane().add(lblSalLetrero);
		
		JLabel lblCalcioLetrero = new JLabel("Calcio");
		lblCalcioLetrero.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblCalcioLetrero.setBounds(49, 472, 192, 32);
		frame.getContentPane().add(lblCalcioLetrero);
		
		JLabel lblFibraLetrero = new JLabel("Fibra");
		lblFibraLetrero.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblFibraLetrero.setBounds(49, 516, 192, 32);
		frame.getContentPane().add(lblFibraLetrero);
		
		JLabel lblPotasioLetrero = new JLabel("Potasio");
		lblPotasioLetrero.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblPotasioLetrero.setBounds(49, 560, 192, 32);
		frame.getContentPane().add(lblPotasioLetrero);
		
		JLabel lblHierroLetrero = new JLabel("Hierro");
		lblHierroLetrero.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblHierroLetrero.setBounds(49, 604, 192, 32);
		frame.getContentPane().add(lblHierroLetrero);
		
		JLabel lblPorg = new JLabel("por 100g");
		lblPorg.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPorg.setFont(new Font("Dialog", Font.BOLD, 16));
		lblPorg.setBounds(629, 133, 80, 32);
		frame.getContentPane().add(lblPorg);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(38, 123, 678, 10);
		frame.getContentPane().add(separator);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(49, 670, 246, 246);
		frame.getContentPane().add(panel);
		
		JLabel lblcuntaCantidadHas = new JLabel("¿Cuánta cantidad has consumido?");
		lblcuntaCantidadHas.setFont(new Font("Dialog", Font.BOLD, 16));
		lblcuntaCantidadHas.setBounds(49, 79, 280, 32);
		frame.getContentPane().add(lblcuntaCantidadHas);
		
		JSpinner n_veces = new JSpinner();
		n_veces.setFont(new Font("Dialog", Font.BOLD, 16));
		n_veces.setBounds(388, 79, 88, 32);
		frame.getContentPane().add(n_veces);
		
		JButton btnComprobarResultados = new JButton("Comprobar resultados");
		btnComprobarResultados.setFont(new Font("Dialog", Font.BOLD, 16));
		btnComprobarResultados.setBounds(756, 871, 514, 45);
		frame.getContentPane().add(btnComprobarResultados);
		
		JButton btnAnyadir = new JButton("Añadir");
		btnAnyadir.setFont(new Font("Dialog", Font.BOLD, 16));
		btnAnyadir.setBounds(517, 79, 192, 32);
		frame.getContentPane().add(btnAnyadir);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.BLACK);
		separator_2.setBounds(38, 648, 678, 10);
		frame.getContentPane().add(separator_2);
		
		JLabel lblValor_1 = new JLabel("0");
		lblValor_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblValor_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblValor_1.setBounds(477, 169, 171, 32);
		frame.getContentPane().add(lblValor_1);
		
		JLabel lblEnergtico_1 = new JLabel("0");
		lblEnergtico_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEnergtico_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblEnergtico_1.setBounds(477, 197, 171, 32);
		frame.getContentPane().add(lblEnergtico_1);
		
		JLabel lblGrasas_1 = new JLabel("0");
		lblGrasas_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblGrasas_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblGrasas_1.setBounds(477, 244, 171, 32);
		frame.getContentPane().add(lblGrasas_1);
		
		JLabel lblSaturadas_1 = new JLabel("0");
		lblSaturadas_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSaturadas_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblSaturadas_1.setBounds(477, 270, 171, 32);
		frame.getContentPane().add(lblSaturadas_1);
		
		JLabel lblHidratosDeCarbono_1 = new JLabel("0");
		lblHidratosDeCarbono_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblHidratosDeCarbono_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblHidratosDeCarbono_1.setBounds(477, 314, 171, 32);
		frame.getContentPane().add(lblHidratosDeCarbono_1);
		
		JLabel lblAzcar_1 = new JLabel("0");
		lblAzcar_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAzcar_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblAzcar_1.setBounds(477, 341, 171, 32);
		frame.getContentPane().add(lblAzcar_1);
		
		JLabel lblProtenas_1 = new JLabel("0");
		lblProtenas_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblProtenas_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblProtenas_1.setBounds(477, 385, 171, 32);
		frame.getContentPane().add(lblProtenas_1);
		
		JLabel lblSal_1 = new JLabel("0");
		lblSal_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSal_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblSal_1.setBounds(477, 428, 171, 32);
		frame.getContentPane().add(lblSal_1);
		
		JLabel lblCalcio_1 = new JLabel("0");
		lblCalcio_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCalcio_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblCalcio_1.setBounds(477, 472, 171, 32);
		frame.getContentPane().add(lblCalcio_1);
		
		JLabel lblFibra_1 = new JLabel("0");
		lblFibra_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFibra_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblFibra_1.setBounds(477, 516, 171, 32);
		frame.getContentPane().add(lblFibra_1);
		
		JLabel lblPotasio_1 = new JLabel("0");
		lblPotasio_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPotasio_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblPotasio_1.setBounds(477, 560, 171, 32);
		frame.getContentPane().add(lblPotasio_1);
		
		JLabel lblHierro_1 = new JLabel("0");
		lblHierro_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblHierro_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblHierro_1.setBounds(477, 604, 171, 32);
		frame.getContentPane().add(lblHierro_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.LIGHT_GRAY);
		separator_1.setBounds(49, 233, 660, 10);
		frame.getContentPane().add(separator_1);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(Color.LIGHT_GRAY);
		separator_3.setBounds(49, 305, 660, 10);
		frame.getContentPane().add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setForeground(Color.LIGHT_GRAY);
		separator_4.setBounds(49, 376, 660, 10);
		frame.getContentPane().add(separator_4);
		
		JSeparator separator_3_1 = new JSeparator();
		separator_3_1.setForeground(Color.LIGHT_GRAY);
		separator_3_1.setBounds(49, 428, 660, 2);
		frame.getContentPane().add(separator_3_1);
		
		JSeparator separator_4_1 = new JSeparator();
		separator_4_1.setForeground(Color.LIGHT_GRAY);
		separator_4_1.setBounds(49, 505, 660, 10);
		frame.getContentPane().add(separator_4_1);
		
		JSeparator separator_4_1_1 = new JSeparator();
		separator_4_1_1.setForeground(Color.LIGHT_GRAY);
		separator_4_1_1.setBounds(49, 463, 660, 10);
		frame.getContentPane().add(separator_4_1_1);
		
		JSeparator separator_4_1_2 = new JSeparator();
		separator_4_1_2.setForeground(Color.LIGHT_GRAY);
		separator_4_1_2.setBounds(49, 549, 660, 10);
		frame.getContentPane().add(separator_4_1_2);
		
		JSeparator separator_4_1_3 = new JSeparator();
		separator_4_1_3.setForeground(Color.LIGHT_GRAY);
		separator_4_1_3.setBounds(49, 594, 660, 10);
		frame.getContentPane().add(separator_4_1_3);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setForeground(Color.BLACK);
		separator_5.setBounds(756, 23, 514, 10);
		frame.getContentPane().add(separator_5);
		
		JSeparator separator_5_2 = new JSeparator();
		separator_5_2.setOrientation(SwingConstants.VERTICAL);
		separator_5_2.setForeground(Color.BLACK);
		separator_5_2.setBounds(756, 23, 17, 813);
		frame.getContentPane().add(separator_5_2);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setForeground(Color.BLACK);
		separator_6.setOrientation(SwingConstants.VERTICAL);
		separator_6.setBounds(1268, 23, 25, 813);
		frame.getContentPane().add(separator_6);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setForeground(Color.BLACK);
		separator_7.setBounds(756, 836, 513, 20);
		frame.getContentPane().add(separator_7);
		
		JLabel lblGramos = new JLabel("g");
		lblGramos.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblGramos.setBounds(671, 244, 38, 32);
		frame.getContentPane().add(lblGramos);
		
		JLabel lblGramos_1 = new JLabel("g");
		lblGramos_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblGramos_1.setBounds(671, 270, 38, 32);
		frame.getContentPane().add(lblGramos_1);
		
		JLabel lblGramos_2 = new JLabel("g");
		lblGramos_2.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblGramos_2.setBounds(671, 314, 38, 32);
		frame.getContentPane().add(lblGramos_2);
		
		JLabel lblGramos_3 = new JLabel("g");
		lblGramos_3.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblGramos_3.setBounds(671, 341, 38, 32);
		frame.getContentPane().add(lblGramos_3);
		
		JLabel lblGramos_4 = new JLabel("g");
		lblGramos_4.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblGramos_4.setBounds(671, 385, 38, 32);
		frame.getContentPane().add(lblGramos_4);
		
		JLabel lblGramos_5 = new JLabel("g");
		lblGramos_5.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblGramos_5.setBounds(671, 428, 38, 32);
		frame.getContentPane().add(lblGramos_5);
		
		JLabel lblGramos_6 = new JLabel("g");
		lblGramos_6.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblGramos_6.setBounds(671, 472, 38, 32);
		frame.getContentPane().add(lblGramos_6);
		
		JLabel lblMiliGramos_1 = new JLabel("mg");
		lblMiliGramos_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblMiliGramos_1.setBounds(671, 560, 38, 32);
		frame.getContentPane().add(lblMiliGramos_1);
		
		JLabel lblMiliGramos_2 = new JLabel("mg");
		lblMiliGramos_2.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblMiliGramos_2.setBounds(671, 604, 38, 32);
		frame.getContentPane().add(lblMiliGramos_2);
		
		JLabel lblMiliGramos = new JLabel("mg");
		lblMiliGramos.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblMiliGramos.setBounds(671, 516, 38, 32);
		frame.getContentPane().add(lblMiliGramos);
		
		JLabel lblKiloCalorias = new JLabel("Kcal");
		lblKiloCalorias.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblKiloCalorias.setBounds(671, 169, 38, 32);
		frame.getContentPane().add(lblKiloCalorias);
		
		JEditorPane txtAlimentosElegidos = new JEditorPane();
		txtAlimentosElegidos.setEditable(false);
		txtAlimentosElegidos.setBackground(FONDO_COLOR);
		txtAlimentosElegidos.setBounds(801, 79, 233, 726);
		frame.getContentPane().add(txtAlimentosElegidos);
		
		JEditorPane txtCantidadesElegidas = new JEditorPane();
		txtCantidadesElegidas.setEditable(false);
		txtCantidadesElegidas.setBounds(1085, 79, 154, 726);
		txtCantidadesElegidas.setBackground(FONDO_COLOR);
		frame.getContentPane().add(txtCantidadesElegidas);
		
		JLabel lblKiloJulios = new JLabel("KJ");
		lblKiloJulios.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblKiloJulios.setBounds(671, 197, 38, 32);
		frame.getContentPane().add(lblKiloJulios);
		
		JLabel lblCantidad = new JLabel("Cantidades");
		lblCantidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblCantidad.setFont(new Font("Dialog", Font.BOLD, 18));
		lblCantidad.setBounds(1075, 34, 160, 32);
		frame.getContentPane().add(lblCantidad);

		JLabel lblAlimentoElegido = new JLabel("Alimentos elegidos");
		lblAlimentoElegido.setHorizontalAlignment(SwingConstants.CENTER);
		lblAlimentoElegido.setFont(new Font("Dialog", Font.BOLD, 18));
		lblAlimentoElegido.setBounds(791, 37, 243, 26);
		frame.getContentPane().add(lblAlimentoElegido);

		txtFondoColor = new JTextField();
		txtFondoColor.setEditable(false);
		txtFondoColor.setBackground(FONDO_COLOR);
		txtFondoColor.setBounds(756, 23, 514, 813);
		frame.getContentPane().add(txtFondoColor);
		txtFondoColor.setColumns(10);
		
		JTextPane textConsejo = new JTextPane();
		textConsejo.setFont(new Font("Dialog", Font.PLAIN, 14));
		textConsejo.setBackground(FONDO_COLOR);
		textConsejo.setBounds(307, 670, 402, 246);
		frame.getContentPane().add(textConsejo);
		
		textConsejo.setText("CONSEJO NUTRICIONAL\n\nTodas las células del cuerpo necesitan de agua para funcionar, por eso es esencial ingerir suficiente. Una adecuada hidratación te puede ayudar a mejorar tu digestión, la función de tus riñones y lucir una piel más hidratada.\n\nLo ideal es que consumas 2,7 litros de agua potable al día si eres mujer y 3,7 si eres hombre. Aquí se incluye el agua de los alimentos, que representa aproximadamente un 20% del total.");
	}
}
