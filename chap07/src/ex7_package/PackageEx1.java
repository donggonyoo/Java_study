package ex7_package;
//import java.util.*; //java.util 패키지의 모든클래스는 패키지명을 생략해서 사용하겠단뜻(권장하진않음
import java.util.Date;
import java.util.Scanner;

/*
 * 패키지 예제
 * package
 *   - 클래스들의 모임
 *   -패키지의 설정은 파일의 처음에 한번만 기술해야 함
 *   => 같은 파일에 존재하는 모든 클래스는 같은 패키지에 속한 클래스임.
 *   
 *import : 클래스이름의 패키지명을 생략할수있도록 미리선언 
 *
 *클래스의 패키지명을 생략 할 수 있는경우
 *1.같은 패키지에 속한 클래스는 패키지명 생략가능
 *2.java.lang 패키지에속한 클래스는 패키지명을 생략가능(String, System)
 * 3.import구문으로 선언된 클래스는 패키지명 생략가능
 *      * 표현방식으로는 해당 패키지의 모든클래스들은 패키지명 생략가능
 *
 */

class Pack1{
	void method() {
		System.out.println("ex7_package.Pack1 클래스의 method()메서드");
	}
}

public class PackageEx1 {
	public static void main(String[] args) {
//		ex7_package.Pack1 p1 = new ex7_package.Pack1(); //패지지명이 생략
		Pack1 p1= new Pack1();
		System.out.println("p1.getClass() : "+p1.getClass()); //패키지와클래스출력
		p1.method();
		
	
		Scanner scan = new Scanner(System.in);
		System.out.println("scan.getClass : "+scan.getClass());
		
		Date date = new Date();

	}

}
