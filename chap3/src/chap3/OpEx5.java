package chap3;
/*
 * 비트연산자 : & , | , ^
 */
public class OpEx5 {
	public static void main(String[] args) {
		
		/*
		 * 6 : 0000 0110
		 * 3:  0000 0011
		 * & : 0000 0010
		 * | : 0000 0111
		 * ^ : 0000 0101   
		 */
		System.out.print("6 & 3 : ");
		System.out.println(6&3);
		System.out.print("6 | 3 : ");
		System.out.println(6|3);
		System.out.print("6 ^ 3 : ");
		System.out.println(6^3);
		
		
		/*
		 *  10 : 00001010
		 *  //보수를 취했다면 부호가 - 인거임
		 *  2의보수 : 1의보수 +1 
		 *  
		 *  ~10 : 11110101  
		 *   1의보수 ->  0000 1010
		 *  2의보수(1의보수 +1) --> 0000 1011 : -11
		 *  
		 */
		System.out.println(~10);
		
	}

}
