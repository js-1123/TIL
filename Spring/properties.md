### Properties

    - 애플리케이션을 개발할 때 절대 변하지 않는 값들이 있을 수 있다.
    
    - Spring MVC에서는 이러한 값들을 properties 파일에 작성하고 이를 가져다 사용할 수 있도록 제공한다.
    
    @PropertySource, @PropertySources
    
     - 사용할 properties 파일을 지정.
     
     - 하나 혹은 다수 파일을 지정할 수 있다.
     
     ex) @PropertySources ({
        @PropertySource("경로")
     )}
     
     @Value
      
      - properties 파일에 작성한 값을 주입
      
      ex) @Value("${변수}")
      private 변수 설정
