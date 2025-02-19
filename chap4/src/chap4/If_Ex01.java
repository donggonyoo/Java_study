package chap4;

import java.util.Scanner;

/*
 * if / else if / else
 * if(조건식1){조건식1이 참인경우 실행되는 문장들}
 * else if(조건식2){조건식1이거짓이고 조건식2가 참}
 * else if(조건식3){조건식1,2 거짓이고 조건식3가 참}
 * else{모든조건식이 거짓일 때 실행}
 */
public class If_Ex01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.print("점수를 입력 : ");
			int score = scan.nextInt();
			if(score >=60) {
				System.out.println("합격");
			}
			else {
				System.out.println("불합격");
			}

			if(score>=90) {
				System.out.println("A");
				System.out.println("good");
			}
			else if(score>=80) {
				System.out.println("B");
			}
			else if(score >= 70) {
				System.out.println("C");
			}
			else if(score >= 60) {
				System.out.println("D");
			}
			else {
				System.out.println("F");
			}
		}

	}

}




