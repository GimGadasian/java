
public class Person {
	long id; // 주민번호
	String name;
	String address;
	
	Person(){}
	
	Person(long id, String name, String address){
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean temp = false;
		if (this.id == ((Person)obj).id && this.name.equals(((Person)obj).name)) {
			temp = true;
		}
		return temp;
	} 
	
//	@Override
//	public String toString() {
//		return ""+id;
//	}
	
}
