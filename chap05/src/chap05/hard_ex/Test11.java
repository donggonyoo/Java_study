package chap05.hard_ex;

import java.util.Scanner;

/*
 
10진수를 2,8,10,16 진수로 변경하기
[결과]
10진수 값을 입력하세요
16

16의 2진수 :10000
16의 8진수 :20
16의 10진수 :16
16의 16진수 :10

*/
public class Test11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("10진수 입력 :  ");
		int num = scan.nextInt();
		int Nnum = num;
		int i=0;
		int[] two = new int[16];
	
		
		//2진수
		while(Nnum>0) {
			two[i++] = Nnum%2;
			Nnum /=2;
		}
		System.out.print(num+"의 2진수 : ");
		for (int j = i-1; j >=0; j--) {
			System.out.print(two[j]);
		}System.out.println("");
		
		
		//8진수
		int g=0;
		int Nnum2 = num;
		int[] eigth = new int[16];
		while(Nnum2>0) {
			eigth[g++] = Nnum2%8;
			Nnum2 /=8;
		}
		System.out.print(num+"의 8진수 : ");
		for (int k = g-1; k >=0; k--) {
			System.out.print(eigth[k]);
		}System.out.println("");
		
		//10진수
		System.out.println(num+"의 10진수 : "+num);
		
		//16진수
		int Nnum3 = num;
		char[] charArray = "0123456789abcdef".toCharArray();
		char[] sixteen = new char[16];
		int o =0;
		
		while(true) {
			sixteen[o++] = charArray[Nnum3 % 16];
			Nnum3/=16;
			if(Nnum3==0)break;
		}
		System.out.print(num+"의 16진수 : ");
		for (int j = o-1; j >=0; j--) {
			System.out.print(sixteen[j]);
		}System.out.println();
		
		
		System.out.println("@자바 제공하는 함수로 사용@");
		String binaryString = Integer.toBinaryString(num);
		System.out.println("10->2진수 : "+binaryString);
		
		
		String octalString = Integer.toOctalString(num);
		System.out.println("10->8진수 : "+octalString );
		
		String hexString = Integer.toHexString(num);//toHexString으로하면 소문자로 반환
		System.out.println("10->16진수 : "+hexString.toUpperCase());
	
		
		

	}
}
