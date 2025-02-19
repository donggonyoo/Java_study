package ex1_List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*
 * Collection 인터페이스 : 객체를 여러개저장할 수 있는 객체]
 * 
 * 
 * List : Collection 인터페이스의 하위 
 * 			객체들 저장할 때 저장된 순서를 유지 -> 인덱스 사용 가능
 * 
 * 		구현클래스 : ArrayList , Vector , LinkedList..
 * 			Vector : Collection프레임워크 이전의 클래스/
 * 					Collection프레임워크에서 제공되는 함수ㅘ 기존에사용했던함수 혼합			
 * 
 * 
 * Set : Collection 인터페이스의 하위 
 * 			객체 중복저장 불가능
 * 		구현클래스 : HashSet , TreeSet , LinkedHashSet
 * 
 * 
 * 
 * 
 */
public class ListEx1 {
	public static void main(String[] args) {
		/*
		 * <Integer> : 제네릭.(String객체 등은 들어올 수없음)
		 * (자료형이 틀릴 시 오류발생)
		 */
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);list.add(2);;list.add(5);
		list.add(4);list.add(3);;list.add(0);
		list.add(3);
//		list.add("4");
		System.out.println(list);
		
		//인덱스로 값 찾기
		for (int i = 0; i < list.size(); i++) {
			System.out.println
			(i+" : "+list.get(i));
		}
		
		//정렬하기
		//Collection : 인터페이스
		//Collections : 클래스( Collection 객체의  기능 보조)
		Collections.sort(list);
		System.out.println("sort "+list);
		
		Collections.sort(list,Collections.reverseOrder());//내림차순
		System.out.println("reverseOrder : "+list);
		
		Collections.shuffle(list);//섞기
		System.out.println("Shuffle : "+list);
		
		//인덱스 범위지정해 객체조회
		System.out.println("1번 인덱스부터 3번 인덱스의 객체조회 : "+
							list.subList(1,4));
		
		//1~3번인덱스로 리스트생성 ( but 둘은 같은곳을 참조하지만)
		//list2는 1~3번인덱스만을 참조함
		//list2에 추가하면 list에도 영향이있는것!!
		List<Integer> list2 = list.subList(1, 4);
		System.out.println(list2);
		list2.add(100);
		System.out.println("list :"+list);
		System.out.println("list2 : "+list2);
		
		System.out.println("==새로운 객체를 만들어서 반환==");
		list2 = new ArrayList<>(list.subList(1, 4));
		list2.add(222);
		System.out.println("list : "+list);
		System.out.println("list2 : "+list2);
		
		
		
		
		
	}
}
