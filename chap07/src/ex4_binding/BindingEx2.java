package ex4_binding;

/*
 *  1.  부모타입의 참조변수로  자손타입의 객체는 참조 가능
 *  2. 부모타입의 멤버와 자손타입의 멤버가 다를경우
 *     - 부모타입의 참조변수로 자식타입의 객체를 참조 시 , 부모타입의 멤버만호출가능
 *     ex) Parent p = new Child()
 *     - 자식타입의 참조변수로 자식타입의 객체를 참조 시(부모객체를 참조 하진 못함) , 부모의 멤버도 호출이가능 
 *     ex) Child c = new Child()
 *     
 *  3. 모든클래스의 객체는 Object 타입의 참조변수로 참조가 가능.
 *     Object 타입으로 참조된 객체는 Object 멤버만 호출이가능함 ex) toString, equals 등
 */
class Bike{
	int wheel;
	Bike(int wheel){
		this.wheel = wheel;}
	
	String drive() {
		return "패달을 밟아";}
	
	String stop() {
		return "브레이크를 잡아";}
}

class AutoBike extends Bike{
	
	boolean power;

	AutoBike(int wheel) {
		super(wheel);}
	
	void power() {
		power = !power;}	
}

public class BindingEx2 {
	public static void main(String[] args) {
		AutoBike ab = new AutoBike(2);
		System.out.println("바퀴 수 : "+ab.wheel);
		ab.power();
		ab.drive();
		ab.stop();
		
		Bike b = ab; // 부모 <- 자식  : 자동형변환
		System.out.println("바퀴 수 : "+b.wheel);
//		b.power();
		b.drive();
		b.stop();	
		
		Object o =b;
//		o.power();
//		o.drive();
//		o.stop();
		
	}
}
