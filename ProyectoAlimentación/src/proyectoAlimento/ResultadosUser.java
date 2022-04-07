package proyectoAlimento;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

public class ResultadosUser {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void resultados(String[] args) {
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
		frame.setBounds(100, 100, 780, 541);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblEstosSonTus = new JLabel("!Estos son tus resultados respecto al Cálculo Nutritivo :D!");
		lblEstosSonTus.setFont(new Font("Dialog", Font.BOLD, 16));
		lblEstosSonTus.setBounds(151, 12, 467, 17);
		frame.getContentPane().add(lblEstosSonTus);
	}
}
