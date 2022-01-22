package D0122.interfaceMethod;

public class CompleteCalc extends Calculator{
    @Override
    public int mul(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int div(int num1, int num2) {
        if(num2 == 0) return ERROR;
        return num1 / num2;
    }

    public void showInfo(){
        System.out.println("모든 기능을 구현했습니다.");
    }


    // default Method 재정의 가능
    @Override
    public void description() {
        System.out.println("재정의 해봤습니다 ~~");
    }

    // private Method는 재정의 불가능 !!
}
