package in.co.brings;

import java.util.Scanner;

public class ReverseStringDemo {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		
		String[] token=str.split("");
		for(int i=token.length-1;i>=0;i--) {
			System.out.println(token[i]);
		}
	}

}
