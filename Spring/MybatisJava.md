### Mybatis Java

    - Java 언어를 이용하여 DB와 연동하는 프로그램을 만들 수 있는 기술을 JDBC라 한다.
    
    - Mybatis는 JDBC 프로그래밍을 보다 쉽게 하기 위해 설계된 라이브러리.
    
    # 라이브러리 추가
    
        - DB 드라이버 jar
        
        - Spring jdbc
        
        - dbcp
        
        - mybatis
        
        - mybatis-spring
        
    # Properties 파일 작성
    
      - database.classname = db에 맞는 드라이버
      
      - database.url = 
      
      - database.username = 
      
      - database.password = 
      
    # BasicDataSource Bean 정의
    
       - BasicDataSource는 접속 정보를 관리하는 객체.
       
       - @Bean
         public BasicDataSource dataSource() {
          
          BasicDataSource source = new BasicDataSource();
          source.setDriverClassName();
          source.setUrl()
          source.setUsername();
          source.setPassword();
          
          return source;
         }
         
    # SqlSessionFactoryBean
    
      - SqlSessionFactory는 접속, 쿼리 관리 등을 하는 객체.
      
      - Bean
        public SqlSessionFactory factory(BasicDataSource source) throws Exception {
        
          SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
          factoryBean.setDataSource(source);
          SqlSessionFactory factory = factoryBean.getObject();
          
          return factory;
        
        }
