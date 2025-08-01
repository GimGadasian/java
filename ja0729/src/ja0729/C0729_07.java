package ja0729;

public class C0729_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car2 c = new Car2();
		
		
		Car2 c2 = new Car2("black", "stick", 2);
		System.out.println("most sold");
		System.out.println("color: "+ c.color);
		System.out.println("gear-type: "+ c.gearType);
		System.out.println("doors: "+ c.door);
		
		System.out.println("");
		
		System.out.println("truck");
		System.out.println("color: "+ c2.color);
		System.out.println("gear-type: "+ c2.gearType);
		System.out.println("doors: "+ c2.door);
		
	}

}
