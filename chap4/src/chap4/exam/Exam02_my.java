package chap4.exam;

import java.util.Scanner;

/*
 * 화면에서 한개의 문자를 입력받아 대소문자 소문자 숫자 기타문자인지출력
 * 대문자면 소문자도 같이 출력하고
 * 숫자면 +100을 해서 출력해보자
 * [결과]
 * 한개의 문자입력 : A 
 * 
 * 대문자

 * 
 */
public class Exam02_my {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		for(int i = 0 ; i< 3 ; i++) {
			System.out.print("1개의문자를 입력하세요 : ");
			String var = scan.next();//한개의문자 입력받기
			if(var.length()>1) {
				System.out.println("1개의문자만 입력하세요 ");
			}
			else {
				char c = var.charAt(0); 
				//char(문자열) 형으로 변환

				if('A'<= c && c<='Z') {
					/*
					 * A 의 아스키코드 = 65  
					 * Z 의 아스키코드 = 98 
					 * 아스키코드에 32를 더한 후 char형으로 형변환 시 소문자가 됨
					 */
					System.out.println(c+"는대문자");
					System.out.println("소문자 : "+(char)(c+32));

				}
				else if(97<= c && c<=122) { 
					/*
					 * 소문자 a 의 아스키코드 = 99  
					 * 소문자 z 의 아스키코드 = 122   그 사이에있다면 소문자인것임
					 * (char)(소문자-32) ==  대문자
					 */
					System.out.println(c+"는 소문자");
					System.out.println("대문자 : "+(char)(c-32));
				}

				else if('0'<= c && c<='9') {
					System.out.println("숫자임");
					System.out.println("c : "+(int)c+" - '0' : "+(int)'0');
					System.out.println("(int)('c'-'0')+100 : "+(((int)c-'0')+100)); 
					System.out.println("괄호의 중요성");
					System.out.println("100+50 : "+100+50);
					System.out.println("(100+50) : "+(100+50));
					//이런 아스키코드에 숫자를 더할때는 괄호가 중요함 100을 문자로 인식해버릴수도 있음
					// char형 숫자는 0을뺴줘야 int형의 숫자표현이 나옴
				}	
			}
		}
	}

}
