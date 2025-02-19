package ex1_field;

public class Main1 {

	public static void main(String[] args) {
		System.out.println("자동차의크기 : "+Car1.width+","+Car1.height);
//		System.out.println("자동차의 색상 : "+Car.color);
		//color는 인스턴스변수이므로 객체화 필요
		
		//car1,car2 : main메서드에서 선언됨 (지역변수)
		Car1 car1 = new Car1();
		car1.color = "blue";
		car1.num = 4245;		
		System.out.println(car1);
		
		Car1 car2 = new Car1();
		car2.color = "White";
		car2.num = 3242;		
		System.out.println(car2);
		
		car1.width = 80; 
		//클래스변수를 바꾸면 참조에상관없이 클래스 정보가바뀜
		//car1 , car2 의 모든 클래스 변수가 바뀜
		//car1 객체가 static 변수를 가지고 있지 않기때문!
		//static변수는 힙영역(객체인스턴스의 위치)
		//           이 아닌 static 영역에서 따로 관리
		car1.height = 50;
		
		Car1.height = 100;Car1.width=60;
		//이렇게 클래스에 직접접근하는걸 권장
		
		System.out.println(car1);
		System.out.println(car2);
		
		//객체의 주소값
		System.out.println(Integer.toHexString(car1.hashCode()));
		System.out.println(Integer.toHexString(car2.hashCode()));

	}

}
