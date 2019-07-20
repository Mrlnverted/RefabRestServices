package models;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Value;

@Entity
@Table(name="users")
public class Users {

	@Id
	@Column(name="user_id")
	int user_id;
	String full_name;
	String email;
	String gender;
	Date date_of_birth;
	Date created_at;
	
	@Value("${some.key:Customer}")
	String user_type;
	String password;
	
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getFull_name() {
		return full_name;
	}
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getUser_type() {
		return user_type;
	}
	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Date getDate_of_birth() {
		return date_of_birth;
	}
	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public Users() {
		
	}
	public Users(int user_id, String full_name, String email, String gender, Date date_of_birth, Date created_at,
			String user_type, String password) {
		super();
		this.user_id = user_id;
		this.full_name = full_name;
		this.email = email;
		this.gender = gender;
		this.date_of_birth = date_of_birth;
		this.created_at = created_at;
		this.user_type = user_type;
		this.password = password;
	}
	@Override
	public String toString() {
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

		String dob = simpleDateFormat.format(date_of_birth);
		return "Users [user_id=" + user_id + ", full_name=" + full_name + ", email=" + email + ", gender=" + gender
				+ ", date_of_birth=" + dob + ", created_at=" + created_at + ", user_type=" + user_type
				+ ", password=" + password + "]";
	}
	
	
	
	
	
}
