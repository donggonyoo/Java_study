package ex5_flatmap;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Stream;

public class Exam2 {
	public static void main(String[] args) {
		//Stream.of(..) -> 내용으로 Stream 생성
		Stream<String[]> stream = Stream.of(new String[] {"ABC","def","JKL"},
				new String[] {"abc","GHI","jkl"});
		
		Function<String[], Stream<String>> f = Arrays::stream;
//		f = s-> Arrays.stream(s);
		
		stream.flatMap(f).forEach(System.out::println);
		//Stream<String[]> --> Stream<String> 변경
	}

}
