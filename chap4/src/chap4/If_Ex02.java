package chap4;

import java.util.Scanner;

/*
 * if-else 조건문
 * if(조건식){
 * 조건식이 참인 경우 실행}
 * else{조건식이 거짓인 경우 실행되는 문장}
 */
public class If_Ex02 {
	public static void main(String[] args) {
		System.out.print("정수입력 : ");
		Scanner scan = new Scanner(System.in);
		
		int score = scan.nextInt();
		
		if(score>=60) {
			System.out.println("합격");
		}
		else {
			System.out.println("불합격");
		}
		
		
	}

}
