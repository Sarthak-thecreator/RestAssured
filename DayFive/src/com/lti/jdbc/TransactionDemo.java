package com.lti.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class TransactionDemo {

	public static void main(String[] args) throws ClassNotFoundException,SQLException
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","LTI1","hr");
		con.setAutoCommit(false);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the dept no");
		int dno=sc.nextInt();
		String str= "delete from dept1 where dno=?";
		PreparedStatement pst= con.prepareStatement(str);
		pst.setInt(2,dno);
		pst.executeUpdate();
		System.out.println("Are you sure you want to delete(y/n)");
		String choice=sc.next();
		if(choice.equalsIgnoreCase("y"))
		{
			con.commit();
			System.out.println("Deleted successfully");
		}
		else
		{
			con.rollback();
			System.out.println("Data restored");
		}
	}

}
