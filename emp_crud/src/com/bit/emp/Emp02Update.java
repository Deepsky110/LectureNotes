package com.bit.emp;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class Emp02Update {

	public int update(int sabun, String name, int pay){
		String sql = "{call emp02update(?,'"+name+"',"+pay+","+sabun+")}";
		Connection conn = null;
		CallableStatement cstmt = null;
		try {
			cstmt = Oracle.getConnection().prepareCall(sql);
			cstmt.registerOutParameter(1, oracle.jdbc.OracleTypes.INTEGER);
			cstmt.execute();
			return cstmt.getInt(1);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(cstmt!=null)cstmt.close();
				if(Oracle.getConnection()!=null)Oracle.getConnection().close(); // 싱글턴 패턴이라 가능
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return 0; // 정상 실행되면 try의 return이 나옴, 실패하면 0
		
	}
	
	
	public static void main(String[] args) {

	}

}
