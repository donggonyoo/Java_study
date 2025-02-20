package ex2_set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*
 * Student클래스구현
 * 멤버변수 : 학번 이름 전공
 * 멤버메서드 학생정보출력하게 toString
 * 		compareTo() 메서드에서 기본정렬방식이 학번순으로정렬되게 설정
 * 		이름과 학번이 같은경우 같은학생으로 인식하도록설정
 */
class Student implements Comparable<Student>{
	String name,major;
	int studno;
	public Student(String name, String major, int studno) {
		super();
		this.name = name;
		this.major = major;
		this.studno = studno;
	}
	public String toString() {
		return "(전공 : "+major+", 학번 : "+studno+", 이름 : "+name+")";
	}
	@Override
	public int compareTo(Student o) {
		return studno - o.studno;
	}
	@Override
	public int hashCode() {
		
		return name.hashCode()+studno;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student s = (Student)obj;
			return name.equals(s.name) && studno==s.studno;
		}
		else return false;
	}
	
}
public class Exam1 {
	public static void main(String[] args) {
		Set<Student> s = new HashSet<>();
		
		s.add(new Student("유동", "전자공학", 19));
		s.add(new Student("유동", "전자공학", 19));
		s.add(new Student("유동", "전기", 15));
		s.add(new Student("유동", "전기", 15));
		s.add(new Student("하하", "통신", 13));
		System.out.println(s);
		
		System.out.println("--방법 1 --");
		TreeSet<Student> treeSet = new TreeSet<>(s);
		//TreeSet에 객체를 사용할떄는  객체가Comparable을 구현해야함
		//Integer , String 등은 기본적으로 오버라이딩이 돼 있음.
		System.out.println(treeSet);
		
		System.out.println("--방법2--");
		ArrayList<Student> arrayList = new ArrayList<>(s);
		Collections.sort(arrayList);
		System.out.println(arrayList);
		
	
	
	}

}
