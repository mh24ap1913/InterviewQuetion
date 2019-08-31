package in.co.brings;

class Demo{
	
	public static String reverse(String str) {
		StringBuilder sb=new StringBuilder(str);
		sb.reverse();
		
		return sb.toString();
		
	}
}

public class ReverseString {
	
	public static void main(String[] args) {
		System.out.println(Demo.reverse("my name vikas"));
		
	}
	

}
