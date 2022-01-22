package D0122.interfaceTest;

public class CalculatorTest {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 2;

        // Calc 로 형 변환 가능
        // interface를 구현한 클래스 이기때문에
        Calc calc = new CompleteCalc();
        System.out.println(calc.add(num1,num2));
        System.out.println(calc.sub(num1,num2));
        System.out.println(calc.mul(num1,num2));
        System.out.println(calc.div(num1,num2));
        // calc.showInfo 는 사용할 수 없음, Calc로 선언하였기 때문에
        CompleteCalc cal = new CompleteCalc();
        cal.showInfo(); // CompleteCalc로 선언한 경우 showInfo 사용가능
    }
}
