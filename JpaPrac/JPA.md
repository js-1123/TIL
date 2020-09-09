
### JPA 설정 및 구동

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

### JPA 실행 메인
  
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


### JPA pom 설정
	```
	<project xmlns="http://maven.apache.org/POM/4.0.0"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<groupId>jpa-basic</groupId>
	<artifactId>JpaPrac</artifactId>
	<version>0.0.1-SNAPSHOT</version>

	<dependencies>
		<!-- JPA 하이버네이트 -->
		<dependency>
			<groupId>org.hibernate</groupId>
			<artifactId>hibernate-entitymanager</artifactId>
			<version>5.3.10.Final</version>
		</dependency>
		
		<!--  mariaDB 라이브러리 -->
		<dependency>
			<groupId>org.mariadb.jdbc</groupId>
			<artifactId>mariadb-java-client</artifactId>
			<version>2.6.0</version>
		</dependency>

	</dependencies>
	</project>

	```

### persistence 설정

```xml
	<?xml version="1.0" encoding="UTF-8"?>
	<persistence version="2.2"
 	xmlns="http://xmlns.jcp.org/xml/ns/persistence" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
 	xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/persistence http://xmlns.jcp.org/xml/ns/persistence/persistence_2_2.xsd">
 	<persistence-unit name="hello">
 	<properties>
 
 <!-- DB 및 속성 설정 -->
 	<property name="javax.persistence.jdbc.driver" value="org.mariadb.jdbc.Driver"/>
 	<property name="javax.persistence.jdbc.user" value="root"/>
 	<property name="javax.persistence.jdbc.password" value="1234"/>
 	<property name="javax.persistence.jdbc.url" value="jdbc:mariadb://127.0.0.1:3310/shopdb"/>
<!-- SQL 종류마다의 방언 설정 -->
 	<property name="hibernate.dialect" value="org.hibernate.dialect.MariaDB102Dialect"/>

 <!-- 옵션 설정 -->
 	<property name="hibernate.show_sql" value="true"/>
 	<property name="hibernate.format_sql" value="true"/>
 	<property name="hibernate.use_sql_comments" value="true"/>


<!--<property name="hibernate.hbm2ddl.auto" value="create" />  -->
 	</properties>
 	</persistence-unit>
	</persistence> 
```

