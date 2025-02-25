package test2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Vector;

public class Test1_B {
	static Vector<InputStream> vector = new Vector();
	public static void main(String[] args) throws IOException {
		System.out.println("프로그램 시작");
		File f1 = new File("src");
		dirSearch(f1,f1.list());
		int len;
		FileOutputStream fos = new FileOutputStream("InputStream예제.txt");
		SequenceInputStream sis = new SequenceInputStream(vector.elements());
		byte[] buf = new byte[1024]; //1K
		while((len=sis.read(buf)) != -1) {
			fos.write(buf,0,len);
	    }
		fos.flush();
		fos.close();
		sis.close();
		System.out.println("프로그램 종료");
    }
	private static void dirSearch(File f,String[] dir) throws IOException {
		for(String file : dir) {
			File f2 = new File(f,file);
			if(f2.isDirectory()) {
				dirSearch(f2,f2.list());
		    } else {
		    	if(file.contains("InputStream"))
		    	   vector.add(new FileInputStream(f2));
		    }
		}		
	}
}
