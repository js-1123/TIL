### Request

  - 브라우저에 의해 새로운 요청이 발생하면 브라우저는 서버에 요청에 관련된 정보를 전송하게 된다.
  
  - 이를 받은 서버는 브라우저가 보낸 요청 정보들을 보관하기 위해 HttpServletRequest 객체를 생성해 요청 정보들을 담아둔다.
  
  - 요청 정보가 담겨 있는 HttpServletRequest 객체는 응답결과가 브라우저로 전송 될 때까지 유지되며 사용이 가능하다.
  
  # RequestScope
  
    - 새로운 요청이 발생해 응답결과가 브라우저로 전달 될 때 까지 요청정보가 담겨 있는 Request 객체를 사용할 수 있다.
    
    - 이러한 사용 범위를 RequestScope라고 부른다.
    
    - HttpServletRequest 객체에는 서버 개발자가 필요에 의해 데이터나 객체를 저장할 수 있고 RequestScope 내에서 사용이 가능하다.
