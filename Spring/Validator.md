### Validator

    - JSR-303, JSR-380 스펙으로 유효성 검사를 한 후 추가적으로 다른 유효성 검사를 할 때 사용.
    
     # Validator 인터페이스 구현 
     
      - supports : 유효성 검사할 데이터를 가지고 있는 객체가 유효성 검사가 가능한지 확인.
      
      - validate : 유효성 검사를 하는 메서드
      
     # Controller 등록
     
      - Validator를 컨트롤러에서 등록
      
      - 사용할 Validator가 하나면 setValidator, 한 개 이상이면 addValidators 메서드를 사용
      
      ex) @InitBinder
          protected void initBinder (WebDataBinder binder) {
            BeanName validator = new BeanName();
            binder.setValidator(validator);
          }
          
          #ValidateUtils
          
            - 지정된 값에 대해 유효성 검사
            
            - rejectifEmpty(error 객체, "propertyname", "codename"): 값이 비어 있는지 확인, 공백을 글자로 취급
            
            - rejectifEmptyOrWhitespace("error 객체", "propertyname", "codename") : 값이 비어 있거나 공백으로만 구성되어 있는지 확인
            
            - 입력값에 문제가 있다면 error 객체에 오류정보를 저장, 사용할 오류 메시지는 "코드이름.beanName.propertyname"으로 구성
            
           #rejectValue
           
            - 유효성 조건을 직접 만들어 검사할 때 사용
            
            - if문으로 유효성 검사를 하고 위배시 rejectValue를 통해 오류 정보 지정
            
            - rejectValue("propertyname", "codename")
            
            - 입력값에 문제가 있다면 error 객체에 오류정보를 저장, 사용할 오류 메시지는 "코드이름.beanName.propertyname"으로 구성
            
