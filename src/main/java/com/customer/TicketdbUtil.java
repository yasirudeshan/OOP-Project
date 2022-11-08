package com.customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TicketdbUtil{
	
	
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

	

	public List<Ticket> getinfo(String pid){
		
		ArrayList<Ticket> ticket1 =new ArrayList<>();
	
		//create database connection
		String url = "jdbc:mysql://localhost:3306/hotel";
		String user = "root";
		String password = "password";
	
		//validate
		try {
			Class.forName("com.mysql.jdbc.Driver");
		
			Connection con = DriverManager.getConnection(url, user, password);
			Statement stmt = con.createStatement();
		
			String sql = "SELECT * FROM hotel.addticket WHERE studentID = '"+pid+"'";
		
			ResultSet rs = stmt.executeQuery(sql);
		
	
			while(rs.next()) {
				String ticketNo = rs.getString(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				String id = rs.getString(4);
				String contact = rs.getString(5);
				String subject = rs.getString(6);
				String description = rs.getString(7);
			
				Ticket t1 = new Ticket(ticketNo ,name, email, id, contact, subject, description);
			
				ticket1.add(t1);
			
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return ticket1;
	}
	

	public boolean updateTicket(String ticketNo, String name, String email, String id, String contact, String subject , String description) {
	
		boolean isSuccess = false;
	
		//create database connection
		String url = "jdbc:mysql://localhost:3306/hotel";
		String user = "root";
		String password = "password";
	

		try {
			Class.forName("com.mysql.jdbc.Driver");
		
			Connection con = DriverManager.getConnection(url, user, password);
			Statement stmt = con.createStatement();
		
			String sql = "UPDATE hotel.addticket SET name = '"+name+"', email = '"+email+"', studentID = '"+id+"', contactNo = '"+contact+"', subject = '"+subject+"', description = '"+description+"' WHERE ticketNo = '"+ticketNo+"' ";
		
			int rs = stmt.executeUpdate(sql);
		
			if(rs > 0)
				isSuccess = true;
			else
				isSuccess = false;
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
	
		return isSuccess;
	}

	
	
	public boolean deleteTicket(String ticketNo) {
	
		boolean isSuccess = false;
		
		String url = "jdbc:mysql://localhost:3306/hotel";
		String user = "root";
		String password = "password";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url, user, password);
			Statement stmt = con.createStatement();
			
			String sql = "DELETE FROM hotel.addticket WHERE ticketNo = '"+ticketNo+"'";
			int rs = stmt.executeUpdate(sql); //if connect return 1. if not return 0;
			
			//Data Successfully Deleted?
			if(rs > 0) 
				isSuccess = true;
			else
				isSuccess = false;
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}

		return isSuccess;
	}
} // end of class