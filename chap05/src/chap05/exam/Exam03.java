package chap05.exam;

import java.util.Arrays;

/*
 * str문자열에 저장된 소문자의 갯수 출력
 */
public class Exam03 {
	public static void main(String[] args) {
		String str = "HelloWorldHAha";
		
		String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toLowerCase();
		char[] abcChar = abc.toCharArray();
		//알파벳을 모두입력 후 toCharArray로 char형배열로변경해줬다
				
		int[] count = new int[26];
		char[] charArray = str.toCharArray();
		int a = 'a';
		int b = 'z';
		//97~122
		for (int i = 0; i < charArray.length; i++) {
			int c = (int)charArray[i];
			if (97<= c && c<=122) {
				count[c%97]++; 
			}
		}
		
		System.out.println(Arrays.toString(abcChar));
		System.out.println(Arrays.toString(count));
		for(int i=0;i< count.length/2;i++)
			{System.out.print((char)(i+'a') + ":" + count[i]+" ");}
		System.out.println();
		//ch[0]이 a이다 그러므로 (char)(97) 을 한다고생각하자
		
		for(int i=count.length/2; i< count.length;i++)
		{System.out.print((char)(i+'a') + ":" + count[i]+" ");}
	}
	

}
