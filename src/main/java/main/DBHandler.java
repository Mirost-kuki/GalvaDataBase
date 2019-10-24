package main;

import java.sql.*;

public class DBHandler 
{
	private Connection conn = null;
	private Statement stmt = null;
	
	public DBHandler()
	{
		this.Connect();
	}
	
	public void Connect()
	{
		try 
		{
			conn = DBConnection.getConnection();
			stmt = conn.createStatement();
			
		} catch (Exception e) {
			conn = null;
			stmt = null;
			System.out.println(e);
		}
	}
	
	public Object[][] readTable(String tableName)
	{
		
		return new Object[1][1];
	}
}
