package models;

public class UserLogin {

	private static int currentUserId;
	private static int id;
	

	public static int getCurrentUserId() {
		return currentUserId;
	}

	public static void setCurrentUserId(int id) {
		currentUserId = id;
	}

	public static int getId() {
		return id;
	}

	public static void setId(int idEdit) {
		id = idEdit;
	}
	
}

