package ex7_init;
/*
 * 초기화 블럭 예제
 * static 초기화블럭 : 클래스변수의 초기화 . 
 * 					 클래스 정보 로드 시 한번만 실행됨.
 * 					 main 메서드보다 먼저 실행
 * 
 * 인스턴스 초기화블럭 : 인스턴스변수의 초기화담당 , 생성자와 기능이겹침
 * 					객체화 시 생성자 호출전에 실행됨
 * 
 * 추상화 => 클래스생성의 과정 , 클래스는 사용자정의 자료형이다.
 * 
 * 			변수(속성, 명사적인 특징(이름 나이 등) : 
 * 		       1. 클래스변수(static) : 클래스 정보 로드 시 메모리할당 . 모든객체의 공유변수
 * 			   2. 인스턴스변수(멤버변수) :객체별로 다른 메모리영역할당
 * 
 * 			메서드(기능, 동사적인 특징(가다 , 먹다 등))
 *               1.클래스 메서드(static):클래스정보 로드시 메서드 실행 준비완료
 *               2.인스턴스 메서드      : 객체화 시 메서드 실행 준비완료
 *               
 *      클래스 멤버  : (static)클래스 변수 + (static)클래스 메서드
 *      
		인스턴스멤버 : ﻿ 인스턴스 변수 + 인스턴스 메서드 + 생성자



		주의 : 클래스멤버에서  인스턴스 멤버 호출 시 객체화 필요
		
		생성자 : 객체화시 호출되는 메서드 , 인스턴스메서드
		
		this : 자기 참조변수 , 인스턴스메서드에서만 사용가능(힙영역)
		
		this() : 생성자. 같은클래스 내의 다른 생성자 호출 시 사용
 * 상속
 * 캡슐화
 * 다형성
 */

public class InitEx1 {
	static int cv;
	int iv;
	InitEx1(){//satic블록 > 인스턴스블록 > 생성자 순으로 실행됨
		System.out.println("5.생성자호출\n");
	}
	//static 초기화블록 
	static { //클래스가 메모리에 처음 로딩 될 떄 한번만 수행 (가장먼저 로드 됨)
		
		cv = (int)(Math.random()*100);
		System.out.println("1.static 초기화블럭 실행 : cv="+cv);
	}
	
	//인스턴스 블록 
	{// 객체화될 떄(인스턴스 생성) 마다 실행 , 생성자보다 빨리 실행
		iv =  (int)(Math.random()*100);
		System.out.println("4.인스턴스 초기화블럭 실행 : iv="+iv);
	}
	
	public static void main(String[] args) {
		System.out.println("2.main메서드 시작");
		System.out.println("3.main메서드 init1 객체 생성");
		InitEx1 init1= new InitEx1();

		System.out.println("3.main메서드 init2 객체 생성");
		InitEx1 init2 = new InitEx1();
	
		System.out.println("InitEx1.cv : "+InitEx1.cv);
		
		System.out.println("init1.iv : "+init1.iv);
		System.out.println("init2.iv : "+init2.iv);
		
	}
}
