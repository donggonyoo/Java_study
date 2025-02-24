package ex7_other;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileEx3 {
	public static void main(String[] args) throws IOException {
		File f = new File("data.txt");
		if(!f.exists()) {
			System.out.println(f.getName()+"파일 존재X");
//			FileOutputStream fos = new FileOutputStream(f);
//			byte[] buf ="안녕하세요".getBytes();
//			fos.write(buf);
//			fos.flush();
//			fos.close();
			return;
		}
		FileInputStream fis = new FileInputStream(f);
		int len=0;
		byte[] buf = new byte[fis.available()];
		while((len=fis.read(buf))!= -1) {
			System.out.println(new String(buf,0,len));
		}
		fis.close();
		f.delete();
	}

}
