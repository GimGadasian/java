package ja0729;

public class Car2 {
	String color;
	String gearType;
	int door;
	
	Car2(){// default constructor: initialize object
		this("silver", "auto", 4);
	}
	Car2(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}
