package in.co.brings;

public class BubbleSort {
	public static void main(String[] args) {
		
	
	
	int a[]= {53,14,45,14,24,78};
	for(int i=1;i<=5;i++) {
		for(int j=1;j<5;j++) {
			if(a[i]<a[j]) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		
	}
	System.out.println("printed sorted list");
	for(int i=1;i<5;i++) {
		System.out.println(a[i]);
	}

}
}