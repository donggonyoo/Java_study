package test2;

import java.util.Random;

/*
 * int getRand(f,t) : 함수 구현하기
 *   f ~ t 또는 t~ f 까지  범위에 숫자를 임의의 수로 리턴하는 함수
 *   f, t 값은 포함됨. 
 
[결과]
-2,1,0,-3,-2,1,-1,0,-2,0,0,1,0,-3,0,-1,-1,-2,-2,1,
3,3,0,0,-1,-1,0,3,2,3,0,-1,1,1,-1,3,0,0,1,-1,    
 */

public class Test5 {
	public static void main(String[] args) {
		for(int i=0;i<20;i++) {
			System.out.print(getRand(1,-3)+",");
		}
		System.out.println();
		for(int i=0;i<20;i++) {
			System.out.print(getRand(-1,3)+",");
		}
	}

	private static int getRand(int i, int j) {
		Random random = new Random();
		
		if(i>j) {//i가 j 보다 크다면 자리를 바꿔
		return random.nextInt(j, i+1); 
		//j~~i 중에 랜덤한숫자 뽑음
		}
		else {
			int nextInt = random.nextInt(i,j+1);
			return nextInt;
			}
	}
}
