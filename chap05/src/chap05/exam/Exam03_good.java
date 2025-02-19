package chap05.exam;

import java.util.Arrays;

/*
 * str문자열에 저장된 소문자의 갯수 출력
 */
public class Exam03_good {
	public static void main(String[] args) {
		String str = "public static void main(String[] args)";

		String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toLowerCase();
		char[] abcChar = abc.toCharArray();
		//알파벳을 모두입력 후 toCharArray로 char형배열로변경해줬다

		int[] count = new int[26];
		int[] count2 = new int[26];
		char[] charArray = str.toCharArray();

		//97~122
		for (int i = 0; i < charArray.length; i++) {
			char ch = charArray[i];
			if(ch>='a' && ch <= 'z') {
				count[ch-'a']++;
				//ch가 b 라면 count[1] 에 저장될것
			}}

		//배열을 사용하지않고 하는법
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch>='a' && ch <= 'z') {
				count2[ch-'a']++;}

		}

		System.out.println(Arrays.toString(abcChar));
		System.out.println(Arrays.toString(count));
		System.out.println(Arrays.toString(count2));
		for(int i=0;i< count.length;i++) //0~12번까지만 루프
		{
			System.out.print((char)(i+'a') + ":" + count[i]+"-->");
			for (int j = 0; j < count[i]; j++) {
				System.out.print(" *");
				
			}System.out.println();
		}

	}

}
