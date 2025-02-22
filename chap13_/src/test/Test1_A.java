package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*
 * 화면에서 파일명을 입력받아서 해당 파일의 내용을 화면에 출력하기.
 * 만약 파일이 없는 경우는 '해당 파일 없음' 을 출력하기
 * 한글은 깨지지 않아야 함.
 * FileInputStream 사용하기
 */
public class Test1_A {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("파일명 입력 :   ");
		String file = scan.next();
		
		try {
			int data=0;
			int data2=0;
		FileInputStream fi = new FileInputStream(file);
		FileReader fr =  new FileReader(file);
		byte[] buf1 = new byte[fi.available()];//fi의 읽을 수 있는크기의 byte배열
		char[] c = new char[3000];
		
		System.out.println("= = = FileInputStream사용 = = =");
		System.out.println("FileInputStream.read(byte[] buf)");
		while((data=fi.read(buf1))!=-1) {
			System.out.print(new String(buf1,0,data));
		}
		
		System.out.println("===Reader 사용 ===");
		System.out.println("Reader는 char형을 사용함");
		while((data2=fr.read(c))!= -1) {
			System.out.printf(new String(c,0,data2));
		}
		
		
		}
		catch(FileNotFoundException e) {
			System.out.println("존재하지않는 파일");
		}
		
		
	}

}
