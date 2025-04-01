package chap05.test2;

import java.util.Arrays;
import java.util.Scanner;

/*
11*11 크기의 사각형이 있다고 가정할때 다음 결과를 출력되도록 프로그램 작성하기
                        c         b
X         X             0.0       0.10
 X       X              1.1       1.9  
  X     X               2.2       2.8  
   X   X                3.3       3.7
    X X                 4.4       4.6
     X                       5.5 
    X X                 6.4       6.6         법칙을 알아내라!!!
   X   X                7.3       7.7 
  X     X               8.2       8.8
 X       X              9.1       9.9
X         X            10.0     10.10   

 */
public class Test5_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("크기를 입력 : ");
			int size= scan.nextInt();
			if(size%2==0) {
				System.out.println("홀수만 입력하세요");
			}
			else {
				String[][] a =  new String[size][size];
				int b=0;
				int c=(a.length-1);

				//String 배열의 초기화는 필수임
				//초기화안할시 다 null값이므로 다른것을 찍을 수 없게됨
				for (int i = 0; i < size; i++) {
					for (int j = 0; j < size; j++) {
						a[i][j] = " ";
					}
				}

				///////////X 표시를 찍는 부분 ////////////////////
				for (int i = 0; i <= size; i++) {
					for (int j = 0; j < size; j++) {
						if(j==b || j==c) {
							a[i][j] = "X";
							//a[0][10]   a[0[0]
							//a[1][9]    a[1][1]
							//a[6][4]    a[6][6]
							//a[7][3]    a[7][7]
						}
					}b++;c--;	
				}

				//			for (int i = 0; i < size; i++) {
				//				a[i][i] = "X";
				//				a[i][size-1-i] = "X"; 
				//				//a[0][0]과 a[0][10]    , a[1][1] 과 a[1][9] ......
				//				//a[6][6] 과 a[6][4] ......만 X이찍힘
				//			} 이 방법도 가능 ( 이게 더 명확함)
				//			


				/////////////출력부분//////////////	
				for (int i = 0; i < size; i++) {
					for (int j = 0; j < size; j++) {
						System.out.print(a[i][j]+" ");
					}System.out.println();

				}break;

			}
		}
	}
}
