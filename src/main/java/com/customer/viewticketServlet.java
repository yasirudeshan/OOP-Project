package com.customer;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/y_view")

public class viewticketServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		
		
		TicketdbUtil ticket3 = new TicketdbUtil();
		
		//ticket3.getinfo(id);
		
		try {
			List<Ticket> getTicket = ticket3.getinfo(id);
			request.setAttribute("getTicket", getTicket);
			
			RequestDispatcher dis = request.getRequestDispatcher("userticket.jsp"); 
			dis.forward(request, response);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	}


