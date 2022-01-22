package D0122.interfaceTest;

// interface는 구현 한다고 말함
public abstract class Calculator implements Calc{

    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int sub(int num1, int num2) {
        return num1 - num2;
    }

    // 모두 다 구현하지 않았기 때문에 Calculator는 추상클래스가 된다.
//    @Override
//    public int mul(int num1, int num2) {
//        return 0;
//    }
//
//    @Override
//    public int div(int num1, int num2) {
//        return 0;
//    }
}
