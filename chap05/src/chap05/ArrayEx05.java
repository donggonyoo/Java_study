package chap05;

import java.util.Scanner;

/*
 * 10진수를 입력받아 16진수로변경
 */

public class ArrayEx05 {
	
	public static void main(String[] args) {
		
	
		char[] data="0123456789ABCDEF".toCharArray();
		// toCharArray() : string의 각 문자열을 하나씩 
		// char형 배열에 저장하는법
		char [] hex = new char[8];
		Scanner scan = new Scanner(System.in);
		System.out.print ("16진수로 변환할 10진수입력 ");
		int num = scan.nextInt();
		int divNum=num;
		int index=0;
		
		while(true) {
			hex[index++] = data[divNum%16];
			divNum /= 16;
			if(divNum==0)break;
		}
		System.out.print(num+"의 16진수 : ");
		
		for (int i = index-1; i >=0 ; i--) {
			System.out.print(hex[i]);
		}System.out.println();
		
		String hexString = Integer.toHexString(num).toUpperCase();
		System.out.println(hexString);
		//toHexString을 사용하면 문자가 소문자로나옴
		//toUpperCase()를 이용해 대문자로출력하자
		
		
		
		
	}

}
