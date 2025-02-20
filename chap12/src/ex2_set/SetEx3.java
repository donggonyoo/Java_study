package ex2_set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/*
 * TreeSet 예제 : 중복불가 , 정렬됨
 * SortedSet의 구현클래스(set의 하위클래스)
 */

public class SetEx3 {
	public static void main(String[] args) {

		SortedSet<String> set = new TreeSet<>(); /* 이것도 됨!!!! */
		//		Set<String> set = new TreeSet<>(); 
		String from = "bat";
		String to = "d";
		set.add("abc");set.add("alien");set.add("bat");
		set.add("azz");set.add("Car");set.add("disk");set.add("dance");
		set.add("dzzzz");set.add("dZZZZ");set.add("elev");set.add("fan");
		set.add("flower"); 
		System.out.println(set);
		//대문자로시작하는 C가 아스키코드가 가장 작으므로 맨앞에 배치
		System.out.println("subSet(from, to+\"zzzz\") : "+
							set.subSet(from, to+"zzzz"));
		//from 부터 to 앞까지 가져와 라는 뜻 (SortedSet의 고유메서드임 Set으로는 사용불가능)
		//부모는 자식의 기능을 사용할수없음
		System.out.println("subSet(\"abc\", \"azz\") : "+
							set.subSet("abc", "azz"));

		//내림차순 정렬
		System.out.println("==내림차순정렬==");
		set = new TreeSet<>(Comparator.reverseOrder());
		set.add("abc");set.add("alien");set.add("bat");
		set.add("azz");set.add("Car");set.add("disk");set.add("dance");
		set.add("dzzzz");set.add("dZZZZ");set.add("elev");set.add("fan");
		set.add("flower"); 
		System.out.println(set);

		//대소문자 구분없이 정렬되도록
		System.out.println("==대소문자 구분없이 정렬되도록==");
		
		
		//람다방식
//		Comparator<String> f= (s1,s2)->{
//			return s1.compareToIgnoreCase(s2);
//		};
//		
//		set = new TreeSet<String>(f);
		
		//어차피  저 자리에 들어갈 인터페이스는 Comprator밖에없기때문에 생략가능!!
		set =new TreeSet<String>((s1,s2)->s1.compareTo(s2)); 
		set.add("abc");set.add("alien");set.add("bat");
		set.add("azz");set.add("Car");set.add("disk");set.add("dance");
		set.add("dzzzz");set.add("dZZZZ");set.add("elev");set.add("fan");
		set.add("flower");
		System.out.println(set);

	}

}
