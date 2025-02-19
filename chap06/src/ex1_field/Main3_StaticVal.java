package ex1_field;

public class Main3_StaticVal {
	public static void main(String[] args) {
		

		                       //Car2.cnt : 0 
		System.out.println("Car2.cnt : "+Car2.cnt);
		Car2 car1 = new Car2();
		car1.color="White";
		car1.num = 1234;
		car1.sno = ++Car2.cnt; //Car2.cnt : 1
		//cae1.sno = 1
		System.out.println("++Car2.cnt");
		System.out.println(car1);
		
		//static int cnt 는 객체화와는 아무런관련이없고
		//오직 클래스에만 관련. 
		//객체를 10개를 만들어도 클래스 변수값은 동일
		
		
		Car2 car2 = new Car2();
		car2.color="Black";
		car2.num = 5678;
		car2.sno = ++Car2.cnt; //Car2.cnt :2  (클래스변수)
		//car2.sno = 2;
		System.out.println("++Car2.cnt");
		System.out.println(car1);
		System.out.println(car2);
		
	}

}
