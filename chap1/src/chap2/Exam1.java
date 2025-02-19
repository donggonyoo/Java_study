package chap2;

public class Exam1 {
	public static void main(String[] args) {
		char     	a= 'a';
//		char     	b="a";  //char :''
		String   	c ="a";
//		String   	d ='a';  // String : "";
//		char	e='ab';  //char == 한개 문자
		String 		f="ab";
//		char 	g=''; //한개의 문자 사용해야함
		String	h="";
//		byte	var1=128; //범위 외
		short 	var2=128;
//		int		var3=28L; L은 long형
		long	var4=128;
//		float	var5=1.2;// 1.2f 
		double var6=1.2;
		float var9 = '1'; 
		float _var10 = 1.0F;
		
		System.out.println(c);
		System.out.println(a);
		System.out.println(f);
		System.out.println(h);
		System.out.println(var2);
		System.out.println(var4);
		System.out.println(var6);
		System.out.println(var9);
		System.out.println(_var10);
	}

}
