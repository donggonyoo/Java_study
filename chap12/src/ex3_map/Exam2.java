package ex3_map;

import java.lang.reflect.Field;
import java.util.Comparator;
import java.util.TreeMap;

public class Exam2 {
	public static void main(String[] args) {
		TreeMap<Integer,String> scores = new TreeMap<>();
		mapPut(scores);
		System.out.println(scores);
		System.out.println("첫번쨰key : "+scores.firstKey());
		System.out.println("마지막 key : "+scores.lastKey());
//		System.out.println("가장 높은 점수를 받은 사람의 이름 : "
//							+scores.get(scores.lastKey()));
		System.out.println("가장 높은 점수를 받은 사람의 이름 : "
							+scores.lastEntry().getValue());
		System.out.println("94점보다 앞의 점수 : "+scores.lowerKey(94));
		System.out.println("94점보다 뒤의 점수 : "+scores.higherKey(94));
		System.out.println("94를 포함한 앞의 점수 : "+scores.floorKey(94));
		System.out.println("94를 포함한 뒤의 점수 : "+scores.ceilingKey(94));
		
		System.out.println("======revverse!!(내림차순)========");
		scores = new TreeMap<>(Comparator.reverseOrder());
		mapPut(scores);
		System.out.println(scores);
		System.out.println("가장낮은 점수받은 사람의 이름 : "+scores.lastEntry().getValue());
		System.out.println("94보다 큰  점수 : "+scores.lowerKey(94));
	}
	
	private static void mapPut(TreeMap<Integer,String> scores) {
		scores.put(87, "홍길동");
		scores.put(98, "이몽룡");
		scores.put(75, "임꺽정");
		scores.put(94, "조사병단");
		scores.put(82, "유재석");
		scores.put(88, "하하");
	}

}
