package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


//교수테이블에서 교수의번호,이름,id,입사일,급여 보너스,학과코드를 화면에출력하기
public class Exam1 {
	public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {
		Connection conn = DBConnection.getConnection();
		String sql = "select no , name , id , hiredate , salary,bonus , deptno from professor";
		PreparedStatement ps = conn.prepareStatement(sql); // sql을 db에전달하느거임
		ResultSet rs = ps.executeQuery();//slect문을 저장하는객체
		while(rs.next()){
			//rs를 모두 사용할때까지
			System.out.printf("교수번호 : "+rs.getInt(1));
			System.out.printf(",교수이름 : "+rs.getString(2));
			System.out.printf(",id : "+rs.getString(3));
			System.out.printf(",입사일 : "+rs.getString(4));
			System.out.printf(",급여 : "+rs.getInt(5));
			System.out.printf(",bonus : "+rs.getInt(6));
			System.out.println(",deptno : "+rs.getInt(7));
		}
				
		
		
		}
	}


