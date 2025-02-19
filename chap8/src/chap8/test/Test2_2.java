package chap8.test;
//다음 소스는 컴파일 오류가 발생한다. 결과가 "Tested" 가 출력되도록 프로그램을 수정하기
interface Beta1 {

}  //멤버가 없다

class Alpha12 implements Beta1 {

	public String testIt() {
		return "Tested";
	}
}
class Gamma12 implements Beta1 {

	public String testIt() {
		return "Gamma";
	}
}
public class Test2_2 {
	static Beta1 getIt() {
		return new Alpha12();
	}

	public static void main(String[] args) {
		Beta1 it = getIt();
		System.out.println(((Alpha12)it).testIt());

	}
}




