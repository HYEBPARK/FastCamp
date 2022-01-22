package D0122.interfaceMult;

public interface Buy {

    void buy();

    default void order(){
        System.out.println("Buy 인터페이스의 order");
    }
}
