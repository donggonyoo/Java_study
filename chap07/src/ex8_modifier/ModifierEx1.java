package ex8_modifier;

import ex8_modifier.test.Modifier2;

/*
 * 제한자 : 접근제한자 ㅡ 그 외 제한자(static, abstract, final)
 * 
 * 접근제한자
 *   private < (defalut) < protected < public 
 *   
 *   private : 동일한 클래스내에서만 접근 허용
 *   (default) : 같은 패키지 내에서만
 *   protected : 같은 패키지 내에서만 ( 상속관계는 다른패키지도 가능)
 *   public : all
 */
 class Modifier1{
	private int v1 = 100;
	        int v2 = 200;
	protected int v3 =300;
	public int v4 = 400;
	public void method() {
		System.out.println(getClass()+" 클래스의  method()");
		System.out.println("v1 : "+v1);
		System.out.println("v2 : "+v2);
		System.out.println("v3 : "+v3);
		System.out.println("v4 : "+v4);
	}
}
class Modifier3 extends Modifier2{
	
	void method2() {
		System.out.println("ex8_modifier.Modifier3클래스의 method2");
//		System.out.println("v1 : "+v1);  private이므로 접근X
//		System.out.println("v2 : "+v2);  default 접근불가
		System.out.println("v3 : "+v3);  //상속관계이므로 다른패키지여도 접근가능
		System.out.println("v4 : "+v4); //public
	}
	
	@Override 
	//부모의 method()가 public이기 때문에 
	//접근제어자를 맞춰주자 더 좁은범위로설정할순없다
	public void method() {
		System.out.println("v3 : "+v3);  //상속관계이므로 다른패키지여도 접근가능
		System.out.println("v4 : "+v4); //public
		}
}


public class ModifierEx1 {
	public static void main(String[] args) {
		Modifier1 m1 = new Modifier1();
		m1.method();
		System.out.println("ModifierEx1 클래스의 main 메서드에서 호출");
//		System.out.println("m1.v1 : "+m1.v1); private은 같은 클래스에서만 접근가능
		System.out.println("m1.v2 : "+m1.v2);//v2
		System.out.println("m1.v3 : "+m1.v3);
		System.out.println("m1.v4 : "+m1.v4);
		
		Modifier2 m2 = new Modifier2();
		m2.method();
//		System.out.println("m2.v1 : "+m2.v1); private
//		System.out.println("m2.v2 : "+m2.v2);  default(같은패키지만 접근가능)
//		System.out.println("m2.v3 : "+m2.v3); protected(같은패키지만접근 가능 + 상속관계는 다 접근가능)
		//The field Modifier2.v2 is not visible
		System.out.println("m2.v4 : "+m2.v4);
		
		Modifier3 m3 = new Modifier3();
		m3.method2();
		
		
		
		
	}

}
