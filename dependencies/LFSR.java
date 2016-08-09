/*************************************************************************
 * Author: lily-tian 
 * Date: 08 Aug 2016
 * 
 * Compilation: 	javac LFSR.java 
 * Execution: 		java LFSR 
 * 
 * Description: Implementation of linear-feedback shift register.
 * 
 *************************************************************************/

public class LFSR {

	private String seed; // the seed
	private int t; // the tap
	private int n; // length of seed

	// creates LFSR with the given initial seed and tap
	public LFSR(String seed, int t) {
		this.seed = seed;
		this.t = t;
		n = seed.length();
	}

	// simulates one step and returns the new bit as 0 or 1 based on XOR
	public int step() {
		if (seed.charAt(0) == seed.charAt(n - t - 1)) {
			seed = seed.substring(1);
			seed = seed + "0";
			return 0;
		} else {
			seed = seed.substring(1);
			seed = seed + "1";
			return 1;
		}
	}

	// simulates k steps and returns k-bit integer
	public int generate(int k) {
		int var = 0;
		for (int i = 0; i < k; i++) {
			var = 2 * var + step();
		}
		return var;
	}

	// returns string representation of the LFSR
	public String toString() {
		return seed;
	}

	public static void main(String[] args) {
		String message = "Welcome! This is an implementation of LFSR,"
				+ " the core of LTEncrypt. Please see readme for how"
				+ " to use LTEncypt!";
		System.out.println(message);
	}
}
