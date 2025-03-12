package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * dept테이블을 이용해 서울지역레코드만 dept_seoul테이블로 생성하기
 * 
 * dept_seoul테이블에
 * deptno : 60 , dname : 특수영업부 , loc :서울레코드추가
 * 
 * dept_seoul테이블에
 * deptno:60 레코드의 dname : 특수영업1부로 수정하기
 * dept_seoul 테이블의 모든컬럼의내용 화면에출력
 */
public class Exam2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		Connection conn = DBConnection.getConnection();
		Statement st = conn.createStatement();
		
		
		String sql = "create table dept_seoul "
				+ "select * from dept where loc='서울'";
		
		int result = st.executeUpdate(sql);
		System.out.println(result); //4 (서울레코드4개)
		
		sql = "insert into dept_seoul values(60,'특수영업부','서울')";
		result= st.executeUpdate(sql);
		System.out.println(result);//1
		
		sql = "update  dept_seoul set dname='특수영업1부' where deptno=60";
		result= st.executeUpdate(sql);
		System.out.println(result);//1
		
		
		ResultSet rs = st.executeQuery("select * from dept_seoul");
		while(rs.next()) {
			System.out.print("deptno : "+rs.getString(1));
			System.out.print(", dname : "+rs.getString(2));
			System.out.println(", loc : "+rs.getString(3));
		}
		
		sql = "drop table dept_seoul";
		result= st.executeUpdate(sql);
		System.out.println(result);//0

	}
}
