package chap3.test;

import java.util.Scanner;

/*
 * 숫자를 입력받아 양수인경우에는 양수 , 
 * 음수인경우 음수 , 0인경우 영 출력
 * 짝수이면 짝수 , 홀수이면 홀수 출력
 */
public class Ex3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		
		for (int i = 0; i < 5; i++) {
			System.out.println("숫자를 입력하세요 :");
			int var = scan.nextInt();

			String result = var>0?"양수":(var==0)?"영":"음수";
			System.out.println(var+" : "+result);
			System.out.println(var+":"+((var%2!=0)?"홀수":"짝수"));
			
		}
		
	}
}
