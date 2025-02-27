package ex5_flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class Exam1 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("This is a Java book",
				"Lambda Expressions",
				"Java8 supports lambda Expressions");
		
		
		Function<String, Stream<String>> f = s->{
			return Arrays.stream(s.split(" "));
			//문자배열 --> Stream<String>
		};
		
		
		list.stream().flatMap(f).forEach(s->System.out.println(s));
	}
}
