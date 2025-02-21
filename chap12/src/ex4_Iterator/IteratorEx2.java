package ex4_Iterator;

import java.util.Hashtable;
import java.util.Iterator;

public class IteratorEx2 {
	public static void main(String[] args) {
		Hashtable<Object, Object> students = new Hashtable<>();
	
		students.put(101, "Alice");
		students.put(102, "bob");
		students.put(103, "Charlie");
		students.put(104, "David");
		Iterator<Object> it = students.keySet().iterator();
		//map의 key 는 Set자료형이므로 iterator사용가능
		print(it);
		System.out.println("pirnt. 이후의 students 객체 : "+students);
		
		Hashtable<Object, Object> students2 = new Hashtable<>();
		students2.put(101, "Alice");
		students2.put(102, "bob");
		students2.put(103, "Charlie");
		students2.put(104, "David");
		Iterator<Object> it2 = students2.values().iterator();
		//map의 value도 Collection타입이므로 iterator사용가능
		print(it2);
		System.out.println("pirnt. 이후의 students 객체 : "+students2);
		
	
	}

	private static void print(Iterator<Object> it) {
	while(it.hasNext()) {
		System.out.print(it.next()+",");
		it.remove();
	}System.out.println();

		
	}

}
