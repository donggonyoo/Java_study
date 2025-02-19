package chap4;

import java.util.Scanner;

/*
 * 중첩if문 : if구문 내에 if구문이 존재
 */
public class If_Ex03 {
	public static void main(String[] args) {
		int score= 80;
		if(score>=65) {
			System.out.println("합격");
			if(score>=80) {
				System.out.println("good");}
		}
		else {
			System.out.println("불합격");
		}
		
		System.out.println("중첩if문 예시");
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 4; i++) {
			System.out.print("숫자 입력 : ");
			int num = scan.nextInt();//숫자입력
			if(num<=10) { //10보다작으면 실행
				if(num>=9) { //10보다 작고 9보다크거나같으면 실행 
					System.out.println("A");
				}
				else if(num >= 5) {//9보다 작고 5와 같거나크면 실행
					System.out.println("B");
				}
				else {//5보다 작으면 실행
					System.out.println("C");
				}
		}
		
			
		}
	}
	
	
	

}
