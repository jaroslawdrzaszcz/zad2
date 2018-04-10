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

@WebServlet("/allUsers")
public class AllUsersServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		IUserRepository repository = new MyApplicationUsersRepository();
		List<User> users = repository.getAllUsers();
		PrintWriter out = response.getWriter();
		
		out.println("|Username \t|User right \t|");
		for (User u : users) {
			out.println("|" + u.getUsername() +"\t\t|"+ u.getRight() + "\t|");
		}
	}

}
