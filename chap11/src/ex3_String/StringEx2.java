package ex3_String;

public class StringEx2 {
	public static void main(String[] args) {
		String s = new String("ABCDEFGH");
		//s.charAt(4) : s문자열 중 4번인덱스 해당하는 문자 리턴
		System.out.println(s.charAt(4));//4번인덱스 문자열  E
		//s.compareTo("abc") : s문자열과 "abc" 문자열을 비교해 차이값 정수로리턴
		//정렬에 사용됨
		//결과값이 양수 : s 문자열이 "abc" 문자열 뒤
		//결과값이 음수 : s 문자열이 "abc" 문자열 앞
		System.out.println(s.compareTo("abc"));//-32
		//IgnoreCase :  대소문자 상관없이
		System.out.println(s.compareToIgnoreCase("abcdefgh"));//0
		System.out.println();
		//마지막문자열이 GH??
		System.out.println(s.endsWith("GH"));//true
		//시작문자열이 AB??
		System.out.println(s.startsWith("AB"));//true
		System.out.println();
		//내용비교
		System.out.println(s.equals("ABCDEFGH"));
		System.out.println(s.equalsIgnoreCase("ABcdEfGH"));
		s="This is a String";
		//s.indexOf('i') : i문자의 인덱스값 리턴
		System.out.println(s.indexOf('i'));//2
		System.out.println(s.indexOf("is"));//2
		//s.lastIndexOf('i') ㅣ i 문자열의 뒤 우선 검색 후 리턴
		System.out.println(s.lastIndexOf('i'));//13
		//s.indexOf('i',3) : 3번인덱스부터 검색 i문자의 인덱스값 리턴
		System.out.println(s.indexOf('i',3));//5
		System.out.println();
		//s.length() : 문자열의 길이 리턴
		System.out.println(s.length());//16
		System.out.println();
		//문자열 치환
		System.out.println(s.replace("is", "QR"));//ThQR QR a String
		//정규식 활용한 문자열 치환
		System.out.println(s.replaceAll("is", "QR"));

		
		
	}
}
