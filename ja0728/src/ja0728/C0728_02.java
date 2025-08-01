package ja0728;

public class C0728_02 {

	public static void main(String[] args) {
		Tv t = new Tv();
		t.color = "pink";
		t.channel = 7;
		System.out.printf("color: %s, channel: %d", t.color, t.channel);
		
		System.out.println();
		Tv t2 = new Tv();
		t2.color = "white";
		t2.channel = 5;
		
		t2 = t;
		t.channelUp();
		System.out.printf("color: %s, channel: %d", t2.color, t2.channel);
	}

}
