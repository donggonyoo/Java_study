package chap9;

import chap9.Outer3.InstanceInner;

/*
 * 내부클래스에서 사용되는 this , super
 */
class ParentOuter{
	
	int iv = 5;
	int piv = 560;
}

class Outer3 extends ParentOuter{
	int iv = 10;
	int iv2 =20;
	class InstanceInner{
		int iv =100;
		void method() {
			int iv = 300;
			/*
			 * 내부클래스의 멤버메서드에서 변수 접근 우선순위
			 * (변수명이 같다면 ) 
			 * 
			 * 1.지역변수
			 * 2.내부클래스의 멤버변수 : this.멤버변수 
			 * 3.외부클래스의 멤버변수 : 외부클래스명.this.멤버변수
			 * 4.외부클래스 부모의 멤버변수 : 외부클래스명.super.멤버변수 
			 */
			System.out.println("iv : "+iv);
			System.out.println("iv2 : "+iv2);
			System.out.println("piv : "+piv);//외부클래스의 부모클래스
			System.out.print("===지역변수 , 멤버변수 , 외부클래스의멤버변수  \n외부클래스의 상위클래스 멤버변수의");
			System.out.println(" 변수명이 모두 같다면 이렇게 접근해야한다===");
			
			//나의 멤버
			System.out.println("this.iv : "+this.iv); 
			//바깥클래스의 멤버  : 외부클래스명.this.멤버명
			System.out.println("Outer3.this.iv : "+Outer3.this.iv);
			//바깥클래스의 부모의 멤버 : 바깥클래스명.super.멤버
			System.out.println("Outer3.super.iv : "+Outer3.super.iv);
			
			//그냥 멤버명을 다르게하는게 속편하긴 하다.
		}
	}
}

public class InnerEx3 {
	public static void main(String[] args) {
		InstanceInner i = new Outer3().new InstanceInner();
		i.method();
		
	}

}
