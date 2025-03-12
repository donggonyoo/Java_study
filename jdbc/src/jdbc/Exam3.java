package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

/*
 * 학생의학번 이름 학년 학과코드 학과명 지도교수 이름을 출력해보자
 * 출력시 Header에 컬럼도 출력하기
 */
public class Exam3 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		Connection conn = DBConnection.getConnection();
		String sql = "select s.name,s.grade,s.studno,m.name ,p.name "
				+ "from student s join professor p join major m "//항상 줄을 바꿀때는 한칸씩 띄워주지
				+ "on s.profno = p.no and s.major1=m.code";
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		ResultSetMetaData rsmd = ps.getMetaData();
		for (int i = 1; i <= rsmd.getColumnCount(); i++) {
			System.out.printf("%-15s",rsmd.getColumnName(i));	
		}
		System.out.println();
		while(rs.next()) {
			System.out.printf("%-15s",rs.getString("s.name"));//1
			System.out.printf("%-15d",rs.getInt("s.grade"));//2
			System.out.printf("%-12d",rs.getInt("s.studno"));//3
			System.out.printf("%-10s\t",rs.getString("m.name"));//4
			System.out.printf("%8s\n",rs.getString("p.name"));//5
		}
	}
}
