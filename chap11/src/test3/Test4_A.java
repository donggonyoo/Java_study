package test3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * text 문자열에서 이메일을 추출하여 출력하기
  [결과]
  추출된 이메일:
  example_1@gmail.com
  contact@company.co.kr
 */
public class Test4_A {
	public static void main(String[] args) {
		String text = 
				"Hello, my email is example_1@gmail.com and my work email is contact@company.co.kr."
				+ " donggon_25g@naver.co.kr64";
		

		String pat = "[\\w_]+@[\\w.]+\\.[\\w]+";
		//[]안의문자열이 하나라도포함되면 true 
		//            eexample_1+@+company.co +.kr
		//                m1.find()는 부분적으로 맞으면 true를 반환해줌
		Pattern c1 = Pattern.compile(pat);
		Matcher m1 = c1.matcher(text);
		while(m1.find()) {
			System.out.print(m1.group());
			System.out.println();
		}

	}
}
