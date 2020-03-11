package com.tyss.jpa.beans;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString.Exclude;

@SuppressWarnings("serial")
@Data
@Entity
@Table(name = "employee_info")
public class EmployeeInfoBean implements Serializable {
	@Id
	@Column
	private Integer empid;
	@Column
	private String name;
	@Column(name = "mail_id", unique = true)
	private String mailId;
	@Column
	@Exclude
	private String password;
	@Column
	private LocalDate birthDate;
	@Column
	private LocalDate joiningDate;
	@Column(name = "mobile_no",unique = true)
	private Long mobileNo;

}








