package com.netmind.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	@NotNull(message = "The id should not be null")
	@Positive(message = "The id should be greater than 0")
	private Integer IdUser;

	@Column(name = "usuario")
	@NotNull(message = "This field is mandatory")
	@NotBlank(message = "This field cant be blank")
	private String user;

	@Column(name = "password")
	@NotNull(message = "This field is mandatory")
	@NotBlank(message = "This field cant be blank")
	private String pwd;

	@Column(name = "tokens")
	@NotNull(message = "This field is mandatory")
	@NotBlank(message = "This field cant be blank")
	private String token;

}
