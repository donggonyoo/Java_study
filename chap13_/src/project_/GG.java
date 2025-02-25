package project_;

import java.text.ParseException;

public class GG {
	public static void main(String[] args) throws ParseException {
		Event5 event = new Event5();
		event.title = "제목";
		event.details = "ㅇㅇ";
		event.FirstDay(2025, 11, 20);
		event.LastDay(2025, 11, 22);
		System.out.println(event);
		
	
	}

}
