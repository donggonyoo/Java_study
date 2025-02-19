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



class NumberInputException extends RuntimeException{
	NumberInputException(String msg){
		super(msg);
	}
}

public class Exam3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			try {
				System.out.print("숫자 입력하세요 : ");
				int num = scan.nextInt();
				if(10<num || 1>num) {
					throw new NumberInputException("1~10만 하세요");
				}
				for (int i = 0; i < num; i++) {
					System.out.print("* ");
				}
				break;

			} 
			catch (InputMismatchException e) {
				System.out.println("숫자만입력하세요 ");
				System.out.println("예외명 : "+e.getClass());
				scan.next();
			}
//			catch(NumberInputException e ) {
//				//RuntimeException은 예외를 잡지않아도 되지만
//				//반복을 위해 잡았음
//				System.out.println("예외명 : "+e.getClass());
//				System.out.println(e.getMessage());
//			}


		}
	}

}
