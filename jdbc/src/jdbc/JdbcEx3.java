package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/*
 * PreparedStatement 예제
 * Statement의 하위 인터페이스
 * SetInt(순서,값) : 자료형인식
 */
public class JdbcEx3 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		Connection con = DBConnection.getConnection();
		PreparedStatement pstmt = con.prepareStatement
				("select * from student where grade=?");
			  //DB에 SQL문장을 먼저 전달 
		Scanner scan = new Scanner(System.in);
		System.out.print("학년을 입력하세요");
		int grade = scan.nextInt();
		pstmt.setInt(1, grade);
		//1:?의순서 (첫번쨰 ?) , grade:?에 치환 될 값
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			System.out.printf("학번:%7s,이름:%-5s,학년:%3d,키:%5.2f,몸무게:%5.2f,학과코드:%-5s\n",
					rs.getString("studno"),
					rs.getString("name"),
					rs.getInt("grade"),
					rs.getDouble("height"),
					rs.getDouble("weight"),
					rs.getString("major1"));
			}
	}

}
