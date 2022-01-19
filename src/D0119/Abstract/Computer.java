package D0119.Abstract;

public abstract class Computer {

    // 하위 클래스에 위임을 해준다.
    // 하위 클래스에서 알아서 구현을 해라.
    public abstract void display();
    public abstract void typing();

    public void turnOn(){
        System.out.println("시작합니다.");
    }

    public void turnOff(){
        System.out.println("종료합니다.");
    }
}
