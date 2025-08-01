
public class Scv extends GroundUnit implements Repairable {
	Scv() {
		super(65);
	}
	
	void reqair(Repairable r) {
		Unit u =(Unit)r;
		while(u.hitPoint !=u.MAX_UP) {
			u.hitPoint++;
		}
	}
}
 