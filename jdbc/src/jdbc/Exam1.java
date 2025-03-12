package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//교수테이블에서 교수의번호,이름,id,입사일,급여 보너스,학과코드를 화면에출력하기
public class Exam1 {
	public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {
		Connection conn = DBConnection.getConnection();
		
		//SQL 명령문 DB에 전달하기위한객체
		Statement st = conn.createStatement();
		
		//select문 결과를 저장할 객체
		ResultSet rs = st.executeQuery("select no,name,id,hiredate,salary,bonus,deptno from professor");
	
		while(rs.next()) {
			System.out.printf("교수번호 : "+rs.getString(1)); //이 번호는 스키마에있는번호가아님 (조호된 컬럼의 순서)
			System.out.printf(",이름 : "+rs.getString(2));
			System.out.printf(",id : "+rs.getString(3));
			System.out.printf(",입사일 : "+rs.getString(4));
			System.out.printf(",급여 : "+rs.getString(5));
			System.out.printf(",보너스 : "+rs.getString(6));
			System.out.println(",학과코드: "+rs.getString(7));
		}
	}

}
