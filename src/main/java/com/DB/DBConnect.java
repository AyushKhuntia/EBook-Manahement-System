package com.DB;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {

    private static Connection con;

    public static Connection getConn() {
    	try {
			Class.forName("oracle.jdbc.OracleDriver");
			con =DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/orclpdb","system","ayush");
			System.out.println("Sucessfully Connected");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return con;

    }

}
