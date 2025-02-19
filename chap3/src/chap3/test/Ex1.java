package chap3.test;

import java.util.Scanner;

/*
 * 화면에서 초를 입력받아 몇시간 몇분 몇초인지출력
 */
public class Ex1 {
	public static void main(String[] args) {
		System.out.println("초를 입력하세요 ");
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		System.out.print(a+"초 : ");
		
		
		int hours = a/3600;
		int min = (a%3600)/60;
		int sec = a%60;
		System.out.println(hours+"시간 "+min+"분"+sec+"초");
		
		
		
	}
	

}
