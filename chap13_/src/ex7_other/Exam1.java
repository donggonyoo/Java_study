package ex7_other;

import java.io.File;

/*
 * c:/widows폴더의 하위폴더의갯수와 파일의갯수,파일의 총 크기출력
 */
public class Exam1 {
	public static void main(String[] args) {
		File f = new File("c:/windows");
		String[] list = f.list();
		int dCount=0;
		int fCount=0;
		long fSize=0;
		for (String s : list) {
		
			System.out.println("name:"+s);
			File f2 = new File(f,s);//f의 하위폴더 s
			
			if(f2.isFile()) {
				System.out.printf("%s : 파일(%dbyte)\n",f2,f2.length());
				fCount++;
				fSize+=f2.length();
			}
			else {
				System.out.printf("%s : 폴더\n",f2.getAbsoluteFile());
				dCount++;
			}
			
		}System.out.println();
		System.out.println("폴더의 갯수 : "+dCount);
		System.out.println("파일의 갯수 : "+fCount);
		System.out.printf("파일의 총 크기 : %,d(byte)",fSize);
	
	}

}
