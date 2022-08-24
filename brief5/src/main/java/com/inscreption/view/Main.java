package com.inscreption.view;




import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;
import java.util.Scanner;

import com.inscreption.domain.Etudiant;
import com.inscreption.model.dao.impl.UserDao;

//import com.inscreption.domain.Etudiant;
//import com.inscreption.model.DB.DB;
//import com.inscreption.model.dao.impl.UserDao;
//import com.inscreption.model.dao.impl.UserDao;
//
//public class Main {
//
//	public static void main(String[] args) {
//
//	 
//		
//		
//						Scanner inputnom = new Scanner(System.in);
//						System.out.print("Enter your firstname :  ");
//					    String nom = inputnom.nextLine();
//						
//						Scanner inputprenom = new Scanner(System.in);
//						System.out.println("Entrer your lastname:  ");
//						String prenom= inputprenom.nextLine();
//						
//						
//						Scanner inputville = new Scanner(System.in);
//						System.out.println("Entrer your city:  ");
//						String ville= inputville.nextLine();
//						
//						
//						Scanner inputemail = new Scanner(System.in);
//						System.out.println("Entrer your email:  ");
//						String email= inputemail.nextLine();
//						
//						Scanner inputadress = new Scanner(System.in);
//						System.out.println("Entrer your adress:  ");
//					    String adress= inputadress.nextLine();
//						
//				       Scanner inputpays = new Scanner(System.in);
//					   System.out.println("Entrer your Country:  ");
//				       String pays= inputpays.nextLine();
//			
//			
//			
//			            UserDao userDao = new UserDao();
//			            Etudiant condidat2= new Etudiant(nom,  prenom,  email,  adress,  ville, pays);
//			            System.out.println(userDao.create(condidat2));
//					
//					
////			User condidat1= new User("AMOUGUAY", "Latifa","latifaamouguay@gmail.com","74 rue 22 lotis massira","Tantan","Maroc");
////			User condidat2= new User(3,"RACHID", "najib","najib4@gmail.com","EL HOUDA","AGADIR","Maroc");
////			User condidat2= new User(3,"RACHID", "najib","najib4@gmail.com","EL HOUDA","AGADIR","Maroc");
////			
//////		    userDao.create(condidat1);
////		    userDao.create(condidat2);
////		    
//////			System.out.println(userDao.create(condidat1));
////			System.out.println(userDao.create(condidat2));
//////			boolean result = condidat1.create();
////			
////			if(result) {
////				System.out.println(" User was successfully added!");
////			}
////			else 
////			{
////				System.out.println(" Creation user failed!");
////			}
//			
//			
//			
//			
//			
////	    UserDao userDao = new UserDao();
////	    User condidat1= new User(1,"AMOUGUAY", "Latifa","latifaamouguay@gmail.com","74 rue 22 lotis massira","Tantan","Maroc");
////	    User condidat2= new User(2,"RACHID", "najib","najib4@gmail.com","EL HOUDA","AGADIR","Maroc");
//	    
//	    
////	    System.out.println(condidat1);
//
//        
//      
//        
//        
//    }
//	    
//
//	    
//	    
//	    
//	}
//////////////////////////////////////////////////////////////////////new
//import com.inscreption.domain.User;
//import com.inscreption.model.DB.DB;
//import com.inscreption.model.dao.DAO;
//import com.inscreption.model.dao.impl.UserDao;

public class Main {

	public static void main(String[] args) {
		 	
		
						Scanner scn = new Scanner(System.in);
						System.out.println("choisiez votre opération: ");
						System.out.println("1: Enregistrer");
						System.out.println("2: Modifier");
						System.out.println("3: Supprimer");
					    int oper = scn.nextInt();
		

						Scanner inputnom = new Scanner(System.in);
						System.out.print("Enter your firstname :  ");
					    String nom = inputnom.nextLine();
						
						Scanner inputprenom = new Scanner(System.in);
						System.out.print("Entrer your lastname:  ");
						String prenom= inputprenom.nextLine();
						
						
						Scanner inputville = new Scanner(System.in);
						System.out.print("Entrer your city:  ");
						String ville= inputville.nextLine();
						
						
						Scanner inputemail = new Scanner(System.in);
						System.out.print("Entrer your email:  ");
						String email= inputemail.nextLine();
						
						Scanner inputadress = new Scanner(System.in);
						System.out.print("Entrer your adress:  ");
					    String adress= inputadress.nextLine();
						
				       Scanner inputpays = new Scanner(System.in);
					   System.out.print("Entrer your Country:  ");
				       String pays= inputpays.nextLine();
				       
				       
				       if(oper==1&&oper<=3) {
//				    	   Scanner inputnom = new Scanner(System.in);
//							System.out.print("Enter your firstname :  ");
//						    String nom = inputnom.nextLine();
//							
//							Scanner inputprenom = new Scanner(System.in);
//							System.out.print("Entrer your lastname:  ");
//							String prenom= inputprenom.nextLine();
//							
//							
//							Scanner inputville = new Scanner(System.in);
//							System.out.print("Entrer your city:  ");
//							String ville= inputville.nextLine();
//							Scanner inputadress = new Scanner(System.in);
//							System.out.print("Entrer your adress:  ");
//						    String adress= inputadress.nextLine();
//							
//					       Scanner inputpays = new Scanner(System.in);
//						   System.out.print("Entrer your Country:  ");
//					       String pays= inputpays.nextLine();
					       
					       
							/////////////////////////////////////////
				    	   UserDao userDao = new UserDao();
				           Etudiant condidat= new Etudiant(nom,  prenom,  email,  adress,  ville, pays);
				            System.out.println(userDao.create(condidat));  
				    	   
				       }else if(oper==2) {
				    	   
//				    	   Scanner inputnom = new Scanner(System.in);
//							System.out.print("Enter your firstname :  ");
//						    String nom = inputnom.nextLine();
//							
//							Scanner inputprenom = new Scanner(System.in);
//							System.out.print("Entrer your lastname:  ");
//							String prenom= inputprenom.nextLine();
//							
//							
//							Scanner inputville = new Scanner(System.in);
//							System.out.print("Entrer your city:  ");
//							String ville= inputville.nextLine();
//							Scanner inputadress = new Scanner(System.in);
//							System.out.print("Entrer your adress:  ");
//						    String adress= inputadress.nextLine();
//							
//					       Scanner inputpays = new Scanner(System.in);
//						   System.out.print("Entrer your Country:  ");
//					       String pays= inputpays.nextLine();
					       //////////////////////////////////////////////
				    	   UserDao userDao = new UserDao();
				    	   Etudiant condidat= new Etudiant(nom,  prenom,  email,  adress,  ville, pays);			    	    
				    		System.out.println(userDao.update(condidat));
				    	   
				       }else {	
				    	   Scanner scn1 = new Scanner(System.in);
						   System.out.print("choisissez le candidat que vous souhaitez de  supprimer par son email  ");
						   UserDao userDao = new UserDao();
				    	   Etudiant etudiant = new User(firstname,  lastname,  email,  adress,  city, country);			
					       String email= scn1.nextLine();
				    	   userDao.delete(condidat);
				       }
			
			
			
				       
			           
		
				
			           
//			    		User condidat3 = new User(firstname,  lastname,  email,  adress,  city, country);
//			    	    
//			    		System.out.println(userDao.update(condidat3));
//					
					
//			User condidat1= new User("AMOUGUAY", "Latifa","latifaamouguay@gmail.com","74 rue 22 lotis massira","Tantan","Maroc");
//			User condidat2= new User(3,"RACHID", "najib","najib4@gmail.com","EL HOUDA","AGADIR","Maroc");
//			User condidat2= new User(3,"RACHID", "najib","najib4@gmail.com","EL HOUDA","AGADIR","Maroc");
//			
////		    userDao.create(condidat1);
//		    userDao.create(condidat2);
//		    
////			System.out.println(userDao.create(condidat1));
//			System.out.println(userDao.create(condidat2));
////			boolean result = condidat1.create();
//			
//			if(result) {
//				System.out.println(" User was successfully added!");
//			}
//			else 
//			{
//				System.out.println(" Creation user failed!");
//			}
			
			
			
			
			
//	    UserDao userDao = new UserDao();
//	    User condidat1= new User(1,"AMOUGUAY", "Latifa","latifaamouguay@gmail.com","74 rue 22 lotis massira","Tantan","Maroc");
//	    User condidat2= new User(2,"RACHID", "najib","najib4@gmail.com","EL HOUDA","AGADIR","Maroc");
	    
	    
//	    System.out.println(condidat1);

        
      
        
        
    }
	    

	    
	    
	    
	}
