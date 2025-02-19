package chap4.exam;

public class Exam07_Triangle {
	//차례대로 피라미드식으로 출력되는 별

	public void basic(int a) {
		for (int i = 1; i <= a; i++) { //첫 루프가 1부터 시작해야
			for (int j = 0; j < i; j++) { //최소 한번실행 가능
				System.out.print("*");
			}
			System.out.println();
		}
	}
	//거꾸로 출력되는 별 5 4 3 2 1 
	public void reverse(int b) {
		System.out.println("거꾸로출력");
		for (int i = b; i >= 1; i--) { 
			for (int j = 0; j < i; j++) {
				System.out.print("*");

			}System.out.println();
		}
	}

	/*
	 * 3:     i        j
	 *    ================
	 *     *   1        3
	 *    **   2       23
	 *   ***   3      123   
	 */
	public void emptyPrint(int c) {
		System.out.println("공백포함 출력");
		for (int i = 1; i <= c; i++) {
			for (int j = c; j >= 1; j--) {
				if(j>i) {
					System.out.print(" ");}
				else {//  j <= i
					System.out.print("*");}	
			}System.out.println(); // 안의 for문이 끝나면 \n
			
		}
	}
	
	/*
	 * 		4:    i       j(출력)
	 *  =======================
	 *    ***     1       123
	 *     **     2        23
	 *      *     3         3
	 */

	public void  emptyReverse(int d) { 
		//공백포함 출력을 만들었다면 조건문만 반대로해주면 완성
		System.out.println("공백포함 거꾸로");
		for (int i = 1; i <= d; i++) {
			for (int j = d; j >= 1; j--) {
				if(j<i) {
					System.out.print(" ");}
				else {//  j>=i
					System.out.print("*");}	
			}System.out.println(); // 안의 for문이 끝나면 \n
			
		}
	}
}
