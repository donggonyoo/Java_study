package chap05;

import java.util.Arrays;

/*
 * 2차원배열은 1차원배열의 참조변수의 배열 .(배열의 배열)
 */
public class ArrayEx07 {

	public static void main(String[] args) {
		int[][] arr = new int[2][3];
		System.out.println("arr[2][3] : \n크기3의 배열 2개가 들어갈 자리를 만들어 주는 거라 생각");
		//2행3열짜리 배열
//		arr[0][0] = 10;
//		arr[0][1] = 20;
//		arr[0][2] = 30;
//		arr[1][0] = 40;
//		arr[1][1] = 50;
//		arr[1][2] = 60;
		arr[0] = new int[] {10,20,30};
		arr[1] = new int[]{40,50,60};
		
		System.out.println("참조값이 다른것을 확인 ");
		System.out.println("arr참조값:"+arr);
		System.out.println("arr[0]참조값:"+arr[0]);
		System.out.println("arr[1]참조값:"+arr[1]+"\n");
		
		System.out.println("arr.length(가로 행의 길이) :"+arr.length);
		System.out.println("arr[0].length(0행의 열 길이) : "+arr[0].length);
		System.out.println("arr[1].length(1행의 열 길이) :"+arr[1].length+"\n");
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("arr["+i+"]["+j+"]="+arr[i][j]+" ");
			}System.out.println();
			
		}
		System.out.println();
		int k = 0;
		for (int[] is : arr) {
			String string = Arrays.toString(is);//배열arr를 string으로변경
			System.out.printf("arr["+k+"] : ");
			++k;
			System.out.println(string);
		}
		
		System.out.println("\narr[1]의 객체변경");
		System.out.println("변경 전 참조변수 :"+arr[1]);
		int h=0;
		int[] arr1 = {1,2,3,4,5};
		arr[1] = arr1;
		System.out.println("변경 후 참조변수 :"+arr[1]);
		for (int[] is : arr) {
			String string = Arrays.toString(is);
			System.out.printf("arr["+h+"] : ");
			h++;
			System.out.println(string);
		}
//		arr[1].length==5
		
	}
	
}
