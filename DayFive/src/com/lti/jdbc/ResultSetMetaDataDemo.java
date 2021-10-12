package com.lti.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class ResultSetMetaDataDemo
{

	public static void main(String[] args) throws ClassNotFoundException,SQLException
	{
		Scanner s = new Scanner(System.in);
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","LTI1","hr");
		System.out.println("Delete before delete operation.");
		String str1= "Select * from dept1";
		Statement st1=con.createStatement();
		ResultSet rs= st1.executeQuery(str1);
		System.out.println("Deptno\tDeptname");
		while (rs.next())
		{
			System.out.print(rs.getInt(1)+"\t");
			System.out.print(rs.getString(2));
			System.out.println();
		}
		ResultSetMetaData rsmd=rs.getMetaData();
		int i= rsmd.getColumnCount();
		System.out.println(i);
		System.out.println("Display size: "+rsmd.getColumnDisplaySize(1));
		System.out.println("Column Name "+rsmd.getColumnClassName(1));
		for(int j=1;j<=rsmd.getColumnCount();j++)
		{
			System.out.println("Datatype: "+rsmd.getColumnTypeName(j));
			System.out.println("column Name: "+rsmd.getColumnName(j));
		}
	}

}
