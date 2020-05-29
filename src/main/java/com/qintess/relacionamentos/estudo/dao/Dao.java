package com.qintess.relacionamentos.estudo.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.qintess.relacionamentos.estudo.config.HibernateConfig;

public class Dao<T> {

	public void insere(T entidade) {
		
		Transaction tran = null;
		
		try(Session session = HibernateConfig.getSessionFactory().openSession()) {
			
			tran = session.beginTransaction();
			
			session.persist(entidade);
			
			tran.commit();
			
		}
	}
	
	public void atualiza(T entidade) {
		
		Transaction tran = null;
		
		try(Session session = HibernateConfig.getSessionFactory().openSession()) {
			
			tran = session.beginTransaction();
			
			session.merge(entidade);
			
			tran.commit();
			
		}
	}
}
