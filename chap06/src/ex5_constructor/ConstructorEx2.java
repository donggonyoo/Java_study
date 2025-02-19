package ex5_constructor;

public class ConstructorEx2 {
	public static void main(String[] args) {
		Car c1 = new Car("Blue",1422);
		Car c2 = new Car("Blue");
		Car c3 = new Car(1982);
		Car c4 = new Car();
		System.out.println("c1 : "+c1);//생성자1
		System.out.println("c2 : "+c2);//생성자2
		System.out.println("c3 : "+c3);//생성자3
		System.out.println("c4 : "+c4);//기본생성자
	}
	

}
