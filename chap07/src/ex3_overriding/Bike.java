package ex3_overriding;

public class Bike {
	int wheel;
	Bike(int wheel){
		this.wheel = wheel;
	}
	String drive() {
		return "패달을 밟아";
	}
	String stop() {
		return "브레이크를 잡아";
	}

}

class AutoBike extends Bike{
	
	private boolean power;

	AutoBike(int wheel) {
		super(wheel);
	}
	
	@Override
	//부모의기능을 자식이 쓸 수 없을 떄 사용함(오버라이딩)
	 String drive() { 
		if(power==true) {
		return "출발버튼 on";}
		else {return "시동켜줘";}
	}
	
	void power() {
		power = !power;
		if(power == true)
		System.out.println("시동을 켭니다");
		else {System.out.println("시동을끕니다");}
	}
	
}



