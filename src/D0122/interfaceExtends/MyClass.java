package D0122.interfaceExtends;

public class MyClass implements MyInterface{
    @Override
    public void myMethod() {
        System.out.println("myMethod의 함수");
    }

    @Override
    public void x() {
        System.out.println("X의 함수");
    }

    @Override
    public void y() {
        System.out.println("Y의 함수");
    }
}
