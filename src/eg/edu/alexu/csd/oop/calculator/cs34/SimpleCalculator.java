package eg.edu.alexu.csd.oop.calculator.cs34;

import eg.edu.alexu.csd.oop.calculator.Calculator;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.regex.*;

public class SimpleCalculator implements Calculator {
		
	Deque<String> history = new LinkedList<String>();
	Stack<String> next = new Stack<String>();
	
	@Override
	public void input(String s) {
		while (!next.isEmpty()) {
			history.addLast(next.pop());
		}
		if (history.size() < 5) {
			history.addLast(s);
		}
		else {
			history.removeFirst();
			history.addLast(s);
		}
	}

	@Override
	public String getResult() {
		Pattern p1 = Pattern.compile("\\d+\\.\\d+|\\d+|\\-\\d+\\.\\d+|\\-\\d+");
		Pattern p2 = Pattern.compile("[*/+-]");
		Matcher m1 = p1.matcher(current());
		Matcher m2 = p2.matcher(current());
		m1.find();
		double operand1 = Double.valueOf(m1.group());
		m2.find(1);
		String operator = m2.group();
		m1.find(m2.end());
		double operand2 = Double.valueOf(m1.group());
		double result;
		if (operator.equals("+")) {
			result = operand1+operand2;
			return String.valueOf(result);
		}	
		else if (operator.equals("-")) {
			result = operand1-operand2;
			return String.valueOf(result);		}
		else if (operator.equals("*")) {
			result = operand1 * operand2;
			return String.valueOf(result);
		}
		else if (operator.equals("/") && operand2 != 0) {
			result = operand1/operand2;
			return String.valueOf(result);	
		}
		else {
			return null;
		}
	}

	@Override
	public String current() {
		if (history.isEmpty()) {
			return null;
		}
		else {
			return history.getLast();
		}
	}

	@Override
	public String prev() {
		if (current() == null || history.size() == 1) {
			return null;
		}
		else {
			next.push(current());
			history.removeLast();
			if (history.isEmpty()) {
				return null;
			}
			else {
				return current(); 
			}
		}
	}

	@Override
	public String next() {
		if (next.isEmpty()) {
			return null;
		}
		else {
			history.addLast(next.pop());
			return current();
		}
	}

	@Override
	public void save() {
		String toSave = "" ;
		Deque<String> saveHistory = new LinkedList<String>(history);
		Stack<String> saveNext = (Stack<String>) next.clone();
		while (!saveHistory.isEmpty()) {
			toSave += saveHistory.removeFirst();
			toSave += "\n" ;
		}
		toSave += "next\n";
		while (!saveNext.isEmpty()) {
			toSave += saveNext.pop();
			toSave += "\n" ;
		}
		try {
			File file = new File("saved.txt");
			if (!file.exists()) {
			     file.createNewFile();
			  }
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(toSave);
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void load() {
		while (!history.isEmpty()) {
			history.removeLast();
		}
		while (!next.isEmpty()) {
			next.pop();
		}
		try {
			BufferedReader br = new BufferedReader(new FileReader ("saved.txt"));
			String read = br.readLine();
			while (!read.equals("next")) {
				history.addLast(read);
				read = br.readLine();
			}
			read = br.readLine();
			while (read != null) {
				next.push(read);
				read = br.readLine();
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
