package chap05.hard_ex;

import java.util.Scanner;

/*
삼각형의 높이를 홀수로 입력하세요
7(h)


                루프(a)      공백(b)          수(별)(c)
*******          7       0(h-a)        7(a-b)
 *****           6        1             5 
  ***            5        2             3
   *             4        3             1      
                
                int a = h; a > (h/2) ; a--  여기서는 내림차순의별이  4번실행 { 7 6 5 4 } 
                
   
 이어서 새로운 루프(K) (h/2)+2 번 부터 실행 여기서는 5번이라고 생각하면 됨
 			그래야 다시 역순으로 올라가는 모양이 나오기 때문 
 			6번(5)-> 5번(3) ->4번(1) -> ((h/2)+2)5번(3) -> ((h/2)+3)6번(5)
 
                루프(k)    공백(j)            별(y)            	
  ***            5        2 (h-k)            3 (k-j)
 *****           6        1                  5
*******          7        0                  7
 
 */
public class Test08_test {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("높이를홀수로 입력 : ");
		int h = scan.nextInt();
		
		int b= 0;
		if(h%2==0) {
			System.out.println("홀수만됩니다");
		}
		else {
			for (int a = h; a > (h/2); a--) {
				
				for (b = 0; b <h-a ; b++) {
					System.out.print("   ");
				}
				for (int c = 0; c < a-b; c++) {
					System.out.print(" * ");
				}System.out.println();
				
			}
			
				
			
		}
	}
}
