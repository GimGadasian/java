package ja0729;

public class C0729_04 {
	public static void main(String[] args) {
		Data1 d1 = new Data1();
		d1.value = 20;
		Data2 d2 = new Data2(4);
	}
}

class Data1{
	Data1(){}
	int value;
}

class Data2{
	int value;
	Data2(int x) {
		value = x;
	}
}