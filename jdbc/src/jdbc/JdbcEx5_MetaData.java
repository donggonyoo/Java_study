package jdbc;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
/*
 * ResultSetMetaData : 조회된컬럼명,컬럼갯수 등의 정보저장객체
 */
public class JdbcEx5_MetaData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
	
		String sql = "select * from student";
		Connection conn = DBConnection.getConnection();
		PreparedStatement ps = conn.prepareStatement(sql);
		//rs : DB에서전달해준 데이터정보(ResultSet객체)
		ResultSet rs = ps.executeQuery();
		
		//MetaData사용
		//rsmd : 결과데이터의 정보를 저장 객체 (ResultSetMetaData 객체)
		ResultSetMetaData rsmd = rs.getMetaData();
		int columnCount = rsmd.getColumnCount();
		//조회된 컬럼의 갯수(java는 db의스키마를알수없음 db가전달해준 컬럼의갯수)
		System.out.println("조회된 컬럼 수 : "+columnCount);//12
		System.out.printf("%-10s","컬럼명");
		System.out.printf("%-10s","컬럼타입");
		System.out.printf("%-10s\n","Null 허용");
		for (int i = 1; i <= columnCount; i++) {
			System.out.printf("%-10s",rsmd.getColumnName(i));//i번쨰로조회된 컬럼의이름
			System.out.printf("%s(%d)\t",rsmd.getColumnTypeName(i),rsmd.getPrecision(i));
			//i번쨰컬럼의 자료형이름 , 자료형의크기정보
			System.out.printf("%-10s\n",(rsmd.isNullable(i)==0)?"NOT NULL":"NULL");
			//i번쨰 조회된 컬럼의 null을허용하는가? 
		}
	}
}
