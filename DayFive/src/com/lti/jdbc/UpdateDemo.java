package com.lti.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class UpdateDemo {

	public static void main(String[] args) throws ClassNotFoundException,SQLException
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the dept no");
		int dno=s.nextInt();
		System.out.println("Enter the dept name to update");
		String dname=s.next();
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","LTI1","hr");
		String str="update dept1 set dname=? where dno=?";
		PreparedStatement pst= con.prepareStatement(str);
		pst.setString(1, dname);
		pst.setInt(2,dno);
		int i= pst.executeUpdate();
		if(i!=0)
		{
			System.out.println("Updated successfully");
			String str1= "Select * from dept1";
			Statement st1= con.createStatement();
			ResultSet rs= st1.executeQuery(str1);
			System.out.println("Deptno\tDeptname");
			while (rs.next())
			{
				System.out.print(rs.getInt(1)+"\t");
				System.out.print(rs.getString(2));
				System.out.println();
			}
		}
	}

}
