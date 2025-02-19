package test3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 찾고자 하는 번호의 일부를 입력받아 번호를 출력하기
 * [결과]
 * 찾는 번호의 일부를 입력하세요:
 * 3456
 * 012-3456-7890
 * 013-3456-7890
 */

public class Test3_A {
	public static void main(String[] args) {
		String[] phoneNumArr = {
				"012-3456-7890","099-2456-7980", 
				"088-2346-9870","013-3456-7890" };
		
		Scanner scan = new Scanner(System.in);
		System.out.println("찾고자하는 번호 ");
		String num = scan.next();
		String p = "0\\d{2}-\\d{4}-\\d{4}";
		Pattern compile = Pattern.compile(p);
		for (String s : phoneNumArr) {
			Matcher m = compile.matcher(s);
			m.find();			
			if(m.group().contains(num)) {
				System.out.println(m.group());
			}
		}
		
		
		
		
	}
}
