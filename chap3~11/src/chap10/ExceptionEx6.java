package chap10;

public class ExceptionEx6 {
	public static void main(String[] args)  {
//		
//		try {
//			throw new Exception("예외 강제발생");
//			
//		} catch (Exception e) {
//			System.out.println("[ 메시지 : " +e.getMessage()+" ]");
//			e.printStackTrace();
//		}
		
		throw new RuntimeException("예외 강제발생");
		
		
	}
}
