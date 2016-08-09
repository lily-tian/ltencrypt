/*************************************************************************
 * Author: lily-tian 
 * Date: 08 Aug 2016
 * 
 * Compilation:  	javac test.java
 * Execution:    	java test
 * Dependencies: 	StdOut.java, LFSR.java, LTEncrypt.java
 * 
 * Description: Method testing for LFSR.java and LTEncrypt.java.
 *  
 *************************************************************************/

public class test {
	public static void main(String[] args) {
		
		// tests LFSR constructor
		LFSR lfsr = new LFSR("01101000010", 8);

		// checks LFSR string representation
		StdOut.println(lfsr);

		// checks LFSR step
		for (int i = 0; i < 10; i++) {
			int bit = lfsr.step();
			StdOut.println(lfsr + " " + bit);
		}

		// checks LFSR multiple bits extraction
		for (int i = 0; i < 10; i++) {
			int r = lfsr.generate(5);
			StdOut.println(lfsr + " " + r);
		}
		
		// tests LTEncrypt
		LTEncrypt.main(args);
	}
}