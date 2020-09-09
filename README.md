## TIL

```java

@Entity //JPA가 관리 하는 객체 설정
public class Member {

	@Id // SQL의 PK 설정
	private long id;
	private String name;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
			
}
```

```java
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
```

* 깃 연습
  * 깃 Clone
  * 깃 Pull
  * 깃 Commit
    * 깃 Commit 1)
    * 깃 Commit 2)
    
 > `인용구문.` -JPA-
 
 테이블 작성
 
 이름|영어|정보|수학
 ---|---|---|---|
 홍길동|90|80|70|
 김길동|100|100|100|
 
 **강조** ~취소선~ 입니다.
 
