package web;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import domian.User;
import repositories.MyApplicationUsersRepository;
import repositories.IUserRepository;

@WebServlet("/login")
public class LoginAplicationServelet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		IUserRepository repository = new MyApplicationUsersRepository();
		
		User user = retrieveUserFromRequest(request, response);
		
		if(repository.logged(user)){
			session.setAttribute("username", user);
			response.sendRedirect("/userProfile");	
		}
		else response.sendRedirect("badGateway.jsp");
	}

	private User retrieveUserFromRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
		User result = new User();
		result.setUsername(request.getParameter("username"));
		result.setPassword(request.getParameter("password"));
		return result;
	}


}
