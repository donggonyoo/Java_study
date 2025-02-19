package chap10;

/*
 * 정상 : 12345   3/0 : 예외발생 --> 1256
 * catch블럭 : try블럭 내부에서 예외발생시 실행되는 영역
 * 
 * 다중catch
 * --한개의 try블럭에 여러개의 catch블럭 존재
 * -----> try블럭에서 발생되는 예외가 여러종류인 경우 예외별 예외처리가 가능
 * -> 상위 예외클래스(Exceptio)은 catch들 중 하단에 배치해야 함
 * 
 * 
 * 예외 클래스 계층
 * Throwable - Error
 *    		 - Exception(예외클래스 의 최상단) - RunTimeException(예외처리 생략가능)
 *    									 - 그 외 Exception (예외처리 생략불가)
 */
public class ExceptionEx2 {
	public static void main(String[] args) {
//		System.out.println(1/0);
		//ArithmeticException이 발생하지만 try문 밖 이므로
		//catch할 수 없음
		
		try {
			String str = "        [ㅎㅎㅎㅎㅎ]      ";
			//trim : 공백제거하는 기능
			System.out.println(str.trim()); //NullPointerException 
			System.out.println(Integer.parseInt("44"));
			System.out.println(args[0]);//ArrayIndexOutOfBoundsException발생
			System.out.print(1);
			System.out.print(2);
			System.out.print(3/0); //여기서 예외발생 ArithmeticException
			System.out.print(4);
			} 
		catch (ArithmeticException e) {//try문 안에서 예외발생시 실행
		
			System.out.println("\n 예외 메시지 : "+e.getMessage());
			System.out.print(5);	
		}
		catch (ArrayIndexOutOfBoundsException e) { //또다른 예외를 잡을 수도 있음
			System.out.println("command라인을 입력하세요");
//			e.printStackTrace(); 예외스택을 전부출력
			System.out.println("예외 메시지  : "+e.getMessage());
		}
		catch(NumberFormatException e) {
			System.out.println("예외 메시지 : "+e.getMessage());
			System.out.println(" 숫자만 입력해주세요 !");
		}
		
		catch(Exception e ) {
			//모든 예외를 잡아줌(catch문은 위로갈수록 상세하게 잡아주는게 원칙)
			// 상위 예외클래스는 catch들 중 하단에 배치
			
			System.out.println("예외 메시지 : "+e.getMessage());
		}
		
		System.out.println(6);//예외와상관없이 실행
	}
}
