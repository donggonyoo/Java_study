package ex3_String;

/*
 * String 클래스
 * 	정적인 문자열 , 변경 불가 문자열 객체
 *   + 연산자가 가능한 유일한클래스
 *   대입연산자를 이용해 객채생성이 가능한 유일한 클래스
 *   final(불변 , 하위 클래스를 둘 수 없는)클래스임
 *   
 */
public class StringEx1 {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "abc";
		System.out.println("s1 == s2 : "+(s1==s2));
		System.out.println("(s1.equals(s2)) : "+(s1.equals(s2)));
		System.out.println("  ");
		String s3 = new String("abc");
		String s4 = new String("abc");
		System.out.println("s3 == s4 : "+(s3==s4));
		System.out.println("(s3.equals(s4)) : "+(s3.equals(s4)));
		
		System.out.println("System.identityHashCode(s1) :"+System.identityHashCode(s1));
		System.out.println("System.identityHashCode(s2) :"+System.identityHashCode(s2));
		System.out.println("System.identityHashCode(s3) :"+System.identityHashCode(s3));
		System.out.println("System.identityHashCode(s4) :"+System.identityHashCode(s4));
	}
}
