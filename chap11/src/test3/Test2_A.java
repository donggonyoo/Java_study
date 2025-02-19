package test3;

import java.time.Duration;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*
 * 두개의 날짜를 입력받아서 두날짜사이의 일수를 출력하기
  [결과]
첫번째 날짜를 입력하세요(yyyy-MM-dd)
2025-01-01
두번째 날짜를 입력하세요(yyyy-MM-dd)
2025-01-03
2025-01-03 -2025-01-01 일자의 차이 : 2  
 */
public class Test2_A {
	public static void main(String[] args) {
		Period p1 = Period.of(2025, 01, 01);
		Period p2 = Period.of(2025, 01, 03);
		
		Period minus = p1.minus(p2);
		System.out.println(Math.abs(minus.getDays())+"일 차이");
		
//		Date date = new Date();
		Calendar c = Calendar.getInstance();
		Scanner scan = new Scanner(System.in);
		long [] sum = new long[2];
		
		for (int i = 0; i < 2; i++) {
			System.out.println("날짜를 입력 :  ");
			int y = scan.nextInt();
			int m = scan.nextInt();
			int d = scan.nextInt();
			c.set(y, (m-1),d); 
			long t = c.getTimeInMillis();
			
//			date.setTime(c.getTimeInMillis());
//			sum[i]= date.getTime();
			sum[i] = t;
		}
		
		long a = sum[1] - sum[0];
		long day = a/(1000*60*60*24);
		System.out.println(Math.abs(day)+"일 차이");
		
		
		
		
		
		
		

	}
}
