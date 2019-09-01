package in.co.brings;

public class EncapsulationDemo {
	
	private static int id;//private data member canot access out side
	private static String name;
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		EncapsulationDemo.id = id;
	}
	public static String getName() {
		return name;
	}
	public static void setName(String name) {
		EncapsulationDemo.name = name;
	}
	
	public static void main(String[] args) {
		
		EncapsulationDemo demo=new EncapsulationDemo();
		demo.setId(10);
		demo.setName("vikas");
		
		System.out.println(demo.getId()+" "+demo.getName());
	}

}
