package model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity

public class Cat {
	private Integer id;
	private String name;
	private Date dateOfBirth;
	private Boolean gender;
	
	//bắt buộc có một constructor rỗng
	public Cat() {}

	public Cat(String name, Date dateOfBirth, Boolean gender) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
	}

	public Cat(Integer id, String name, Date dateOfBirth, Boolean gender) {
		this.id = id;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
	}

	@Id // khóa chính
	@GeneratedValue // tự động tăng
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Boolean getGender() {
		return gender;
	}

	public void setGender(Boolean gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Cat [id=" + id + ", name=" + name + ", dateOfBirth=" + dateOfBirth + ", gender=" + gender + "]";
	}
	
	
}
