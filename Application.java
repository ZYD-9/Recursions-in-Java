import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Label;
import java.awt.Rectangle;
import java.awt.Button;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Application {

	private JFrame frame;
	private JTextField tfFibonacci,tfLucas,tfTribonacci;
	private JTextField tfEuclidean_1;
	private JTextField tfCollatz;
	private JTextField tfEuclidean_2;
	private JTextField pascal_textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Application window = new Application();
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
	public Application() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 483, 578);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 433, 531);
		frame.getContentPane().add(layeredPane);
		CardLayout cardLayout = new CardLayout(0,0);
		layeredPane.setLayout(cardLayout);
		
		JPanel panelHome = new JPanel();
		layeredPane.add(panelHome, "1");
		panelHome.setLayout(null);
		
		Label label = new Label("Group Members:");
		label.setFont(new Font("Dialog", Font.BOLD, 11));
		label.setBounds(10, 10, 164, 22);
		panelHome.add(label);
		
		Label label_1 = new Label("Carlos, Atthaleen");
		label_1.setBounds(38, 38, 97, 22);
		panelHome.add(label_1);
		
		Label label_1_1 = new Label("Carunungan, Justine Louise");
		label_1_1.setBounds(38, 55, 281, 22);
		panelHome.add(label_1_1);
		
		Label label_1_2 = new Label("Lanaban, Novem");
		label_1_2.setBounds(38, 75, 95, 22);
		panelHome.add(label_1_2);
		
		Label label_1_3 = new Label("Zabala, Marielle");
		label_1_3.setBounds(38, 98, 89, 22);
		panelHome.add(label_1_3);
		
		Label label_2 = new Label("Recursions");
		label_2.setFont(new Font("Dialog", Font.BOLD, 11));
		label_2.setBounds(163, 132, 112, 22);
		label_2.setAlignment(Label.CENTER);
		panelHome.add(label_2);
		
		Button btnFibonacci = new Button("Fibonacci Numbers");
		btnFibonacci.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(layeredPane, "Fibonacci");
			}
		});
		btnFibonacci.setBounds(84, 165, 236, 22);
		panelHome.add(btnFibonacci);
		
		Button btnLucas = new Button("Lucas Numbers");
		btnLucas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(layeredPane, "Lucas");
			}
		});
		btnLucas.setBounds(84, 193, 236, 22);
		panelHome.add(btnLucas);
		
		Button btnTribonacci = new Button("Tribonacci Numbers");
		btnTribonacci.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(layeredPane, "Tribonacci");
			}
			
		});
		btnTribonacci.setBounds(84, 223, 236, 22);
		panelHome.add(btnTribonacci);
		
		Button btnCollatz = new Button("Collatz Sequence");
		btnCollatz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(layeredPane, "Collatz");
			}
		});
		btnCollatz.setBounds(83, 251, 236, 22);
		panelHome.add(btnCollatz);

		Button btnEuclidean = new Button("Euclidean Algorithm");
		btnEuclidean.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(layeredPane, "Euclidean");
			}
		});
		
		btnEuclidean.setBounds(84, 279, 236, 22);
		panelHome.add(btnEuclidean);
		
		Button btnPascal = new Button("Pascal Triangle");
		btnPascal.setBounds(84, 307, 236, 22);
		btnPascal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(layeredPane, "Pascal");
			}
		});
		panelHome.add(btnPascal);
		JPanel panelFibonacci = new JPanel();
		layeredPane.add(panelFibonacci, "Fibonacci");
		panelFibonacci.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("FIBONACCI NUMBERS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(33, 43, 225, 14);
		panelFibonacci.add(lblNewLabel);
		
		
		JLabel lblNewLabel_1 = new JLabel("Input the count of the Fibonacci numbers Fn");
		lblNewLabel_1.setBounds(35, 210, 282, 14);
		panelFibonacci.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("For 0 ≤ n ≤ ");
		lblNewLabel_2.setBounds(35, 240, 109, 14);
		panelFibonacci.add(lblNewLabel_2);
		
		tfFibonacci = new JTextField();
		tfFibonacci.setBounds(100, 234, 160, 20);
		panelFibonacci.add(tfFibonacci);
		tfFibonacci.setColumns(10);
		
		
		JButton btnBackFibonacci = new JButton("Back");
		btnBackFibonacci.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(layeredPane, "1");
			}
		});
		btnBackFibonacci.setBounds(10, 10, 89, 23);
		panelFibonacci.add(btnBackFibonacci);
		
		JButton btnClearFibonacci = new JButton("clear");

		btnClearFibonacci.setBounds(272, 232, 89, 23);
		panelFibonacci.add(btnClearFibonacci);
		
		JButton btnGenerateFibonacci = new JButton("GENERATE");
		btnGenerateFibonacci.setBounds(100, 261, 128, 23);
		panelFibonacci.add(btnGenerateFibonacci);
		
		JScrollPane scrollFibonacci = new JScrollPane(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollFibonacci.setBounds(33, 294, 328, 100);
		panelFibonacci.add(scrollFibonacci);
		
		JTextArea textArea_Fibonacci = new JTextArea();
		textArea_Fibonacci.setWrapStyleWord(true);
		textArea_Fibonacci.setLineWrap(true);
		textArea_Fibonacci.setEditable(true);
		textArea_Fibonacci.setBounds(new Rectangle(0, 0, 415, 243));
		textArea_Fibonacci.setBounds(0, 0, 396, 241);
		scrollFibonacci.setViewportView(textArea_Fibonacci);
		
		JLabel lblIsASequence = new JLabel("is a sequence of numbers in which each successive number in the sequence");
		lblIsASequence.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblIsASequence.setBounds(33, 67, 372, 23);
		panelFibonacci.add(lblIsASequence);
		
		JLabel lblIsASequence_1 = new JLabel("obtained by adding the two previous numbers in the sequence.");
		lblIsASequence_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblIsASequence_1.setBounds(33, 88, 342, 23);
		panelFibonacci.add(lblIsASequence_1);
		
		JLabel lblIsASequence_1_1 = new JLabel("The Fibonacci Numbers Fn have the initial values F0 = 0, F1 = 1");
		lblIsASequence_1_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblIsASequence_1_1.setBounds(33, 125, 424, 23);
		panelFibonacci.add(lblIsASequence_1_1);
		
		JLabel lblIsASequence_1_1_1 = new JLabel("Fn = Fn−1 + Fn−2");
		lblIsASequence_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblIsASequence_1_1_1.setBounds(33, 177, 128, 23);
		panelFibonacci.add(lblIsASequence_1_1_1);
		
		JLabel lblIsASequence_1_1_1_1 = new JLabel("If n ≥ 2");
		lblIsASequence_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblIsASequence_1_1_1_1.setBounds(144, 177, 135, 23);
		panelFibonacci.add(lblIsASequence_1_1_1_1);
		
		JLabel lblIsASequence_1_1_1_2 = new JLabel("Formula of the recursion:");
		lblIsASequence_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblIsASequence_1_1_1_2.setBounds(33, 154, 128, 23);
		panelFibonacci.add(lblIsASequence_1_1_1_2);
		
		JPanel panelLucas = new JPanel();
		layeredPane.add(panelLucas, "Lucas");
		panelLucas.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("LUCAS NUMBERS");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(31, 45, 143, 14);
		panelLucas.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel(" Input the count of numbers of Ln");
		lblNewLabel_1_2.setBounds(31, 214, 328, 14);
		panelLucas.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("For n ≤ 0 ≤ ");
		lblNewLabel_2_3.setBounds(31, 238, 157, 14);
		panelLucas.add(lblNewLabel_2_3);
		
		tfLucas = new JTextField();
		tfLucas.setBounds(129, 236, 130, 20);
		panelLucas.add(tfLucas);
		tfLucas.setColumns(10);
		
		JButton btnBackLucas = new JButton("Back");
		btnBackLucas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(layeredPane, "1");
			}
		});
		
		btnBackLucas.setBounds(10, 11, 89, 23);
		panelLucas.add(btnBackLucas);
		
		JButton btnClearLucas = new JButton("clear");
		btnClearLucas.setBounds(270, 234, 89, 23);
		panelLucas.add(btnClearLucas);
		
		JButton btnGenerateLucas = new JButton("GENERATE");
		btnGenerateLucas.setBounds(129, 261, 131, 23);
		panelLucas.add(btnGenerateLucas);
		
		JScrollPane scrollLucas = new JScrollPane(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollLucas.setBounds(31, 294, 328, 100);
		panelLucas.add(scrollLucas);
		
		JTextArea textArea_Lucas = new JTextArea();
		textArea_Lucas.setWrapStyleWord(true);
		textArea_Lucas.setLineWrap(true);
		textArea_Lucas.setEditable(true);
		textArea_Lucas.setBounds(new Rectangle(0, 0, 415, 243));
		textArea_Lucas.setBounds(0, 0, 396, 241);
		
		scrollLucas.setViewportView(textArea_Lucas);
		
		
		
		JLabel lblIsASequence_2 = new JLabel("The Lucas numbers or Lucas series\r\nare an integer sequence named after\r\n");
		lblIsASequence_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblIsASequence_2.setBounds(31, 69, 615, 23);
		panelLucas.add(lblIsASequence_2);
		
		JLabel lblIsASequence_2_1 = new JLabel("the mathematician François Édouard Anatole Lucas (1842-1891)");
		lblIsASequence_2_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblIsASequence_2_1.setBounds(31, 85, 366, 23);
		panelLucas.add(lblIsASequence_2_1);
		
		JLabel lblIsASequence_2_1_1 = new JLabel("The Lucas Numbers Ln have the initial values of L0 = 2 , L1 = 1");
		lblIsASequence_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblIsASequence_2_1_1.setBounds(31, 118, 366, 23);
		panelLucas.add(lblIsASequence_2_1_1);
		
		JLabel lblIsASequence_1_1_1_2_1 = new JLabel("Formula of the recursion:");
		lblIsASequence_1_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblIsASequence_1_1_1_2_1.setBounds(31, 148, 128, 23);
		panelLucas.add(lblIsASequence_1_1_1_2_1);
		
		JLabel lblIsASequence_1_1_1_2_1_1 = new JLabel("Ln = Ln-1 + Ln-2");
		lblIsASequence_1_1_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblIsASequence_1_1_1_2_1_1.setBounds(31, 173, 128, 23);
		panelLucas.add(lblIsASequence_1_1_1_2_1_1);
		
		JLabel lblIsASequence_1_1_1_2_1_1_1 = new JLabel("If n ≥ 2");
		lblIsASequence_1_1_1_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblIsASequence_1_1_1_2_1_1_1.setBounds(147, 173, 128, 23);
		panelLucas.add(lblIsASequence_1_1_1_2_1_1_1);
		
		
		
		JPanel panelTribonacci = new JPanel();
		layeredPane.add(panelTribonacci, "Tribonacci");
		panelTribonacci.setLayout(null);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("TRIBONACCI NUMBERS");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1_1.setBounds(31, 45, 254, 14);
		panelTribonacci.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Input the count of the Tribonacci numbers Tn");
		lblNewLabel_1_2_1.setBounds(31, 214, 328, 14);
		panelTribonacci.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("For n ≤ 0 ≤ ");
		lblNewLabel_2_3_1.setBounds(31, 238, 131, 14);
		panelTribonacci.add(lblNewLabel_2_3_1);
		
		tfTribonacci= new JTextField();
		tfTribonacci.setBounds(95, 236, 165, 20);
		panelTribonacci.add(tfTribonacci);
		tfTribonacci.setColumns(10);
		
		JButton btnBackTribonacci = new JButton("Back");
		btnBackTribonacci.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(layeredPane, "1");
			}
		});
		btnBackTribonacci.setBounds(10, 11, 89, 23);
		panelTribonacci.add(btnBackTribonacci);
		
		JButton btnClearTribonacci = new JButton("clear");
		btnClearTribonacci.setBounds(270, 234, 89, 23);
		panelTribonacci.add(btnClearTribonacci);
		
		JButton btnGenerateTribonacci = new JButton("GENERATE");
		btnGenerateTribonacci.setBounds(95, 261, 131, 23);
		panelTribonacci.add(btnGenerateTribonacci);

		
		JScrollPane scrollTribonacci = new JScrollPane(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollTribonacci.setBounds(31, 294, 328, 100);
		panelTribonacci.add(scrollTribonacci);
		
		JTextArea textArea_Tribonacci = new JTextArea();
		textArea_Tribonacci.setWrapStyleWord(true);
		textArea_Tribonacci.setLineWrap(true);
		textArea_Tribonacci.setEditable(true);
		textArea_Tribonacci.setBounds(new Rectangle(0, 0, 415, 243));
		textArea_Tribonacci.setBounds(0, 0, 396, 241);
		scrollTribonacci.setViewportView(textArea_Tribonacci);
		
		JLabel lblIsASequence_2_1_2 = new JLabel("The Tribonacci Numbers Tn have the initial values");
		lblIsASequence_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblIsASequence_2_1_2.setBounds(31, 114, 366, 23);
		panelTribonacci.add(lblIsASequence_2_1_2);
		
		JLabel lblIsASequence_2_1_2_1 = new JLabel("T0 = 0 , T1 = 0, T2 = 1");
		lblIsASequence_2_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblIsASequence_2_1_2_1.setBounds(31, 129, 366, 23);
		panelTribonacci.add(lblIsASequence_2_1_2_1);
		
		JLabel lblIsASequence_2_1_2_2 = new JLabel("The tribonacci sequence is a generalization of the Fibonacci sequence");
		lblIsASequence_2_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblIsASequence_2_1_2_2.setBounds(31, 61, 366, 23);
		panelTribonacci.add(lblIsASequence_2_1_2_2);
		
		JLabel lblIsASequence_2_1_2_2_1 = new JLabel("where each term is the sum of the three preceding terms.");
		lblIsASequence_2_1_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblIsASequence_2_1_2_2_1.setBounds(31, 81, 366, 23);
		panelTribonacci.add(lblIsASequence_2_1_2_2_1);
		
		JLabel lblIsASequence_1_1_1_2_1_2 = new JLabel("Formula of the recursion:");
		lblIsASequence_1_1_1_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblIsASequence_1_1_1_2_1_2.setBounds(31, 158, 128, 23);
		panelTribonacci.add(lblIsASequence_1_1_1_2_1_2);
		
		JLabel lblIsASequence_1_1_1_2_1_2_1 = new JLabel("Tn = Tn-1 + Tn-2 + + Tn-3");
		lblIsASequence_1_1_1_2_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblIsASequence_1_1_1_2_1_2_1.setBounds(31, 181, 128, 23);
		panelTribonacci.add(lblIsASequence_1_1_1_2_1_2_1);
		
		JLabel lblIsASequence_1_1_1_2_1_2_1_1 = new JLabel("If n ≥ 3");
		lblIsASequence_1_1_1_2_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblIsASequence_1_1_1_2_1_2_1_1.setBounds(179, 181, 128, 23);
		panelTribonacci.add(lblIsASequence_1_1_1_2_1_2_1_1);
		
		JPanel panelCollatz = new JPanel();
		panelCollatz.setLayout(null);
		layeredPane.add(panelCollatz, "Collatz");
		
		JLabel CollatzTitle = new JLabel("COLLATZ");
		CollatzTitle.setFont(new Font("Tahoma", Font.BOLD, 14));
		CollatzTitle.setBounds(31, 45, 254, 14);
		panelCollatz.add(CollatzTitle);
		
		JButton btnBackCollatz= new JButton("Back");
		btnBackCollatz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(layeredPane, "1");
			}
		});


		
		btnBackCollatz.setBounds(10, 11, 89, 23);
		panelCollatz.add(btnBackCollatz);
		
		JLabel Collatzdef = new JLabel("is a sequence of numbers relevant to the Collatz conjecture, which theorizes");
		Collatzdef.setFont(new Font("Tahoma", Font.PLAIN, 10));
		Collatzdef.setBounds(31, 69, 366, 23);
		panelCollatz.add(Collatzdef);
		
		JLabel Collatzdef_2 = new JLabel("that any number using this algorithm will eventually be reduced to 1.");
		Collatzdef_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		Collatzdef_2.setBounds(31, 94, 366, 23);
		panelCollatz.add(Collatzdef_2);
		
		JLabel Collatz_text_inputNum = new JLabel("Input a number:");
		Collatz_text_inputNum.setFont(new Font("Tahoma", Font.PLAIN, 10));
		Collatz_text_inputNum.setBounds(31, 168, 121, 23);
		panelCollatz.add(Collatz_text_inputNum);
		
		tfCollatz = new JTextField();
		tfCollatz.setColumns(10);
		tfCollatz.setBounds(31, 201, 165, 20);
		panelCollatz.add(tfCollatz);
		
		JButton btnGenerateCollatz = new JButton("GENERATE");
		btnGenerateCollatz.setBounds(31, 231, 131, 23);
		panelCollatz.add(btnGenerateCollatz);
		
		JButton btnClearCollatz = new JButton("clear");
		btnClearCollatz.setBounds(206, 200, 89, 23);
		panelCollatz.add(btnClearCollatz);
		
		JScrollPane scrollCollatz = new JScrollPane(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollCollatz.setBounds(31, 278, 328, 100);
		panelCollatz.add(scrollCollatz);
		
		JTextArea textArea_Collatz = new JTextArea();
		textArea_Collatz.setWrapStyleWord(true);
		textArea_Collatz.setLineWrap(true);
		textArea_Collatz.setEditable(true);
		scrollCollatz.setViewportView(textArea_Collatz);
		
		JPanel panelEuclidean = new JPanel();
		panelEuclidean.setLayout(null);
		layeredPane.add(panelEuclidean, "Euclidean");
		
		JLabel EuclideanTitle = new JLabel("EUCLIDEAN");
		EuclideanTitle.setFont(new Font("Tahoma", Font.BOLD, 14));
		EuclideanTitle.setBounds(31, 45, 254, 14);
		panelEuclidean.add(EuclideanTitle);
		
		JButton btnBackEuclidean = new JButton("Back");
		btnBackEuclidean.setBounds(10, 11, 89, 23);
		panelEuclidean.add(btnBackEuclidean);
		
		btnBackEuclidean.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(layeredPane, "1");
			}
		});
		
		JLabel Euclideandef = new JLabel("an efficient method for computing the greatest common divisor(GCD) ");
		Euclideandef.setFont(new Font("Tahoma", Font.PLAIN, 10));
		Euclideandef.setBounds(31, 61, 366, 23);
		panelEuclidean.add(Euclideandef);
		
		JLabel Euclideandef_2 = new JLabel("of two integers (numbers),  the largest number that divides");
		Euclideandef_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		Euclideandef_2.setBounds(31, 81, 366, 23);
		panelEuclidean.add(Euclideandef_2);
		
		JLabel Euclideandef_3 = new JLabel("them both without a remainder.");
		Euclideandef_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		Euclideandef_3.setBounds(31, 106, 366, 23);
		panelEuclidean.add(Euclideandef_3);
		
		JLabel Euclidean_text_inputNum = new JLabel("Input two numbers:");
		Euclidean_text_inputNum.setFont(new Font("Tahoma", Font.PLAIN, 10));
		Euclidean_text_inputNum.setBounds(31, 166, 264, 23);
		panelEuclidean.add(Euclidean_text_inputNum);
		
		tfEuclidean_1 = new JTextField();
		tfEuclidean_1.setColumns(10);
		tfEuclidean_1.setBounds(31, 199, 72, 20);
		panelEuclidean.add(tfEuclidean_1);
		
		JScrollPane scrollEuclidean = new JScrollPane(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollEuclidean.setBounds(31, 276, 328, 100);
		panelEuclidean.add(scrollEuclidean);
		
		JTextArea textArea_Euclidean = new JTextArea();
		scrollEuclidean.setViewportView(textArea_Euclidean);
		textArea_Euclidean.setWrapStyleWord(true);
		textArea_Euclidean.setLineWrap(true);
		textArea_Euclidean.setEditable(true);
		
		JButton btnClearEuclidean = new JButton("clear");
		btnClearEuclidean.setBounds(206, 198, 89, 23);
		panelEuclidean.add(btnClearEuclidean);
		
		JButton btnGenerateEuclidean = new JButton("GENERATE");
		btnGenerateEuclidean.setBounds(31, 229, 131, 23);
		panelEuclidean.add(btnGenerateEuclidean);
		
		tfEuclidean_2 = new JTextField();
		tfEuclidean_2.setColumns(10);
		tfEuclidean_2.setBounds(106, 199, 72, 20);
		panelEuclidean.add(tfEuclidean_2);
		
		JPanel panelPascal = new JPanel();
		layeredPane.add(panelPascal, "Pascal");
		panelPascal.setLayout(null);
		
		JLabel lblPascalTriangleGenerator = new JLabel("PASCAL TRIANGLE GENERATOR");
		lblPascalTriangleGenerator.setBounds(16, 43, 281, 17);
		lblPascalTriangleGenerator.setFont(new Font("Tahoma", Font.BOLD, 14));
		panelPascal.add(lblPascalTriangleGenerator);
		
		
		
		JButton btnBackPascal = new JButton("Back");
		btnBackPascal.setBounds(16, 10, 89, 23);
		panelPascal.add(btnBackPascal);
		
		JLabel Pascal_def1 = new JLabel("is an arrangement of numbers in a triangular array such that");
		Pascal_def1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		Pascal_def1.setBounds(16, 70, 366, 23);
		panelPascal.add(Pascal_def1);
		
		JLabel Pascal_def2 = new JLabel("the numbers at the end of each row are 1 and the remaining");
		Pascal_def2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		Pascal_def2.setBounds(16, 92, 366, 23);
		panelPascal.add(Pascal_def2);
		
		JLabel Pascal_def3 = new JLabel("numbers are the sum of the nearest two numbers in the above row.");
		Pascal_def3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		Pascal_def3.setBounds(16, 119, 366, 23);
		panelPascal.add(Pascal_def3);
		
		JLabel Pascal_bg1 = new JLabel("The elements of the nth row of Pascal's triangle");
		Pascal_bg1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		Pascal_bg1.setBounds(16, 143, 366, 23);
		panelPascal.add(Pascal_bg1);
		
		JLabel Pascal_bg2 = new JLabel("are given by, nC0, nC1, nC2, ..., nCn.");
		Pascal_bg2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		Pascal_bg2.setBounds(16, 168, 366, 23);
		panelPascal.add(Pascal_bg2);
		
		JLabel pascalText_formula = new JLabel("Formula");
		pascalText_formula.setFont(new Font("Tahoma", Font.BOLD, 14));
		pascalText_formula.setBounds(16, 201, 281, 17);
		panelPascal.add(pascalText_formula);
		
		JLabel pascalFormula = new JLabel("nCm = n-1Cm-1 + n-1Cm");
		pascalFormula.setFont(new Font("Tahoma", Font.BOLD, 14));
		pascalFormula.setBounds(16, 223, 281, 17);
		panelPascal.add(pascalFormula);
		
		JLabel pascalMeaning1 = new JLabel("nCm represents the (m+1)th element in the nth row.");
		pascalMeaning1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		pascalMeaning1.setBounds(16, 246, 366, 23);
		panelPascal.add(pascalMeaning1);
		
		JLabel pascalMeaning2 = new JLabel("n is a non-negative integer, and");
		pascalMeaning2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		pascalMeaning2.setBounds(16, 268, 366, 23);
		panelPascal.add(pascalMeaning2);
		
		JLabel pascalMeaning3 = new JLabel("0 ≤ m ≤ n");
		pascalMeaning3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		pascalMeaning3.setBounds(16, 289, 366, 23);
		panelPascal.add(pascalMeaning3);
		
		JButton btnGenerate_Pascal = new JButton("Generate");
		btnGenerate_Pascal.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnGenerate_Pascal.setBounds(212, 322, 85, 32);
		panelPascal.add(btnGenerate_Pascal);
		
		pascal_textField = new JTextField();
		pascal_textField.setColumns(10);
		pascal_textField.setBounds(16, 322, 188, 32);
		panelPascal.add(pascal_textField);
		
		JButton btnClear_Pascal = new JButton("Clear");
		btnClear_Pascal.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnClear_Pascal.setBounds(307, 322, 85, 32);
		panelPascal.add(btnClear_Pascal);
		
		JScrollPane scrollPascal = new JScrollPane(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPascal.setBounds(16, 364, 328, 146);
		panelPascal.add(scrollPascal);
		
		JTextArea textArea_Pascal = new JTextArea();
		textArea_Pascal.setWrapStyleWord(false);
		textArea_Pascal.setLineWrap(false);
		textArea_Pascal.setEditable(true);
		textArea_Pascal.setBounds(new Rectangle(0, 0, 415, 243));
		scrollPascal.setViewportView(textArea_Pascal);

		btnBackPascal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(layeredPane, "1");
			}
		});
		

		/* Clear-Button section */

		btnClearFibonacci.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea_Fibonacci.setText("");
			}
		});
		
		btnClearLucas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea_Lucas.setText("");
			}
		});
		

		btnClearTribonacci.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea_Tribonacci.setText("");
			}
		});
		btnClearCollatz.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textArea_Collatz.setText("");
			}
		});

		btnClearEuclidean.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textArea_Euclidean.setText("");
			}
		});

		btnClear_Pascal.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) { textArea_Pascal.setText("");

			}
		});


		btnGenerateFibonacci.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = tfFibonacci.getText().toString();
				String result = "";
				if(isInteger(input)) {
					int count = Integer.parseInt(input);
					if(count<2) {
						result = "Input must be greater than 1";
					} else {
						for (int i = 0; i <= count; i++) {
	                        result += fibonacci(i) + ", ";
	                    }
						result = result.substring(0, result.length()-2);
						result += "\n for 0 ≤ n ≤ "+count;
					}
				}else {
					result = "Invalid Input";
				}
				textArea_Fibonacci.setText(result);
			}
		});
		
		btnGenerateLucas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = tfLucas.getText().toString();
				String result = "";
				if(isInteger(input)) {
					int count = Integer.parseInt(input);
					if(count<2) {
						result = "Input must be greater than 1";
					} else {
						for (int i = 0; i <= count; i++) {
	                        result += lucas(i) + ", ";
	                    }
						result = result.substring(0, result.length()-2);
						result += "\n for 0 ≤ n ≤ "+count;
					}
				}else {
					result = "Invalid Input";
				}
				textArea_Lucas.setText(result);
			}
		});
		
		btnGenerateTribonacci.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = tfTribonacci.getText().toString();
				String result = "";
				if(isInteger(input)) {
					int count = Integer.parseInt(input);
					if(count<3) {
						result = "Input must be greater than 2";
					} else {
						for (int i = 0; i <= count; i++) {
	                        result += tribonacci(i) + ", ";
	                    }
						result = result.substring(0, result.length()-2);
						result += "\n for 0 ≤ n ≤ "+count;             
					}
				}else { 
					result = "Invalid Input";
				}
				textArea_Tribonacci.setText(result);
			}
		});

		btnGenerateCollatz.addActionListener(new ActionListener() {     
			public void actionPerformed(ActionEvent e) {               
				String input = tfCollatz.getText().toString();
				String result = "";
				if (Integer.parseInt(input)<1){
					result = "Input must be an integer";
				}
				else{
					result = collatz(Integer.parseInt(input));
				}

				textArea_Collatz.setText(result);
			}
		});


		btnGenerateEuclidean.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String input1 = tfEuclidean_1.getText().toString();
				String input2 = tfEuclidean_2.getText().toString();

				String result = "";

				  if(Integer.parseInt(input1)<0 && Integer.parseInt(input2)<0){
					  result = "Input must be a positive Integer";
				  }
				  else{
					  result = String.valueOf(euclidean(Integer.parseInt(input1),Integer.parseInt(input2)));
				  }

				  textArea_Euclidean.setText(result);

			}
		});
	
	
	btnGenerate_Pascal.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed (ActionEvent e) {
			String input = pascal_textField.getText().toString();
			String displayResult = "";


			if(Integer.parseInt(input)<1){
				displayResult = "Input must be a positive integer";

			}
			else {
				displayResult = generateTriangle(Integer.parseInt(input)); // find here later

			}

			textArea_Pascal.setText(displayResult);
		}
		
	});
	
	
	}

	



	/* LOGIC SECTION*/
	public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } 
        else {
           int fib = fibonacci(n - 1) + fibonacci(n - 2);
          
           
             return fib;
            
            }
             
	}
    
    public static int lucas(int n) {
        if (n == 0) {
            return 2;
        } else if (n == 1) {
            return 1;
        } else {
            return lucas(n - 1) + lucas(n - 2);
        }
    }
    
    public static int tribonacci(int n) {
        if (n == 0 || n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
        }
    }

	public static String collatz(int n){

		String sequence = Integer.toString(n) + " ";
		while(n!=1){
			if(n%2==0){
				n = n/2;
			}
			else if(n%2!=0){
				n = 3*n+1;
			}
			sequence += Integer.toString(n) + " ";
		}
		return (sequence);
	}

	public static int euclidean(int a, int b){
		int g = 0;
		if(a==0){
			return b;
		}

		return euclidean (a % b,a);
	}


    
    public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    public static String generateTriangle(int rows) {
    	StringBuilder triangleBuilder = new StringBuilder();
    	
    	int pascalArray[][] = new int[rows][rows];
    	
    	for(int i = 0;i<rows;i++) {
    		pascalArray[i][0] = 1;
    	}
    for(int i = 1;i<rows;i++) {
    	pascalArray[i][i] = 1;
    }
    
    for(int i = 2;i<rows;i++) {
    	for(int j = 1;j<i;j++) {
    		pascalArray[i][j] = pascalArray[i-1][j-1] + pascalArray[i-1][j];
    	}
    }
    
    for(int i =0;i<rows;i++) {
    	for(int k = 0;k<rows-i;k++) {
    		triangleBuilder.append(" ");
    	}
    
    
    for(int j = 0; j<=i;j++) {
    	triangleBuilder.append(pascalArray[i][j]).append(" ");
    	}
    triangleBuilder.append("\n");
    		
    }
    return triangleBuilder.toString();

}
    }