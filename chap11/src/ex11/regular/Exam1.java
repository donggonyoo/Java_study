package ex11.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * data 문자열 중 점수를 찾아서 총점과 평균을 출력하자
 */
public class Exam1 {
	public static void main(String[] args) {
		String data = "번호:1 , 이름:홍길동 , 국어:100,영어:70,수학:85,과학:95";		
		String p = "(\\d{2,3})";
		Pattern compile = Pattern.compile(p);
		Matcher m = compile.matcher(data);
	
	
		
		int sum=0;
		int count=0;
		while(m.find()) {
			sum += Integer.parseInt(m.group());
			System.out.print(m.group()+",");
			count++;
		}System.out.println();
		
		
		System.out.println("sum : "+sum);
		System.out.println("avg : "+(double)sum/count);
		

		
		
		
		
	}

}
