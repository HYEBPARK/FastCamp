package D0122.interfaceMult;

public class Customer implements Buy, Sell{
    @Override
    public void buy() {
        System.out.println("Customer 가 구현한 Buy 인터페이스의 buy 함수");
    }

    @Override
    public void sell() {
        System.out.println("Customer 가 구현한 Sell 인터페이스의 sell 함수");
    }

    @Override
    public void order() {
        // Buy.super.order(); Buy 의 함수를 그대로 사용하겠다.
        // Sell.super.order(); Sell 의 함수를 그대로 사용하겠다.
        System.out.println("Customer 가 재정의한 order 함수");
    }

    public void hell(){
        System.out.println("저는 Customer class 입니다.");
    }

}
