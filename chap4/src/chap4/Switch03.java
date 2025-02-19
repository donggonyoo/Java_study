package chap4;
/*
 * switch(조건값)
 * 조건값으로 사용가능한 자료형
 * byte , short, int ,char , String
 */
public class Switch03 {
	public static void main(String[] args) {
		String str = "1";
		switch(str) {
		case "1" -> System.out.println(str);
		default -> System.out.println("defalut");
		}

		char ch = 'A';
		switch(ch) {
		case 'A'-> System.out.println(ch);
		default-> System.out.println("defalut");
		}

		short s = 6; //int  , byte 가능
		switch(s) {
		case 6 : System.out.println(s);break;
		default : System.out.println("defalut");break;
		}

		//중첩switch문 가능
		int a = 1,b=2;
		switch (a) {
		case 1:
			switch (b) {
			case 2:System.out.println("a : "+a+"b : "+b);
			break;}
			break; //break를 클릭해보면 
			//어느 switch문의 break인지 나타남
			
		default:System.out.println("default구문");
		}

	}

}
