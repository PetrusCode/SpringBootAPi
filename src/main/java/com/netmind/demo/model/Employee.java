package com.netmind.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Entity
@Table(name = "employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	@NotNull(message = "The id should not be null")
	@Positive(message = "The id should be greater than 0")
	private Integer id;

	@Column(name = "firstName")
	@NotNull(message = "The firstName is mandatory")
	@NotBlank(message = "The firstName should not be blank")
	private String firtsName;

	@Column(name = "lastName")
	@NotNull(message = "The lastName is mandatory")
	@NotBlank(message = "The lastname should not be blank")
	private String lastName;

	@Column(name = "email")
	@NotNull(message = "The email is mandatory")
	@NotBlank(message = "The email should not be blank")
	@Email(message = "The email is not correct")
	private String email;

	public Employee() {

	}

	public Employee(Integer id, String firtsName, String lastName,
			String email) {
		super();
		this.id = id;
		this.firtsName = firtsName;
		this.lastName = lastName;
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirtsName() {
		return firtsName;
	}

	public void setFirtsName(String firtsName) {
		this.firtsName = firtsName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [id=");
		builder.append(id);
		builder.append(", firtsName=");
		builder.append(firtsName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", email=");
		builder.append(email);
		builder.append("]");
		return builder.toString();
	}

}
