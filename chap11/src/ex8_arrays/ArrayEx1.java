package ex8_arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayEx1 {

	public static void main(String[] args) {
		String[] arr1 = {"홍길동","이몽룡","유재석","박명수"};
		for (String s : arr1) {
			System.out.print(s+" ");
		}System.out.println();
		
		System.out.println(Arrays.toString(arr1));
		
		int [] arr2 = {1,2,3,4,5};
		System.out.println(Arrays.toString(arr2));
		
		//arr1 배열의 값을 김삿갓으로 저장하기
		Arrays.fill(arr1,"김삿갓");//해당 배열의값을 오른쪽과같이 바꿈
		System.out.println(Arrays.toString(arr1));
		
		//arr2의요소를 모두 10으로 저장하기
		Arrays.fill(arr2, 10);
		System.out.println(Arrays.toString(arr2));
		
		//arr1배열의 1,2번인덱스값을 홍길동전으로저장하기
		Arrays.fill(arr1, 1,3,"홍길동전");
		//Arrays.fill(해당배열,시작인덱스,끝인덱스,"요소")
	// 			==> 시작인덱스부터 (끝인덱스-1)까지 요소로 채움
		System.out.println(Arrays.toString(arr1));
		
		//arr2배열의 요소를 2,3번인덱스를 100으로채우자
		Arrays.fill(arr2,2,4,100);
		System.out.println(Arrays.toString(arr2));
		
		//arr1 배열을 정렬하기
		System.out.println("@@정렬@@");
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		
		System.out.println("@@내림 차순 정렬@@");
		Arrays.sort(arr1,Comparator.reverseOrder());
		System.out.println(Arrays.toString(arr1));
	}
}
