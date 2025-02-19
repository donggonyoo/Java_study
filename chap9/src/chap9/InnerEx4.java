package chap9;

/*
 * 람다 객체에서의 this
 */

@FunctionalInterface
interface LambdaInterface{
	void method();
}

class Outer{
	public int iv=10;

	void method() {
		final int iv = 40;//바뀌면안됨
//		iv++;\
		LambdaInterface f;
		f = ()->System.out.println("@@람다객체에서의 this@@");
		f.method();
		
		f =()->{
			System.out.println("iv : "+iv);//외부메서드의 지역변수는 상수화가 필요함
			System.out.println("this.iv : "+this.iv);//Outer클래스의 멤버변수 호출
			System.out.println("Outer.this.iv : "+Outer.this.iv);//Outer클래스의 멤버변수 호출가능
		};
		f.method();
		
		
	}
	
}
public class InnerEx4 {
	public static void main(String[] args) {
		new Outer().method();
		
	}

}
