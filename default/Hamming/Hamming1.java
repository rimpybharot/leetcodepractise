package Hamming;

public class Hamming1 {
	
	public static int hammingDistance(int x, int y) {
		
		System.out.println(Integer.toBinaryString(x));
		System.out.println(Integer.toBinaryString(y));
		
		System.out.println(Integer.bitCount(x));
		System.out.println(Integer.bitCount(y));

		System.out.println(Integer.toBinaryString(x^y));

		
		return Integer.bitCount(x ^ y);		
	}
	
	public static void main(String args[]) {

		System.out.println(Hamming1.hammingDistance(5, 13));
	}

}
