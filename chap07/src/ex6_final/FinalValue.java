package ex6_final;

import java.util.Arrays;

/*
 * final 변수 : 변경불가능 변수 =>  상수 , const 예약어 사용안함
 * final변수도 생성자에서 한번은 초기화가 가능함 ( 객체별로 다른 상수값 가능)
 * 단 명시적초기화를 하면 안됨 ex)final int NUM=0; XXX
 */
public class FinalValue {
	final int NUM; 
	FinalValue(int num) {
		NUM = num;	//상수값 초기화 (한번만 초기화가능)
//		NUM = 10;
	}
	
	//---------------------------------------------------------------
	public static void main(String[] args) {
		FinalValue a = new FinalValue(123);
//		a.NUM = 194; 이미 생성자에서 한번 초기화해버렸기때문에 변경불가
		System.out.println(a.NUM);
		
		FinalValue b = new FinalValue(678);
		System.out.println(b.NUM);
		
		//final 배열
		final int[] arr = {10,20,30,40,50};
		arr[0] = 100;
		arr[1] = 200;
//		arr = new int[]{100,200,300}; 참조변경불가 ( 즉 크기바뀌지않음)
		System.out.println(Arrays.toString(arr));
		
		int[] arr2 = {10 , 20};
		arr2 =  new int[] {100,2200,500,600};
		
		

	}

}
