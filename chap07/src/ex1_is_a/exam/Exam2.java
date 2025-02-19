package ex1_is_a.exam;


class Car{
	
	public Car(String name){
		System.out.println(name);
	}
	void charge() {
		System.out.println("연료를 채운다");
	}
	void start() {
		System.out.println("출발");
	}
	void brake() {
		System.out.println("시동을 건다");
	}
}

class ElectricCar extends Car{

	public ElectricCar(String name) {
		super(name);
	}

	@Override
	void charge() {
		System.out.println("전기를 충전한다");
	}
	
	
}
public class Exam2 {
	public static void main(String[] args) {
		Car car = new Car("K5");
		car.start();
		car.brake();
		car.charge();
		
		ElectricCar eCar = new ElectricCar("EV6");
		eCar.start();
		eCar.brake();
		eCar.charge();
	}

}
