package ex2.outputStream;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Exam1_Writer {
	public static void main(String[] args) throws IOException{
		Writer out = new OutputStreamWriter(System.out);
		out.write('1');out.write('2');out.write('3');
		out.write('a');out.write('b');out.write('c');
		out.write('가');out.write('나');out.write('다');
		//내가보내는 부분 2byte씩 보냄
		
		out.flush();//한글이깨지지않음 
	}

}
