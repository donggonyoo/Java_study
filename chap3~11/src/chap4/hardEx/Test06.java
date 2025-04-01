package chap4.hardEx;

import java.util.Scanner;

/*
점수를 입력받아 
    95점 이상인 경우 A+        90 ~ 94 : A0  
    89 ~ 85점 이상인 경우 B+   80 ~ 84 : B0 
    79 ~ 75점 이상인 경우 C+   70 ~ 74 : C0 
    69 ~ 65점 이상인 경우 D+   60 ~ 64 : D0 
       그외는 F 로 출력하기.
    중첩 조건문을 이용하여 구현하기 
*/
public class Test06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("성적 입력 : ");
		int score= scan.nextInt();
		
		if(score>=90) {
			if(score<95) {
				System.out.println("A");
			}else {System.out.println("A+");}
		}
		
		else if(score>=80) {
			if(score<85) {
				System.out.println("B");
			}else {System.out.println("B+");}
		}
		
		else if(score>=70) {
			
			if(score<75) {
				System.out.println("C");
			}else {
				System.out.println("C+");}
		}
		
		else if(score>=60) {
			if(score<65) {
				System.out.println("D");
			}else {
				System.out.println("D+");}
		}
		else {
			System.out.println("FFFF");
		}
		
		
		
	}
}
