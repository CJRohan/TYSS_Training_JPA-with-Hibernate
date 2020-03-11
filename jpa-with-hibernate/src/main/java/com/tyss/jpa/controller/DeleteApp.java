package com.tyss.jpa.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.jpa.beans.EmployeeInfoBean;

import lombok.extern.java.Log;

@Log
public class DeleteApp {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();

		EmployeeInfoBean employeeInfoBean = entityManager.find(EmployeeInfoBean.class, 2020002);

		if (employeeInfoBean != null) {
			log.info(employeeInfoBean.toString());
			entityManager.remove(employeeInfoBean);
		}
		
		entityTransaction.commit();
		entityManager.close();
		entityManagerFactory.close();

	}

}
