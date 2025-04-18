package chap7.ex5_abstract;

/*
 * @@@@  추상클래스간의 상속 @@@
 */

abstract class Abs1{ //추상클래스(추상메서드를 포함할수있는클래스)
	int a = 10;
	abstract int getA();//추상메서드(하위클래스에서 반드시오버라이딩해야함)
}
//------------------------------------------------------------------------------------
abstract class Abs2 extends Abs1{ //추상클래스는 추상메서드를 오버라이딩 안해도 됨
	int b = 20;
	abstract int getB();
	//abstract int getA();을가지고 있음
}
//---------------------------------------------------------------------------------------------------
class Normal extends Abs2{

	@Override
	int getB() {
		return b;
	}

	@Override
	int getA() {
		return a;
	}
	
}
//------------------------------------------------------------------------------------
public class AbstractEx1  {
	public static void main(String[] args) {
		Normal n = new Normal();
		System.out.println("Normal 멤버 ==========");
		System.out.println(n.a);
		System.out.println(n.getA());
		System.out.println(n.b);
		System.out.println(n.getB());
		
		Abs2 a2 = n;
		System.out.println("Abs2 멤버 =============");
		System.out.println(a2.a);
		System.out.println(a2.getA());
		System.out.println(a2.b);
		System.out.println(a2.getB());
		
		Abs1 a1 = a2;
		System.out.println("Abs1 멤버 =============");
		System.out.println(a1.a);
		System.out.println(a1.getA());
//		System.out.println(a1.b);    Abs1은   멤버 b를 가지고있지않음 .
//		System.out.println(a1.getB());
		
		Object o1 = a1;
		System.out.println("Object 멤버 =============");
		/*
		 *  System.out.println(o1.a);
		 *  System.out.println(o1.getA());
		 *  System.out.println(o1.b);
		 *  System.out.println(o1.getB());    
		 *  전부 Object의 멤버가 아님
		 */
		
		
		
		
	}
}
