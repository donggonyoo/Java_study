package ex8_compose;

import java.util.function.Consumer;

import clazz.Member;
/*
 * Consumer : void accept(T) , 매개변수T 리턴타입 X
 * 			 default 메서드 andThen()메서드
 * andThen() 메서드 : 순차적으로 연결해서 실행해주는 메서드
 * 
 * default 메서드 : 인터페이스의 멤버 구현부존재.(인스턴스메서드)
 * 
 */
public class ConsumerAndThenEx1 {
	public static void main(String[] args) {
		Consumer<Member> consumerA = m->{
			System.out.println("consumberA : "+m.getName());
			//입력받은 m의 getName()을 호출해라 (m은 Member인스턴스 여야만 함)
		};
		consumerA.accept(new Member("홍길동", "hkd", null));//m의 값 만들기
		
		
		Consumer<Member> consumerB = m->{
			System.out.println("consumberB : "+m.getId());
			//입력받은 m의 getId()을 호출해라 (m은 Member 인스턴스여야만 함)
		};
		consumerB.accept(new Member("홍길동", "hkd", null));//m의 값 만들기
		
		Consumer<Member> consumerC = m->{
			System.out.println("consumberC : "+m.getAddress());
			
		};
		consumerC.accept(new Member("홍길동", "hkd", null));//m의 값 만들기
		
		System.out.println("===================================");
		
		Consumer<Member> consumerAB = consumerA
				.andThen(consumerB)
				.andThen(consumerC)//andThen으로 계속 연결
				.andThen(consumerB)
				.andThen(consumerC);
		consumerAB.accept(new Member("홍길동", "hkd", null));
	}

}
