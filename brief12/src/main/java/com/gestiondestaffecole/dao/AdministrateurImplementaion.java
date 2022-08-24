package com.gestiondestaffecole.dao;

import javax.transaction.Transaction;

import org.hibernate.Session;

import com.gestiondestaffecole.model.Administrateur;
import com.gestiondestaffecole.util.HibernateUtil;

public class AdministrateurImplementaion implements AdministrateurDao {
	
	@Override
    public boolean validate(String username, String password) {
        org.hibernate.Transaction transaction = null;
        Administrateur administrateur = null;
        boolean valid=false;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // get an user object
            administrateur = (Administrateur) session.createQuery("FROM Admin A WHERE A.username = :username").setParameter("username", username).uniqueResult();
            if (administrateur != null && administrateur.getPassword().equals(password)) {
                valid= true;
            }
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return valid;

}}
