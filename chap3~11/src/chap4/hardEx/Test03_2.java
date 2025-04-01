package chap4.hardEx;

import java.util.Scanner;

/*
 삼각형의 높이를 입력받아서 *로 삼각형 출력하기
  [결과]
         			삼각형의 높이 h
   					4   (- : 공백)
  
  		        입력 루프(a)   (앞)공백(b)      별(c) 
  =====================================================
       *******      4          0(h-a)     7(a*2)-1
  	   -*****-      3          1(h-a)     5(a*2)-1
   	   --***--      2          2(h-a)     3(a*2)-1
   	   ---*---	    1          3(h-a)     1(a*2)-1
 */

public class Test03_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("삼각형 높이 : ");
		int h = scan.nextInt();
		
		for (int i = h; i >= 1; i--) {
			for (int b = 1; b <= h-i; b++) {
				System.out.print("-");	
			}
			for (int c = 1; c <= (i*2)-1; c++) {
				System.out.print("*");
			}System.out.println();
			
		}
		
	}
}
