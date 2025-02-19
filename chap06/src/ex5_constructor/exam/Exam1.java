package ex5_constructor.exam;
/*
 * Rectangle 클래스구현
 * 멤버 변수 : width , height
 * 생성자 : (int , int)매개변수 가진 생성자
 * 멤버메서드
 *   int area()
 *   int length()
 *   String toString() : (width,height),면적 , 둘레
 */

public class Exam1 {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(10,20);
		System.out.println("r : "+r);
		
		Rectangle r2 = new Rectangle(10);
		System.out.println("r2 : "+r2);
		
	}
	
	
}
