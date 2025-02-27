package ex7_peek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.IntStream;

public class Exam1 {
	public static void main(String[] args) {
		
		System.out.println("1부터100까지의 랜덤한수 10개를 뽑아 홀수만 더해보자");
		System.out.println("== 리스트 이용 ==");
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 9; i++) {
			int num = new Random().nextInt(100)+1;
			list.add(num);
		}
		System.out.println("리스트 : "+list);
		
		int sum = list.stream().mapToInt(s->s.intValue()).filter(s->s%2==1)
				.peek(s->System.out.print(s+",")).sum();
		//maptoInt(s->s.intValue) : Stream<Integer> 
		//-> s.value() 로 int형을 반환해 IntStream 으로변경

		
		System.out.println(" = "+sum);
//------------------------------------배열을 사용한 방법-----------------------
		System.out.println("== 배열을 이용 ==");
		int arr[] = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i]= new Random().nextInt(100)+1;
		}
		int sum2 = Arrays.stream(arr).filter(s->s%2==1)
		.peek(s->System.out.print(s+",")).sum();
		
		System.out.println(" = "+sum2);
		
//----------------------------------------Random클래스------------------------
		System.out.println("== Random클래스 이용 ==");
		IntStream isr = new Random().ints(10,1,100);
		//ints(난수의 갯수, 시작숫자 , 종료 숫자) : 
		int tot = isr.filter(a->a%2==1)
		.peek(i->System.out.print(i+",")).sum();
		System.out.println("홀수의합 : "+tot);
	}
}
