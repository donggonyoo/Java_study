package chap4.hardEx;

import java.util.Scanner;

public class My_Test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		for(int k = 0 ; k<3 ; k++) {
			System.out.print("3대 무게를 입력해보세요 : ");
			String numS = scan.next();
			int num = Integer.parseInt(numS);

			System.out.println("==switch문으로 표현 == (번거로움)");
			switch(num/100){
			case 9,8,7,6,5->System.out.println("헬창");
			case 4-> {
				switch(num/10) {case 45,46,47,48,49-> System.out.println("a+ 급");
				case 40,41,42,43,44->System.out.println("a 급");}
			}
			case 3-> {
				switch(num/10) {case 35,36,37,38,39-> System.out.println("b+ 급");
				case 30,31,32,33,34->System.out.println("b 급");}
			}
			default->System.out.println(" 분발하세요 ");

			}
			
			System.out.println("== if문을 사용 ==");
			if(num >= 500) {
				System.out.println("헬창");
			}
			else if(num>=400) {
				if(num>=450) {System.out.println("A+ 급");}
				else {System.out.println("A급");}
			}
			else if(num>=300) {
				if(num>=350) {System.out.println("B+ 급");}
				else {System.out.println("B급");}
			}
			else {
				System.out.println("분발하세요 ");
			}
			
			
			System.out.println("==삼항연산자 사용==(괄호를굉장히 신경쓰며 작성해야함)");
			String result = (num>=500? "헬창":
				(num>=450?"A+급":
				(num>=400?"A급":
					(num>=350?"B+급":
						(num>=300?"B급":"분발하세요")))));
			System.out.println(result);
			
			
		}
		
	}
}

