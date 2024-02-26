package dao;


import java.io.Closeable;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBSession implements Closeable{
	Connection conn;
	boolean using = false;

	public DBSession() {
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "1234");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	public PreparedStatement prepareStatement(String sql) throws SQLException{
		return conn.prepareStatement(sql);
	}

	@Override
	public void close() throws IOException {
		using = false;
		
	}
}

