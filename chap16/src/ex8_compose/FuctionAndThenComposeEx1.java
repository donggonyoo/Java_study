package ex8_compose;

import java.util.function.Function;

import clazz.Address;
import clazz.Member;
/*
 * Function<T,R> : R apply(T) : 매개변수 T ,리턴타입 R
 * --두개의 인터페이스 객체연결
 * andThen() : 디폴트메서드 , 순차적 연결 실행 functionA리턴값을 functionB 매개변수로전달
 * 
 * compose() :  디폴트메서드 , 매개변수부터 실행(역순) 
 * 				functionA리턴값을 functionB 매개변수로전달
 */
public class FuctionAndThenComposeEx1 {
	public static void main(String[] args) {
		Function<Member, Address> functionA;// Address apply(Member)
		Function<Address, String> functionB;// String apply(Address)
		Function<Member, String> functionAB;// String apply(Member)
		String city;
		functionA = m-> m.getAddress();//Member을 넣어 Address 반환
		functionB = m-> m.getCity();//String을 넣어 Address반환
		functionAB = functionA.andThen(functionB);
		//functionA -> functionB -> functionAB 순으로실행
		//Address functionA.apply(Member)
		//String  funcionB.apply(Address) 
		//funcionB의 반환값 String을 FunctionAB에 넣음
		city = functionAB.apply(
				new Member("홍길동", "hong", new Address("한국", "서울")) );
		System.out.println("compse--> 거주도시 : "+city);
		
		
		System.out.println();
		
		
		Address address = new Address("한국", "서울");
		functionAB = functionB.compose(functionA);
		//compose는 리턴값이 있어야하므로 Consumer(리턴값X)에는 사용X
		//functionAB <--- functionB<----- funtionA 실행
		city = functionAB.apply(
				new Member("홍길동", "hong", address) );
		System.out.println("compse--> 거주도시 : "+city);
		
		
	}

}
