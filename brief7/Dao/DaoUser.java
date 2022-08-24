package Dao;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;

public interface DaoUser {
	public ObservableList<User> UserList();
	public void Create(String ID,String Name,String Adress,String Email,String City,String Country);
	public void Update(String ID,String Name,String Adress,String Email,String City,String Country);
	public void Delete(String ID);
	
//	ObservableList<User> UsersList();

}
