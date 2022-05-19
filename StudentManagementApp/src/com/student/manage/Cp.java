 package com.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;

public class Cp {
static Connection con;
public static Connection createC(){	
 try {
	 //Load Driver Class...
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 //Create the connection...
	 String user="root";
	 String password="rootrit";
	 String url ="jdbc:mysql://localhost:3306/student_manage";
//dbc:mysql:///ritesh106
	  con=DriverManager.getConnection(url,user,password);
	 
 }catch(Exception e){
	 e.printStackTrace();
 }
 
return con;
}
}
