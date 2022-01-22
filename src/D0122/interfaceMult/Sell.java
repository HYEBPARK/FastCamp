package D0122.interfaceMult;

public interface Sell {

    void sell();

    default void order(){
        System.out.println("Sell 인터페이스의 order");
    }
}
