/*************************************************************************
 * Author: lily-tian 
 * Date: 08 Aug 2016
 * 
 * Compilation:  	javac LTEncrypt.java
 * Execution:    	java LTEncrypt
 * Dependencies: 	StdIn.java, StdOut.java, In.java, Out.java, LFSR.java
 * 
 * Description: A text file encryption program based on LFSR.
 *  
 *************************************************************************/

public class LTEncrypt {

	private static int EIGHT_BIT = 8; // eight-bit

	// converts alphanumeric password to binary
	public static String toBin(String alpha) {
		String beta = "";
		for (int i = 0; i < alpha.length(); i++)
			beta += Integer.toBinaryString((int) alpha.charAt(i));
		return beta;
	}
	
	// returns transformed copy of text file using LFSR
	public static String transform(String s, LFSR lfsr) {
		String enstr = "";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			char newc = (char) (lfsr.generate(EIGHT_BIT) ^ c);
			enstr += newc;
		}
		return enstr;
	}

	// writes out encrypted copy of file
	public static void main(String[] args) {
		
		// stores information about LFSR from command line
		StdOut.print("Please enter password: ");
		String password = toBin(StdIn.readString());
		StdOut.print("Please enter pin: ");
		int tap = StdIn.readInt();
		
		// reads in file
		StdOut.print("Please enter name of file: ");
		In in = new In(StdIn.readString());
		String s = in.readAll();

		// transforms file using LFSR
		LFSR key = new LFSR(password, tap);
		String encrypt = transform(s, key);
		
		// writes out transformed file
		StdOut.print("Please enter name of new file: ");
		Out out = new Out(StdIn.readString());
		out.print(encrypt);
		out.close();

		// messages closer
		String message = "Your file is now encrypted/decrypted. Thank "
				+ "you for using LTEncrypt!";
		StdOut.println(message);
	}
}
