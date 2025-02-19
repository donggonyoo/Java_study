package ex6_Wrapper;

public class Exam1 {
	public static void main(String[] args) {
		String str = "10,20,   30,  40,  50, 60";
		
	
		
		String[] split = str.split(",");
		int sum=0;
		System.out.print("공백 제거 전 : ");
		for (String s1 : split) {
			System.out.printf("["+s1+"]");
		}System.out.println();
		
		
		for (int i = 0; i < split.length; i++) {
			int num = Integer.parseInt(split[i].trim());
			sum+=num;
			if(i != split.length-1) {
				System.out.print(num+"+");
			}
			else {
				System.out.print(num);
			}
			
		}
		System.out.println(" == "+sum);
	}
}
