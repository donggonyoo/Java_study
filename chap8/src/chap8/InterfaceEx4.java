package chap8;

import java.security.DrbgParameters.NextBytes;
import java.util.Random;

/*
 * 추상클래스와 인터페이스를 이름없는 내부객체로 생성하기
 */
interface Action{
	void action();
}

abstract class Abs{
	int num=100;
	abstract void method();
}

public class InterfaceEx4 {
	private static void hello(Action a) {
		a.action();
	}
	
	public static void main(String[] args) {
		
		
		//내부객체
		Action a = new Action() {
			@Override
			public void action() {
				System.out.println("--Action 인터페이스의 action메서드--");
			}
			
		};a.action();
		
		//Abs 클래스의 객체생성 ( 익명클래스 활용)
		Abs abs = new Abs() {
			
			@Override
			void method() {
				System.out.println("--추상클래스Abs의 메서드--");
				System.out.println("num : "+num);
			}
			

		};abs.method();
		
		//람다식 : 함수객체
		a=()->System.out.println("람다방식으로Action인터페이스 구현");
		a.action();
		
		hello(()->{ //인터페이스를 하나정하고 그 인터페이스를 매개변수로받는 static형 메서드hello에 넣기
			int nextInt = new Random().nextInt(6)+1;
			System.out.println("하이");System.out.println(nextInt);
			});
	}
	
	

}
