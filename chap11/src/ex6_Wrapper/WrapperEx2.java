package ex6_Wrapper;

public class WrapperEx2 {

	public static void main(String[] args) {
		char[] arr  = {'A','a','&','가','0'};
		for(char c : arr) {
			if(Character.isUpperCase(c)) {
				System.out.println(c+" 대문자");}
			if(Character.isLowerCase(c)) {
				System.out.println(c+" 소문자");}
			if(Character.isDigit(c)) {
				System.out.println(c+" 숫자");}
			if(Character.isAlphabetic(c)) {//한글도 문자
				System.out.println(c+" 문자");}
			else {
				System.out.println(c+" 문자 아님");//숫자 or 문자가아닌것
			}
		}
	}
}
