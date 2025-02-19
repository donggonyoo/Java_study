package chap05.hard_ex;

import java.util.Scanner;

/*
 * 숫자 맞추기
 * 컴퓨터가 1~100 사이의 임의의 정수를 저장하고,
 * 사용자는 숫자를 입력하여 컴퓨터 저장한 숫자를 맞추기
 * 시스템 : 37 가정
 * [결과]
 * 1~100사이의 숫자를 입력하세요
 * 50
 * 작은수입니다.
 * 25
 * 큰수입니다.
 * 40
 * 작은수입니다.
 * 37
 * 정답입니다. 
 * 프로그램종료합니다.
 */
public class Test02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int ran = (int)(Math.random()*100)+1;
		
		
		while(true) {
			System.out.println("1~100 사이 정수 입력 ");
			int num = scan.nextInt();
			if(num==ran) {
				System.out.println("시스템 : "+ran);
				System.out.println("사용자 : "+num);
				System.out.println("* 정답 * ");
				break;
			}
			else if(num > ran) {
				System.out.println("작은 수입니다");
			}
			else {
				System.out.println("큰 수 입니다");
			}
			
			
		}

	}
}
