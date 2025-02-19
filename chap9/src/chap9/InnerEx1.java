package chap9;

import chap9.Outer1.InstanceInner;
import chap9.Outer1.StaticInner;

/*
 * 내부클래스 : 클래스내부에존재하는 클래스
 * 인스턴스내부클래스 : 객체화가 되기 위해서는 외부클래스의 객체화 필요  -> 
 *                                 외부클래스참조변수.new 내부클래스명();
 *                                 new 외부클래스().new 내부클래스();
 *                                 
 * static 내부클래스 : 객체화가 되기 위해서는 -> new 외부클래스명.내부클래스명();
 * 
 * 지역 내부클래스  : 메서드 내부에서 선언된 내부클래스
 * 				 선언된 메서드 내에서만 사용할 수 있다.
 * 
 * 내부클래스 특징
 * 1.참조자료형으로 사용됨 . 외부클래스명.내부클래스명
 * 2. 객체화가능 
 * 멤버소유가능 , 생성자 구현가능
 * 
 * 외부클래스의멤버임.
 * 1.외부클래스의 private멤버에 접근가능
 * 2.인스턴스내부클래스 : 인스턴스멤버
 * 3.static내부클래스 : 클래스멤버
 */
class Outer1{
	int iv=40;
	static int cv=30;
	
	class InstanceInner{//내부클래스
		int iv=100;
		static int cv = 10;
		final static int MAX = 200;
		int outerIv= Outer1.this.iv;//바깥클래스 멤버 접근법
	}
	
	static class StaticInner{//static 내부클래스
		int iv=300;
		static int cv = 400;
		final static int MAX = 500;
	}
	
	void method() {//Outer1의 멤버
		
		class LocalInner{//Local내부클래스
			int iv=600;
			static int cv = 700;
			final static int MAX = 800;

		}
		LocalInner lc = new LocalInner();//객체화
		
		System.out.println("====="+lc.getClass()+"====");
		System.out.println("lc.iv : "+lc.iv);
		System.out.println("lc.cv : "+LocalInner.cv);
		System.out.println("LocalInner.MAX : "+LocalInner.MAX);
		System.out.println("this.iv : "+this.iv);//외부클래스(자신의클래스) 멤버 접근가능
	}
	
	void method2() {
//		LocalInner lc = new LocalInner();
		//오류발생 , method()내부에서만 호출가능한 내부클래스
	}
}
public class InnerEx1 {
	public static void main(String[] args) {
		Outer1 outer1 = new Outer1();
		
		InstanceInner i = outer1.new InstanceInner();//내부클래스 생성법1
		InstanceInner i2 = new Outer1().new InstanceInner();//생성법2
		System.out.println("======= 내부클래스 =======");
		System.out.println("i.iv : "+i.iv);
		System.out.println("i.cv : "+InstanceInner.cv);
		System.out.println("outerIv : "+i.outerIv);
		System.out.println("InstanceInner.MAX : "+InstanceInner.MAX);
		
		StaticInner s = new Outer1.StaticInner();//static클래스 생성법
		System.out.println("======static 내부 클래스=======");
		System.out.println("s.iv : "+s.iv);
		System.out.println("s.cv : "+StaticInner.cv);
		System.out.println("StaticInner.MAX : "+StaticInner.MAX);
		StaticInner s2 = new StaticInner();//그냥 클래스만으로도 생성가능
		
		
		outer1.method();//지역클래스는 메서드안에서만사용됨
	}
	

}
