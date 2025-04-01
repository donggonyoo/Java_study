package jdbc;

import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

/*
 * dongtb 라는 테이블을 생성한다 ( name varchar(10) primary key , height int , weight int)
 * 생성 이후에 이름 , 키 , 몸무게를 3번 넣는다 ( 이름 중복금지)
 * 그 후 dongtb의 전체 테이블컬럼과함꼐 출력해본 후
 * drop 한다
 */
public class MyEx {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		Scanner scan = new Scanner(System.in);
		Connection conn = DBConnection.getConnection();
		String sql = "create table dongtb "
				+ " (name varchar(10) primary key ,height int , weight int)";
		PreparedStatement ps = conn.prepareStatement(sql);
		int create = ps.executeUpdate();
		System.out.println("create 성공");

		//insert문
		sql = "insert into dongtb values(?,?,?)"; 
		PreparedStatement ps2 = conn.prepareStatement(sql);
		for (int i = 0; i < 3; i++) {
			try {
				System.out.print("이름  : ");
				String name = scan.nextLine();
				System.out.print("키 : ");
				int height = scan.nextInt();
				System.out.print("몸무게  : ");
				int weight = scan.nextInt();
				scan.nextLine(); 
				//\n을 지우기위한 수단 ( nextInt는 \n이사라지지않아  nextLine에 \n문자가 입력되버림
				ps2.setString(1, name);
				ps2.setInt(2, height);
				ps2.setInt(3, weight);
				ps2.executeUpdate(); // DB에 insert문 보내기
				}
			catch(Exception e) {
				System.out.println("오류 : "+e.getMessage());
				sql = "drop table dongtb";
				PreparedStatement ps4 = conn.prepareStatement(sql);
				ps4.executeUpdate(); //오류발생시 테이블 drop후 종료
				break;
			}
		}
		//select
		sql = "select * from dongtb";

		PreparedStatement ps3 = conn.prepareStatement(sql);
		ResultSetMetaData metaData = ps3.getMetaData();

		for (int i = 1; i <= metaData.getColumnCount(); i++) {
			//metaDate를 이용해 조회된 컬럼의 수 만큼 루프를돌린다
			System.out.printf("%-10s",metaData.getColumnName(i)); 
			//i번째 조회된 컬럼의 이름출력
		}System.out.println();

		ResultSet rs = ps3.executeQuery();//select을 저장해주는 메서드
		while(rs.next()) {
			System.out.printf("%-10s",rs.getString("name"));
			System.out.printf("%-10d",rs.getInt("height"));
			System.out.printf("%-10d\n",rs.getInt("weight"));
		}

		//drop
		sql = "drop table dongtb";
		PreparedStatement ps4 = conn.prepareStatement(sql);
		int drop = ps4.executeUpdate();
		System.out.println("drop 성공");
	}
}
