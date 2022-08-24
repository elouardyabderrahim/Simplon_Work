package com.gestiondestaffecole.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.gestiondestaffecole.model.Etudiant;
import com.gestiondestaffecole.util.HibernateUtil;

public class EtudiantImplementation implements DaoEtudiant<Etudiant>  {

		
		
		
		
		

		@Override
		public List<Etudiant> getAll() {
			try (Session session = HibernateUtil.getSessionFactory().openSession()) {
				return session.createQuery("from etudiant", Etudiant.class).list();
			}
		}

		@Override
		public Etudiant getById( int etudiantId ) {
			Transaction transaction = null;
			Etudiant etudiant = null;
			try (Session session = HibernateUtil.getSessionFactory().openSession()) {
				transaction = session.beginTransaction();
				
				String hql = "FROM etudiant WHERE aId = "+ etudiantId;
				Query query = session.createQuery(hql);
				etudiant =  (Etudiant) query.getResultList().get(0);
				
				session.getTransaction().commit();
				session.close();
			} catch (Exception e) {
				if (transaction != null) {
					transaction.rollback();
				}
				e.printStackTrace();
			}
			return etudiant;
		}

		@Override
		public boolean add(Etudiant etudiant) {
			Transaction transaction = null;
			try (Session session = HibernateUtil.getSessionFactory().openSession()) {
				transaction = session.beginTransaction();
				session.save(etudiant);
				transaction.commit();
				return true;
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			return false;
		}

		@Override
		public boolean update(Etudiant etudiant) {
			Transaction transaction = null;
			try (Session session = HibernateUtil.getSessionFactory().openSession()) {
				transaction = session.beginTransaction();

				String hql = "UPDATE Etudiant set  Nom = :Nom , Niveau = :Niveau , Cours = :Cours,Note =:Note" + "WHERE etudiantId = :etudiantId";
				Query query = session.createQuery(hql);

				query.setParameter("Nom", etudiant.getNom());
				query.setParameter("Niveau", etudiant.getNiveau());
				query.setParameter("Note",etudiant.getNote());
				//query.setParameter("password", admin.getPassword());
				//query.setParameter("id", admin.getaId());
				query.executeUpdate();

				transaction.commit();
				return true;
			} catch (Exception e) {
				if (transaction != null) {
					transaction.rollback();
				}
				e.printStackTrace();
			}
			return false;
		}

		@Override
		public boolean delete(long etudiantId) {
			Transaction transaction = null;
			try (Session session = HibernateUtil.getSessionFactory().openSession()) {
				transaction = session.beginTransaction();

				String hql = "DELETE FROM etudiant " + "WHERE etudiantId = " + etudiantId;
				Query query = session.createQuery(hql);
				
				query.executeUpdate();
				session.getTransaction().commit();;
				session.close();
				return true;
			} catch (Exception e) {
				if (transaction != null) {
					transaction.rollback();
				}
				e.printStackTrace();
			}
			return false;
		}


		
}
