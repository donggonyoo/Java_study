package chap10;

/*
 * 예외처리 : 발생된 예외를 정상화하는 과정
 * 
 * try {}  : 예외 발생 가능성이있는문장
 * catch(예외타입 참조변수) {} : try구문에서 예외발생시 호출되는 블럭
 * finally{} : 정상,예외 상관없이 꼭 실행
 * 
 * throws : 예외처리의 다른방식(던지기)
 * throw : 예외발생
 */
public class ExceptionEx1 {

	public static void main(String[] args) {
		
		try {
			System.out.println(args[0]);
	
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();//오류내용출력
			System.out.println("command라인에 파라미터값 입력하세요");
		}
		
		finally {
			System.out.println("종료");
		}
	}
}
