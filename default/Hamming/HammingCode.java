package Hamming;

public class HammingCode {
	public static int hammingDistance(int x, int y) {



		String a = Integer.toBinaryString(x);
		String b = Integer.toBinaryString(y);

		int diff=0;
		if(a.length()>b.length()){
			diff = a.length()-b.length();
			

	        for (int i = 0; i < diff; i++)
	            b = "0"+b;


		}
		else{
			diff = b.length()-a.length();
	        for (int i = 0; i < diff; i++)
	            a = "0"+a;
		}
//

		
		int count = 0;
		for(int i=0;i<a.length();i++){
			if(a.charAt(i)!=b.charAt(i)){
				count++;
			}
		}

		
		return count;

	}


	public static void main(String args[]) {

		System.out.println(HammingCode.hammingDistance(1, 4));

	}
}