package ex3_map;

import java.util.SortedMap;
import java.util.TreeMap;

/*
 * TreeMap : key값 기준으로 정렬을하는 map
 */
public class MapEx3 {
	public static void main(String[] args) {
		TreeMap<String,Book> books = new TreeMap<>();
	
		books.put("홍길동전",new Book("홍길동전","허균",10000));
		books.put("춘향전",new Book("춘향전","미상",14000));
		books.put("구운몽",new Book("구운몽","미상",5000));
		System.out.println(books);
		
		System.out.println("TreeMap에서만 구현 가능한 조회 메서드!!!");
		System.out.println("첫번째 key : "+books.firstKey());
		System.out.println("첫번째 entry : "+books.firstEntry());
		System.out.println("마지막 key : "+books.lastKey());
		System.out.println("마지막 entry : "+books.lastEntry());
		//lowerEntry(key) : key 앞쪽 객체
		System.out.println("춘향전 앞의 entry : "+books.lowerEntry("춘향전"));
		//higherEntry(key)  : key 뒤쪽 객체
		System.out.println("춘향전 뒤의 entry : "+books.higherEntry("춘향전"));
		//floorEntry("춘") : 춘 부터 앞쪽 객체(자신도 포함)
		System.out.println("춘 앞의 entry : "+books.floorEntry("춘"));
		//floorEntry("춘") : 춘 부터 뒤쪽 객체(자신도 포함)
		System.out.println("춘 뒤의 entry : "+books.ceilingEntry("춘"));
		
	
		
	}

}
