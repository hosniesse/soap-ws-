package connectionMysql;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionMysql {
	
	public static Connection mysqlconnect() {
		Connection con=null;
		try {
			String url="jdbc:mysql:3306/BOOKS";
					Class.forName("com.mysql.jdbc.Driver").newInstance();
					con=DriverManager.getConnection(url,"root","");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return con;
	}

}
