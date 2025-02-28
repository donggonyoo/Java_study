package ex10_collect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import clazz.Student;

/*
 * collect(Collector 인터페이스 ) : Collection객체로 변경
 * Collectors 클래스 : Collector 인터페이스 구현체
 * 			toList() : List객체로변경
 * 			toMap(key,value) : Map객체로 	변경
 * 
 * toArray(요소의자료형[]::new) : Stream을 배열로 변경
 */
public class Ex02_Collect {
	public static void main(String[] args) {
		Student[] stuArr = {   new Student("이자바", 3, 30, 66, 78),
			new Student("김자바", 1, 50, 70, 68),
			new Student("안자바", 2, 60, 80, 42),
			new Student("박자바", 2, 80, 20, 30),
			new Student("소자바", 1, 70, 30, 67),
			new Student("나자바", 3, 90, 40, 58),
			new Student("감자바", 1, 20, 45, 55)};
		System.out.println("1. 학생이름만 뽑아서 List<String>에 저장");
		//Stream<Student> Stream.of(stuArr)
		//Stream<String> map(Student::getName) //getName은 Student의 name Getter
		//collect(Collectors.toList()) : Stream(String) --> List<String>
		List<String> names = Stream.of(stuArr)
				.map(s->s.getName()) //Stream<Student> --> Stream<String> 으로바꿔줌
				.collect(Collectors.toList());
//		List<String> names = Stream.of(stuArr).map(Student::getName).collect(Collectors.toList());
		
		System.out.println(names);
		System.out.println("학생 이름만 뽑아서 String[] 에 저장");
		String[] nameArr = Stream.of(stuArr)
				.map(Student::getName)
				.toArray(String[]::new);//Strema<String>-->새로운String[] 객체로 생성
		
		System.out.println(Arrays.asList(nameArr));
		
		System.out.println("3. Map<String , Student>로 변환 key는 name");
		Map<String,Student> map = Stream.of(stuArr)
				/*
				 * toMap(Function<? super Student ,? extends String> KeyMapper
				 * 							: Student객체를 매개변수입력 String리턴
				 * 
				 * 		(Function<? super Student , ? extends Studnet> valueMapper
				 * 								: Student객체를 매개변수입력. Student리턴
				 */
				.collect(Collectors.toMap(s->s.getName(), s->s));
		//s : Student자료형
			//key : s.getName()
			//value : s->s( 자기 자신의 자료형을 나타냄)
		for (String s : map.keySet()) {
			System.out.println(s+" : "+map.get(s));
		}
		
		System.out.println("4 . Stream의 요소의 갯수 출력하기");
		long count = Stream.of(stuArr).count();
		System.out.println("요소의갯수 : "+count);
		Long cCount = Stream.of(stuArr).collect(Collectors.counting());
		System.out.println("요소의갯수(collect이용) "+cCount);
		
		
		
		}
	}


