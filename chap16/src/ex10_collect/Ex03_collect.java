package ex10_collect;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import clazz.Student;

public class Ex03_collect {
	public static void main(String[] args) {
		Student[] stuArr = {   
				new Student("이자바", 3, 30, 66, 78),
				new Student("김자바", 1, 50, 70, 68),
//				new Student(name, ban,eng,math,kor)
				new Student("안자바", 2, 60, 80, 42),
				new Student("박자바", 2, 80, 20, 30),
				new Student("소자바", 1, 70, 30, 67),
				new Student("나자바", 3, 90, 40, 58),
				new Student("감자바", 1, 20, 45, 55)};
		System.out.println("1, eng점수의 합 Collectors.reducing");
		/*
		 * Collectors.reducint(10000,Student::getEng,Integer::sum)
		 * 10000 : 초기값
		 * Student::getEng : 선택 컬럼
		 * Integer::Sum : 함수
		 */
		Integer engTotal = Stream.of(stuArr).collect(Collectors.reducing(10000,Student::getEng,Integer::sum));
		System.out.println("형어접수의 합 : "+engTotal);
		
		List<Integer> number = Arrays.asList(1,2,3,4,5);
		Optional<Integer> sum = number.stream().collect(Collectors.reducing((a,b)->a+b));
		sum.ifPresent(System.out::println);
		//Optional : 값이 없을 가능성이있음.
		//ifPresent : 값이 있으면 값으로 지정된 작업 수행, 그렇지 않으면 아무 작업도 수행하지 않습니다.
		
		 number = Arrays.asList();
		Optional<Integer> sum2 = number.stream().collect(Collectors.reducing((a,b)->a+b));
		sum2.ifPresent(System.out::println);//값이없는데 출력시도 --> 아무일도 일어나지않음
	}
}
