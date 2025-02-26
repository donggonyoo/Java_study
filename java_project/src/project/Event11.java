package project;



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
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.InputMismatchException;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

class Event implements Serializable,Comparable<Event>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String title;
	LocalDateTime startTime;
	LocalDateTime lastTime;
	String details;
	LocalDate date;

	Event(LocalDate date,String title, LocalDateTime startTime,LocalDateTime lastTime, String details) {
		this.title = title;
		this.startTime = startTime;
		this.details = details;
		this.lastTime = lastTime;
		this.date = date;
	}

	@Override
	public int compareTo(Event o) {
		return this.startTime.compareTo(o.startTime);
	}

	@Override
	public String toString() {
		return "[제목] : "+title+"\n [시간] :" +startTime+"~"+lastTime+
				"\n[세부사항] :"+details;
	}
}

//--------------------------------------------------------------------------------------------------------------------

public class Event11 {
	private static String name;
	static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	static DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
	//시간을 입력받을때 초는 생략하기위한포맷형식( String->LocalDateTime)
	
	
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
				System.out.println(indexOf+"번"+e);
				count++;//같은날짜에 이벤트가 2개인 경우라면인덱스를 반환해서
				//사용자가 지정한 인덱스를 삭제하기위함!
			}
		}
		if(count==0) {System.out.println("변경할 이벤트가 없어요");return;}

		try {
			System.out.println("변경할 제목의 번호를 입력하세요 : (안하려면 문자를 입력하세요)");
			int index = scan.nextInt();
			list.remove(index);
			scan.nextLine();

			System.out.print(" 제목을 입력하세요: ");
			String title = scan.nextLine();
			System.out.print(" 시작 시간을 입력하세요:(HH-mm-ss) ");
			String startTime = scan.nextLine();
			LocalDateTime start = LocalDateTime.parse(date2+" "+startTime,formatter2);
			System.out.print(" 종료시간을 입력하세요:(HH-mm-ss) ");
			String lastTime = scan.nextLine();
			LocalDateTime last = LocalDateTime.parse(date2+" "+lastTime,formatter2);
			System.out.print(" 상세 정보를 입력하세요: ");
			String details = scan.nextLine();
			System.out.println("이벤트를 변경 하실건가요??(y)");
			String y = scan.nextLine();
			if(y.equalsIgnoreCase("y")) {
				System.out.println("변경완료");
				list.add(new Event(date2, title, start, last, details));}
			else {
				System.out.println("변경취소");}
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
		int count=0;
		List<Event> list = events.get(name);
		Collections.sort(list);
		for (Event e : list) {
			if(e.date.equals(date2)) {
				int indexOf = list.indexOf(e);
				count++;
				System.out.println(indexOf+"번"+e);
			}
		}
		if(count==0) {
			System.out.println("삭제할게없어요");
			return;
		}
		System.out.println("삭제할 이벤트의 번호를 입력해주세요(안하려면 문자입력)");
		try {
			int num = scan.nextInt();
			list.remove(num);
			System.out.println(num+"번 삭제완료");
			events.clear();
			events.put(name, list);

		}catch(InputMismatchException e) {
			System.out.println("삭제하지않겠습니다");
			scan.next();
			return;
		}


	}
	//--------------------------------------------------------------------------------------------------------------------

	private static void viewEvent(Map<String, List<Event>> events) throws ParseException {
		Scanner scan = new Scanner(System.in);
		int count=0;
		System.out.print("조회할 날짜를 입력하세요 (yyyy-MM-dd): ");
		String date = scan.nextLine();
		LocalDate date2 = LocalDate.parse(date,formatter);//String->date (yyyy-MM-dd)형태로반환하자
		List<Event> list = events.get(name);
		if(list==null) {
			System.out.println("이벤트가 아무것도없습니다");
			return;
		}
		Collections.sort(list);
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).date.equals(date2)) {
				System.out.println(list.get(i));//toString으로 출력을 정해놨음
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
			System.out.print("이벤트 시작 시간을 입력하세요:(HH-mm) ");
			String startTime = scan.nextLine();
			LocalDateTime start = LocalDateTime.parse(date+" "+startTime,formatter2);
			System.out.print("이벤트 종료 시간을 입력하세요:(HH-mm) ");
			String endTime = scan.nextLine();
			LocalDateTime last = LocalDateTime.parse(date+" "+endTime,formatter2);
			System.out.print("이벤트 상세 정보를 입력하세요: ");
			String details = scan.nextLine();
			Event event = new Event(date,title, start,last, details);
			List<Event> list = events.get(name);
			if(list==null) {
				list=new ArrayList<Event>();
			}
			list.add(event);
			events.put(name, list);
			System.out.println("이벤트가 추가되었습니다.");	   
		} catch (InputMismatchException e) { 
			System.out.println("형식을 맞추세요");
			System.out.println(e.getMessage());
			return;
		}
		catch(DateTimeParseException e) {
			System.out.println("올바른날짜형식이 아니에요");
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
		LocalDate of = LocalDate.of(year, month, 1);
		DayOfWeek dayOfWeek = of.getDayOfWeek();
		int firstweek = (dayOfWeek.getValue()%7)+1;
		//첫번쨰날의 요일   7123456 -> %7 -> 0123456(일:0 토:6) +1 -> 
		//일월화수목금토 : 1234567 로 바뀌게됨 
		
		/*
		 * Calendar ca1 = Calendar.getInstance(); ca1.set(year, month-1,1); int
		 * firstweek =ca1.get(Calendar.DAY_OF_WEEK);//첫째날의 요일 int lastday =
		 * Calendar의요일은 1234567(일월화수목금토) 로 이루어져있다.
		 * ca1.getActualMaximum(Calendar.DATE);
		 */
		int lastday = of.with(TemporalAdjusters.lastDayOfMonth()).getDayOfMonth();//이번달의 마지막요일
		System.out.println("\t"+year + "년 " + month + "월");
		System.out.printf("%-3c %-3c %-3c%-2c %-3c %-2c %-3c",'일','월','화','수','목','금','토');
		System.out.println();
		for(int i=1,day=1;day<=lastday;i++) {
			int count=0;
			for (Event e : list) {//date는 연,월,일 추출이너무힘들어서 LocalDate 사용함
				int monthValue = e.date.getMonthValue();//리스트의요소에서 달을 출력
				int year2 = e.date.getYear();//리스트의요소에서 연을 출력
				int dayofMonth = e.date.getDayOfMonth();//리스트의요소에서 일을 출력
				if(monthValue==month && year==year2 && day==dayofMonth) {
					count++;
					//연,월,일이 입력한날짜과 같다면 count++; (루프가한번돌면 count는 초기화됨)
				}
			}
			if(i < (firstweek)) {
				System.out.printf("%-4s"," ");
				}// i가 첫째날의 요일(0:일 6:토)이 될떄까지 간격을띄워줌
			else {
				if(count>0) {//이벤트가있다면 글씨의간격을 줄이고 (count)를 붙여줌
					System.out.printf("%-2d(%d)",day++,count);

				}
				else {//없다면 4개의간격으로 날짜를 출력함
					System.out.printf("%-4d",day++);
				}
			}
			if(i%7==0)System.out.println();
		}System.out.println();
	}


//-------------------------------Event 로드 ( 아이디를 입력하면 바로 발생되는 메서드)-------------------------------------------------------------------------------------
	
	private static Map<String, List<Event>> loadEvents()throws IOException, ClassNotFoundException {
		File file = new File(name + ".ser");//입력받은 name이름과같은 ser파일을 불러옴

		if (file.exists()) {
			ObjectInputStream reader=null;
			try {
				reader = new ObjectInputStream(new FileInputStream(file));
				return (Map<String, List<Event>>)reader.readObject();
				//ser파일을 읽어서 Map<String,List<Event>>타입으로 반환해준다/
			}finally {
				reader.close();//항상 reader를 닫아줘야함(끝없이로딩되는거 방지)
			}
		}
		else {
			//파일이 없다면 HashMap<String,List<Event>>을 만들어줘서반환
			return new HashMap<String,List<Event>>();
		}
	}
}
