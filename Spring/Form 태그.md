### Form

    - Spring에서는 <form:태그> 형태로 되어있는 커스텀 태그를 제공하고 있습니다.
    
    - Form 커스텀 태그를 활용하면 Model 객체에 들어있는 값을 form 요소에 주입 시킬 수 있습니다.
    
    # 커스텀 태그 URL 설정
    
     - <%@taglib prefix = "form" uri = "http://www.springframework.org/tags/form"%>
     
     - <form:form modelAttribute = "객체 정보 전달" action = "정보 전달 주소">
     
    # select, checkbox, radio
    
      - Spring에서 제공하는 form custom tag를 이용해서 select, checkbox, radio 등을 유동적으로 사용할 수 있습니다.
      
      
