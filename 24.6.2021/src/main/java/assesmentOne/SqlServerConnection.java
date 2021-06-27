package assesmentOne;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

abstract public class SqlServerConnection {

	 private static Connection connection;
	static {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			connection = DriverManager.getConnection("jdbc:sqlserver://den1.mssql8.gear.host;databaseName=sampletestdata99",
					"sampletestdata99","@Naveen99");
			
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	  }

	   public static Connection getConnection() {
		   return connection;
	   }
	}