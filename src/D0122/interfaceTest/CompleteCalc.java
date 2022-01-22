package D0122.interfaceTest;

// Calc 타입이 상속되었다 => 타입 상속
// CompleteCalc 는 Calc 타입을 상속 받았다.
public class CompleteCalc extends Calculator{
    @Override
    public int mul(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int div(int num1, int num2) {
        if(num2 == 0) return ERROR; // 분모가 0 일 수는 없음
        return num1 * num2;
    }

    public void showInfo(){
        System.out.println("모두 구현하였습니다.");
    }
}
