package chap11.test3;
/*
 * 
년도와 월를 입력하세요
2025 02

	   2025년2월
   일  월  화   수  목  금   토
                           1
   2   3   4   5   6   7   8
   9  10  11  12  13  14  15
  16  17  18  19  20  21  22
  23  24  25  26  27  28
 */

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Test1_A {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		Date date = new Date();
		Scanner scan = new Scanner(System.in);
		System.out.print("연도와 월을 입력 : ");

		int y = scan.nextInt();
		int m = scan.nextInt();
		System.out.println(y+" 년 "+m+" 월");

		c.set(y, m-1,1);
		int lastday = c.getActualMaximum(Calendar.DATE);
		String week = "일월화수목금토";
		String[] split = week.split("");
		for (String s : split) {
			System.out.printf("%6s",s);
		}//요일 출력해놓는다 4칸간격으로!!
		System.out.println();

		
		
		while(true) {
			int day = c.get(Calendar.DATE);
			if(day==1) {
				System.out.print(" ");
				for (int i = 0; i < c.get(Calendar.DAY_OF_WEEK)-1; i++) {
					System.out.printf("%6s","");
				}
				System.out.printf("%6d",day);
				if(c.get(Calendar.DAY_OF_WEEK)-1==6) {System.out.println();}
			}

			else if(c.get(Calendar.DAY_OF_WEEK)-1!=6) {
				System.out.printf("%6d",day);	
			}
			else {
				System.out.printf(" %6d",day);
				System.out.println();
			}
			day++;
			c.set(y,(m-1), day);
			if(day>lastday) {break;}
			
			

		}
	}
}
