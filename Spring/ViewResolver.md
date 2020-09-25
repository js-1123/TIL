  ### ViewResolver
  
    - 컨트롤러에서 전달 받은 View의 이름을 토대로 jsp를 찾아 선택하고 jsp 데이터를 분석해 응답결과를 만들어 전달하는 요소.
    
    # HttpServletRequest
    
     - Spring Mvc는 jsp를 처리할 때 HttpServletRequest 객체를 jsp 쪽으로 전달합니다.
     
     - ViewResolver는 이를 이용해 JSP 작업시 데이터를 사용할 수 있습니다.
     
     ex) public String test2(HttpServletRequest request) {
      
        request.setAttribute("value1", 100);
        request.setAttribute("value2", 200);
     }
     
     # Model
     
      - Model 객체를 주입 받아 셋팅하면 HttpServletRequest 객체에 담겨 이를 JSP로 전달할 수 있습니다.
      
      ex) public String test3(Model model) {
      
        model.addAttribute("value3", 300);
        model.addAttribute("value4", 400);
      
      }
      
     # ModelAndView
     
      - ModelAndView는 Model에 값을 셋팅하는 기능과 View의 이름을 지정하는 기능을 모두 가지고 있습니다.
      
      ex) public ModelAndView test5(ModelAndView mv) {
      
        mv.addObject("value3000", 3000);
        mv.addObject("value4000", 4000);
        mv.setViewName("test5");
        
        return mv;
      }
      
      - ViewResolver에 의해 JSP가 실행되고 응답결과가 만들어진다.
      
      - Controller에서 VIew를 지정할 때 ViewResolver가 사용할 데이터를 Request 영역에 저장할 수 있다.
