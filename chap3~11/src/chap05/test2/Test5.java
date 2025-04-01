package chap05.test2;

import java.util.Arrays;
import java.util.Scanner;

/*
11*11 크기의 사각형이 있다고 가정할때 다음 결과를 출력되도록 프로그램 작성하기
                        c         b
X         X             00       0.10
 X       X              11       1.9  
  X     X               22       28  
   X   X                33       37
    X X                 44       46
     X                       55 
    X X                 64       66 
   X   X                73       77 
  X     X               82       88
 X       X              91       99
X         X            10.0     10.10   

 */
public class Test5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.printf("크기입력하세요 : (홀수만)");
		int size = scan.nextInt();
		String[][] a =  new String[size][size];
		
		
		//String 배열의 초기화는 필수임
		//초기화안할시 다 null값이므로 다른것을 찍을 수 없게됨
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				a[i][j] = " ";
			}
			
		}
		
		for (int i = 0; i < size; i++) {
			a[i][i] = "X";
			a[i][size-1-i] = "X"; 
			//a[0][0]과 a[0][10]    , a[1][1] 과 a[1][9] ......
			//a[6][6] 과 a[6][4] ......만 X이찍힘
		}
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(a[i][j]+" ");
			}System.out.println();
			
		}
		
		
		

	}
}
