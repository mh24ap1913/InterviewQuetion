package in.co.brings;

import java.util.Scanner;

public class PalindromeString {
	
	public static void main(String[] args) {
		String original="" ,reverse="";
		int length;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		original=sc.next();
		
		 length=original.length();
		 for(int i=length-1;i>=0;i--) {
			 reverse=reverse+original.charAt(i);
		 }
		 System.out.println("reverse:-"+reverse);
		 if(original.equals(reverse)) {
			 System.out.println("this is polindrome string");
		 }
		 else {
			 System.out.println("this is not polindrome string");
		 }
	}

}
