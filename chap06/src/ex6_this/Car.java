package ex6_this;

public class Car {
	String color;
	int number;
	int seriaNo;
	static int sno;
	
	Car(String color , int number){
		System.out.println("@Car(String , int) 생성자@");
		this.color = color;
		this.number = number;
		this.seriaNo = ++sno;
	}
	
	Car(){
		//매개변수 형이 (String , int)인 다른생성자 호출
		this("white",11441); //생성자는 무조건 상단에위치
		System.out.println("Car() 생성자");
		
//		color = "White";
//		number = 1141;
//		this.seriaNo = ++sno;
	}

	public Car(String color) {
		this(color,111);
		System.out.println("Car(String) 생성자");
		
	}

	public Car(int i) {
		this("white",i);
		System.out.println("car(int)생성자");
		
	}

	public Car(Car car) {
		this(car.color,car.number);
		System.out.println("Car(Car) 생성자");}

	@Override
	public String toString() {
		return seriaNo+"번자동차 "+"[color=" + color + ", number=" + number + "]";
	}
	
}
