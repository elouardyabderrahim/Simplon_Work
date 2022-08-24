package com.inscreption.model.dao.impl;




//import java.sql.D ate;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.inscreption.domain.Etudiant;
import com.inscreption.model.DB.DB;
import com.inscreption.model.dao.DAO;
import com.inscreption.model.dao.DAOq;


public class UserDao implements DAO<Etudiant> {

	public Etudiant find(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Etudiant create(Etudiant obj) {
	
		
		
		try {
		String sql ="INSERT INTO Etudiant (nom,prenom,email,adress,ville,pays) VALUES (?,?, ?, ?, ?,?)";
		PreparedStatement ps= connect.prepareStatement(sql);

		connect.setAutoCommit(false);
		
		ps.setString(1, obj.getNom());
		ps.setString(2, obj.getPrenom());
		ps.setString(3, obj.getEmail()); 
		ps.setString(4, obj.getAdress());
		ps.setString(5, obj.getVille());
		ps.setString(6, obj.getPays());
		ps.execute();
		
		connect.commit();
		ps.close();
		connect.close();
		
		return obj;
		
	}catch ( SQLException e) {
		//e.printStackTrace();
		System.out.println(e.getMessage());
		return null;
	}

	    }
	
//nom prenom email adress ville pays
	public Etudiant update(Etudiant obj) {
		 try{    
		      String sql = "UPDATE etudiant SET nom='"+obj.getNom()+"',prenom='"+obj.getPrenom()+"', email ='"+obj.getEmail()+"',adress='"+obj.getEmail()+"',ville='"+obj.getVille()+"',pays='"+obj.getPays()+"' WHERE email='"+obj.getEmail()+"' ";
		      PreparedStatement stmt = connect.prepareStatement(sql);
//		      stmt.setString(1,obj.getNom());
//		      stmt.setString(2,obj.getPrenom());
//		      stmt.setString(3,obj.getEmail());
//		      stmt.setString(4,obj.getAdress());
//		      stmt.setString(5,obj.getVille());
//		      stmt.setString(6,obj.getPays());
////		      stmt.setInt(7, 4);
		      System.out.println("Mise à jour...");
		      stmt.execute();   
		      connect.close();
		      
//		      obj = this.find(obj.getId());
		      
		      
	            
	        } catch (SQLException e) {
	                e.printStackTrace();
	        }
		 return obj;
	        
	}

	public void delete(Etudiant obj) {
		try {
		            
		            this.connect    
		                .createStatement(
		                    ResultSet.TYPE_SCROLL_INSENSITIVE, 
		                    ResultSet.CONCUR_UPDATABLE
		                 ).executeUpdate(
		                    "DELETE FROM etudiant WHERE email='"+obj.getEmail()+"' " 
		                 );
		
		        } catch (SQLException e) {
		                e.printStackTrace();
		        }
		    }
		
	
	
	

}