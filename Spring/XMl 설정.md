
  ### web.xml 설정
  
  
    
      # DispatcherServlet 설정
      
  <servlet>
	  <servlet-name>appServlet</servlet-name>
	  <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
	  <load-on-startup>1</load-on-startup>
  </servlet>
  <servlet-mapping>
	  <servlet-name>appServlet</servlet-name>
	  <url-pattern>/</url-pattern>
</servlet-mapping>

      # ApplicationContext 설정
      
 <servlet>
	    <servlet-name>appServlet</servlet-name>
	    <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
	  <init-param>
		  <param-name>contextConfigLocation</param-name>
		  <param-value>/WEB-INF/config/servlet-context.xml</param-value>
	</init-param>
	<load-on-startup>1</load-on-startup>
</servlet>

      

    

