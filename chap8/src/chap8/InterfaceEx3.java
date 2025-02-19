package chap8;

/*
 * interface를 매개변수로 사용
 */

class Unit{
	int hp;
	final int MAX;
	public Unit(int hp) {
		this.hp = hp;
		MAX = hp;
	}
}

//-----------------------------------------------------------------

interface Repariable {}

//-----------------------------------------------------------------

class Tank extends Unit implements Repariable{
	public Tank() {
		super(150);
	}
	public String toString() {
		return "탱크 ";
	}
}
//-----------------------------------------------------------------

class Marine extends Unit implements Repariable{
	public Marine() {
		super(130);
	}
	public String toString() {
		return "마린 ";
	}
}

//-----------------------------------------------------------------

class SCV extends Unit implements Repariable{
	public SCV() {
		super(50);
	}
	
	void repair(Repariable r) {
		if(r instanceof Unit) {
			Unit u = (Unit)r; // 형변환 
			u.hp = u.MAX;
			System.out.println(r+"수리완료");
		}
	}
	public String toString() {
		return "SCV";
		
	}
}

//-----------------------------------------------------------------

public class InterfaceEx3 {
	public static void main(String[] args) {
		Marine m = new Marine();
		Tank t = new Tank();
	
		SCV scv = new SCV();
		scv.repair(m);
		scv.repair(t);
		scv.repair(scv);
		
	}

}
