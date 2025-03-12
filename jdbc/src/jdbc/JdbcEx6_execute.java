package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class JdbcEx6_execute {
/*
 * ResultSet executeQuery() : select 문장 실행
 * int executeupdate() : select 문장 이외의 구문 실행(craete , insert , drop ,,,,,)
 * bollean execute() : 모든 sql문장 사용가능 
 * 		true : 실행된구문이 select
 * 		false : 실행구문이 select가 아닌경우
 */
	static int count;
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		String sql = "select * from test3";
		Connection conn = DBConnection.getConnection();
		PreparedStatement ps = conn.prepareStatement(sql);
		
		if(ps.execute()) {//select구문인경우 : true리턴
			
			ResultSet rs = ps.getResultSet();//ResultSet을 반환
			ResultSetMetaData rsmd = rs.getMetaData();
			for (int i = 1; i <= rsmd.getColumnCount(); i++) {
				System.out.printf("%-10s",rsmd.getColumnName(i));
			}
			System.out.println();
			while(rs.next()) {
				for (int i = 1; i <= rsmd.getColumnCount(); i++) {
					System.out.printf("%-10s",rs.getString(i));
					count++;
				}
				System.out.println();
				
			}count /= rsmd.getColumnCount();
		}
		else {//select구문 이외의 sql문장
			System.out.println("변경된 레코드 건수 : "+ps.getUpdateCount());
		}System.out.println("조회컬럼수 : "+count);
	}
	
}
