package ja0729;

public class Product {
	int count = 0;
	int serialNo;
	String pName;
	{
		this.serialNo = ++count;
	}
	
	Product(){}
	Product(String pName) {
		this.pName = pName;
	}
}
