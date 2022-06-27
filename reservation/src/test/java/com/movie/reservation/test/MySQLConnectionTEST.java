package com.movie.reservation.test;


import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.jupiter.api.Test;

public class MySQLConnectionTEST {

	
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/test?serverTimezone=UTC&allowPublicKeyRetrieval=true&useSSL=false";
	private static final String USER = "root";
	private static final String PASSWORD = "!#@Ty1096129";
	
	@Test
	public void testConnection() throws Exception {
		Class.forName(DRIVER);
		
		try {
			System.out.println("######################### JDBC SUCCESS ############################");
			Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println(connection);
			System.out.println("###################################################################");
		} catch (Exception e) {
			System.out.println("########################## JDBC ERROR #################################");
			System.out.println(e.getMessage());
			System.out.println("#######################################################################");
		}
	}
}
