package ex1_equals;

/*
 * equlas메서드를 오버라이딩
 * 모든객체의 내용비교는 equals 메서드로판단해야함
 */
public class EqualEx2 {
	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		String str3 = "abc";
		String str4 = "abc";
		 //이렇게생성하게되면 문자열풀을 이용함
		//자바에서 미리만들어둔 문자열모음 같은거임 (같은곳을 참조하게됨)
		
		if(str1==str2) {
			System.out.println("str1과 str2는 같은객체");
		}
		else {
			System.out.println("str1과 str2는 다른객체");
		}
		
		if(str1.equals(str2)) {
			System.out.println("str1과 str2는 같은 문자열");
		}
		else {
			System.out.println("str1과 str2는 다른 문자열");
		}
		
		System.out.println("@@ 문자열풀 이용 @@");
		if(str3==str4) {
			System.out.println("str3과 str4는 같은객체");
		}
		else {
			System.out.println("str3과 str4는 다른객체");
		}
		
		if(str3.equals(str4)) {
			System.out.println("str3과 str4는 같은 문자열");
		}
		else {
			System.out.println("str3과 str4는 다른 문자열");
		}
		
		
	}

}
