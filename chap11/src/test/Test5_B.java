package test;

import java.util.Arrays;
import java.util.Iterator;

/*
 * indexOf(문자열,찾는 문자열)
 *    문자열에서 찾는 문자열의 위치 값을 출력하는 함수 구현하기
 */
public class Test5_B {
	public static void main(String[] args) {
		indexOf("12345AB12AB45AB", "12");  //12:0,7
		indexOf("12345AB12AB45AB", "AB");  //AB:5,9,13
		indexOf("12345", "AB");            //AB : 없음
	}

	private static void indexOf(String string, String string2) {

		int count = 0;
		int index=0;
		System.out.print(string2+" : ");
		while(true) {

			//ex) "12345812".indexOf("12",0);---> 0  
			///index = 0+1
			/// "12345812".indexOf("12",1);--->  6
			///index= 6+1
			/// "12345812".indexOf("12",7);--->  -1 break;

			int indexOf = string.indexOf(string2,index);
			if(indexOf<0) {
				if(count==0) {
					System.out.print("없음");
				}
				System.out.println();
				break;
			}

			else{
				System.out.printf(indexOf+",");
				index =indexOf+1;//이렇게 해줘야 찾은문자 다음문자부터 구하게됨
				count++;//아예 존재하지않는 문자를 따로처리하기위해 count변수를 이용
			}

		}

	}
}

