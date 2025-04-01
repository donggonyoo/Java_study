package chap10;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 화면에서 1~10사이 숫자 입력받아 숫자만큼 * 출력
 * 입력값이 숫자아닌경우 InputMismatchException 예외발생
 * 예외발생시 숫자만입력하세요 메시지 출력하기 -> 다시 숫자입력받기
 * catch scan.next(); 추가하기
 * 
 * 1~10사이의 숫자가 아닌경우 NumberInputException 클래스의 예외발생하고
 * 다시숫자입력받기
 */
public class Exam3_A {
	public static void main(String[] args) {
		while(true) {
			System.out.println("숫자입력하세요(0입력시 종료)");
			Scanner scan = new Scanner(System.in);
			try {
			int num = scan.nextInt();
			if(num==0) {
				break;
			}
			for (int i = 0; i < num; i++) {
				System.out.print("* ");
			}
			}
			catch(InputMismatchException e) {
				System.out.println("메시지 : "+e.getMessage());
				System.out.println("숫자만입력해요");
				scan.next();
			}
		}
	}
}
