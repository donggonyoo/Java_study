package ex11.regular;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx1 {
	public static void main(String[] args) {
		String[] date = {"bat", "baby" , "bonus","c","cA","cD","ca","car","combat","couunt",
				"cTT","data","disk"};

		//문서양식같은 거
		/*
		 * c[A-Za-z]? : c문자로시작하고 뒤에 영문자(A~z)가 1개또는 0개
		 * 
		 *   c : 문자c
		 *   [A-Z a-Z]: 대소문자상관없이 문자 1개
		 *   ? : [A-Z a-Z]가 0 또는 1개 (?가 없다면 무조건 문자 1개)
		 *   + : 1개 이상
		 *   * : 0개 이상
		 */
		
		Pattern p = Pattern.compile("c[A-Za-z]+");//c로 시작하는 문자
//		Pattern p = Pattern.compile("c[A-Za-z]?"); [A-Za-z]가 0개 or 1개
	
		System.out.print("c로시작하는 문자 : ");
		for (String s : date) {
			
			Matcher m = p.matcher(s);//matcher 패턴형식에 맞는지 검증
			
			if(m.matches()) {//패턴검증 패턴에 맞는경우 : T
				System.out.print(s+",");
			}
		}
		System.out.println();
		
		String name = "홍길동 ,    김삿갓,이몽룡 , 유재석,   임꺽정";
		String[] split2 = name.split(",");
		System.out.println("공백제거 전 "+Arrays.toString(split2));
		
		String[] split = name.split("\\s*,\\s*");
		//  \s : 공백 한 문자    * : 0개이상   \s*:  공백0개이상을 제거해줌
		System.out.println("공백제거 후 "+Arrays.toString(split));
		
	}

}
