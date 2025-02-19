package test;
import java.net.PortUnreachableException;
import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
/*
회사가 고용하는 여러 유형의 직원들이 있다.
직원은 정규직원과 비정규직원 으로 나뉜다.

모든 직원은 직원구분(type), 이름(name), 주소(address),소속부서(dept)정보를 가진다.
정규직원은 직원번호(empNo), 직급(position), 연봉(salary)를 가진다.
비정규직원은 계약만료일(expireDate), 기본임금(primaryPay)를 가진다.

 직원클래스(Employee)
 정규직원 클래스(FormalEmployee)
 비정규직원클래스(InformalEmployee)

 또한 모든 직원은 급여를 받는다.
 정규직원은 급여로 연봉 / 12 로 
 비정규직원은 기본입금
 FormalEmployee,InformalEmployee클래스에 getPay() 메서드를 구현하기 

 구동클래스 실행시 다음의 결과가 나오도록 클래스 생성하기

[결과]
정규직:이름=김정규, 주소=서울시 용산구,부서=총무부,직원번호=1,직급=과장,연봉=5000
김정규의 급여 : 416
비정규직:이름=이비정, 주소=서울시 구로구,부서=영업부,계약만료일=Sun Sep 01 15:58:50 KST 2024,기본입금=200
이비정의 급여 : 200
 */


class Employee{
	String address,dept,name;
	String type;
	public Employee(String name , String address , String dept ) {
		this.name = name;
		this.address = address;
		this.dept = dept;

	}
	public String toString() {
		return type+": 이름 = "+name+", 주소 = "+address;
	}
}

//--------------------------------------------------------------------------------------

class FormalEmployee extends Employee{
	String no;
	int salary;
	String position;
	//부모의 생성자가 매개변수가있다면 필수로 호출
	public FormalEmployee(String name, String address, String dept,String no,int salary , String position) {
		super(name, address, dept);
		type = "정규직";//필드를구현하지않앗지만 부모에 type필드가존재
		this.no = no;
		this.salary = salary;
		this.position = position;
	}
	public int getPay() {
		return salary/12;
	}

	public String toString(){//super.toString()부모의 toString 호출
		return super.toString()+",직원번호 : "+no+",직책 : "+position;
	}	
}

//------------------------------------------------------------------------------

class InformalEmployee extends Employee{

	int primaryPay;
	DayOfWeek week;
	LocalDateTime date;
	public InformalEmployee(String name, String address, String dept,DayOfWeek week,LocalDateTime date ,int primaryPay) {
		super(name, address, dept);
		super.type = "비정규직";
		this.primaryPay = primaryPay;
		this.week= week;
		this.date = date;
	}
	public int getPay() {
		return primaryPay;
	}

	public String toString() {
		return super.toString()+",  계약 만료일 : "+week+date;

	}	
}


public class Test5 {
	public static void main(String[] args) {
		//정규직원 객체 생성
		FormalEmployee fe = new FormalEmployee
				("김정규", "서울시 용산구","총무부", "1", 5000, "과장");
		System.out.println(fe);
		System.out.println(fe.name + "의 급여 : " +   fe.getPay());

		//		  Date expireDate = new Date(); //현재날짜 시간.
		//		  expireDate.setTime(expireDate.getTime() +
		//				   (1000L * 60 * 60 * 24 * 365 * 2)); 밑에방법이 더 정확하고 간단

		LocalDateTime now = LocalDateTime.now();
		LocalDateTime ldt= now.plusYears(2);
		DayOfWeek week = ldt.getDayOfWeek();


		InformalEmployee ie = new InformalEmployee
				("이비정", "서울시 구로구", "영업부", week,ldt, 200);
		System.out.println(ie);
		System.out.println(ie.name + "의 급여 : " +  ie.getPay());
	}
}
