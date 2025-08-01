package ja0729;

public class Car {
	String color;
	String gearType;
	int door;
	
	Car(){// default constructor
		this("white", "auto", 5); // call other constructors
	}
	
	Car(String color, String gearType, int door) { // constructor with parameters
		this.color = color; // this o => instance variable , this x => local variable
		this.gearType = gearType;
		this.door = door;
	}
	
	Car(Car c) {
		this(c.color, c.gearType, c.door);
	}
}
