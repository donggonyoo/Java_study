package ex5_Math;

/*
 * Math클래스
 * 
 * 생성자의 접근제한자 prviate(객체생성불가능
 * 모든멤버가 static인 클래스
 * - 두개의상수
 * Math.PI :  원주율
 * Math.E : 자연로그
 */
public class MathEx1 {
	public static void main(String[] args) {
		//abs() 절대값
		System.out.println(Math.abs(5));
		System.out.println(Math.abs(-5));
		System.out.println(Math.abs(3.14));
		System.out.println(Math.abs(-3.14));
		
		//근사정수 : ceil(큰) , floor(작은) , rint
		
		//ceil : 큰 근사정수
		System.out.println(Math.ceil(5.4));//6.0
		System.out.println(Math.ceil(-5.4));
		
		// floor : 작은 근사정수
		System.out.println(Math.floor(5.4));
		System.out.println(Math.floor(-5.4));
		
		//rint : 근사정수
		System.out.println(Math.rint(5.4));
		System.out.println(Math.rint(-5.4));
		
		//최대최소
		System.out.println(Math.max(4, 3));
		System.out.println(Math.max(2, 17));
		System.out.println(Math.min(8, 12));
		System.out.println(Math.min(4.5, 3.21));
		
		//반올림
		System.out.println(Math.round(5.4));
		System.out.println(Math.round(5.5));
		
		//난수 : random 
		System.out.println(Math.random()); //0 <= x < 1
		
		//삼각함수 : 각도단위는 Radians
		System.out.println(Math.toDegrees(Math.PI/2));//Math.PI ==180도
		//sin(90도)
		System.out.println(Math.sin(Math.PI/2));
		
		//cos(60도)
		System.out.println(Math.cos(Math.toRadians(60)));
		
		//tan(45도)
		System.out.println(Math.tan(Math.PI/4));
		
		//log함수
		System.out.println(Math.log(Math.E));//logee ==1
		
		//제곱근
		System.out.println(Math.sqrt(9));
		
		//제곱
		System.out.println(Math.pow(10, 3));
	}
}
