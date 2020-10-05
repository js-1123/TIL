### ApplicationScope

    - 서버가 가동될 때부터 서버가 종료되는 시점까지의 범위를 Application Scope라고 부른다.
    
    - Application Scope 동안 사용할 수 있는 메모리 영역이 만들어지며 ServletContext라는 클래스 타입의 객체로 관리.
    
    - ServletContext에 저장된 데이터나 객체는 서버가 종료되기 전까지 서버는 웹브라우저에 관계없이 동일한 메모리 공간을 사용한다.
    
    # ServletContext
    
        - HttpServletRequest 객체로 부터 추출이 가능.
        
        - Controller에서 주입 받을 수 있다.
        
