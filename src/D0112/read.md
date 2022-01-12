### 접근 제어 지시자 : 클래스 외부에서 클래스의 멤버 변수, 메서드, 생성자를 사용할 수 있는지 여부를 지정하는 키워드
- private : 같은클래스 내부에서만 접근 가능 (외부클래스, 상속관계의 클래스에서도 접근불가)
- default(아무것도없음) : 같은 패키지 내부에서만 접근 가능(상속 관계랃 패키지가 다르면 접근 불가)
- protected : 같은 패키지나 상속관게의 클래스에서 접근 가능하고 그 외 외부에서는 접근 할 수 없음
- public : 클래스의 이부 어디서나 접근 할 수 있음

### get()/set() 메서드
: private로 선언된 멤버 변수에 대해 접근, 수정할 수 있는 메서드를 public 으로 제공
- get() 메서드만 제공 되는 경우 read-only 필드


```java
public class Birthday{
	private int day;
    private int month;
    private int year;
    
    public int getDay(){
    	return day;
    }

	public void setDay(int day){
    	this.day = day;
    }   
}
```

### 정보 은닉
: private로 제어한 멤버 변수도 public 메서드가 제공되면 접근 가능하지만 변수가 public으로 공개되었을 때보다 private 일때 각 변수에 대한 제한을 public 메서드에서 저ㅔ어할 수 있따.

### 캡슐화(Encapsulation)
- 꼭 필요한 정보와 기능만 외부에 오픈
- 대부분의 멤버 변수와 메서드를 감추고 외부에 통합된 인터페이스만은 제공하여 일관된 기능을 구현
- 각각의 메서드나 멤버 변수를 접근함으로써 발생하는 오류를 최소화한다.


![](https://images.velog.io/images/hye_b/post/56488ef6-cf15-475d-a70a-93a40657c164/image.png)

### 싱글톤 패턴
- 객체의 인스턴스가 오직 1개만 생성되는 패턴 

<장점>
- 최초 한 번의 new 연산자를 통해서 고정된 메모리 영역을 사용하기 때문에 추후 해당 객체에 접근할 때 메모리 낭비를 방지할 수 있다.
- 이미 생성된 인스턴스를 활용하여 속도 측면에서 이점이 있다.
- 다른 클래스간에 데이터 공유가 쉽다. 

<단점>
- multi thread 환경에서 안전하지 않다.
- 테스트하기가 어렵다. 
- 클라이언트가 구체 클래스에 의존하게 된다. 
- 자식클래스를 만들 수 없고 내부상태를 변경하기 어렵다. 


[출처]
- 싱글톤 : https://tecoble.techcourse.co.kr/post/2020-11-07-singleton/
      
      
      
      
      
      
    