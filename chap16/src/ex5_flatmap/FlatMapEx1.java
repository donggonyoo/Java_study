package ex5_flatmap;

import java.util.Arrays;
import java.util.List;

/*
 * flatMap 함수 : 다른형태의 요소로 새로운 스트림을 생성
 * 
 * Stream<R> flatMap(Function<T,Stream<R>>) : 
 * T를 입력받아 Stream<R>로반환
 * 
 * DoubleStream flatMap(DoubleFunction<DoubleStream>) : 
 * double형을 매개변수로입력받아 DoubleStream 으로리턴
 * 
 * IntStream flatMap(IntFunction<IntStream>) : 
 * int형 매개변수로 입력받아 IntStream으로 리턴
 * 
 * IntStream flatMapToInt(Function<T,IntStream>) : 
 * T를 매개변수로 입력받아 IntStream으로 리턴
 * 
 *
 */
public class FlatMapEx1 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("자바 8 버전에","추가된 스트림을","열심히 공부하자");
		list.stream()//3개의문자열 요소를 Stream<String> 생성
		//data.split(" "); data값을 공백을 기준으로 문자열배열로리턴 (String[])
		//Arrays.stream(data.split(" ")) : 문자배열--> Stream<String>
		//flatMap : Stream<String> 요소 3개 --> Stream<String>요소 7개
		.flatMap(data->Arrays.stream(data.split(" ")))
		.forEach(word->System.out.println(word));
	}

}
