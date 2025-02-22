package ex3_file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

/*
 * 화면에서 exit 값을 입력할때 까지 내용을 입력받아 data.txt 파일에 저장하기
 * [결과]
 * data.txt 파일에 저장할 내용을 입력하세요(종료:exit)
 * aaaa
 * bbbb
 * exit
 */
public class Exam2 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		FileOutputStream fw =  new FileOutputStream("data.txt",true);
		while(true) {
			System.out.print("내용입력 : ");
			String next = scan.nextLine();
			if(next.equals("exit")) {
				break;
			}
			fw.write((next+"\n").getBytes());
		}
		fw.close();
		
		//-----------------------
//		FileWriter fw =  new FileWriter("data.txt");
//		while(true) {
//			System.out.print("내용입력 : ");
//			String next = scan.next();
//			if(next.equals("exit")) {
//				break;
//			}
//			fw.write(next);
		//Write는 문자열자체를 읽기때문에 byte로변환해줄필요없음
//			
//		}
//		fw.close();
	}

}
