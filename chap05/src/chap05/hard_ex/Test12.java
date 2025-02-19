package chap05.hard_ex;

import java.util.Scanner;

/*
삼각형의 높이를 입력하세요
5(h)

(법칙을 예상해봄)
h   숫자갯수
6   21
5   15
4   10
3   6
2   3
==================      a(루프)    b(숫자)                 c (공백)
15	14	13	12	11	      5    15 14 13 12 11 (5개)     a      0(h-a)
-	10	9	8	7	      4       10  9  8  7 (4개)     a      1
 -	-	6	5	4	      3           6  5  4 (3개)     a      2
-	-	-	3	2	      2              3  2 (2개)     a      3
-	-	-	-	1         1                 1 (1개)     a      4 
 */
public class Test12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("삼각형 높이 : ");
		int h = scan.nextInt();
		int sum=0;
		for (int i = 0; i <= h; i++) {
			sum+=i;
		}
	
		
		for (int a = h; a >= 1; a--) {
			
			//공백for문이 먼저나와야 먼저 공백을 찍고 숫자출력함
			for (int i = 1; i <= h-a; i++) {
				System.out.print("   ");
				
			}
			
			for (int b = 1; b <= a; b++) {
				System.out.printf("%2d ",sum);
				sum--;
		
			}System.out.println();
			
		
		}
		
		

	}
}
