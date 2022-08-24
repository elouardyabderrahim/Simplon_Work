package com.inscreption.model.dao;

//public interface DAO {package com.inscreption.model.dao;

import java.sql.Connection;
import java.util.List;

import com.inscreption.model.DB.DB;
 
//public abstract class DAO<T> {
public  interface DAO<T>{
    public Connection connect = DB.getInstance();
    
    /*
     * Permet de récupérer un objet via son ID
     * @param id
     * @return      
     */
//    zid wa7d abstract ila we7elti fihom kamlin
    
    public T find(long id);
    
    /*
     * Permet de créer une entrée dans la base de données
     * par rapport à un objet
     * @param obj
     */
    public  T create(T obj);
    
    /*
     * Permet de mettre à jour les données d'une entrée dans la base 
     * @param obj
     */
    public  T update(T obj);
    
    /*
     * Permet la suppression d'une entrée de la base
     * @param obj
     */
    public  void delete(T obj);
}

//}
