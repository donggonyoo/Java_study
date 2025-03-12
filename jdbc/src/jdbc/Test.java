package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		Scanner scan = new Scanner(System.in);
		//본인은 레코드의 갯수를 세는 방법을 2가지로했음
		// 1번째방법은 함수를 사용하는것 ( 레코드출력 전에 출력가능)
		// 2번째방법은 레코드를 출력할 때 count++을 해준 후 컬럼의수로 나눠줌(레코드출력 후에만 가능)
		while(true) {
			try {
				int count=0;
				Connection conn = DBConnection.getConnection();
				System.out.print("쿼리를 입력하세요 : ");
				String sql = scan.nextLine();
				if(sql.contains("exit")) {
					System.out.println("종료");
					return;
				}
				PreparedStatement ps = conn.prepareStatement(sql);//sql을 DB에전달

				if(ps.execute()) {//select문이면 true
					ResultSetMetaData psmd = ps.getMetaData();
					ResultSet rs = ps.getResultSet();

					rs.last();//rs를 마지막행으로 이동
					int row = rs.getRow();//row(행)의 길이반환
					System.out.println("조회된 레코드의 수 : "+row);
					rs.beforeFirst();//첫번째 행 이전으로 돌아감
					//첫번째행으로 돌아가면 rs.next()를 만나면 2번째행부터실행됨!!!!(주의)

					for (int i = 1; i <= psmd.getColumnCount(); i++) {
						System.out.printf("%-10s",psmd.getColumnName(i));
						//i번쨰로조회한 컬럼의 이름
					}
					System.out.println();

					while(rs.next()) {
						for (int i = 1; i <= psmd.getColumnCount(); i++) {
							System.out.printf("%-10s",rs.getString(i));//i번쨰컬럼의 레코드
							count++;
						}System.out.println();
					}System.out.println("레코드 수 "+count/psmd.getColumnCount());
					//count를 컬럼1개당 ++를 해줬다
					//레코드 수를 찾으려면 count를 컬럼의갯수(psmd.getColumnCount)로 나눠줘야함
				}

				else {
					int updateCount = ps.getUpdateCount();
					System.out.println("변경된 레코드의 수 : "+updateCount);
				}
			}
			catch(Exception e) {
				System.out.println("잘못된 형식");
				continue;
			}
		}
	}
}


