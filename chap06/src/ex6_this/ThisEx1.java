package ex6_this;
/*
 * this예약어
 * this참조변수 : 자기참조변수
 * 		현재객체의 참조값저장
 * 		인스턴스 메서드에서 지역변수로 선언되고 , 객체 생성시 자기참조를 저장
 * 		지역변수와 멤버변수 구분 시 사용
 * 		지역변수의 이름과 멤버변수의 이름이 같은경우 < 지역변수
 * 		==> this 참조변수 이용해 멤버변수 호출가능
 * 
 * this() 생성자: 동일한 클래스의 다른 생성자 호출 시 사용 		
 */
public class ThisEx1 {
	public static void main(String[] args) {
		Car car = new Car();
		System.out.println(car+"\n");
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
		Car car2 = new Car("blue",523);
		System.out.println(car2+"\n");
		
		Car car3 = new Car("Red");
		System.out.println(car3+"\n");//3번자동차 : Red , 111
		
		Car car4 = new Car(1234);
		System.out.println(car4+"\n");//4번자동차 White 1234
		
		Car car5 = new Car(car);
		System.out.println(car5+"\n"
				);//5번자동차 blue 523
	}
}
