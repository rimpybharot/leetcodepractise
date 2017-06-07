package Signed;

import java.util.Scanner; 

public class Sign {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("First");
		int a = scan.nextInt();
		
		System.out.println("Second");
		int b = scan.nextInt();
		
		scan.close();
		
		
		if(a>>63==b>>63){
			System.out.println("same");
		}
		else{
			System.out.println("opposite");
		}

	}

}
