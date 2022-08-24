package models;

public class Tasks {

	private int id;
	private String title;
	private String description;
	private String status;
	private String deadline;
	private String categorie;
	
	public Tasks() {}

	public Tasks(int id,String title, String description, String status, String deadline, String categorie) {
		this.id=id;
		this.title = title;
		this.description = description;
		this.status = status;
		this.deadline = deadline;
		this.categorie = categorie;
	}
	
	public Tasks(String title, String description, String status, String deadline, String categorie) {
		this.id=id;
		this.title = title;
		this.description = description;
		this.status = status;
		this.deadline = deadline;
		this.categorie = categorie;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDeadline() {
		return deadline;
	}

	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
}