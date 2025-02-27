package ex6_sort;

import java.util.Comparator;
import java.util.stream.Stream;

import clazz.Student;

public class SortedEx3 {
	public static void main(String[] args) {
		Stream<Student> stStream = Stream.of(new Student("김길동", 1, 89, 50, 78),
				new Student("박아지", 1, 60, 10, 70),
				new Student("김삿갓", 1, 79, 20, 55),
				new Student("임마", 3, 49, 30, 50),
				new Student("이몽룡", 2, 50, 40, 60),
				new Student("유관순", 4, 89, 80, 88));
		stStream.sorted(
				Comparator.comparing(Student::getBan)//반별정렬(1차정렬) 메서드참조방식
				.thenComparing(Comparator.naturalOrder()))//기본정렬(2차정렬)
		.forEach(System.out::println);
	}

}
