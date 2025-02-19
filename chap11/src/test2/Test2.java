package test2;

/* 문자열 1,234를 정수로 변경하여  * 10 한 값을 세자리마다 , 찍어 출력하기 
* [결과]
* 12,340
*/
public class Test2 {
	public static void main(String[] args) {
		String str = "1,234";
		String[] split = str.split(",");
		String s = split[0]+split[1];//1234
		
		int int1 = Integer.parseInt(s);
		String format = String.format("%,d", int1*10);
		//%,d 3번째마다 ,찍기
		System.out.println(format);
	}

}
