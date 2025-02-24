package ex7_other;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;

/*
 * File 클래스의 주요메서드
 * 1.getAbsolutePath() : 절대경로(전체경로)
 * 2.mkdir() : 하위폴더 1개 생성 ,폴더생성:true 리턴 실패 else
 * 3.mkdirs() : 여러개의 하위 폴더
 * 4 createNewFile() : 파일생성, 파일생성 성공:ture 리턴
 * 5.getName() : 파일의 이름
 * 6.length() : 파일의크기 (바이트)
 * 7.exists() : 존재여부판단 , 존재하면 true리턴 , 없는파일이면 false
 * 8.f2.renameTo(f3) : f2의 이름을 f3로 변경해라
 * 9.lastModified 
 * 
 * 
 */
public class FileEx2 {
	public static void main(String[] args) throws IOException {
		File f1 = new File("c:/temp1");
		System.out.printf("%s 폴더 생성 :%b\n",f1.getAbsolutePath(),f1.mkdir());
		File f2 = new File("c:/temp1/test.txt");
		System.out.printf("%s 파일생성:%b\n",f2.getAbsolutePath(),f2.createNewFile());
		System.out.printf("파일이름 : %s,파일크기 : %d\n",f2.getName(),f2.length());
		//폴더생성과 파일생성 까지만 가능 (내용 관련은 스트림이용)
		
		
		File f3 = new File("c:/temp1/test2.txt");
		if(f3.exists()) {
			System.out.println(f3.getName()+"파일 존재");
		}
		else {
			System.out.println(f3.getAbsolutePath()+"파일 존재하지않음");
		}
		System.out.printf("%s-->%s 이름변경 :%b\n",f2.getName(),f3.getName(),f2.renameTo(f3));
		//lastMoidfied() : 1970년이후부터 파일수정시간까지 밀리초로리턴
		System.out.println("파일의 최종수정시간 : "+f3.lastModified());
		//파일의최종수정시간 : 년월일 시분초로출력해보자
		String last = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(f3.lastModified()));
			//new Data(lastMoidfied): lastMoidfied에 해당하는 일 시로 만들어줌
		System.out.println("파일의 최종수정시간 : "+last);
		
		//LocalDateTime을 이용한방법
		LocalDateTime ldt = Instant.ofEpochMilli(f3.lastModified()).atZone(ZoneId.systemDefault())
		.toLocalDateTime();
		DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		System.out.println("파일의 최종수정시간(LocalDatetime) : "+ldt.format(pattern));
		
		System.out.printf("%s 파일삭제 : %b\n ",f3.getName(),f3.delete());
		
	}

}
