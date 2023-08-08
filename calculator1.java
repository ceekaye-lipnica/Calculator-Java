package simplecalculator;
import javax.swing.JOptionPane;

public class calcu {

	public static void main(String[] args) {
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter First Number: "));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter Second Number: "));
		String operator = JOptionPane.showInputDialog("Enter operator: ");
		
		calcuCons math = new calcuCons(num1, num2, operator);
		
		math.compute();	
		
	}

}
