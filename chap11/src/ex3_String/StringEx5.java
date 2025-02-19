package ex3_String;

/*
 * String.format() : 형식화된 문자 (서식문자)를 이용하여 문자열로 리턴
 * 					클래스메서드 --> 객체화필요X
 * 
 * 형식문자(서식문자) : %d , %f , %c , %s ...
 *    System.out.printf(); 사용법 동일 .
 */
public class StringEx5 {
	public static void main(String[] args) {
		
		String sf = String.format("%d", 12345);
		System.out.println(sf);
		
		//%d : 10진 정수 decimal
		// %,d : 세자리마다 , 표시
		System.out.println(String.format("%,d", 12345));
		
		// %,10d : 10자리를 확보 후 (3자리마다 , 표시)
		System.out.println(String.format("%,10d", 12345));
		
		// %-10d : 10자리를 확보 후 (좌측정렬)
		System.out.println(String.format("%-10d", 12345));
		
		// %-,10d : 10자리를 확보 후 (좌측정렬) 세자리마다 ,
		System.out.println(String.format("%-,10d", 12345));
		
		// %010d : 10자리를 확보 후 빈자리는 0 으로 채워
		System.out.println(String.format("%010d", 12345));
		
		//%X(대문자) ,  %x(소문자) : 16진정수 . Hexa
		System.out.println(String.format("%X,%x",255,255));
		
		//%o : 8진정수 octal
		System.out.println(String.format("%o", 12));
		
		//%b : 2진정수 binary
		System.out.println(String.format("%b,%b", false,true));
		
		//%f : 부동소수점 float
		//%.2f : 소숫점이하 2자리로출력 (반올림)
		System.out.println(String.format("%.2f", 1.446));
		
		//"%,15.2f" :  15자리를 확보 후 소수점2자리까지만표현 ,  세자리마다 , 표시
		System.out.println(String.format("%,15.2f", 12345.145));
		
		//"%-,15.2f" :  15자리를 확보 후 소수점2자리까지만표현 ,  세자리마다 , 표시 (좌측정렬)
		System.out.println(String.format("%-,15.2f", 12345.145));
		
		//"%015.2f" :  15자리를 확보 후 소수점2자리까지만표현 남은건 0 으로채우기 [, - ]표시불가
		System.out.println(String.format("%015.2f", 12345.145));
		
		
		//%s 문자열출력
		System.out.printf("%s\n","홍길동");
		//%10s : 10자리확보해 문자열출력
		System.out.printf("%10s\n","홍길동");
		//%-10s : 10자리확보해 문자열출력(좌측정렬)
		System.out.printf("%-10s\n","홍길동");
		System.out.printf("%.2s\n","홍길동");//2개문자만
		
		
		//%c : 문자출력
		System.out.printf("%c\n",'홍');
		
		//%5c : 5자리확보해 문자
		System.out.printf("%5c\n",'홍');
		
		//여러개의 자료형 출력
		System.out.printf("%s의 학점은 %c 입니다 . 점수는 %d입니다 \n","동곤유",'A',97);
		

		
		
		
	}

}
