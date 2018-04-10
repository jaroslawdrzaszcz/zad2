package web.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import domian.User;
import repositories.MyApplicationUsersRepository;

@WebFilter({"login.jsp", "registration.jsp"})
public class RegistrationLoginFilter implements Filter {
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
			HttpServletRequest httpRequest = (HttpServletRequest) request;
			HttpSession session = httpRequest.getSession();
			
			if (session.getAttribute("username")!= null) {
				User user = (User) session.getAttribute("username");
				MyApplicationUsersRepository repository = new MyApplicationUsersRepository();
				String right = repository.getUserRights(user);
						
				if ( right.equals("regular") || right.equals("premium") || right.equals("administrator") ) {
					response.getWriter().print("You are alredy logged.");
					HttpServletResponse httpResponse = (HttpServletResponse) response;
					httpResponse.sendRedirect("/userProfile");
				}
			}
			
			chain.doFilter(request, response);
		}
		
		@Override
		public void destroy() {
		}
		
		@Override
		public void init(FilterConfig arg0) throws ServletException {
		}

}
