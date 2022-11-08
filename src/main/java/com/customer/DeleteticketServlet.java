package com.customer;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/y_delete")

public class DeleteticketServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String ticketNo = request.getParameter("tid");
	
		
		boolean isTrue;
		
		TicketdbUtil ticket4 = new TicketdbUtil();
		
		isTrue = ticket4.deleteTicket(ticketNo);
		
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("userticket.jsp");
			dis.forward(request, response);
		} else {
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
		}

		
		
	}

}
