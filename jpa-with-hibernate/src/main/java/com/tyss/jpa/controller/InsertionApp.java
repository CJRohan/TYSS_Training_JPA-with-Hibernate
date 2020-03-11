package com.tyss.jpa.controller;

import java.time.LocalDate;
import java.time.Month;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.jpa.beans.EmployeeInfoBean;

public class InsertionApp {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		
		EmployeeInfoBean employeeInfoBean = new EmployeeInfoBean();
		employeeInfoBean.setEmpid(2020004);
		employeeInfoBean.setName("Rohan");
		employeeInfoBean.setMailId("sher@email.com");
		employeeInfoBean.setPassword("qwerty");
		employeeInfoBean.setBirthDate(LocalDate.of(1993, Month.MAY, 6));
		employeeInfoBean.setJoiningDate(LocalDate.of(2017, Month.JUNE, 25));
		employeeInfoBean.setMobileNo(987634233L);
		
		entityManager.persist(employeeInfoBean);
		
		entityTransaction.commit();
		entityManager.close();
		entityManagerFactory.close();
	}
}
