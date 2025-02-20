package ex3_map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/*
 * Map인터페이스 : (key,객체) 쌍인 객체들의 모임
 * put(key,value) : map에 데이터 추가
 * get(key)   :  value값을 리턴
 * Set keySet() : map객체중 key 목록 조회
 * Set values() : map 객체중 values 목록조회
 * Set<Map,Entry> entrySet() : (키,값)쌍 목록 조회
 * 			Map.Entry 객체 : 키,객체(value) 쌍인 객체1개
 * 					key : getKey()  
 * 					value : getValue()
 * value remove(key) : key 에 해당하는 객체 제거  후 value값 리턴
 * 					존재하지않는 key 객체라면 null 반환
 * 
 */
public class MapEx1 {
	public static void main(String[] args) {
		String [] names = {"홍길동","김삿갓","이몽룡","임꺽정","김삿갓"};
		int []nums= {1234,4567,2350,9850,3456};
		HashMap<String,Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < nums.length; i++) {
			System.out.println(names[i]+"_"+nums[i]);
			map.put(names[i], nums[i]);
		}
		System.out.println("== 최종 Map 구조 ==");
		System.out.println(map);
		System.out.println("홍길동의 값  : "+map.get("홍길동"));
		System.out.println("map의 크기 : "+map.size());
		//key 값만 조회
		//keySet() : key값들만 조회 , key들을 Set객체로리턴
		Set<String> keySet = map.keySet();
		System.out.print("key : ");
		for (String s : keySet) {
			System.out.print(s+", ");
		}System.out.println();
		
		System.out.println("------------------------");
		
		//값들만 조회
		Collection<Integer> values = map.values();
		System.out.printf("value : ");
		for (Integer i : values) {
			System.out.print(i+",");
		}System.out.println();
		
		
		System.out.println("--------------------------");
	
		System.out.println("entryset() : (key,객체)쌍인 객체조회");
		Set<Entry<String,Integer>> entrySet = map.entrySet();
		for (Entry<String, Integer> entry :entrySet) {
			if(entry.getValue()==2350) {
				System.out.print("2350의 key값 : ");
				System.out.println(entry.getKey());
			}
			System.out.println(entry);
			/* System.out.println("("+entry.getKey()+"="+entry.getValue()+")"); */
		}
		
		System.out.println("제거 전 : "+map);
		Integer tel = map.remove("홍길동");
		Integer remove = map.remove("하하");//존재하지않는 key값 입력시 null반환
		System.out.println("제거된 홍길동의 전화번호 "+tel);
		System.out.println("제거 후 map객체의 요소 갯수 : "+map.size());
		System.out.println("제거 후 : "+map);
		
	}

}
