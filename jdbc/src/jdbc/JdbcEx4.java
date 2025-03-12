package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcEx4 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		Connection conn = DBConnection.getConnection();
		String sql = "create table login "
				+ "(id varchar(10) primary key , password varchar(10))";
		PreparedStatement ps = conn.prepareStatement(sql);//create table 실행 
		int result = ps.executeUpdate();//레코드의변경갯수반환
		System.out.println("loginTable create : "+result);//0
		
		//데이터추가1
		sql = "insert into login(id,password) values (?,?)";
		ps = conn.prepareStatement(sql); //sql문장 db에전달
		ps.setString(1, "hongkd");//1번쨰?의값
		ps.setString(2, "1234");//2번쨰?의값
		result = ps.executeUpdate();//보낸거를 실행 후 레코드의변경갯수 반환
		System.out.println("hongkd insert : "+result);
		//데이터추가2(다시 db에 sql을 보낼필요가없음)
		ps.setString(1, "dong");//1번쨰?의값
		ps.setString(2, "1532");//2번쨰?의값
		result = ps.executeUpdate();//보낸거를 실행 후 레코드의변경갯수 반환
		System.out.println("dong insert : "+result);
		
		
		//테이블조회
		sql ="select * from login order by password";
		ps = conn.prepareStatement(sql);//sql을 db에전달
		ResultSet rs = ps.executeQuery();//select문(sql)의 결과를 저장
		while(rs.next()) {
			System.out.print(rs.getString(1));
			System.out.println(","+rs.getString(2));
		}
		
		
		
		sql = "drop table login";
		ps = conn.prepareStatement(sql);
		result = ps.executeUpdate();
		System.out.println("login table drop : "+result);
	}

}
