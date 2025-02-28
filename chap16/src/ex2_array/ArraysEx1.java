package ex2_array;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 * 배열객체 이용해 stream객체 생성
 */
public class ArraysEx1 {

	public static void main(String[] args) {
		
//----------------------------------Stream<T>-----------------------------
		String[] arr = new String[] {"a","b","c"};
	    Stream<String> stream1 = Arrays.stream(arr);
		stream1.forEach(s->System.out.print(s+"\t"));
		System.out.println();
		Stream<String> stream2 = Arrays.stream(arr,1,3);//1번2번 배열만.!
		stream2.forEach(s->System.out.print(s+"\t"));
		System.out.println();
		//Collection.stream()
		List<Object> list = Arrays.asList(1,2,4,5,"하하","안녕");
		Stream<Object> stream3 = list.stream();
		stream3.forEach(s->System.out.printf(s+"\t"));
		
//-----------------------------IntStream-----------------------------------
		int[] intArr = {1,2,3,4,5};
		System.out.println("\nArrays.stream메서드 이용-->IntStream 생성");
		IntStream intSt1 = Arrays.stream(intArr);
		intSt1.forEach(s->System.out.print(s+"\t"));
		System.out.println();
		
		IntStream intSt2 = IntStream.of(intArr);
		intSt2.forEach(s->System.out.printf(s+"\t"));
		System.out.println();
		
		//rangeClosed(1,5) :1~5까지의숫자를 IntStream으로생성
		IntStream intSt3 = IntStream.rangeClosed(1, 5);
		intSt3.forEach(s->System.out.print(s+"\t"));
		System.out.println();
	}
}

