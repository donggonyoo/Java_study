package chap4.exam;

import java.util.Scanner;

/*
 * 화면에서 한개의 문자를 입력받아 대소문자 소문자 숫자 기타문자인지출력
 * [결과]
 * 한개의 문자입력 : A 
 * 대문자
 * 대문자의조건 65~96 (아스키코드) or 'A'<= ch <= 'Z'
 * 소문자의조건 97~122 (아스키코드) or 'a'<= ch <= z
 * 숫자조건 :48~57(아스키코드) or  '0' <= ch <= 9
 * 그외
 * 
 */
public class Exam02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.println("================");
			System.out.print("한개의 문자 입력 : ");
			String next = scan.next();
			char ch = next.charAt(0);//입력된문자의 첫번째 문자
			int ascii = ch; //char은 int보다 작음 (자동형변환가능)
			System.out.println("AsciiCode :"+ascii);

			if(65<=ascii && ascii<=96) {
				System.out.println("대문자");
				System.out.println("소문자 : "+(char)(ch+32));
			}
			else if('a'<=ch && ch<='z' ) {
				System.out.println("소문자");
				
				System.out.println("대문자 : "+(char)(ch-32));
			}
			else if('0'<= ch && ch<='9') {
				System.out.println("숫자 +20 ");
				int a = (int)(ch - '0');
				System.out.println(a+"+20 : "+(a+20));
			}
			else {
				System.out.println("기타문자");
			}

		}

	}

}
