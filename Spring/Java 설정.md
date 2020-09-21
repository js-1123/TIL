
  ### Java 설정
  
    ```
      @Configuration : 작업시 사용할 Bean을 정의
      public class RootAppContext 
      
      @EnableWebMvc : Controller 어노테이션 셋팅 돼있는 클래스를 Controller로 등록 
      @Configuration
      public class ServgletAppContext : Spring MVC 관련 설정 클래스
      
      public class SpringConfigClass extends AbstractAnnotationConfigDispatcherServletInitializer
      
      // DispatcherServlet에 매핑할 주소 셋팅
      @Override 
    	protected String[] getServletMappings() {
		
	   	return new String[] {"/"};
	}
      
    // Spring MVC 프로젝트 설정 클래스 지정 
    @Override
	  protected Class<?>[] getServletConfigClasses() {
		
		return new Class[] {ServletAppContext.class};
	}
    
    // 프로젝트에서 사용할 Bean 정의 클래스 지정
    @Override
	  protected Class<?>[] getRootConfigClasses() {
		
		return new Class[] {RootAppContext.class};
	}
  
    // 파라미터 인코딩 필터 설정
	@Override
	protected Filter[] getServletFilters() {
		
		CharacterEncodingFilter encodingFilter = new CharacterEncodingFilter();
		encodingFilter.setEncoding("UTF-8");
		return new Filter[] {encodingFilter};
	}
    
    
    ```
