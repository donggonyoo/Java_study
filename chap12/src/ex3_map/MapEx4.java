package ex3_map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/*
 * Map 구현 클래스
 * HashMap : (key , value) 쌓인 객체의 모임 . 순서를 모름
 * TreeMap : (key , value) 쌓인 객체의 모임 . 키값으로정렬순서
 * HashTable : (key , value) 쌓인 객체의 모임 , 순서를 모름 , **구버전(List의 Vector같은존재)**
 * 				동기화 : 스레드에 대해서 safe
 */
public class MapEx4 {
	public static void main(String[] args){
		
		Hashtable<String, String> map = new Hashtable<>();
		map.put("학생", "student");
		map.put("선생", "teacher");
//		map.put(null, "null"); /* hashtable객체에서는 null을 key로사용할수없음 */
		System.out.println(map);
		
		
		Map<String, String> map2 = new HashMap<>();
		map2.put("학생", "student");
		map2.put("선생", "teacher");
		map2.put(null, "null"); //hashmap객체에서는 null을 key로 사용가능
		System.out.println(map2);
		
		
		
	
		
	}

}
