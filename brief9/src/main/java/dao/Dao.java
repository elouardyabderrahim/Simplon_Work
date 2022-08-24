package dao;

import java.util.List;

import models.Tasks;
import models.Users;

public interface Dao {

	public boolean getUser(Users user);

	public boolean signUpUser(Users user);

	public List<Tasks> listTasks();
	
	public Tasks selectTask(int id);

	public void create(Tasks task);

	public void update(Tasks task);

	public void delete(int id);
}
/*public interface Dao {
	public boolean getUser(Users user);
	public boolean signUpUser(Users user);
	/////////////////////////////////////////////////////////////////////////::::::::::::::::::::::::::: /////////////////////////////////////////////////////////////////////////////
	public void insertTask(Tasks Task);
	public boolean updateTask(Tasks task);
	public Tasks selectTask(int id);
	public List<Tasks> selectallTasks();
	public boolean deleteTask(int id);
	
}*/
