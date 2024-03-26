//I added comments as notes for understanding.

package com.tnsif.shopping.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity  
//Entity is used to mark a java class as an entity. Each entity represents a table in a database
//Each instance of entity corresponds to a row of the table.

@Table(name="users") //Used to specify the name of table to connect to where the class name and table names are different
public class User {
	    @Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
		private int userId;
		private String userName;
		private String email;
		private String password;
		
		

		 public User() {
		        //
		    }
		
		public User(String userName2, int userId2, String email2, String password2) {
			// TODO Auto-generated constructor stub
			this.userName = userName2;
			this.userId = userId2;
			this.email = email2;
			this.password = password2;
		}

		//		getters and setters for UserId.	
		public int getId() {
			return userId;
		}
		public void setId(int userId) {
			this.userId = userId;
		}
		
//		getters and setters for User name.	
		public String getUserName() {
			return userName;
		}
		public void setUsername(String userName) {
			this.userName = userName;
		}
		
//		getters and setters for email.
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		
		
//		getters and setters for Password.	
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		
}
