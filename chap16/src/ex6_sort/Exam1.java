package ex6_sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import clazz.Student;

public class Exam1 {
	public static void main(String[] args) {
	//Stream은 순회 후 초기화되므로 List를 미리 만들어 재사용성을 높임
		List<Student> list = Arrays.asList(new Student("김길동", 1, 89, 50, 78),
				new Student("박아지", 1, 60, 10, 70),
				new Student("김삿갓", 1, 79, 20, 55),
				new Student("임마", 3, 49, 30, 50),
				new Student("이몽룡", 2, 50, 40, 60),
				new Student("이지상", 2, 30, 30, 30),
				new Student("유관순", 4, 89, 80, 88));
		
		System.out.println("==반별로 정렬 후 총점의 오름차순정렬!!==");
		//list ---> Stream(Student) 생성
		list.stream().sorted(Comparator.comparing(Student::getBan)//메서드정렬
				.thenComparing((s1,s2)->s1.getTotal()-s2.getTotal())
				//thenComparing 은 람다식으로 정렬이가능함
				
//				.thenComparing(s->s.getTotal())
//				.thenComparing(Comparator.comparing(Student::getTotal))
				)
		.forEach(System.out::println);

//---------------------------==반별로 정렬 후 총점의 내림차순정렬==---------------------------------------------------
		System.out.println("==반별로 정렬 후 총점의 내림차순정렬!!==");
		
		list.stream().sorted(Comparator.comparing(Student::getBan)
				.thenComparing((s1,s2)->(s1.getTotal()-s2.getTotal())*-1)
//				.thenComparing(s->s.getTotal()*-1)
				)
		.forEach(System.out::println);
//----------------------------반 별 영어점수 내림차순--------------------------------------------------		
		System.out.println("==반 별 영어점수의 내림정렬 ==");
		//반별 영어점수의 내림 정렬하기
		list.stream().sorted(Comparator.comparing(Student::getBan)
				.thenComparing(s->s.getEng()*-1)
				)
		.forEach(System.out::println);
//-----------------------------반 별 수학점수 오름차순--------------------------------------------------
		System.out.println("=== 반 별 수학점수의 오름차순정렬 === ");
		list.stream().sorted(Comparator.comparing(Student::getBan)
				.thenComparing(s->s.getMath())
				)
		.forEach(System.out::println);
	}
}
