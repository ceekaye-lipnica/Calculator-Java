package simplecalculator;
import javax.swing.JOptionPane;

public class calcuCons {
	
	int num1, num2, ans;
	String op = " ";
	
	calcuCons(int n1, int n2, String operator){
		
		num1 = n1;
		num2 = n2;
		op = operator;
	}
	
	void compute() {
		
		
		if (op.equals("+")) {
			
			int sum = addition(num1,num2);
			JOptionPane.showMessageDialog(null,  num1 + " " + op + " "+ num2 + " = " + sum , "THE ANSWER IS: ", JOptionPane.INFORMATION_MESSAGE);
			
		} 
		else if (op.equals("-")) {
			int difference = minus(num1,num2);
			JOptionPane.showMessageDialog(null,  num1 + " " + op + " "+ num2 + " = " + difference , "THE ANSWER IS: ", JOptionPane.INFORMATION_MESSAGE);
		
		}
		else if (op.equals("*")) {
			int product = multiply(num1,num2);
			JOptionPane.showMessageDialog(null,  num1 + " " + op + " "+ num2 + " = " + product , "THE ANSWER IS: ", JOptionPane.INFORMATION_MESSAGE);
			
		} 
		else if (op.equals("/")) {
			int quotient = division(num1,num2);
			JOptionPane.showMessageDialog(null,  num1 + " " + op + " "+ num2 + " = " + quotient , "THE ANSWER IS: ", JOptionPane.INFORMATION_MESSAGE);
			
		}
		else {
			JOptionPane.showMessageDialog(null, "INVALID INPUT OF OPERATOR!", "ERROR!", JOptionPane.ERROR_MESSAGE);
		} 
		
		
	}
	
	int addition(int a, int b) {
		ans = num1 + num2;
		return ans;
	}
	int minus(int a, int b) {
		ans = num1 - num2;
		return ans;
	}
	int multiply(int a, int b) {
		ans = num1 * num2;
		return ans;
	}
	int division(int a, int b) {
		ans = num1 / num2;
		return ans;
	} 
		
	
}