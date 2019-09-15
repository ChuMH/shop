package com.haina.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * 用来获取Connection的工具类，工具类很多方法是静态方法
 * Collections
 */
public class ConnectionManager {
	private static final String DRIVERNAME = "com.mysql.jdbc.Driver";
	private static final String URL="jdbc:mysql://127.0.0.1:3306/webshop";
	private static final String DBUSERNAME = "root";
	private static final String DBPASSWORD = "";
	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName(DRIVERNAME);
			conn = DriverManager.getConnection(URL,DBUSERNAME , DBPASSWORD);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	public static void closeConn(Connection conn) {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
