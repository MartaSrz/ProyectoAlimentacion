import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Font;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class TrabajoExamenes {

	private JFrame frmRellenarNotas;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TrabajoExamenes window = new TrabajoExamenes();
					window.frmRellenarNotas.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TrabajoExamenes() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRellenarNotas = new JFrame();
		frmRellenarNotas.getContentPane().setBackground(UIManager.getColor("CheckBox.focus"));
		frmRellenarNotas.getContentPane().setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"FOL", "Entornos de Desarrollo", "Sistemas Informáticos", "Programación", "Bases de Datos", "Lenguaje de Marcas"}));
		comboBox.setBounds(355, 26, 161, 26);
		frmRellenarNotas.getContentPane().add(comboBox);
		
		JLabel lblEscogeLaAssignatura = new JLabel("Escoge la assignatura correspondiente:");
		lblEscogeLaAssignatura.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblEscogeLaAssignatura.setBounds(26, 21, 311, 33);
		frmRellenarNotas.getContentPane().add(lblEscogeLaAssignatura);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBackground(Color.BLACK);
		separator.setForeground(Color.BLACK);
		separator.setBounds(541, 111, 13, 322);
		frmRellenarNotas.getContentPane().add(separator);
		
		JLabel lblTipoTest = new JLabel("TIPO TEST:");
		lblTipoTest.setFont(new Font("Dialog", Font.BOLD, 16));
		lblTipoTest.setBounds(26, 128, 240, 17);
		frmRellenarNotas.getContentPane().add(lblTipoTest);
		
		JLabel lblValorAcertadas = new JLabel("Valor acertadas:");
		lblValorAcertadas.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblValorAcertadas.setBounds(311, 176, 130, 33);
		frmRellenarNotas.getContentPane().add(lblValorAcertadas);
		
		JLabel lblValorFalladas = new JLabel("Valor falladas:");
		lblValorFalladas.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblValorFalladas.setBounds(311, 234, 120, 33);
		frmRellenarNotas.getContentPane().add(lblValorFalladas);
		
		JLabel lblNmeroAcertadas = new JLabel("Número acertadas:");
		lblNmeroAcertadas.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNmeroAcertadas.setBounds(26, 234, 146, 33);
		frmRellenarNotas.getContentPane().add(lblNmeroAcertadas);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(189, 178, 49, 33);
		frmRellenarNotas.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setColumns(10);
		textField_1.setBounds(189, 236, 49, 33);
		frmRellenarNotas.getContentPane().add(textField_1);
		
		JLabel lblNmeroFalladas = new JLabel("Número falladas:");
		lblNmeroFalladas.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNmeroFalladas.setBounds(26, 176, 146, 33);
		frmRellenarNotas.getContentPane().add(lblNmeroFalladas);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setColumns(10);
		textField_2.setBounds(189, 294, 49, 33);
		frmRellenarNotas.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setColumns(10);
		textField_3.setBounds(449, 178, 49, 33);
		frmRellenarNotas.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setColumns(10);
		textField_4.setBounds(449, 236, 49, 33);
		frmRellenarNotas.getContentPane().add(textField_4);
		
		JLabel lblNmeroEnBlanco = new JLabel("Número en blanco:");
		lblNmeroEnBlanco.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNmeroEnBlanco.setBounds(26, 294, 146, 33);
		frmRellenarNotas.getContentPane().add(lblNmeroEnBlanco);
		
		JLabel lblquPorcentageVale = new JLabel("¿Qué porcentage vale el tipo test?");
		lblquPorcentageVale.setFont(new Font("Dialog", Font.BOLD, 16));
		lblquPorcentageVale.setBounds(26, 350, 293, 26);
		frmRellenarNotas.getContentPane().add(lblquPorcentageVale);
		
		textField_5 = new JTextField();
		textField_5.setBounds(372, 351, 69, 29);
		frmRellenarNotas.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JButton testMas = new JButton("+");
		testMas.setBounds(311, 352, 49, 27);
		frmRellenarNotas.getContentPane().add(testMas);
		
		JButton testMenos = new JButton("-");
		testMenos.setBounds(449, 352, 49, 27);
		frmRellenarNotas.getContentPane().add(testMenos);
		frmRellenarNotas.setFont(new Font("Dialog", Font.PLAIN, 17));
		frmRellenarNotas.setTitle("Rellenar notas");
		frmRellenarNotas.setBounds(100, 100, 1482, 982);
		frmRellenarNotas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
