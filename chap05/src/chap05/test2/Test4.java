package chap05.test2;

import java.util.Iterator;
import java.util.Scanner;

/*
 [결과]
--------------------
1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
--------------------
선택>1
학생수>5
--------------------
1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
--------------------
선택>2
scores[0]>100
scores[1]>50
scores[2]>80
scores[3]>75
scores[4]>95
--------------------
1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
--------------------
선택>3
score[0]:100
score[1]:50
score[2]:80
score[3]:75
score[4]:95
--------------------
1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
--------------------
선택>4
최고 점수:100
평균 점수:80.0
--------------------
1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
--------------------
선택>5
프로그램 종료
 */
public class Test4 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		 
		int[] students= null;
		//참조변수만 있다 (주소)
		int count = 0;
		
		
		while(true) {
			System.out.println("--------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------");
			System.out.print("선택 -> ");
			int num = scan.nextInt();
			
		if(num==1) {
			System.out.print("학생 수 : ");
			count = scan.nextInt();
			students = new int[count];
			
		}
		else if(num==2){
			for (int i = 0; i < students.length; i++) {
				System.out.print("score["+(i+1)+"] : ");
				int score = scan.nextInt();
				students[i] = score;
			}
		}
		else if( num==3) {
			int sum=0;
			double avg=0;
			 
			for (int i = 0; i < students.length; i++) {
				
				System.out.print("score["+(i+1)+"] : "+students[i]+"  ");
			}System.out.println();
		}
		
		else if(num==4) {
			int max=0;
			int sum=0;
			double avg=0;
			for (int i = 0; i < students.length; i++) {
				sum+=students[i];
				if(max < students[i]) {
					max = students[i];
				}
			}
			System.out.print("최고점수 : ");
			System.out.println(max);
			System.out.printf("평균 : %.3f ",(double)sum/students.length);
		}
		else {
			break;
		}
		
		
		}
	}
}