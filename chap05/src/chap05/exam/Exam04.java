package chap05.exam;



/*
 * command라인에서 숫자입력받아 숫자의 자릿수합 출력
 * 
 * 
 */
public class Exam04 {
	public static void main(String[] args) {
		if(args.length==0) {
			System.out.println("command 숫자 입력 : ");
			return;
		}
		int sum=0;
		
		String string = args[0];
		System.out.println(string);
		String string2 = args[1];
		System.out.println(string2);
	;
		int length = args.length;
		System.out.println("length : "+length);
		
		for (int i = 0; i < args.length; i++) {
				String a = args[i];
				for (int j = 0; j < a.length(); j++) {
					char charAt = args[i].charAt(j);
					if('0'<= charAt && charAt<= '9') {
						sum+= charAt - '0';
					}
					
				}
				System.out.println(args[i]+"의 자릿수합 : "+sum);
				
				
			
		}
	}
	

}
