### 부모요소에 쓰는 속성

    - display : flex / justify-content / align-items / flex-direction / flex-wrap / align-content
    
### 자식요소에 쓰는 속성

    - flex-grow / flex-shrink / flex-basis / flex / order / align-self
    
### CSS flexbox(Flexible Box) 개념 및 사용하는 이유

    - Flexbox는 기존의 float, position, display 속성을 사용해서 HTML 요소의 배치, 정렬, 방향, 순서, 크기를 조절하는 대신 좀 더 쉽고 효율적으로
      조절할 수 있는 방법을 지원하는 CSS3 레이아웃 제작 방식입니다. 반응형 레이아웃에 강점이 있습니다.
      
### 기존 방식 수직중앙 수평중앙 배치

  - body {
      background-color:#eee; height:100vh;
  }
  
    div {
      width: 100px; height 100px;
      background-color : #eee;
      position:absolute;
      top:50%;
      left:50%;
      transform:transltate(-50%, -50%);
    
    }
    
 ### Flex 방식
 
   - body {
      background-color:#eee;
      height:100vh;
      display:flex;
      justify-content:center;
      align-items:center;
   }
   
   div {
    width:100px; height 100px;
    background-color:#000;
   
   }
      
