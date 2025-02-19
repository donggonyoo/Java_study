package ex1_is_a;

public class Phone {
	private boolean power;
	int number;
	
	void power() {
		power = !power;
	}
	
	void send() {
		if(power) {
			System.out.println("전화걸기");
		}
		else {
			System.out.println("전원이 꺼져있어..");
		}
	}
	
	void receive() {
		if(power) {
			System.out.println("전화받기");
		}
		else {
			System.out.println("전원이 꺼져있어..");
		}
	}

}
