package ex5_flatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student{
	String name;
	int score;
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	@Override
	public String toString() {
		return "["+ name + ", score=" + score + "]";
	}
	
}
public class FlatMapEx3 {
	public static void main(String[] args) {
		List<Student> list1 = Arrays.asList(new Student("홍", 10),
				new Student("김", 5),
				new Student("LEE", 30),
				new Student("유", 60));
		List<Student> list2 = Arrays.asList(new Student("박", 14),
				new Student("choi", 30),
				new Student("하", 60));
		List<List<Student>> stu = new ArrayList<List<Student>>();
		stu.add(list1);
		stu.add(list2);//2개의 리스트 추가
		//stu.stream() : list를 요소로가진 스트림
		//.flatMap(s->s.stream()) : List<Student> -> Stream<Student>변경
		
//		stu.stream().flatMap(List::stream).forEach(System.out::println);
		stu.stream().flatMap(s->s.stream()).forEach(s->System.out.println(s));
				
	}

}
