package chap05.exam;

import java.util.Scanner;

/*
 * 정수값 5개 입력받아
 * 입력받은 수의 합계 평균 최대값 ,최소값 , 최대인덱스값 , 최소인덱스값
 */
public class Exam01 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int [] arr = new int[5];
		int sum=0;
		
		
		
		for (int i = 0; i < 5; i++) {
			System.out.print("정수 입력하세요  : ");
			int var = scan.nextInt();
			arr[i] = var;
		}
		
		for (int i : arr) {
			sum+=i;
		}
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+(double)sum/arr.length);
		
		int min = 0,max=0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[min]>arr[i]) {
				min=i;
			}
			if(arr[max]< arr[i]) {
				max = i;
			}
		}
		System.out.println("min : "+arr[min]);
		System.out.println("max : "+arr[max]);
		System.out.println("최대값인덱스 : "+max);
		System.out.println("최소값인덱스 : "+min);
		
		
	}

}
