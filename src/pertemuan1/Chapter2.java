package pertemuan1;

import javax.print.attribute.IntegerSyntax;
import javax.swing.JOptionPane;

public class Chapter2 {

	public static void main(String[] args) {
		int test1, test2, output;
		String num1 = JOptionPane.showInputDialog("enter first integer");
		String num2 = JOptionPane.showInputDialog("enter second integer");
		test1 = Integer.parseInt(num1);
		test2 = Integer.parseInt(num2);
		output = test1+test2;
		JOptionPane.showMessageDialog(null, "the result is     "+output);
	}

}
