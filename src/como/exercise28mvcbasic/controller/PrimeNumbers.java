package como.exercise28mvcbasic.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/PrimeNumbers")
public class PrimeNumbers extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int number = Integer.parseInt(request.getParameter("txtNumber"));
		boolean isPrime = true;
		
		for (int i = 2; i < number; i++)
		{
			if (number % i == 0)
				isPrime = false;
		}
		
		if (!isPrime)
			response.getWriter().append("The number " + number + " is not prime");
		else
			response.getWriter().append("The number " + number + " is prime");
	}

}
