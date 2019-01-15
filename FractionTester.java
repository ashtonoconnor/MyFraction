import javax.swing.JOptionPane;

public class FractionTester {

	public static void main(String[] args) {
		
		String msg2= "Multiply (M), Add (A), Subtract (S), or Divide (D)?";
		String function = JOptionPane.showInputDialog(msg2);
		String msg = "Please enter the first fraction";
		String fraction1 = JOptionPane.showInputDialog(msg);
		String msg1 = "Please enter the second fraction";
		String fraction2 = JOptionPane.showInputDialog(msg1);
	
		
		Fraction myFraction = new Fraction(fraction1, fraction2);
	
		
		//System.out.println("Num1: " + myFraction.getNumerator1()+ "Num2: " +myFraction.getNumerator2() + "Den1: " + myFraction.getDenominator1()+ "Den2: " +myFraction.getDenominator2());
		
		
		if (function.equals("A") || function.equals("a")) {
			
		
			JOptionPane.showMessageDialog(null, "The sum equals: " + 
		
				
				myFraction.setfinalNumerator() +
				
				"/" +
				
				myFraction.setfinalDenominator());
	}
		
		
	if (function.equals("M")|| function.equals("m")) {
		JOptionPane.showMessageDialog(null, "The answer equals: " +
		
		myFraction.setMultiplyNumerator() + "/" + myFraction.setMultiplyDenominator());
		
	}

	
	if (function.equals("D")|| function.equals("d")) {
		JOptionPane.showMessageDialog(null, "The answer equals: " +
				myFraction.setDivideNumerator() + "/" + myFraction.setDivideDenominator()
				);
	}
	
	
	if (function.equals("S") || function.equals("s")) {
		JOptionPane.showMessageDialog(null,  "The subtraction equal: "+
	myFraction.setSubNumerator() + "/" + myFraction.setSubDenominator());
	}
	
	
}
}
