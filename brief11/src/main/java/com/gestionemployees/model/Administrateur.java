package com.gestionemployees.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "administrateur")
public class Administrateur {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@Column(name = "nom_admin")
		private String username;
		
		@Column(name = "password_Admin")
		private String password;
		
		@Column(name = "email_email")
		private String emailAdmin;

		public Administrateur() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Administrateur(String userName, String password, String emailAdmin) {
			super();
			this.username = userName;
			this.password = password;
			this.emailAdmin = emailAdmin;
		}

		
		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getUserName() {
			return username;
		}

		public void setUserName(String userName) {
			this.username = userName;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getEmailAdmin() {
			return emailAdmin;
		}

		public void setEmailAdmin(String emailAdmin) {
			this.emailAdmin = emailAdmin;
		}

		@Override
		public String toString() {
			return "Administrateur [id=" + id + ", nuserName=" + username + ", password=" + password
					+ ", emailAdmin=" + emailAdmin + "]";
		}

}
