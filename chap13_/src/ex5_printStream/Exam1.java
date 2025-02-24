package ex5_printStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

//예외발생한내용을 error.log파일에 PrintStream이용해출력
//2025-02-24 HH:mm:ss --> FOr input string : "a"

public class Exam1 {
	public static void main(String[] args) throws FileNotFoundException {
		PrintStream ps = new PrintStream(new FileOutputStream("error.log",true));
		try {
			String str = "a";
			System.out.println(Integer.parseInt(str));
			
		}
		catch(Exception e) {
			LocalDateTime data = LocalDateTime.now();
			DateTimeFormatter f =DateTimeFormatter.ofPattern("yyyy-MM-dd  HH:mm:ss");
//			SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
//			ps.println(sf.format(new Date()+" => "+e.getMessage()));
			ps.print(f.format(data));
			ps.print("--->");
			ps.println(e.getMessage());
			System.out.println(e.getMessage());//이내용을 error.log에출력
			e.printStackTrace(ps);
			//ps에 에러메시지를 보냄!!!(콘솔창에나타나지않고
			//error.log파일에 들어감
			
		}
		finally {
			ps.close();
		}
	}

}
