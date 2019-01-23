package com.example.repositories;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.example.entities.AuthorEntity;
import com.example.utils.HibernateUtil;

public class AuthorRepository {
public void save(AuthorEntity author) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.save(author);
		session.getTransaction().commit();
		session.close();
	}

}
