package ex8_compose;

import java.util.Arrays;
import java.util.List;

public class SequencialVsParallelEx1 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(0,1,2,3,4,5,6,7,8,9);
		System.out.println("@@ Stream @@");
		long start = System.nanoTime();//1970년부터 현재까지 시간을 나노초리턴
		list.stream().forEach(a->System.out.print(a+","));
		long end = System.nanoTime();
		System.out.println("순차 처리 시간 " +(end-start));
		
		System.out.println("@@ parallelStream @@");
		start = System.nanoTime();
		list.parallelStream().forEach(a->System.out.print(a+","));
		end = System.nanoTime();
		System.out.println("병렬 처리 시간 : "+(end-start));
	}

}
