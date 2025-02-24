package test;

import java.io.FileInputStream;
import java.io.IOException;

public class Test2_B {
	public static void main(String[] args) throws IOException {
		FileInputStream fis =new FileInputStream("bin/ex1_InputStream/InputStreamEx1.class");
		byte[] buf = new byte[16];
		int len;
		while ((len = fis.read(buf)) != -1) {
			for (int i = 0; i < len; i++)
				System.out.printf(" %02X", buf[i]);
			System.out.println();
		}
	}

}
