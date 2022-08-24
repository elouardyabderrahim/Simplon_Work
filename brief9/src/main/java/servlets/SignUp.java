package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Users;

import java.io.IOException;
import java.io.PrintWriter;

import daoImplementation.DaoImplementation;


public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public SignUp() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/jsps/signUp.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		Users user = new Users();
		user.setFirstname(firstname);
		user.setLastname(lastname);
		user.setUsername(username);
		user.setPassword(password);
		DaoImplementation signup = new DaoImplementation();
		if(signup.signUpUser(user)) {
			this.getServletContext().getRequestDispatcher("/WEB-INF/jsps/login.jsp").forward(request, response);
		}else {
			PrintWriter out = response.getWriter();
			out.println("Username not valid");
		}
		
	}

}
