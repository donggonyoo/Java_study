package chap4.hardEx;
/*
 * 1부터 100까지의 숫자 중 2의 배수이거나, 3의 배수의 합을 구하기 
 */
public class Test07 {
	public static void main(String[] args) {
		int sum=0;
		for (int i = 1; i <= 100; i++) {
			if(i%2==0 || i%3 ==0) {
				sum+=i;
			}
		}
		System.out.println("1부터100까지의 숫자중 \n"
				+ "2의배수거나 3의배수의 합 구하기");
		System.out.println("sum : "+sum);

	}
}
