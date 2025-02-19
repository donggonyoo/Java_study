package ex5_Math;

//round(실수값 , 자리수) 실수값을 반올림해 소숫점이하자리수로 출력
//실수값을 소숫점이하자리수까지출력
public class Exam1 {
	public static void main(String[] args) {
		round(3.1215,1);
		round(3.1215,2);
		round(3.1215,3);
		System.out.println(truncate(3.15345,1));//3.1
		System.out.println(truncate(3.15345,2));//3.15
	}

	private static double truncate(double d, int i) {
		
		double num = Math.pow(10, i);
		return (int)(d*num)/(num) ;
		// (int)31.5345 / 10 == 31/10 == 3.1
	}

	private static void round(double d, int i) {
		double pow = Math.pow(10,i);
		System.out.println(Math.round(pow*d)/pow);
		
		
		String format2 = String.format("%."+i+"f", d);
		System.out.println(format2);	
	}
}
