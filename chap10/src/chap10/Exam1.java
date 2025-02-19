package chap10;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 화면에서 정수형 숫자를 입력받아서 정수형 숫자인 경우 숫자만큼 * 출력하고
 * 정수형 숫자가 아닌경우 숫자만 입력하세요 메시지
 *InputMismatchException
 */
public class Exam1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i <3; i++) {
			try {
				System.out.print("정수를 입력하세요 : ");
				int num = scan.nextInt();
				for (int k = 0; k < num; k++) {
					System.out.printf("%4s","*");

				}System.out.println();

			} catch (InputMismatchException e) {

				System.out.println("예외명 : "+e.getClass());
				System.out.println("오류메시지 : "+e.getMessage());
				System.out.println("숫자만 입력하세요 !!");
				break;	
			}	
		}	
	}
}
