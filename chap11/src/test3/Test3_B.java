package test3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test3_B {
	public static void main(String[] args) {
		String[] phoneNumArr = {
				"012-3456-7890","099-2456-7980", 
				"088-2346-9870","013-3456-7890" };
		Scanner s = new Scanner(System.in);
		System.out.println("찾고자 하는 번호를 입력하세요:");
		String input = s.nextLine().trim();
		String pattern = input;
		Pattern p = Pattern.compile(pattern);
		int cnt = 0;
		for (int i = 0; i < phoneNumArr.length; i++) {
			String phoneNum = phoneNumArr[i];
			String tmp = phoneNum.replace("-", ""); //- 제외시켜, -사이의 숫자 검색
			Matcher m = p.matcher(tmp);
			if (m.find()) { 
				cnt++;
				System.out.println(cnt + ":" + phoneNum);
			}
		}
		if(cnt == 0)
	     	System.out.println("찾는 번호가 없습니다.");
	}

}
