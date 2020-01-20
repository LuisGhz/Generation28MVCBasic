package como.exercise28mvcbasic.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Indico el MIME type del objeto response
		response.setContentType("text/html");
		
		/*Asigno la salida del objeto response al objeto output
		 * con el objetivo de reducir la cantidad de código a escribir
		 */
		PrintWriter output = response.getWriter();
		
		//Obtengo los parametros
		String username = request.getParameter("txtUsuario");
		String password = request.getParameter("txtPass");
		
		output.append("<html>");
		output.append("<head>");
		output.append("<title>");
		output.append("Data input by the user");
		output.append("</title>");
		output.append("</head>");
		output.append("<body>");
		output.append("<p>");
		output.append("User: " + username);
		output.append("</p>");
		output.append("<p>");
		output.append("Passwod: " + password);
		output.append("</p>");
		output.append("</body>");
		output.append("</html>");
		
		//Cierro la escritura al objeto response
		output.close();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Indico el MIME type del objeto response
		response.setContentType("application/json");
		
		/*Asigno la salida del objeto response al objeto output
		 * con el objetivo de reducir la cantidad de código a escribir
		 */
		PrintWriter output = response.getWriter();
		
		//Obtengo los parametros
		String username = request.getParameter("txtUsuario");
		String password = request.getParameter("txtPass");
		
		output.append("{");
		output.append("\"Username\": \"" + username +"\",");
		output.append("\"Password\": \"" + password +"\"");
		output.append("}");
		
		//Cierro la escritura al objeto response
		output.close();
	}
}
