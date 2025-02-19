package ex1_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Data implements Comparable<Data>{
	int value;
	Data(int value){
		this.value = value;
	}
	public String toString() {
		return value+"";
	}
	int getValue(){
		return value;
	}
	
	@Override
	//comareTo 메서드 구현하지않는다면 비교할수없어!!
	public int compareTo(Data o) {
//		return this.value < o.value?-1:(this.value==o.value)?0:1;
		return value - o.value;
		// 1 - 3 == -2 (음수)이므로 앞에있는거다
	}
	
}

class Data2{
	int value;
	Data2(int value){
		this.value = value;
	}
	public String toString() {
		return value+"";
	}
}
/*
 * List 정렬하기
 * -- Collections.sort(List<Comparable>)
 *  - List객체를 정렬하기 위해서는 요소 객체가 Comparable 인터페이스의 구현객체여야함
 *  
 *  
 *  정렬관련 인터페이스
 *  
 *  Comparable<T> 인터페이스는 Functional 인터페이스임
 *  			클래스로 구현해서 , 해당클래스의 기본정렬 방식 설정위해
 *    int compareTo(T t)
 *    결과 : 음수 : 현재객체 앞
 *    		양수 : 현재객체 뒤
 *    
 *  Comparator<T> 인터페이스는 Functional 인터페이스임
 *  			정렬 실행 시 동적으로 정렬방식을 설정할 떄 사용
 *    int compare(T t1,T t2)
 *    결과 : 음수 : 현재객체 t1이 앞
 *    		양수 : 현재객체 t1 뒤
 *    
 */
public class ListEx3 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("a");list.add("c");
		list.add("d");list.add("b");
		list.add("f");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		System.out.println("Comparator.reverseOrder()");
		Collections.sort(list,Comparator.reverseOrder());
		System.out.println(list);
		
		System.out.println("== list2 ==");
		List<Data> list2 = new ArrayList<>();
		list2.add(new Data(1));list2.add(new Data(3));
		list2.add(new Data(5));list2.add(new Data(2));
		list2.add(new Data(4));
		
		System.out.println(list2);
		
		Collections.sort(list2);
		System.out.println(list2);
		
		//내림차순
		Collections.sort(list2,Comparator.reverseOrder());
		System.out.println(list2);
		
		System.out.println("== list3 ==");
		List<Data2> list3 = new ArrayList<>();
		list3.add(new Data2(1));list3.add(new Data2(3));
		list3.add(new Data2(5));list3.add(new Data2(2));
		list3.add(new Data2(4));
		System.out.println(list3);
		System.out.println("==Comarator(비교자)를 이용한 정렬==");
//		Collections.sort(list3,new Comparator<Data2>() {
//
//			@Override
//			public int compare(Data2 o1, Data2 o2) {
//				return o1.value-o2.value;
//				//앞 - 뒤 = 음수 ( 앞이 더 작다)
//			}
//			
//		});
		//람다방식
		Collections.sort(list3,(d1,d2)->d1.value-d2.value);
		System.out.println(list3);
		
		
		//직관적인 람다방식
		Comparator<Data2> f = (d1,d2)->d1.value - d2.value;
		Collections.sort(list3,f);
		
		System.out.println(list3);
	
		
		
		
	}

}
