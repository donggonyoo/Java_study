package chap9.test;

import chap9.test.Outer1.Inner1;
import chap9.test.Outer1.Inner2;

/*
 * Outer1클래스의 내부 클래스 Inner1, Inner2 의 멤버변수 iv의 값 출력 하기
 */
class Outer1 {
	class Inner1 {
		int iv = 100;
	}
  static class Inner2 {
		int iv = 200;
	}
}
public class Test2 {
	public static void main(String[] args) {
		Inner1 inner1 = new Outer1().new Inner1();
		System.out.println("inner1.iv : "+inner1.iv);
		
		Inner2 inner2 = new Outer1.Inner2();
		System.out.println("inner2.iv : "+inner2.iv);
		

	}
}
