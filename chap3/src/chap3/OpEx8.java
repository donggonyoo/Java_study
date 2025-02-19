package chap3;

public class OpEx8 {
	/*
	 * 대입 연산자 : = , += ,-= , /= , *=
	 * a +=10 ==> a = a+10 (a에10을더한값을 a에 복사)
	 * 대입연산자의 왼쪽은 무조건변수여야함
	 */
	public static void main(String[] args) {
		int num = 100;
		System.out.println("num : "+num);
		
		num+=10;
		System.out.println("num+=10 "+num);
		
		num-=10;
		System.out.println("num-=10 "+num);
		
		num*=8;
		System.out.println("num*=8 "+num);
		
		num/=4;
		System.out.println("num/=4 "+num);
		
		num%=6;
		System.out.println("num%=6 "+num);
		
		
	}

}
