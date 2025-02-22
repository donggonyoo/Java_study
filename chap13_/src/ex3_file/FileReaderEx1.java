package ex3_file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * FileReader클래스 : 파일에서 데이터2byte단위로 읽기
 * 
 * int read() : 파일에서 데이터 1char단위로읽기
 * int read(char[] buf) : 파일에서 buf크기만큼을 읽어 buf에 내용저장 ,실제읽은 char수 리턴
 * int read(char[] buf , int start , int len)"
 * 		파일에서 len크기만큼 읽어서 buf의 strat인덱스부터 저장 , 실제읽은 char수 리턴
 * 
 * 생성자 : FileNotFoundException(IOException의 하위클래스)예외처리필수
 * read() : IOException예외처리필수
 */
public class FileReaderEx1 {
	public static void main(String[] args) throws IOException {
		char[] buf = new char[8000];
		int data = 0;
		FileReader fr =  new FileReader("src\\ex1\\InputStream\\GG.java");
		System.out.println("-------read()메서드로 읽기-----");
		while((data=fr.read())!= -1) {
			System.out.print((char)data);
		}
		
		System.out.println("-------read(char[] buf)메서드로 읽기-----");
		fr =  new FileReader("src\\ex1\\InputStream\\GG.java");
		while((data=fr.read(buf))!= -1) {
			//buf에서읽은 데이터 수를 data에 넣어
			System.out.print(new String(buf,0,data));
		}
		
		System.out.println("-------read(char[],int,int)메서드로 읽기-----");
		fr =  new FileReader("src\\ex1\\InputStream\\GG.java");
		while((data=fr.read(buf,0,buf.length))!= -1) {
			System.out.print(new String(buf,0,data));
			System.out.print("data ::::"+data);
		}
		
		
	}

}
