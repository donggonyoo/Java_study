package ex8_compose;

import java.util.Arrays;
import java.util.List;

public class SequencialVsParallelEx2 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(0,1,2,3,4,5,6,7,8,9);
		System.out.println("@@ Stream @@");
		long start = System.nanoTime();//1970년부터 현재까지 시간을 나노초리턴
		list.stream().forEach(a->System.out.println(Thread.currentThread()+":"+a));
		long end = System.nanoTime();
		double pow = Math.pow(10, -9);
		System.out.printf("순차 처리 시간 %,d ",(end-start));
		System.out.println();
		//병렬처리
		System.out.println("\n@@ parallelStream @@");
		start = System.nanoTime();
		list.parallelStream().forEach(a->System.out.println(Thread.currentThread()+":"+a));
		end = System.nanoTime();
		System.out.printf("병렬 처리 시간 : %,d ",(end-start));
	}
}
