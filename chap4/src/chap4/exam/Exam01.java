package chap4.exam;

import java.util.Scanner;

/*
 * 숫자를 받아 
 * 1.양수 음수 영 출력
 * 2. 짝수 홀수 출력
 */
public class Exam01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.print("숫자를 입력하세요 : ");
			int a = scan.nextInt();
			if(a>0) {
				System.out.println("양수");
			}
			else if(a==0) {
				System.out.println("영");
			}
			else {
				System.out.println("음수");
			}
			//System.out.print(a>0?"양수":num<0?"음수":"영");

			if(a%2==0) {
				System.out.println("짝수");
			}
			else {
				System.out.println("홀수");
			}
			/* System.out.println(a%2==0?"짝수":"홀수"); */
		}

	}

}

