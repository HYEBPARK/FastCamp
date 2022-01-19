package D0119;

public class CustomerTest {
    public static void main(String[] args) {

        Customer customerLee = new Customer(10010L, "LEE");
        customerLee.bonusPoint = 1000;
        int price = customerLee.calcPrice(1000);
        System.out.println(price);
        System.out.println(customerLee.showCustomerInfo());

        VIPCustomer vipCustomer = new VIPCustomer(20020L, "KIM");
        vipCustomer.bonusPoint = 50000;
        price = vipCustomer.calcPrice(1000);
        System.out.println(price);
        System.out.println(vipCustomer.showCustomerInfo());

        // vc의 타입은 Customer , 인스턴스 타입은 VIPCustomer
        Customer vc = new VIPCustomer(12345L, "test");
        System.out.println(  vc.calcPrice(10000));
        // 가상함수 방식 : 실제 인스턴스의 메소드가 호출된다.
        // 자바에서는 항상 인스턴스의 메소드가 호출된다.
        // 즉 실행시 9000이 출력된다.
    }
}
