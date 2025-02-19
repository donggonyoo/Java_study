package chap4;

import java.util.Random;

public class Switch02 {
	public static void main(String[] args) {


		int num = (int)(Math.random() * 10)+1;
		/*
		 * 0.0 <= Math.random() <1.0
		 * 0.0 <= Math.random()*10 <10.0
		 * 0= <= (int)(Math.random()*10)  < 9
		 * 1 <= (int)(Math.random()*10)+1 < 10
		 * 
		 */

		for (int i = 0; i < 5; i++) {
			int ranNum = new Random().nextInt(10)+1;//1~10 임의의 수를 가져옴
			System.out.println("숫자  :  "+ranNum);
			switch(ranNum) {
			case 1,2 -> { System.out.println("자전거당첨"); }
			case 3,4,5 -> { System.out.println("마우스 당첨"); }
			case 6,7 -> { System.out.println("냉장고 당첨"); }
			default ->{ System.out.println("꽝"); }
			}
			if(i<4) {System.out.println("====");}

		}

	}

}
