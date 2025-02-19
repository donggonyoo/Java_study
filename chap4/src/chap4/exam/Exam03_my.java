package chap4.exam;

import java.util.Random;
import java.util.Scanner;

/*
 * 1,2,3 중 한개의임의의값을 생성해
 * 1.가위
 * 2.바위
 * 3.보자기      
 * 출력
 * 
 * 시스템 사용자
 * 1      1      비김
 * 1       2     사용자 이김
 * 1       3     시스템 승
 */

public class Exam03_my {
	public static void main(String[] args) {
		
		
		System.out.println("USER1\tUSER2");
		for (int i = 0; i < 3; i++) { //3판만
			int user1 = (int)(Math.random()*3)+1; // (0 <= r < 3 )+1 ==> (int)( 1 <= r < 4 ) ==> 1 2 3 중에 나옴 
			int user2 = (int)(Math.random()*3)+1;
			int[] a = {user1 , user2 };
			for(int k=0; k<a.length;k++) {
				System.out.print((a[k]==1?"가위":a[k]==2?"바위":"보")+"\t");
			}
			
			if(a[0]==1 && a[1]==3
					|| a[0]==2 && a[1]==1
					|| a[0]==3 && a[1]==2) {
				System.out.println("user1 승리");
			}
			else if(a[0]==a[1]) {
				System.out.println("비김");
			}
			else {
				System.out.println("user2 승리");
			}
			
		}
		
	}
}


