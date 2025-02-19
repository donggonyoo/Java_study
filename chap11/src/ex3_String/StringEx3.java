package ex3_String;
class Num{
	String value;
	Num(String value){
		this.value = value;
	}
	public String toString() {
		return value;
	}
}
public class StringEx3 {
	public static void main(String[] args) {
		String str = "ABC123";
		System.out.println("main : "+str);
		change(str);
		System.out.println("change 후 "+str);
		System.out.println();
		//참조변수임에도 불구하고 값이 안바뀜
		// String은 불변객체임 반환해서 새로운 참조값을 얻어내야함
		
		Num num = new Num("3");
		System.out.println("mainNum : "+num);
		change(num);
		System.out.println("change 후 : "+num);
		System.out.println();
		//일반객체는 메서드안에서도 참조값이 바뀜

		
		String str2 = change2(str);
		System.out.println("string반환 후 : "+str2);

	}
	private static void change(Num n) {
		n.value+=456;
		System.out.println("change : "+n);
		//메서드 내부에서만 생존하는 객체
		
	}

	private static void change(String str) {
		str+=456;
		System.out.println("change : "+str);
		//메서드 내부에서만 생존하는 객체
		
	}
	private static String change2(String str) {
		str+=456;
		System.out.println("change2 : "+str);
		return str;
	}
}
