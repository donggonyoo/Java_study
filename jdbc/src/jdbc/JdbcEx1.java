package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * JDBC : 자바애플리케이션과 DBMS를 연결하기위한도구
 * 		1.드라이버파일 연결 : classpath연결 : buildPath 메뉴이용
 * 		2.JDBC 관련패키지 : java.sql.* 
 * 		3.드라이브클래스를 메모리에 road
 * 		4.dbms와 java를 연결해 객체생성
 */
public class JdbcEx1 {
	public static void main(String[] args) throws ClassNotFoundException , SQLException{
		//3 Class.forName(문자열) : 문자열에해당하는 클래스찾아서 클래스파일을 메모리에 로드
		// mariadb : org.mariadb.jdbc.Driver
		// oracle : oracle.jdbc.driver.OracleDriver
		Class.forName("org.mariadb.jdbc.Driver");
		//4.conn : db와 연결객체
		//localhost : IP주소 
		//3306 : port번호 (maria , my sql : 3306) 
		Connection conn = DriverManager.getConnection
				("jdbc:mariadb://localhost:3306/gdjdb","gduser","1234");
		                                      //나의DB명 , 사용자명 , 비번
		System.out.println("jdbc 연결완료");
		
		//이건 jdbc연결후에 실행하자
		//Statement : SQL명령문을 DB에 전달위한 객체
		Statement stmt = conn.createStatement();
		//stmt.executeQuery("sql문") : sql문장 실행
//		ResultSet : select구문의 결과를 저장하는 객체
		ResultSet rs = stmt.executeQuery("select * from student");
		while(rs.next()) { //레코드 하나씩 조회(모두읽을때까지)
					//rs.getString("컬럼명") : 컬럼의값을 문자열로읽어와
			System.out.print("학번 : "+rs.getString("studno"));
			System.out.print(",이름 : "+rs.getString("name"));
			System.out.print(",학년 : "+rs.getString("grade"));
			System.out.println(",학과코드: "+rs.getString("major1"));
		}
	}
}
