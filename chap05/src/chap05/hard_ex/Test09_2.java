package chap05.hard_ex;

import java.util.Scanner;

public class Test09_2 {
	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt(); //123
		int tmp = num;  //0
		int result = 0; //입력받은 수의 반대방향 수
		while(tmp != 0) {   
			result *=10;   
			result += tmp %10;   
			tmp /= 10; 
		}
		if(num == result) {
			System.out.println(num + ": 대칭수");
		} else {
			System.out.println(num + ": 대칭수 아님");
		}
		
		//두번쨰방법
		String snum = ""+num; //문자열 형태로 변경 123
		char[] arr = snum.toCharArray(); //문자열 배열
		int num1=arr[0]-'0'; //원래수
		int num2=arr[arr.length-1]-'0'; //역순의 수
		for(int i=1;i<arr.length;i++) {
			num1 *= 10;
			num1 += arr[i]-'0';		
		}
		for(int i=arr.length-2;i>=0;i--) {
			num2 *= 10;
			num2 += arr[i]-'0';		
		}
		if(num1 == num2) { 
			System.out.println(num + ": 대칭수");}
		else {
			System.out.println(num + ": 대칭수 아님");}
		
		
	}

}
