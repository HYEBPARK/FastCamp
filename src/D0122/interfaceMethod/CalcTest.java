package D0122.interfaceMethod;

public class CalcTest {
    public static void main(String[] args) {
//        int num1 = 10;
//        int num2 = 2;
//
//        CompleteCalc calc = new CompleteCalc();
//        System.out.println(calc.add(num1,num2));
//        System.out.println(calc.sub(num1,num2));
//        System.out.println(calc.mul(num1,num2));
//        System.out.println(calc.div(num1,num2));

//        default Method 사용시 인스턴스 생성이 필요
//        calc.description();

        // static Method 사용시 인스턴스 생성과는 상관없이 사용가능
        int[] arr= {1, 2, 3, 4};
        System.out.println(Calc.total(arr));
    }
}
