package chap3.hard_test;

import java.util.Scanner;

public class Test2 {
	/*
	 * 10부터 99사이의 두자리 자연수를 입력받아 입력된 수 보다 크거나 
	 * 같은 10의 배수를 구하기
	 * 10의 배수에서 입력된 수를 뺀값을 출력하기
	 * [결과]
	 * 10부터 99사이의 두자리 자연수를 입력하세요
	 * 24
	 *  6  :  30 - 24
	 *  
	 * 10부터 99사이의 두자리 자연수를 입력하세요
	 * 20
	 * 0   :  20 - 20
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("10~99사이 두자리자연수 입력 :  ");
		int a = scan.nextInt();
		int c = 0;
	
		for (int i = 1; i <= 10; i++) {
			
			if(a <= c) {
				System.out.println(c-a+":"+c+"-"+a);
				break;
			}
			else {
				c =10*i;
			}
			
			
		}
		
		
	}

}
