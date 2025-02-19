package ex4_Overloading;
/*
 * 메서드 오버로딩 : 메서드의 다형성
 * 조건
 * 1)같은클래스 내부에 같은 이름을 가진 메서드가 여러개존재가능
 * 2) 단 매개변수 목록달라야함 (자료형기준 : 갯수 , 순서 , 종류)
 * 			매개변수명은 상관X
 * 3) 
 */

class Adder{
	int a = 100;

	/*
	 * int add(int x) { 매개변수명이 다른것은 오버로딩X
	 *  System.out.print("1:"); return a+x; }
	 */
	
	int add(int b) {
		System.out.print("1:");
		return a+b;
	}
	
	double add(double b) { //위에 메서드 오버로딩
						//매개변수 만 다름
		System.out.print("2:");
		return a+b;
	}
	
	String add(String b) {
		System.out.print("3: ");
		return a+b;
	}
	
}
public class OverloadingEx1 {
	public static void main(String[] args) {
		Adder a = new Adder();
		System.out.println(a.add(10));
		System.out.println(a.add('A')); 
		//char은 int로 자동형변환가능
		System.out.println(a.add(8.5));
		System.out.println(a.add("!!!!"));
		System.out.println(a.add(100L));
		
		//double add 에 들어감
		//long은 double로 자동형변환 가능!
		
		
	}

}
