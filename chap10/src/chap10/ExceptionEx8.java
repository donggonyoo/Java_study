package chap10;


class LoginFailException extends Exception{
	
	 LoginFailException(String msg) {
		 super(msg);
	}
}

class LoginFailException2 extends RuntimeException{
	
	//예외를 잡지않아도되는 언체크 예외를 상속받음
	
	 LoginFailException2(String msg) {
		 super(msg);
	}
}



public class ExceptionEx8 {
	public static void main(String[] args) {
		String id = "hong89"; //id가 hong이 아님
		String pw = "1120";
		
		try {
			if(!id.equals("hong")|| !pw.equals("1120")) {
				//id가 hong과 다르거나 비밀번호가 1120이 아니라면
				throw new LoginFailException("아이디나 비번오류(체크)");
				//예외 생성
			}
			System.out.println("반갑습니다 hong님(로그인성공)");
			
		} catch (LoginFailException e) {
			System.out.println(e.getMessage());
			//예외처리
		}
		
		
			if(!id.equals("hong")|| !pw.equals("1120")) {
				//id가 hong과 다르거나 비밀번호가 1120이 아니라면
				throw new LoginFailException2("아이디나 비번오류(언체크)");
				//RuntimeException을 상속받았으므로 던지거나 잡지않아도 됨
			}
			System.out.println("반갑습니다 hong님(로그인성공)");
			
		
	}

}
