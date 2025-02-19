package chap10;

import java.io.IOException;
/*
 * 오버라이딩에서의 예외처리
 * 		부모클래스의 메서드의 예외처리보다 자손클래스의 메서드의 예외처리는 같거나
 * 		하위예외클래스로 선언해야함.(RuntimeException의 경우는 허용을 해줄수도있음)
 * 
 * 오버라이딩에서의 접근제어자 : 같거나 넓은범위만가능
 */
class Parent{
	public void method() throws ClassNotFoundException{
		System.out.println("Parent클래스의 method");
	}
}

//class Child extends Parent{
								
								//자식의 예외는 부모의 예외보다 큰 범위로 설정X
	//ex) IOException 예외는 ClassNotFoundException 의 상위이므로 에러발생
			
//	public void method() throws IOException{
//		System.out.println("child클래스의 method()");
//	}
//}
//public class ExceptionEx7 {
//	public static void main(String[] args) {
//		Child c = new Child();
////		c.method();
//	}
//
//}
