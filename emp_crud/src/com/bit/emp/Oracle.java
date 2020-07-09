package com.bit.emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Oracle {
	/*
	 *  디자인패턴
	 *  - 싱글톤 패턴
	 * 
	 */
	private static Connection conn; // 필드의 직접 접근을 막음(private)
	
	private Oracle() {
		// 타 클래스에서 객체를 생성하지 못하도록 default 생성자를 private로 설정
	}
	
	public static Connection getConnection(){
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String password="tiger";
		try { // 객체의 생성 코드
			if(conn==null || conn.isClosed()){
				Class.forName(driver);
				conn=DriverManager.getConnection(url, user, password);
				//null, 닫혀있을때 새로 만듬
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return conn;
		// 커넥션을 요청했을때 null이 아니거나 열려있으면 새로 만들지 않고 기존 것을 전달
	}

//	public static void main(String[] args) {
//		Oracle me = new Oracle();
//		System.out.println(Oracle.getConnection()!=null);
//	}
	// 위 코드들이 잘 돌아가는지 테스트 용으로 만든 메인

}
