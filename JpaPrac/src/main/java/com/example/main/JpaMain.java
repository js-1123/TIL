package com.example.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.example.domain.Member;

public class JpaMain {

	public static void main(String[] args) {
	
		// pom.xml에서 설정한 unit 이름
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
		
		EntityManager em = emf.createEntityManager();
		
		// Transaction에서 모든 쿼리 설정
		EntityTransaction tx = em.getTransaction();
		
		tx.begin();
		
		try {
		
			Member member = new Member();
			member.setId(200L);
			member.setName("helloJpaB");
			
			em.persist(member);
				
			tx.commit();
		
		}catch(Exception e) {
			tx.rollback();
		}finally {
			em.close();
		}
		
			
		
		
		
		emf.close();
		
	}

}
