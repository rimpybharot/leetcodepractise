package OnesComplement;

public class Ones {
	
	public static void main(String args[]) {
		
		int num = Integer.parseInt(args[0]);

		String y = Integer.toBinaryString(num);
		
		String z = Integer.toBinaryString(~num);

		System.out.println(Integer.parseInt(z.substring(z.length()-y.length(),z.length()), 2)); // my sol

		System.out.println(~num & (Integer.highestOneBit(num) - 1)); // leets

	}

}
