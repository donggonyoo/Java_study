package ex12_Scanner;

import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exam1 {
	public static void main(String[] args) {
		String str = "100 and 200 and 500 and animal and lion and tiger";
		Scanner scan = new Scanner(str);
		scan.useDelimiter("\\s*and\\s*");
		int sum=0;
		
		
		while(true) {
			try {
				String token = scan.next();//useDelimiter에 의해 출력
				String p = "(\\d+)";//숫자
				Pattern c = Pattern.compile(p);//숫자패턴 컴파일
				Matcher n = c.matcher(token);//패턴과 token(입력값)을 검증
				
				if(n.matches()) {//숫자가(패턴과)맞다면 true
					sum+=Integer.parseInt(token);
				}
		
			} catch (NoSuchElementException e) {
				break;
			}
		}
		System.out.println("숫자의 합 : "+sum);
		
	}

}
