package chap05.hard_ex;

import java.util.Scanner;

/*
삼각형의 높이를 입력하세요
3(h)
               루프수(a)    별 수(b)            공백수(c)   
*****            3           5(a*2)-1           0(h-a)
-***             2           3(a*2)-1                 1
--*              1           1(a*2)-1                  2
 
 */

public class Test07 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("삼각형 높이입력 : ");
		int h = scan.nextInt();
		
		for (int a = h; a >=1 ; a--) {
			
			for (int c = 0; c < (h-a); c++) {
				System.out.print(" ");
				
			}
			for (int b = 1; b <= (a*2)-1; b++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		

	}
}
