package chap8;

/*
 * 리턴타입으로 사용되는 인터페이스
 */
class Lazerzet implements Printerable{

	String name  = "잉크젯";
	@Override
	public void print() {
		System.out.println("레이저프린터로 프린트");	
	}
}

//--------------------------------------------------------

class Inkzet implements Printerable{
	String name  = "레이저젯";
	@Override
	public void print() {
		System.out.println("잉크젯 프린터로 프린트");
	}
}

//--------------------------------------------------------

class PrinterManager{
	public static Printerable getPrint(String type) {
		if(type.equals("INK")) {return new Inkzet();} //ink가 입력되면 Inkzet객체반환
		else {return new Lazerzet();}//그 외는 Lazerzet으로 반환
	}
}

//--------------------------------------------------------

public class InterfaceEx2 {
	public static void main(String[] args) {
		Printerable p = PrinterManager.getPrint("INK");
		p.print();
//		System.out.println(p.name);Printerable의 멤버가 아니므로 사용X
		
		PrinterManager.getPrint("LAZER").print();
		
	}
}
