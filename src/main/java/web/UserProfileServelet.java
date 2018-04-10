package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import domian.User;
import repositories.MyApplicationUsersRepository;
import repositories.IUserRepository;

@WebServlet("/userProfile")
public class UserProfileServelet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		IUserRepository repository = new MyApplicationUsersRepository();
		User user = (User) session.getAttribute("username");
		
		PrintWriter out = response.getWriter();
		
		out.println("|Username\t|Password\t|Email\t\t\t\t|Right|");
		out.println("|" + user.getUsername() + "\t\t|" + user.getPassword() + "\t\t|" + repository.getUserEmail(user)
			+"\t|" + repository.getUserRights(user) + "|");
	}
	

}