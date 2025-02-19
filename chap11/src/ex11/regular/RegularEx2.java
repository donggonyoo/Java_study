package ex11.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 정규표현식 예제
 * 	. : 문자 한개
 * 	? : 0 또는 1개
 * 	* : 0개 이상
 * 	+ : 1개 이상
 *  ^[..] : 문자열의시작  [^0-9] : 숫자로 시작하는 경우
 *  [^..] : 지정된 문자 제외 [^0-9] : 숫자가 아닌 경우
 *    |   : or     02|010 : 02 혹은 010 이니?
 *    & : and
 *    () : 그룹
 *    \s : 공백한개
 *    \S : 공백아닌문자 1개
 *    \d : 숫자한개 [0-9]와 같은의미
 *    \D : 숫자가 아닌 경우
 *    \w : 일반문자 [0-9 A-Z a-z]
 *    \W : 특수문자
 *    {n} : n개    \d{2} == 숫자2개
 *    {n,} : n개 이상
 *    {n,m} : n개 이상 m개 이하
 *    
 *  
 */
public class RegularEx2 {
public static void main(String[] args) {
	String [] patterns = {",","[a-z]?","^[0-9]","[0-9]+",
						"[a-z]*","[a-z]+","02|010",
						"\\s","\\S","\\d","\\d{2}","\\D",
						"\\w","\\W"};
	String[] datas = {"","a","1","12","012","abc","02"," ","A","5","*"};
	for (String s : datas) {
		if(s.equals("")) {
			System.out.println("빈 문자열 \"\"패턴 ==>");
		}
		else if(s.equals(" ")) {
			System.out.println("공백문자 \" \" 패턴==>");
		}
		else {
			System.out.println(s+" 문자의 패턴==>");
		}
		for (String p : patterns) {
			Pattern pattern = Pattern.compile(p);
			Matcher m = pattern.matcher(s);
	
			if(m.matches()) {
				System.out.println(p+",");
			}
			
		}System.out.println();
	}
}
}
