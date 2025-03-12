package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/*
 * ResultSet executeQuery(sql) : select 구문 실행 시 호출 (db로부터 조회된레코드 return)
 *      int  executeQuery(sql) : 실행 후 변경(추가,변경,삭제) 된 레코드의 갯수리턴
 *      						create,drop,alter, insert , update , delete구문에서사용 
 *    
 */     
public class JdbcEx2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		
		Connection conn = DBConnection.getConnection();
		
		//SQL 명령문 DB에 전달하기위한객체
		Statement st = conn.createStatement();
		
		String sql = "create table jdbctest (id int primary key , name varchar(100))";
		int result = st.executeUpdate(sql);//jdbctest테이블 생성
		System.out.println("1.결과 : "+result);//0(레코드의갯수가없음)
		
		sql = "insert into jdbctest values(1,'홍길동')";
		result = st.executeUpdate(sql);
		System.out.println("2.결과 : "+result); //레코드1개추가했으므로 1
		
		sql = "insert into jdbctest values(2,'김삿갓'),(3,'이몽룡')";
		result = st.executeUpdate(sql);
		System.out.println("3.결과 : "+result); //2개의 레코드변경
		
		ResultSet rs = st.executeQuery("select * from jdbctest");
		while(rs.next()) {
			System.out.print("id : "+rs.getString(1));
			System.out.println(",name : "+rs.getString(2)); //어차피 컬럼이2개뿐이므로 1,2 출력하자
		}
		
		sql = "delete from jdbctest "; //where없으므로 모든레코드삭제
		result = st.executeUpdate(sql);
		System.out.println("4.결과 : "+result);
		
		//jdbctest테이블삭제
		sql = "drop table jdbctest";
		result = st.executeUpdate(sql);
		System.out.println("5.결과 : "+result);//0
	}
}
