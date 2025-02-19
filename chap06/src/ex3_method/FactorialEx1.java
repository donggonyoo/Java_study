package ex3_method;

/*
 * 재귀함수 : Recurcive call
 * 			자신의함수를 호출하는 함수
 */
public class FactorialEx1 {
	public static void main(String[] args) {
		System.out.println("4! : "+factorial(4));
		//4! == 4 * 3 * 2 * 1
		
	}
	private static int factorial(int i) {
		return (i==1)?1:i*factorial(i-1);
		//4*fact(3)  ==> return 24
		//fact(3) == 3*fact(2)  ==> return 6
		//fact(2)== 2 * fact(1)  ==>return  2
		//fact(1) ==>  return 1 
	}

}
