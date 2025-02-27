package ex6_sort;

import java.util.Arrays;
import java.util.List;

import clazz.Student;
/*
 * Student 클래스의 기본정렬 방식 구현 : 이름순으로
 * sorted() : Stream의 요소들을 정렬해 Stream 으로 리턴
 *       --> 요소들은 Comarable 객체로 형변환이 가능해야함(구현해야함)
 *       
 * sorted(Comarator) -> Comparator 객체가 구현된 형태로 정렬함
 */
public class SortedEx2 {
	public static void main(String[] args) {
		
		List<Student> list = Arrays.asList(new Student("홍길동", 1, 89, 56, 66),
				new Student("김삿갓", 1, 29, 46, 86),
				new Student("이몽룡", 1, 39, 86, 96),
				new Student("임꺽정", 1, 79, 66, 46),
				new Student("박아지", 1, 69, 36, 76));
		list.stream().sorted().forEach(System.out::println);
		//내가 만든 클래스에는 기본적으로 Comparable이 구현되어있지않음
		//구현 후 CompareTo메서드를 목적에맞게바꾸자
		System.out.println("총점순으로 정렬하기");
								//오름차순 정렬 : (s1,s2)->s1-s2 (결과가 음수면 s1이 앞이란 소리임)
								//내림차순 정렬 : (s1,s2) ->s2-s1 or (s1-s2)*-1
		list.stream().sorted((s1,s2)->(s1.getTotal()-s2.getTotal())*-1).forEach(System.out::println);
	}
}
