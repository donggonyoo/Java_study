package chap8;
/*
 * 인터페이스의 default , static 메서드
 * -java8 이후에 사용가능한 메서드
 * 인터페이스에서 구현부가 존재하는 메서드다.
 * --default 메서드 : 인스턴스멤버 (객체화가 되어야 사용가능 )
 * --static 메서드 : 클래스멤버 ( 인스턴스명.메서드 로 호출가능)
 * 
 * * 다중구현이 가능
 *     -  추상메서드 중복된 경우 : 하나만 오버라이딩
 *     - default 메서드가 중복된 경우 : 오버라이딩필요
 *     --default 메서드가 중복되지 않으면 : 오버라이딩 필수X
 *     --static메서드는 중복되어도 상관없음. 인터페이스명.메서드로 접근
 */

interface MyInterface1{
	void method();
	default void method1() {
		System.out.println("MyInterface1의 default메서드 : method1");
	}
	static void method2() {
		System.out.println("MyInterface1의 static메서드 : method2");
	}
}

//-------------------------------------------------------------------------------

interface MyInterface2{
	void method();
	
	default void method1() {
		System.out.println("MyInterface2의 default메서드 : method1");
	}
	
	static void method2() {
		System.out.println("MyInterface2의 static메서드 : method2");
	}
}

//-------------------------------------------------------------------
class Parent{
	public void pmethod() {
		System.out.println("Parent클래스의 멤버 메서드 : pmethod");
	}
}
//----------------------------------------------------------------------------

//구현한 두개의 인터페이스의 이름이똑같은 추상메서드가 존재한다면 한개만 오버라이딩됨
//default메서드는 클래스에서 오버라이딩 시 public으로 바뀌게 됨

class Child extends Parent implements MyInterface1,MyInterface2{

	
	public void method() {
		System.out.println("Child클래스에서 method() 오버라이딩");
	}

	@Override
	public void method1() {
//		MyInterface1.super.method1(); 
//		MyInterface2.super.method1();
		System.out.println("Child클래스에서 default메서드를 오버라이딩함 : method1");
	}
	
}

//------------------------------------------------------------------------------------

public class InterfaceEx5 {
	public static void main(String[] args) {
		Child c = new Child();
		c.method();
		c.method1();
		c.pmethod();//자식객체 생성 시 부모객체를 가지고있음
		
		MyInterface1.method2(); //static
		MyInterface2.method2();	
	}
}
