package como.exercise28mvcbasic.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AdditionTwoNumbersServlet")
public class AdditionTwoNumbersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int number1 = Integer.parseInt(request.getParameter("txtNumber1"));
		int number2 = Integer.parseInt(request.getParameter("txtNumber2"));
		int result = number1 + number2;
		
		response.getWriter().append("The result is " + result);
	}

}
