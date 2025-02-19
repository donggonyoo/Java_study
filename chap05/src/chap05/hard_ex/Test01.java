package chap05.hard_ex;

import java.util.Scanner;

/*
 *  농장에 강아지,병아리가 있음.
 *  강아지 병아리 전체 마리수 입력받고
 *  강아지 다리수와 병아리 다리수 전체를 입력받는다.
 *  [결과]
 *  강아지 병아리 마리수를 입력하세요
 *  20
 *  강아지 병아리 전체 다리수를 입력하세요
 *  30
 *  
 *  강아지 : xx마리
 *  병아리 : yy마리
 *  
 *  [결과]
 *  강아지 병아리 마리수를 입력하세요
 *  10
 *  강아지 병아리 전체 다리수를 입력하세요
 *  10
 *   
 *  계산안됨 
 */
public class Test01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean check=false;
		
		System.out.print("강아지병아리 마릿수 입력 : ");
		int count= scan.nextInt();
		
		System.out.println("전체 다리 수");
		int leg = scan.nextInt();
		
		int i ,j;
		
		for (i = 0; i <= leg; i++) {
			for ( j = 0; j <= leg; j++) {
				if (i+j==count && i*2 +j*4== leg) {
					System.out.println("병아리 "+i+"마리 "+"강아지 "+j+"마리");
					check = true;
					break;
					
				}
				
			}
		}
		if(check!= true) {
			System.out.println("계산안됨");
		}
		
		
		
		

	}
}
