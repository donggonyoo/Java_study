package test;
/*
 * 다음 결과가 나오도록 프로그램 수정하기
 * [결과]
 * basket
 * basketball
 */

public class Test3_A {
	public static void main(String[] args) {
		String str = "base"; 
		System.out.println(str.replace('e','k')+"et");//이건 출력시에만 나타나고 str의참조가 바뀌진앟음
		String replace = str.replace('e','k')+"et";//참조변경 base--> basket
		replace += "ball"; 
		System.out.println(replace);
	}
}
