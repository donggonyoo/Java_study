package chap3;

/*
 * int 형보다 작은 자료형(byte , short, char)의 연산의 결과는 int형
 * 연산의결과는 더 큰 자료형을 따름.
 * int = int+ byte , int=int+ short
 * 
 */
public class OpEx9 {
	public static void main(String[] args) {
		int x=10,y=20;
		int a;
		long b;
		float c ;
		
		a = x+y;
		System.out.println("a : "+a);
		
		b = x+y;
		System.out.println("b : "+b+"\n");
		a=(int) (a+b);//long = int + long
		
		byte b1=10,b2=20,b3;
		b3 = (byte) (b1+b2); //int = byte + byte
		
		char c1='A';
		c1+=1;//의미적으로는 밑에 수식과같지만 시스템측면에서 아주살짝다름
		System.out.println("c1 : "+c1);
		c1 = (char) (c1+1); //int = char + int;
		System.out.println("c1 : "+c1+"\n");
		
		char c2='B';
		System.out.println("c2 : "+c2);
		System.out.println("c2의 소문자 : "+(char)(c2+32));
		
		
	
		
		
	}

}
