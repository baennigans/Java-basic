package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import kr.ac.kopo.util.JDBCClose;

public class InsertMain02 {

	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		
		
		try {
			// 1. 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2. 데이터 연결 후 연결객체 얻어오기
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";
			
			conn = DriverManager.getConnection(url,user,password);
			
			
			// 3. 쿼리 생성
			Scanner sc = new Scanner(System.in);
			
			System.out.print("삽입할 아이디를 입력 : ");
			String id = sc.nextLine();
			
			System.out.print("삽입할 이름을 입력 : ");
			String name = sc.nextLine();
			
			String sql = "insert into t_test(id,name)";
			       sql+= "values(\'" + id + " \', \'" + name + "\')";
			
			stmt = conn.createStatement();
			
			// 4. 실행 결과 얻어오기
			int cnt = stmt.executeUpdate(sql);
			System.out.println("총 "+cnt+"개 행 삽입..");
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			// 5단계
			JDBCClose.close(stmt, conn);
		}
	}
}
