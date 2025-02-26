package ex3_filter;

import java.util.Arrays;
import java.util.List;
/*
 * distinct() 중복요소제거
 * filter(Predicate p) : p가 true인경우에만 실행이계속된다.
 */
public class FilterStreamEx1 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("홍길동","김삿갓","홍길동","임꺽정","홍길동");
		list.stream().forEach(s->System.out.print(s+"\t"));
		System.out.println();
		System.out.println("==중복제거 출력== ");
		//중복내용제거출력
		list.stream().distinct().forEach(s->System.out.print(s+"\t"));
		System.out.println();
		
		System.out.println("==\"홍\" 으로시작하는 문자열 모두출력==");
		list.stream().filter(n->n.startsWith("홍")).forEach(s->System.out.printf(s+"\t"));
		System.out.println();
		
		System.out.println("==\"홍\" 으로시작하는 문자열 모두출력(중복제거)==");
		list.stream().
		filter(n->n.startsWith("홍")).distinct().forEach(s->{
			System.out.println("index : "+list.indexOf(s));//해당요소인덱스반환
			System.out.print(s+"\t");
		});
		//filter()로 stream의 데이터를 걸러준다 
		
		
		
	}
}
