package test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOError;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
/*
 * apple.gif 파일을 읽어서, apple2.gif 파일로 복사하기
 * gif같은 파일은 바이너리파일임 (byte로 읽고써야함)
 * FileInput , FileOutput 사용하자
 * 텍스트가 아닌 파일은 반드시 FileInputStream , FileOutputStream 이용
 * 
 */
public class Test4_A {
	public static void main(String[] args) throws IOException{
		 FileInputStream fr  = new FileInputStream("D:/java/apple.gif");//읽기(입력)
//		 Reader r  = new FileReader("D:\\java\\apple.gif");//읽기(입력)
		 
		 FileOutputStream w = new FileOutputStream("apple2.gif");//저장(출력)
		 FileOutputStream w2 = new FileOutputStream("apple4.gif");
//		 Writer w3 = new FileWriter("apple4.gif");
		 
		int data=0;
		int data2=0;
		byte[] a = new byte[fr.available()];
	
		
		while((data=fr.read())!= -1) { 
			//gif 파일같은 이미지파일들은 바이트코드임
			//char과 같은 문자열로 불러오거나 저장하면 안됨
			
			w.write(data);
		}
		fr = new FileInputStream("D:/java/apple.gif");
		while((data2=fr.read(a,0,a.length))!= -1) {
			w2.write(a);
		}
		
		fr.close();
		w.flush();
		w2.flush();
		w.close();
		w2.close();
	}

}
