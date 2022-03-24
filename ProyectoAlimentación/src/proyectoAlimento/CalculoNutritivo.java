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

public class CalculoNutritivo {

	private JFrame frame;

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
		
		JLabel lblValor = new JLabel("Valor");
		lblValor.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblValor.setBounds(49, 169, 192, 32);
		frame.getContentPane().add(lblValor);
		
		JLabel lblEnergtico = new JLabel("energético");
		lblEnergtico.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblEnergtico.setBounds(49, 197, 192, 32);
		frame.getContentPane().add(lblEnergtico);
		
		JLabel lblGrasas = new JLabel("Grasas");
		lblGrasas.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblGrasas.setBounds(49, 244, 192, 32);
		frame.getContentPane().add(lblGrasas);
		
		JLabel lblSaturadas = new JLabel("Saturadas");
		lblSaturadas.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblSaturadas.setBounds(85, 270, 192, 32);
		frame.getContentPane().add(lblSaturadas);
		
		JLabel lblHidratosDeCarbono = new JLabel("Hidratos de carbono");
		lblHidratosDeCarbono.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblHidratosDeCarbono.setBounds(85, 297, 192, 32);
		frame.getContentPane().add(lblHidratosDeCarbono);
		
		JLabel lblAzcar = new JLabel("Azúcar");
		lblAzcar.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblAzcar.setBounds(49, 341, 192, 32);
		frame.getContentPane().add(lblAzcar);
		
		JLabel lblProtenas = new JLabel("Proteínas");
		lblProtenas.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblProtenas.setBounds(49, 385, 192, 32);
		frame.getContentPane().add(lblProtenas);
		
		JLabel lblSal = new JLabel("Sal");
		lblSal.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblSal.setBounds(49, 428, 192, 32);
		frame.getContentPane().add(lblSal);
		
		JLabel lblCalcio = new JLabel("Calcio");
		lblCalcio.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblCalcio.setBounds(49, 472, 192, 32);
		frame.getContentPane().add(lblCalcio);
		
		JLabel lblVitaminas = new JLabel("Vitaminas");
		lblVitaminas.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblVitaminas.setBounds(49, 516, 192, 32);
		frame.getContentPane().add(lblVitaminas);
		
		JLabel lblOmega = new JLabel("Omega3");
		lblOmega.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblOmega.setBounds(49, 560, 192, 32);
		frame.getContentPane().add(lblOmega);
		
		JLabel lblHierro = new JLabel("Hierro");
		lblHierro.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblHierro.setBounds(49, 604, 192, 32);
		frame.getContentPane().add(lblHierro);
		
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
		lblConsejoDelDia.setBounds(333, 670, 376, 260);
		frame.getContentPane().add(lblConsejoDelDia);
		
		JLabel lblcuntaCantidadHas = new JLabel("¿Cuánta cantidad has consumido?");
		lblcuntaCantidadHas.setFont(new Font("Dialog", Font.BOLD, 16));
		lblcuntaCantidadHas.setBounds(49, 79, 280, 32);
		frame.getContentPane().add(lblcuntaCantidadHas);
		
		JSpinner spinner = new JSpinner();
		spinner.setFont(new Font("Dialog", Font.BOLD, 16));
		spinner.setBounds(388, 79, 88, 32);
		frame.getContentPane().add(spinner);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(927, 23, 522, 836);
		frame.getContentPane().add(panel_1);
		
		JButton btnComprobarResultados = new JButton("Comprobar resultados");
		btnComprobarResultados.setFont(new Font("Dialog", Font.BOLD, 16));
		btnComprobarResultados.setBounds(927, 871, 522, 45);
		frame.getContentPane().add(btnComprobarResultados);
		
		JButton btnComprobarResultados_1 = new JButton("Añadir");
		btnComprobarResultados_1.setFont(new Font("Dialog", Font.BOLD, 16));
		btnComprobarResultados_1.setBounds(517, 79, 192, 32);
		frame.getContentPane().add(btnComprobarResultados_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.BLACK);
		separator_2.setBounds(38, 648, 678, 10);
		frame.getContentPane().add(separator_2);
	}
}
