package chap3;

import java.util.Scanner;

public class OpEx6 {
	/*
	 * 조건연산자(삼항연산자) : 조건문으로 변경이가능
	 * (조건문)? 참 : 거짓
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < 3; i++) {
			System.out.print("점수를 입력하세요 : ");
			int score = scan.nextInt();
//			System.out.println(score+"점은 "+((score>=60)?"합격":"불합격"));
			System.out.println(score+"점 : "
					+((score>=70)?"합격": (score >=60)?"재시험":"불합격"));	
		}
		
	}

}
