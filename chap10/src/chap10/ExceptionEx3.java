package chap10;

/*
 * 정상처리 : 12356 
 * 2/0 오류 : 1456
 * 
 * 
 * 정상 처리 후 return -> 1235 (6은실행안됨)
 * 2/0 오류 return ->  145 
 * 
 * finally블럭 : try블럭에서 정상처리 / 예외발생 모두 실행되는블럭
 * 				중간에 return이 실행되도 반드시 실행되는 영역
 */
public class ExceptionEx3 {
	public static void main(String[] args) {
		try {
			System.out.print(1);
			System.out.print(2/0);// /by zero
			System.out.print(3);
//			return;
	
		} catch (Exception e) {
			System.out.print(4);
			System.out.print("[메시지 : "+e.getMessage()+"]");
			return;
		}
		finally {
			System.out.print(5);
		}
		System.out.print(6);
	}

}
