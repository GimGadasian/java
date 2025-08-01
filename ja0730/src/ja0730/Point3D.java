package ja0730;

public class Point3D extends Point {
	int z;
	
	Point3D (int x, int y, int z) {
		super(); // Point() default constructor
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	@Override
	public String toString() {
	    return String.format("coordination: (%d, %d, %d)", x, y, z);
	}
}
