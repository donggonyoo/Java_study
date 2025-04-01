package chap4.hardEx;

import java.util.Scanner;

/*
1.  화면에서 한개의 문자를 입력받아
     대문자인 경우는 소문자로, 
     소문자인 경우는 대문자로 
     숫자인 경우는 20을 더한 값을   출력하기
     그외의 문자는 기타 문자 를 출력하세요 

     소문자 = 대문자 + 32
     대문자 = 소문자 - 32
     '0'  : 48
     '1' : 49 => 21
     ('1'-'0')+20 = 21
     ('5'-'0')+20 = 25
 */
public class Test02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 4; i++) {
			System.out.print("한개의 문자 입력 : ");
			String next = scan.next();
			char ch = next.charAt(0);

			if('a'<= ch && ch<='z') {
				char a = (char) (ch - 32);
				System.out.println("대문자 : "+a);
			}
			else if('A'<= ch && ch<= 'Z') {
				char b = (char)(ch + 32);
				System.out.println("소문자 : "+b);
			}
			else if('0'<= ch && ch<= '9') {
				System.out.println("'"+ch+"'의 ascii : "+(int)ch);
				System.out.println("'0'의 ASCII : "+(int)'0');
				int a = (int)ch - '0';
				System.out.println("출력(+20) :"+ (a+20));
			}
			else {
				System.out.println("기본문자");
			}
		}

	}
}
