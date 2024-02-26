package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

public class DBConnector {
	private static Set<DBSession> sessions = new HashSet<>();
	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		for(int i = 0; i < 10; ++i ) {
			sessions.add(new DBSession());
		}
	}
	
	public static DBSession getConnection() throws SQLException{
		while (true) {
			for(DBSession session : sessions) {
				if(!session.using) {
					session.using = true; // 해당 DB세션을 사용중으로 변경
					return session;
				}
			}
		}
	}
	
}