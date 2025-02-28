package ex10_collect;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import clazz.Student2;
import clazz.Student2.City;
import clazz.Student2.Gender;

public class Ex04_Collect {
	public static void main(String[] args) {
		List<Student2> list = Arrays.asList(
				new Student2("홍길동", 50,Gender.MALE),
				new Student2("유관순", 90,Gender.FEMALE,City.SEOUL),
				new Student2("박아지", 30,Gender.MALE,City.BUSAN),
				new Student2("이시안", 80,Gender.FEMALE,City.SEOUL));
		
		System.out.println("1. 남학생의 이름 , 점수 출력해보기(list로)");
		List<Student2> maleList= 
				list.stream() // Stream(Student2)반환
				.filter(s->s.getGender().equals(Gender.MALE)) //s(Student2)의 성이 Gender.MALE과 같다면 넘긴다.
				.collect(Collectors.toList()); //Stream -> List로 변환
		
		maleList.stream().forEach(s->System.out.println(s.getName()+", "+s.getScore()));
		
		System.out.println("2.List로 생성해 여학생의 이름,점수 출력");
		List<Student2> femaleList= 
				list.stream() // Stream(Student2)반환
				.filter(s->s.getGender().equals(Gender.FEMALE)) //s(Student2)의 성이 Gender.FEMALE과 같다면 넘긴다.
				.collect(Collectors.toList()); //Stream -> List로 변환
		
		femaleList.stream().forEach(s->System.out.println(s.getName()+", "+s.getScore()));
		
		System.out.println("3.Set으로 생성해 여학생의 이름 점수 출력");
				Set<Student2> femaleSet = list.stream() // Stream(Student2)반환
				.filter(s->s.getGender().equals(Gender.FEMALE)) //s(Student2)의 성이 Gender.FEMALE과 같다면 넘긴다.
				.collect(Collectors.toCollection(HashSet<Student2>::new));
//				.collect(Collectors.toCollection(()->new HashSet<Student2>()));
				//.coleect(Collectors.toSet());
				
				femaleSet.stream().forEach(s->System.out.println(s.getName()+", "+s.getScore()));
				
//--------------------------------------최대값 , 최소값---------------------------------------------------------
		System.out.println("4. Score최대값은 누구인가?  ");
		Optional<Student2> max = 
				 list.stream()
				.collect(Collectors.maxBy(Comparator.comparing(s->s.getScore())));
		max.ifPresent(System.out::println);
		System.out.println("점수가 가장높은학생 : "+max.get().getName()+" score : "+max.get().getScore());
		
		System.out.println("5.Score 최소값은 누구인가??");
		Optional<Student2> min = list.stream()
		.collect(Collectors.minBy(Comparator.comparing(s->s.getScore())));
		min.ifPresent(s->System.out.println(s));
		System.out.println("점수가 가장낮은학생 : "+min.get().getName()+" score : "+min.get().getScore());
		
//---------------------------------------------joining-----------------------------------------------------
		System.out.println("6.list 학생의 이름들을 출력하기");
		list.stream().map(s->s.getName()).forEach(s->System.out.print(s+", "));
		System.out.println();
		/*
		 * Collectors.joining(구문자 , 시작문자 , 끝문자);
		 * Stream의요소를 연결해 문자열 리턴
		 * 구문자 : 문자열 사이의 구분 표시
		 */
//		list.stream().map(Student2::getName).forEach(s->System.out.print(s+", "));
		String names = list.stream().map(Student2::getName)
		.collect(Collectors.joining("-" , "[" , "]"));
		System.out.println(names);
		
		
		
				

		
	}

}
