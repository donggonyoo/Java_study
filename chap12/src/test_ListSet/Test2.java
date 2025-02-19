package test_ListSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
화면에서 여러개의 자연수를 입력받아(0을 입력시 입력종료) 이들 중 
홀수 인 자연수들만 이루어진 List 객체에 저장 
List  객체의 요소의 합을 구하고,
홀수 중 최대값, 최소값, 중간값 을 찾는 프로그램을 작성하기
단 자연수가 아닌 경우가 입력되면 무시한다.
홀수 들로만 이루어진 List 객체를 생성하여 출력하기

최대값과 최소값 :
Collections.max(list)와 Collections.min(list) 함수를 이용한다
중간값 :
 요소의 갯수가 홀수인 경우 : 가운데 값
 요소의 갯수가 짝수인 경우 : 가운데 값 2개의 평균

 [결과]
자연수를 입력하세요 종료(0)
12 77 38 41 53 92 85 aaa 0
[77, 41, 53, 85]의 합:256
홀수의 최대값:85
홀수의 최소값:41
홀수의 최대값 위치:3
홀수의 최소값 위치:1
입력된 홀수 목록:[77, 41, 53, 85]
중간값 :65.0
 */
public class Test2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("여러개의 자연수를 입력하세요 : (0입력시종료)");
		ArrayList<Integer> list = new ArrayList<>();
		int sum=0;

		while(true) {
			try {
				int n = scan.nextInt();//이래야 문자를입력해도 오류가안나지
				if(n==0) {break;}
				else {
					if(n%2 !=0) {
						list.add(n);
						sum+=n;
					}
				}
			} catch (InputMismatchException e) {
				scan.next();
				//만약 nextInt인데 문자값을 넣었다면
				//예외를 잡은 후 그 문자만 없애주고 다시 while문 시작
				//즉 문자를 입력하면 아무일도일어나지않은듯 루프가 돌아감
			}
		}
		
		
		System.out.println(list+"의 합 : "+sum);
		Integer max = Collections.max(list);
		Integer min = Collections.min(list);
		System.out.println("홀수의 최대값 : "+max);
		System.out.println("홀수의 최소값 : "+min);
		System.out.println("홀수의 최대값 위치 : "+list.indexOf(max));
		System.out.println("홀수의 최소값 위치 : "+list.indexOf(min));
		//Integer(객체)를 get에 넣으면 값의 위치를 반환해줌 
		//int를 넣을시 해당인덱스를 얘기함
		System.out.println("입력된 홀수 목록 : "+list);
		Collections.sort(list);
		double mid = 0;
		if(list.size()%2==0) {
			mid = (double)(list.get(list.size()/2)+list.get(list.size()/2-1))/2;
			System.out.println("중간값 : "+mid);
		}
		else {
			System.out.println(list.get(list.size()/2));
		}
	}
}
