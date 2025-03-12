package jdbc;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Fii {
	public static void main(String[] args) throws IOException {
		FileReader fi= new FileReader("src\\jdbc\\Test.java");
		Writer w = new FileWriter("test.text");
		char[] c = new char[100000];
		int data=0;
		while((data= fi.read(c))!= -1) {
			w.write(c);
		}
	
	}

}
