package main;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection 
{
	private static String serverName = "remotemysql.com";
	private static String serverPort = "3306";
	private static String databaseName = "MPt5ncFIEM";
	private static String driver = "com.mysql.cj.jdbc.Driver";
	private static String user = "MPt5ncFIEM";
	private static String password = "k9paBSfrr2";
	private static boolean isTimeZoneUsed = false;
	
	private DBConnection() {}
	
	public static Connection getConnection() throws Exception
	{
		try 
		{
			StringBuilder sb = new StringBuilder("jdbc:mysql://");
			sb.append(serverName);
			sb.append(":");
			sb.append(serverPort);
			sb.append("/");
			sb.append(databaseName);
			if(isTimeZoneUsed == false)
				sb.append("?useTimezone=true&serverTimezone=UTC");
			String url = sb.toString();	
			
			Class.forName(driver);
			
			Connection conn = DriverManager.getConnection(url, user, password);
			System.out.println("Database connected");
			
			return conn;
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
		
		return null;
	}


	public static String getServerName() {
		return serverName;
	}


	public static void setServerName(String serverName) {
		DBConnection.serverName = serverName;
	}


	public static String getServerPort() {
		return serverPort;
	}


	public static void setServerPort(String serverPort) {
		DBConnection.serverPort = serverPort;
	}


	public static String getDriver() {
		return driver;
	}


	public static void setDriver(String driver) {
		DBConnection.driver = driver;
	}


	public static String getDatabaseName() {
		return databaseName;
	}


	public static void setDatabaseName(String databaseName) {
		DBConnection.databaseName = databaseName;
	}


	public static String getUser() {
		return user;
	}


	public static void setUser(String user) {
		DBConnection.user = user;
	}


	public static String getPassword() {
		return password;
	}


	public static void setPassword(String password) {
		DBConnection.password = password;
	}


	public static boolean isTimeZoneUsed() {
		return isTimeZoneUsed;
	}


	public static void setTimeZoneUsed(boolean isTimeZoneUsed) {
		DBConnection.isTimeZoneUsed = isTimeZoneUsed;
	}	
}
