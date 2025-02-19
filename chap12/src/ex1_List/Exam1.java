package ex1_List;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 화면에서 정수를 입력받아 입력받은 숫자의 합계 , 평균, 중간값 출력
 * 999숫자 입력된경우 입력종료
 */
public class Exam1 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
		int sum=0;
		double avg= 0;
		
		while(true) {
			System.out.println(" 정수를입력 :(999 종료)");
			int num = scan.nextInt();
			if(num==999) {
				break;
			}
			list.add(num);
		}
		
		for (Integer i : list) {
			sum+=i;
		}
		avg = sum/list.size();
		
		double mid = 0;
		if(list.size()%2==0) {
			mid = list.get(list.size()/2)+ list.get(list.size()/2-1);
			mid = mid/2;
		}
		
		else {
			mid = list.get(list.size()/2);
		}
		System.out.println("입력 수 :"+list);
		System.out.println("sum : "+sum);
		System.out.println("avg : "+avg);
		System.out.println("중간값 : "+mid);

	}

}
