package chap4.hardEx;

import java.util.Scanner;

/*
  사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
  단, 입력한 수는 1보다 크거나 같아야 합니다.
  만일 1 미만의 숫자가 입력됐다면 “잘못 입력하셨습니다.“를 출력하세요.
*/
public class Test08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum=0;
		System.out.print(" 숫자입력 : ");
		int num = scan.nextInt();
		if(num < 1 ) {
			System.out.println("잘못입력하셨습니다");
		}
		else {
			for (int i = 1; i <= num; i++) {
				System.out.print (i +" ");
			}
		}

	}
}
