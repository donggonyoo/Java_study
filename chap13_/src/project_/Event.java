package project_;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

import javax.xml.crypto.Data;

public class Event {
	Date firstDay;
	Date lastDay;
	String title;
	String details;
	SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
	
	public void FirstDay(int a, int b , int c) throws ParseException {
		String day =  a+"-"+b+"-"+c;
		Date date = f.parse(day);
		this.firstDay = date;
	}
	
	public void LastDay(int a, int b , int c) throws ParseException {
		String day =  a+"-"+b+"-"+c;
		Date date = f.parse(day);
		this.lastDay = date;
	}

	@Override
	public String toString() {
		return "Event [시작=" + f.format(firstDay) + ", 종료=" + f.format(lastDay) + ", title=" + title + ", details=" + details
				+ "]";
	}
	
	

}
