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

public class CalculoNutritivo {

	private JFrame frame;
	private JTextField textField;

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
		frame.setBounds(100, 100, 1482, 987);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JComboBox comboBox = new JComboBox();
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
		
		JLabel lblVitaminasLetrero = new JLabel("Vitaminas");
		lblVitaminasLetrero.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblVitaminasLetrero.setBounds(49, 516, 192, 32);
		frame.getContentPane().add(lblVitaminasLetrero);
		
		JLabel lblOmegaLetrero = new JLabel("Omega3");
		lblOmegaLetrero.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblOmegaLetrero.setBounds(49, 560, 192, 32);
		frame.getContentPane().add(lblOmegaLetrero);
		
		JLabel lblHierroLetrero = new JLabel("Hierro");
		lblHierroLetrero.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblHierroLetrero.setBounds(49, 604, 192, 32);
		frame.getContentPane().add(lblHierroLetrero);
		
		JLabel lblPorg = new JLabel("por 100g");
		lblPorg.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPorg.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblPorg.setBounds(621, 136, 88, 32);
		frame.getContentPane().add(lblPorg);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(38, 123, 678, 10);
		frame.getContentPane().add(separator);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(49, 670, 246, 246);
		frame.getContentPane().add(panel);
		
		JLabel lblConsejoDelDia = new JLabel("Consejo del dia");
		lblConsejoDelDia.setBounds(333, 670, 376, 246);
		frame.getContentPane().add(lblConsejoDelDia);
		
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
		btnComprobarResultados.setBounds(927, 871, 514, 45);
		frame.getContentPane().add(btnComprobarResultados);
		
		JButton btnComprobarResultados_1 = new JButton("Añadir");
		btnComprobarResultados_1.setFont(new Font("Dialog", Font.BOLD, 16));
		btnComprobarResultados_1.setBounds(517, 79, 192, 32);
		frame.getContentPane().add(btnComprobarResultados_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.BLACK);
		separator_2.setBounds(38, 648, 678, 10);
		frame.getContentPane().add(separator_2);
		
		JLabel lblValor_1 = new JLabel("0");
		lblValor_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblValor_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblValor_1.setBounds(488, 169, 192, 32);
		frame.getContentPane().add(lblValor_1);
		
		JLabel lblEnergtico_1 = new JLabel("0");
		lblEnergtico_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblEnergtico_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblEnergtico_1.setBounds(488, 197, 192, 32);
		frame.getContentPane().add(lblEnergtico_1);
		
		JLabel lblGrasas_1 = new JLabel("0");
		lblGrasas_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblGrasas_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblGrasas_1.setBounds(488, 244, 192, 32);
		frame.getContentPane().add(lblGrasas_1);
		
		JLabel lblSaturadas_1 = new JLabel("0");
		lblSaturadas_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblSaturadas_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblSaturadas_1.setBounds(524, 270, 192, 32);
		frame.getContentPane().add(lblSaturadas_1);
		
		JLabel lblHidratosDeCarbono_1 = new JLabel("0");
		lblHidratosDeCarbono_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblHidratosDeCarbono_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblHidratosDeCarbono_1.setBounds(488, 314, 192, 32);
		frame.getContentPane().add(lblHidratosDeCarbono_1);
		
		JLabel lblAzcar_1 = new JLabel("0");
		lblAzcar_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblAzcar_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblAzcar_1.setBounds(524, 341, 192, 32);
		frame.getContentPane().add(lblAzcar_1);
		
		JLabel lblProtenas_1 = new JLabel("0");
		lblProtenas_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblProtenas_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblProtenas_1.setBounds(488, 385, 192, 32);
		frame.getContentPane().add(lblProtenas_1);
		
		JLabel lblSal_1 = new JLabel("0");
		lblSal_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblSal_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblSal_1.setBounds(488, 428, 192, 32);
		frame.getContentPane().add(lblSal_1);
		
		JLabel lblCalcio_1 = new JLabel("0");
		lblCalcio_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblCalcio_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblCalcio_1.setBounds(488, 472, 192, 32);
		frame.getContentPane().add(lblCalcio_1);
		
		JLabel lblVitaminas_1 = new JLabel("0");
		lblVitaminas_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblVitaminas_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblVitaminas_1.setBounds(488, 516, 192, 32);
		frame.getContentPane().add(lblVitaminas_1);
		
		JLabel lblOmega_1 = new JLabel("0");
		lblOmega_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblOmega_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblOmega_1.setBounds(488, 560, 192, 32);
		frame.getContentPane().add(lblOmega_1);
		
		JLabel lblHierro_1 = new JLabel("0");
		lblHierro_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblHierro_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblHierro_1.setBounds(488, 604, 192, 32);
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
		separator_3_1.setBounds(49, 420, 667, 10);
		frame.getContentPane().add(separator_3_1);
		
		JSeparator separator_4_1 = new JSeparator();
		separator_4_1.setForeground(Color.LIGHT_GRAY);
		separator_4_1.setBounds(49, 505, 667, 10);
		frame.getContentPane().add(separator_4_1);
		
		JSeparator separator_4_1_1 = new JSeparator();
		separator_4_1_1.setForeground(Color.LIGHT_GRAY);
		separator_4_1_1.setBounds(49, 463, 667, 10);
		frame.getContentPane().add(separator_4_1_1);
		
		JSeparator separator_4_1_2 = new JSeparator();
		separator_4_1_2.setForeground(Color.LIGHT_GRAY);
		separator_4_1_2.setBounds(49, 549, 667, 10);
		frame.getContentPane().add(separator_4_1_2);
		
		JSeparator separator_4_1_3 = new JSeparator();
		separator_4_1_3.setForeground(Color.LIGHT_GRAY);
		separator_4_1_3.setBounds(49, 594, 667, 10);
		frame.getContentPane().add(separator_4_1_3);
		
		JLabel lblAlimentoElegido = new JLabel("Alimentos elegidos");
		lblAlimentoElegido.setFont(new Font("Dialog", Font.BOLD, 18));
		lblAlimentoElegido.setBounds(962, 45, 192, 32);
		frame.getContentPane().add(lblAlimentoElegido);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setForeground(Color.BLACK);
		separator_5.setBounds(927, 23, 514, 10);
		frame.getContentPane().add(separator_5);
		
		JSeparator separator_5_1 = new JSeparator();
		separator_5_1.setForeground(Color.BLACK);
		separator_5_1.setBounds(927, 836, 514, 10);
		frame.getContentPane().add(separator_5_1);
		
		JSeparator separator_5_2 = new JSeparator();
		separator_5_2.setOrientation(SwingConstants.VERTICAL);
		separator_5_2.setForeground(Color.BLACK);
		separator_5_2.setBounds(927, 23, 17, 813);
		frame.getContentPane().add(separator_5_2);
		
		JSeparator separator_5_2_1 = new JSeparator();
		separator_5_2_1.setOrientation(SwingConstants.VERTICAL);
		separator_5_2_1.setForeground(Color.BLACK);
		separator_5_2_1.setBounds(1441, 23, 8, 813);
		frame.getContentPane().add(separator_5_2_1);
		
		JLabel lblCantidad = new JLabel("Cantidades");
		lblCantidad.setFont(new Font("Dialog", Font.BOLD, 18));
		lblCantidad.setBounds(1276, 45, 115, 32);
		frame.getContentPane().add(lblCantidad);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(962, 104, 447, 698);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	}
}
