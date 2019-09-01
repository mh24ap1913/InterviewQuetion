package in.co.brings;

import java.util.Scanner;

public class SwapTwoNumber {
	public static void main(String[] args) {
		int x,y,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first num");
		x=sc.nextInt();
		System.out.println("Enter second number");
		y=sc.nextInt();
		System.out.println("before swaping:-"+ x +y);
		
		temp=x;
		x=y;
		y=temp;
		System.out.println("After swapping"+x+y);
	}

}
