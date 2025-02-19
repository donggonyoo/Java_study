package chap9;

import chap9.Outer2.InstanceInner;
import chap9.Outer2.StaticInner;

class Outer2{
	private int outeriv = 10;
	private static int outercv=20;
	
	class InstanceInner{
		int iiv = outeriv;
		int iiv2 = outercv; //인스턴스멤버 -> 클래스멤버 (접근 가능)
	}
	
	static class StaticInner{
//		static int scv = outeriv;   클래스멤버->인스턴스멤버 (호출불가능) //객체화해야함
		static int scv = new Outer2().outeriv;
		static int scv2 = outercv;
		int siv2 = outercv;
	}
	/*
	 * 지역내부클래스에 사용되는 메서드의 지역변수는 상수화되어야함
	 * 지역변수의 변경이 없는경우는 상수로 판단함
	 * 지역변수의 변경은 안됨
	 */
	void method(int pv) {
		int lv=100;
//		lv++;지역변수의 변경은 안됨
		class LocalInner{
			int liv = outeriv;
			int liv2 = outercv;
			void method(int num) {
				System.out.println("===== LocalInner 클래스 =====");
				System.out.println("outeriv : "+outeriv);
				System.out.println("outercv : "+outercv);
				System.out.println("liv : "+ ++liv);//내부클래스의 멤버변수
				System.out.println("liv2 : "+ ++liv2);//내부클래스의 멤버변수
				System.out.println("num :  "+ ++num);//내부메서드의 지역변수 100
				System.out.println("pv : "+pv);//외부메서드의 지역변수 : 0
				System.out.println("lv : "+lv); // 외부메서드의 지역변수 . 100
			}
		}
		LocalInner l = new LocalInner();
		l.method(100);
	}
}

public class InnerEx2 {
	public static void main(String[] args) {
		Outer2 outer2 = new Outer2();
//		outer2.iv;    호출불가  private멤버
		
		//InstacneInner, StaticInner 내부의멤버출력하기
		System.out.println("===== InstanceInner 클래스 =====");
		InstanceInner i = outer2.new InstanceInner();
		System.out.println("i.iiv : "+ ++i.iiv);
		System.out.println("i.iiv2 : "+ ++i.iiv2);

		
		System.out.println("===== StaticInner 클래스 =====");
		StaticInner s = new Outer2.StaticInner();
		System.out.println("StaticInner.scv : "+Outer2.StaticInner.scv);
		System.out.println("StaticInner.scv : "+Outer2.StaticInner.scv2);
		System.out.println("s.siv2 : "+s.siv2);
		
		outer2.method(90);
		
	}

}
