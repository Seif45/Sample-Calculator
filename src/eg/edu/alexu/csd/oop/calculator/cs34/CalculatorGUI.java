package eg.edu.alexu.csd.oop.calculator.cs34;

import eg.edu.alexu.csd.oop.calculator.Calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class CalculatorGUI {
	
	Calculator calculator = new SimpleCalculator(); 
	
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorGUI window = new CalculatorGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	boolean operand1 = false;
	boolean operator = false;
	boolean operand2 = false;
	boolean zeroOperand = false;
	boolean negativeOperand = false;
	boolean fraction = false;
	boolean result = false;
	
	/**
	 * Create the application.
	 */
	public CalculatorGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 447, 303);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel inputDisplay = new JLabel("");
		inputDisplay.setFont(new Font("Tahoma", Font.PLAIN, 12));
		inputDisplay.setBackground(Color.WHITE);
		inputDisplay.setBounds(15, 18, 193, 23);
		frame.getContentPane().add(inputDisplay);
		
		JLabel outputDisplay = new JLabel("");
		outputDisplay.setFont(new Font("Tahoma", Font.PLAIN, 20));
		outputDisplay.setBounds(15, 52, 193, 23);
		frame.getContentPane().add(outputDisplay);
		
		JButton btnNewButton_0 = new JButton("0");
		btnNewButton_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (result) {
					inputDisplay.setText("");
					outputDisplay.setText("");
					operand1 = false;
					operator = false;
					operand2 = false;
					zeroOperand = false;
					negativeOperand = false;
					fraction = false;
					result = false;
					
				}
				if (zeroOperand && !fraction) {
				}
				else if (!fraction && !operand1 && !operator && !operand2) {
					inputDisplay.setText(inputDisplay.getText() + "0");
					zeroOperand = true;
					operand1 = true;
					negativeOperand = false;
				}
				else if (!fraction && operand1 && operator && !operand2) {
					inputDisplay.setText(inputDisplay.getText() + "0");
					zeroOperand = true;
					operand2 = true;
					negativeOperand = false;
				}
				else if (!fraction && !negativeOperand && operand1 && !operator && !operand2) {
					inputDisplay.setText(inputDisplay.getText() + "0");
				}
				else if (!fraction && !negativeOperand && operand1 && operator && operand2) {
					inputDisplay.setText(inputDisplay.getText() + "0");
				}
				else if (!fraction && negativeOperand && operand1 && !operator && !operand2) {
					inputDisplay.setText(inputDisplay.getText() + "0");
					zeroOperand = true;
					negativeOperand = false;
				}
				else if (!fraction && negativeOperand && operand1 && operator && operand2) {
					inputDisplay.setText(inputDisplay.getText() + "0");
					zeroOperand = true;
					negativeOperand = false;
				}
				else if (fraction && operand1 && !operator && !operand2) {
					inputDisplay.setText(inputDisplay.getText() + "0");
					zeroOperand = false;
					negativeOperand = false;
				}
				else if (fraction && operand1 && operator && operand2) {
					inputDisplay.setText(inputDisplay.getText() + "0");
					zeroOperand = false;
					negativeOperand = false;
				}
			}
		});
		btnNewButton_0.setBounds(119, 223, 89, 23);
		frame.getContentPane().add(btnNewButton_0);

		JButton btnNewButton_1 = new JButton("1");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				negativeOperand = false;
				if (result) {
					inputDisplay.setText("");
					outputDisplay.setText("");
					operand1 = false;
					operator = false;
					operand2 = false;
					zeroOperand = false;
					negativeOperand = false;
					fraction = false;
					result = false;
					
				}
				if (zeroOperand && operand1 && !operator && !operand2) {
					inputDisplay.setText(inputDisplay.getText().substring(0, inputDisplay.getText().length() -1) + "1");
					zeroOperand = false;
				}
				else if (zeroOperand && operand1 && operator && operand2) {
					inputDisplay.setText(inputDisplay.getText().substring(0, inputDisplay.getText().length() -1) + "1");
					zeroOperand = false;
				}
				else if (!operand1 && !operator && !operand2) {
					inputDisplay.setText(inputDisplay.getText() + "1");
					zeroOperand = false;
					operand1 = true;
				}
				else if (operand1 && !operator && !operand2) {
					inputDisplay.setText(inputDisplay.getText() + "1");
				}
				else if (operand1 && operator && !operand2) {
					inputDisplay.setText(inputDisplay.getText() + "1");
					zeroOperand = false;
					operand2 = true;
				}
				else if (operand1 && operator && operand2) {
					inputDisplay.setText(inputDisplay.getText() + "1");
				}
			}
		});
		btnNewButton_1.setBounds(15, 182, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("2");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				negativeOperand = false;
				if (result) {
					inputDisplay.setText("");
					outputDisplay.setText("");
					operand1 = false;
					operator = false;
					operand2 = false;
					zeroOperand = false;
					negativeOperand = false;
					fraction = false;
					result = false;
					
				}
				if (zeroOperand && operand1 && !operator && !operand2) {
					inputDisplay.setText(inputDisplay.getText().substring(0, inputDisplay.getText().length() -1) + "2");
					zeroOperand = false;
				}
				else if (zeroOperand && operand1 && operator && operand2) {
					inputDisplay.setText(inputDisplay.getText().substring(0, inputDisplay.getText().length() -1) + "2");
					zeroOperand = false;
				}
				else if (!operand1 && !operator && !operand2) {
					inputDisplay.setText(inputDisplay.getText() + "2");
					zeroOperand = false;
					operand1 = true;
				}
				else if (operand1 && !operator && !operand2) {
					inputDisplay.setText(inputDisplay.getText() + "2");
				}
				else if (operand1 && operator && !operand2) {
					inputDisplay.setText(inputDisplay.getText() + "2");
					zeroOperand = false;
					operand2 = true;
				}
				else if (operand1 && operator && operand2) {
					inputDisplay.setText(inputDisplay.getText() + "2");
				}			}
		});
		btnNewButton_2.setBounds(119, 182, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("3");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				negativeOperand = false;
				if (result) {
					inputDisplay.setText("");
					outputDisplay.setText("");
					operand1 = false;
					operator = false;
					operand2 = false;
					zeroOperand = false;
					negativeOperand = false;
					fraction = false;
					result = false;
					
				}
				if (zeroOperand && operand1 && !operator && !operand2) {
					inputDisplay.setText(inputDisplay.getText().substring(0, inputDisplay.getText().length() -1) + "3");
					zeroOperand = false;
				}
				else if (zeroOperand && operand1 && operator && operand2) {
					inputDisplay.setText(inputDisplay.getText().substring(0, inputDisplay.getText().length() -1) + "3");
					zeroOperand = false;
				}
				else if (!operand1 && !operator && !operand2) {
					inputDisplay.setText(inputDisplay.getText() + "3");
					zeroOperand = false;
					operand1 = true;
				}
				else if (operand1 && !operator && !operand2) {
					inputDisplay.setText(inputDisplay.getText() + "3");
				}
				else if (operand1 && operator && !operand2) {
					inputDisplay.setText(inputDisplay.getText() + "3");
					zeroOperand = false;
					operand2 = true;
				}
				else if (operand1 && operator && operand2) {
					inputDisplay.setText(inputDisplay.getText() + "3");
				}		
			}
		});
		btnNewButton_3.setBounds(223, 182, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("4");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				negativeOperand = false;
				if (result) {
					inputDisplay.setText("");
					outputDisplay.setText("");
					operand1 = false;
					operator = false;
					operand2 = false;
					zeroOperand = false;
					negativeOperand = false;
					fraction = false;
					result = false;
					
				}
				if (zeroOperand && operand1 && !operator && !operand2) {
					inputDisplay.setText(inputDisplay.getText().substring(0, inputDisplay.getText().length() -1) + "4");
					zeroOperand = false;
				}
				else if (zeroOperand && operand1 && operator && operand2) {
					inputDisplay.setText(inputDisplay.getText().substring(0, inputDisplay.getText().length() -1) + "4");
					zeroOperand = false;
				}
				else if (!operand1 && !operator && !operand2) {
					inputDisplay.setText(inputDisplay.getText() + "4");
					zeroOperand = false;
					operand1 = true;
				}
				else if (operand1 && !operator && !operand2) {
					inputDisplay.setText(inputDisplay.getText() + "4");
				}
				else if (operand1 && operator && !operand2) {
					inputDisplay.setText(inputDisplay.getText() + "4");
					zeroOperand = false;
					operand2 = true;
				}
				else if (operand1 && operator && operand2) {
					inputDisplay.setText(inputDisplay.getText() + "4");
				}		
			}
		});
		btnNewButton_4.setBounds(15, 141, 89, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("5");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				negativeOperand = false;
				if (result) {
					inputDisplay.setText("");
					outputDisplay.setText("");
					operand1 = false;
					operator = false;
					operand2 = false;
					zeroOperand = false;
					negativeOperand = false;
					fraction = false;
					result = false;
					
				}
				if (zeroOperand && operand1 && !operator && !operand2) {
					inputDisplay.setText(inputDisplay.getText().substring(0, inputDisplay.getText().length() -1) + "5");
					zeroOperand = false;
				}
				else if (zeroOperand && operand1 && operator && operand2) {
					inputDisplay.setText(inputDisplay.getText().substring(0, inputDisplay.getText().length() -1) + "5");
					zeroOperand = false;
				}
				else if (!operand1 && !operator && !operand2) {
					inputDisplay.setText(inputDisplay.getText() + "5");
					zeroOperand = false;
					operand1 = true;
				}
				else if (operand1 && !operator && !operand2) {
					inputDisplay.setText(inputDisplay.getText() + "5");
				}
				else if (operand1 && operator && !operand2) {
					inputDisplay.setText(inputDisplay.getText() + "5");
					zeroOperand = false;
					operand2 = true;
				}
				else if (operand1 && operator && operand2) {
					inputDisplay.setText(inputDisplay.getText() + "5");
				}		
			}
		});
		btnNewButton_5.setBounds(119, 141, 89, 23);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("6");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				negativeOperand = false;
				if (result) {
					inputDisplay.setText("");
					outputDisplay.setText("");
					operand1 = false;
					operator = false;
					operand2 = false;
					zeroOperand = false;
					negativeOperand = false;
					fraction = false;
					result = false;
					
				}
				if (zeroOperand && operand1 && !operator && !operand2) {
					inputDisplay.setText(inputDisplay.getText().substring(0, inputDisplay.getText().length() -1) + "6");
					zeroOperand = false;
				}
				else if (zeroOperand && operand1 && operator && operand2) {
					inputDisplay.setText(inputDisplay.getText().substring(0, inputDisplay.getText().length() -1) + "6");
					zeroOperand = false;
				}
				else if (!operand1 && !operator && !operand2) {
					inputDisplay.setText(inputDisplay.getText() + "6");
					zeroOperand = false;
					operand1 = true;
				}
				else if (operand1 && !operator && !operand2) {
					inputDisplay.setText(inputDisplay.getText() + "6");
				}
				else if (operand1 && operator && !operand2) {
					inputDisplay.setText(inputDisplay.getText() + "6");
					zeroOperand = false;
					operand2 = true;
				}
				else if (operand1 && operator && operand2) {
					inputDisplay.setText(inputDisplay.getText() + "6");
				}		
			}
		});
		btnNewButton_6.setBounds(223, 141, 89, 23);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("7");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				negativeOperand = false;
				if (result) {
					inputDisplay.setText("");
					outputDisplay.setText("");
					operand1 = false;
					operator = false;
					operand2 = false;
					zeroOperand = false;
					negativeOperand = false;
					fraction = false;
					result = false;
					
				}
				if (zeroOperand && operand1 && !operator && !operand2) {
					inputDisplay.setText(inputDisplay.getText().substring(0, inputDisplay.getText().length() -1) + "7");
					zeroOperand = false;
				}
				else if (zeroOperand && operand1 && operator && operand2) {
					inputDisplay.setText(inputDisplay.getText().substring(0, inputDisplay.getText().length() -1) + "7");
					zeroOperand = false;
				}
				else if (!operand1 && !operator && !operand2) {
					inputDisplay.setText(inputDisplay.getText() + "7");
					zeroOperand = false;
					operand1 = true;
				}
				else if (operand1 && !operator && !operand2) {
					inputDisplay.setText(inputDisplay.getText() + "7");
				}
				else if (operand1 && operator && !operand2) {
					inputDisplay.setText(inputDisplay.getText() + "7");
					zeroOperand = false;
					operand2 = true;
				}
				else if (operand1 && operator && operand2) {
					inputDisplay.setText(inputDisplay.getText() + "7");
				}			
			}
		});
		btnNewButton_7.setBounds(15, 100, 89, 23);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("8");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				negativeOperand = false;
				if (result) {
					inputDisplay.setText("");
					outputDisplay.setText("");
					operand1 = false;
					operator = false;
					operand2 = false;
					zeroOperand = false;
					negativeOperand = false;
					fraction = false;
					result = false;
					
				}
				if (zeroOperand && operand1 && !operator && !operand2) {
					inputDisplay.setText(inputDisplay.getText().substring(0, inputDisplay.getText().length() -1) + "8");
					zeroOperand = false;
				}
				else if (zeroOperand && operand1 && operator && operand2) {
					inputDisplay.setText(inputDisplay.getText().substring(0, inputDisplay.getText().length() -1) + "8");
					zeroOperand = false;
				}
				else if (!operand1 && !operator && !operand2) {
					inputDisplay.setText(inputDisplay.getText() + "8");
					zeroOperand = false;
					operand1 = true;
				}
				else if (operand1 && !operator && !operand2) {
					inputDisplay.setText(inputDisplay.getText() + "8");
				}
				else if (operand1 && operator && !operand2) {
					inputDisplay.setText(inputDisplay.getText() + "8");
					zeroOperand = false;
					operand2 = true;
				}
				else if (operand1 && operator && operand2) {
					inputDisplay.setText(inputDisplay.getText() + "8");
				}			
			}
		});
		btnNewButton_8.setBounds(119, 100, 89, 23);
		frame.getContentPane().add(btnNewButton_8);
		
		
		JButton btnNewButton_9 = new JButton("9");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				negativeOperand = false;
				if (result) {
					inputDisplay.setText("");
					outputDisplay.setText("");
					operand1 = false;
					operator = false;
					operand2 = false;
					zeroOperand = false;
					negativeOperand = false;
					fraction = false;
					result = false;
					
				}
				if (zeroOperand && operand1 && !operator && !operand2) {
					inputDisplay.setText(inputDisplay.getText().substring(0, inputDisplay.getText().length() -1) + "9");
					zeroOperand = false;
				}
				else if (zeroOperand && operand1 && operator && operand2) {
					inputDisplay.setText(inputDisplay.getText().substring(0, inputDisplay.getText().length() -1) + "9");
					zeroOperand = false;
				}
				else if (!operand1 && !operator && !operand2) {
					inputDisplay.setText(inputDisplay.getText() + "9");
					zeroOperand = false;
					operand1 = true;
				}
				else if (operand1 && !operator && !operand2) {
					inputDisplay.setText(inputDisplay.getText() + "9");
				}
				else if (operand1 && operator && !operand2) {
					inputDisplay.setText(inputDisplay.getText() + "9");
					zeroOperand = false;
					operand2 = true;
				}
				else if (operand1 && operator && operand2) {
					inputDisplay.setText(inputDisplay.getText() + "9");
				}	
			}
		});
		btnNewButton_9.setBounds(223, 100, 89, 23);
		frame.getContentPane().add(btnNewButton_9);
				
		JButton btnNewButton_decimal = new JButton(".");
		btnNewButton_decimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (result) {
					inputDisplay.setText("");
					outputDisplay.setText("");
					operand1 = false;
					operator = false;
					operand2 = false;
					zeroOperand = false;
					negativeOperand = false;
					fraction = false;
					result = false;
					
				}
				if (!fraction && operand1 && !operator && !operand2) {
					inputDisplay.setText(inputDisplay.getText() + ".");
					fraction = true;
					zeroOperand = false;
					negativeOperand = false;
				}
				else if (!fraction && operand1 && operator && operand2) {
					inputDisplay.setText(inputDisplay.getText() + ".");
					fraction = true;
					zeroOperand = false;
					negativeOperand = false;
				}
			}
		});
		btnNewButton_decimal.setBounds(15, 223, 89, 23);
		frame.getContentPane().add(btnNewButton_decimal);
		
		JButton btnNewButton_equal = new JButton("=");
		btnNewButton_equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (operand1 && operator && operand2) {
					result = true;
					operand1 = false;
					operator = false;
					operand2 = false;
					zeroOperand = false;
					negativeOperand = false;
					fraction = false;
					if (inputDisplay.getText().charAt(inputDisplay.getText().length()-1) == '.') {
						inputDisplay.setText(inputDisplay.getText().substring(0, inputDisplay.getText().length() -1));
					}
					calculator.input(inputDisplay.getText());
					String result = calculator.getResult();
					if (result.equals(null)) {
						outputDisplay.setText("Error:invalid input");
					}
					else {
						outputDisplay.setText(result);
					}
				}
			}
		});
		btnNewButton_equal.setBounds(223, 223, 89, 23);
		frame.getContentPane().add(btnNewButton_equal);
		
		JButton btnNewButton_divide = new JButton("\u00F7");
		btnNewButton_divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (result) {
					inputDisplay.setText(outputDisplay.getText() + " / ");
					outputDisplay.setText("");
					result = false;
					operand1 = true;
					operator = true;
					operand2 = false;
					zeroOperand = false;
					negativeOperand = false;
					fraction = false;
				}
				if (operand1 && !operator && !operand2) {
					if (inputDisplay.getText().charAt(inputDisplay.getText().length()-1) == '.') {
						inputDisplay.setText(inputDisplay.getText().substring(0, inputDisplay.getText().length() -1));
					}
					inputDisplay.setText(inputDisplay.getText() + " / ");
					operator = true;
					zeroOperand = false;
					negativeOperand = false;
					fraction = false;
				}
				else if (operand1 && operator && !operand2) {
					inputDisplay.setText(inputDisplay.getText().substring(0, inputDisplay.getText().length() -2) + "/ ");
					zeroOperand = false;
					negativeOperand = false;
					fraction = false;
				}
			}
		});
		btnNewButton_divide.setBounds(327, 100, 89, 23);
		frame.getContentPane().add(btnNewButton_divide);
		
		JButton btnNewButton_times = new JButton("\u00D7");
		btnNewButton_times.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (result) {
					inputDisplay.setText(outputDisplay.getText() + " * ");
					outputDisplay.setText("");
					result = false;
					operand1 = true;
					operator = true;
					operand2 = false;
					zeroOperand = false;
					negativeOperand = false;
					fraction = false;
				}
				if (operand1 && !operator && !operand2) {
					if (inputDisplay.getText().charAt(inputDisplay.getText().length()-1) == '.') {
						inputDisplay.setText(inputDisplay.getText().substring(0, inputDisplay.getText().length() -1));
					}
					inputDisplay.setText(inputDisplay.getText() + " * ");
					operator = true;
					zeroOperand = false;
					negativeOperand = false;
					fraction = false;
				}
				else if (operand1 && operator && !operand2) {
					inputDisplay.setText(inputDisplay.getText().substring(0, inputDisplay.getText().length() -2) + "* ");
					zeroOperand = false;
					negativeOperand = false;
					fraction = false;
				}
			}
		});
		btnNewButton_times.setBounds(327, 141, 89, 23);
		frame.getContentPane().add(btnNewButton_times);
		
		JButton btnNewButton_plus = new JButton("+");
		btnNewButton_plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (result) {
					inputDisplay.setText(outputDisplay.getText() + " + ");
					outputDisplay.setText("");
					result = false;
					operand1 = true;
					operator = true;
					operand2 = false;
					zeroOperand = false;
					negativeOperand = false;
					fraction = false;
				}
				if (operand1 && !operator && !operand2) {
					if (inputDisplay.getText().charAt(inputDisplay.getText().length()-1) == '.') {
						inputDisplay.setText(inputDisplay.getText().substring(0, inputDisplay.getText().length() -1));
					}
					inputDisplay.setText(inputDisplay.getText() + " + ");
					operator = true;
					zeroOperand = false;
					negativeOperand = false;
					fraction = false;
				}
				else if (operand1 && operator && !operand2) {
					inputDisplay.setText(inputDisplay.getText().substring(0, inputDisplay.getText().length() -2) + "+ ");
					zeroOperand = false;
					negativeOperand = false;
					fraction = false;
				}
			}
		});
		btnNewButton_plus.setBounds(327, 182, 89, 23);
		frame.getContentPane().add(btnNewButton_plus);
		
		JButton btnNewButton_minus = new JButton("-");
		btnNewButton_minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (result) {
					inputDisplay.setText(outputDisplay.getText() + " - ");
					outputDisplay.setText("");
					operand1 = true;
					operator = true;
					operand2 = false;
					zeroOperand = false;
					negativeOperand = false;
					fraction = false;
				}
				if (operand1 && !operator && !operand2) {
					if (inputDisplay.getText().charAt(inputDisplay.getText().length()-1) == '.') {
						inputDisplay.setText(inputDisplay.getText().substring(0, inputDisplay.getText().length() -1));
					}
					inputDisplay.setText(inputDisplay.getText() + " - ");
					operator = true;
					zeroOperand = false;
					negativeOperand = false;
					fraction = false;
				}
				else if (!operand1 && !operator && !operand2) {
					inputDisplay.setText(inputDisplay.getText() + "-");
					negativeOperand = true;
				}
				else if (operand1 && operator && !operand2 && !result) {
					inputDisplay.setText(inputDisplay.getText() + "-");
					negativeOperand = true;
				}
				result = false;
			}
		});
		btnNewButton_minus.setBounds(327, 223, 89, 23);
		frame.getContentPane().add(btnNewButton_minus);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculator.save();
			}
		});
		btnSave.setBounds(223, 18, 89, 23);
		frame.getContentPane().add(btnSave);
		
		JButton btnLoad = new JButton("Load");
		btnLoad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculator.load();
				inputDisplay.setText(calculator.current());
				outputDisplay.setText(calculator.getResult());
			}
		});
		btnLoad.setBounds(327, 18, 89, 23);
		frame.getContentPane().add(btnLoad);
		
		JButton btnPrev = new JButton("\u25C4");
		btnPrev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String prev = calculator.prev();
				if (prev != null) {
					result = true;
					inputDisplay.setText(prev);
					outputDisplay.setText(calculator.getResult());
				}
			}
		});
		btnPrev.setBounds(223, 59, 59, 23);
		frame.getContentPane().add(btnPrev);
		
		JButton btnNext = new JButton("\u25BA");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String next = calculator.next();
				if (next != null) {
					result = true;
					inputDisplay.setText(next);
					outputDisplay.setText(calculator.getResult());
				}
			}
		});
		btnNext.setBounds(357, 59, 59, 23);
		frame.getContentPane().add(btnNext);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputDisplay.setText("");
				outputDisplay.setText("");
				operand1 = false;
				operator = false;
				operand2 = false;
				zeroOperand = false;
				negativeOperand = false;
				fraction = false;
				result = false;
			}
		});
		btnClear.setBounds(290, 59, 59, 23);
		frame.getContentPane().add(btnClear);
		
	}
}
