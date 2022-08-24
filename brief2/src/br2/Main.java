package br2;



public class Main {
	
	public static void main(String[] args) {
		
		EmployeFixe emp1 = new EmployeFixe("anas","oussous",5000.00,"01/07/2003");
		EmployeComission emp2 = new EmployeComission("abderrah","elouar",5000.00,"02/01/1997",300,0.3);
		EmployeHoraire emp3 = new EmployeHoraire("latifa","al","02/07/2000",23,30);
		
		
		
		
		System.out.println(emp1);
		System.out.println("**********************************");
		System.out.println(emp2);
		System.out.println("**********************************");
		System.out.println(emp3);
		
		
		
	  
	  
	}

}