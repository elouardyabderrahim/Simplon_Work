package br2;

public class EmployeHoraire  extends Employee {
	private int  nombreHeure;
	private double tauxHoraire;
	
	
	
	

	public EmployeHoraire(String firstname, String lastname, String strDate, int  nombreHeure,double tauxHoraire  ) {
		super(firstname, lastname, strDate);
		this.nombreHeure=nombreHeure;
		this.tauxHoraire=tauxHoraire;
		
	}


	public double calculerSalaire() {
		return (nombreHeure*tauxHoraire);
	}
	@Override
	public String toString() {
		 return "L'Employes D'Horaire:"+"\n\t First Name :" + getFirstname() + "\n\t Last Name:" + getLastname() + "\n\t Datebirth:"
					+ strDate + "\n\t Salaire:" + calculerSalaire();

	}
	

}