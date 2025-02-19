package chap05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

/*
 * 로또번호생성
 * 1~45 까지의 값을 저장하는 배열생성
 * 배열을 섞는다  , 정렬(sort)
 */
public class ArrayEx03 {
	public static  void main(String[] args) {
		
		int[] balls = new int[45];
		int[] lotto = new int[6];
		
		//45까지의 숫자가 들어있는 배열 생성
		for (int i = 1; i <= 45; i++) {
			balls[i-1] = (i);
		}
		System.out.println("숫자출력");
		System.out.println(Arrays.toString(balls));
		
		for (int i = 0; i < 100; i++) {
			int f = (int)(Math.random() * 45 );//0~44 의 int값 생성 ( 45는 인덱스44번이다)
			int t = (int)(Math.random() * 45 );
			//swap 알고리즘 양 값 바꾸기
			int temp = balls[f];
			balls[f] = balls[t];
			balls[t] = temp; 
			//하나의 변수를 두어 중간에서 섞는역할
			//랜덤한 인덱스 값 추출후 섞기
		}
		System.out.println("섞은 후 ball");
		System.out.println(Arrays.toString(balls));
		
		/*
		 * System.out.println("List라는 프레임워크를 이용하면 섞는 함수도 제공하긴 한다 (배열처럼 순서대로 들어감)");
		 * ArrayList<Integer> arrayList = new ArrayList<Integer>(); arrayList.add(1);
		 * arrayList.add(2); arrayList.add(3); arrayList.add(4);
		 * System.out.println(arrayList); Collections.shuffle(arrayList); //map은
		 * shuffle이 안됨 System.out.println(arrayList);
		 */
		
		
		//lotto 번호선택 0~5 번 인덱스까지
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = balls[i];
		}
		System.out.println("** 로또 **");
		System.out.println(Arrays.toString(lotto));
		//정렬(sort)
	
		for (int i = 0; i < lotto.length; i++) {
			boolean sortable = true;
			for (int j = 0; j < lotto.length-1-i; j++) {
				/*lotto.length-1-i 로설정한 이유
				 * 일단 j+1 과비교하기떄문에 length가6이라고치면
				 * 4번인덱스 까지만 루프를 돌면5번까지도 비교가 됨
				 * 
				 * 첫번쨰루프에서 0번부터 맨뒤에까지 비교를 했으니 
				 * (맨뒤index 는 가장 큰 숫자일게 분명함)
				 * (length-1-i)번 인덱스 까지만 루프를 돌리자 
				 */
				if(lotto[j]> lotto[j+1]) {
					int temp = lotto[j];
					lotto[j] = lotto[j+1];
					lotto[j+1] = temp;
					sortable = false;
				}
			}
			System.out.print(i+":");
			for (int j : lotto) {
				System.out.print(j+" , ");
			}
			System.out.println();
			if(sortable)break; //for문안에있는 if문이거짓일 시 break;
		}
		
		System.out.print("최종정렬 : ");
		for (int i : lotto) {
			System.out.print(i+" , "
					+ "");
		}
		
		Arrays.sort(lotto);
		// 이방법을사용해서 정렬을 할 수도있음. (이게훨씬간편함)
		
		
		
	}

}
