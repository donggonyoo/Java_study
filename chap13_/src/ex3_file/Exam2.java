package ex3_file;

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
		FileWriter fw =  new FileWriter("data.txt");
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("내용입력 : ");
			String next = scan.next();
			if(next.equals("exit")) {
				fw.flush();
				fw.close();
				break;
			}
			fw.write(next);
			
			
		}
	}

}
