package test;

import java.util.Scanner;

/*
 * 다음 결과가 나오도록 School,Student 클래스를 완성하시오
 * [결과]
================================
학번 : 10101
이름 : 정숙
국어 : 100
영어 : 90
수학 : 80
================================
학번 : 10101
이름 : 정숙
국어 : 100
영어 : 90
수학 : 80
================================
학번 : 10101
이름 : 정숙
국어 : 100
영어 : 90
수학 : 80
 */

class School{

	public String name;
	public Student2[] students; 
	//student2 참조를 가지고있음 == 객체화만 시켜주면 된다.
	
}
class Student2{
	public  Score score; //new Score()로 객체만들어서 사용하자
	String name;
	String stuNo;
	
	
}
class Score{
	int kor;
	int eng;
	int math;
}



public class Test5 {
	public static void main(String[] args) {
		// School 객체 생성
		School school = new School();
		Scanner scan = new Scanner(System.in);
		school.name = "구디초";
		school.students = new Student2[3];//Student2객체가아님 ,Student2 참조변수의 배열
		for(int i = 0; i < school.students.length; i++) {
			// Student 객체 생성
			school.students[i] = new Student2();
			System.out.print("학생이름 : ");
			String name = scan.next();
			school.students[i].name = name;
			school.students[i].stuNo = "10101";
			// Score 객체 생성
			school.students[i].score = new Score();
			school.students[i].score.kor = 100;
			school.students[i].score.eng = 90;
			school.students[i].score.math = 80;
			System.out.println("================================");
			System.out.println("학번 : " + school.students[i].stuNo);
			System.out.println("이름 : " + school.students[i].name);
			System.out.println("국어 : " + school.students[i].score.kor);
			System.out.println("영어 : " + school.students[i].score.eng);
			System.out.println("수학 : " + school.students[i].score.math);
	    }
	}
}
