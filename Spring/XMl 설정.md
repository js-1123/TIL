
  ### web.xml 설정
  
  	
    	<servlet>
	<servlet-name>appServlet</servlet-name>
	<servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
	<load-on-startup>1</load-on-startup>
	</servlet>
	<servlet-mapping>
	<servlet-name>appServlet</servlet-name>
	<url-pattern>/</url-pattern>
	</servlet-mapping>

   
   ### ApplicationContext 설정
   
   	
	<servlet>
	<servlet-name>appServlet</servlet-name>
	<servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
	<init-param>
		<param-name>contextConfigLocation</param-name>
		<param-value>/WEB-INF/config/servlet-context.xml</param-value>
	</init-param>
	<load-on-startup>1</load-on-startup>
	</servlet>

	
   ### RootContext 설정 : Bean 정의
   
   	<context-param>
	<param-name>contextConfigLocation</param-name>
	<param-value>/WEB-INF/config/root-context.xml</param-value>
	</context-param>

	<listener>
	<listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
	</listener>
	
  
   ### 필터 설정
   
   	<filter>
	<filter-name>encodingFilter</filter-name>
	<filter-class>org.springframework.web.filter.CharacterEncodingFilter</filter-class>
	<init-param>
	<param-name>encoding</param-name>
	<param-value>UTF-8</param-value>
	</init-param>
	</filter>
