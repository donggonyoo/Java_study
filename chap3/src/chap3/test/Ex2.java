package chap3.test;

import java.util.Scanner;

/*
 * 화면에서 3자리정수입력받아 100자리미만을 버리고 출력
 * ex) 321 입력 --> 300출력
 */
public class Ex2 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("세자리정수입력 : ");
			int a = scan.nextInt();
			if(a!=0) {

				int newA = a - (a%100);
				System.out.println(newA);
			}
			else {
				break;
			}
		}
	}
}

