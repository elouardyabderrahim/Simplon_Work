package servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Tasks;
import models.UserLogin;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import daoImplementation.DaoImplementation;

@WebServlet("/")
public class Space extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    DaoImplementation dao = new DaoImplementation();
	
    public Space() {
        super();
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getServletPath();
		
     System.out.println(action); 
     
		try {
			switch (action) {
			case "/new":
				showNewForm(request, response);
				break;
			case "/insert":
				insertTask(request, response);
				break;
			case "/delete":
				deleteTask(request, response);
				break;
			case "/edit":
				showEditForm(request, response);
				break;
			case "/update":
				updateTask(request, response);
				break;
			case "/list":
				listTask(request, response);
				break;
			default:
				RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsps/space.jsp");
				dispatcher.forward(request, response);
				break;
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		
		
	}
	
	private void listTask(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
		List<Tasks> listTasks = dao.listTasks();
		request.setAttribute("listTasks", listTasks);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsps/space.jsp");
		dispatcher.forward(request, response);
	}

	private void showNewForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsps/actions.jsp");
		dispatcher.forward(request, response);
	}
	 
	private void showEditForm(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		UserLogin.setId(id);
		//System.out.println(id);
		Tasks existingTask = dao.selectTask(id);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsps/actions.jsp");
		request.setAttribute("task", existingTask);
		dispatcher.forward(request, response);

	}
	
	private void insertTask(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		String title = request.getParameter("title");
		String description = request.getParameter("description");
		String status = request.getParameter("status");
		String deadline = request.getParameter("deadline");
		String categorie = request.getParameter("categorie");
		
		Tasks newTask = new Tasks(title, description, status,deadline,categorie);
		dao.create(newTask);
		response.sendRedirect("list");
	}
	
	private void updateTask(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
	
		String title = request.getParameter("title");
		String description = request.getParameter("description");
		String status = request.getParameter("status");
		String deadline = request.getParameter("deadline");
		String categorie = request.getParameter("categorie");

		Tasks oldTask = new Tasks(UserLogin.getId(),title, description, status,deadline,categorie);
		dao.update(oldTask);
		response.sendRedirect("list");
	}
	
	private void deleteTask(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		dao.delete(id);
		response.sendRedirect("list");

	}

}
/*@WebServlet("/")
public class TasksServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Dao Dao;

	

	

	public void init() {
		Dao = new DaoImplementation();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();

		try {
			switch (action) {
			case "/new":
				showNewForm(request, response);
				break;
			case "/insert":
				insertTask(request, response);
				break;
			case "/delete":
				deleteTask(request, response);
				break;
			case "/edit":
				showEditForm(request, response);
				break;
			case "/update":
				updateTask(request, response);
				break;
			case "/list":
				listTask(request, response);
				break;
			default:
				RequestDispatcher dispatcher=request.getRequestDispatcher("WEB-INF/login.jsp");
				dispatcher.forward(request, response);
				break;
			}
			
		} catch (SQLException ex) {
			throw new ServletException(ex);
		}
	}

	private void listTask(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		List<models.Tasks> task = Dao.selectallTasks();
		request.setAttribute("listTasks", task);
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/task-list.jsp");
		dispatcher.forward(request, response);
	}

	private void showNewForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/task-form.jsp");
		dispatcher.forward(request, response);
	}

	private void showEditForm(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		models.Tasks existingTask = Dao.selectTask(id);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/task-form.jsp");
		request.setAttribute("task", existingTask);
		dispatcher.forward(request, response);

	}

	private void insertTask(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		String title = request.getParameter("title");
		String description = request.getParameter("description");
		String status = request.getParameter("status");
		String deadline = request.getParameter("deadline");
		String categorie = request.getParameter("categorie");
		
		Tasks task = new Tasks(title,description,status,deadline,categorie);
		Dao.insertTask(task);
		response.sendRedirect("list");
	}

	private void updateTask(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String title = request.getParameter("title");
		String description = request.getParameter("description");
		String status = request.getParameter("status");
		String deadline = request.getParameter("deadline");
		String categorie = request.getParameter("categorie");
		

		Tasks task = new Tasks(id, title, description,status,deadline,categorie);
		Dao.update(task);
		response.sendRedirect("list");
	}

	private void deleteTask(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		Dao .deleteTask(id);
		response.sendRedirect("list");

	}

}*/