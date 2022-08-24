package ApplicationConnection;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

import Dao.User;
import Dao.UserEmpl;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;


	public class SampleController implements Initializable{
		Connection conn = Connect.getconnect();
		Statement st;
		
		
		private Label label;
		@FXML
		private TextField tfID;
		@FXML
		private TextField tfName;
		@FXML
		private TextField tfAdress;
		@FXML
		private TextField tfEmail;
		@FXML
		private TextField tfCity;
		@FXML
		private TextField tfCountry;
		
		
		@FXML
		private TableView<User> tv;
		
		@FXML
		private TableColumn<User,Integer> colID;
		@FXML
		private TableColumn<User,String> colName;
		@FXML
		private TableColumn <User,String>colAdress;
		@FXML
		private TableColumn <User,String>colEmail;
		@FXML
		private TableColumn <User,String>colCity;
		@FXML
		private TableColumn <User,String>colCountry;
		@FXML
		private Button btnInsert;
		@FXML
		private Button btnUpdate;
		@FXML
		private Button btnDelete;
		
		UserEmpl fct = new UserEmpl();
		@FXML
	    void handleButtonnAction(ActionEvent event) {
			if(event.getSource() == btnInsert) {
				fct.Create (tfID.getText(),tfName.getText(),tfAdress.getText(),tfEmail.getText(),tfCity.getText(),tfCountry.getText());
				showuser();}
	        
		   else if (event.getSource() == btnUpdate) {
			   fct.Update (tfID.getText(),tfName.getText(),tfAdress.getText(),tfEmail.getText(),tfCity.getText(),tfCountry.getText());
				showuser();}
	        
	        else if(event.getSource() == btnDelete) {
	        	fct.Delete (tfID.getText());
				showuser();
			}

	    }
		
	

		@Override
		 public void initialize(URL arg0, ResourceBundle arg1) {
	        showuser();
	    }

		
		public void showuser() {
			ObservableList<User> list =  fct.UserList();
			
			colID.setCellValueFactory(new PropertyValueFactory<User,Integer>("ID"));
			colName.setCellValueFactory(new PropertyValueFactory<User,String>("Name"));
			colAdress.setCellValueFactory(new PropertyValueFactory<User,String>("Adress"));
			colEmail.setCellValueFactory(new PropertyValueFactory<User,String>("Email"));
			colCity.setCellValueFactory(new PropertyValueFactory<User,String>("City"));
			colCountry.setCellValueFactory(new PropertyValueFactory<User,String>("Country"));
			tv.setItems(list);
		}
//
		    }
		    
	
	
			