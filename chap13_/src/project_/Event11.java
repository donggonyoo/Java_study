package project_;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
class Event implements Serializable {
	String title;
	String startTime;
	String lastTime;
	String details;
	Date date;

	Event(Date date,String title, String startTime,String lastTime, String details) {
		this.title = title;
		this.startTime = startTime;
		this.details = details;
		this.lastTime = lastTime;
		this.date = date;
	}
}
public class Event11 {
	private static String name;
	static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

	public static void main(String[] args) throws IOException, ClassNotFoundException, ParseException{

		Scanner scan = new Scanner(System.in);
		System.out.print("사용자 아이디를 입력하세요 : ");
		name = scan.nextLine();
		Map<String, List<Event>> events = loadEvents();
		//		List<Event> evList = new ArrayList<Event>();
		while(true) {
			System.out.print
			("메뉴번호를 입력하세요(1.종료, 2. 달력조회, 3.이벤트추가, 4.이벤트 조회, 5이벤트 변경, 6.이벤트 삭제)");
			int choice = scan.nextInt();
			scan.nextLine();
			switch(choice) {
			case 1 : saveEvents(events);System.out.println("프로그램을 종료합니다.");return;
			case 2 : printEvent(events);break;
			case 3 : addEvent(events);break;
			case 4 : viewEvent(events);break;
			case 5 : changeEvent(events);break;
			case 6 : deleteEvent(events);break;
			default:
				System.out.println("잘못된 입력입니다. 다시 선택하세요.");
			}
		}
	}
	private static void saveEvents(Map<String, List<Event>> events) throws IOException {
		ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(name+".ser"));
		writer.writeObject(events);
		writer.flush();
		writer.close();
	}

	private static void changeEvent(Map<String, List<Event>> events) {
		Scanner scan = new Scanner(System.in);
		System.out.print("수정할 이벤트의 날짜를 입력하세요 (yyyy-MM-dd): ");
		String date = scan.nextLine();
		List<Event> list = events.get(name);
		for (Event e : list) {
			if (events != null&&e.startTime.equals(date)) {
				System.out.print(" 제목을 입력하세요: ");
				e.title = scan.nextLine();
				System.out.print(" 시작 시간을 입력하세요: ");
				e.startTime = scan.nextLine();
				System.out.print(" 종료시간을 입력하세요: ");
				e.lastTime = scan.nextLine();
				System.out.print(" 상세 정보를 입력하세요: ");
				e.details = scan.nextLine();
				System.out.println("이벤트가 변경되었습니다.");
			} else {
				System.out.println("해당 날짜에 이벤트가 없습니다.");
			}

		}

	}
	private static void deleteEvent(Map<String, List<Event>> events) throws ParseException {
		Scanner scan = new Scanner(System.in);
		System.out.print("삭제할 이벤트의 날짜를 입력하세요 (yyyy-MM-dd): ");
		String date = scan.nextLine();
		Date date2 = format.parse(date);
		List<Event> list = events.get(name);
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).date.equals(date2)) {
				events.remove(name,list.get(i));
			}
		}
	}

	private static void viewEvent(Map<String, List<Event>> events) throws ParseException {
		Scanner scan = new Scanner(System.in);
		int count=0;
		System.out.print("조회할 날짜를 입력하세요 (yyyy-MM-dd): ");
		String date = scan.nextLine();
		Date date2 = format.parse(date);
		List<Event> list = events.get(name);
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).date.equals(date2)) {
				System.out.println("이벤트 제목: " + list.get(i).title);
				System.out.println("시작 시간: " + list.get(i).startTime);
				System.out.println("종료: " + list.get(i).lastTime);
				System.out.println("상세 내용: " +  list.get(i).details);
				count++;
			}
		}
		if (count==0) {
			System.out.println("해당 날짜에 이벤트가 없습니다.");
			}	
	}
	private static void addEvent(Map<String, List<Event>> events)  {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("시간을 입력하세요 : yyyy-MM-dd");
			String a = scan.nextLine();
			Date date = format.parse(a);
			System.out.print("이벤트 제목을 입력하세요: ");
			String title = scan.nextLine();
			System.out.print("이벤트 시작 시간을 입력하세요: ");
			String startTime = scan.nextLine();
			System.out.print("이벤트 종료 시간을 입력하세요: ");
			String endTime = scan.nextLine();
			System.out.print("이벤트 상세 정보를 입력하세요: ");
			String details = scan.nextLine();
			Event event = new Event(date,title, startTime,endTime, details);
			List<Event> list = events.get(name);
			if(list==null) {
				list=new ArrayList<Event>();
				}
			list.add(event);
			events.put(name, list);
			System.out.println("이벤트가 추가되었습니다.");	   
		} catch (Exception e) {
			System.out.println("형식을 맞추세요");
			System.out.println(e.getMessage());
			return;
		}



	}
	private static void printEvent(Map<String, List<Event>> events) {
		Scanner scan = new Scanner(System.in);
		System.out.print("조회할 년도를 입력하세요 : ");
		int year = scan.nextInt();
		System.out.print("조회할 월을 입력하세요: ");
		int month = scan.nextInt();
		scan.nextLine();
		Calendar ca1 = Calendar.getInstance();
		ca1.set(year, month-1,1);
		int firstweek =ca1.get(Calendar.DAY_OF_WEEK);
		int lastday = ca1.getActualMaximum(Calendar.DATE);
		System.out.println("\t"+year + "년 " + month + "월");
		System.out.printf("%3c %3c %3c%3c %3c%3c %3c",'일','월','화','수','목','금','토');
		System.out.println();
		for(int i=1,day=1;day<=lastday;i++) {

			if(i < firstweek) System.out.printf("%4s"," ");
			else System.out.printf("%4d",day++);
			if(i%7==0)System.out.println();
		}
	}
	private static Map<String, List<Event>> loadEvents()throws IOException, ClassNotFoundException {
		File file = new File(name + ".ser");
		if (file.exists()) {
			ObjectInputStream reader = new ObjectInputStream(new FileInputStream(file));
			return (Map<String, List<Event>>)reader.readObject();
		}
		else {
			return new HashMap<String,List<Event>>();
		}
	}
}









