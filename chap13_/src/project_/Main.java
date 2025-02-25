package project_;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		HashMap<Object,Object> hashMap = new HashMap<>();
		hashMap.put(1, "안녕");
		hashMap.put(2, "하이");
		hashMap.put(3, "ㅋㅋ");
		hashMap.remove(1, "안녕");
		System.out.println(hashMap);
	}

}
