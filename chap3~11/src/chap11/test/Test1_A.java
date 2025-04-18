package chap11.test;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
1부터 100까지 중 임의의 숫자를 컴퓨터가 저장하고, 
값을 입력받아 저장된 값을 맞추는 프로그램을 작성하기

입력 숫자가 1 부터 100까지의 숫자가 아닌 경우 : NumberInputException 예외 발생을 시키고 
                                        1 과 100사이의 숫자만 입력하세요 메세지출력 
입력 값이  숫자가 아닌경우 :  InputMismatchException 예외가 발생 
                        숫자만 입력하세요  메세지 출력
계속 입력을 받는다.
몇번의 입력만에 숫자를 맞추었는지 출력하기.
단 입력 오류된 경우도 입력 건수에 포함된다.

[결과]
1부터 100까지의 숫자를 입력하세요
50
작은수를 입력하세요
1부터 100까지의 숫자를 입력하세요
25
작은수를 입력하세요
1부터 100까지의 숫자를 입력하세요
12
큰수를 입력하세요
1부터 100까지의 숫자를 입력하세요
20
작은수를 입력하세요
1부터 100까지의 숫자를 입력하세요
15
큰수를 입력하세요
1부터 100까지의 숫자를 입력하세요
18
작은수를 입력하세요
1부터 100까지의 숫자를 입력하세요
17
작은수를 입력하세요
1부터 100까지의 숫자를 입력하세요
16
정답입니다. 입력 횟수:8
*/
class NumberInputException extends Exception{
	NumberInputException(String msg){
		super(msg);
	}
}//1보다크고100보다 작은수가 입력되지 않았을 때 발생시킬 예외

//---------------------------------------------------------------------------------------------------
public class Test1_A {
	public static void main(String[] args) {
		int randomNum = (int)(Math.random()*100)+1;
		Scanner scan = new Scanner(System.in);
		int count=0;
		
		while(true) {
			try {
				System.out.println("1부터100까지의 숫자를 입력하세요");
				int num = scan.nextInt();
				if(!(1<num && num<100)) {
					throw new NumberInputException("1부터100만 입력");//예외발생
				}
				if(num==randomNum) {
					System.out.println("정답입니다  입력횟수 : "+count);
				}
				else {
					if(num<randomNum) {
						System.out.println("큰 수를 입력하세요");
					}
					else {
						System.out.println("작은수를 입력하세요");
					}
					count++;//오답 시 계속 count를 누적
				}
				
				
			} catch (NumberInputException e) {//예외처리
				System.out.println("오류메시지 :"+e.getMessage());//오류메시지출력
				count++;//count누적
			}
			catch (InputMismatchException e) {
				System.out.println("숫자만 입력하세요");
				scan.next();//이걸해야 문자를 처리해서 무한루프가되지않는다
				count++;
			}
			
		}

	}
}
