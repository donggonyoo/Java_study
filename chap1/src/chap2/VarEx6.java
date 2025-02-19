package chap2;

public class VarEx6 {
	public static void main(String[] args) {
		char single = '\''; 
		//문자(따옴표 등)앞에 \을 넣어주면 문자로인식
		System.out.println(single);
		
		String str  = "홍길동 , \"안녕\"";
		System.out.println(str);
		
		String dir ="C:\\Program Files (x86)\\hi.png";
		System.out.println(dir);
		
		System.out.println("서울\t대전\t대구\t부산");
		// \t : 수평탭 
		System.out.println("안녕하세요\n다음줄에 출력");
		
		System.out.println("\uD64D");
		//유니코드.2바이트문자.유니코드16진수코드값.
		
	}

}
