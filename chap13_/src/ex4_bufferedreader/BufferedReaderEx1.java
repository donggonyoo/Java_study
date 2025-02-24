package ex4_bufferedreader;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;

/*
 * BufferedReader 보조스트림
 * 보조스트림이란?
 * 1. 기존의 스트림에 새로운기능을 추가
 * 2. 객체 생성시 다른 스트림을 생성자의 매개변수로받는다
 * ex) new BufferedReader(new InputStreamReader(System.in));
 * 3.BufferedReader의 생성자 : new BufferedReader(Reader)
 * 
 * 화면에서 한줄씩 입력받아서 buffered.txt파일에저장
 * String readLine() : 한줄씩 읽기
 */
public class BufferedReaderEx1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//br : 키보드에서입력된내용을 한줄씩 읽을수있음(readLine())
		System.out.println("저장할 내용을 입력 ( 종료 : ctrl+Z )");
		Writer w = new FileWriter("bufferd.txt");
		String data=null;
		while((data=br.readLine())!= null) {
			System.out.println(data);
			w.write(data+"\n");
		}
		w.flush();w.close();
		br.close();
		
	}

}
