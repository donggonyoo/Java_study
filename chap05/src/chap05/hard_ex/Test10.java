package chap05.hard_ex;

import java.util.Scanner;

/*
다음은 주어진 문자열(value)이 숫자인지를 판별하는  프로그램을 작성하시오.
  String 함수 charAt(i), length() 을 사용함.

[결과]
숫자만 입력하세요
123
123는 숫자 입니다.
  
숫자만 입력하세요
123@12
123@12는 숫자가 아닙니다.

*/

public class Test10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		String next = scan.next();
		char[] ch = next.toCharArray();
		int count=0;
		
		for (int i = 0; i < ch.length; i++) {
			if('0'<= ch[i] && ch[i]<= '9') {
				count++;
			}
			else {
				if(i==0 && ch[i]=='-') {
					count++;
				}
				else {
				System.out.println("오류명 : "+ch[i]+"부분이 숫자X : "+(i+1)+"번째숫자");}
			}
			
		}
		if(count==ch.length) {
			System.out.println(next +"는 숫자");
		}
		else {
			System.out.println(next+"는 숫자가 아니에요");
		}

	}

}
