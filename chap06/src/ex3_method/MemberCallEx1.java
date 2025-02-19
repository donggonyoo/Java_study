package ex3_method;

public class MemberCallEx1 {
	static int cv1 = 10;
	static int cv2 = cv1; //클래스멤버간 호출
	
	int iv1 = 100;
	int iv2 = iv1;
	int iv3 = cv1; //인스턴스멤버에서 클래스멤버 값 호출한것.(가능)
	
	static int cv3 = new MemberCallEx1().iv1;
	void method1() {
		System.out.println("method1(instanceMember)");
		System.out.println("cv1 +cv2 : "+(cv1+cv2));//클래스멤버
		System.out.println("iv1 +iv2 : "+(iv1+iv2));//클래스멤버
	}
	
	static void method2() {
		System.out.println("method2(classMember)");
		MemberCallEx1 a = new MemberCallEx1();//객체화
		System.out.println("cv1 +cv2 : "+(cv1+cv2));//클래스멤버간 호출
		System.out.println("iv1 +iv2 : "+(a.iv1+a.iv2));
//		System.out.println("iv1 +iv2 : "+(iv1+iv2)); 객체화가 되어야 호출가능
	}
	
	void method3() { 
		System.out.println("@@method3(InstanceMember@@)");
		method1();method2();
	}
	
	static void method4() {
		System.out.println("@@method4(ClassMemeber@@)");
		new MemberCallEx1().method1(); //객체화
		method2();
	}
	
	public static void main(String[] args) {
		MemberCallEx1 m = new MemberCallEx1();
		m.method1();
		/* MemberCallEx1. */method2(); 
		//main함수와 같은 멤버(static)이므로 생략가능
		
		m.method3();
		MemberCallEx1.method4();
	}

	

}
