package chap3.hard_test;

import java.util.Scanner;

/*
 * 화면에서 금액입력받아서 500,100,50,10,1원 동전으로 바꾸기.
 * 필요한 동전의 갯수 출력하기. 전체동전은 최소 갯수로 바꾼다.
 * [결과]
 * 금액을 입력하세요
 * 5641
 * 500원 : 11개
 * 100원 : 1개
 * 50원  : 0개
 * 10원 : 4개
 * 1원  : 1개
 */
public class Test1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("금액 입력 : ");
		int a = scan.nextInt();
		
		int b= a/500;
		int c = (a%500)/100;
		int d = (a%100) / 50;
		int e = a%50 / 10;
		int f = a%10;
		System.out.println("500원 : "+b);
		System.out.println("100원 : "+c);
		System.out.println("50원 : "+d);
		System.out.println("10원 : "+e);
		System.out.println("1원 : "+f);
		
		//방법2
		System.out.println("@@ 방법 2 @@");
		System.out.println("500원 ㅣ "+a/500);
		a%=500;
		System.out.println("100원 ㅣ "+a/100);
		a%=100;
		System.out.println("50원 ㅣ "+a/50);
		a%=50;
		System.out.println("10원 ㅣ "+a/10);
		a%=10;
		System.out.println("1원 ㅣ "+a);
	}

}
