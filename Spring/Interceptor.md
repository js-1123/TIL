### Interceptor

    - 요청 발생 시 호출되는 메서드의 코드가 중복 되는 부분이 있을 때 Interceptor를 통해 처리한다.
    
    - 로그인 여부 확인, 등급별 서비스 사용 권한 등의 작업을 처리 할 때 사용.
    
    - Java 프로젝트와 XML 프로젝트의 세팅이 다르다.
    
    # Interceptor 구현
    
        - HandlerInterceptor 인터페이스를 구현하거나 HandlerInterceptorAdapter를 상속받은 클래스를 만들고 메서드를 구현
        
        - preHandle : Controller의 메서드가 호출되기 전 호출, false를 반환하면 흐름 중단
        
        - postHandle : Controller의 메서드의 수행이 완료되고 view 처리를 수행하기 전 호출
        
        - afterCompletion : view 처리까지 완료된 후 응답결과가 브라우저로 전달되기 전에 호출
        
    # pattern
    
        - * : 이름 하나를 의미, 글자수 글자 제한이 없다
        
        - ? : 글자 하나를 의미
        
        - ** : 하위 이름까지 포함하여 글자수 글자 제한 x
        
        
