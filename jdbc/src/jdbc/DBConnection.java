package jdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/*
 * 외부파일에서 DB관련 설정내용을 저장.
 */
public class DBConnection {
	// 매번 연결객체를 적는것도 쉬운일이아니다 ( 메서드를 하나만들어버리자)
	static Connection getConnection() throws ClassNotFoundException, SQLException, IOException {
		/*
		 * Properties :  Hashtable의 하위클래스 (key,객체)-->(String,String) 제네릭표현없음
		 * 				FileInputStream과 연동해 Properties 객체로 값을 저장
		 */
		Properties pro = new Properties();
		FileInputStream fis = new FileInputStream("jdbc.properties");
		pro.load(fis); //properties의 내용을 (key,value)값으로 저장해줌
		
		Class.forName(pro.getProperty("driver"));//key=Driver의 value을 가져오란 소리.
					//pro.put("driver","org.mariadb.jdbc.Driver")와 같음
		//DB와 연결객체
		Connection conn = DriverManager.getConnection
				(pro.getProperty("url"),pro.getProperty("user"),pro.getProperty("password"));
		return  conn;
	}
}
