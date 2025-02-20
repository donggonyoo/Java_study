package ex3_map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
 * 1. 대한민국 : 서울 , 캐나다 : 오타와 , 영국 : 런던 저장하는 map 객체
 * 2. 나라이름을 입력받아 수도를 출력해보자 등록된나라가 아니면 수도가 등록되지않았습니다 메시지출력
 * 		종료가 입력될때 까지 계속 입력받아
 * 3.프로그램종료 전에 등록된내용조회
 * 	등록된 나라를 조회
 * 	등록된 수도를 조회
 * 	등록된 나라:수도 조회
 * 
 * 4.등록된 나라가 아닌경우 수도를 입력받아 map객체에 추가해보자
 */
public class Exam1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String [] world = {"대한민국","캐나다","영국","일본"};
		String [] soodo = {"서울","오타와","런던","도쿄"};
		HashMap<String, String> map = new HashMap<>();
		//키값 value값 넣기
		for (int i = 0; i < soodo.length; i++) {
			map.put(world[i], soodo[i]);
		}

		while(true) {
			System.out.print("나라 입력 : ");
			String a = scan.next();
			String s = map.get(a);
			if(a.equals("종료")) {
				keySearch(map);
				valueSearch(map);
				EntrySearch(map);
				break;
			}

			if(s != null) {
				System.out.println(a+"의 수도는 "+s);
			}

			else {
				System.out.println("수도가 등록되지 않았어요");
				System.out.println("수도를 등록할까요? (Y)");
				String y = scan.next();
				if(y.equalsIgnoreCase("Y")){
					String sudo = scan.next();
					map.put(a,sudo);
					System.out.println("등록완료");
				}
				else continue;
				
			}

		}
	}
	
	private static void keySearch(Map map) {
		Set keySet = map.keySet();
		System.out.print("--등록 나라 : ");
		for (Object o : keySet) {
			System.out.print(o+",");
		}System.out.println();
	}
	private static void valueSearch(Map map) {
		Collection values = map.values();
		System.out.print("--등록 수도 : ");
		for (Object o : values) {
			System.out.print(o+",");
		}System.out.println();
	}
	private static void EntrySearch(Map map) {
		System.out.println("--등록 된 쌍 : --");
		Set entrySet = map.entrySet();
		for (Object o : entrySet) {
			System.out.println(o);
		}
	}
}

