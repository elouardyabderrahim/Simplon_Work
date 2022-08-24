package com.inscreption.model.dao;

//public interface DAO {package com.inscreption.model.dao;

import java.sql.Connection;
import java.util.List;

import com.inscreption.model.DB.DB;
 
//public abstract class DAO<T> {
public  interface DAO<T>{
    public Connection connect = DB.getInstance();
    
    /*
     * Permet de r�cup�rer un objet via son ID
     * @param id
     * @return      
     */
//    zid wa7d abstract ila we7elti fihom kamlin
    
    public T find(long id);
    
    /*
     * Permet de cr�er une entr�e dans la base de donn�es
     * par rapport � un objet
     * @param obj
     */
    public  T create(T obj);
    
    /*
     * Permet de mettre � jour les donn�es d'une entr�e dans la base 
     * @param obj
     */
    public  T update(T obj);
    
    /*
     * Permet la suppression d'une entr�e de la base
     * @param obj
     */
    public  void delete(T obj);
}

//}
