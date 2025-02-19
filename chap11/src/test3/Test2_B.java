package test3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test2_B {
	public static void main(String[] args) throws ParseException {
		System.out.println("첫번째 날짜를 입력하세요(yyyy-MM-dd)");
		Scanner scan = new Scanner(System.in);
		String first = scan.nextLine();
		System.out.println("두번째 날짜를 입력하세요(yyyy-MM-dd)");
		String second = scan.nextLine();
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		Date fdate = sf.parse(first);
		Date sdate = sf.parse(second);
		long datecnt = (sdate.getTime() - fdate.getTime())/(1000*60*60*24);
		System.out.printf("%s -%s 일자의 차이 : %d\n",second,first,datecnt);

	}

}
