import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import repositories.MyApplicationUsersRepository;
import web.LoginAplicationServelet;

@RunWith(MockitoJUnitRunner.class)
public class TestLoginAplicationServelet extends Mockito{
	
	@Spy
	MyApplicationUsersRepository repository = mock(MyApplicationUsersRepository.class);
	
	@InjectMocks
	LoginAplicationServelet servlet;
	
	@Test
	public void servelet_should_properly_redirect_user() throws IOException, ServletException {
		HttpServletRequest request = mock(HttpServletRequest.class);
		HttpServletResponse response = mock(HttpServletResponse.class);
		HttpSession session = mock(HttpSession.class);
		when(request.getSession()).thenReturn(session);
		servlet.doPost(request, response);
		verify(response).sendRedirect("/userProfile");	
	}
	
}