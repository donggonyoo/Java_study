package javaFianal_project;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Event implements Serializable,Comparable<Event>{
	private static final long serialVersionUID = 1L;
	
	public String title;
	public LocalDateTime startTime;
	public LocalDateTime lastTime;
	public String details;
	public LocalDate date;
	
	public Event(LocalDate date,String title, LocalDateTime startTime,LocalDateTime lastTime, String details) {
		this.title = title;
		this.startTime = startTime;
		this.details = details;
		this.lastTime = lastTime;
		this.date = date;
	}

	@Override
	public int compareTo(Event o) {
		return this.startTime.compareTo(o.startTime); 
		//이벤트시작 시간순으로 정렬을 위해 Comaprable 구현후 메서드 오버라이딩
	}
	private String formatTime(LocalDateTime t) {
		return t.format(Parse.formatter2);
		//LocalDateTime은 날짜T시간 형식으로 출력이되므로
		//format 해 보기좋게바꾸자!!
	}

	@Override
	public String toString() {
		return "[제목] : "+title+"\n [시간] :" +formatTime(startTime)+"~"+formatTime(lastTime)+
				"\n[세부사항] :"+details;
	}

}
