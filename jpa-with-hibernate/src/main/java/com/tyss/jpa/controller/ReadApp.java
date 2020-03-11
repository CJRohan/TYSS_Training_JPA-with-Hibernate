package com.tyss.jpa.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tyss.jpa.beans.EmployeeInfoBean;

import lombok.extern.java.Log;

@Log
public class ReadApp {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		// EntityTransaction not needed for DQL statements
		
		EmployeeInfoBean employeeInfoBean = entityManager.find(EmployeeInfoBean.class, 2020001);

		log.info(employeeInfoBean.toString());

		entityManager.close();
		entityManagerFactory.close();
	}

}
