package project_;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

import javax.xml.crypto.Data;

public class Event5 {
	Date firstDay;
	Date lastDay;
	String title;
	String details;
	SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
	
	public void FirstDay(String s/*yyyy-MM-dd*/) throws ParseException {
		Date date = f.parse(s);
		this.firstDay = date;
	}
	
	public void LastDay(String s/*yyyy-MM-dd*/) throws ParseException {
		Date date = f.parse(s);
		this.lastDay = date;
	}

	@Override
	public String toString() {
		return "Event [시작=" + f.format(firstDay) + ", 종료=" + f.format(lastDay) + ", title=" + title + ", details=" + details
				+ "]";
	}
	
	

}
