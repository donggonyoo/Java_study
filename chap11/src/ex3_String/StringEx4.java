package ex3_String;

public class StringEx4 {
	public static void main(String[] args) {
		String str = "This is a String";
		//subString () : 부분 문자열
		//subString(5) : 5번 인덱스 이후의 부분문자열
		System.out.println(str.substring(5));
		System.out.println(str.substring(5,10));
		
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		str = "   문자열 trim 메서드    ";
		System.out.println(str);
		System.out.println(str.trim());
		System.out.println("str.trim().length() : "+str.trim().length());
		System.out.println("str.length() : "+str.length());
		
		str = "홍길동,이몽룡,김삿갓,abc";
		//split(분리 기준 문자열): 문자열을 기준문자열로 나누어 배열로저장
		String[] split = str.split(",");
		for (String string : split) {
			System.out.println(string);
		}
		
		//문자열을 한개의 char로 분리해 배열로리턴
		char[] cArray = str.toCharArray();
		for (char c : cArray) {
			System.out.print("["+c+"]");
		}
		System.out.println();
		
		str = "abcdefghiz"; //소문자의아스키코드 97~122  대문자 : 65~80
		byte[] barr = str.getBytes();
		for (byte b : barr) {
			System.out.print(b+",");
		}System.out.println();
		
		
	}
	

}
