### ApplicationScope

    - 서버가 가동될 때부터 서버가 종료되는 시점까지의 범위를 Application Scope라고 부른다.
    
    - Application Scope 동안 사용할 수 있는 메모리 영역이 만들어지며 ServletContext라는 클래스 타입의 객체로 관리.
    
    - ServletContext에 저장된 데이터나 객체는 서버가 종료되기 전까지 서버는 웹브라우저에 관계없이 동일한 메모리 공간을 사용한다.
    
    # ServletContext
    
        - HttpServletRequest 객체로 부터 추출이 가능.
        
        - Controller에서 주입 받을 수 있다.
        
    
     # Application scope
     
        - Bean을 정의할 때 application scope로 정의하면 서버가 가동될 때 자동으로 주입된다.
        
        - 주입된 Bean은 주입만 이루어지는 것이기때문에 application 영역에 저장되지는 않는다.
        
        - 서버가 가동될 때 자동 주입 되는 것이므로 @Lazy 어노테이션은 설정하지 않아도 된다.
        
        - Java 형식은 @ApplicationScope를 사용한다.
        
        - XML 방식은 bean을 정의할 때 scope = "application"으로 설정.
