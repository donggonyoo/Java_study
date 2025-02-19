package chap3;

public class OpEx2 {
	/*
	 * @부호연산자 : +,-
	 *  	+ : 현재부호의 유지
	 *  	- : 현재부호를 변경 , 음수 => 양수 , 양수=>음수
	 *  
	 *  @논리부정 : !(not) 
	 *  	true->false 
	 */
	public static void main(String[] args) {
		int x = -10;
		System.out.println("x : "+ +x);
		System.out.println("x : "+ -x);
		
		x=10;
		System.out.println("x : "+ +x);
		System.out.println("x : "+ -x);
		
		//논리부정
		System.out.println("true : "+(!false));
		System.out.println("false : "+(!true));
		System.out.println("5 != 4 : "+(5!=4));//둘이다르냐?
		System.out.println("5 == 4 : "+ !(5==4));
		//!(둘이 같냐) => 둘이 다르냐?
	}

}
