package chap05;

import java.util.Arrays;

public class ArrayBasic {
	public static void main(String[] args) {
		
		/*
		 * new 예약어 -->
		 * 1.객체생성( 정수 5개를 저장할 수 있는 객체생성)
		 * 2.기본값 초기화 
		 * 숫자 : 0 , boolean : false , 그외 : null
		 */
		
		System.out.println("초기화 ");
		byte [] b = new byte[5];
		System.out.println("byteArray : "+Arrays.toString(b));
		
		int [] in = new int[5];
		System.out.println("intArray : "+Arrays.toString(in));
		
		double [] d =  new double[5];
		System.out.println("doubleArray : "+Arrays.toString(d));
		
		boolean [] bo =  new boolean[5];
		System.out.println("booleanArray : "+Arrays.toString(bo));
		
		
		String [] s = new String[5];
		System.out.println("intArray : "+Arrays.toString(s));
	}

}
