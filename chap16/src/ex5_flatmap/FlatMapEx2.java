package ex5_flatmap;

import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 * IntStream flatMapToInt() : Stream을 IntStream 으로 변경
 * 
 *
 */
public class FlatMapEx2 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("10,20,30,a","40,50,60");
		//list를 IntStream으로변경하기
		
		//flatMaptoInt의 api를 확인해보면 <? super String , IntStream>을 확인가능
		Function<String, IntStream> f= data->{
			 String[] strArr = data.split(",");
			 int[] intArr = new int[strArr.length];//int형 배열 생성
			 for (int i = 0; i < strArr.length; i++) {
				 try {
				 intArr[i] = Integer.parseInt(strArr[i]);
				 }
				 catch (NumberFormatException e) {
					intArr[i] = 0;
				}
				
			}return Arrays.stream(intArr);
		 };
		 
		 IntStream isr = list.stream().flatMapToInt(f);
//		 isr.forEach(s->System.out.println(s));
		 isr.forEach(System.out::println);
		 
		 
		 
 		 
		 //숫자들의 갯수 합 평균 출력
		System.out.println("숫자의 갯수 "+list.stream().flatMapToInt(f).count());
		
		System.out.println("숫자의 합 "+list.stream().flatMapToInt(f).sum());
		
		System.out.println("숫자의 평균 "+list.stream()
		.flatMapToInt(f).average().getAsDouble());
		 
		 
		
	}

}
