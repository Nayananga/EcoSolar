package com.service.app.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class ItemDao {

    EntityManagerFactory emf;
    EntityManager em;

    public ItemDao() {
        this.emf = Persistence.createEntityManagerFactory("ServiceProviderJPAunit");

        this.em = emf.createEntityManager();
    }

    public List getItemsById(String pin){
        Query query = em.createQuery("select category from Item where customerId=" + pin + "");
        return query.getResultList();
    }

    public Object getDateByIdAndItem(String id, String item){
        Query query = em.createQuery("select purchasedDate from Item where customerId="+id+" and category="+item+"");
        return query.getSingleResult();
    }

    public Object getDueDateById(String key){
        Query query = em.createQuery("select dueDate from Item where customerId="+key+"");
        return query.getSingleResult();
    }
}
