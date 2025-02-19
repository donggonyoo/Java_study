package chap05;

import java.util.Arrays;

public class ArrayEx01 {
	public static void main(String[] args) {
//		int arr[];
//		arr = new int[5];
		int [] arr  = new int [5];
		//배열의인덱스 :  0번부터 시작
		arr[0] = 10;
		arr[1] = 20;
		
		//arr.length = 5 배열의크기
		for (int i = 0; i < arr.length; i++) { //0번인덱스~4번인덱스 반복
			System.out.print("arr["+i+"] : "+arr[i]+" , ");
		}System.out.println();
		
		
		int []arr2 = new int[]{100,200}; //100과200을 요소로가진 크기2의 arr배열 생성
		for (int i = 0; i < arr2.length; i++) {
			System.out.print("arr2["+i+"] : "+arr2[i]+" , ");
		}System.out.println();
		
		System.out.println("arr2 = arr ");
		System.out.println("참조값이 바뀌어버림 arr2가 참조하던 객체는 사라짐");
		arr2= arr; 
		/*
		arr의 주소를 arr2에 복사 --> 
		arr2가 참조하는 객체 (100,200)이 사라지고
		arr과 같은곳을 참조하게 됨
		*/
		
		arr2[3] = 999; 
		/*
		 * 원래 arr2는 크기가 2인 100,200 이저장된 배열을 참조했지만
		 * 크기가 5인 arr 로 참조를 바꿈
		 * arr2 에서 데이터변경을 하면 arr 도 바뀔것임 (같은곳을 참조)
		 */
		
		for (int i = 0; i < arr2.length; i++) {
			System.out.print("arr2["+i+"] : "+arr2[i]+" , ");
		}System.out.println();
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("arr["+i+"] : "+arr[i]+" , "
					+ "");
		}System.out.println();
		
		//향상된for문
		System.out.println("--향상된for문사용--");
		System.out.printf("arr2 : ");
		for (int i : arr2) {
			System.out.print(i+" ");
		}System.out.println();
		
		System.out.println("--Arrays.toString()사용해 배열출력--");
		System.out.println("arr2 : "+Arrays.toString(arr2));
		
		
		
		
	}

}
