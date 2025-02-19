package chap10;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 화면에서 정수형 숫자를 입력받아서 정수형 숫자인 경우 숫자만큼 * 출력하고
 * 정수형 숫자가 아닌경우 숫자만 입력하세요 메시지 후 초기화
 *InputMismatchException
 */
public class Exam2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while(true) {
			try {
				System.out.print("정수를 입력하세요 : ");
				int num = scan.nextInt();
				
				for (int k = 0; k < num; k++) {
					System.out.printf("%4s","*");

				}System.out.println();
				break;

			} catch (InputMismatchException e) {
				System.out.println("예외명 : "+e.getClass());
				System.out.println("예외 메시지 : "+e.getMessage());
				System.out.println("숫자만 입력하세요 !!\n");	
				scan.next();//표준입력버퍼의 내용을 제거
				//이게없다면 숫자가 아닌문자를 입력 시
				//nextInt()로 문자를 읽을 수 없으므로
				//Scanner 안에 문자가 계속남아  무한출력.
				
				
			}
			
			
		}	
	}
}
