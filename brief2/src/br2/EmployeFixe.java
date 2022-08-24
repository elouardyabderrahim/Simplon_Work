package br2;


public class EmployeFixe  extends Employee{
	
	public EmployeFixe(String firstname, String lastname, double salaire,  String strDate) {
		super(firstname, lastname, salaire, strDate);
		
	}


	
	public String toString() {
		 return "L'Employes Fixe:"+"\n\t First Name :" + getFirstname() + "\n\t Last Name:" + getLastname() +"\n\t Datebirth:"
					+ strDate+ "\n\t Salaire:" +getSalaire() + "";
	}

	

}

