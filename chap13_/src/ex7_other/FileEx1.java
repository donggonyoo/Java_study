package ex7_other;

import java.io.File;

/*
 * File클래스
 * -파일이나 폴더의 정보를 관리하는 클래스
 * -new File(String) : 경로
 * - new File(String,String) : 경로, 하위경로
 * -윈도우 : \\ , /
 * -리눅스 : /
 * 
 */
public class FileEx1 {
	public static void main(String[] args) {
		System.out.println("File.separator : "+File.separator);
		String filePath = "c:/";
		//f1 : c:/ 폴더의정보
		File f1 = new File(filePath);
		//f1.list() : 하위폴더/파일의 정보이름 리턴
		String[] files = f1.list();
		for (String f : files) {//f : c:/폴더의 하위목록의 이름
			System.out.println(f);
			File f2 = new File(filePath,f);//상위경로 , 하위경로
			if(f2.isDirectory()) {//폴더??
				System.out.printf("%s:디렉토리\n",f);
			}
			else {
				//f.length() 파일의 크기
				//%,d : 10진정수출력시 세자리마다 , 를 표시해 출력
				System.out.printf("%s:파일(%,dbytes)\n",f,f.length());
			}
		}
		
	}

}
