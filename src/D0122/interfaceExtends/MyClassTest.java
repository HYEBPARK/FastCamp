package D0122.interfaceExtends;

public class MyClassTest {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        X xClass = myClass;
        xClass.x();

        Y yClass = myClass;
        yClass.y();

        MyClass multClass = myClass;
        multClass.x();
        multClass.y();
        multClass.myMethod();

    }
}
