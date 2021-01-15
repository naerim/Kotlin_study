## 텍스트뷰
- ### text  
텍스트뷰에 나타나는 문자열을 표현  
"문자열" 형식으로 값을 직접 입력하거나 "@string/변수명" 형식으로 지정한 후 string.xml 파일에 지정할 수 있음  

- ### textColor  
글자의 색상을 지정  

- ### textSize  
글자의 크기를 dp, px, in, mm, sp 단위로 지정  
텍스트뷰, 에디트텍스트는 주로 sp 사용  

- ### typeface  
글자의 글꼴  

- ### textStyle  
글자의 스타일을 지정  
bold, italic, bold|italic 등  

- ### singleLine  
글이 길어 줄이 넘어갈 경우 강제로 한 줄까지만 출력하고 문자열 맨 뒤에 '...'를 표시  
값으로 true와 false를 설정할 수 있고 디폴트는 false  

- ### maxLines  
텍스트뷰에 최대 입력 가능한 줄 수를 설정  

- ### minLines  
반대로 최소 줄 수를 미리 설정  

- ### ellipsize  
텍스트뷰의 maxLines 속성이 1이거나 문자열이 길어서 글자가 잘릴 때에 설정  

- ### lines  
텍스트뷰 높이 고정하기  

- ### maxLength  
텍스트 전체 길이 제한하기  
maxLength는 텍스트 전체 길이를 제한, 설정한 값만큼의 글자만 보이고 나머지는 보이지 않게 함
