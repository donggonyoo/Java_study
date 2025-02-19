package ex6_final;
/*
 * final제어자 : 변경불가의 의미
 * 
 * fianl 클래스 (종단클래스) : 상속불가 클래스 , 다른클래스의 부모가 될 수 없음
 * 
 * String , Math 클래스 : final 클래스(불변클래스)
 */
class A{
	
}

public final class FinalClass extends A{
	
}
/*
 * class SubClass extends FinalClass{};
 * 
 * class MyString extends String{};
 * 
 * class MyMath extends Math{};
 */