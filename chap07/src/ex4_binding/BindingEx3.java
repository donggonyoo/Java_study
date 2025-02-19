package ex4_binding;

public class BindingEx3 {
	public static void main(String[] args) {
//		Bike b = new Bike(2);
		Bike b = new AutoBike(2);

		AutoBike ab = null;
		Object o =null;
		//ClassCastException 참조할수없는 참조 변수로 객체를 참조하려할 때 발생

		if(b instanceof AutoBike) {
			ab = (AutoBike)b;
			System.out.println("ab 참조변수가 참조하는 객체는 AutoBike객체");
			System.out.println(ab.wheel);
			System.out.println(ab.power);
			ab.drive();
			ab.stop();
			ab.power();
		}

		if(b instanceof Bike) {
			System.out.println("b 참조변수가 참조하는 객체는 Bike객체");
			System.out.println(b.wheel);
//			System.out.println(b.power);
			b.drive();
			b.stop();
//			b.power();  자식의기능임
			
		
		}

		if(b instanceof Object) {
			o = b;
			System.out.println("o 참조변수가 참조하는 객체는 Object객체임");
			}
		
	}
}
