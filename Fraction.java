/**
 * Add two fractions. Learn Javadocs. Enter the two fractions as Strings
 * then use String methods to pull out numerator and denominator.
 * Use common denominator to add, then reduce to lowest common denominator
 * (first grade)
 * Add, subtract, multiply, divide = (second grade)
 * WITH JAVA DOCS
 * @author Ashton O'Connor
 * 
 */
public class Fraction {
	
	
	private int numerator1;
	private int denominator1;
	private int numerator2;
	private int denominator2;
	public int finalDenominator;
	public int finalNumerator;
	

	/**
	 * separates fraction strings into integers
	 * @param passFraction
	 * @param passFraction2
	 */
	
	public Fraction (String passFraction, String passFraction2) {
		
		int separatorLocation = passFraction.indexOf("/");
		String strNumerator1 = passFraction.substring(0,separatorLocation);
		String strDenominator1 = passFraction.substring(separatorLocation + 1);
		String strNumerator2 = passFraction2.substring(0,separatorLocation);
		String strDenominator2 = passFraction2.substring(separatorLocation + 1);
		

		this.numerator1 = Integer.parseInt(strNumerator1);
		this.denominator1 = Integer.parseInt(strDenominator1);
		
		this.numerator2 = Integer.parseInt(strNumerator2);
		this.denominator2 = Integer.parseInt(strDenominator2);
	}

	/**
	 * returns numerator 1
	 * @return
	 */
	public int getNumerator1() {
		return numerator1; 
		
	}
	/**
	 * returns numerator 2
	 * @return
	 */
	public int getNumerator2() {
		return numerator2;
	}
	/**
	 * sets numerator 1 as the integer value
	 * @param numerator1
	 */
	public void setNumerator1(int numerator1) {
		this.numerator1 = numerator1;
	}
	/**
	 * sets numerator 2 as the integer value
	 * @param numerator2
	 */
	public void setNumerator2(int numerator2) {
		this.numerator2 = numerator2;
	}
	/**
	 * returns denominator 1
	 * @return
	 */
	public int getDenominator1() {
		return denominator1;
	}
	/**
	 * returns denominator 2
	 * @return
	 */
	public int getDenominator2() {
		return denominator2;
	}
	/**
	 * sets denominator 1 as the integer value 
	 * @param denominator1
	 */
	public void setDenominator1(int denominator1) {
		this.denominator1 = denominator1;
	}
	/**
	 * sets denominator 2 as the integer value 
	 * @param denominator2
	 */
	public void setDenominator2(int denominator2) {
		this.denominator2 = denominator2;
	}
	
	
	
	/**
	 * finds the greatest common denominator
	 * @return
	 */
	public int gcd() {
		if (finalNumerator == 0 || finalDenominator == 0)
			return 0;

		int a = Math.max(Math.abs(finalNumerator), Math.abs(finalDenominator));
		int b = Math.min(Math.abs(finalNumerator), Math.abs(finalDenominator));

		int rem = a % b;

		while (rem != 0) {
			a = b;
			b = rem;
			rem = a % b;
		}
		return b;
		
	}
	
	/**
	 * calculates final numerator and reduces with greatest common denominator
	 * @return
	 */
	public int setfinalNumerator() {
		finalNumerator = (denominator1 * numerator2) + (denominator2 * numerator1);
		finalDenominator = (denominator1 * denominator2);
		//System.out.println("num before: " + finalNumerator);
		
		
		if (finalNumerator != 0 && finalDenominator != 0) {
			int commonDivisor = gcd();
			finalNumerator /= commonDivisor;
			//System.out.println("finalnum: " + finalNumerator);
			
			
			
			
		
		}
	
		return finalNumerator;
	}
	
	/**
	 * calculates final denominator and reduces by dividing by the greatest common denominator
	 * @return
	 */
	public int setfinalDenominator() {
		finalDenominator = (denominator1 * denominator2);
		finalNumerator = (denominator1 * numerator2) + (denominator2 * numerator1);
		
	//System.out.println("Den before: " + finalDenominator);
		
		if (finalNumerator != 0 && finalDenominator != 0) {
			int commonDivisor = gcd();
			finalDenominator /= commonDivisor;
			//System.out.println(" final den: " + finalDenominator);
		}
		
		return finalDenominator;
	}
	
	
	
	public int setMultiplyNumerator() {
		finalNumerator = numerator1 * numerator2;
		finalDenominator = denominator1*denominator2;
		if (finalNumerator != 0 && finalDenominator != 0) {
			int commonDivisor = gcd();
			finalNumerator /= commonDivisor;
			//System.out.println("finalnum: " + finalNumerator);
			
			
			
			
		
		}
	
		return finalNumerator;
	
	}
	public int setMultiplyDenominator() {
		finalDenominator = denominator1*denominator2;
		if (finalNumerator != 0 && finalDenominator != 0) {
			int commonDivisor = gcd();
			finalDenominator /= commonDivisor;
			//System.out.println(" final den: " + finalDenominator);
		}
		
		return finalDenominator;
	}
	
	
	
	public int setDivideNumerator() {
		finalNumerator = numerator1 * denominator2;
		finalDenominator = denominator1*numerator2;
		if (finalNumerator != 0 && finalDenominator != 0) {
			int commonDivisor = gcd();
			finalNumerator /= commonDivisor;
			//System.out.println("finalnum: " + finalNumerator);
			
			
			
			
		
		}
	
		return finalNumerator;
	
	}
	
	
	public int setDivideDenominator() {
		finalNumerator = numerator1 * denominator2;
		finalDenominator = denominator1*numerator2;
		if (finalNumerator != 0 && finalDenominator != 0) {
			int commonDivisor = gcd();
			finalNumerator /= commonDivisor;
			//System.out.println("finalnum: " + finalNumerator);
			
			
			
			
		
		}
	
		return finalDenominator;
	
	}
	
	
	
	
	
	
	
	
	
	
	public int setSubDenominator() {
		finalNumerator = (denominator2 * numerator1) - (denominator1 * numerator2);
		finalDenominator = denominator1*denominator2;
		if (finalNumerator != 0 && finalDenominator != 0) {
			int commonDivisor = gcd();
			finalNumerator /= commonDivisor;
			//System.out.println("finalnum: " + finalNumerator);
			
			
			
			
		
		}
	
		return finalDenominator;
	
	}
	public int setSubNumerator() {
		finalNumerator = (denominator2 * numerator1) - (denominator1 * numerator2);
		finalDenominator = denominator1*denominator2;
		if (finalNumerator != 0 && finalDenominator != 0) {
			int commonDivisor = gcd();
			finalNumerator /= commonDivisor;
			//System.out.println("finalnum: " + finalNumerator);
			
			
			
			
		
		}
	
		return finalNumerator;
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}


