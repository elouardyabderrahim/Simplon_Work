package Dao;

public class User {
	private int ID;
	private String Name;
	private String Adress;
	private String Email;
	private String City;
	private String Country;
	public User(int iD, String name, String adress, String email, String city, String country) {
		super();
		ID = iD;
		Name = name;
		Adress = adress;
		Email = email;
		City = city;
		Country = country;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAdress() {
		return Adress;
	}
	public void setAdress(String adress) {
		Adress = adress;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	
	

}
