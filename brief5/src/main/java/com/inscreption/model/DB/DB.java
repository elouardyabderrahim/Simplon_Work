
package com.inscreption.model.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.inscreption.domain.Etudiant;

public class DB {
	
	   /*
     * URL de connexion
     */
    private static String url = "jdbc:postgresql://localhost:5432/test1";
    /*
     * Nom du user
     */
    private static String user = "postgres";
    /*
     * Mot de passe du user
     */
    private static String passwod = "abderrahimelouardy1997";
    /*
     * Objet Connexion
     */
    private static Connection connect;
    
    /*
     * Méthode qui va nous retourner notre instance
     * et la créer si elle n'existe pas...
     * @return
     */
    public static Connection getInstance(){
        if(connect == null){
            try {
                connect = DriverManager.getConnection(url, user, passwod);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }        
        return connect;    
    } 
		
		
		
		
		
		
	}