package com.customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CustomerDBUtil {
	public List<Customer> validate(String userName, String pwd){
		ArrayList<Customer> cus = new ArrayList<>();
		
		//create database connection
		String url = "jdbc:mysql://localhost:3306/hotel";
		String user = "root";
		String password = "password";
		
		//validate
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url, user, password);
			Statement stmt = con.createStatement();
			
			String sql = "SELECT * FROM customer WHERE username = '"+userName+"' AND password = '"+pwd+"'";
			
			ResultSet rs = stmt.executeQuery(sql);
			
		
			if(rs.next()) {
				String id = rs.getString(1);
				String name = rs.getString(1);
				String email = rs.getString(2);
				String phone = rs.getString(3);
				String username = rs.getString(4);
				String pass = rs.getString(5);
				
				Customer c1 = new Customer(id, name, email, phone, username, pass);
				
				cus.add(c1);
				
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return cus;
	}
	
	public boolean addticket(String name, String email, String id, String contact, String subject, String description){
		
		boolean isSuccess = false;
		
		//create database connection
				String url = "jdbc:mysql://localhost:3306/hotel";
				String user = "root";
				String password = "password";
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					
					Connection con = DriverManager.getConnection(url, user, password);
					Statement stmt = con.createStatement();
					
					String sql = "INSERT INTO hotel.addticket VALUES(0, '"+name+"', '"+email+"','"+id+"','"+contact+"','"+subject+"','"+description+"')";
					int rs = stmt.executeUpdate(sql); //if connect return 1. if not return 0;
					
					//Data Successfully Inserted?
					if(rs > 0) 
						isSuccess = true;
					else
						isSuccess = false;
					
					
					
				}catch(Exception e) {
					e.printStackTrace();
				}
		
		return isSuccess;
	}
}
