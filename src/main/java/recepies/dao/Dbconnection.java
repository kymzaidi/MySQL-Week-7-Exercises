/**
 * 
 */
package recepies.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import recepies.exception.*;

/**
 * @author aliza
 *
 */
public class Dbconnection {

	private static final String SCHEMA = "recepies";
	private static final String USER = "recepies";
	private static final String PASSWORD = "recepies";
	private static final String HOST = "localhost";
	private static final int PORT = 3306;
	
	public static Connection getConnection() {
		String url = String.format("jdbc:mysql://%s:%d/%s?user=%s&password=%s&useSSL=false", HOST, PORT, SCHEMA, USER, PASSWORD);
	
	System.out.println("Connecting with url = " + url);
	
	try {
		Connection conn = DriverManager.getConnection(url);
		System.out.println("Successfully obtained connecton!");
		return conn;
	} catch (SQLException e) {
		System.out.println("Error getting connection.");
		throw new Dbexception(e);
		
	}
	
	}
}
