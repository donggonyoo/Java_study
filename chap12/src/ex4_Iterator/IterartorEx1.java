package ex4_Iterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/*
 * Iterator 인터페이스 : 반복자
 * ITerator() : Collection 객체는 Iterator 객체로 변환이 가능함
 * 주요메서드
 * boolean HasNext() : 조회할요소가있는가
 * Object next();  ㅣ 조회대상 객체리턴
 * void remove(); : 조회된 객체를 제거 . next() 실행 이후에가능
 * 
 * Enumeration 인터페이스 : Iterator 이전의 반복자 Hashtable에서만 사용가능
 * 
 * 메서드
 * boolean hasNextElement() : 조회요소가 있는가
 * Object nextElement : 조회 대상 객체 리턴
 * 
 * 
 * 
 * 
 * 
 */
public class IterartorEx1 {
	public static void main(String[] args) {
		Iterator<Object> it = null;
		ArrayList<Object> list = new ArrayList<Object>();
		HashSet<Object> set = new HashSet<Object>();
		for (int i = 1; i <= 5; i++) {
			list.add(i+10);
			set.add(i*10);
		}
		System.out.println("print 이전의 list : "+list);
		System.out.println("print 이전의 set : "+set);
		
		it = list.iterator(); //Collection의 하위만 사용가능 
		print(it);
		it = set.iterator();
		print(it);
		System.out.println("print 이후의 list : "+list);
		System.out.println("print 이후의 set : "+set);
		
	}
	private static void print(Iterator<Object> e ) {
		while(e.hasNext()) {
			//다음 조회 할 대상이 있니?
			System.out.print(e.next()+",");
			//조회대상 객체반환 
			e.remove();
			//조회된 객체 삭제
		}System.out.println();
		
	}

}
