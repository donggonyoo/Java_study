package ex4_stringbuffer;
/*
 * StringBuffer , StringBuilder클래스 : 동적문자열
 * -- 같은메서드를 멤버로가짐
 * StringBuffer  : 기존클래스 , 스레드의 동기화된 메서드
 * StringBuilder  : jdk 5.0이후에 사용가능한 클래스 , 스레드의 비동기화된메서드
 * -- equals메서드가 오버라이딩 되어있지않음 . 내용비교안됨
 * ==> 내용비교를 위해서는 String객체로 변경해서 비교
 * -- 동적 문자열 . String클래스의 보조클래스로 사용함
 */
public class StringBufferEx1 {
	
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		//StringBuilder로 써도상관없음
		
		System.out.println("sb1==sb2 : "+(sb1==sb2));//같은객체냐?
		
		//equals() : 내용비교를 위해 오버라이딩 X
		System.out.println("sb1.equals(sb2) : "+(sb1.equals(sb2)));
		
		//내용비교를 위해서는 문자열반환이 필요
		System.out.println("sb1.toString().equals(sb2.toString()) : "+
				(sb1.toString().equals(sb2.toString())));
		
	
		System.out.println("@@ String Builder @@");
		StringBuilder sb3 = new StringBuilder("ABC");
		StringBuilder sb4 = new StringBuilder("ABC");
		System.out.println("sb3==sb4 : "+(sb3==sb4));//같은객체냐?
		
		//equals() : 내용비교를 위해 오버라이딩 X
		System.out.println("sb3.equals(sb4) : "+(sb3.equals(sb4)));
		
		//내용비교를 위해서는 문자열반환이 필요
		System.out.println("sb3.toString().equals(sb4.toString()) : "+
				(sb3.toString().equals(sb4.toString())));
	
	}

}
