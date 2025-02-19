package chap05.hard_ex;

import java.util.Scanner;

/*
 * [결과]
삼각형의 높이를 입력하세요

3(h) : 9(숫자의갯수)
                        루프(a)     공백(b)          숫자(c)
-	-	9		     	 1          2(h-a)        9    (1) (a*2)-1
-	8	7	6		     2          1           8 7 6  (3)  
5	4	3	2	1	     3          0         5 4 3 2 1(5) 
 
*/
public class Test06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("입력 :");
		int h= scan.nextInt();
		int sqrt = h*h;
		
		for (int a = 1; a <= h; a++) {
			for (int b = 0; b < (h-a); b++) {
				System.out.print("    ");
					
			}
			for (int c = 0; c < (a*2)-1; c++) {
				
				System.out.printf("%4d",sqrt);

				sqrt--;
			}System.out.println();
			
		}
		
		

	}
}
