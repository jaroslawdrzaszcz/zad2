package web;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import domian.Right;
import domian.User;
import repositories.MyApplicationUsersRepository;
import repositories.IUserRepository;

@WebServlet("/registration")
public class RegistrationAplicationServelet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		User user = retrieveYourPageFromRequest(request, response);
		IUserRepository repository = new MyApplicationUsersRepository();
		
		repository.add(user);
		response.sendRedirect("login.jsp");
	}

	private User retrieveYourPageFromRequest(HttpServletRequest request, HttpServletResponse response) throws IOException{
		if(!request.getParameter("password").equals(request.getParameter("password2"))){
			response.sendRedirect("badGateway.jsp");
		return null;
		}
		else{
		User result = new User();
		result.setUsername(request.getParameter("username"));
		result.setEmail(request.getParameter("email"));
		result.setPassword(request.getParameter("pssword"));
		result.setRight(Right.regular);
		return result;
		}
	
	}


}
