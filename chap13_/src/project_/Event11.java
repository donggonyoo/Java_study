package project_;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import javax.swing.text.DateFormatter;
class Event implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String title;
	String startTime;
	String lastTime;
	String details;
	LocalDate date;

	Event(LocalDate date,String title, String startTime,String lastTime, String details) {
		this.title = title;
		this.startTime = startTime;
		this.details = details;
		this.lastTime = lastTime;
		this.date = date;
	}
}
//--------------------------------------------------------------------------------------------------------------------

public class Event11 {
	private static String name;
	static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

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

	//--------------------------------------------------------------------------------------------------------------------

	private static void changeEvent(Map<String, List<Event>> events) throws ParseException {//parse오류가나면 예외를던진다 잡아도됨
		Scanner scan = new Scanner(System.in);
		System.out.print("수정할 이벤트의 날짜를 입력하세요 (yyyy-MM-dd): ");
		String date = scan.nextLine();
		int count=0;
		LocalDate date2 = LocalDate.parse(date,formatter);//String->date (yyyy-MM-dd)형태로반환하자
		List<Event> list = events.get(name);
		for (Event e : list) {
			if(e.date.equals(date2)) {
				int indexOf = list.indexOf(e);
				System.out.println(e.title+" , "+indexOf+"번");
				count++;//같은날짜에 이벤트가 2개인 경우라면인덱스를 반환해서
				//사용자가 지정한 인덱스를 삭제하기위함!
			}
		}
		if(count==0)System.out.println("변경할 이벤트가 없어요");

		try {
			System.out.println("변경할 제목의 번호를 입력하세요 : (안하려면 문자를 입력하세요)");
			int index = scan.nextInt();
			list.remove(index);
			scan.nextLine();

			System.out.print(" 제목을 입력하세요: ");
			String title = scan.nextLine();
			System.out.print(" 시작 시간을 입력하세요: ");
			String startTime = scan.nextLine();
			System.out.print(" 종료시간을 입력하세요: ");
			String lastTime = scan.nextLine();
			System.out.print(" 상세 정보를 입력하세요: ");
			String details = scan.nextLine();
			System.out.println("이벤트가 변경되었습니다.");
			list.add(new Event(date2, title, startTime, lastTime, details));
			events.clear();//한번 싹 지우고
			events.put(name, list);//바꾼리스트를 넣는판단이 맞는거같다!!!
			//그렇지않다면 events맵에 변화가 전혀없을거다 list는 반환한 객체기때문에 events의 변경과 무관함
		}
		catch(InputMismatchException e) {
			scan.next();
			System.out.println("메뉴선택으로 돌아감");
			return;
		}
	}


	//--------------------------------------------------------------------------------------------------------------------

	private static void deleteEvent(Map<String, List<Event>> events) throws ParseException {
		Scanner scan = new Scanner(System.in);
		System.out.print("삭제할 이벤트의 날짜를 입력하세요 (yyyy-MM-dd): ");
		String date = scan.nextLine();
		LocalDate date2 = LocalDate.parse(date,formatter);//String->date (yyyy-MM-dd)형태로반환하자
		List<Event> list = events.get(name);
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).date.equals(date2)) {
				list.remove(i);
			}
		}
		events.clear();
		events.put(name, list);
	}
	//--------------------------------------------------------------------------------------------------------------------

	private static void viewEvent(Map<String, List<Event>> events) throws ParseException {
		Scanner scan = new Scanner(System.in);
		int count=0;
		System.out.print("조회할 날짜를 입력하세요 (yyyy-MM-dd): ");
		String date = scan.nextLine();
		LocalDate date2 = LocalDate.parse(date,formatter);//String->date (yyyy-MM-dd)형태로반환하자
		List<Event> list = events.get(name);
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).date.equals(date2)) {
				System.out.print("[ 이벤트 제목: " + list.get(i).title+", ");
				System.out.print(" 시작 시간: " + list.get(i).startTime+", ");
				System.out.print(" 종료: " + list.get(i).lastTime+", ");
				System.out.print(" 상세 내용: " +  list.get(i).details+" ]");
				System.out.println();
				count++;
			}
		}
		if (count==0) {
			System.out.println("해당 날짜에 이벤트가 없습니다.");
		}	
	}
	//--------------------------------------------------------------------------------------------------------------------
	//추가메서드
	private static void addEvent(Map<String, List<Event>> events)  {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("시간을 입력하세요 : yyyy-MM-dd");
			String a = scan.nextLine();
			LocalDate date = LocalDate.parse(a,formatter);//String->date (yyyy-MM-dd)형태로반환하자
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

	//--------------------------------------------------------------------------------------------------------------------
	//조회메서드( 달력 )
	private static void printEvent(Map<String, List<Event>> events) {
		List<Event> list = events.get(name);

		Scanner scan = new Scanner(System.in);
		System.out.print("조회할 년도를 입력하세요 : ");
		int year = scan.nextInt();
		System.out.print("조회할 월을 입력하세요: ");
		int month = scan.nextInt();
		scan.nextLine();
		Calendar ca1 = Calendar.getInstance();
		ca1.set(year, month-1,1);
		int firstweek =ca1.get(Calendar.DAY_OF_WEEK);//첫째날의 요일
		int lastday = ca1.getActualMaximum(Calendar.DATE);
		System.out.println("\t"+year + "년 " + month + "월");
		System.out.printf("%6c %6c %6c%6c %6c%6c %6c",'일','월','화','수','목','금','토');
		System.out.println();
		for(int i=1,day=1;day<=lastday;i++) {
			int count=0;
			for (Event e : list) {//date는 연,월,일 추출이너무힘들어서 LocalDate 사용함
				int monthValue = e.date.getMonthValue();
				int year2 = e.date.getYear();
				int dayofMonth = e.date.getDayOfMonth();
				if(monthValue==month && year==year2 && day==dayofMonth) {
					count++;//연 월 일이 입력과 같다면 count++; (루프가한번돌면 count는 초기화됨)
				}
			}
			if(i < firstweek) {System.out.printf("%7s"," ");}
			else {
				if(count>0) {//이벤트가있다면 글씨의간격을 줄이고 (count)를 붙여줌
					System.out.printf("%5d",day++);
					System.out.printf("(%d)",count);
				}
				else {//없다면 4개의간격으로 날짜를 출력함
					System.out.printf("%7d",day++);
					}
			}
			
			if(i%7==0)System.out.println();
		}System.out.println();
	}


	//--------------------------------------------------------------------------------------------------------------------
	//Event로드 ( 아이디를 입력하면 바로 발생되는 메서드)
	private static Map<String, List<Event>> loadEvents()throws IOException, ClassNotFoundException {
		File file = new File(name + ".ser");

		if (file.exists()) {
			ObjectInputStream reader=null;
			try {
				reader = new ObjectInputStream(new FileInputStream(file));
				return (Map<String, List<Event>>)reader.readObject();
			}finally {
				reader.close();
			}

		}
		else {
			return new HashMap<String,List<Event>>();
		}


	}
}









