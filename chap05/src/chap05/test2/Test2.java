package chap05.test2;
/*
 command line에서 숫자로 이루어진 문자를 두개 받아서 두수의 공약수를 구하시오
 int num1 = Integer.parseInt(args[0])
   [결과]
   10과 20 의 공약수 : 1,2,5,10,

 */
public class Test2 {

	public static void main(String[] args) {
		
		if(args.length !=2) {
			System.out.println("commandLine에 두개의 파라미터만");
			return;
		}
		
		
		int int1 = Integer.parseInt(args[0]);
		int int2 = Integer.parseInt(args[1]);
		
		for (int i = 0; i < args.length; i++) {
			System.out.println("args["+i+"] : "+args[i]);
		}
		//args 입력 할떄 space를 누르지않는다면 배열의요소가 하나가됨 args.length == 1 
		//띄어쓰기로 요소를 분리해서 저장하자
	
	
		int i=0;
		System.out.print(int1+"와"+int2+"의 공약수  : ");
		while(true) {
			++i;
			if(int1%i==0 && int2%i==0) {
				System.out.print(i+",");
			}
			if(i>int1 || i>int2) {
				break;
			}	
			}
		
	
	}

}
