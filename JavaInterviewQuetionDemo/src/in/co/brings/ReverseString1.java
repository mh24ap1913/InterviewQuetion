package in.co.brings;


class Demo1{
	public static String reverse(String str) {
		
		char ch[]=str.toCharArray();
		String rev="";
		for(int i=ch.length-1;i>=0;i--) {
			rev+=ch[i];
		}
		return rev;
	}
}

public class ReverseString1 {
public static void main(String[] args) {
	System.out.println(Demo1.reverse("vikas ghodke"));
}
}
