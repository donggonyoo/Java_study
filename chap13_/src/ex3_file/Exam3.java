package ex3_file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/*
 * InputStreamEx1.java 파일을 읽어서 InputStreamEx1.bak 파일로생성해보자
 * FileInputStream클래스로 구현
 */
public class Exam3 {
	public static void main(String[] args) throws IOException{
		FileInputStream fi = new FileInputStream("src\\ex3_file\\FileInputStreamEx1.java");
		FileOutputStream fw = new FileOutputStream("InputStreamEx1.bak");
		int data=0;
		byte [] buf = new byte[fi.available()];
		while((data=fi.read(buf))!=-1) {
			fw.write(buf);
		}
		fi.close();
		fw.flush();
		fw.close();
		System.out.println("프로그램종료1");
		
		FileReader fr = new FileReader("src\\ex3_file\\GG.java");
		Writer w = new FileWriter("GG.bak");
		char [] c = new char[2000];
		int data2 =0;
		while((data2=fr.read(c,0,c.length))!=-1) {
			System.out.println("data2 : "+data2);
			w.write(c);
		}
		fr.close();
		w.flush();
		w.close();
		System.out.println("프로그램종료");
		

	}

}
