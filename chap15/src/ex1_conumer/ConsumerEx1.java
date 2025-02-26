package ex1_conumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.ObjDoubleConsumer;

/*
 * java ApI에서 제공되는 인터페이스
 *  - java.util.function 패키지에 속한 인터페이스
 *  - 랃다를 이용하기위한 인터페이스 ( 함수적인터페이스)
 *  
 *  Consumer 인터페이스
 *    void accept (매개변수) : 매개변수가있고 리턴값은 없는 메서드
 *    
 *    Consumer<T> : void accept(T)
 *    BioConsumer<T,U> : void accept(T,U)
 *    IntConsumer : void accept(int)
 *    doubleConsumer : void accept(double)
 *    longConsumer : void accept(long)
 *    ObjIntConsumer : void accept(T,int)
 *    ObjLongConsumer : void accept(T,long)
 *    ObjDoubleConsumer : void accept(T,double)
 *    
 *    이들 모두 리턴값은 없음
 *    
 */
public class ConsumerEx1 {
	public static void main(String[] args) {
							//여기서t는 제네릭을 따라가므로 String
		Consumer<String> c1 = t->System.out.println(t+8);
		c1.accept("Java");//t값을 정해준거임
		
		Consumer<Integer> c1_1 = t->System.out.println(t*10);
		c1_1.accept(10);//10*10
		
		//제네릭을 두개를 가진다.
		BiConsumer<String, String> c2 = (t,c)->System.out.println(t+c);
		c2.accept("Java", "8.0");//둘이 합침
		c2=(t,c)->System.out.println(t.substring(0,1)+c.substring(0,1));
		c2.accept("Java", "8.0");//각 첫번째문자만 출력
		
		IntConsumer c3 = t->System.out.println(t*100);
		c3.accept(10);//10*100
		
		c3=t->{//블럭문이 한줄 이상일경우 {...}; 이용
			int sum = 0;
			for (int i = 1; i <= t; i++) {
				sum+=i;
			}
			System.out.println("1에서"+t+"까지의 합 : "+sum);
		};
		c3.accept(100);//100까지의합
		c3.accept(10);
		
		ObjDoubleConsumer<Integer> c4 = (t,u)->{
			System.out.println(t*u);
		};
		c4.accept(10, 3.24);
	}
}
