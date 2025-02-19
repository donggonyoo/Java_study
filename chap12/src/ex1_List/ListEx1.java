package ex1_List;

import java.util.ArrayList;

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
		System.out.println(list);
	}
}
