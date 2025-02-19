package ex4_Overloading;
/*
 * 오버로딩 메서드의 선택기준
 * 1.호출되는 인자값의 자료형 == 메서드에선언된 매개변수의 자료형 
 * 2. 1의조건이없는경우 
 * 		최소갯수로 자동형변환이 가능한 메서드 선택.
 * 		(주의사항)=> 동일조건 메서드가 여러개인경우는 오류발생
 * 
 */
class Adder2{
	int add(int a, int b) {
		System.out.print("1 : ");
		return a+b;
	}
//	int add(int x, int y) {
//		System.out.print("1 : ");
//		return x+y;
//	} 매개변수이름만 바꾸면 성립X
	
//	double add(int a , int b) {
//		return a+b;
//	}타입은 상관이없음 매개변수가 바뀌어야함
	
	long add(long a, int b) {
		System.out.print("2 : ");
		return a+b;
	}
	long add(int a, long b) {
		System.out.print("3 : ");
		return a+b;
	}//매개변수의 위치를 바꾸면 성립 O
	
	long add(long a, long b) {
		System.out.print("4 : ");
		return a+b;
	}
}
public class OverloadingEx2 {
	public static void main(String[] args) {
		Adder2 adder2 = new Adder2();
		
		System.out.println(adder2.add(10, 10));
		//int int (1) 만약에int int매개변수를 가진 메서드가없다면
		//만들거나 자동형변환이 되더라도 앞에 타입을 붙여주자
		
		System.out.println(adder2.add(10, 10L));
		//int long (2)
		System.out.println(adder2.add(10L, 10));
		//long int (3)
		System.out.println(adder2.add(10L, 10L));
		// long long (4)
		System.out.println(adder2.add('A', '0'));
		//int가 가장 가까움
		
		
	}

}
