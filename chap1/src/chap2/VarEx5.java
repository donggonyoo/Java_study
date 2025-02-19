package chap2;

public class VarEx5 {
	public static void main(String[] args) {
		
		float f = (float)3/2; //float 3 /=2;
		float f1 = 3;
		f1 /= 2;
		
		long l = (long)3000 * 3000 * 3000;
		//27000000000 으로 int의값 범위를 넘어버림 하나만 long형으로 형변환해줘도 문제없이작동
		float f2 = 0.1f;
		double d = 0.1;
		double d2 = 0.1f;
		boolean b = d==f2;
		boolean b2 = d2==f2;
		
		System.out.println("f : "+f);
		System.out.println(" l : "+l);
		System.out.printf("f2 : %.10f\n ",f2);
		System.out.printf("d : %.10f\n",d);
		System.out.printf("d2 : %.10f\n",d2);
		System.out.println("result : "+b);
		System.out.println("result : "+b2);

		
	}

}
