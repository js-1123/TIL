### Session

    - 브라우저가 최초로 서버에 요청을 하게 되면 브라우저당 하나의 메모리 공간을 서버에서 할당한다.
    
    - 이 메모리 영역은 브라우저당 하나씩 지정되며 요청이 새롭게 발생하더라도 같은 메모리 공간을 사용한다.
    
    - 이 공간을 session이라 한다.
    
    - 이 영역은 브라우저 종료시 까지 서버에서 사용 가능.
    
    # SessionScope
    
        - 브라우저가 최초의 요청을 발생 시키고 브라우저를 닫을 때 까지를 SessionScope라고 부른다.
        
        - SessionScope에서는 session 영역에 저장되어 있는 데이터나 객체를 자유롭게 사용 가능
        
     # SessionAttribute
     
        - Session 영역에 저장되어 있는 객체를 사용하고자 할 때 메서드의 매개변수로 @SessioAttribute를 설정하면 Session 영역에 저장되어 있는
          Bean을 주입 받을 수 있다.
          
      # SessionAttributes
        
         - ModelAttribute를 통해 주입 받는 Bean은 자동으로 Request 영역에 저장되고 Request 영역으로 부터 주입을 받는다.
         
         - 이 때 @ModelAttribute를 통해 주입받는 Bean을 @SessionAttributes로 지정해놓으면 request 영역이 아닌 session 영역에 저장되고
           session 영역으로 부터 주입 받을 수 있다.
           
        
