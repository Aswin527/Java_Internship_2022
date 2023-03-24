package com.demo.jdbc_con;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.xdevapi.PreparableStatement;

public class JBDC_Connection {
	
	public static void main(String[] args) {
		try {
			
			Class.forName("com.mysql.jdbc.Driver");//Loading JDBC Driver
			
			//Define Connection URL
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/test_db", "root", "Java@2352");
			PreparedStatement stmt=null;
			
			//Creating the Table
			stmt=con.prepareStatement("create table student (student_id int NOT NULL AUTO_INCREMENT,student_name varchar(200),student_place varchar(200),course varchar(200),contact_num varchar(100),PRIMARY KEY(student_id))");
			stmt.executeUpdate();
			
			//Inserting Data into Table
			String insert_data="insert into student (student_name,student_place,course,contact_num) values ('Aswin','Bangalore','Java Full Statck','9400790204');";
			stmt=con.prepareStatement(insert_data);
			stmt.executeUpdate();
			
			//Selecting and displaying all data from table
			stmt=con.prepareStatement("select student_name,student_place,course,contact_num from student");
			ResultSet rs=stmt.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getString(4));
			}
			
			//Update data in the table
			stmt=con.prepareStatement("update student set student_place='Kannur' where student_name='Aswin'");
			stmt.executeUpdate();
			
			stmt=con.prepareStatement("select student_name,student_place,course,contact_num from student");
			ResultSet rs2=stmt.executeQuery();
			System.out.println("\nValues after Updation:-");
			while(rs2.next()) {
				System.out.println(rs2.getString(1));
				System.out.println(rs2.getString(2));
				System.out.println(rs2.getString(3));
				System.out.println(rs2.getString(4));
			}
			
			//Drop Table
			stmt=con.prepareStatement("drop table student");
			stmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
