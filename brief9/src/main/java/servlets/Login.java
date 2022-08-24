package servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Tasks;
import models.UserLogin;
import models.Users;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import configuration.DBconnection;
import daoImplementation.DaoImplementation;

public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


    public Login() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		this.getServletContext().getRequestDispatcher("/WEB-INF/jsps/login.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("loginUser");
		String password = request.getParameter("loginPass");
		
		Users user = new Users();
		user.setUsername(username);
		user.setPassword(password);
		
		DaoImplementation login = new DaoImplementation();
		
		boolean loginResult = login.getUser(user);
		
		if(loginResult) {
			response.sendRedirect("list");
		}else {
			this.getServletContext().getRequestDispatcher("/WEB-INF/jsps/login.jsp").forward(request, response);
			String message = request.getParameter("message");
			//PrintWriter out = response.getWriter();
			//out.println("Information incorrect!!");
		}
	}


}
