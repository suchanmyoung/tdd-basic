### 테스트 주도 개발 시작하기, 최범균
* 테스트는 쉬운 경우에서 어려운 경우로 진행
* 예외적인 경우에서 정상적인 경우로 진행
* 레드 - 그린 - 리팩터의 반복
* 동작하는 코드를 만드는 것은 중요하지만 코드를 잘 변경할 수 있는 능력 또한 매우 중요하다. 코드를 잘 변경하려면 변경하기 쉬운 구조를 
가져야 하는데 이를 위한 것이 바로 리팩토링이다. 이랲ㄱ토링은 소프트웨어의 생존 시간을 늘려준다.
* 리팩토링의 시점
  * 테스트 대상 코드에서 상수를 변수로 바꾸거나 변수 이름을 변경하는 것과 같은 작은 리팩토링은 발견 즉시
  * 메소드 추출과 같이 구조에 영향을 주는 리팩토링은 큰 틀에서 구현 흐름이 눈에 뜰어오기 시작한 뒤에 진행
* 테스트 케이스는 우선 상수로 통과할 수 있도록 만들고, 변수로 변환