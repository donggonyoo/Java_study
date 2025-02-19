package ex12_Scanner;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class ScannerEx1 {
	public static void main(String[] args) {
		String str = "100 and 200 and animal and lion and tiger";
		Scanner scan = new Scanner(str);
		scan.useDelimiter("\\s*and\\s*");
		//split 과 같은느낌인거같음 .
		
		//str을 and 기준으로 문자열을 분리해서 읽을 준비
		
		while(true) {
			try {
				String token = scan.next();
				System.out.println(token);
				
			} catch (NoSuchElementException e) {
				//읽을 수 있는 데이터가없는경우 예외발생
				break;
			}
		}
	}

}
