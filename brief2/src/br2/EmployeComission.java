package br2;

public class EmployeComission  extends Employee{
	 private int quantite_Vendeur;
	 private double commission_Vendeur;
	
	
	public EmployeComission(String firstname, String lastname, double salaire, String strDate,int quantite_Vendeur,double commission_Vendeur ) {
		super(firstname, lastname, salaire, strDate);
		this.quantite_Vendeur=quantite_Vendeur;
		this.commission_Vendeur=commission_Vendeur;
	}
	
	public double calculerSalaire() {
		return super.getSalaire()+(quantite_Vendeur*commission_Vendeur);
	}


	@Override
	public String toString() {
		return "L'Employes Commission:"+"\n\t First Name :" + getFirstname() + "\n\t Last Name:" + getLastname() +
				"\n\t Datebirth:" + strDate+ "\n\t Salaire:" + calculerSalaire()+ "";

	}
	
	
	

}