package D0122.interfaceMethod;

public interface Calc {
    double PI = 3.14;
    int ERROR =  -9999999;

    int add(int num1, int num2);
    int sub(int num1, int num2);
    int mul(int num1, int num2);
    int div(int num1, int num2);

    //default Method
    default void description(){
        System.out.println("정수의 사칙연산을 제공합니다.");
        myPrivateMethod(); // private Method
    }

    //static Method
    static int total(int[] arr){
        int total = 0;
        for(int num : arr) total += num;
        myStaticMethod(); // private Method
        return total;
    }

    // private Method 는 interface 내부에서만 사용
    // private Method 는 재정의 하지 않는다.
    // private Method 1. private
    private void myPrivateMethod(){
        System.out.println("myPrivateMethod");
    }

    // private Method 2. private static => 인스턴스 생성 없이 사용 가능
    private static void myStaticMethod(){
        System.out.println("private static Method");
    }
}