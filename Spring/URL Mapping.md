  ### URL Mapping
  
    # Servlet/JSP RUL
      - 사용자가 서버에 접속해서 서비스를 받기 위해 입력하는 주소를 URL 이라고 부릅니다.
      
      - URL 주소는 여러 의미를 가지는 값들로 구성됩니다.
        ex) 프로토콜: // 도메인 : 포트번호 / 경로
     
    # URL 주소
    
      - 프로토콜 : 서버와 클라이언트간의 통신을 위햔 약속. (생략 시 http)
      
      - 도메인 주소(IP) : IP 주소는 같은 네트워크 망에서 컴퓨터를 구분하기 위해 제공되는 숫자로 구성된 고유 주소.
        인터넷 망에 연결된 컴퓨터는 전 세계에서 유일한 주소를 할당 받고 공유기 등에 연결된 컴퓨터는 공유기안에서 유일한 주소를 할당.
        하지만 숫자 구성만으로는 기억하기 어려워 도메인 주소라는 걸 만들어 제공
        
      - 포트번호 : 1 ~ 65535번까지 구성된 숫자. 컴퓨터에서 프로그램을 구분하기 위해 사용
      
      - 경로/경로/경로 .. : 이 부분은 서버 혹은 개발 방식. 분야에 따라 다르게 해석된다. Servlet/JSP 에서는 첫번째 경로는 Context Path라고 부른다.
      
      
    # SpringMVC에서의 주소
    
     - Spring MVC에서는 Context Path 다음에 나오는 주소는 실제 물리적인 경로와 다르게 지정할 수 있다.
     
     @Controller : Controller 지정 어노테이션
     public class TestController {
      
      @RequestMapping(value="/test", method = RequestMethod.GET or POST) : value로 경로 설정, method로 get 또는 post 전송 방식 설정
      public String test() {
      return "test1";
     }
     
    # 하위 경로
      
      - @COntroller
        public class SubController {
          @RequestMapping(value = "/sub1/test1", method = RequestMethod.GET)
          public String test() {
            return "sub/test";
            
    # 하위 경로 통합
      
      - @Controller
        @RequestMapping("sub1")
        public class Sub2 {
          @RequestMapping(value = "test1", method = RequestMethod.GET)
          public String test2() {
            return "sub/test";
          }
        }
