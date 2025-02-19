package ex3_overriding;

/*
 * 오버라이딩 예제
 *     -상속관계에서 나타남
 *     - 부모클래스의 메서드를 자손클래스에서 재정의 . (메서드의재정의)
 *     -부모클래스의 메서드의 선언부와 자손클래스의 메서드의선언부가 같아야함.
 *     (아예 똑같은 메서드여야 한단 뜻) 매개변수가다르거나 타입이 다르면 안됨
 *     단, 접근제어자는 넓은 범위로가능 . 예외처리는 좁은범위로 가능
 */
public class OverrdingEx1 {
	public static void main(String[] args) {
		AutoBike autoBike = new AutoBike(10);
		autoBike.power();
		System.out.println(autoBike.drive());
		System.out.println(autoBike.stop());
		
		System.out.println();
		Bike bike = new Bike(2);
		System.out.println(bike.drive());
		System.out.println(bike.stop());
	}
}
