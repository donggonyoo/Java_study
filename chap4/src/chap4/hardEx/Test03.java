package chap4.hardEx;

import java.util.Scanner;

/*
 삼각형의 높이를 입력받아서 *로 삼각형 출력하기
  [결과]
  삼각형의 높이
  3
  
  		
          k(루프 계수)    i(공백(-)수)         j(별 수)      
          =============================================
 --*          1          2 (3-k)          ((k*2)-1) 1
 -***         2          1 (3-k)          ((k*2)-1) 3
 *****        3          0 (3-k)          ((k*2)-1) 5
 */

public class Test03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("삼각형 높이 : ");
		int a = scan.nextInt();

		for (int k = 1; k <= a; k++) {
			
			for (int i = 1; i <= a-k; i++) { //1.a가 4 라고치면  처음시작에 공백이 3칸이생기는거 루프끝나면 밑에 for문으로감
											 //3. 두번쨰루프에서 공백 2칸  세번째루프 공백 1 칸 마지막(4) 루프 공백0칸
				System.out.print("-");
			}
			for (int j = 1; j <= (k*2)-1; j++){ //2.공백 3칸 후 별 하나찍기
												//3. 공백 2칸 후 별3개  ,공백 1칸 후 별5개 , 별7개 
				System.out.print("*");

			}
			System.out.println("");
		}
	}
}
