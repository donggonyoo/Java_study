package ex4_map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 * map : 스트림의요소를 다른요소로 변경할수있는 함수
 * 		mapXXXX
 * 
 * mapToInt : Stream형 함수 -> IntStream 형
 * 
 * 메서드종류
 * Stream<R> map<Funcion<T,R>> : T형을입력받아 R형 Stream 생성 
 * Stream<R> mapToObj(DoubleFunction<R>) : double형을 입력받아 R리턴해 R형 Stream생성
 * Stream<R> mapToObj(IntFunction<R>) : int형을 입력받아 R리턴해 R형 Stream생성
 * Stream<R> mapToObj(LongFunction<R>) : long형을 입력받아 R리턴해 R형 Stream생성
 * 
 * IntStream mapToInt(ToIntFuction<T>) : T형 입력받아 int형 리턴해 IntStream생성
 * IntStream map(IntUnaryOperator) : int형 입력받아 int형 리턴해 IntStream생성
 * IntStream mapToLong(ToLongFunction<T>) : T형 입력받아 long형 리턴해 LongStream생성
 * IntStream mapToDouble(ToDoubleFunction<T>) : T형 입력받아 double형 리턴해 DoubleStream생성
 */
public class MapEx1 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("홍길동2","김삿갓","구운몽","임꺽정나간다","전우치43","이순신");
		System.out.println();
		//글자의 크기로 새로운 IntStream 생성
		//Stream<String>  list.stream();(리스트의요소를 가지고있는 stream)
//		IntStream isr = list.stream().mapToInt(String::length);//각 String의length를 반환해 IntStream으로
		
		IntStream isr = list.stream().mapToInt(s->s.length());//각 String의length를 반환함
	
		isr.forEach(System.out::println); /* 주의 : 한번만읽으면 다시 읽을 수 없게됨 */
		//stream은 1회용이라 생각해라 한번 순회하면 다시조회가불가능함!!!
		System.out.println("전제문자열크기 " + list.stream().mapToInt(s->s.length()).sum());
		System.out.println("전제문자열 갯수 " + list.stream().count());
		
		//1~100의 합 출력
		System.out.println("1~100의 합 : "+IntStream.range(1,101).sum());
		
		//list를 요소로 가진 학생 객체를 출력하기
		Stream<Student> sts = list.stream().map(s->new Student(s,0,0));
		//s(list) 입력받아서 Student형 Stream 반환
		sts.forEach(System.out::println);
		
	}
}
