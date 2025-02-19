package chap05.hard_ex;

import java.util.Scanner;

/*
 * 대칭수 구하는 프로그램을 작성하기
   대칭수란 숫자를 거꾸로 읽어도 앞으로 읽는 것과  같은 수를 말한다.
   12321 : 대칭수
   12345 : 대칭수 아님
 */
public class Test09 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			int[] a = new int[5];
			int [] b =new int[5];
			int count=0;

			Scanner scan = new Scanner(System.in);
			System.out.print("숫자를 입력하세요 : ");
			String next = scan.next();
			//정방향으로 배열에 넣기
			for (int h = 0; h < next.length(); h++) {
				a[h] = next.charAt(h);
			}

			//역방향으로 배열에 넣기
			int u=0;
			for (int z = next.length()-1; z >=0; z--) {
				b[u++] = next.charAt(z);
			}

			for (int k = 0; k < 5; k++) {
				if(a[k]==b[k]) {
					count++;
				}
			}

			if(count==5) {
				System.out.println("대칭 수");
			}
			else {
				System.out.println("대칭이아님");
			}
		}
	}



}

