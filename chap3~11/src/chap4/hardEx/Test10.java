package chap4.hardEx;

import java.util.Iterator;
import java.util.Scanner;

/*
 * 화면에서 2~9까지의 숫자를 입력받아 입력된 수의 구구단을 출력하기
 * [결과]
 * 출력 구구단 : 3
 * 3*2=6
 * 3*9=9
 * ...
 * 3*9=27 
 */
public class Test10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자입력 :  ");
		int n = scan.nextInt();
		
		for (int i = 2; i <= 9; i++) {
			System.out.println(n+"*"+i+"="+(i*n));
			
		}

	}
}
