package chap8.test;
//다음 소스는 컴파일 오류가 발생한다. 결과가 "Tested" 가 출력되도록 프로그램을 수정하기
interface Beta {
	String testIt();
}  //멤버가 없다.

class Alpha implements Beta {
	@Override
	public String testIt() {
		return "Tested";
	}
}
class Gamma implements Beta {
	@Override
	public String testIt() {
		return "Gamma";
	}
}
public class Test2 {
	static Beta getIt(String a) {
		if(a.equalsIgnoreCase("alpha")) {
		return new Alpha();}
		else {
			return new Gamma();
		}
	}
	
	public static void main(String[] args) {
		Beta it = getIt("alpha");
		System.out.println(it.testIt());
		Beta it2 = getIt("a");
		System.out.println(it2.testIt());
	}
}
