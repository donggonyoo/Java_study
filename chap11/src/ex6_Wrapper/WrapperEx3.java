package ex6_Wrapper;

/*
 * switch 구문에서 조건값으로 사용할 수 있는 자료형
 * char      byte   short    int        String 
 * 
 * Character Byte  Short   Integer
 */

public class WrapperEx3 {
	public static void main(String[] args) {
		Integer c = 0;
//		Character c = 0;
//		Short c  = 0;
		
		switch(c) {
		case 0 ->System.out.println("하하");
		default -> System.out.println("switch 조건값 테스트");
		}
	}
}
/*
 * java.lang 패키지의 클래스
 * Object : 모든 클래스의 부모 클래스
 * String : 문자열객체 ,정적인 문자열(불변)
 * StringBuffer , StringBuilder : 동적인 문자열, equals 메서드 오버라이딩 안됨
 * Math : 객체화불가능 , 상속불가능 ,모두 클래스멤버임(static) Math.멤버 로 접근
 * Wrapper : 자료형을 객체화하기위한 클래스 .
 * 
 * 
 * 
 */
