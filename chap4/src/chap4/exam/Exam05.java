package chap4.exam;

import java.util.Iterator;
import java.util.Scanner;

/*
 * 화면에서자연수입력받아 각 자릿수의 합구하기
 * [결과]
 * 자연수입력 : 123 
 * 자리수합 : 6
 */
public class Exam05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int sum1=0;
		int a = 0;
		System.out.print("자연수입력 : ");
		int nextInt = scan.nextInt();
		int x =nextInt;
		
		while(x>0) {
			sum1+=x%10;
			x /=10;
		}
		System.out.println("sum1 : "+sum1);
		
		//////다른방법 ( 심화) !~~~~~~~~~~~~~~~~~~~~~~~
		
		int sum2=0;
		System.out.print("자연수 입력 :  ");
		String next = scan.next();
		
		for (int i = 0; i < next.length(); i++) {
			String substring = next.substring(i,i+1);
			int int1 = Integer.parseInt(substring);
			sum2+=int1;
		}
		System.out.println("각자릿수합 : "+sum2);
		
		
		
	}

}
