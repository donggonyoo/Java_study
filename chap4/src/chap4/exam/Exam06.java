package chap4.exam;

import java.util.Scanner;

/*
 * 화면에서 문자열 입력받아 각 자릿수의 합구하기
 * [결과]
 * 자연수입력 : 123 
 * 자리수합 : 6
 */
public class Exam06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		int sum1=0;
		int a = 0;
		System.out.print("자연수입력 : ");
		String num = scan.next();
		
		for(int i=0 ; i< num.length();i++) {
			System.out.print("asci("+num.charAt(i)+"): "
						+(int)num.charAt(i)+" - ");
			
			sum1+=num.charAt(i) - '0';
			
			System.out.println((int)('0')+": {0(Ascii}"
					+"="+(num.charAt(i) - '0'));
			//0을 왜뺄까? : 
			//아스키코드기준 : 0 ~9 == (48~57)( 아스키코드때문에 0을 뺴주는거임)
		}
		
		System.out.println(sum1);
		
		
	}

}
