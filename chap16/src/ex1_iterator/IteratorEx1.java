package ex1_iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorEx1 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList(new String[]{"홍길동","임춘향","김삿갓","임꺽정","향단이"});
		System.out.println("외부반복자 이용");
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			//요소가있다면 출력!!
		}
		//list.stream() : Stream 객체 리턴
		System.out.println("\n 내부반복자(stream)이용");
		list.stream().forEach(s->System.out.println(s));
		//forEach는 Consumer타입임
	}

}
