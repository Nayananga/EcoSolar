package com.service.app.dao;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class CustomerDao {

    EntityManagerFactory emf;
    EntityManager em;

    public CustomerDao() {
        this.emf = Persistence.createEntityManagerFactory("ServiceProviderJPAunit");

        this.em = emf.createEntityManager();
    }

    public java.util.List validPinCode(int pin) {
        Query query = em.createQuery("select pinCode from Customer where pinCode=" + pin + "");
        return query.getResultList();
    }
}
